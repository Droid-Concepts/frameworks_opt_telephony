<<<<<<< HEAD
/*
 * Copyright (C) 2013 The CyanogenMod Project
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

public class Operators{
    public static String operatorReplace(String response){
        if (response.equals("41201"))response="AWCC"; /*Afghanistan*/
        else if (response.equals("41240"))response="Areeba"; /*Afghanistan*/
        else if (response.equals("41250"))response="Etisalat"; /*Afghanistan*/
        else if (response.equals("41220"))response="Roshan"; /*Afghanistan*/
        else if (response.equals("27601"))response="AMC"; /*Albania*/
        else if (response.equals("27603"))response="Eagle Mobile"; /*Albania*/
        else if (response.equals("27604"))response="Plus Communication"; /*Albania*/
        else if (response.equals("27602"))response="Vodafone"; /*Albania*/
        else if (response.equals("60302"))response="Djezzy"; /*Algeria*/
        else if (response.equals("60301"))response="Mobilis"; /*Algeria*/
        else if (response.equals("60303"))response="Nedjma"; /*Algeria*/
        else if (response.equals("54411"))response="Bluesky"; /*American Samoa*/
        else if (response.equals("21303"))response="Mobiland"; /*Andorra*/
        else if (response.equals("63104"))response="MOVICEL"; /*Angola*/
        else if (response.equals("63102"))response="UNITEL"; /*Angola*/
        else if (response.equals("365840"))response="Cable & Wireless"; /*Anguilla (United Kingdom)*/
        else if (response.equals("365010"))response="Weblinks Limited"; /*Anguilla (United Kingdom)*/
        else if (response.equals("344030"))response="APUA"; /*Antigua and Barbuda*/
        else if (response.equals("344920"))response="bmobile"; /*Antigua and Barbuda*/
        else if (response.equals("344930"))response="Digicel"; /*Antigua and Barbuda*/
        else if (response.equals("722310"))response="Claro"; /*Argentina*/
        else if (response.equals("722320"))response="Claro"; /*Argentina*/
        else if (response.equals("722330"))response="Claro"; /*Argentina*/
        else if (response.equals("722350"))response="Hutchinson (PORT HABLE)"; /*Argentina*/
        else if (response.equals("722010"))response="Movistar"; /*Argentina*/
        else if (response.equals("722070"))response="Movistar"; /*Argentina*/
        else if (response.equals("722020"))response="Nextel"; /*Argentina*/
        else if (response.equals("72234"))response="Personal"; /*Argentina*/
        else if (response.equals("722341"))response="Telecom Personal SA"; /*Argentina*/
        else if (response.equals("72236"))response="Telecom Personal SA"; /*Argentina*/
        else if (response.equals("28301"))response="Beeline"; /*Armenia*/
        else if (response.equals("28310"))response="Orange"; /*Armenia*/
        else if (response.equals("28305"))response="VivaCell-MTS"; /*Armenia*/
        else if (response.equals("36302"))response="Digicel"; /*Aruba (Netherlands)*/
        else if (response.equals("36320"))response="Digicell"; /*Aruba (Netherlands)*/
        else if (response.equals("36301"))response="SETAR"; /*Aruba (Netherlands)*/
        else if (response.equals("50506"))response="3"; /*Australia*/
        else if (response.equals("50512"))response="3"; /*Australia*/
        else if (response.equals("50515"))response="3GIS"; /*Australia*/
        else if (response.equals("50514"))response="AAPT"; /*Australia*/
        else if (response.equals("50524"))response="Advanced Communications Technologies"; /*Australia*/
        else if (response.equals("50509"))response="Airnet"; /*Australia*/
        else if (response.equals("50538"))response="Crazy John's"; /*Australia*/
        else if (response.equals("50504"))response="Department of Defence"; /*Australia*/
        else if (response.equals("50588"))response="Localstar"; /*Australia*/
        else if (response.equals("50510"))response="Norfolk Telecom"; /*Australia*/
        else if (response.equals("50508"))response="One. Tel"; /*Australia*/
        else if (response.equals("50599"))response="One. Tel"; /*Australia*/
        else if (response.equals("50502"))response="OPTUS / Virgin Mobile"; /*Australia*/
        else if (response.equals("50505"))response="Ozitel"; /*Australia*/
        else if (response.equals("50513"))response="Railcorp"; /*Australia*/
        else if (response.equals("50521"))response="SOUL"; /*Australia*/
        else if (response.equals("50501"))response="Telstra"; /*Australia*/
        else if (response.equals("50511"))response="Telstra"; /*Australia*/
        else if (response.equals("50571"))response="Telstra"; /*Australia*/
        else if (response.equals("50572"))response="Telstra"; /*Australia*/
        else if (response.equals("50516"))response="Victorian Rail Track"; /*Australia*/
        else if (response.equals("50503"))response="Vodafone"; /*Australia*/
        else if (response.equals("50507"))response="Vodafone"; /*Australia*/
        else if (response.equals("50590"))response="YES OPTUS"; /*Australia*/
        else if (response.equals("23210"))response="3"; /*Austria*/
        else if (response.equals("23214"))response="3"; /*Austria*/
        else if (response.equals("23201"))response="A1"; /*Austria*/
        else if (response.equals("23209"))response="A1"; /*Austria*/
        else if (response.equals("23215"))response="Barablu"; /*Austria*/
        else if (response.equals("23211"))response="bob"; /*Austria*/
        else if (response.equals("23291"))response="GSM-R A"; /*Austria*/
        else if (response.equals("23205"))response="Orange"; /*Austria*/
        else if (response.equals("23203"))response="T-Mobile"; /*Austria*/
        else if (response.equals("23207"))response="T-Mobile"; /*Austria*/
        else if (response.equals("23212"))response="yesss"; /*Austria*/
        else if (response.equals("40001"))response="Azercell"; /*Azerbaijan*/
        else if (response.equals("40002"))response="Bakcell"; /*Azerbaijan*/
        else if (response.equals("40003"))response="FONEX"; /*Azerbaijan*/
        else if (response.equals("40004"))response="Nar Mobile"; /*Azerbaijan*/
        else if (response.equals("364390"))response="BaTelCo"; /*Bahamas*/
        else if (response.equals("42601"))response="Batelco"; /*Bahrain*/
        else if (response.equals("42602"))response="MTC-VFBH"; /*Bahrain*/
        else if (response.equals("42604"))response="VIVA"; /*Bahrain*/
        else if (response.equals("47002"))response="Aktel"; /*Bangladesh*/
        else if (response.equals("47003"))response="Banglalink"; /*Bangladesh*/
        else if (response.equals("47005"))response="Citycell"; /*Bangladesh*/
        else if (response.equals("47006"))response="Citycell"; /*Bangladesh*/
        else if (response.equals("47001"))response="Grameenphone"; /*Bangladesh*/
        else if (response.equals("47004"))response="TeleTalk"; /*Bangladesh*/
        else if (response.equals("47007"))response="Warid"; /*Bangladesh*/
        else if (response.equals("342600"))response="bmobile"; /*Barbados*/
        else if (response.equals("342750"))response="Digicel"; /*Barbados*/
        else if (response.equals("342820"))response="Sunbeach Communications"; /*Barbados*/
        else if (response.equals("257501"))response="BelCel JV"; /*Belarus*/
        else if (response.equals("25703"))response="DIALLOG"; /*Belarus*/
        else if (response.equals("25704"))response="life:)"; /*Belarus*/
        else if (response.equals("25702"))response="MTS"; /*Belarus*/
        else if (response.equals("25701"))response="Velcom"; /*Belarus*/
        else if (response.equals("20620"))response="BASE"; /*Belgium*/
        else if (response.equals("20610"))response="Mobistar"; /*Belgium*/
        else if (response.equals("20601"))response="Proximus"; /*Belgium*/
        else if (response.equals("20605"))response="Telenet"; /*Belgium*/
        else if (response.equals("70267"))response="Belize Telemedia"; /*Belize*/
        else if (response.equals("70268"))response="International Telecommunications Ltd."; /*Belize*/
        else if (response.equals("70299"))response="Smart"; /*Belize*/
        else if (response.equals("61603"))response="Areeba"; /*Benin*/
        else if (response.equals("61600"))response="BBCOM"; /*Benin*/
        else if (response.equals("61604"))response="BBCOM"; /*Benin*/
        else if (response.equals("61605"))response="Glo"; /*Benin*/
        else if (response.equals("61601"))response="Libercom"; /*Benin*/
        else if (response.equals("61602"))response="Telecel"; /*Benin*/
        else if (response.equals("31038"))response="Digicel"; /*Bermudas*/
        else if (response.equals("35001"))response="Digicel Bermuda"; /*Bermudas*/
        else if (response.equals("35002"))response="Mobility"; /*Bermudas*/
        else if (response.equals("40211"))response="B-Mobile"; /*Bhutan*/
        else if (response.equals("40277"))response="TashiCell"; /*Bhutan*/
        else if (response.equals("73602"))response="Entel"; /*Bolivia*/
        else if (response.equals("73601"))response="Nuevatel"; /*Bolivia*/
        else if (response.equals("73603"))response="Tigo"; /*Bolivia*/
        else if (response.equals("21890"))response="BH Mobile"; /*Bosnia and Herzegovina*/
        else if (response.equals("21803"))response="ERONET"; /*Bosnia and Herzegovina*/
        else if (response.equals("21805"))response="m:tel"; /*Bosnia and Herzegovina*/
        else if (response.equals("65204"))response="BTC Mobile"; /*Botswana*/
        else if (response.equals("65201"))response="Mascom"; /*Botswana*/
        else if (response.equals("65202"))response="Orange"; /*Botswana*/
        else if (response.equals("72437"))response="aiou"; /*Brazil*/
        else if (response.equals("72424"))response="Amazonia Celular"; /*Brazil*/
        else if (response.equals("72416"))response="Brasil Telecom"; /*Brazil*/
        else if (response.equals("72405"))response="Claro"; /*Brazil*/
        else if (response.equals("72432"))response="CTBC Cellular"; /*Brazil*/
        else if (response.equals("72433"))response="CTBC Cellular"; /*Brazil*/
        else if (response.equals("72434"))response="CTBC Cellular"; /*Brazil*/
        else if (response.equals("72407"))response="CTBC Celular"; /*Brazil*/
        else if (response.equals("72400"))response="Nextel"; /*Brazil*/
        else if (response.equals("72439"))response="Nextel"; /*Brazil*/
        else if (response.equals("72415"))response="Sercomtel"; /*Brazil*/
        else if (response.equals("72402"))response="TIM"; /*Brazil*/
        else if (response.equals("72403"))response="TIM"; /*Brazil*/
        else if (response.equals("72404"))response="TIM"; /*Brazil*/
        else if (response.equals("72408"))response="TIM"; /*Brazil*/
        else if (response.equals("72431"))response="TNL PCS"; /*Brazil*/
        else if (response.equals("72406"))response="Vivo"; /*Brazil*/
        else if (response.equals("72410"))response="Vivo"; /*Brazil*/
        else if (response.equals("72411"))response="Vivo"; /*Brazil*/
        else if (response.equals("72423"))response="Vivo"; /*Brazil*/
        else if (response.equals("348170"))response="Cable & Wireless"; /*British Virgin Islands (United Kingdom)*/
        else if (response.equals("348570"))response="Caribbean Cellular Telephone"; /*British Virgin Islands (United Kingdom)*/
        else if (response.equals("348770"))response="Digicel"; /*British Virgin Islands (United Kingdom)*/
        else if (response.equals("52802"))response="B-Mobile"; /*Brunei*/
        else if (response.equals("52811"))response="DTSCom"; /*Brunei*/
        else if (response.equals("52801"))response="Jabatan Telekom"; /*Brunei*/
        else if (response.equals("28405"))response="GLOBUL"; /*Bulgaria*/
        else if (response.equals("28401"))response="M-Tel"; /*Bulgaria*/
        else if (response.equals("28404"))response="Undisclosed"; /*Bulgaria*/
        else if (response.equals("28403"))response="Vivatel"; /*Bulgaria*/
        else if (response.equals("61301"))response="Onatel"; /*Burkina Faso*/
        else if (response.equals("61303"))response="Telecel Faso"; /*Burkina Faso*/
        else if (response.equals("61302"))response="Zain"; /*Burkina Faso*/
        else if (response.equals("64202"))response="Africell"; /*Burundi*/
        else if (response.equals("64208"))response="HiTs Telecom"; /*Burundi*/
        else if (response.equals("64207"))response="Smart Mobile"; /*Burundi*/
        else if (response.equals("64201"))response="Spacetel"; /*Burundi*/
        else if (response.equals("64203"))response="Telecel"; /*Burundi*/
        else if (response.equals("64282"))response="U-COM Burundi"; /*Burundi*/
        else if (response.equals("45609"))response="Beeline"; /*Cambodia*/
        else if (response.equals("45618"))response="Camshin / Shinawatra"; /*Cambodia*/
        else if (response.equals("45611"))response="Excell"; /*Cambodia*/
        else if (response.equals("45602"))response="hello"; /*Cambodia*/
        else if (response.equals("45608"))response="Metfone"; /*Cambodia*/
        else if (response.equals("45601"))response="Mobitel"; /*Cambodia*/
        else if (response.equals("45604"))response="qb"; /*Cambodia*/
        else if (response.equals("45603"))response="S Telecom"; /*Cambodia*/
        else if (response.equals("45606"))response="Smart Mobile"; /*Cambodia*/
        else if (response.equals("45605"))response="Star-Cell"; /*Cambodia*/
        else if (response.equals("62401"))response="MTN Cameroon"; /*Cameroon*/
        else if (response.equals("62402"))response="Orange"; /*Cameroon*/
        else if (response.equals("302290"))response="Airtel Wireless"; /*Canada*/
        else if (response.equals("302652"))response="BC Tel Mobility"; /*Canada*/
        else if (response.equals("302610"))response="Bell"; /*Canada*/
        else if (response.equals("302640"))response="Bell"; /*Canada*/
        else if (response.equals("302880"))response="Bell / Telus / SaskTel"; /*Canada*/
        else if (response.equals("302651"))response="Bell Mobility"; /*Canada*/
        else if (response.equals("302380"))response="DMTS"; /*Canada*/
        else if (response.equals("302370"))response="Fido"; /*Canada*/
        else if (response.equals("302350"))response="FIRST"; /*Canada*/
        else if (response.equals("302710"))response="Globalstar"; /*Canada*/
        else if (response.equals("302620"))response="ICE Wireless"; /*Canada*/
        else if (response.equals("302701"))response="MB Tel Mobility"; /*Canada*/
        else if (response.equals("302320"))response="Mobilicity"; /*Canada*/
        else if (response.equals("302702"))response="MT&T Mobility"; /*Canada*/
        else if (response.equals("302660"))response="MTS"; /*Canada*/
        else if (response.equals("302655"))response="MTS Mobility"; /*Canada*/
        else if (response.equals("302703"))response="New Tel Mobility"; /*Canada*/
        else if (response.equals("302720"))response="Rogers Wireless"; /*Canada*/
        else if (response.equals("302654"))response="Sask Tel Mobility"; /*Canada*/
        else if (response.equals("302680"))response="SaskTel"; /*Canada*/
        else if (response.equals("302780"))response="SaskTel"; /*Canada*/
        else if (response.equals("302656"))response="Tbay Mobility"; /*Canada*/
        else if (response.equals("302220"))response="Telus"; /*Canada*/
        else if (response.equals("302221"))response="Telus"; /*Canada*/
        else if (response.equals("302657"))response="Telus (Quebec) Mobility"; /*Canada*/
        else if (response.equals("302360"))response="Telus Mobility"; /*Canada*/
        else if (response.equals("302361"))response="Telus Mobility"; /*Canada*/
        else if (response.equals("302653"))response="Telus Mobility"; /*Canada*/
        else if (response.equals("302500"))response="Videotron"; /*Canada*/
        else if (response.equals("302510"))response="Videotron"; /*Canada*/
        else if (response.equals("302490"))response="WIND Mobile"; /*Canada*/
        else if (response.equals("62501"))response="CVMOVEL"; /*Cape Verde*/
        else if (response.equals("62502"))response="T+"; /*Cape Verde*/
        else if (response.equals("346140"))response="Cable & Wireless"; /*Cayman Islands (United Kingdom)*/
        else if (response.equals("346050"))response="Digicel"; /*Cayman Islands (United Kingdom)*/
        else if (response.equals("62301"))response="CTP"; /*Central African Republic*/
        else if (response.equals("62304"))response="Nationlink"; /*Central African Republic*/
        else if (response.equals("62303"))response="Orange"; /*Central African Republic*/
        else if (response.equals("62302"))response="TC"; /*Central African Republic*/
        else if (response.equals("73003"))response="Claro"; /*Chile*/
        else if (response.equals("73001"))response="Entel"; /*Chile*/
        else if (response.equals("73010"))response="Entel"; /*Chile*/
        else if (response.equals("73002"))response="movistar"; /*Chile*/
        else if (response.equals("73004"))response="Nextel"; /*Chile*/
        else if (response.equals("73008"))response="VTR MOvil"; /*Chile*/
        else if (response.equals("73099"))response="Will"; /*Chile*/
        else if (response.equals("46006"))response="(unknown)"; /*China*/
        else if (response.equals("46000"))response="China Mobile"; /*China*/
        else if (response.equals("46002"))response="China Mobile"; /*China*/
        else if (response.equals("46007"))response="China Mobile"; /*China*/
        else if (response.equals("46003"))response="China Telecom"; /*China*/
        else if (response.equals("46005"))response="China Telecom"; /*China*/
        else if (response.equals("46020"))response="China Tietong"; /*China*/
        else if (response.equals("46001"))response="China Unicom"; /*China*/
        else if (response.equals("732001"))response="Colombia Telecomunicaciones S.A. - Telecom"; /*Colombia*/
        else if (response.equals("732101"))response="Comcel"; /*Colombia*/
        else if (response.equals("732002"))response="Edatel"; /*Colombia*/
        else if (response.equals("732102"))response="movistar"; /*Colombia*/
        else if (response.equals("732123"))response="movistar"; /*Colombia*/
        else if (response.equals("732103"))response="Tigo"; /*Colombia*/
        else if (response.equals("732111"))response="Tigo"; /*Colombia*/
        else if (response.equals("65401"))response="HURI - SNPT"; /*Comoros*/
        else if (response.equals("54801"))response="Telecom Cook"; /*Cook Islands*/
        else if (response.equals("71201"))response="ICE"; /*Costa Rica*/
        else if (response.equals("71202"))response="ICE"; /*Costa Rica*/
        else if (response.equals("71203"))response="ICE"; /*Costa Rica*/
        else if (response.equals("71204"))response="movistar"; /*Costa Rica*/
        else if (response.equals("61201"))response="Cora de Comstar"; /*Cote d'Ivoire*/
        else if (response.equals("61204"))response="KoZ"; /*Cote d'Ivoire*/
        else if (response.equals("61202"))response="Moov"; /*Cote d'Ivoire*/
        else if (response.equals("61205"))response="MTN"; /*Cote d'Ivoire*/
        else if (response.equals("61203"))response="Orange"; /*Cote d'Ivoire*/
        else if (response.equals("61206"))response="ORICEL"; /*Cote d'Ivoire*/
        else if (response.equals("21901"))response="T-Mobile"; /*Croatia*/
        else if (response.equals("21902"))response="Tele2"; /*Croatia*/
        else if (response.equals("21910"))response="VIPnet"; /*Croatia*/
        else if (response.equals("36801"))response="ETECSA"; /*Cuba*/
        else if (response.equals("28001"))response="Cytamobile-Vodafone"; /*Cyprus*/
        else if (response.equals("28010"))response="MTN"; /*Cyprus*/
        else if (response.equals("62204"))response="Salam"; /*Czad*/
        else if (response.equals("62202"))response="TAWALI"; /*Czad*/
        else if (response.equals("62203"))response="TIGO - Millicom"; /*Czad*/
        else if (response.equals("62201"))response="Zain"; /*Czad*/
        else if (response.equals("23002"))response="EUROTEL PRAHA"; /*Czech Republic*/
        else if (response.equals("23003"))response="OSKAR"; /*Czech Republic*/
        else if (response.equals("23006"))response="OSNO TELECOMUNICATION, s.r.o."; /*Czech Republic*/
        else if (response.equals("23098"))response="SeDC s.o."; /*Czech Republic*/
        else if (response.equals("23001"))response="T-Mobile"; /*Czech Republic*/
        else if (response.equals("23005"))response="TRAVEL TELEKOMMUNIKATION, s.r.o."; /*Czech Republic*/
        else if (response.equals("23004"))response="U:fon"; /*Czech Republic*/
        else if (response.equals("23099"))response="Vodafone Czech Republic a.s., R&D Centre at FEE, CTU"; /*Czech Republic*/
        else if (response.equals("63086"))response="CCT"; /*Democratic Republic of Congo*/
        else if (response.equals("63004"))response="Cellco"; /*Democratic Republic of Congo*/
        else if (response.equals("63010"))response="Libertis Telecom"; /*Democratic Republic of Congo*/
        else if (response.equals("63089"))response="SAIT Telecom"; /*Democratic Republic of Congo*/
        else if (response.equals("63005"))response="Supercell"; /*Democratic Republic of Congo*/
        else if (response.equals("63001"))response="Vodacom"; /*Democratic Republic of Congo*/
        else if (response.equals("63002"))response="Zain"; /*Democratic Republic of Congo*/
        else if (response.equals("23806"))response="3"; /*Denmark*/
        else if (response.equals("23805"))response="ApS KBUS"; /*Denmark*/
        else if (response.equals("23807"))response="Barablu Mobile Ltd."; /*Denmark*/
        else if (response.equals("23809"))response="Dansk Beredskabskommunikation A/S"; /*Denmark*/
        else if (response.equals("23811"))response="Dansk Beredskabskommunikation A/S"; /*Denmark*/
        else if (response.equals("23840"))response="Ericsson Danmark A/S"; /*Denmark*/
        else if (response.equals("23812"))response="Lycamobile Denmark Ltd"; /*Denmark*/
        else if (response.equals("23803"))response="MIGway A/S"; /*Denmark*/
        else if (response.equals("23877"))response="Sonofon"; /*Denmark*/
        else if (response.equals("23801"))response="TDC"; /*Denmark*/
        else if (response.equals("23810"))response="TDC"; /*Denmark*/
        else if (response.equals("23802"))response="Telenor"; /*Denmark*/
        else if (response.equals("23820"))response="Telia"; /*Denmark*/
        else if (response.equals("23830"))response="Telia"; /*Denmark*/
        else if (response.equals("63801"))response="Evatis"; /*Djibouti*/
        else if (response.equals("366110"))response="Cable & Wireless"; /*Dominica*/
        else if (response.equals("366020"))response="Digicel"; /*Dominica*/
        else if (response.equals("37002"))response="Claro"; /*Dominican Republic*/
        else if (response.equals("37001"))response="Orange"; /*Dominican Republic*/
        else if (response.equals("37003"))response="Tricom S.A."; /*Dominican Republic*/
        else if (response.equals("37004"))response="ViVa"; /*Dominican Republic*/
        else if (response.equals("51402"))response="Timor Telecom"; /*East Timor*/
        else if (response.equals("74002"))response="Alegro"; /*Ecuador*/
        else if (response.equals("74000"))response="Movistar"; /*Ecuador*/
        else if (response.equals("74001"))response="Porta"; /*Ecuador*/
        else if (response.equals("60203"))response="Etisalat"; /*Egypt*/
        else if (response.equals("60201"))response="Mobinil"; /*Egypt*/
        else if (response.equals("60202"))response="Vodafone"; /*Egypt*/
        else if (response.equals("70610"))response="Claro"; /*El Salvador*/
        else if (response.equals("70611"))response="Claro"; /*El Salvador*/
        else if (response.equals("70601"))response="CTE Telecom Personal"; /*El Salvador*/
        else if (response.equals("70602"))response="digicel"; /*El Salvador*/
        else if (response.equals("70604"))response="movistar"; /*El Salvador*/
        else if (response.equals("70603"))response="Telemovil EL Salvador"; /*El Salvador*/
        else if (response.equals("62703"))response="Hits GQ"; /*Equatorial Guinea*/
        else if (response.equals("62701"))response="Orange GQ"; /*Equatorial Guinea*/
        else if (response.equals("65701"))response="Eritel"; /*Eritrea*/
        else if (response.equals("24805"))response="AS Bravocom Mobiil"; /*Estonia*/
        else if (response.equals("24802"))response="Elisa"; /*Estonia*/
        else if (response.equals("24801"))response="EMT"; /*Estonia*/
        else if (response.equals("24804"))response="OY Top Connect"; /*Estonia*/
        else if (response.equals("24806"))response="OY ViaTel"; /*Estonia*/
        else if (response.equals("24803"))response="Tele 2"; /*Estonia*/
        else if (response.equals("63601"))response="ETMTN"; /*Ethiopia*/
        else if (response.equals("28801"))response="Faroese Telecom"; /*Faroe Islands (Denmark)*/
        else if (response.equals("28802"))response="Vodafone"; /*Faroe Islands (Denmark)*/
        else if (response.equals("54202"))response="Digicel"; /*Fiji*/
        else if (response.equals("54201"))response="Vodafone"; /*Fiji*/
        else if (response.equals("24414"))response="AMT"; /*Finland*/
        else if (response.equals("24403"))response="DNA"; /*Finland*/
        else if (response.equals("24412"))response="DNA"; /*Finland*/
        else if (response.equals("24405"))response="Elisa"; /*Finland*/
        else if (response.equals("24407"))response="Nokia"; /*Finland*/
        else if (response.equals("24415"))response="SAMK"; /*Finland*/
        else if (response.equals("24421"))response="Saunalahti"; /*Finland*/
        else if (response.equals("24429"))response="Scnl Truphone"; /*Finland*/
        else if (response.equals("24491"))response="Sonera"; /*Finland*/
        else if (response.equals("24410"))response="TDC Oy"; /*Finland*/
        else if (response.equals("24408"))response="Unknown"; /*Finland*/
        else if (response.equals("24411"))response="VIRVE"; /*Finland*/
        else if (response.equals("20820"))response="Bouygues"; /*France*/
        else if (response.equals("20821"))response="Bouygues"; /*France*/
        else if (response.equals("20888"))response="Bouygues"; /*France*/
        else if (response.equals("20801"))response="France Telecom Mobile"; /*France*/
        else if (response.equals("20814"))response="Free Mobile"; /*France*/
        else if (response.equals("20815"))response="Free Mobile"; /*France*/
        else if (response.equals("20805"))response="Globalstar Europe"; /*France*/
        else if (response.equals("20806"))response="Globalstar Europe"; /*France*/
        else if (response.equals("20807"))response="Globalstar Europe"; /*France*/
        else if (response.equals("20800"))response="Orange"; /*France*/
        else if (response.equals("20802"))response="Orange"; /*France*/
        else if (response.equals("20810"))response="SFR"; /*France*/
        else if (response.equals("20811"))response="SFR"; /*France*/
        else if (response.equals("20813"))response="SFR"; /*France*/
        else if (response.equals("20822"))response="Transatel Mobile"; /*France*/
        else if (response.equals("54720"))response="VINI"; /*French Polynesia (France)*/
        else if (response.equals("62804"))response="Azur"; /*Gabon*/
        else if (response.equals("62801"))response="Libertis"; /*Gabon*/
        else if (response.equals("62802"))response="Moov (Telecel) Gabon S.A."; /*Gabon*/
        else if (response.equals("62803"))response="Zain"; /*Gabon*/
        else if (response.equals("60702"))response="Africel"; /*Gambia*/
        else if (response.equals("60703"))response="Comium"; /*Gambia*/
        else if (response.equals("60701"))response="Gamcel"; /*Gambia*/
        else if (response.equals("60704"))response="QCell"; /*Gambia*/
        else if (response.equals("28988"))response="A-Mobile"; /*Georgia*/
        else if (response.equals("28967"))response="Aquafon"; /*Georgia*/
        else if (response.equals("28204"))response="Beeline"; /*Georgia*/
        else if (response.equals("28201"))response="Geocell"; /*Georgia*/
        else if (response.equals("28203"))response="Iberiatel"; /*Georgia*/
        else if (response.equals("28202"))response="Magti"; /*Georgia*/
        else if (response.equals("28205"))response="Silknet"; /*Georgia*/
        else if (response.equals("26242"))response="27C3"; /*Germany*/
        else if (response.equals("26215"))response="Airdata"; /*Germany*/
        else if (response.equals("26210"))response="Arcor AG & Co"; /*Germany*/
        else if (response.equals("26260"))response="DB Telematik"; /*Germany*/
        else if (response.equals("262901"))response="Debitel"; /*Germany*/
        else if (response.equals("26212"))response="Dolphin Telecom"; /*Germany*/
        else if (response.equals("26203"))response="E-Plus"; /*Germany*/
        else if (response.equals("26205"))response="E-Plus"; /*Germany*/
        else if (response.equals("26277"))response="E-Plus"; /*Germany*/
        else if (response.equals("26214"))response="Group 3G UMTS"; /*Germany*/
        else if (response.equals("26243"))response="LYCA"; /*Germany*/
        else if (response.equals("26213"))response="Mobilcom Multimedia"; /*Germany*/
        else if (response.equals("26292"))response="Nash Technologies"; /*Germany*/
        else if (response.equals("26207"))response="O2"; /*Germany*/
        else if (response.equals("26208"))response="O2"; /*Germany*/
        else if (response.equals("26211"))response="O2"; /*Germany*/
        else if (response.equals("26276"))response="Siemens AG"; /*Germany*/
        else if (response.equals("26201"))response="T-Mobile"; /*Germany*/
        else if (response.equals("26206"))response="T-Mobile"; /*Germany*/
        else if (response.equals("26216"))response="vistream"; /*Germany*/
        else if (response.equals("26202"))response="Vodafone"; /*Germany*/
        else if (response.equals("26204"))response="Vodafone"; /*Germany*/
        else if (response.equals("26209"))response="Vodafone"; /*Germany*/
        else if (response.equals("62006"))response="Airtel"; /*Ghana*/
        else if (response.equals("62002"))response="Ghana Telecom Mobile"; /*Ghana*/
        else if (response.equals("62004"))response="Kasapa / Hutchison Telecom"; /*Ghana*/
        else if (response.equals("62001"))response="MTN"; /*Ghana*/
        else if (response.equals("62003"))response="tiGO"; /*Ghana*/
        else if (response.equals("26606"))response="CTS Mobile"; /*Gibraltar (United Kingdom)*/
        else if (response.equals("26601"))response="GibTel"; /*Gibraltar (United Kingdom)*/
        else if (response.equals("20201"))response="Cosmote"; /*Greece*/
        else if (response.equals("20205"))response="Vodafone"; /*Greece*/
        else if (response.equals("20209"))response="Wind"; /*Greece*/
        else if (response.equals("20210"))response="Wind"; /*Greece*/
        else if (response.equals("29001"))response="TELE Greenland A/S"; /*Greenland (Denmark)*/
        else if (response.equals("352110"))response="Cable & Wireless"; /*Grenada*/
        else if (response.equals("352030"))response="Digicel"; /*Grenada*/
        else if (response.equals("34020"))response="Digicel"; /*Guadeloupe (France)*/
        else if (response.equals("34008"))response="MIO GSM"; /*Guadeloupe (France)*/
        else if (response.equals("34001"))response="Orange"; /*Guadeloupe (France)*/
        else if (response.equals("34002"))response="Outremer"; /*Guadeloupe (France)*/
        else if (response.equals("34003"))response="Telcell"; /*Guadeloupe (France)*/
        else if (response.equals("310033"))response="Guam Telephone Authority"; /*Guam (United States)*/
        else if (response.equals("310370"))response="Guamcell"; /*Guam (United States)*/
        else if (response.equals("310470"))response="Guamcell"; /*Guam (United States)*/
        else if (response.equals("311250"))response="i CAN_GSM"; /*Guam (United States)*/
        else if (response.equals("310032"))response="IT&E Wireless"; /*Guam (United States)*/
        else if (response.equals("310140"))response="mPulse"; /*Guam (United States)*/
        else if (response.equals("70401"))response="Claro"; /*Guatemala*/
        else if (response.equals("70402"))response="Comcel / Tigo"; /*Guatemala*/
        else if (response.equals("70403"))response="movistar"; /*Guatemala*/
        else if (response.equals("73801"))response="Digicel"; /*Guiana*/
        else if (response.equals("73802"))response="GT&T Cellink Plus"; /*Guiana*/
        else if (response.equals("61105"))response="Cellcom"; /*Guinea*/
        else if (response.equals("61102"))response="Lagui"; /*Guinea*/
        else if (response.equals("61104"))response="MTN"; /*Guinea*/
        else if (response.equals("61101"))response="Spacetel"; /*Guinea*/
        else if (response.equals("61103"))response="Telecel Guinee"; /*Guinea*/
        else if (response.equals("63202"))response="Areeba"; /*Guinea-Bissau*/
        else if (response.equals("63203"))response="Orange"; /*Guinea-Bissau*/
        else if (response.equals("372010"))response="Comcel / Voila"; /*Haiti*/
        else if (response.equals("37202"))response="Digicel"; /*Haiti*/
        else if (response.equals("37203"))response="NATCOM"; /*Haiti*/
        else if (response.equals("20414"))response="6Gmobile"; /*Holland (Netherlands)*/
        else if (response.equals("20423"))response="ASPIDER Solutions Nederland B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20427"))response="Breezz Nederland B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20425"))response="CapX B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20407"))response="eleena (MVNE)"; /*Holland (Netherlands)*/
        else if (response.equals("20405"))response="Elephant Talk Communications Premium Rate Services"; /*Holland (Netherlands)*/
        else if (response.equals("20417"))response="Intercity Mobile Communications B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20408"))response="KPN"; /*Holland (Netherlands)*/
        else if (response.equals("20410"))response="KPN"; /*Holland (Netherlands)*/
        else if (response.equals("20469"))response="KPN Mobile The Netherlands B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20409"))response="Lycamobile"; /*Holland (Netherlands)*/
        else if (response.equals("20422"))response="Ministerie van Defensie"; /*Holland (Netherlands)*/
        else if (response.equals("20419"))response="Mixe Communication Solutions B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20406"))response="Mundio Mobile (Netherlands) Ltd"; /*Holland (Netherlands)*/
        else if (response.equals("20421"))response="NS Railinfrabeheer B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20420"))response="Orange Nederland"; /*Holland (Netherlands)*/
        else if (response.equals("20424"))response="Private Mobility Nederland B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20467"))response="RadioAccess B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20426"))response="SpeakUp B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20416"))response="T-Mobile / Ben"; /*Holland (Netherlands)*/
        else if (response.equals("20402"))response="Tele2 Netherlands"; /*Holland (Netherlands)*/
        else if (response.equals("20412"))response="Telfort / O2"; /*Holland (Netherlands)*/
        else if (response.equals("20413"))response="Unica Installatietechniek B.V"; /*Holland (Netherlands)*/
        else if (response.equals("20468"))response="Unify Group Holding B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20418"))response="UPC Nederland B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20401"))response="VastMobiel B.V."; /*Holland (Netherlands)*/
        else if (response.equals("20404"))response="Vodafone"; /*Holland (Netherlands)*/
        else if (response.equals("20403"))response="Voiceworks B.V."; /*Holland (Netherlands)*/
        else if (response.equals("70802"))response="Celtel / Tigo"; /*Honduras*/
        else if (response.equals("70801"))response="Claro"; /*Honduras*/
        else if (response.equals("70840"))response="DIGICEL"; /*Honduras*/
        else if (response.equals("70830"))response="Hondutel"; /*Honduras*/
        else if (response.equals("45403"))response="3 (3G)"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45405"))response="3 CDMA"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45404"))response="3 Dual (2G)"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45412"))response="C Peoples"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45409"))response="China Motion Telecom"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45407"))response="China Unicom"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45411"))response="China-Hongkong Telecom"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45401"))response="CITIC Telecom 1616"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45400"))response="CSL"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45402"))response="CSL 3G"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45418"))response="Hong Kong CSL Limited"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45414"))response="Hutchison Telecom"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45410"))response="New World"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45416"))response="PCCW"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45419"))response="PCCW"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45429"))response="PCCW"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45415"))response="SmarTone Mobile Comms"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45417"))response="SmarTone Mobile Comms"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45406"))response="Smartone-Vodafone"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("45408"))response="Trident"; /*Hong Kong (People's Republic of China)*/
        else if (response.equals("21601"))response="Pannon"; /*Hungary*/
        else if (response.equals("21630"))response="T-Mobile"; /*Hungary*/
        else if (response.equals("21670"))response="Vodafone"; /*Hungary*/
        else if (response.equals("27407"))response="IceCell"; /*Iceland*/
        else if (response.equals("27411"))response="Nova"; /*Iceland*/
        else if (response.equals("27406"))response="N'll nIu ehf"; /*Iceland*/
        else if (response.equals("27408"))response="On-waves"; /*Iceland*/
        else if (response.equals("27401"))response="Siminn"; /*Iceland*/
        else if (response.equals("27412"))response="Tal"; /*Iceland*/
        else if (response.equals("27404"))response="Viking"; /*Iceland*/
        else if (response.equals("27402"))response="Vodafone"; /*Iceland*/
        else if (response.equals("27403"))response="Vodafone"; /*Iceland*/
        else if (response.equals("40417"))response="AIRCEL"; /*India*/
        else if (response.equals("40425"))response="AIRCEL"; /*India*/
        else if (response.equals("40428"))response="AIRCEL"; /*India*/
        else if (response.equals("40429"))response="AIRCEL"; /*India*/
        else if (response.equals("40437"))response="AIRCEL"; /*India*/
        else if (response.equals("40491"))response="AIRCEL"; /*India*/
        else if (response.equals("405082"))response="AIRCEL"; /*India*/
        else if (response.equals("405800"))response="AIRCEL"; /*India*/
        else if (response.equals("405801"))response="AIRCEL"; /*India*/
        else if (response.equals("405802"))response="AIRCEL"; /*India*/
        else if (response.equals("405803"))response="AIRCEL"; /*India*/
        else if (response.equals("405804"))response="AIRCEL"; /*India*/
        else if (response.equals("405805"))response="AIRCEL"; /*India*/
        else if (response.equals("405806"))response="AIRCEL"; /*India*/
        else if (response.equals("405807"))response="AIRCEL"; /*India*/
        else if (response.equals("405808"))response="AIRCEL"; /*India*/
        else if (response.equals("405809"))response="AIRCEL"; /*India*/
        else if (response.equals("405810"))response="AIRCEL"; /*India*/
        else if (response.equals("405811"))response="AIRCEL"; /*India*/
        else if (response.equals("405812"))response="AIRCEL"; /*India*/
        else if (response.equals("405813"))response="AIRCEL"; /*India*/
        else if (response.equals("40460"))response="Aircell Digilink"; /*India*/
        else if (response.equals("40415"))response="Aircell Digilink Essar Cellph."; /*India*/
        else if (response.equals("40406"))response="Airtel"; /*India*/
        else if (response.equals("40410"))response="Airtel"; /*India*/
        else if (response.equals("40431"))response="Airtel"; /*India*/
        else if (response.equals("40440"))response="Airtel"; /*India*/
        else if (response.equals("40445"))response="Airtel"; /*India*/
        else if (response.equals("40449"))response="Airtel"; /*India*/
        else if (response.equals("40470"))response="Airtel"; /*India*/
        else if (response.equals("40494"))response="Airtel"; /*India*/
        else if (response.equals("40495"))response="Airtel"; /*India*/
        else if (response.equals("40497"))response="Airtel"; /*India*/
        else if (response.equals("40498"))response="Airtel"; /*India*/
        else if (response.equals("40551"))response="Airtel"; /*India*/
        else if (response.equals("40552"))response="Airtel"; /*India*/
        else if (response.equals("40553"))response="AirTel"; /*India*/
        else if (response.equals("40554"))response="AirTel"; /*India*/
        else if (response.equals("40555"))response="AirTel"; /*India*/
        else if (response.equals("40556"))response="AirTel"; /*India*/
        else if (response.equals("40570"))response="AirTel"; /*India*/
        else if (response.equals("40496"))response="Airtel - Haryana"; /*India*/
        else if (response.equals("40402"))response="Airtel - Punjab"; /*India*/
        else if (response.equals("40403"))response="Airtel / Bharti Telenet"; /*India*/
        else if (response.equals("40493"))response="Airtel Gujrat"; /*India*/
        else if (response.equals("40490"))response="Airtel Maharashtra & Goa"; /*India*/
        else if (response.equals("40492"))response="Airtel Mumbai"; /*India*/
        else if (response.equals("40443"))response="BPL Mobile Cellular"; /*India*/
        else if (response.equals("40421"))response="BPL Mobile Mumbai"; /*India*/
        else if (response.equals("40427"))response="BPL USWest Cellular / Cellular Comms"; /*India*/
        else if (response.equals("40434"))response="BSNL"; /*India*/
        else if (response.equals("40438"))response="BSNL"; /*India*/
        else if (response.equals("40451"))response="BSNL"; /*India*/
        else if (response.equals("40453"))response="BSNL"; /*India*/
        else if (response.equals("40454"))response="BSNL"; /*India*/
        else if (response.equals("40455"))response="BSNL"; /*India*/
        else if (response.equals("40457"))response="BSNL"; /*India*/
        else if (response.equals("40458"))response="BSNL"; /*India*/
        else if (response.equals("40459"))response="BSNL"; /*India*/
        else if (response.equals("40464"))response="BSNL"; /*India*/
        else if (response.equals("40471"))response="BSNL"; /*India*/
        else if (response.equals("40473"))response="BSNL"; /*India*/
        else if (response.equals("40474"))response="BSNL"; /*India*/
        else if (response.equals("40475"))response="BSNL"; /*India*/
        else if (response.equals("40476"))response="BSNL"; /*India*/
        else if (response.equals("40477"))response="BSNL"; /*India*/
        else if (response.equals("40480"))response="BSNL"; /*India*/
        else if (response.equals("40481"))response="BSNL"; /*India*/
        else if (response.equals("40462"))response="BSNL J&K"; /*India*/
        else if (response.equals("40472"))response="BSNL Kerala"; /*India*/
        else if (response.equals("40466"))response="BSNL Maharashtra & Goa"; /*India*/
        else if (response.equals("40478"))response="BTA Cellcom"; /*India*/
        else if (response.equals("40448"))response="Dishnet Wireless"; /*India*/
        else if (response.equals("40482"))response="Escorts"; /*India*/
        else if (response.equals("40487"))response="Escorts Telecom"; /*India*/
        else if (response.equals("40488"))response="Escorts Telecom"; /*India*/
        else if (response.equals("40489"))response="Escorts Telecom"; /*India*/
        else if (response.equals("40411"))response="Essar / Sterling Cellular"; /*India*/
        else if (response.equals("405912"))response="Etisalat DB(cheers)"; /*India*/
        else if (response.equals("405913"))response="Etisalat DB(cheers)"; /*India*/
        else if (response.equals("405914"))response="Etisalat DB(cheers)"; /*India*/
        else if (response.equals("405917"))response="Etisalat DB(cheers)"; /*India*/
        else if (response.equals("40566"))response="Hutch"; /*India*/
        else if (response.equals("40486"))response="Hutchinson Essar South"; /*India*/
        else if (response.equals("40413"))response="Hutchison Essar South"; /*India*/
        else if (response.equals("40484"))response="Hutchison Essar South"; /*India*/
        else if (response.equals("40419"))response="IDEA"; /*India*/
        else if (response.equals("405799"))response="IDEA"; /*India*/
        else if (response.equals("405845"))response="IDEA"; /*India*/
        else if (response.equals("405848"))response="IDEA"; /*India*/
        else if (response.equals("405850"))response="IDEA"; /*India*/
        else if (response.equals("40586"))response="IDEA"; /*India*/
        else if (response.equals("40412"))response="Idea (Escotel) Haryana"; /*India*/
        else if (response.equals("40456"))response="Idea (Escotel) UP West"; /*India*/
        else if (response.equals("40404"))response="IDEA CELLULAR - Delhi"; /*India*/
        else if (response.equals("40424"))response="IDEA Cellular - Gujarat"; /*India*/
        else if (response.equals("40422"))response="IDEA Cellular - Maharashtra"; /*India*/
        else if (response.equals("405855"))response="Loop Mobile"; /*India*/
        else if (response.equals("405864"))response="Loop Mobile"; /*India*/
        else if (response.equals("405865"))response="Loop Mobile"; /*India*/
        else if (response.equals("40468"))response="MTNL - Delhi"; /*India*/
        else if (response.equals("40469"))response="MTNL - Mumbai"; /*India*/
        else if (response.equals("40450"))response="Reliance"; /*India*/
        else if (response.equals("40452"))response="Reliance"; /*India*/
        else if (response.equals("40467"))response="Reliance"; /*India*/
        else if (response.equals("40483"))response="Reliance"; /*India*/
        else if (response.equals("40485"))response="Reliance"; /*India*/
        else if (response.equals("40501"))response="Reliance"; /*India*/
        else if (response.equals("40503"))response="Reliance"; /*India*/
        else if (response.equals("40504"))response="Reliance"; /*India*/
        else if (response.equals("40509"))response="Reliance"; /*India*/
        else if (response.equals("40510"))response="Reliance"; /*India*/
        else if (response.equals("40513"))response="Reliance"; /*India*/
        else if (response.equals("40409"))response="Reliance Telecom Private"; /*India*/
        else if (response.equals("40436"))response="Reliance Telecom Private"; /*India*/
        else if (response.equals("40441"))response="RPG MAA"; /*India*/
        else if (response.equals("405881"))response="S Tel"; /*India*/
        else if (response.equals("40444"))response="Spice Telecom - Karnataka"; /*India*/
        else if (response.equals("40414"))response="Spice Telecom - Punjab"; /*India*/
        else if (response.equals("40442"))response="Srinivas Cellcom / Aircel"; /*India*/
        else if (response.equals("40407"))response="TATA Cellular / Idea Cellular"; /*India*/
        else if (response.equals("405025"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405026"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405027"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405029"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405030"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405031"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405032"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405033"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405034"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405035"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405036"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405037"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405038"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405039"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405040"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405041"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405042"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405043"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405044"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405045"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405046"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405047"))response="TATA Teleservice"; /*India*/
        else if (response.equals("405818"))response="Uninor"; /*India*/
        else if (response.equals("405819"))response="Uninor"; /*India*/
        else if (response.equals("405820"))response="Uninor"; /*India*/
        else if (response.equals("405821"))response="Uninor"; /*India*/
        else if (response.equals("405822"))response="Uninor"; /*India*/
        else if (response.equals("405844"))response="Uninor"; /*India*/
        else if (response.equals("405875"))response="Uninor"; /*India*/
        else if (response.equals("405880"))response="Uninor"; /*India*/
        else if (response.equals("405927"))response="Uninor"; /*India*/
        else if (response.equals("405929"))response="Uninor"; /*India*/
        else if (response.equals("405824"))response="Videocon Datacom"; /*India*/
        else if (response.equals("405827"))response="Videocon Datacom"; /*India*/
        else if (response.equals("405834"))response="Videocon Datacom"; /*India*/
        else if (response.equals("40420"))response="Vodafone"; /*India*/
        else if (response.equals("40446"))response="Vodafone"; /*India*/
        else if (response.equals("40405"))response="Vodafone - Gujarat"; /*India*/
        else if (response.equals("40401"))response="Vodafone - Haryana"; /*India*/
        else if (response.equals("40430"))response="Vodafone - Kolkata"; /*India*/
        else if (response.equals("405750"))response="Vodafone IN"; /*India*/
        else if (response.equals("405751"))response="Vodafone IN"; /*India*/
        else if (response.equals("405752"))response="Vodafone IN"; /*India*/
        else if (response.equals("405753"))response="Vodafone IN"; /*India*/
        else if (response.equals("405754"))response="Vodafone IN"; /*India*/
        else if (response.equals("405755"))response="Vodafone IN"; /*India*/
        else if (response.equals("405756"))response="Vodafone IN"; /*India*/
        else if (response.equals("51089"))response="3"; /*Indonesia*/
        else if (response.equals("51008"))response="AXIS"; /*Indonesia*/
        else if (response.equals("51027"))response="Ceria"; /*Indonesia*/
        else if (response.equals("51099"))response="Esia"; /*Indonesia*/
        else if (response.equals("51028"))response="Fren/Hepi"; /*Indonesia*/
        else if (response.equals("51021"))response="IM3"; /*Indonesia*/
        else if (response.equals("51001"))response="INDOSAT"; /*Indonesia*/
        else if (response.equals("51000"))response="PSN"; /*Indonesia*/
        else if (response.equals("51009"))response="SMART"; /*Indonesia*/
        else if (response.equals("51003"))response="StarOne"; /*Indonesia*/
        else if (response.equals("51007"))response="TelkomFlexi"; /*Indonesia*/
        else if (response.equals("51020"))response="TELKOMMobile"; /*Indonesia*/
        else if (response.equals("51010"))response="Telkomsel"; /*Indonesia*/
        else if (response.equals("51011"))response="XL"; /*Indonesia*/
        else if (response.equals("43235"))response="Irancell"; /*Iran*/
        else if (response.equals("43293"))response="Iraphone"; /*Iran*/
        else if (response.equals("43211"))response="MCI"; /*Iran*/
        else if (response.equals("43219"))response="MTCE"; /*Iran*/
        else if (response.equals("43232"))response="Taliya"; /*Iran*/
        else if (response.equals("43270"))response="TCI"; /*Iran*/
        else if (response.equals("43214"))response="TKC"; /*Iran*/
        else if (response.equals("41805"))response="Asia Cell"; /*Iraq*/
        else if (response.equals("41850"))response="Asia Cell"; /*Iraq*/
        else if (response.equals("41840"))response="Korek"; /*Iraq*/
        else if (response.equals("41845"))response="Mobitel"; /*Iraq*/
        else if (response.equals("41892"))response="Omnnea"; /*Iraq*/
        else if (response.equals("41808"))response="SanaTel"; /*Iraq*/
        else if (response.equals("41820"))response="Zain IQ"; /*Iraq*/
        else if (response.equals("41830"))response="Zain IQ"; /*Iraq*/
        else if (response.equals("27205"))response="3"; /*Ireland*/
        else if (response.equals("27204"))response="Access Telecom"; /*Ireland*/
        else if (response.equals("27209"))response="Clever Communications"; /*Ireland*/
        else if (response.equals("27200"))response="E-Mobile"; /*Ireland*/
        else if (response.equals("27207"))response="Eircom"; /*Ireland*/
        else if (response.equals("27211"))response="Liffey Telecom"; /*Ireland*/
        else if (response.equals("27203"))response="Meteor"; /*Ireland*/
        else if (response.equals("27202"))response="O2"; /*Ireland*/
        else if (response.equals("272020"))response="Tesco Mobile"; /*Ireland*/
        else if (response.equals("27201"))response="Vodafone"; /*Ireland*/
        else if (response.equals("42502"))response="Cellcom"; /*Israel*/
        else if (response.equals("42577"))response="Mirs"; /*Israel*/
        else if (response.equals("42501"))response="Orange"; /*Israel*/
        else if (response.equals("-"))response="Partner"; /*Israel*/
        else if (response.equals("42503"))response="Pelephone"; /*Israel*/
        else if (response.equals("22299"))response="3 Italia"; /*Italy*/
        else if (response.equals("22298"))response="Blu"; /*Italy*/
        else if (response.equals("22202"))response="Elsacom"; /*Italy*/
        else if (response.equals("22277"))response="IPSE 2000"; /*Italy*/
        else if (response.equals("22207"))response="Noverca"; /*Italy*/
        else if (response.equals("22230"))response="RFI"; /*Italy*/
        else if (response.equals("22201"))response="TIM"; /*Italy*/
        else if (response.equals("22210"))response="Vodafone"; /*Italy*/
        else if (response.equals("22288"))response="Wind"; /*Italy*/
        else if (response.equals("338020"))response="Cable & Wireless"; /*Jamaica*/
        else if (response.equals("338180"))response="Cable & Wireless"; /*Jamaica*/
        else if (response.equals("338070"))response="Claro"; /*Jamaica*/
        else if (response.equals("338050"))response="Digicel"; /*Jamaica*/
        else if (response.equals("44001"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44002"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44003"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44009"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44010"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44011"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44012"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44013"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44014"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44015"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44016"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44017"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44018"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44019"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44021"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44022"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44023"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44024"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44025"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44026"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44027"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44028"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44029"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44030"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44031"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44032"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44033"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44034"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44035"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44036"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44037"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44038"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44039"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44049"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44058"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44060"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44061"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44062"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44063"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44064"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44065"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44066"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44067"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44068"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44069"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44087"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44099"))response="DoCoMo"; /*Japan*/
        else if (response.equals("44000"))response="eMobile"; /*Japan*/
        else if (response.equals("44007"))response="KDDI"; /*Japan*/
        else if (response.equals("44008"))response="KDDI"; /*Japan*/
        else if (response.equals("44050"))response="KDDI"; /*Japan*/
        else if (response.equals("44051"))response="KDDI"; /*Japan*/
        else if (response.equals("44052"))response="KDDI"; /*Japan*/
        else if (response.equals("44053"))response="KDDI"; /*Japan*/
        else if (response.equals("44054"))response="KDDI"; /*Japan*/
        else if (response.equals("44055"))response="KDDI"; /*Japan*/
        else if (response.equals("44056"))response="KDDI"; /*Japan*/
        else if (response.equals("44070"))response="KDDI"; /*Japan*/
        else if (response.equals("44071"))response="KDDI"; /*Japan*/
        else if (response.equals("44072"))response="KDDI"; /*Japan*/
        else if (response.equals("44073"))response="KDDI"; /*Japan*/
        else if (response.equals("44074"))response="KDDI"; /*Japan*/
        else if (response.equals("44075"))response="KDDI"; /*Japan*/
        else if (response.equals("44076"))response="KDDI"; /*Japan*/
        else if (response.equals("44077"))response="KDDI"; /*Japan*/
        else if (response.equals("44079"))response="KDDI"; /*Japan*/
        else if (response.equals("44088"))response="KDDI"; /*Japan*/
        else if (response.equals("44089"))response="KDDI"; /*Japan*/
        else if (response.equals("44078"))response="Okinawa Cellular Telephone"; /*Japan*/
        else if (response.equals("44020"))response="SoftBank"; /*Japan*/
        else if (response.equals("44080"))response="TU-KA"; /*Japan*/
        else if (response.equals("44081"))response="TU-KA"; /*Japan*/
        else if (response.equals("44082"))response="TU-KA"; /*Japan*/
        else if (response.equals("44083"))response="TU-KA"; /*Japan*/
        else if (response.equals("44084"))response="TU-KA"; /*Japan*/
        else if (response.equals("44085"))response="TU-KA"; /*Japan*/
        else if (response.equals("44086"))response="TU-KA"; /*Japan*/
        else if (response.equals("44004"))response="Vodafone"; /*Japan*/
        else if (response.equals("44006"))response="Vodafone"; /*Japan*/
        else if (response.equals("44040"))response="Vodafone"; /*Japan*/
        else if (response.equals("44041"))response="Vodafone"; /*Japan*/
        else if (response.equals("44042"))response="Vodafone"; /*Japan*/
        else if (response.equals("44043"))response="Vodafone"; /*Japan*/
        else if (response.equals("44044"))response="Vodafone"; /*Japan*/
        else if (response.equals("44045"))response="Vodafone"; /*Japan*/
        else if (response.equals("44046"))response="Vodafone"; /*Japan*/
        else if (response.equals("44047"))response="Vodafone"; /*Japan*/
        else if (response.equals("44048"))response="Vodafone"; /*Japan*/
        else if (response.equals("44090"))response="Vodafone"; /*Japan*/
        else if (response.equals("44092"))response="Vodafone"; /*Japan*/
        else if (response.equals("44093"))response="Vodafone"; /*Japan*/
        else if (response.equals("44094"))response="Vodafone"; /*Japan*/
        else if (response.equals("44095"))response="Vodafone"; /*Japan*/
        else if (response.equals("44096"))response="Vodafone"; /*Japan*/
        else if (response.equals("44097"))response="Vodafone"; /*Japan*/
        else if (response.equals("44098"))response="Vodafone"; /*Japan*/
        else if (response.equals("41677"))response="Orange"; /*Jordan*/
        else if (response.equals("41603"))response="Umniah"; /*Jordan*/
        else if (response.equals("41602"))response="XPress Telecom"; /*Jordan*/
        else if (response.equals("41601"))response="Zain"; /*Jordan*/
        else if (response.equals("40101"))response="Beeline"; /*Kazakhstan*/
        else if (response.equals("40107"))response="Dalacom"; /*Kazakhstan*/
        else if (response.equals("40102"))response="K'Cell"; /*Kazakhstan*/
        else if (response.equals("40108"))response="Kazakhtelecom"; /*Kazakhstan*/
        else if (response.equals("40177"))response="Mobile Telecom Service"; /*Kazakhstan*/
        else if (response.equals("63907"))response="Orange Kenya"; /*Kenya*/
        else if (response.equals("63902"))response="Safaricom"; /*Kenya*/
        else if (response.equals("63905"))response="yu"; /*Kenya*/
        else if (response.equals("63903"))response="Zain"; /*Kenya*/
        else if (response.equals("54509"))response="Kiribati Frigate"; /*Kiribati*/
        else if (response.equals("41904"))response="Viva"; /*Kuwait*/
        else if (response.equals("41903"))response="Wataniya"; /*Kuwait*/
        else if (response.equals("41902"))response="Zain"; /*Kuwait*/
        else if (response.equals("43701"))response="Bitel"; /*Kyrgyzstan*/
        else if (response.equals("43703"))response="Fonex"; /*Kyrgyzstan*/
        else if (response.equals("43705"))response="MegaCom"; /*Kyrgyzstan*/
        else if (response.equals("43709"))response="O!"; /*Kyrgyzstan*/
        else if (response.equals("45702"))response="ETL"; /*Laos*/
        else if (response.equals("45701"))response="LaoTel"; /*Laos*/
        else if (response.equals("45703"))response="LAT"; /*Laos*/
        else if (response.equals("45708"))response="Tigo"; /*Laos*/
        else if (response.equals("24705"))response="Bite"; /*Latvia*/
        else if (response.equals("24709"))response="Camel Mobile"; /*Latvia*/
        else if (response.equals("24708"))response="IZZI"; /*Latvia*/
        else if (response.equals("24701"))response="LMT"; /*Latvia*/
        else if (response.equals("24707"))response="MTS"; /*Latvia*/
        else if (response.equals("24706"))response="Rigatta"; /*Latvia*/
        else if (response.equals("24702"))response="Tele2"; /*Latvia*/
        else if (response.equals("24703"))response="TRIATEL"; /*Latvia*/
        else if (response.equals("41501"))response="Alfa"; /*Lebanon*/
        else if (response.equals("41503"))response="MTC-Touch"; /*Lebanon*/
        else if (response.equals("41505"))response="Ogero Mobile"; /*Lebanon*/
        else if (response.equals("65102"))response="Econet Ezin-cel"; /*Lesotho*/
        else if (response.equals("65101"))response="Vodacom"; /*Lesotho*/
        else if (response.equals("60602"))response="Al-Jeel Phone"; /*Libya*/
        else if (response.equals("60606"))response="Hatef Libya"; /*Libya*/
        else if (response.equals("60603"))response="Libya Phone"; /*Libya*/
        else if (response.equals("60600"))response="Libyana"; /*Libya*/
        else if (response.equals("60601"))response="Madar"; /*Libya*/
        else if (response.equals("29504"))response="Cubic Telecom"; /*Liechtenstein*/
        else if (response.equals("29505"))response="FL1"; /*Liechtenstein*/
        else if (response.equals("29502"))response="Orange"; /*Liechtenstein*/
        else if (response.equals("29501"))response="Swisscom"; /*Liechtenstein*/
        else if (response.equals("29577"))response="Tele 2"; /*Liechtenstein*/
        else if (response.equals("24602"))response="BITE"; /*Lithuania*/
        else if (response.equals("24605"))response="LitRail"; /*Lithuania*/
        else if (response.equals("24606"))response="Mediafon"; /*Lithuania*/
        else if (response.equals("24601"))response="Omnitel"; /*Lithuania*/
        else if (response.equals("24603"))response="Tele 2"; /*Lithuania*/
        else if (response.equals("61807"))response="Cellcom"; /*Livery*/
        else if (response.equals("61804"))response="Comium Liberi"; /*Livery*/
        else if (response.equals("61802"))response="Libercell"; /*Livery*/
        else if (response.equals("61820"))response="LIBTELCO"; /*Livery*/
        else if (response.equals("61801"))response="Lonestar Cell"; /*Livery*/
        else if (response.equals("27001"))response="LuxGSM"; /*Luksemburg*/
        else if (response.equals("27077"))response="Tango"; /*Luksemburg*/
        else if (response.equals("27099"))response="Voxmobile"; /*Luksemburg*/
        else if (response.equals("45503"))response="3"; /*Macao (People's Republic of China)*/
        else if (response.equals("45505"))response="3"; /*Macao (People's Republic of China)*/
        else if (response.equals("45502"))response="China Telecom"; /*Macao (People's Republic of China)*/
        else if (response.equals("45501"))response="CTM"; /*Macao (People's Republic of China)*/
        else if (response.equals("45504"))response="CTM"; /*Macao (People's Republic of China)*/
        else if (response.equals("45500"))response="SmarTone"; /*Macao (People's Republic of China)*/
        else if (response.equals("64602"))response="Orange"; /*Madagascar*/
        else if (response.equals("64603"))response="Sacel"; /*Madagascar*/
        else if (response.equals("64604"))response="Telma"; /*Madagascar*/
        else if (response.equals("64601"))response="Zain"; /*Madagascar*/
        else if (response.equals("65001"))response="TNM"; /*Malawi*/
        else if (response.equals("65010"))response="Zain"; /*Malawi*/
        else if (response.equals("50201"))response="ATUR 450"; /*Malaysia*/
        else if (response.equals("502151"))response="Baraka Telecom Sdn Bhd (MVNE)"; /*Malaysia*/
        else if (response.equals("50213"))response="Celcom"; /*Malaysia*/
        else if (response.equals("50219"))response="Celcom"; /*Malaysia*/
        else if (response.equals("50216"))response="DiGi"; /*Malaysia*/
        else if (response.equals("50210"))response="DiGi Telecommunications"; /*Malaysia*/
        else if (response.equals("50220"))response="Electcoms Wireless Sdn Bhd"; /*Malaysia*/
        else if (response.equals("50212"))response="Maxis"; /*Malaysia*/
        else if (response.equals("50217"))response="Maxis"; /*Malaysia*/
        else if (response.equals("50214"))response="Telekom Malaysia Berhad for PSTN SMS"; /*Malaysia*/
        else if (response.equals("50211"))response="TM Homeline"; /*Malaysia*/
        else if (response.equals("502150"))response="Tune Talk Sdn Bhd"; /*Malaysia*/
        else if (response.equals("50218"))response="U Mobile"; /*Malaysia*/
        else if (response.equals("502152"))response="Yes"; /*Malaysia*/
        else if (response.equals("47201"))response="Dhiraagu"; /*Maldives*/
        else if (response.equals("47202"))response="Wataniya"; /*Maldives*/
        else if (response.equals("61001"))response="Malitel"; /*Mali*/
        else if (response.equals("61002"))response="Orange"; /*Mali*/
        else if (response.equals("27821"))response="GO"; /*Malta*/
        else if (response.equals("27877"))response="Melita"; /*Malta*/
        else if (response.equals("27801"))response="Vodafone"; /*Malta*/
        else if (response.equals("60902"))response="Chinguitel"; /*Mauretania*/
        else if (response.equals("60901"))response="Mattel"; /*Mauretania*/
        else if (response.equals("60910"))response="Mauritel"; /*Mauretania*/
        else if (response.equals("61710"))response="Emtel"; /*Mauritius*/
        else if (response.equals("61702"))response="Mahanagar Telephone (Mauritius) Ltd."; /*Mauritius*/
        else if (response.equals("61701"))response="Orange"; /*Mauritius*/
        else if (response.equals("334050"))response="Iusacell"; /*Mexico*/
        else if (response.equals("33403"))response="movistar"; /*Mexico*/
        else if (response.equals("334030"))response="movistar"; /*Mexico*/
        else if (response.equals("33401"))response="Nextel"; /*Mexico*/
        else if (response.equals("334010"))response="Nextel"; /*Mexico*/
        else if (response.equals("33402"))response="Telcel"; /*Mexico*/
        else if (response.equals("334020"))response="Telcel"; /*Mexico*/
        else if (response.equals("55001"))response="FSM Telecom"; /*Micronesia*/
        else if (response.equals("25904"))response="Eventis"; /*Moldova*/
        else if (response.equals("25903"))response="IDC"; /*Moldova*/
        else if (response.equals("25902"))response="Moldcell"; /*Moldova*/
        else if (response.equals("25901"))response="Orange"; /*Moldova*/
        else if (response.equals("25905"))response="UnitE"; /*Moldova*/
        else if (response.equals("25999"))response="UnitE"; /*Moldova*/
        else if (response.equals("21201"))response="Office des Telephones"; /*Monaco*/
        else if (response.equals("42898"))response="G.Mobile"; /*Mongolia*/
        else if (response.equals("42899"))response="MobiCom"; /*Mongolia*/
        else if (response.equals("42891"))response="Skytel"; /*Mongolia*/
        else if (response.equals("42888"))response="Unitel"; /*Mongolia*/
        else if (response.equals("29703"))response="m:tel CG"; /*Montenegro*/
        else if (response.equals("22004"))response="T-Mobile"; /*Montenegro*/
        else if (response.equals("29702"))response="T-Mobile"; /*Montenegro*/
        else if (response.equals("29704"))response="T-Mobile"; /*Montenegro*/
        else if (response.equals("29701"))response="Telenor Montenegro"; /*Montenegro*/
        else if (response.equals("60401"))response="IAM"; /*Morocco*/
        else if (response.equals("60405"))response="INWI"; /*Morocco*/
        else if (response.equals("60400"))response="Meditel"; /*Morocco*/
        else if (response.equals("64301"))response="mCel"; /*Mozambique*/
        else if (response.equals("64304"))response="Vodacom"; /*Mozambique*/
        else if (response.equals("41401"))response="MPT"; /*Myanmar*/
        else if (response.equals("64903"))response="Cell One"; /*Namibia*/
        else if (response.equals("64901"))response="MTC"; /*Namibia*/
        else if (response.equals("64902"))response="switch"; /*Namibia*/
        else if (response.equals("53602"))response="Digicel"; /*Nauru*/
        else if (response.equals("42902"))response="Mero Mobile"; /*Nepal*/
        else if (response.equals("42901"))response="Nepal Telecom"; /*Nepal*/
        else if (response.equals("42904"))response="SmartCell"; /*Nepal*/
        else if (response.equals("42903"))response="United Telecom Limited"; /*Nepal*/
        else if (response.equals("36294"))response="Bayus"; /*Netherlands Antilles (Netherlands)*/
        else if (response.equals("36269"))response="Digicel"; /*Netherlands Antilles (Netherlands)*/
        else if (response.equals("36295"))response="MIO"; /*Netherlands Antilles (Netherlands)*/
        else if (response.equals("36251"))response="Telcell"; /*Netherlands Antilles (Netherlands)*/
        else if (response.equals("36291"))response="UTS"; /*Netherlands Antilles (Netherlands)*/
        else if (response.equals("54601"))response="Mobilis"; /*New Caledonia (France)*/
        else if (response.equals("53024"))response="NZ Comms"; /*New Zealand*/
        else if (response.equals("53000"))response="Telecom"; /*New Zealand*/
        else if (response.equals("53002"))response="Telecom"; /*New Zealand*/
        else if (response.equals("53005"))response="Telecom"; /*New Zealand*/
        else if (response.equals("53004"))response="TelstraClear"; /*New Zealand*/
        else if (response.equals("53001"))response="Vodafone"; /*New Zealand*/
        else if (response.equals("53003"))response="Woosh"; /*New Zealand*/
        else if (response.equals("71021"))response="Claro"; /*Nicaragua*/
        else if (response.equals("71030"))response="movistar"; /*Nicaragua*/
        else if (response.equals("71073"))response="SERCOM"; /*Nicaragua*/
        else if (response.equals("61404"))response="Orange"; /*Niger*/
        else if (response.equals("61401"))response="SahelCom"; /*Niger*/
        else if (response.equals("61403"))response="Telecel"; /*Niger*/
        else if (response.equals("61402"))response="Zain"; /*Niger*/
        else if (response.equals("62160"))response="Etisalat"; /*Nigeria*/
        else if (response.equals("62150"))response="Glo"; /*Nigeria*/
        else if (response.equals("62140"))response="M-Tel"; /*Nigeria*/
        else if (response.equals("62130"))response="MTN"; /*Nigeria*/
        else if (response.equals("62125"))response="Visafone"; /*Nigeria*/
        else if (response.equals("62120"))response="Zain"; /*Nigeria*/
        else if (response.equals("55501"))response="Telecom Niue"; /*Niue*/
        else if (response.equals("467192"))response="Koryolink"; /*North Korea*/
        else if (response.equals("467193"))response="SUN NET"; /*North Korea*/
        else if (response.equals("24209"))response="Barablu Mobile Norway Ltd"; /*Norway*/
        else if (response.equals("24206"))response="Ice"; /*Norway*/
        else if (response.equals("24220"))response="Jernbaneverket AS"; /*Norway*/
        else if (response.equals("24223"))response="Lyca"; /*Norway*/
        else if (response.equals("24203"))response="MTU"; /*Norway*/
        else if (response.equals("24202"))response="NetCom"; /*Norway*/
        else if (response.equals("24205"))response="Network Norway"; /*Norway*/
        else if (response.equals("24211"))response="SystemNet"; /*Norway*/
        else if (response.equals("24208"))response="TDC Mobil AS"; /*Norway*/
        else if (response.equals("24204"))response="Tele2"; /*Norway*/
        else if (response.equals("24201"))response="Telenor"; /*Norway*/
        else if (response.equals("--"))response="Telia"; /*Norway*/
        else if (response.equals("24207"))response="Ventelo"; /*Norway*/
        else if (response.equals("42203"))response="Nawras"; /*Oman*/
        else if (response.equals("42202"))response="Oman Mobile"; /*Oman*/
        else if (response.equals("25030"))response="Megafon"; /*Osetia*/
        else if (response.equals("41008"))response="Instaphone"; /*Pakistan*/
        else if (response.equals("41001"))response="Mobilink"; /*Pakistan*/
        else if (response.equals("41006"))response="Telenor"; /*Pakistan*/
        else if (response.equals("41003"))response="Ufone"; /*Pakistan*/
        else if (response.equals("41007"))response="Warid"; /*Pakistan*/
        else if (response.equals("41004"))response="Zong"; /*Pakistan*/
        else if (response.equals("55280"))response="Palau Mobile"; /*Palau*/
        else if (response.equals("55201"))response="PNCC"; /*Palau*/
        else if (response.equals("42505"))response="JAWWAL"; /*Palestine*/
        else if (response.equals("42506"))response="Wataniya"; /*Palestine*/
        else if (response.equals("71401"))response="Cable & Wireless"; /*Panama*/
        else if (response.equals("71404"))response="Digicel"; /*Panama*/
        else if (response.equals("71403"))response="laro"; /*Panama*/
        else if (response.equals("71402"))response="movistar"; /*Panama*/
        else if (response.equals("53701"))response="B-Mobile"; /*Papua New Guinea*/
        else if (response.equals("53703"))response="Digicel"; /*Papua New Guinea*/
        else if (response.equals("74402"))response="Claro"; /*Paraguay*/
        else if (response.equals("74406"))response="Copaco"; /*Paraguay*/
        else if (response.equals("74405"))response="Personal"; /*Paraguay*/
        else if (response.equals("74404"))response="Tigo"; /*Paraguay*/
        else if (response.equals("74401"))response="VOX"; /*Paraguay*/
        else if (response.equals("71610"))response="Claro"; /*Peru*/
        else if (response.equals("71606"))response="movistar"; /*Peru*/
        else if (response.equals("71607"))response="NEXTEL"; /*Peru*/
        else if (response.equals("51511"))response="ACeS Philippines"; /*Philippines*/
        else if (response.equals("51505"))response="Digitel"; /*Philippines*/
        else if (response.equals("51502"))response="Globe"; /*Philippines*/
        else if (response.equals("51501"))response="Islacom"; /*Philippines*/
        else if (response.equals("51588"))response="Nextel"; /*Philippines*/
        else if (response.equals("51518"))response="Red Mobile"; /*Philippines*/
        else if (response.equals("51503"))response="Smart Gold"; /*Philippines*/
        else if (response.equals("26017"))response="Aero2"; /*Poland*/
        else if (response.equals("26015"))response="CenterNet"; /*Poland*/
        else if (response.equals("26012"))response="Cyfrowy Polsat"; /*Poland*/
        else if (response.equals("26008"))response="E-Telko"; /*Poland*/
        else if (response.equals("26016"))response="Mobyland"; /*Poland*/
        else if (response.equals("26011"))response="Nordisk Polska"; /*Poland*/
        else if (response.equals("26003"))response="Orange"; /*Poland*/
        else if (response.equals("26006"))response="Play"; /*Poland*/
        else if (response.equals("26001"))response="Plus"; /*Poland*/
        else if (response.equals("26005"))response="Polska Telefonia"; /*Poland*/
        else if (response.equals("26007"))response="Premium Internet"; /*Poland*/
        else if (response.equals("26013"))response="Sferia"; /*Poland*/
        else if (response.equals("26002"))response="T-mobile"; /*Poland*/
        else if (response.equals("26004"))response="Tele2"; /*Poland*/
        else if (response.equals("26010"))response="Telefony Opalenickie"; /*Poland*/
        else if (response.equals("26009"))response="Telekomunikacja Kolejowa"; /*Poland*/
        else if (response.equals("26803"))response="Optimus"; /*Portugal*/
        else if (response.equals("26806"))response="TMN"; /*Portugal*/
        else if (response.equals("26801"))response="Vodafone"; /*Portugal*/
        else if (response.equals("26821"))response="Zapp"; /*Portugal*/
        else if (response.equals("33011"))response="Claro"; /*Puerto Rico*/
        else if (response.equals("330110"))response="Claro"; /*Puerto Rico*/
        else if (response.equals("33000"))response="Open Mobile"; /*Puerto Rico*/
        else if (response.equals("42705"))response="Ministry of Interior"; /*Qatar*/
        else if (response.equals("42701"))response="Qatarnet"; /*Qatar*/
        else if (response.equals("42702"))response="Vodafone"; /*Qatar*/
        else if (response.equals("62910"))response="Libertis Telecom"; /*Republic of Congo*/
        else if (response.equals("62907"))response="Warid Telecom"; /*Republic of Congo*/
        else if (response.equals("62901"))response="Zain"; /*Republic of Congo*/
        else if (response.equals("29402"))response="Cosmofon"; /*Republic of Macedonia*/
        else if (response.equals("29401"))response="T-Mobile"; /*Republic of Macedonia*/
        else if (response.equals("29403"))response="VIP"; /*Republic of Macedonia*/
        else if (response.equals("64700"))response="Orange"; /*Reunion (France)*/
        else if (response.equals("64702"))response="Outremer"; /*Reunion (France)*/
        else if (response.equals("64710"))response="SFR Reunion"; /*Reunion (France)*/
        else if (response.equals("22603"))response="Cosmote"; /*Romania*/
        else if (response.equals("22605"))response="DIGI.mobil"; /*Romania*/
        else if (response.equals("22611"))response="Enigma-System"; /*Romania*/
        else if (response.equals("22610"))response="Orange"; /*Romania*/
        else if (response.equals("22602"))response="Romtelecom"; /*Romania*/
        else if (response.equals("22601"))response="Vodafone"; /*Romania*/
        else if (response.equals("22604"))response="Zapp"; /*Romania*/
        else if (response.equals("22606"))response="Zapp"; /*Romania*/
        else if (response.equals("25012"))response="Baykalwestcom"; /*Russian Federation*/
        else if (response.equals("25028"))response="Beeline"; /*Russian Federation*/
        else if (response.equals("25099"))response="Beeline"; /*Russian Federation*/
        else if (response.equals("25010"))response="DTC"; /*Russian Federation*/
        else if (response.equals("25005"))response="ETK"; /*Russian Federation*/
        else if (response.equals("25019"))response="INDIGO"; /*Russian Federation*/
        else if (response.equals("25013"))response="KUGSM"; /*Russian Federation*/
        else if (response.equals("25002"))response="MegaFon"; /*Russian Federation*/
        else if (response.equals("25023"))response="Mobicom - Novosibirsk"; /*Russian Federation*/
        else if (response.equals("25035"))response="MOTIV"; /*Russian Federation*/
        else if (response.equals("25001"))response="MTS"; /*Russian Federation*/
        else if (response.equals("25003"))response="NCC"; /*Russian Federation*/
        else if (response.equals("25016"))response="NTC"; /*Russian Federation*/
        else if (response.equals("25011"))response="Orensot"; /*Russian Federation*/
        else if (response.equals("25092"))response="Primtelefon"; /*Russian Federation*/
        else if (response.equals("25004"))response="Sibchallenge"; /*Russian Federation*/
        else if (response.equals("25006"))response="Skylink"; /*Russian Federation*/
        else if (response.equals("25009"))response="Skylink"; /*Russian Federation*/
        else if (response.equals("25007"))response="SMARTS"; /*Russian Federation*/
        else if (response.equals("25014"))response="SMARTS"; /*Russian Federation*/
        else if (response.equals("25015"))response="SMARTS"; /*Russian Federation*/
        else if (response.equals("25044"))response="Stavtelesot / North Caucasian GSM"; /*Russian Federation*/
        else if (response.equals("25038"))response="Tambov GSM"; /*Russian Federation*/
        else if (response.equals("25020"))response="Tele2"; /*Russian Federation*/
        else if (response.equals("25093"))response="Telecom XXI"; /*Russian Federation*/
        else if (response.equals("25017"))response="Utel"; /*Russian Federation*/
        else if (response.equals("25039"))response="Utel"; /*Russian Federation*/
        else if (response.equals("63510"))response="MTN"; /*Rwanda*/
        else if (response.equals("63512"))response="Rwandatel"; /*Rwanda*/
        else if (response.equals("63513"))response="Tigo"; /*Rwanda*/
        else if (response.equals("356110"))response="Cable & Wireless"; /*Saint Kitts and Nevis*/
        else if (response.equals("356070"))response="Chippie"; /*Saint Kitts and Nevis*/
        else if (response.equals("356050"))response="Digicel"; /*Saint Kitts and Nevis*/
        else if (response.equals("358110"))response="Cable & Wireless"; /*Saint Lucia*/
        else if (response.equals("358050"))response="Digicel"; /*Saint Lucia*/
        else if (response.equals("360110"))response="Cable & Wireless"; /*Saint Vincent and the Grenadines*/
        else if (response.equals("360100"))response="Cingular Wireless"; /*Saint Vincent and the Grenadines*/
        else if (response.equals("360050"))response="Digicel"; /*Saint Vincent and the Grenadines*/
        else if (response.equals("360070"))response="Digicel"; /*Saint Vincent and the Grenadines*/
        else if (response.equals("30801"))response="Ameris"; /*Saint-Pierre and Miquelon (France)*/
        else if (response.equals("54901"))response="Digicel"; /*Samoa*/
        else if (response.equals("54927"))response="SamoaTel"; /*Samoa*/
        else if (response.equals("29201"))response="PRIMA"; /*San Marino*/
        else if (response.equals("62601"))response="CSTmovel"; /*Sao Tome and Principe*/
        else if (response.equals("42007"))response="EAE"; /*Saudi Arabia*/
        else if (response.equals("42003"))response="Mobily"; /*Saudi Arabia*/
        else if (response.equals("42001"))response="STC"; /*Saudi Arabia*/
        else if (response.equals("42004"))response="Zain SA"; /*Saudi Arabia*/
        else if (response.equals("60803"))response="Expresso"; /*Senegal*/
        else if (response.equals("60802"))response="Sentel GSM"; /*Senegal*/
        else if (response.equals("60801"))response="Sonatel ALIZE"; /*Senegal*/
        else if (response.equals("22003"))response="Telekom Srbija"; /*Serbia*/
        else if (response.equals("22001"))response="Telenor"; /*Serbia*/
        else if (response.equals("22005"))response="VIP Mobile"; /*Serbia*/
        else if (response.equals("63301"))response="Cable & Wireless (Seychelles) Ltd."; /*Seychelles*/
        else if (response.equals("63302"))response="Mediatech International"; /*Seychelles*/
        else if (response.equals("63310"))response="Telecom Airtel"; /*Seychelles*/
        else if (response.equals("61905"))response="Africell"; /*Sierra Leone*/
        else if (response.equals("61904"))response="Comium"; /*Sierra Leone*/
        else if (response.equals("61903"))response="Datatel"; /*Sierra Leone*/
        else if (response.equals("61902"))response="Millicom"; /*Sierra Leone*/
        else if (response.equals("61925"))response="Mobitel"; /*Sierra Leone*/
        else if (response.equals("61901"))response="Zain"; /*Sierra Leone*/
        else if (response.equals("52512"))response="Digital Trunked Radio Network"; /*Singapore*/
        else if (response.equals("52503"))response="M1"; /*Singapore*/
        else if (response.equals("52501"))response="SingTel"; /*Singapore*/
        else if (response.equals("52502"))response="SingTel-G18"; /*Singapore*/
        else if (response.equals("52505"))response="StarHub"; /*Singapore*/
        else if (response.equals("23105"))response="Mobile Entertainment Company"; /*Slovakia*/
        else if (response.equals("23106"))response="O2"; /*Slovakia*/
        else if (response.equals("23101"))response="Orange"; /*Slovakia*/
        else if (response.equals("23102"))response="T-Mobile"; /*Slovakia*/
        else if (response.equals("23104"))response="T-Mobile"; /*Slovakia*/
        else if (response.equals("23103"))response="Unient Communications"; /*Slovakia*/
        else if (response.equals("23199"))response="eSR"; /*Slovakia*/
        else if (response.equals("29341"))response="Mobitel"; /*Slovenia*/
        else if (response.equals("29340"))response="SI.mobil - Vodafone"; /*Slovenia*/
        else if (response.equals("29364"))response="T-2"; /*Slovenia*/
        else if (response.equals("29370"))response="Tusmobil"; /*Slovenia*/
        else if (response.equals("54001"))response="BREEZE"; /*Solomon Islands*/
        else if (response.equals("5401"))response="BREEZE"; /*Solomon Islands*/
        else if (response.equals("63730"))response="Golis"; /*Somalia*/
        else if (response.equals("63725"))response="Hormuud"; /*Somalia*/
        else if (response.equals("63710"))response="Nationlink"; /*Somalia*/
        else if (response.equals("63760"))response="Nationlink Telecom"; /*Somalia*/
        else if (response.equals("63704"))response="Somafone"; /*Somalia*/
        else if (response.equals("638"))response="Telcom Mobile"; /*Somalia*/
        else if (response.equals("63701"))response="Telesom"; /*Somalia*/
        else if (response.equals("63782"))response="Telesom"; /*Somalia*/
        else if (response.equals("65530"))response="Bokamoso Consortium"; /*South Africa*/
        else if (response.equals("65521"))response="Cape Town Metropolitan Council"; /*South Africa*/
        else if (response.equals("65507"))response="Cell C"; /*South Africa*/
        else if (response.equals("65532"))response="Ilizwi Telecommunications"; /*South Africa*/
        else if (response.equals("65531"))response="Karabo Telecoms (Pty) Ltd."; /*South Africa*/
        else if (response.equals("65510"))response="MTN"; /*South Africa*/
        else if (response.equals("65513"))response="Neotel"; /*South Africa*/
        else if (response.equals("65511"))response="SAPS Gauteng"; /*South Africa*/
        else if (response.equals("65506"))response="Sentech"; /*South Africa*/
        else if (response.equals("65502"))response="Telkom Mobile / 8.ta"; /*South Africa*/
        else if (response.equals("65533"))response="Thinta Thinta Telecommunications"; /*South Africa*/
        else if (response.equals("65501"))response="Vodacom"; /*South Africa*/
        else if (response.equals("45004"))response="KT"; /*South Korea*/
        else if (response.equals("45008"))response="KTF"; /*South Korea*/
        else if (response.equals("45002"))response="KTF CDMA"; /*South Korea*/
        else if (response.equals("45006"))response="LGU+"; /*South Korea*/
        else if (response.equals("45003"))response="Power 017"; /*South Korea*/
        else if (response.equals("45005"))response="SK Telecom"; /*South Korea*/
        else if (response.equals("21423"))response="BARABLU"; /*Spain*/
        else if (response.equals("21415"))response="BT"; /*Spain*/
        else if (response.equals("21422"))response="DigiMobil"; /*Spain*/
        else if (response.equals("21424"))response="Eroski"; /*Spain*/
        else if (response.equals("21408"))response="Euskaltel"; /*Spain*/
        else if (response.equals("21420"))response="Fonyou"; /*Spain*/
        else if (response.equals("21425"))response="LycaMobile"; /*Spain*/
        else if (response.equals("21407"))response="movistar"; /*Spain*/
        else if (response.equals("21417"))response="MUbil R"; /*Spain*/
        else if (response.equals("21418"))response="ONO"; /*Spain*/
        else if (response.equals("21403"))response="Orange"; /*Spain*/
        else if (response.equals("21409"))response="Orange"; /*Spain*/
        else if (response.equals("21419"))response="Simyo"; /*Spain*/
        else if (response.equals("21416"))response="TeleCable"; /*Spain*/
        else if (response.equals("21405"))response="TME"; /*Spain*/
        else if (response.equals("21401"))response="Vodafone"; /*Spain*/
        else if (response.equals("21406"))response="Vodafone"; /*Spain*/
        else if (response.equals("21404"))response="Yoigo"; /*Spain*/
        else if (response.equals("41305"))response="Airtel"; /*Sri Lanka*/
        else if (response.equals("41302"))response="Dialog"; /*Sri Lanka*/
        else if (response.equals("41308"))response="Hutch Sri Lanka"; /*Sri Lanka*/
        else if (response.equals("41301"))response="Mobitel"; /*Sri Lanka*/
        else if (response.equals("41303"))response="Tigo"; /*Sri Lanka*/
        else if (response.equals("63401"))response="Mobitel / Mobile Telephone Company"; /*Sudan*/
        else if (response.equals("63402"))response="MTN"; /*Sudan*/
        else if (response.equals("63407"))response="Sudani One"; /*Sudan*/
        else if (response.equals("63405"))response="Vivacell"; /*Sudan*/
        else if (response.equals("74603"))response="Digicel"; /*Suriname*/
        else if (response.equals("74602"))response="Telesu"; /*Suriname*/
        else if (response.equals("74604"))response="Uniqa"; /*Suriname*/
        else if (response.equals("65310"))response="Swazi MTN"; /*Swaziland*/
        else if (response.equals("24002"))response="3 HUTCHISON"; /*Sweden*/
        else if (response.equals("24004"))response="3G Infrastructure Services"; /*Sweden*/
        else if (response.equals("24016"))response="42IT"; /*Sweden*/
        else if (response.equals("24021"))response="Banverket"; /*Sweden*/
        else if (response.equals("24012"))response="Barablu Mobile Scandinavia"; /*Sweden*/
        else if (response.equals("24026"))response="Beepsend"; /*Sweden*/
        else if (response.equals("24025"))response="DigiTelMobile"; /*Sweden*/
        else if (response.equals("24017"))response="Gotanet"; /*Sweden*/
        else if (response.equals("24000"))response="Halebop"; /*Sweden*/
        else if (response.equals("24011"))response="Lindholmen Science Park"; /*Sweden*/
        else if (response.equals("24033"))response="Mobile Arts AB"; /*Sweden*/
        else if (response.equals("24003"))response="Nordisk Mobiltelefon"; /*Sweden*/
        else if (response.equals("24010"))response="SpringMobil"; /*Sweden*/
        else if (response.equals("24024"))response="Sweden 2G"; /*Sweden*/
        else if (response.equals("24024"))response="Sweden 2G"; /*Sweden*/
        else if (response.equals("24005"))response="Sweden 3G"; /*Sweden*/
        else if (response.equals("24014"))response="TDC Mobil"; /*Sweden*/
        else if (response.equals("24007"))response="Tele2Comviq"; /*Sweden*/
        else if (response.equals("24006"))response="Telenor"; /*Sweden*/
        else if (response.equals("24008"))response="Telenor"; /*Sweden*/
        else if (response.equals("24009"))response="Telenor Mobile Sverige"; /*Sweden*/
        else if (response.equals("24001"))response="TeliaSonera Mobile Networks"; /*Sweden*/
        else if (response.equals("24013"))response="Ventelo Sverige"; /*Sweden*/
        else if (response.equals("24020"))response="Wireless Maingate"; /*Sweden*/
        else if (response.equals("24015"))response="Wireless Maingate Nordic"; /*Sweden*/
        else if (response.equals("22850"))response="3G Mobile AG"; /*Switzerland*/
        else if (response.equals("22851"))response="BebbiCell AG"; /*Switzerland*/
        else if (response.equals("22807"))response="IN&Phone"; /*Switzerland*/
        else if (response.equals("22803"))response="Orange"; /*Switzerland*/
        else if (response.equals("22806"))response="SBB AG"; /*Switzerland*/
        else if (response.equals("22802"))response="Sunrise"; /*Switzerland*/
        else if (response.equals("22801"))response="Swisscom"; /*Switzerland*/
        else if (response.equals("22808"))response="Tele2"; /*Switzerland*/
        else if (response.equals("22805"))response="Togewanet AG (Comfone)"; /*Switzerland*/
        else if (response.equals("41702"))response="MTN Syria"; /*Syria*/
        else if (response.equals("41701"))response="SyriaTel"; /*Syria*/
        else if (response.equals("46602"))response="APTG"; /*Taiwan*/
        else if (response.equals("46605"))response="APTG"; /*Taiwan*/
        else if (response.equals("46611"))response="Chunghwa LDM"; /*Taiwan*/
        else if (response.equals("46692"))response="Chungwa"; /*Taiwan*/
        else if (response.equals("46601"))response="FarEasTone"; /*Taiwan*/
        else if (response.equals("46688"))response="KG Telecom"; /*Taiwan*/
        else if (response.equals("46693"))response="MobiTai"; /*Taiwan*/
        else if (response.equals("46697"))response="Taiwan Mobile"; /*Taiwan*/
        else if (response.equals("46699"))response="TransAsia"; /*Taiwan*/
        else if (response.equals("46606"))response="Tuntex"; /*Taiwan*/
        else if (response.equals("46689"))response="VIBO"; /*Taiwan*/
        else if (response.equals("43604"))response="Babilon-M"; /*Tajikistan*/
        else if (response.equals("43605"))response="CTJTHSC Tajik-tel"; /*Tajikistan*/
        else if (response.equals("43602"))response="Indigo"; /*Tajikistan*/
        else if (response.equals("43603"))response="MLT"; /*Tajikistan*/
        else if (response.equals("43601"))response="Somoncom"; /*Tajikistan*/
        else if (response.equals("43612"))response="Tcell"; /*Tajikistan*/
        else if (response.equals("64009"))response="Hits"; /*Tanzania*/
        else if (response.equals("64002"))response="Mobitel"; /*Tanzania*/
        else if (response.equals("64006"))response="Sasatel"; /*Tanzania*/
        else if (response.equals("64011"))response="SmileCom"; /*Tanzania*/
        else if (response.equals("64001"))response="Tritel"; /*Tanzania*/
        else if (response.equals("64007"))response="TTCL Mobile"; /*Tanzania*/
        else if (response.equals("64008"))response="TTCL Mobile"; /*Tanzania*/
        else if (response.equals("64004"))response="Vodacom"; /*Tanzania*/
        else if (response.equals("64005"))response="Zain"; /*Tanzania*/
        else if (response.equals("64003"))response="Zantel"; /*Tanzania*/
        else if (response.equals("52015"))response="ACT Mobile"; /*Thailand*/
        else if (response.equals("52001"))response="Advanced Info Service"; /*Thailand*/
        else if (response.equals("52023"))response="Advanced Info Service"; /*Thailand*/
        else if (response.equals("52000"))response="CAT CDMA"; /*Thailand*/
        else if (response.equals("52002"))response="CAT CDMA"; /*Thailand*/
        else if (response.equals("52018"))response="DTAC"; /*Thailand*/
        else if (response.equals("52099"))response="True Move"; /*Thailand*/
        else if (response.equals("52010"))response="WCS IQ"; /*Thailand*/
        else if (response.equals("61503"))response="Moov"; /*Togo*/
        else if (response.equals("61505"))response="Telecel"; /*Togo*/
        else if (response.equals("61501"))response="Togo Cell"; /*Togo*/
        else if (response.equals("53988"))response="Digicel"; /*Tonga*/
        else if (response.equals("53943"))response="Shoreline Communication"; /*Tonga*/
        else if (response.equals("53901"))response="Tonga Communications Corporation"; /*Tonga*/
        else if (response.equals("37412"))response="bmobile"; /*Trinidad and Tobago*/
        else if (response.equals("37413"))response="Digicel"; /*Trinidad and Tobago*/
        else if (response.equals("374130"))response="Digicel"; /*Trinidad and Tobago*/
        else if (response.equals("60501"))response="Orange"; /*Tunisia*/
        else if (response.equals("60502"))response="Tunicell"; /*Tunisia*/
        else if (response.equals("60503"))response="Tunisiana"; /*Tunisia*/
        else if (response.equals("28603"))response="Avea"; /*Turkey*/
        else if (response.equals("28604"))response="Aycell"; /*Turkey*/
        else if (response.equals("28601"))response="Turkcell"; /*Turkey*/
        else if (response.equals("28602"))response="Vodafone"; /*Turkey*/
        else if (response.equals("43801"))response="MTS"; /*Turkmenistan*/
        else if (response.equals("43802"))response="TM-Cell"; /*Turkmenistan*/
        else if (response.equals("55301"))response="TTC"; /*Tuvalu*/
        else if (response.equals("64110"))response="MTN"; /*Uganda*/
        else if (response.equals("64114"))response="Orange"; /*Uganda*/
        else if (response.equals("64111"))response="Uganda Telecom Ltd."; /*Uganda*/
        else if (response.equals("64122"))response="Warid Telecom"; /*Uganda*/
        else if (response.equals("64101"))response="Zain"; /*Uganda*/
        else if (response.equals("25502"))response="Beeline"; /*Ukraine*/
        else if (response.equals("25523"))response="CDMA Ukraine"; /*Ukraine*/
        else if (response.equals("25505"))response="Golden Telecom"; /*Ukraine*/
        else if (response.equals("25504"))response="IT"; /*Ukraine*/
        else if (response.equals("25503"))response="Kyivstar"; /*Ukraine*/
        else if (response.equals("25506"))response="life:)"; /*Ukraine*/
        else if (response.equals("25501"))response="MTS"; /*Ukraine*/
        else if (response.equals("25521"))response="PEOPLEnet"; /*Ukraine*/
        else if (response.equals("25507"))response="Utel"; /*Ukraine*/
        else if (response.equals("42403"))response="du"; /*United Arab Emirates*/
        else if (response.equals("42402"))response="Etisalat"; /*United Arab Emirates*/
        else if (response.equals("23420"))response="3 Hutchison"; /*United Kingdom*/
        else if (response.equals("23400"))response="BT"; /*United Kingdom*/
        else if (response.equals("23455"))response="Cable & Wireless / Sure Mobile (Isle of Man)"; /*United Kingdom*/
        else if (response.equals("23418"))response="Cloud9"; /*United Kingdom*/
        else if (response.equals("23403"))response="Jersey Telenet"; /*United Kingdom*/
        else if (response.equals("23450"))response="JT-Wave"; /*United Kingdom*/
        else if (response.equals("23458"))response="Manx Telecom"; /*United Kingdom*/
        else if (response.equals("23401"))response="MCom"; /*United Kingdom*/
        else if (response.equals("23402"))response="O2"; /*United Kingdom*/
        else if (response.equals("23410"))response="O2"; /*United Kingdom*/
        else if (response.equals("23411"))response="O2"; /*United Kingdom*/
        else if (response.equals("23433"))response="Orange"; /*United Kingdom*/
        else if (response.equals("23434"))response="Orange"; /*United Kingdom*/
        else if (response.equals("23412"))response="Railtrack"; /*United Kingdom*/
        else if (response.equals("23422"))response="Routo Telecom"; /*United Kingdom*/
        else if (response.equals("23409"))response="Sure Mobile"; /*United Kingdom*/
        else if (response.equals("23430"))response="T-Mobile"; /*United Kingdom*/
        else if (response.equals("23419"))response="Telaware"; /*United Kingdom*/
        else if (response.equals("234100"))response="Tesco Mobile"; /*United Kingdom*/
        else if (response.equals("23477"))response="Unknown"; /*United Kingdom*/
        else if (response.equals("23431"))response="Virgin"; /*United Kingdom*/
        else if (response.equals("23432"))response="Virgin"; /*United Kingdom*/
        else if (response.equals("23415"))response="Vodafone"; /*United Kingdom*/
        else if (response.equals("310880"))response="Advantage"; /*United States*/
        else if (response.equals("310850"))response="Aeris"; /*United States*/
        else if (response.equals("310640"))response="Airadigm"; /*United States*/
        else if (response.equals("310780"))response="Airlink PCS"; /*United States*/
        else if (response.equals("310034"))response="Airpeak"; /*United States*/
        else if (response.equals("310510"))response="Airtel"; /*United States*/
        else if (response.equals("310430"))response="Alaska Digitel"; /*United States*/
        else if (response.equals("310500"))response="Alltel"; /*United States*/
        else if (response.equals("310590"))response="Alltel"; /*United States*/
        else if (response.equals("310630"))response="AmeriLink PCS"; /*United States*/
        else if (response.equals("310038"))response="AT&T"; /*United States*/
        else if (response.equals("310090"))response="AT&T"; /*United States*/
        else if (response.equals("310150"))response="AT&T"; /*United States*/
        else if (response.equals("310170"))response="AT&T"; /*United States*/
        else if (response.equals("310410"))response="AT&T"; /*United States*/
        else if (response.equals("310560"))response="AT&T"; /*United States*/
        else if (response.equals("310680"))response="AT&T"; /*United States*/
        else if (response.equals("310380"))response="AT&T Mobility"; /*United States*/
        else if (response.equals("310980"))response="AT&T Mobility"; /*United States*/
        else if (response.equals("310990"))response="AT&T Mobility"; /*United States*/
        else if (response.equals("310830"))response="Caprock"; /*United States*/
        else if (response.equals("310350"))response="Carolina Phone"; /*United States*/
        else if (response.equals("311130"))response="Cell One Amarillo"; /*United States*/
        else if (response.equals("310320"))response="Cellular One"; /*United States*/
        else if (response.equals("310440"))response="Cellular One"; /*United States*/
        else if (response.equals("310390"))response="Cellular One of East Texas"; /*United States*/
        else if (response.equals("311190"))response="Cellular Properties"; /*United States*/
        else if (response.equals("310030"))response="Centennial"; /*United States*/
        else if (response.equals("311010"))response="Chariton Valley"; /*United States*/
        else if (response.equals("310570"))response="Chinook Wireless"; /*United States*/
        else if (response.equals("310480"))response="Choice Phone"; /*United States*/
        else if (response.equals("311120"))response="Choice Phone"; /*United States*/
        else if (response.equals("310420"))response="Cincinnati Bell"; /*United States*/
        else if (response.equals("311180"))response="Cingular Wireless"; /*United States*/
        else if (response.equals("310620"))response="Coleman County Telecom"; /*United States*/
        else if (response.equals("311040"))response="Commnet Wireless"; /*United States*/
        else if (response.equals("310040"))response="Concho"; /*United States*/
        else if (response.equals("310690"))response="Conestoga"; /*United States*/
        else if (response.equals("310060"))response="Consolidated Telcom"; /*United States*/
        else if (response.equals("310740"))response="Convey"; /*United States*/
        else if (response.equals("310080"))response="Corr"; /*United States*/
        else if (response.equals("310016"))response="Cricket Communications"; /*United States*/
        else if (response.equals("310940"))response="Digital Cellular"; /*United States*/
        else if (response.equals("310190"))response="Dutch Harbor"; /*United States*/
        else if (response.equals("311070"))response="Easterbrooke"; /*United States*/
        else if (response.equals("311160"))response="Endless Mountains Wireless"; /*United States*/
        else if (response.equals("310610"))response="Epic Touch"; /*United States*/
        else if (response.equals("311060"))response="Farmers Cellular"; /*United States*/
        else if (response.equals("311210"))response="Farmers Cellular"; /*United States*/
        else if (response.equals("310311"))response="Farmers Wireless"; /*United States*/
        else if (response.equals("310910"))response="First Cellular"; /*United States*/
        else if (response.equals("310300"))response="Get Mobile Inc"; /*United States*/
        else if (response.equals("310970"))response="Globalstar"; /*United States*/
        else if (response.equals("311100"))response="High Plains Wireless"; /*United States*/
        else if (response.equals("311110"))response="High Plains Wireless"; /*United States*/
        else if (response.equals("310070"))response="Highland Cellular"; /*United States*/
        else if (response.equals("310400"))response="i CAN_GSM"; /*United States*/
        else if (response.equals("310770"))response="i wireless"; /*United States*/
        else if (response.equals("311030"))response="Indigo Wireless"; /*United States*/
        else if (response.equals("310650"))response="Jasper"; /*United States*/
        else if (response.equals("311090"))response="Long Lines Wireless"; /*United States*/
        else if (response.equals("310010"))response="MCI"; /*United States*/
        else if (response.equals("310000"))response="Mid-Tex Cellular"; /*United States*/
        else if (response.equals("311000"))response="Mid-Tex Cellular"; /*United States*/
        else if (response.equals("311020"))response="Missouri RSA 5 Partnership"; /*United States*/
        else if (response.equals("310013"))response="MobileTel"; /*United States*/
        else if (response.equals("316010"))response="Nextel"; /*United States*/
        else if (response.equals("310017"))response="North Sight Communications Inc."; /*United States*/
        else if (response.equals("310670"))response="Northstar"; /*United States*/
        else if (response.equals("310540"))response="Oklahoma Western"; /*United States*/
        else if (response.equals("310870"))response="PACE"; /*United States*/
        else if (response.equals("310760"))response="Panhandle"; /*United States*/
        else if (response.equals("311170"))response="PetroCom"; /*United States*/
        else if (response.equals("311080"))response="Pine Cellular"; /*United States*/
        else if (response.equals("310790"))response="PinPoint"; /*United States*/
        else if (response.equals("310100"))response="Plateau Wireless"; /*United States*/
        else if (response.equals("310960"))response="Plateau Wireless"; /*United States*/
        else if (response.equals("310110"))response="PTI Pacifica"; /*United States*/
        else if (response.equals("310730"))response="SeaMobile"; /*United States*/
        else if (response.equals("310046"))response="SIMMETRY"; /*United States*/
        else if (response.equals("310460"))response="Simmetry"; /*United States*/
        else if (response.equals("316011"))response="Southern Communications Services"; /*United States*/
        else if (response.equals("310120"))response="Sprint"; /*United States*/
        else if (response.equals("311140"))response="Sprocket"; /*United States*/
        else if (response.equals("310490"))response="SunCom"; /*United States*/
        else if (response.equals("310026"))response="T-Mobile"; /*United States*/
        else if (response.equals("310160"))response="T-Mobile"; /*United States*/
        else if (response.equals("310200"))response="T-Mobile"; /*United States*/
        else if (response.equals("310210"))response="T-Mobile"; /*United States*/
        else if (response.equals("310220"))response="T-Mobile"; /*United States*/
        else if (response.equals("310230"))response="T-Mobile"; /*United States*/
        else if (response.equals("310240"))response="T-Mobile"; /*United States*/
        else if (response.equals("310250"))response="T-Mobile"; /*United States*/
        else if (response.equals("310260"))response="T-Mobile"; /*United States*/
        else if (response.equals("310270"))response="T-Mobile"; /*United States*/
        else if (response.equals("310280"))response="T-Mobile"; /*United States*/
        else if (response.equals("310290"))response="T-Mobile"; /*United States*/
        else if (response.equals("310310"))response="T-Mobile"; /*United States*/
        else if (response.equals("310330"))response="T-Mobile"; /*United States*/
        else if (response.equals("310580"))response="T-Mobile"; /*United States*/
        else if (response.equals("310660"))response="T-Mobile"; /*United States*/
        else if (response.equals("310800"))response="T-Mobile"; /*United States*/
        else if (response.equals("310900"))response="Taylor"; /*United States*/
        else if (response.equals("310014"))response="Testing"; /*United States*/
        else if (response.equals("310020"))response="Union Telephone Company"; /*United States*/
        else if (response.equals("310520"))response="VeriSign"; /*United States*/
        else if (response.equals("310004"))response="Verizon"; /*United States*/
        else if (response.equals("310012"))response="Verizon"; /*United States*/
        else if (response.equals("310450"))response="Viaero"; /*United States*/
        else if (response.equals("310180"))response="West Central"; /*United States*/
        else if (response.equals("310530"))response="West Virginia Wireless"; /*United States*/
        else if (response.equals("310340"))response="Westlink"; /*United States*/
        else if (response.equals("311050"))response="Wikes Cellular"; /*United States*/
        else if (response.equals("311150"))response="Wilkes Cellular"; /*United States*/
        else if (response.equals("310890"))response="Wireless Alliance"; /*United States*/
        else if (response.equals("310950"))response="XIT Wireless"; /*United States*/
        else if (response.equals("74800"))response="Ancel"; /*Uruguay*/
        else if (response.equals("74801"))response="Ancel"; /*Uruguay*/
        else if (response.equals("74810"))response="Claro"; /*Uruguay*/
        else if (response.equals("74807"))response="Movistar"; /*Uruguay*/
        else if (response.equals("43404"))response="Beeline"; /*Uzbekistan*/
        else if (response.equals("43401"))response="Buztel"; /*Uzbekistan*/
        else if (response.equals("43407"))response="MTS"; /*Uzbekistan*/
        else if (response.equals("43406"))response="Perfectum Mobile"; /*Uzbekistan*/
        else if (response.equals("43405"))response="Ucell"; /*Uzbekistan*/
        else if (response.equals("43402"))response="Uzmacom"; /*Uzbekistan*/
        else if (response.equals("54101"))response="SMILE"; /*Vanuatu*/
        else if (response.equals("73401"))response="Digitel"; /*Venezuela*/
        else if (response.equals("73402"))response="Digitel"; /*Venezuela*/
        else if (response.equals("73403"))response="Digitel"; /*Venezuela*/
        else if (response.equals("73406"))response="Movilnet"; /*Venezuela*/
        else if (response.equals("73404"))response="movistar"; /*Venezuela*/
        else if (response.equals("45208"))response="3G EVNTelecom"; /*Vietnam*/
        else if (response.equals("45207"))response="Beeline VN"; /*Vietnam*/
        else if (response.equals("45206"))response="E-Mobile"; /*Vietnam*/
        else if (response.equals("45205"))response="HT Mobile"; /*Vietnam*/
        else if (response.equals("45201"))response="MobiFone"; /*Vietnam*/
        else if (response.equals("45203"))response="S-Fone"; /*Vietnam*/
        else if (response.equals("45204"))response="Viettel Mobile"; /*Vietnam*/
        else if (response.equals("45202"))response="Vinaphone"; /*Vietnam*/
        else if (response.equals("376350"))response="C&W"; /*Wyspy Turks i Caicos*/
        else if (response.equals("33805"))response="Digicel"; /*Wyspy Turks i Caicos*/
        else if (response.equals("376352"))response="Islandcom"; /*Wyspy Turks i Caicos*/
        else if (response.equals("42104"))response="HiTS-UNITEL"; /*Yemen*/
        else if (response.equals("42102"))response="MTN"; /*Yemen*/
        else if (response.equals("42101"))response="SabaFon"; /*Yemen*/
        else if (response.equals("42103"))response="Yemen Mobile"; /*Yemen*/
        else if (response.equals("64502"))response="MTN"; /*Zambia*/
        else if (response.equals("64501"))response="Zain"; /*Zambia*/
        else if (response.equals("64503"))response="ZAMTEL"; /*Zambia*/
        else if (response.equals("64804"))response="Econet"; /*Zimbabwe*/
        else if (response.equals("64801"))response="Net*One"; /*Zimbabwe*/
        else if (response.equals("64803"))response="Telecel"; /*Zimbabwe*/
        return response;
    }
}
=======
/*
 * Copyright (C) 2013 The CyanogenMod Project
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

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Operators{

    private static Map<String, String> operators = null;

    // Initialize list of Operator codes
    private static void initList() {
        // Setting capacity to 1489 and load factor to 1.
        // Rehashes won't happen during initialization.
        // Change the initial capacity if more carriers are added.
        Map<String, String> init = new HashMap<String, String>(1489,1);
        init.put("41201","AWCC"); /*Afghanistan*/
        init.put("41240","Areeba"); /*Afghanistan*/
        init.put("41250","Etisalat"); /*Afghanistan*/
        init.put("41220","Roshan"); /*Afghanistan*/
        init.put("27601","AMC"); /*Albania*/
        init.put("27603","Eagle Mobile"); /*Albania*/
        init.put("27604","Plus Communication"); /*Albania*/
        init.put("27602","Vodafone"); /*Albania*/
        init.put("60302","Djezzy"); /*Algeria*/
        init.put("60301","Mobilis"); /*Algeria*/
        init.put("60303","Nedjma"); /*Algeria*/
        init.put("54411","Bluesky"); /*American Samoa*/
        init.put("21303","Mobiland"); /*Andorra*/
        init.put("63104","MOVICEL"); /*Angola*/
        init.put("63102","UNITEL"); /*Angola*/
        init.put("365840","Cable & Wireless"); /*Anguilla (United Kingdom)*/
        init.put("365010","Weblinks Limited"); /*Anguilla (United Kingdom)*/
        init.put("344030","APUA"); /*Antigua and Barbuda*/
        init.put("344920","bmobile"); /*Antigua and Barbuda*/
        init.put("344930","Digicel"); /*Antigua and Barbuda*/
        init.put("722310","Claro"); /*Argentina*/
        init.put("722320","Claro"); /*Argentina*/
        init.put("722330","Claro"); /*Argentina*/
        init.put("722350","Hutchinson (PORT HABLE)"); /*Argentina*/
        init.put("722010","Movistar"); /*Argentina*/
        init.put("722070","Movistar"); /*Argentina*/
        init.put("722020","Nextel"); /*Argentina*/
        init.put("72234","Personal"); /*Argentina*/
        init.put("722341","Telecom Personal SA"); /*Argentina*/
        init.put("72236","Telecom Personal SA"); /*Argentina*/
        init.put("28301","Beeline"); /*Armenia*/
        init.put("28310","Orange"); /*Armenia*/
        init.put("28305","VivaCell-MTS"); /*Armenia*/
        init.put("36302","Digicel"); /*Aruba (Netherlands)*/
        init.put("36320","Digicell"); /*Aruba (Netherlands)*/
        init.put("36301","SETAR"); /*Aruba (Netherlands)*/
        init.put("50506","3"); /*Australia*/
        init.put("50512","3"); /*Australia*/
        init.put("50515","3GIS"); /*Australia*/
        init.put("50514","AAPT"); /*Australia*/
        init.put("50524","Advanced Communications Technologies"); /*Australia*/
        init.put("50509","Airnet"); /*Australia*/
        init.put("50538","Crazy John's"); /*Australia*/
        init.put("50504","Department of Defence"); /*Australia*/
        init.put("50588","Localstar"); /*Australia*/
        init.put("50510","Norfolk Telecom"); /*Australia*/
        init.put("50508","One. Tel"); /*Australia*/
        init.put("50599","One. Tel"); /*Australia*/
        init.put("50502","OPTUS / Virgin Mobile"); /*Australia*/
        init.put("50505","Ozitel"); /*Australia*/
        init.put("50513","Railcorp"); /*Australia*/
        init.put("50521","SOUL"); /*Australia*/
        init.put("50501","Telstra"); /*Australia*/
        init.put("50511","Telstra"); /*Australia*/
        init.put("50571","Telstra"); /*Australia*/
        init.put("50572","Telstra"); /*Australia*/
        init.put("50516","Victorian Rail Track"); /*Australia*/
        init.put("50503","Vodafone"); /*Australia*/
        init.put("50507","Vodafone"); /*Australia*/
        init.put("50590","YES OPTUS"); /*Australia*/
        init.put("23210","3"); /*Austria*/
        init.put("23214","3"); /*Austria*/
        init.put("23201","A1"); /*Austria*/
        init.put("23209","A1"); /*Austria*/
        init.put("23215","Barablu"); /*Austria*/
        init.put("23211","bob"); /*Austria*/
        init.put("23291","GSM-R A"); /*Austria*/
        init.put("23205","Orange"); /*Austria*/
        init.put("23203","T-Mobile"); /*Austria*/
        init.put("23207","T-Mobile"); /*Austria*/
        init.put("23212","yesss"); /*Austria*/
        init.put("40001","Azercell"); /*Azerbaijan*/
        init.put("40002","Bakcell"); /*Azerbaijan*/
        init.put("40003","FONEX"); /*Azerbaijan*/
        init.put("40004","Nar Mobile"); /*Azerbaijan*/
        init.put("364390","BaTelCo"); /*Bahamas*/
        init.put("42601","Batelco"); /*Bahrain*/
        init.put("42602","MTC-VFBH"); /*Bahrain*/
        init.put("42604","VIVA"); /*Bahrain*/
        init.put("47002","Aktel"); /*Bangladesh*/
        init.put("47003","Banglalink"); /*Bangladesh*/
        init.put("47005","Citycell"); /*Bangladesh*/
        init.put("47006","Citycell"); /*Bangladesh*/
        init.put("47001","Grameenphone"); /*Bangladesh*/
        init.put("47004","TeleTalk"); /*Bangladesh*/
        init.put("47007","Warid"); /*Bangladesh*/
        init.put("342600","bmobile"); /*Barbados*/
        init.put("342750","Digicel"); /*Barbados*/
        init.put("342820","Sunbeach Communications"); /*Barbados*/
        init.put("257501","BelCel JV"); /*Belarus*/
        init.put("25703","DIALLOG"); /*Belarus*/
        init.put("25704","life:)"); /*Belarus*/
        init.put("25702","MTS"); /*Belarus*/
        init.put("25701","Velcom"); /*Belarus*/
        init.put("20620","BASE"); /*Belgium*/
        init.put("20610","Mobistar"); /*Belgium*/
        init.put("20601","Proximus"); /*Belgium*/
        init.put("20605","Telenet"); /*Belgium*/
        init.put("70267","Belize Telemedia"); /*Belize*/
        init.put("70268","International Telecommunications Ltd."); /*Belize*/
        init.put("70299","Smart"); /*Belize*/
        init.put("61603","Areeba"); /*Benin*/
        init.put("61600","BBCOM"); /*Benin*/
        init.put("61604","BBCOM"); /*Benin*/
        init.put("61605","Glo"); /*Benin*/
        init.put("61601","Libercom"); /*Benin*/
        init.put("61602","Telecel"); /*Benin*/
        init.put("31038","Digicel"); /*Bermudas*/
        init.put("35001","Digicel Bermuda"); /*Bermudas*/
        init.put("35002","Mobility"); /*Bermudas*/
        init.put("40211","B-Mobile"); /*Bhutan*/
        init.put("40277","TashiCell"); /*Bhutan*/
        init.put("73602","Entel"); /*Bolivia*/
        init.put("73601","Nuevatel"); /*Bolivia*/
        init.put("73603","Tigo"); /*Bolivia*/
        init.put("21890","BH Mobile"); /*Bosnia and Herzegovina*/
        init.put("21803","ERONET"); /*Bosnia and Herzegovina*/
        init.put("21805","m:tel"); /*Bosnia and Herzegovina*/
        init.put("65204","BTC Mobile"); /*Botswana*/
        init.put("65201","Mascom"); /*Botswana*/
        init.put("65202","Orange"); /*Botswana*/
        init.put("72437","aiou"); /*Brazil*/
        init.put("72424","Amazonia Celular"); /*Brazil*/
        init.put("72416","Brasil Telecom"); /*Brazil*/
        init.put("72405","Claro"); /*Brazil*/
        init.put("72432","CTBC Cellular"); /*Brazil*/
        init.put("72433","CTBC Cellular"); /*Brazil*/
        init.put("72434","CTBC Cellular"); /*Brazil*/
        init.put("72407","CTBC Celular"); /*Brazil*/
        init.put("72400","Nextel"); /*Brazil*/
        init.put("72439","Nextel"); /*Brazil*/
        init.put("72415","Sercomtel"); /*Brazil*/
        init.put("72402","TIM"); /*Brazil*/
        init.put("72403","TIM"); /*Brazil*/
        init.put("72404","TIM"); /*Brazil*/
        init.put("72408","TIM"); /*Brazil*/
        init.put("72431","TNL PCS"); /*Brazil*/
        init.put("72406","Vivo"); /*Brazil*/
        init.put("72410","Vivo"); /*Brazil*/
        init.put("72411","Vivo"); /*Brazil*/
        init.put("72423","Vivo"); /*Brazil*/
        init.put("348170","Cable & Wireless"); /*British Virgin Islands (United Kingdom)*/
        init.put("348570","Caribbean Cellular Telephone"); /*British Virgin Islands (United Kingdom)*/
        init.put("348770","Digicel"); /*British Virgin Islands (United Kingdom)*/
        init.put("52802","B-Mobile"); /*Brunei*/
        init.put("52811","DTSCom"); /*Brunei*/
        init.put("52801","Jabatan Telekom"); /*Brunei*/
        init.put("28405","GLOBUL"); /*Bulgaria*/
        init.put("28401","M-Tel"); /*Bulgaria*/
        init.put("28404","Undisclosed"); /*Bulgaria*/
        init.put("28403","Vivatel"); /*Bulgaria*/
        init.put("61301","Onatel"); /*Burkina Faso*/
        init.put("61303","Telecel Faso"); /*Burkina Faso*/
        init.put("61302","Zain"); /*Burkina Faso*/
        init.put("64202","Africell"); /*Burundi*/
        init.put("64208","HiTs Telecom"); /*Burundi*/
        init.put("64207","Smart Mobile"); /*Burundi*/
        init.put("64201","Spacetel"); /*Burundi*/
        init.put("64203","Telecel"); /*Burundi*/
        init.put("64282","U-COM Burundi"); /*Burundi*/
        init.put("45609","Beeline"); /*Cambodia*/
        init.put("45618","Camshin / Shinawatra"); /*Cambodia*/
        init.put("45611","Excell"); /*Cambodia*/
        init.put("45602","hello"); /*Cambodia*/
        init.put("45608","Metfone"); /*Cambodia*/
        init.put("45601","Mobitel"); /*Cambodia*/
        init.put("45604","qb"); /*Cambodia*/
        init.put("45603","S Telecom"); /*Cambodia*/
        init.put("45606","Smart Mobile"); /*Cambodia*/
        init.put("45605","Star-Cell"); /*Cambodia*/
        init.put("62401","MTN Cameroon"); /*Cameroon*/
        init.put("62402","Orange"); /*Cameroon*/
        init.put("302290","Airtel Wireless"); /*Canada*/
        init.put("302652","BC Tel Mobility"); /*Canada*/
        init.put("302610","Bell"); /*Canada*/
        init.put("302640","Bell"); /*Canada*/
        init.put("302880","Bell / Telus / SaskTel"); /*Canada*/
        init.put("302651","Bell Mobility"); /*Canada*/
        init.put("302380","DMTS"); /*Canada*/
        init.put("302370","Fido"); /*Canada*/
        init.put("302350","FIRST"); /*Canada*/
        init.put("302710","Globalstar"); /*Canada*/
        init.put("302620","ICE Wireless"); /*Canada*/
        init.put("302701","MB Tel Mobility"); /*Canada*/
        init.put("302320","Mobilicity"); /*Canada*/
        init.put("302702","MT&T Mobility"); /*Canada*/
        init.put("302660","MTS"); /*Canada*/
        init.put("302655","MTS Mobility"); /*Canada*/
        init.put("302703","New Tel Mobility"); /*Canada*/
        init.put("302720","Rogers Wireless"); /*Canada*/
        init.put("302654","Sask Tel Mobility"); /*Canada*/
        init.put("302680","SaskTel"); /*Canada*/
        init.put("302780","SaskTel"); /*Canada*/
        init.put("302656","Tbay Mobility"); /*Canada*/
        init.put("302220","Telus"); /*Canada*/
        init.put("302221","Telus"); /*Canada*/
        init.put("302657","Telus (Quebec) Mobility"); /*Canada*/
        init.put("302360","Telus Mobility"); /*Canada*/
        init.put("302361","Telus Mobility"); /*Canada*/
        init.put("302653","Telus Mobility"); /*Canada*/
        init.put("302500","Videotron"); /*Canada*/
        init.put("302510","Videotron"); /*Canada*/
        init.put("302490","WIND Mobile"); /*Canada*/
        init.put("62501","CVMOVEL"); /*Cape Verde*/
        init.put("62502","T+"); /*Cape Verde*/
        init.put("346140","Cable & Wireless"); /*Cayman Islands (United Kingdom)*/
        init.put("346050","Digicel"); /*Cayman Islands (United Kingdom)*/
        init.put("62301","CTP"); /*Central African Republic*/
        init.put("62304","Nationlink"); /*Central African Republic*/
        init.put("62303","Orange"); /*Central African Republic*/
        init.put("62302","TC"); /*Central African Republic*/
        init.put("73003","Claro"); /*Chile*/
        init.put("73001","Entel"); /*Chile*/
        init.put("73010","Entel"); /*Chile*/
        init.put("73002","movistar"); /*Chile*/
        init.put("73004","Nextel"); /*Chile*/
        init.put("73008","VTR MOvil"); /*Chile*/
        init.put("73099","Will"); /*Chile*/
        init.put("46006","(unknown)"); /*China*/
        init.put("46000","China Mobile"); /*China*/
        init.put("46002","China Mobile"); /*China*/
        init.put("46007","China Mobile"); /*China*/
        init.put("46003","China Telecom"); /*China*/
        init.put("46005","China Telecom"); /*China*/
        init.put("46020","China Tietong"); /*China*/
        init.put("46001","China Unicom"); /*China*/
        init.put("732001","Colombia Telecomunicaciones S.A. - Telecom"); /*Colombia*/
        init.put("732101","Comcel"); /*Colombia*/
        init.put("732002","Edatel"); /*Colombia*/
        init.put("732102","movistar"); /*Colombia*/
        init.put("732123","movistar"); /*Colombia*/
        init.put("732103","Tigo"); /*Colombia*/
        init.put("732111","Tigo"); /*Colombia*/
        init.put("65401","HURI - SNPT"); /*Comoros*/
        init.put("54801","Telecom Cook"); /*Cook Islands*/
        init.put("71201","ICE"); /*Costa Rica*/
        init.put("71202","ICE"); /*Costa Rica*/
        init.put("71203","ICE"); /*Costa Rica*/
        init.put("71204","movistar"); /*Costa Rica*/
        init.put("61201","Cora de Comstar"); /*Cote d'Ivoire*/
        init.put("61204","KoZ"); /*Cote d'Ivoire*/
        init.put("61202","Moov"); /*Cote d'Ivoire*/
        init.put("61205","MTN"); /*Cote d'Ivoire*/
        init.put("61203","Orange"); /*Cote d'Ivoire*/
        init.put("61206","ORICEL"); /*Cote d'Ivoire*/
        init.put("21901","T-Mobile"); /*Croatia*/
        init.put("21902","Tele2"); /*Croatia*/
        init.put("21910","VIPnet"); /*Croatia*/
        init.put("36801","ETECSA"); /*Cuba*/
        init.put("28001","Cytamobile-Vodafone"); /*Cyprus*/
        init.put("28010","MTN"); /*Cyprus*/
        init.put("62204","Salam"); /*Czad*/
        init.put("62202","TAWALI"); /*Czad*/
        init.put("62203","TIGO - Millicom"); /*Czad*/
        init.put("62201","Zain"); /*Czad*/
        init.put("23002","EUROTEL PRAHA"); /*Czech Republic*/
        init.put("23003","OSKAR"); /*Czech Republic*/
        init.put("23006","OSNO TELECOMUNICATION, s.r.o."); /*Czech Republic*/
        init.put("23098","SeDC s.o."); /*Czech Republic*/
        init.put("23001","T-Mobile"); /*Czech Republic*/
        init.put("23005","TRAVEL TELEKOMMUNIKATION, s.r.o."); /*Czech Republic*/
        init.put("23004","U:fon"); /*Czech Republic*/
        init.put("23099","Vodafone Czech Republic a.s., R&D Centre at FEE, CTU"); /*Czech Republic*/
        init.put("63086","CCT"); /*Democratic Republic of Congo*/
        init.put("63004","Cellco"); /*Democratic Republic of Congo*/
        init.put("63010","Libertis Telecom"); /*Democratic Republic of Congo*/
        init.put("63089","SAIT Telecom"); /*Democratic Republic of Congo*/
        init.put("63005","Supercell"); /*Democratic Republic of Congo*/
        init.put("63001","Vodacom"); /*Democratic Republic of Congo*/
        init.put("63002","Zain"); /*Democratic Republic of Congo*/
        init.put("23806","3"); /*Denmark*/
        init.put("23805","ApS KBUS"); /*Denmark*/
        init.put("23807","Barablu Mobile Ltd."); /*Denmark*/
        init.put("23809","Dansk Beredskabskommunikation A/S"); /*Denmark*/
        init.put("23811","Dansk Beredskabskommunikation A/S"); /*Denmark*/
        init.put("23840","Ericsson Danmark A/S"); /*Denmark*/
        init.put("23812","Lycamobile Denmark Ltd"); /*Denmark*/
        init.put("23803","MIGway A/S"); /*Denmark*/
        init.put("23877","Sonofon"); /*Denmark*/
        init.put("23801","TDC"); /*Denmark*/
        init.put("23810","TDC"); /*Denmark*/
        init.put("23802","Telenor"); /*Denmark*/
        init.put("23820","Telia"); /*Denmark*/
        init.put("23830","Telia"); /*Denmark*/
        init.put("63801","Evatis"); /*Djibouti*/
        init.put("366110","Cable & Wireless"); /*Dominica*/
        init.put("366020","Digicel"); /*Dominica*/
        init.put("37002","Claro"); /*Dominican Republic*/
        init.put("37001","Orange"); /*Dominican Republic*/
        init.put("37003","Tricom S.A."); /*Dominican Republic*/
        init.put("37004","ViVa"); /*Dominican Republic*/
        init.put("51402","Timor Telecom"); /*East Timor*/
        init.put("74002","Alegro"); /*Ecuador*/
        init.put("74000","Movistar"); /*Ecuador*/
        init.put("74001","Porta"); /*Ecuador*/
        init.put("60203","Etisalat"); /*Egypt*/
        init.put("60201","Mobinil"); /*Egypt*/
        init.put("60202","Vodafone"); /*Egypt*/
        init.put("70610","Claro"); /*El Salvador*/
        init.put("70611","Claro"); /*El Salvador*/
        init.put("70601","CTE Telecom Personal"); /*El Salvador*/
        init.put("70602","digicel"); /*El Salvador*/
        init.put("70604","movistar"); /*El Salvador*/
        init.put("70603","Telemovil EL Salvador"); /*El Salvador*/
        init.put("62703","Hits GQ"); /*Equatorial Guinea*/
        init.put("62701","Orange GQ"); /*Equatorial Guinea*/
        init.put("65701","Eritel"); /*Eritrea*/
        init.put("24805","AS Bravocom Mobiil"); /*Estonia*/
        init.put("24802","Elisa"); /*Estonia*/
        init.put("24801","EMT"); /*Estonia*/
        init.put("24804","OY Top Connect"); /*Estonia*/
        init.put("24806","OY ViaTel"); /*Estonia*/
        init.put("24803","Tele 2"); /*Estonia*/
        init.put("63601","ETMTN"); /*Ethiopia*/
        init.put("28801","Faroese Telecom"); /*Faroe Islands (Denmark)*/
        init.put("28802","Vodafone"); /*Faroe Islands (Denmark)*/
        init.put("54202","Digicel"); /*Fiji*/
        init.put("54201","Vodafone"); /*Fiji*/
        init.put("24414","AMT"); /*Finland*/
        init.put("24403","DNA"); /*Finland*/
        init.put("24412","DNA"); /*Finland*/
        init.put("24405","Elisa"); /*Finland*/
        init.put("24407","Nokia"); /*Finland*/
        init.put("24415","SAMK"); /*Finland*/
        init.put("24421","Saunalahti"); /*Finland*/
        init.put("24429","Scnl Truphone"); /*Finland*/
        init.put("24491","Sonera"); /*Finland*/
        init.put("24410","TDC Oy"); /*Finland*/
        init.put("24408","Unknown"); /*Finland*/
        init.put("24411","VIRVE"); /*Finland*/
        init.put("20820","Bouygues"); /*France*/
        init.put("20821","Bouygues"); /*France*/
        init.put("20888","Bouygues"); /*France*/
        init.put("20801","France Telecom Mobile"); /*France*/
        init.put("20814","Free Mobile"); /*France*/
        init.put("20815","Free Mobile"); /*France*/
        init.put("20805","Globalstar Europe"); /*France*/
        init.put("20806","Globalstar Europe"); /*France*/
        init.put("20807","Globalstar Europe"); /*France*/
        init.put("20800","Orange"); /*France*/
        init.put("20802","Orange"); /*France*/
        init.put("20810","SFR"); /*France*/
        init.put("20811","SFR"); /*France*/
        init.put("20813","SFR"); /*France*/
        init.put("20822","Transatel Mobile"); /*France*/
        init.put("54720","VINI"); /*French Polynesia (France)*/
        init.put("62804","Azur"); /*Gabon*/
        init.put("62801","Libertis"); /*Gabon*/
        init.put("62802","Moov (Telecel) Gabon S.A."); /*Gabon*/
        init.put("62803","Zain"); /*Gabon*/
        init.put("60702","Africel"); /*Gambia*/
        init.put("60703","Comium"); /*Gambia*/
        init.put("60701","Gamcel"); /*Gambia*/
        init.put("60704","QCell"); /*Gambia*/
        init.put("28988","A-Mobile"); /*Georgia*/
        init.put("28967","Aquafon"); /*Georgia*/
        init.put("28204","Beeline"); /*Georgia*/
        init.put("28201","Geocell"); /*Georgia*/
        init.put("28203","Iberiatel"); /*Georgia*/
        init.put("28202","Magti"); /*Georgia*/
        init.put("28205","Silknet"); /*Georgia*/
        init.put("26242","27C3"); /*Germany*/
        init.put("26215","Airdata"); /*Germany*/
        init.put("26210","Arcor AG & Co"); /*Germany*/
        init.put("26260","DB Telematik"); /*Germany*/
        init.put("262901","Debitel"); /*Germany*/
        init.put("26212","Dolphin Telecom"); /*Germany*/
        init.put("26203","E-Plus"); /*Germany*/
        init.put("26205","E-Plus"); /*Germany*/
        init.put("26277","E-Plus"); /*Germany*/
        init.put("26214","Group 3G UMTS"); /*Germany*/
        init.put("26243","LYCA"); /*Germany*/
        init.put("26213","Mobilcom Multimedia"); /*Germany*/
        init.put("26292","Nash Technologies"); /*Germany*/
        init.put("26207","O2"); /*Germany*/
        init.put("26208","O2"); /*Germany*/
        init.put("26211","O2"); /*Germany*/
        init.put("26276","Siemens AG"); /*Germany*/
        init.put("26201","T-Mobile"); /*Germany*/
        init.put("26206","T-Mobile"); /*Germany*/
        init.put("26216","vistream"); /*Germany*/
        init.put("26202","Vodafone"); /*Germany*/
        init.put("26204","Vodafone"); /*Germany*/
        init.put("26209","Vodafone"); /*Germany*/
        init.put("62006","Airtel"); /*Ghana*/
        init.put("62002","Ghana Telecom Mobile"); /*Ghana*/
        init.put("62004","Kasapa / Hutchison Telecom"); /*Ghana*/
        init.put("62001","MTN"); /*Ghana*/
        init.put("62003","tiGO"); /*Ghana*/
        init.put("26606","CTS Mobile"); /*Gibraltar (United Kingdom)*/
        init.put("26601","GibTel"); /*Gibraltar (United Kingdom)*/
        init.put("20201","Cosmote"); /*Greece*/
        init.put("20205","Vodafone"); /*Greece*/
        init.put("20209","Wind"); /*Greece*/
        init.put("20210","Wind"); /*Greece*/
        init.put("29001","TELE Greenland A/S"); /*Greenland (Denmark)*/
        init.put("352110","Cable & Wireless"); /*Grenada*/
        init.put("352030","Digicel"); /*Grenada*/
        init.put("34020","Digicel"); /*Guadeloupe (France)*/
        init.put("34008","MIO GSM"); /*Guadeloupe (France)*/
        init.put("34001","Orange"); /*Guadeloupe (France)*/
        init.put("34002","Outremer"); /*Guadeloupe (France)*/
        init.put("34003","Telcell"); /*Guadeloupe (France)*/
        init.put("310033","Guam Telephone Authority"); /*Guam (United States)*/
        init.put("310370","Guamcell"); /*Guam (United States)*/
        init.put("310470","Guamcell"); /*Guam (United States)*/
        init.put("311250","i CAN_GSM"); /*Guam (United States)*/
        init.put("310032","IT&E Wireless"); /*Guam (United States)*/
        init.put("310140","mPulse"); /*Guam (United States)*/
        init.put("70401","Claro"); /*Guatemala*/
        init.put("70402","Comcel / Tigo"); /*Guatemala*/
        init.put("70403","movistar"); /*Guatemala*/
        init.put("73801","Digicel"); /*Guiana*/
        init.put("73802","GT&T Cellink Plus"); /*Guiana*/
        init.put("61105","Cellcom"); /*Guinea*/
        init.put("61102","Lagui"); /*Guinea*/
        init.put("61104","MTN"); /*Guinea*/
        init.put("61101","Spacetel"); /*Guinea*/
        init.put("61103","Telecel Guinee"); /*Guinea*/
        init.put("63202","Areeba"); /*Guinea-Bissau*/
        init.put("63203","Orange"); /*Guinea-Bissau*/
        init.put("372010","Comcel / Voila"); /*Haiti*/
        init.put("37202","Digicel"); /*Haiti*/
        init.put("37203","NATCOM"); /*Haiti*/
        init.put("20414","6Gmobile"); /*Holland (Netherlands)*/
        init.put("20423","ASPIDER Solutions Nederland B.V."); /*Holland (Netherlands)*/
        init.put("20427","Breezz Nederland B.V."); /*Holland (Netherlands)*/
        init.put("20425","CapX B.V."); /*Holland (Netherlands)*/
        init.put("20407","eleena (MVNE)"); /*Holland (Netherlands)*/
        init.put("20405","Elephant Talk Communications Premium Rate Services"); /*Holland (Netherlands)*/
        init.put("20417","Intercity Mobile Communications B.V."); /*Holland (Netherlands)*/
        init.put("20408","KPN"); /*Holland (Netherlands)*/
        init.put("20410","KPN"); /*Holland (Netherlands)*/
        init.put("20469","KPN Mobile The Netherlands B.V."); /*Holland (Netherlands)*/
        init.put("20409","Lycamobile"); /*Holland (Netherlands)*/
        init.put("20422","Ministerie van Defensie"); /*Holland (Netherlands)*/
        init.put("20419","Mixe Communication Solutions B.V."); /*Holland (Netherlands)*/
        init.put("20406","Mundio Mobile (Netherlands) Ltd"); /*Holland (Netherlands)*/
        init.put("20421","NS Railinfrabeheer B.V."); /*Holland (Netherlands)*/
        init.put("20420","Orange Nederland"); /*Holland (Netherlands)*/
        init.put("20424","Private Mobility Nederland B.V."); /*Holland (Netherlands)*/
        init.put("20467","RadioAccess B.V."); /*Holland (Netherlands)*/
        init.put("20426","SpeakUp B.V."); /*Holland (Netherlands)*/
        init.put("20416","T-Mobile / Ben"); /*Holland (Netherlands)*/
        init.put("20402","Tele2 Netherlands"); /*Holland (Netherlands)*/
        init.put("20412","Telfort / O2"); /*Holland (Netherlands)*/
        init.put("20413","Unica Installatietechniek B.V"); /*Holland (Netherlands)*/
        init.put("20468","Unify Group Holding B.V."); /*Holland (Netherlands)*/
        init.put("20418","UPC Nederland B.V."); /*Holland (Netherlands)*/
        init.put("20401","VastMobiel B.V."); /*Holland (Netherlands)*/
        init.put("20404","Vodafone"); /*Holland (Netherlands)*/
        init.put("20403","Voiceworks B.V."); /*Holland (Netherlands)*/
        init.put("70802","Celtel / Tigo"); /*Honduras*/
        init.put("70801","Claro"); /*Honduras*/
        init.put("70840","DIGICEL"); /*Honduras*/
        init.put("70830","Hondutel"); /*Honduras*/
        init.put("45403","3 (3G)"); /*Hong Kong (People's Republic of China)*/
        init.put("45405","3 CDMA"); /*Hong Kong (People's Republic of China)*/
        init.put("45404","3 Dual (2G)"); /*Hong Kong (People's Republic of China)*/
        init.put("45412","C Peoples"); /*Hong Kong (People's Republic of China)*/
        init.put("45409","China Motion Telecom"); /*Hong Kong (People's Republic of China)*/
        init.put("45407","China Unicom"); /*Hong Kong (People's Republic of China)*/
        init.put("45411","China-Hongkong Telecom"); /*Hong Kong (People's Republic of China)*/
        init.put("45401","CITIC Telecom 1616"); /*Hong Kong (People's Republic of China)*/
        init.put("45400","CSL"); /*Hong Kong (People's Republic of China)*/
        init.put("45402","CSL 3G"); /*Hong Kong (People's Republic of China)*/
        init.put("45418","Hong Kong CSL Limited"); /*Hong Kong (People's Republic of China)*/
        init.put("45414","Hutchison Telecom"); /*Hong Kong (People's Republic of China)*/
        init.put("45410","New World"); /*Hong Kong (People's Republic of China)*/
        init.put("45416","PCCW"); /*Hong Kong (People's Republic of China)*/
        init.put("45419","PCCW"); /*Hong Kong (People's Republic of China)*/
        init.put("45429","PCCW"); /*Hong Kong (People's Republic of China)*/
        init.put("45415","SmarTone Mobile Comms"); /*Hong Kong (People's Republic of China)*/
        init.put("45417","SmarTone Mobile Comms"); /*Hong Kong (People's Republic of China)*/
        init.put("45406","Smartone-Vodafone"); /*Hong Kong (People's Republic of China)*/
        init.put("45408","Trident"); /*Hong Kong (People's Republic of China)*/
        init.put("21601","Pannon"); /*Hungary*/
        init.put("21630","T-Mobile"); /*Hungary*/
        init.put("21670","Vodafone"); /*Hungary*/
        init.put("27407","IceCell"); /*Iceland*/
        init.put("27411","Nova"); /*Iceland*/
        init.put("27406","N'll nIu ehf"); /*Iceland*/
        init.put("27408","On-waves"); /*Iceland*/
        init.put("27401","Siminn"); /*Iceland*/
        init.put("27412","Tal"); /*Iceland*/
        init.put("27404","Viking"); /*Iceland*/
        init.put("27402","Vodafone"); /*Iceland*/
        init.put("27403","Vodafone"); /*Iceland*/
        init.put("40417","AIRCEL"); /*India*/
        init.put("40425","AIRCEL"); /*India*/
        init.put("40428","AIRCEL"); /*India*/
        init.put("40429","AIRCEL"); /*India*/
        init.put("40437","AIRCEL"); /*India*/
        init.put("40491","AIRCEL"); /*India*/
        init.put("405082","AIRCEL"); /*India*/
        init.put("405800","AIRCEL"); /*India*/
        init.put("405801","AIRCEL"); /*India*/
        init.put("405802","AIRCEL"); /*India*/
        init.put("405803","AIRCEL"); /*India*/
        init.put("405804","AIRCEL"); /*India*/
        init.put("405805","AIRCEL"); /*India*/
        init.put("405806","AIRCEL"); /*India*/
        init.put("405807","AIRCEL"); /*India*/
        init.put("405808","AIRCEL"); /*India*/
        init.put("405809","AIRCEL"); /*India*/
        init.put("405810","AIRCEL"); /*India*/
        init.put("405811","AIRCEL"); /*India*/
        init.put("405812","AIRCEL"); /*India*/
        init.put("405813","AIRCEL"); /*India*/
        init.put("40460","Aircell Digilink"); /*India*/
        init.put("40415","Aircell Digilink Essar Cellph."); /*India*/
        init.put("40406","Airtel"); /*India*/
        init.put("40410","Airtel"); /*India*/
        init.put("40431","Airtel"); /*India*/
        init.put("40440","Airtel"); /*India*/
        init.put("40445","Airtel"); /*India*/
        init.put("40449","Airtel"); /*India*/
        init.put("40470","Airtel"); /*India*/
        init.put("40494","Airtel"); /*India*/
        init.put("40495","Airtel"); /*India*/
        init.put("40497","Airtel"); /*India*/
        init.put("40498","Airtel"); /*India*/
        init.put("40551","Airtel"); /*India*/
        init.put("40552","Airtel"); /*India*/
        init.put("40553","AirTel"); /*India*/
        init.put("40554","AirTel"); /*India*/
        init.put("40555","AirTel"); /*India*/
        init.put("40556","AirTel"); /*India*/
        init.put("40570","AirTel"); /*India*/
        init.put("40496","Airtel - Haryana"); /*India*/
        init.put("40402","Airtel - Punjab"); /*India*/
        init.put("40403","Airtel / Bharti Telenet"); /*India*/
        init.put("40493","Airtel Gujrat"); /*India*/
        init.put("40490","Airtel Maharashtra & Goa"); /*India*/
        init.put("40492","Airtel Mumbai"); /*India*/
        init.put("40443","BPL Mobile Cellular"); /*India*/
        init.put("40421","BPL Mobile Mumbai"); /*India*/
        init.put("40427","BPL USWest Cellular / Cellular Comms"); /*India*/
        init.put("40434","BSNL"); /*India*/
        init.put("40438","BSNL"); /*India*/
        init.put("40451","BSNL"); /*India*/
        init.put("40453","BSNL"); /*India*/
        init.put("40454","BSNL"); /*India*/
        init.put("40455","BSNL"); /*India*/
        init.put("40457","BSNL"); /*India*/
        init.put("40458","BSNL"); /*India*/
        init.put("40459","BSNL"); /*India*/
        init.put("40464","BSNL"); /*India*/
        init.put("40471","BSNL"); /*India*/
        init.put("40473","BSNL"); /*India*/
        init.put("40474","BSNL"); /*India*/
        init.put("40475","BSNL"); /*India*/
        init.put("40476","BSNL"); /*India*/
        init.put("40477","BSNL"); /*India*/
        init.put("40480","BSNL"); /*India*/
        init.put("40481","BSNL"); /*India*/
        init.put("40462","BSNL J&K"); /*India*/
        init.put("40472","BSNL Kerala"); /*India*/
        init.put("40466","BSNL Maharashtra & Goa"); /*India*/
        init.put("40478","BTA Cellcom"); /*India*/
        init.put("40448","Dishnet Wireless"); /*India*/
        init.put("40482","Escorts"); /*India*/
        init.put("40487","Escorts Telecom"); /*India*/
        init.put("40488","Escorts Telecom"); /*India*/
        init.put("40489","Escorts Telecom"); /*India*/
        init.put("40411","Essar / Sterling Cellular"); /*India*/
        init.put("405912","Etisalat DB(cheers)"); /*India*/
        init.put("405913","Etisalat DB(cheers)"); /*India*/
        init.put("405914","Etisalat DB(cheers)"); /*India*/
        init.put("405917","Etisalat DB(cheers)"); /*India*/
        init.put("40566","Hutch"); /*India*/
        init.put("40486","Hutchinson Essar South"); /*India*/
        init.put("40413","Hutchison Essar South"); /*India*/
        init.put("40484","Hutchison Essar South"); /*India*/
        init.put("40419","IDEA"); /*India*/
        init.put("405799","IDEA"); /*India*/
        init.put("405845","IDEA"); /*India*/
        init.put("405848","IDEA"); /*India*/
        init.put("405850","IDEA"); /*India*/
        init.put("40586","IDEA"); /*India*/
        init.put("40412","Idea (Escotel) Haryana"); /*India*/
        init.put("40456","Idea (Escotel) UP West"); /*India*/
        init.put("40404","IDEA CELLULAR - Delhi"); /*India*/
        init.put("40424","IDEA Cellular - Gujarat"); /*India*/
        init.put("40422","IDEA Cellular - Maharashtra"); /*India*/
        init.put("405855","Loop Mobile"); /*India*/
        init.put("405864","Loop Mobile"); /*India*/
        init.put("405865","Loop Mobile"); /*India*/
        init.put("40468","MTNL - Delhi"); /*India*/
        init.put("40469","MTNL - Mumbai"); /*India*/
        init.put("40450","Reliance"); /*India*/
        init.put("40452","Reliance"); /*India*/
        init.put("40467","Reliance"); /*India*/
        init.put("40483","Reliance"); /*India*/
        init.put("40485","Reliance"); /*India*/
        init.put("40501","Reliance"); /*India*/
        init.put("40503","Reliance"); /*India*/
        init.put("40504","Reliance"); /*India*/
        init.put("40509","Reliance"); /*India*/
        init.put("40510","Reliance"); /*India*/
        init.put("40513","Reliance"); /*India*/
        init.put("40409","Reliance Telecom Private"); /*India*/
        init.put("40436","Reliance Telecom Private"); /*India*/
        init.put("40441","RPG MAA"); /*India*/
        init.put("405881","S Tel"); /*India*/
        init.put("40444","Spice Telecom - Karnataka"); /*India*/
        init.put("40414","Spice Telecom - Punjab"); /*India*/
        init.put("40442","Srinivas Cellcom / Aircel"); /*India*/
        init.put("40407","TATA Cellular / Idea Cellular"); /*India*/
        init.put("405025","TATA Teleservice"); /*India*/
        init.put("405026","TATA Teleservice"); /*India*/
        init.put("405027","TATA Teleservice"); /*India*/
        init.put("405029","TATA Teleservice"); /*India*/
        init.put("405030","TATA Teleservice"); /*India*/
        init.put("405031","TATA Teleservice"); /*India*/
        init.put("405032","TATA Teleservice"); /*India*/
        init.put("405033","TATA Teleservice"); /*India*/
        init.put("405034","TATA Teleservice"); /*India*/
        init.put("405035","TATA Teleservice"); /*India*/
        init.put("405036","TATA Teleservice"); /*India*/
        init.put("405037","TATA Teleservice"); /*India*/
        init.put("405038","TATA Teleservice"); /*India*/
        init.put("405039","TATA Teleservice"); /*India*/
        init.put("405040","TATA Teleservice"); /*India*/
        init.put("405041","TATA Teleservice"); /*India*/
        init.put("405042","TATA Teleservice"); /*India*/
        init.put("405043","TATA Teleservice"); /*India*/
        init.put("405044","TATA Teleservice"); /*India*/
        init.put("405045","TATA Teleservice"); /*India*/
        init.put("405046","TATA Teleservice"); /*India*/
        init.put("405047","TATA Teleservice"); /*India*/
        init.put("405818","Uninor"); /*India*/
        init.put("405819","Uninor"); /*India*/
        init.put("405820","Uninor"); /*India*/
        init.put("405821","Uninor"); /*India*/
        init.put("405822","Uninor"); /*India*/
        init.put("405844","Uninor"); /*India*/
        init.put("405875","Uninor"); /*India*/
        init.put("405880","Uninor"); /*India*/
        init.put("405927","Uninor"); /*India*/
        init.put("405929","Uninor"); /*India*/
        init.put("405824","Videocon Datacom"); /*India*/
        init.put("405827","Videocon Datacom"); /*India*/
        init.put("405834","Videocon Datacom"); /*India*/
        init.put("40420","Vodafone"); /*India*/
        init.put("40446","Vodafone"); /*India*/
        init.put("40405","Vodafone - Gujarat"); /*India*/
        init.put("40401","Vodafone - Haryana"); /*India*/
        init.put("40430","Vodafone - Kolkata"); /*India*/
        init.put("405750","Vodafone IN"); /*India*/
        init.put("405751","Vodafone IN"); /*India*/
        init.put("405752","Vodafone IN"); /*India*/
        init.put("405753","Vodafone IN"); /*India*/
        init.put("405754","Vodafone IN"); /*India*/
        init.put("405755","Vodafone IN"); /*India*/
        init.put("405756","Vodafone IN"); /*India*/
        init.put("51089","3"); /*Indonesia*/
        init.put("51008","AXIS"); /*Indonesia*/
        init.put("51027","Ceria"); /*Indonesia*/
        init.put("51099","Esia"); /*Indonesia*/
        init.put("51028","Fren/Hepi"); /*Indonesia*/
        init.put("51021","IM3"); /*Indonesia*/
        init.put("51001","INDOSAT"); /*Indonesia*/
        init.put("51000","PSN"); /*Indonesia*/
        init.put("51009","SMART"); /*Indonesia*/
        init.put("51003","StarOne"); /*Indonesia*/
        init.put("51007","TelkomFlexi"); /*Indonesia*/
        init.put("51020","TELKOMMobile"); /*Indonesia*/
        init.put("51010","Telkomsel"); /*Indonesia*/
        init.put("51011","XL"); /*Indonesia*/
        init.put("43235","Irancell"); /*Iran*/
        init.put("43293","Iraphone"); /*Iran*/
        init.put("43211","MCI"); /*Iran*/
        init.put("43219","MTCE"); /*Iran*/
        init.put("43232","Taliya"); /*Iran*/
        init.put("43270","TCI"); /*Iran*/
        init.put("43214","TKC"); /*Iran*/
        init.put("41805","Asia Cell"); /*Iraq*/
        init.put("41850","Asia Cell"); /*Iraq*/
        init.put("41840","Korek"); /*Iraq*/
        init.put("41845","Mobitel"); /*Iraq*/
        init.put("41892","Omnnea"); /*Iraq*/
        init.put("41808","SanaTel"); /*Iraq*/
        init.put("41820","Zain IQ"); /*Iraq*/
        init.put("41830","Zain IQ"); /*Iraq*/
        init.put("27205","3"); /*Ireland*/
        init.put("27204","Access Telecom"); /*Ireland*/
        init.put("27209","Clever Communications"); /*Ireland*/
        init.put("27200","E-Mobile"); /*Ireland*/
        init.put("27207","Eircom"); /*Ireland*/
        init.put("27211","Liffey Telecom"); /*Ireland*/
        init.put("27203","Meteor"); /*Ireland*/
        init.put("27202","O2"); /*Ireland*/
        init.put("272020","Tesco Mobile"); /*Ireland*/
        init.put("27201","Vodafone"); /*Ireland*/
        init.put("42502","Cellcom"); /*Israel*/
        init.put("42577","Mirs"); /*Israel*/
        init.put("42501","Orange"); /*Israel*/
        init.put("-","Partner"); /*Israel*/
        init.put("42503","Pelephone"); /*Israel*/
        init.put("22299","3 Italia"); /*Italy*/
        init.put("22298","Blu"); /*Italy*/
        init.put("22202","Elsacom"); /*Italy*/
        init.put("22277","IPSE 2000"); /*Italy*/
        init.put("22207","Noverca"); /*Italy*/
        init.put("22230","RFI"); /*Italy*/
        init.put("22201","TIM"); /*Italy*/
        init.put("22210","Vodafone"); /*Italy*/
        init.put("22288","Wind"); /*Italy*/
        init.put("338020","Cable & Wireless"); /*Jamaica*/
        init.put("338180","Cable & Wireless"); /*Jamaica*/
        init.put("338070","Claro"); /*Jamaica*/
        init.put("338050","Digicel"); /*Jamaica*/
        init.put("44001","DoCoMo"); /*Japan*/
        init.put("44002","DoCoMo"); /*Japan*/
        init.put("44003","DoCoMo"); /*Japan*/
        init.put("44009","DoCoMo"); /*Japan*/
        init.put("44010","DoCoMo"); /*Japan*/
        init.put("44011","DoCoMo"); /*Japan*/
        init.put("44012","DoCoMo"); /*Japan*/
        init.put("44013","DoCoMo"); /*Japan*/
        init.put("44014","DoCoMo"); /*Japan*/
        init.put("44015","DoCoMo"); /*Japan*/
        init.put("44016","DoCoMo"); /*Japan*/
        init.put("44017","DoCoMo"); /*Japan*/
        init.put("44018","DoCoMo"); /*Japan*/
        init.put("44019","DoCoMo"); /*Japan*/
        init.put("44021","DoCoMo"); /*Japan*/
        init.put("44022","DoCoMo"); /*Japan*/
        init.put("44023","DoCoMo"); /*Japan*/
        init.put("44024","DoCoMo"); /*Japan*/
        init.put("44025","DoCoMo"); /*Japan*/
        init.put("44026","DoCoMo"); /*Japan*/
        init.put("44027","DoCoMo"); /*Japan*/
        init.put("44028","DoCoMo"); /*Japan*/
        init.put("44029","DoCoMo"); /*Japan*/
        init.put("44030","DoCoMo"); /*Japan*/
        init.put("44031","DoCoMo"); /*Japan*/
        init.put("44032","DoCoMo"); /*Japan*/
        init.put("44033","DoCoMo"); /*Japan*/
        init.put("44034","DoCoMo"); /*Japan*/
        init.put("44035","DoCoMo"); /*Japan*/
        init.put("44036","DoCoMo"); /*Japan*/
        init.put("44037","DoCoMo"); /*Japan*/
        init.put("44038","DoCoMo"); /*Japan*/
        init.put("44039","DoCoMo"); /*Japan*/
        init.put("44049","DoCoMo"); /*Japan*/
        init.put("44058","DoCoMo"); /*Japan*/
        init.put("44060","DoCoMo"); /*Japan*/
        init.put("44061","DoCoMo"); /*Japan*/
        init.put("44062","DoCoMo"); /*Japan*/
        init.put("44063","DoCoMo"); /*Japan*/
        init.put("44064","DoCoMo"); /*Japan*/
        init.put("44065","DoCoMo"); /*Japan*/
        init.put("44066","DoCoMo"); /*Japan*/
        init.put("44067","DoCoMo"); /*Japan*/
        init.put("44068","DoCoMo"); /*Japan*/
        init.put("44069","DoCoMo"); /*Japan*/
        init.put("44087","DoCoMo"); /*Japan*/
        init.put("44099","DoCoMo"); /*Japan*/
        init.put("44000","eMobile"); /*Japan*/
        init.put("44007","KDDI"); /*Japan*/
        init.put("44008","KDDI"); /*Japan*/
        init.put("44050","KDDI"); /*Japan*/
        init.put("44051","KDDI"); /*Japan*/
        init.put("44052","KDDI"); /*Japan*/
        init.put("44053","KDDI"); /*Japan*/
        init.put("44054","KDDI"); /*Japan*/
        init.put("44055","KDDI"); /*Japan*/
        init.put("44056","KDDI"); /*Japan*/
        init.put("44070","KDDI"); /*Japan*/
        init.put("44071","KDDI"); /*Japan*/
        init.put("44072","KDDI"); /*Japan*/
        init.put("44073","KDDI"); /*Japan*/
        init.put("44074","KDDI"); /*Japan*/
        init.put("44075","KDDI"); /*Japan*/
        init.put("44076","KDDI"); /*Japan*/
        init.put("44077","KDDI"); /*Japan*/
        init.put("44079","KDDI"); /*Japan*/
        init.put("44088","KDDI"); /*Japan*/
        init.put("44089","KDDI"); /*Japan*/
        init.put("44078","Okinawa Cellular Telephone"); /*Japan*/
        init.put("44020","SoftBank"); /*Japan*/
        init.put("44080","TU-KA"); /*Japan*/
        init.put("44081","TU-KA"); /*Japan*/
        init.put("44082","TU-KA"); /*Japan*/
        init.put("44083","TU-KA"); /*Japan*/
        init.put("44084","TU-KA"); /*Japan*/
        init.put("44085","TU-KA"); /*Japan*/
        init.put("44086","TU-KA"); /*Japan*/
        init.put("44004","Vodafone"); /*Japan*/
        init.put("44006","Vodafone"); /*Japan*/
        init.put("44040","Vodafone"); /*Japan*/
        init.put("44041","Vodafone"); /*Japan*/
        init.put("44042","Vodafone"); /*Japan*/
        init.put("44043","Vodafone"); /*Japan*/
        init.put("44044","Vodafone"); /*Japan*/
        init.put("44045","Vodafone"); /*Japan*/
        init.put("44046","Vodafone"); /*Japan*/
        init.put("44047","Vodafone"); /*Japan*/
        init.put("44048","Vodafone"); /*Japan*/
        init.put("44090","Vodafone"); /*Japan*/
        init.put("44092","Vodafone"); /*Japan*/
        init.put("44093","Vodafone"); /*Japan*/
        init.put("44094","Vodafone"); /*Japan*/
        init.put("44095","Vodafone"); /*Japan*/
        init.put("44096","Vodafone"); /*Japan*/
        init.put("44097","Vodafone"); /*Japan*/
        init.put("44098","Vodafone"); /*Japan*/
        init.put("41677","Orange"); /*Jordan*/
        init.put("41603","Umniah"); /*Jordan*/
        init.put("41602","XPress Telecom"); /*Jordan*/
        init.put("41601","Zain"); /*Jordan*/
        init.put("40101","Beeline"); /*Kazakhstan*/
        init.put("40107","Dalacom"); /*Kazakhstan*/
        init.put("40102","K'Cell"); /*Kazakhstan*/
        init.put("40108","Kazakhtelecom"); /*Kazakhstan*/
        init.put("40177","Mobile Telecom Service"); /*Kazakhstan*/
        init.put("63907","Orange Kenya"); /*Kenya*/
        init.put("63902","Safaricom"); /*Kenya*/
        init.put("63905","yu"); /*Kenya*/
        init.put("63903","Zain"); /*Kenya*/
        init.put("54509","Kiribati Frigate"); /*Kiribati*/
        init.put("41904","Viva"); /*Kuwait*/
        init.put("41903","Wataniya"); /*Kuwait*/
        init.put("41902","Zain"); /*Kuwait*/
        init.put("43701","Bitel"); /*Kyrgyzstan*/
        init.put("43703","Fonex"); /*Kyrgyzstan*/
        init.put("43705","MegaCom"); /*Kyrgyzstan*/
        init.put("43709","O!"); /*Kyrgyzstan*/
        init.put("45702","ETL"); /*Laos*/
        init.put("45701","LaoTel"); /*Laos*/
        init.put("45703","LAT"); /*Laos*/
        init.put("45708","Tigo"); /*Laos*/
        init.put("24705","Bite"); /*Latvia*/
        init.put("24709","Camel Mobile"); /*Latvia*/
        init.put("24708","IZZI"); /*Latvia*/
        init.put("24701","LMT"); /*Latvia*/
        init.put("24707","MTS"); /*Latvia*/
        init.put("24706","Rigatta"); /*Latvia*/
        init.put("24702","Tele2"); /*Latvia*/
        init.put("24703","TRIATEL"); /*Latvia*/
        init.put("41501","Alfa"); /*Lebanon*/
        init.put("41503","MTC-Touch"); /*Lebanon*/
        init.put("41505","Ogero Mobile"); /*Lebanon*/
        init.put("65102","Econet Ezin-cel"); /*Lesotho*/
        init.put("65101","Vodacom"); /*Lesotho*/
        init.put("60602","Al-Jeel Phone"); /*Libya*/
        init.put("60606","Hatef Libya"); /*Libya*/
        init.put("60603","Libya Phone"); /*Libya*/
        init.put("60600","Libyana"); /*Libya*/
        init.put("60601","Madar"); /*Libya*/
        init.put("29504","Cubic Telecom"); /*Liechtenstein*/
        init.put("29505","FL1"); /*Liechtenstein*/
        init.put("29502","Orange"); /*Liechtenstein*/
        init.put("29501","Swisscom"); /*Liechtenstein*/
        init.put("29577","Tele 2"); /*Liechtenstein*/
        init.put("24602","BITE"); /*Lithuania*/
        init.put("24605","LitRail"); /*Lithuania*/
        init.put("24606","Mediafon"); /*Lithuania*/
        init.put("24601","Omnitel"); /*Lithuania*/
        init.put("24603","Tele 2"); /*Lithuania*/
        init.put("61807","Cellcom"); /*Livery*/
        init.put("61804","Comium Liberi"); /*Livery*/
        init.put("61802","Libercell"); /*Livery*/
        init.put("61820","LIBTELCO"); /*Livery*/
        init.put("61801","Lonestar Cell"); /*Livery*/
        init.put("27001","LuxGSM"); /*Luksemburg*/
        init.put("27077","Tango"); /*Luksemburg*/
        init.put("27099","Voxmobile"); /*Luksemburg*/
        init.put("45503","3"); /*Macao (People's Republic of China)*/
        init.put("45505","3"); /*Macao (People's Republic of China)*/
        init.put("45502","China Telecom"); /*Macao (People's Republic of China)*/
        init.put("45501","CTM"); /*Macao (People's Republic of China)*/
        init.put("45504","CTM"); /*Macao (People's Republic of China)*/
        init.put("45500","SmarTone"); /*Macao (People's Republic of China)*/
        init.put("64602","Orange"); /*Madagascar*/
        init.put("64603","Sacel"); /*Madagascar*/
        init.put("64604","Telma"); /*Madagascar*/
        init.put("64601","Zain"); /*Madagascar*/
        init.put("65001","TNM"); /*Malawi*/
        init.put("65010","Zain"); /*Malawi*/
        init.put("50201","ATUR 450"); /*Malaysia*/
        init.put("502151","Baraka Telecom Sdn Bhd (MVNE)"); /*Malaysia*/
        init.put("50213","Celcom"); /*Malaysia*/
        init.put("50219","Celcom"); /*Malaysia*/
        init.put("50216","DiGi"); /*Malaysia*/
        init.put("50210","DiGi Telecommunications"); /*Malaysia*/
        init.put("50220","Electcoms Wireless Sdn Bhd"); /*Malaysia*/
        init.put("50212","Maxis"); /*Malaysia*/
        init.put("50217","Maxis"); /*Malaysia*/
        init.put("50214","Telekom Malaysia Berhad for PSTN SMS"); /*Malaysia*/
        init.put("50211","TM Homeline"); /*Malaysia*/
        init.put("502150","Tune Talk Sdn Bhd"); /*Malaysia*/
        init.put("50218","U Mobile"); /*Malaysia*/
        init.put("502152","Yes"); /*Malaysia*/
        init.put("47201","Dhiraagu"); /*Maldives*/
        init.put("47202","Wataniya"); /*Maldives*/
        init.put("61001","Malitel"); /*Mali*/
        init.put("61002","Orange"); /*Mali*/
        init.put("27821","GO"); /*Malta*/
        init.put("27877","Melita"); /*Malta*/
        init.put("27801","Vodafone"); /*Malta*/
        init.put("60902","Chinguitel"); /*Mauretania*/
        init.put("60901","Mattel"); /*Mauretania*/
        init.put("60910","Mauritel"); /*Mauretania*/
        init.put("61710","Emtel"); /*Mauritius*/
        init.put("61702","Mahanagar Telephone (Mauritius) Ltd."); /*Mauritius*/
        init.put("61701","Orange"); /*Mauritius*/
        init.put("334050","Iusacell"); /*Mexico*/
        init.put("33403","movistar"); /*Mexico*/
        init.put("334030","movistar"); /*Mexico*/
        init.put("33401","Nextel"); /*Mexico*/
        init.put("334010","Nextel"); /*Mexico*/
        init.put("33402","Telcel"); /*Mexico*/
        init.put("334020","Telcel"); /*Mexico*/
        init.put("55001","FSM Telecom"); /*Micronesia*/
        init.put("25904","Eventis"); /*Moldova*/
        init.put("25903","IDC"); /*Moldova*/
        init.put("25902","Moldcell"); /*Moldova*/
        init.put("25901","Orange"); /*Moldova*/
        init.put("25905","UnitE"); /*Moldova*/
        init.put("25999","UnitE"); /*Moldova*/
        init.put("21201","Office des Telephones"); /*Monaco*/
        init.put("42898","G.Mobile"); /*Mongolia*/
        init.put("42899","MobiCom"); /*Mongolia*/
        init.put("42891","Skytel"); /*Mongolia*/
        init.put("42888","Unitel"); /*Mongolia*/
        init.put("29703","m:tel CG"); /*Montenegro*/
        init.put("22004","T-Mobile"); /*Montenegro*/
        init.put("29702","T-Mobile"); /*Montenegro*/
        init.put("29704","T-Mobile"); /*Montenegro*/
        init.put("29701","Telenor Montenegro"); /*Montenegro*/
        init.put("60401","IAM"); /*Morocco*/
        init.put("60405","INWI"); /*Morocco*/
        init.put("60400","Meditel"); /*Morocco*/
        init.put("64301","mCel"); /*Mozambique*/
        init.put("64304","Vodacom"); /*Mozambique*/
        init.put("41401","MPT"); /*Myanmar*/
        init.put("64903","Cell One"); /*Namibia*/
        init.put("64901","MTC"); /*Namibia*/
        init.put("64902","switch"); /*Namibia*/
        init.put("53602","Digicel"); /*Nauru*/
        init.put("42902","Mero Mobile"); /*Nepal*/
        init.put("42901","Nepal Telecom"); /*Nepal*/
        init.put("42904","SmartCell"); /*Nepal*/
        init.put("42903","United Telecom Limited"); /*Nepal*/
        init.put("36294","Bayus"); /*Netherlands Antilles (Netherlands)*/
        init.put("36269","Digicel"); /*Netherlands Antilles (Netherlands)*/
        init.put("36295","MIO"); /*Netherlands Antilles (Netherlands)*/
        init.put("36251","Telcell"); /*Netherlands Antilles (Netherlands)*/
        init.put("36291","UTS"); /*Netherlands Antilles (Netherlands)*/
        init.put("54601","Mobilis"); /*New Caledonia (France)*/
        init.put("53024","2Degrees"); /*New Zealand*/
        init.put("53000","Telecom"); /*New Zealand*/
        init.put("53002","Telecom"); /*New Zealand*/
        init.put("53005","Telecom"); /*New Zealand*/
        init.put("53004","TelstraClear"); /*New Zealand*/
        init.put("53001","Vodafone"); /*New Zealand*/
        init.put("53003","Woosh"); /*New Zealand*/
        init.put("71021","Claro"); /*Nicaragua*/
        init.put("71030","movistar"); /*Nicaragua*/
        init.put("71073","SERCOM"); /*Nicaragua*/
        init.put("61404","Orange"); /*Niger*/
        init.put("61401","SahelCom"); /*Niger*/
        init.put("61403","Telecel"); /*Niger*/
        init.put("61402","Zain"); /*Niger*/
        init.put("62160","Etisalat"); /*Nigeria*/
        init.put("62150","Glo"); /*Nigeria*/
        init.put("62140","M-Tel"); /*Nigeria*/
        init.put("62130","MTN"); /*Nigeria*/
        init.put("62125","Visafone"); /*Nigeria*/
        init.put("62120","Zain"); /*Nigeria*/
        init.put("55501","Telecom Niue"); /*Niue*/
        init.put("467192","Koryolink"); /*North Korea*/
        init.put("467193","SUN NET"); /*North Korea*/
        init.put("24209","Barablu Mobile Norway Ltd"); /*Norway*/
        init.put("24206","Ice"); /*Norway*/
        init.put("24220","Jernbaneverket AS"); /*Norway*/
        init.put("24223","Lyca"); /*Norway*/
        init.put("24203","MTU"); /*Norway*/
        init.put("24202","NetCom"); /*Norway*/
        init.put("24205","Network Norway"); /*Norway*/
        init.put("24211","SystemNet"); /*Norway*/
        init.put("24208","TDC Mobil AS"); /*Norway*/
        init.put("24204","Tele2"); /*Norway*/
        init.put("24201","Telenor"); /*Norway*/
        init.put("--","Telia"); /*Norway*/
        init.put("24207","Ventelo"); /*Norway*/
        init.put("42203","Nawras"); /*Oman*/
        init.put("42202","Oman Mobile"); /*Oman*/
        init.put("25030","Megafon"); /*Osetia*/
        init.put("41008","Instaphone"); /*Pakistan*/
        init.put("41001","Mobilink"); /*Pakistan*/
        init.put("41006","Telenor"); /*Pakistan*/
        init.put("41003","Ufone"); /*Pakistan*/
        init.put("41007","Warid"); /*Pakistan*/
        init.put("41004","Zong"); /*Pakistan*/
        init.put("55280","Palau Mobile"); /*Palau*/
        init.put("55201","PNCC"); /*Palau*/
        init.put("42505","JAWWAL"); /*Palestine*/
        init.put("42506","Wataniya"); /*Palestine*/
        init.put("71401","Cable & Wireless"); /*Panama*/
        init.put("71404","Digicel"); /*Panama*/
        init.put("71403","laro"); /*Panama*/
        init.put("71402","movistar"); /*Panama*/
        init.put("53701","B-Mobile"); /*Papua New Guinea*/
        init.put("53703","Digicel"); /*Papua New Guinea*/
        init.put("74402","Claro"); /*Paraguay*/
        init.put("74406","Copaco"); /*Paraguay*/
        init.put("74405","Personal"); /*Paraguay*/
        init.put("74404","Tigo"); /*Paraguay*/
        init.put("74401","VOX"); /*Paraguay*/
        init.put("71610","Claro"); /*Peru*/
        init.put("71606","movistar"); /*Peru*/
        init.put("71607","NEXTEL"); /*Peru*/
        init.put("51511","ACeS Philippines"); /*Philippines*/
        init.put("51505","Digitel"); /*Philippines*/
        init.put("51502","Globe"); /*Philippines*/
        init.put("51501","Islacom"); /*Philippines*/
        init.put("51588","Nextel"); /*Philippines*/
        init.put("51518","Red Mobile"); /*Philippines*/
        init.put("51503","Smart Gold"); /*Philippines*/
        init.put("26017","Aero2"); /*Poland*/
        init.put("26015","CenterNet"); /*Poland*/
        init.put("26012","Cyfrowy Polsat"); /*Poland*/
        init.put("26008","E-Telko"); /*Poland*/
        init.put("26016","Mobyland"); /*Poland*/
        init.put("26011","Nordisk Polska"); /*Poland*/
        init.put("26003","Orange"); /*Poland*/
        init.put("26006","Play"); /*Poland*/
        init.put("26001","Plus"); /*Poland*/
        init.put("26005","Polska Telefonia"); /*Poland*/
        init.put("26007","Premium Internet"); /*Poland*/
        init.put("26013","Sferia"); /*Poland*/
        init.put("26002","T-mobile"); /*Poland*/
        init.put("26004","Tele2"); /*Poland*/
        init.put("26010","Telefony Opalenickie"); /*Poland*/
        init.put("26009","Telekomunikacja Kolejowa"); /*Poland*/
        init.put("26803","Optimus"); /*Portugal*/
        init.put("26806","TMN"); /*Portugal*/
        init.put("26801","Vodafone"); /*Portugal*/
        init.put("26821","Zapp"); /*Portugal*/
        init.put("33011","Claro"); /*Puerto Rico*/
        init.put("330110","Claro"); /*Puerto Rico*/
        init.put("33000","Open Mobile"); /*Puerto Rico*/
        init.put("42705","Ministry of Interior"); /*Qatar*/
        init.put("42701","Qatarnet"); /*Qatar*/
        init.put("42702","Vodafone"); /*Qatar*/
        init.put("62910","Libertis Telecom"); /*Republic of Congo*/
        init.put("62907","Warid Telecom"); /*Republic of Congo*/
        init.put("62901","Zain"); /*Republic of Congo*/
        init.put("29402","Cosmofon"); /*Republic of Macedonia*/
        init.put("29401","T-Mobile"); /*Republic of Macedonia*/
        init.put("29403","VIP"); /*Republic of Macedonia*/
        init.put("64700","Orange"); /*Reunion (France)*/
        init.put("64702","Outremer"); /*Reunion (France)*/
        init.put("64710","SFR Reunion"); /*Reunion (France)*/
        init.put("22603","Cosmote"); /*Romania*/
        init.put("22605","DIGI.mobil"); /*Romania*/
        init.put("22611","Enigma-System"); /*Romania*/
        init.put("22610","Orange"); /*Romania*/
        init.put("22602","Romtelecom"); /*Romania*/
        init.put("22601","Vodafone"); /*Romania*/
        init.put("22604","Zapp"); /*Romania*/
        init.put("22606","Zapp"); /*Romania*/
        init.put("25012","Baykalwestcom"); /*Russian Federation*/
        init.put("25028","Beeline"); /*Russian Federation*/
        init.put("25099","Beeline"); /*Russian Federation*/
        init.put("25010","DTC"); /*Russian Federation*/
        init.put("25005","ETK"); /*Russian Federation*/
        init.put("25019","INDIGO"); /*Russian Federation*/
        init.put("25013","KUGSM"); /*Russian Federation*/
        init.put("25002","MegaFon"); /*Russian Federation*/
        init.put("25023","Mobicom - Novosibirsk"); /*Russian Federation*/
        init.put("25035","MOTIV"); /*Russian Federation*/
        init.put("25001","MTS"); /*Russian Federation*/
        init.put("25003","NCC"); /*Russian Federation*/
        init.put("25016","NTC"); /*Russian Federation*/
        init.put("25011","Orensot"); /*Russian Federation*/
        init.put("25092","Primtelefon"); /*Russian Federation*/
        init.put("25004","Sibchallenge"); /*Russian Federation*/
        init.put("25006","Skylink"); /*Russian Federation*/
        init.put("25009","Skylink"); /*Russian Federation*/
        init.put("25007","SMARTS"); /*Russian Federation*/
        init.put("25014","SMARTS"); /*Russian Federation*/
        init.put("25015","SMARTS"); /*Russian Federation*/
        init.put("25044","Stavtelesot / North Caucasian GSM"); /*Russian Federation*/
        init.put("25038","Tambov GSM"); /*Russian Federation*/
        init.put("25020","Tele2"); /*Russian Federation*/
        init.put("25093","Telecom XXI"); /*Russian Federation*/
        init.put("25017","Utel"); /*Russian Federation*/
        init.put("25039","Utel"); /*Russian Federation*/
        init.put("63510","MTN"); /*Rwanda*/
        init.put("63512","Rwandatel"); /*Rwanda*/
        init.put("63513","Tigo"); /*Rwanda*/
        init.put("356110","Cable & Wireless"); /*Saint Kitts and Nevis*/
        init.put("356070","Chippie"); /*Saint Kitts and Nevis*/
        init.put("356050","Digicel"); /*Saint Kitts and Nevis*/
        init.put("358110","Cable & Wireless"); /*Saint Lucia*/
        init.put("358050","Digicel"); /*Saint Lucia*/
        init.put("360110","Cable & Wireless"); /*Saint Vincent and the Grenadines*/
        init.put("360100","Cingular Wireless"); /*Saint Vincent and the Grenadines*/
        init.put("360050","Digicel"); /*Saint Vincent and the Grenadines*/
        init.put("360070","Digicel"); /*Saint Vincent and the Grenadines*/
        init.put("30801","Ameris"); /*Saint-Pierre and Miquelon (France)*/
        init.put("54901","Digicel"); /*Samoa*/
        init.put("54927","SamoaTel"); /*Samoa*/
        init.put("29201","PRIMA"); /*San Marino*/
        init.put("62601","CSTmovel"); /*Sao Tome and Principe*/
        init.put("42007","EAE"); /*Saudi Arabia*/
        init.put("42003","Mobily"); /*Saudi Arabia*/
        init.put("42001","STC"); /*Saudi Arabia*/
        init.put("42004","Zain SA"); /*Saudi Arabia*/
        init.put("60803","Expresso"); /*Senegal*/
        init.put("60802","Sentel GSM"); /*Senegal*/
        init.put("60801","Sonatel ALIZE"); /*Senegal*/
        init.put("22003","Telekom Srbija"); /*Serbia*/
        init.put("22001","Telenor"); /*Serbia*/
        init.put("22005","VIP Mobile"); /*Serbia*/
        init.put("63301","Cable & Wireless (Seychelles) Ltd."); /*Seychelles*/
        init.put("63302","Mediatech International"); /*Seychelles*/
        init.put("63310","Telecom Airtel"); /*Seychelles*/
        init.put("61905","Africell"); /*Sierra Leone*/
        init.put("61904","Comium"); /*Sierra Leone*/
        init.put("61903","Datatel"); /*Sierra Leone*/
        init.put("61902","Millicom"); /*Sierra Leone*/
        init.put("61925","Mobitel"); /*Sierra Leone*/
        init.put("61901","Zain"); /*Sierra Leone*/
        init.put("52512","Digital Trunked Radio Network"); /*Singapore*/
        init.put("52503","M1"); /*Singapore*/
        init.put("52501","SingTel"); /*Singapore*/
        init.put("52502","SingTel-G18"); /*Singapore*/
        init.put("52505","StarHub"); /*Singapore*/
        init.put("23105","Mobile Entertainment Company"); /*Slovakia*/
        init.put("23106","O2"); /*Slovakia*/
        init.put("23101","Orange"); /*Slovakia*/
        init.put("23102","T-Mobile"); /*Slovakia*/
        init.put("23104","T-Mobile"); /*Slovakia*/
        init.put("23103","Unient Communications"); /*Slovakia*/
        init.put("23199","eSR"); /*Slovakia*/
        init.put("29341","Mobitel"); /*Slovenia*/
        init.put("29340","SI.mobil - Vodafone"); /*Slovenia*/
        init.put("29364","T-2"); /*Slovenia*/
        init.put("29370","Tusmobil"); /*Slovenia*/
        init.put("54001","BREEZE"); /*Solomon Islands*/
        init.put("5401","BREEZE"); /*Solomon Islands*/
        init.put("63730","Golis"); /*Somalia*/
        init.put("63725","Hormuud"); /*Somalia*/
        init.put("63710","Nationlink"); /*Somalia*/
        init.put("63760","Nationlink Telecom"); /*Somalia*/
        init.put("63704","Somafone"); /*Somalia*/
        init.put("638","Telcom Mobile"); /*Somalia*/
        init.put("63701","Telesom"); /*Somalia*/
        init.put("63782","Telesom"); /*Somalia*/
        init.put("65530","Bokamoso Consortium"); /*South Africa*/
        init.put("65521","Cape Town Metropolitan Council"); /*South Africa*/
        init.put("65507","Cell C"); /*South Africa*/
        init.put("65532","Ilizwi Telecommunications"); /*South Africa*/
        init.put("65531","Karabo Telecoms (Pty) Ltd."); /*South Africa*/
        init.put("65510","MTN"); /*South Africa*/
        init.put("65513","Neotel"); /*South Africa*/
        init.put("65511","SAPS Gauteng"); /*South Africa*/
        init.put("65506","Sentech"); /*South Africa*/
        init.put("65502","Telkom Mobile / 8.ta"); /*South Africa*/
        init.put("65533","Thinta Thinta Telecommunications"); /*South Africa*/
        init.put("65501","Vodacom"); /*South Africa*/
        init.put("45004","KT"); /*South Korea*/
        init.put("45008","KTF"); /*South Korea*/
        init.put("45002","KTF CDMA"); /*South Korea*/
        init.put("45006","LGU+"); /*South Korea*/
        init.put("45003","Power 017"); /*South Korea*/
        init.put("45005","SK Telecom"); /*South Korea*/
        init.put("21423","BARABLU"); /*Spain*/
        init.put("21415","BT"); /*Spain*/
        init.put("21422","DigiMobil"); /*Spain*/
        init.put("21424","Eroski"); /*Spain*/
        init.put("21408","Euskaltel"); /*Spain*/
        init.put("21420","Fonyou"); /*Spain*/
        init.put("21425","LycaMobile"); /*Spain*/
        init.put("21407","movistar"); /*Spain*/
        init.put("21417","MUbil R"); /*Spain*/
        init.put("21418","ONO"); /*Spain*/
        init.put("21403","Orange"); /*Spain*/
        init.put("21409","Orange"); /*Spain*/
        init.put("21419","Simyo"); /*Spain*/
        init.put("21416","TeleCable"); /*Spain*/
        init.put("21405","TME"); /*Spain*/
        init.put("21401","Vodafone"); /*Spain*/
        init.put("21406","Vodafone"); /*Spain*/
        init.put("21404","Yoigo"); /*Spain*/
        init.put("41305","Airtel"); /*Sri Lanka*/
        init.put("41302","Dialog"); /*Sri Lanka*/
        init.put("41308","Hutch Sri Lanka"); /*Sri Lanka*/
        init.put("41301","Mobitel"); /*Sri Lanka*/
        init.put("41303","Tigo"); /*Sri Lanka*/
        init.put("63401","Mobitel / Mobile Telephone Company"); /*Sudan*/
        init.put("63402","MTN"); /*Sudan*/
        init.put("63407","Sudani One"); /*Sudan*/
        init.put("63405","Vivacell"); /*Sudan*/
        init.put("74603","Digicel"); /*Suriname*/
        init.put("74602","Telesu"); /*Suriname*/
        init.put("74604","Uniqa"); /*Suriname*/
        init.put("65310","Swazi MTN"); /*Swaziland*/
        init.put("24002","3 HUTCHISON"); /*Sweden*/
        init.put("24004","3G Infrastructure Services"); /*Sweden*/
        init.put("24016","42IT"); /*Sweden*/
        init.put("24021","Banverket"); /*Sweden*/
        init.put("24012","Barablu Mobile Scandinavia"); /*Sweden*/
        init.put("24026","Beepsend"); /*Sweden*/
        init.put("24025","DigiTelMobile"); /*Sweden*/
        init.put("24017","Gotanet"); /*Sweden*/
        init.put("24000","Halebop"); /*Sweden*/
        init.put("24011","Lindholmen Science Park"); /*Sweden*/
        init.put("24033","Mobile Arts AB"); /*Sweden*/
        init.put("24003","Nordisk Mobiltelefon"); /*Sweden*/
        init.put("24010","SpringMobil"); /*Sweden*/
        init.put("24024","Sweden 2G"); /*Sweden*/
        init.put("24024","Sweden 2G"); /*Sweden*/
        init.put("24005","Sweden 3G"); /*Sweden*/
        init.put("24014","TDC Mobil"); /*Sweden*/
        init.put("24007","Tele2Comviq"); /*Sweden*/
        init.put("24006","Telenor"); /*Sweden*/
        init.put("24008","Telenor"); /*Sweden*/
        init.put("24009","Telenor Mobile Sverige"); /*Sweden*/
        init.put("24001","TeliaSonera Mobile Networks"); /*Sweden*/
        init.put("24013","Ventelo Sverige"); /*Sweden*/
        init.put("24020","Wireless Maingate"); /*Sweden*/
        init.put("24015","Wireless Maingate Nordic"); /*Sweden*/
        init.put("22850","3G Mobile AG"); /*Switzerland*/
        init.put("22851","BebbiCell AG"); /*Switzerland*/
        init.put("22807","IN&Phone"); /*Switzerland*/
        init.put("22803","Orange"); /*Switzerland*/
        init.put("22806","SBB AG"); /*Switzerland*/
        init.put("22802","Sunrise"); /*Switzerland*/
        init.put("22801","Swisscom"); /*Switzerland*/
        init.put("22808","Tele2"); /*Switzerland*/
        init.put("22805","Togewanet AG (Comfone)"); /*Switzerland*/
        init.put("41702","MTN Syria"); /*Syria*/
        init.put("41701","SyriaTel"); /*Syria*/
        init.put("46602","APTG"); /*Taiwan*/
        init.put("46605","APTG"); /*Taiwan*/
        init.put("46611","Chunghwa LDM"); /*Taiwan*/
        init.put("46692","Chungwa"); /*Taiwan*/
        init.put("46601","FarEasTone"); /*Taiwan*/
        init.put("46688","KG Telecom"); /*Taiwan*/
        init.put("46693","MobiTai"); /*Taiwan*/
        init.put("46697","Taiwan Mobile"); /*Taiwan*/
        init.put("46699","TransAsia"); /*Taiwan*/
        init.put("46606","Tuntex"); /*Taiwan*/
        init.put("46689","VIBO"); /*Taiwan*/
        init.put("43604","Babilon-M"); /*Tajikistan*/
        init.put("43605","CTJTHSC Tajik-tel"); /*Tajikistan*/
        init.put("43602","Indigo"); /*Tajikistan*/
        init.put("43603","MLT"); /*Tajikistan*/
        init.put("43601","Somoncom"); /*Tajikistan*/
        init.put("43612","Tcell"); /*Tajikistan*/
        init.put("64009","Hits"); /*Tanzania*/
        init.put("64002","Mobitel"); /*Tanzania*/
        init.put("64006","Sasatel"); /*Tanzania*/
        init.put("64011","SmileCom"); /*Tanzania*/
        init.put("64001","Tritel"); /*Tanzania*/
        init.put("64007","TTCL Mobile"); /*Tanzania*/
        init.put("64008","TTCL Mobile"); /*Tanzania*/
        init.put("64004","Vodacom"); /*Tanzania*/
        init.put("64005","Zain"); /*Tanzania*/
        init.put("64003","Zantel"); /*Tanzania*/
        init.put("52015","ACT Mobile"); /*Thailand*/
        init.put("52001","Advanced Info Service"); /*Thailand*/
        init.put("52023","Advanced Info Service"); /*Thailand*/
        init.put("52000","CAT CDMA"); /*Thailand*/
        init.put("52002","CAT CDMA"); /*Thailand*/
        init.put("52018","DTAC"); /*Thailand*/
        init.put("52099","True Move"); /*Thailand*/
        init.put("52010","WCS IQ"); /*Thailand*/
        init.put("61503","Moov"); /*Togo*/
        init.put("61505","Telecel"); /*Togo*/
        init.put("61501","Togo Cell"); /*Togo*/
        init.put("53988","Digicel"); /*Tonga*/
        init.put("53943","Shoreline Communication"); /*Tonga*/
        init.put("53901","Tonga Communications Corporation"); /*Tonga*/
        init.put("37412","bmobile"); /*Trinidad and Tobago*/
        init.put("37413","Digicel"); /*Trinidad and Tobago*/
        init.put("374130","Digicel"); /*Trinidad and Tobago*/
        init.put("60501","Orange"); /*Tunisia*/
        init.put("60502","Tunicell"); /*Tunisia*/
        init.put("60503","Tunisiana"); /*Tunisia*/
        init.put("28603","Avea"); /*Turkey*/
        init.put("28604","Aycell"); /*Turkey*/
        init.put("28601","Turkcell"); /*Turkey*/
        init.put("28602","Vodafone"); /*Turkey*/
        init.put("43801","MTS"); /*Turkmenistan*/
        init.put("43802","TM-Cell"); /*Turkmenistan*/
        init.put("55301","TTC"); /*Tuvalu*/
        init.put("64110","MTN"); /*Uganda*/
        init.put("64114","Orange"); /*Uganda*/
        init.put("64111","Uganda Telecom Ltd."); /*Uganda*/
        init.put("64122","Warid Telecom"); /*Uganda*/
        init.put("64101","Zain"); /*Uganda*/
        init.put("25502","Beeline"); /*Ukraine*/
        init.put("25523","CDMA Ukraine"); /*Ukraine*/
        init.put("25505","Golden Telecom"); /*Ukraine*/
        init.put("25504","IT"); /*Ukraine*/
        init.put("25503","Kyivstar"); /*Ukraine*/
        init.put("25506","life:)"); /*Ukraine*/
        init.put("25501","MTS"); /*Ukraine*/
        init.put("25521","PEOPLEnet"); /*Ukraine*/
        init.put("25507","Utel"); /*Ukraine*/
        init.put("42403","du"); /*United Arab Emirates*/
        init.put("42402","Etisalat"); /*United Arab Emirates*/
        init.put("23420","3 Hutchison"); /*United Kingdom*/
        init.put("23400","BT"); /*United Kingdom*/
        init.put("23455","Cable & Wireless / Sure Mobile (Isle of Man)"); /*United Kingdom*/
        init.put("23418","Cloud9"); /*United Kingdom*/
        init.put("23403","Jersey Telenet"); /*United Kingdom*/
        init.put("23450","JT-Wave"); /*United Kingdom*/
        init.put("23458","Manx Telecom"); /*United Kingdom*/
        init.put("23401","MCom"); /*United Kingdom*/
        init.put("23402","O2"); /*United Kingdom*/
        init.put("23410","O2"); /*United Kingdom*/
        init.put("23411","O2"); /*United Kingdom*/
        init.put("23433","Orange"); /*United Kingdom*/
        init.put("23434","Orange"); /*United Kingdom*/
        init.put("23412","Railtrack"); /*United Kingdom*/
        init.put("23422","Routo Telecom"); /*United Kingdom*/
        init.put("23409","Sure Mobile"); /*United Kingdom*/
        init.put("23430","T-Mobile"); /*United Kingdom*/
        init.put("23419","Telaware"); /*United Kingdom*/
        init.put("234100","Tesco Mobile"); /*United Kingdom*/
        init.put("23477","Unknown"); /*United Kingdom*/
        init.put("23431","Virgin"); /*United Kingdom*/
        init.put("23432","Virgin"); /*United Kingdom*/
        init.put("23415","Vodafone"); /*United Kingdom*/
        init.put("310880","Advantage"); /*United States*/
        init.put("310850","Aeris"); /*United States*/
        init.put("310640","Airadigm"); /*United States*/
        init.put("310780","Airlink PCS"); /*United States*/
        init.put("310034","Airpeak"); /*United States*/
        init.put("310510","Airtel"); /*United States*/
        init.put("310430","Alaska Digitel"); /*United States*/
        init.put("310500","Alltel"); /*United States*/
        init.put("310590","Alltel"); /*United States*/
        init.put("310630","AmeriLink PCS"); /*United States*/
        init.put("310038","AT&T"); /*United States*/
        init.put("310090","AT&T"); /*United States*/
        init.put("310150","AT&T"); /*United States*/
        init.put("310170","AT&T"); /*United States*/
        init.put("310410","AT&T"); /*United States*/
        init.put("310560","AT&T"); /*United States*/
        init.put("310680","AT&T"); /*United States*/
        init.put("310380","AT&T Mobility"); /*United States*/
        init.put("310980","AT&T Mobility"); /*United States*/
        init.put("310990","AT&T Mobility"); /*United States*/
        init.put("310830","Caprock"); /*United States*/
        init.put("310350","Carolina Phone"); /*United States*/
        init.put("311130","Cell One Amarillo"); /*United States*/
        init.put("310320","Cellular One"); /*United States*/
        init.put("310440","Cellular One"); /*United States*/
        init.put("310390","Cellular One of East Texas"); /*United States*/
        init.put("311190","Cellular Properties"); /*United States*/
        init.put("310030","Centennial"); /*United States*/
        init.put("311010","Chariton Valley"); /*United States*/
        init.put("310570","Chinook Wireless"); /*United States*/
        init.put("310480","Choice Phone"); /*United States*/
        init.put("311120","Choice Phone"); /*United States*/
        init.put("310420","Cincinnati Bell"); /*United States*/
        init.put("311180","Cingular Wireless"); /*United States*/
        init.put("310620","Coleman County Telecom"); /*United States*/
        init.put("311040","Commnet Wireless"); /*United States*/
        init.put("310040","Concho"); /*United States*/
        init.put("310690","Conestoga"); /*United States*/
        init.put("310060","Consolidated Telcom"); /*United States*/
        init.put("310740","Convey"); /*United States*/
        init.put("310080","Corr"); /*United States*/
        init.put("310016","Cricket Communications"); /*United States*/
        init.put("310940","Digital Cellular"); /*United States*/
        init.put("310190","Dutch Harbor"); /*United States*/
        init.put("311070","Easterbrooke"); /*United States*/
        init.put("311160","Endless Mountains Wireless"); /*United States*/
        init.put("310610","Epic Touch"); /*United States*/
        init.put("311060","Farmers Cellular"); /*United States*/
        init.put("311210","Farmers Cellular"); /*United States*/
        init.put("310311","Farmers Wireless"); /*United States*/
        init.put("310910","First Cellular"); /*United States*/
        init.put("310300","Get Mobile Inc"); /*United States*/
        init.put("310970","Globalstar"); /*United States*/
        init.put("311100","High Plains Wireless"); /*United States*/
        init.put("311110","High Plains Wireless"); /*United States*/
        init.put("310070","Highland Cellular"); /*United States*/
        init.put("310400","i CAN_GSM"); /*United States*/
        init.put("310770","i wireless"); /*United States*/
        init.put("311030","Indigo Wireless"); /*United States*/
        init.put("310650","Jasper"); /*United States*/
        init.put("311090","Long Lines Wireless"); /*United States*/
        init.put("310010","MCI"); /*United States*/
        init.put("310000","Mid-Tex Cellular"); /*United States*/
        init.put("311000","Mid-Tex Cellular"); /*United States*/
        init.put("311020","Missouri RSA 5 Partnership"); /*United States*/
        init.put("310013","MobileTel"); /*United States*/
        init.put("316010","Nextel"); /*United States*/
        init.put("310017","North Sight Communications Inc."); /*United States*/
        init.put("310670","Northstar"); /*United States*/
        init.put("310540","Oklahoma Western"); /*United States*/
        init.put("310870","PACE"); /*United States*/
        init.put("310760","Panhandle"); /*United States*/
        init.put("311170","PetroCom"); /*United States*/
        init.put("311080","Pine Cellular"); /*United States*/
        init.put("310790","PinPoint"); /*United States*/
        init.put("310100","Plateau Wireless"); /*United States*/
        init.put("310960","Plateau Wireless"); /*United States*/
        init.put("310110","PTI Pacifica"); /*United States*/
        init.put("310730","SeaMobile"); /*United States*/
        init.put("310046","SIMMETRY"); /*United States*/
        init.put("310460","Simmetry"); /*United States*/
        init.put("316011","Southern Communications Services"); /*United States*/
        init.put("310120","Sprint"); /*United States*/
        init.put("311140","Sprocket"); /*United States*/
        init.put("310490","SunCom"); /*United States*/
        init.put("310026","T-Mobile"); /*United States*/
        init.put("310160","T-Mobile"); /*United States*/
        init.put("310200","T-Mobile"); /*United States*/
        init.put("310210","T-Mobile"); /*United States*/
        init.put("310220","T-Mobile"); /*United States*/
        init.put("310230","T-Mobile"); /*United States*/
        init.put("310240","T-Mobile"); /*United States*/
        init.put("310250","T-Mobile"); /*United States*/
        init.put("310260","T-Mobile"); /*United States*/
        init.put("310270","T-Mobile"); /*United States*/
        init.put("310280","T-Mobile"); /*United States*/
        init.put("310290","T-Mobile"); /*United States*/
        init.put("310310","T-Mobile"); /*United States*/
        init.put("310330","T-Mobile"); /*United States*/
        init.put("310580","T-Mobile"); /*United States*/
        init.put("310660","T-Mobile"); /*United States*/
        init.put("310800","T-Mobile"); /*United States*/
        init.put("310900","Taylor"); /*United States*/
        init.put("310014","Testing"); /*United States*/
        init.put("310020","Union Telephone Company"); /*United States*/
        init.put("310520","VeriSign"); /*United States*/
        init.put("20404","Verizon"); /*United States*/
        init.put("246081","Verizon"); /*United States*/
        init.put("310004","Verizon"); /*United States*/
        init.put("310012","Verizon"); /*United States*/
        init.put("311480","Verizon"); /*United States*/
        init.put("310450","Viaero"); /*United States*/
        init.put("310180","West Central"); /*United States*/
        init.put("310530","West Virginia Wireless"); /*United States*/
        init.put("310340","Westlink"); /*United States*/
        init.put("311050","Wikes Cellular"); /*United States*/
        init.put("311150","Wilkes Cellular"); /*United States*/
        init.put("310890","Wireless Alliance"); /*United States*/
        init.put("310950","XIT Wireless"); /*United States*/
        init.put("74800","Ancel"); /*Uruguay*/
        init.put("74801","Ancel"); /*Uruguay*/
        init.put("74810","Claro"); /*Uruguay*/
        init.put("74807","Movistar"); /*Uruguay*/
        init.put("43404","Beeline"); /*Uzbekistan*/
        init.put("43401","Buztel"); /*Uzbekistan*/
        init.put("43407","MTS"); /*Uzbekistan*/
        init.put("43406","Perfectum Mobile"); /*Uzbekistan*/
        init.put("43405","Ucell"); /*Uzbekistan*/
        init.put("43402","Uzmacom"); /*Uzbekistan*/
        init.put("54101","SMILE"); /*Vanuatu*/
        init.put("73401","Digitel"); /*Venezuela*/
        init.put("73402","Digitel"); /*Venezuela*/
        init.put("73403","Digitel"); /*Venezuela*/
        init.put("73406","Movilnet"); /*Venezuela*/
        init.put("73404","movistar"); /*Venezuela*/
        init.put("45208","3G EVNTelecom"); /*Vietnam*/
        init.put("45207","Beeline VN"); /*Vietnam*/
        init.put("45206","E-Mobile"); /*Vietnam*/
        init.put("45205","HT Mobile"); /*Vietnam*/
        init.put("45201","MobiFone"); /*Vietnam*/
        init.put("45203","S-Fone"); /*Vietnam*/
        init.put("45204","Viettel Mobile"); /*Vietnam*/
        init.put("45202","Vinaphone"); /*Vietnam*/
        init.put("376350","C&W"); /*Wyspy Turks i Caicos*/
        init.put("33805","Digicel"); /*Wyspy Turks i Caicos*/
        init.put("376352","Islandcom"); /*Wyspy Turks i Caicos*/
        init.put("42104","HiTS-UNITEL"); /*Yemen*/
        init.put("42102","MTN"); /*Yemen*/
        init.put("42101","SabaFon"); /*Yemen*/
        init.put("42103","Yemen Mobile"); /*Yemen*/
        init.put("64502","MTN"); /*Zambia*/
        init.put("64501","Zain"); /*Zambia*/
        init.put("64503","ZAMTEL"); /*Zambia*/
        init.put("64804","Econet"); /*Zimbabwe*/
        init.put("64801","Net*One"); /*Zimbabwe*/
        init.put("64803","Telecel"); /*Zimbabwe*/

        operators = Collections.unmodifiableMap(init);
    }

    public static String operatorReplace(String response){
        if(operators == null){
            initList();
        }
        return operators.containsKey(response) ? operators.get(response) : response;
    }
}
>>>>>>> 101ff7d... Removed if/elseif block and replaced with a static HashMap containing Operator ID's
