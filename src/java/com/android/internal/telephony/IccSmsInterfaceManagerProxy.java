/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony;

import java.util.Hashtable;
import java.util.List;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.SystemProperties;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;

public class IccSmsInterfaceManagerProxy extends ISms.Stub {
    private IccSmsInterfaceManager mIccSmsInterfaceManager;
    private Hashtable<String, ISmsMiddleware> mMiddleware = new Hashtable<String, ISmsMiddleware>();

    public IccSmsInterfaceManagerProxy(Context context,
            IccSmsInterfaceManager iccSmsInterfaceManager) {
        this.mContext = context;
        mIccSmsInterfaceManager = iccSmsInterfaceManager;
        if(ServiceManager.getService("isms") == null) {
            ServiceManager.addService("isms", this);
        }

        createWakelock();
    }

    public void setmIccSmsInterfaceManager(IccSmsInterfaceManager iccSmsInterfaceManager) {
        mIccSmsInterfaceManager = iccSmsInterfaceManager;
    }

    private void createWakelock() {
        PowerManager pm = (PowerManager)mContext.getSystemService(Context.POWER_SERVICE);
        mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "SMSDispatcher");
        mWakeLock.setReferenceCounted(true);
    }

    @Override
    public void registerSmsMiddleware(String name, ISmsMiddleware middleware) throws android.os.RemoteException {
        if (!"1".equals(SystemProperties.get("persist.sys.sms_debug", "0"))) {
            mContext.enforceCallingPermission(
                    "android.permission.INTERCEPT_SMS", "");
        }
        mMiddleware.put(name, middleware);
    }

    private Context mContext;
    private PowerManager.WakeLock mWakeLock;
    private static final int WAKE_LOCK_TIMEOUT = 5000;
    private void dispatchPdus(byte[][] pdus) {
        Intent intent = new Intent(Intents.SMS_RECEIVED_ACTION);
        intent.putExtra("pdus", pdus);
        intent.putExtra("format", SmsMessage.FORMAT_SYNTHETIC);
        dispatch(intent, SMSDispatcher.RECEIVE_SMS_PERMISSION);
    }

    private void dispatch(Intent intent, String permission) {
        // Hold a wake lock for WAKE_LOCK_TIMEOUT seconds, enough to give any
        // receivers time to take their own wake locks.
        mWakeLock.acquire(WAKE_LOCK_TIMEOUT);
        mContext.sendOrderedBroadcast(intent, permission);
    }

    public void synthesizeMessages(String originatingAddress, String scAddress, List<String> messages, long timestampMillis) throws RemoteException {
        // if not running in debug mode
        if (!"1".equals(SystemProperties.get("persist.sys.sms_debug", "0"))) {
            mContext.enforceCallingPermission(
                    "android.permission.BROADCAST_SMS", "");
        }
        byte[][] pdus = new byte[messages.size()][];
        for (int i = 0; i < messages.size(); i++) {
            SyntheticSmsMessage message = new SyntheticSmsMessage(originatingAddress, scAddress, messages.get(i), timestampMillis);
            pdus[i] = message.getPdu();
        }
        dispatchPdus(pdus);
    }

    @Override
    public boolean
    updateMessageOnIccEf(String callingPackage, int index, int status, byte[] pdu) {
         return mIccSmsInterfaceManager.updateMessageOnIccEf(callingPackage, index, status, pdu);
    }

    @Override
    public boolean copyMessageToIccEf(String callingPackage, int status, byte[] pdu,
            byte[] smsc) {
        return mIccSmsInterfaceManager.copyMessageToIccEf(callingPackage, status, pdu, smsc);
    }

    @Override
    public List<SmsRawData> getAllMessagesFromIccEf(String callingPackage) {
        return mIccSmsInterfaceManager.getAllMessagesFromIccEf(callingPackage);
    }

    @Override
    public void sendData(String callingPackage, String destAddr, String scAddr, int destPort,
            byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) {
        mIccSmsInterfaceManager.sendData(callingPackage, destAddr, scAddr, destPort, data,
                sentIntent, deliveryIntent);
    }

    public void sendText(String destAddr, String scAddr,
            String text, PendingIntent sentIntent, PendingIntent deliveryIntent) {
        for (ISmsMiddleware middleware: mMiddleware.values()) {
            try {
                if (middleware.onSendText(destAddr, scAddr, text, sentIntent, deliveryIntent))
                    return;
            }
            catch (Exception e) {
                // TOOD: remove the busted middleware?
            }
        }
        mIccSmsInterfaceManager.sendText(destAddr, scAddr, text, sentIntent, deliveryIntent);
    }

    @Override
    public void sendMultipartText(String callingPackage, String destAddr, String scAddr,
            List<String> parts, List<PendingIntent> sentIntents,
            List<PendingIntent> deliveryIntents) throws android.os.RemoteException {
        for (ISmsMiddleware middleware: mMiddleware.values()) {
            try {
                if (middleware.onSendMultipartText(destAddr, scAddr, parts, sentIntents, deliveryIntents))
                    return;
            }
            catch (Exception e) {
                // TOOD: remove the busted middleware?
            }
        }
        mIccSmsInterfaceManager.sendMultipartText(destAddr, scAddr,
                parts, sentIntents, deliveryIntents);
    }

    @Override
    public boolean enableCellBroadcast(int messageIdentifier) throws android.os.RemoteException {
        return mIccSmsInterfaceManager.enableCellBroadcast(messageIdentifier);
    }

    @Override
    public boolean disableCellBroadcast(int messageIdentifier) throws android.os.RemoteException {
        return mIccSmsInterfaceManager.disableCellBroadcast(messageIdentifier);
    }

    @Override
    public boolean enableCellBroadcastRange(int startMessageId, int endMessageId)
            throws android.os.RemoteException {
        return mIccSmsInterfaceManager.enableCellBroadcastRange(startMessageId, endMessageId);
    }

    @Override
    public boolean disableCellBroadcastRange(int startMessageId, int endMessageId)
            throws android.os.RemoteException {
        return mIccSmsInterfaceManager.disableCellBroadcastRange(startMessageId, endMessageId);
    }

    @Override
    public int getPremiumSmsPermission(String packageName) {
        return mIccSmsInterfaceManager.getPremiumSmsPermission(packageName);
    }

    @Override
    public void setPremiumSmsPermission(String packageName, int permission) {
        mIccSmsInterfaceManager.setPremiumSmsPermission(packageName, permission);
    }
}
