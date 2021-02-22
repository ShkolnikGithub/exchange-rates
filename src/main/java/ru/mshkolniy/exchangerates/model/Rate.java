package ru.mshkolniy.exchangerates.model;

import com.fasterxml.jackson.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonAutoDetect
//public class Rate {
////    @JsonProperty("RUB")
////    private BigDecimal RUB;
//    private Map<String, BigDecimal> rates;
//
//    public  Rate() {
//    }

//    public BigDecimal getRUB() {
//        return RUB;
//    }
//
//    public void setRUB(BigDecimal RUB) {
//        this.RUB = RUB;
//    }
//    public Map<String, BigDecimal> getRates() {
//        return rates;
//    }

//    public void setRates(Map<String, BigDecimal> rates) {
//        this.rates = rates;
//    }

//    public Rate() {
//        this.rates = new HashMap<>();
//    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "AED",
            "AFN",
            "ALL",
            "AMD",
            "ANG",
            "AOA",
            "ARS",
            "AUD",
            "AWG",
            "AZN",
            "BAM",
            "BBD",
            "BDT",
            "BGN",
            "BHD",
            "BIF",
            "BMD",
            "BND",
            "BOB",
            "BRL",
            "BSD",
            "BTC",
            "BTN",
            "BWP",
            "BYN",
            "BZD",
            "CAD",
            "CDF",
            "CHF",
            "CLF",
            "CLP",
            "CNH",
            "CNY",
            "COP",
            "CRC",
            "CUC",
            "CUP",
            "CVE",
            "CZK",
            "DJF",
            "DKK",
            "DOP",
            "DZD",
            "EGP",
            "ERN",
            "ETB",
            "EUR",
            "FJD",
            "FKP",
            "GBP",
            "GEL",
            "GGP",
            "GHS",
            "GIP",
            "GMD",
            "GNF",
            "GTQ",
            "GYD",
            "HKD",
            "HNL",
            "HRK",
            "HTG",
            "HUF",
            "IDR",
            "ILS",
            "IMP",
            "INR",
            "IQD",
            "IRR",
            "ISK",
            "JEP",
            "JMD",
            "JOD",
            "JPY",
            "KES",
            "KGS",
            "KHR",
            "KMF",
            "KPW",
            "KRW",
            "KWD",
            "KYD",
            "KZT",
            "LAK",
            "LBP",
            "LKR",
            "LRD",
            "LSL",
            "LYD",
            "MAD",
            "MDL",
            "MGA",
            "MKD",
            "MMK",
            "MNT",
            "MOP",
            "MRO",
            "MRU",
            "MUR",
            "MVR",
            "MWK",
            "MXN",
            "MYR",
            "MZN",
            "NAD",
            "NGN",
            "NIO",
            "NOK",
            "NPR",
            "NZD",
            "OMR",
            "PAB",
            "PEN",
            "PGK",
            "PHP",
            "PKR",
            "PLN",
            "PYG",
            "QAR",
            "RON",
            "RSD",
            "RUB",
            "RWF",
            "SAR",
            "SBD",
            "SCR",
            "SDG",
            "SEK",
            "SGD",
            "SHP",
            "SLL",
            "SOS",
            "SRD",
            "SSP",
            "STD",
            "STN",
            "SVC",
            "SYP",
            "SZL",
            "THB",
            "TJS",
            "TMT",
            "TND",
            "TOP",
            "TRY",
            "TTD",
            "TWD",
            "TZS",
            "UAH",
            "UGX",
            "USD",
            "UYU",
            "UZS",
            "VES",
            "VND",
            "VUV",
            "WST",
            "XAF",
            "XAG",
            "XAU",
            "XCD",
            "XDR",
            "XOF",
            "XPD",
            "XPF",
            "XPT",
            "YER",
            "ZAR",
            "ZMW",
            "ZWL"
    })
    public class Rate {

        @JsonProperty("AED")
        public BigDecimal aED;
        @JsonProperty("AFN")
        public BigDecimal aFN;
        @JsonProperty("ALL")
        public BigDecimal aLL;
        @JsonProperty("AMD")
        public BigDecimal aMD;
        @JsonProperty("ANG")
        public BigDecimal aNG;
        @JsonProperty("AOA")
        public BigDecimal aOA;
        @JsonProperty("ARS")
        public BigDecimal aRS;
        @JsonProperty("AUD")
        public BigDecimal aUD;
        @JsonProperty("AWG")
        public BigDecimal aWG;
        @JsonProperty("AZN")
        public BigDecimal aZN;
        @JsonProperty("BAM")
        public BigDecimal bAM;
        @JsonProperty("BBD")
        public BigDecimal bBD;
        @JsonProperty("BDT")
        public BigDecimal bDT;
        @JsonProperty("BGN")
        public BigDecimal bGN;
        @JsonProperty("BHD")
        public BigDecimal bHD;
        @JsonProperty("BIF")
        public BigDecimal bIF;
        @JsonProperty("BMD")
        public BigDecimal bMD;
        @JsonProperty("BND")
        public BigDecimal bND;
        @JsonProperty("BOB")
        public BigDecimal bOB;
        @JsonProperty("BRL")
        public BigDecimal bRL;
        @JsonProperty("BSD")
        public BigDecimal bSD;
        @JsonProperty("BTC")
        public BigDecimal bTC;
        @JsonProperty("BTN")
        public BigDecimal bTN;
        @JsonProperty("BWP")
        public BigDecimal bWP;
        @JsonProperty("BYN")
        public BigDecimal bYN;
        @JsonProperty("BZD")
        public BigDecimal bZD;
        @JsonProperty("CAD")
        public BigDecimal cAD;
        @JsonProperty("CDF")
        public BigDecimal cDF;
        @JsonProperty("CHF")
        public BigDecimal cHF;
        @JsonProperty("CLF")
        public BigDecimal cLF;
        @JsonProperty("CLP")
        public BigDecimal cLP;
        @JsonProperty("CNH")
        public BigDecimal cNH;
        @JsonProperty("CNY")
        public BigDecimal cNY;
        @JsonProperty("COP")
        public BigDecimal cOP;
        @JsonProperty("CRC")
        public BigDecimal cRC;
        @JsonProperty("CUC")
        public BigDecimal cUC;
        @JsonProperty("CUP")
        public BigDecimal cUP;
        @JsonProperty("CVE")
        public BigDecimal cVE;
        @JsonProperty("CZK")
        public BigDecimal cZK;
        @JsonProperty("DJF")
        public BigDecimal dJF;
        @JsonProperty("DKK")
        public BigDecimal dKK;
        @JsonProperty("DOP")
        public BigDecimal dOP;
        @JsonProperty("DZD")
        public BigDecimal dZD;
        @JsonProperty("EGP")
        public BigDecimal eGP;
        @JsonProperty("ERN")
        public BigDecimal eRN;
        @JsonProperty("ETB")
        public BigDecimal eTB;
        @JsonProperty("EUR")
        public BigDecimal eUR;
        @JsonProperty("FJD")
        public BigDecimal fJD;
        @JsonProperty("FKP")
        public BigDecimal fKP;
        @JsonProperty("GBP")
        public BigDecimal gBP;
        @JsonProperty("GEL")
        public BigDecimal gEL;
        @JsonProperty("GGP")
        public BigDecimal gGP;
        @JsonProperty("GHS")
        public BigDecimal gHS;
        @JsonProperty("GIP")
        public BigDecimal gIP;
        @JsonProperty("GMD")
        public BigDecimal gMD;
        @JsonProperty("GNF")
        public BigDecimal gNF;
        @JsonProperty("GTQ")
        public BigDecimal gTQ;
        @JsonProperty("GYD")
        public BigDecimal gYD;
        @JsonProperty("HKD")
        public BigDecimal hKD;
        @JsonProperty("HNL")
        public BigDecimal hNL;
        @JsonProperty("HRK")
        public BigDecimal hRK;
        @JsonProperty("HTG")
        public BigDecimal hTG;
        @JsonProperty("HUF")
        public BigDecimal hUF;
        @JsonProperty("IDR")
        public BigDecimal iDR;
        @JsonProperty("ILS")
        public BigDecimal iLS;
        @JsonProperty("IMP")
        public BigDecimal iMP;
        @JsonProperty("INR")
        public BigDecimal iNR;
        @JsonProperty("IQD")
        public BigDecimal iQD;
        @JsonProperty("IRR")
        public BigDecimal iRR;
        @JsonProperty("ISK")
        public BigDecimal iSK;
        @JsonProperty("JEP")
        public BigDecimal jEP;
        @JsonProperty("JMD")
        public BigDecimal jMD;
        @JsonProperty("JOD")
        public BigDecimal jOD;
        @JsonProperty("JPY")
        public BigDecimal jPY;
        @JsonProperty("KES")
        public BigDecimal kES;
        @JsonProperty("KGS")
        public BigDecimal kGS;
        @JsonProperty("KHR")
        public BigDecimal kHR;
        @JsonProperty("KMF")
        public BigDecimal kMF;
        @JsonProperty("KPW")
        public BigDecimal kPW;
        @JsonProperty("KRW")
        public BigDecimal kRW;
        @JsonProperty("KWD")
        public BigDecimal kWD;
        @JsonProperty("KYD")
        public BigDecimal kYD;
        @JsonProperty("KZT")
        public BigDecimal kZT;
        @JsonProperty("LAK")
        public BigDecimal lAK;
        @JsonProperty("LBP")
        public BigDecimal lBP;
        @JsonProperty("LKR")
        public BigDecimal lKR;
        @JsonProperty("LRD")
        public BigDecimal lRD;
        @JsonProperty("LSL")
        public BigDecimal lSL;
        @JsonProperty("LYD")
        public BigDecimal lYD;
        @JsonProperty("MAD")
        public BigDecimal mAD;
        @JsonProperty("MDL")
        public BigDecimal mDL;
        @JsonProperty("MGA")
        public BigDecimal mGA;
        @JsonProperty("MKD")
        public BigDecimal mKD;
        @JsonProperty("MMK")
        public BigDecimal mMK;
        @JsonProperty("MNT")
        public BigDecimal mNT;
        @JsonProperty("MOP")
        public BigDecimal mOP;
        @JsonProperty("MRO")
        public BigDecimal mRO;
        @JsonProperty("MRU")
        public BigDecimal mRU;
        @JsonProperty("MUR")
        public BigDecimal mUR;
        @JsonProperty("MVR")
        public BigDecimal mVR;
        @JsonProperty("MWK")
        public BigDecimal mWK;
        @JsonProperty("MXN")
        public BigDecimal mXN;
        @JsonProperty("MYR")
        public BigDecimal mYR;
        @JsonProperty("MZN")
        public BigDecimal mZN;
        @JsonProperty("NAD")
        public BigDecimal nAD;
        @JsonProperty("NGN")
        public BigDecimal nGN;
        @JsonProperty("NIO")
        public BigDecimal nIO;
        @JsonProperty("NOK")
        public BigDecimal nOK;
        @JsonProperty("NPR")
        public BigDecimal nPR;
        @JsonProperty("NZD")
        public BigDecimal nZD;
        @JsonProperty("OMR")
        public BigDecimal oMR;
        @JsonProperty("PAB")
        public BigDecimal pAB;
        @JsonProperty("PEN")
        public BigDecimal pEN;
        @JsonProperty("PGK")
        public BigDecimal pGK;
        @JsonProperty("PHP")
        public BigDecimal pHP;
        @JsonProperty("PKR")
        public BigDecimal pKR;
        @JsonProperty("PLN")
        public BigDecimal pLN;
        @JsonProperty("PYG")
        public BigDecimal pYG;
        @JsonProperty("QAR")
        public BigDecimal qAR;
        @JsonProperty("RON")
        public BigDecimal rON;
        @JsonProperty("RSD")
        public BigDecimal rSD;
        @JsonProperty("RUB")
        public BigDecimal rUB;
        @JsonProperty("RWF")
        public BigDecimal rWF;
        @JsonProperty("SAR")
        public BigDecimal sAR;
        @JsonProperty("SBD")
        public BigDecimal sBD;
        @JsonProperty("SCR")
        public BigDecimal sCR;
        @JsonProperty("SDG")
        public BigDecimal sDG;
        @JsonProperty("SEK")
        public BigDecimal sEK;
        @JsonProperty("SGD")
        public BigDecimal sGD;
        @JsonProperty("SHP")
        public BigDecimal sHP;
        @JsonProperty("SLL")
        public BigDecimal sLL;
        @JsonProperty("SOS")
        public BigDecimal sOS;
        @JsonProperty("SRD")
        public BigDecimal sRD;
        @JsonProperty("SSP")
        public BigDecimal sSP;
        @JsonProperty("STD")
        public BigDecimal sTD;
        @JsonProperty("STN")
        public BigDecimal sTN;
        @JsonProperty("SVC")
        public BigDecimal sVC;
        @JsonProperty("SYP")
        public BigDecimal sYP;
        @JsonProperty("SZL")
        public BigDecimal sZL;
        @JsonProperty("THB")
        public BigDecimal tHB;
        @JsonProperty("TJS")
        public BigDecimal tJS;
        @JsonProperty("TMT")
        public BigDecimal tMT;
        @JsonProperty("TND")
        public BigDecimal tND;
        @JsonProperty("TOP")
        public BigDecimal tOP;
        @JsonProperty("TRY")
        public BigDecimal tRY;
        @JsonProperty("TTD")
        public BigDecimal tTD;
        @JsonProperty("TWD")
        public BigDecimal tWD;
        @JsonProperty("TZS")
        public BigDecimal tZS;
        @JsonProperty("UAH")
        public BigDecimal uAH;
        @JsonProperty("UGX")
        public BigDecimal uGX;
        @JsonProperty("USD")
        public BigDecimal uSD;
        @JsonProperty("UYU")
        public BigDecimal uYU;
        @JsonProperty("UZS")
        public BigDecimal uZS;
        @JsonProperty("VES")
        public BigDecimal vES;
        @JsonProperty("VND")
        public BigDecimal vND;
        @JsonProperty("VUV")
        public BigDecimal vUV;
        @JsonProperty("WST")
        public BigDecimal wST;
        @JsonProperty("XAF")
        public BigDecimal xAF;
        @JsonProperty("XAG")
        public BigDecimal xAG;
        @JsonProperty("XAU")
        public BigDecimal xAU;
        @JsonProperty("XCD")
        public BigDecimal xCD;
        @JsonProperty("XDR")
        public BigDecimal xDR;
        @JsonProperty("XOF")
        public BigDecimal xOF;
        @JsonProperty("XPD")
        public BigDecimal xPD;
        @JsonProperty("XPF")
        public BigDecimal xPF;
        @JsonProperty("XPT")
        public BigDecimal xPT;
        @JsonProperty("YER")
        public BigDecimal yER;
        @JsonProperty("ZAR")
        public BigDecimal zAR;
        @JsonProperty("ZMW")
        public BigDecimal zMW;
        @JsonProperty("ZWL")
        public BigDecimal zWL;

        public Rate() {}

        public BigDecimal get(String name) {

            return aED;
        }

        public BigDecimal getaED() {
            return aED;
        }

        public BigDecimal getaFN() {
            return aFN;
        }

        public BigDecimal getaLL() {
            return aLL;
        }

        public BigDecimal getaMD() {
            return aMD;
        }

        public BigDecimal getaNG() {
            return aNG;
        }

        public BigDecimal getaOA() {
            return aOA;
        }

        public BigDecimal getaRS() {
            return aRS;
        }

        public BigDecimal getaUD() {
            return aUD;
        }

        public BigDecimal getaWG() {
            return aWG;
        }

        public BigDecimal getaZN() {
            return aZN;
        }

        public BigDecimal getbAM() {
            return bAM;
        }

        public BigDecimal getbBD() {
            return bBD;
        }

        public BigDecimal getbDT() {
            return bDT;
        }

        public BigDecimal getbGN() {
            return bGN;
        }

        public BigDecimal getbHD() {
            return bHD;
        }

        public BigDecimal getbIF() {
            return bIF;
        }

        public BigDecimal getbMD() {
            return bMD;
        }

        public BigDecimal getbND() {
            return bND;
        }

        public BigDecimal getbOB() {
            return bOB;
        }

        public BigDecimal getbRL() {
            return bRL;
        }

        public BigDecimal getbSD() {
            return bSD;
        }

        public BigDecimal getbTC() {
            return bTC;
        }

        public BigDecimal getbTN() {
            return bTN;
        }

        public BigDecimal getbWP() {
            return bWP;
        }

        public BigDecimal getbYN() {
            return bYN;
        }

        public BigDecimal getbZD() {
            return bZD;
        }

        public BigDecimal getcAD() {
            return cAD;
        }

        public BigDecimal getcDF() {
            return cDF;
        }

        public BigDecimal getcHF() {
            return cHF;
        }

        public BigDecimal getcLF() {
            return cLF;
        }

        public BigDecimal getcLP() {
            return cLP;
        }

        public BigDecimal getcNH() {
            return cNH;
        }

        public BigDecimal getcNY() {
            return cNY;
        }

        public BigDecimal getcOP() {
            return cOP;
        }

        public BigDecimal getcRC() {
            return cRC;
        }

        public BigDecimal getcUC() {
            return cUC;
        }

        public BigDecimal getcUP() {
            return cUP;
        }

        public BigDecimal getcVE() {
            return cVE;
        }

        public BigDecimal getcZK() {
            return cZK;
        }

        public BigDecimal getdJF() {
            return dJF;
        }

        public BigDecimal getdKK() {
            return dKK;
        }

        public BigDecimal getdOP() {
            return dOP;
        }

        public BigDecimal getdZD() {
            return dZD;
        }

        public BigDecimal geteGP() {
            return eGP;
        }

        public BigDecimal geteRN() {
            return eRN;
        }

        public BigDecimal geteTB() {
            return eTB;
        }

        public BigDecimal geteUR() {
            return eUR;
        }

        public BigDecimal getfJD() {
            return fJD;
        }

        public BigDecimal getfKP() {
            return fKP;
        }

        public BigDecimal getgBP() {
            return gBP;
        }

        public BigDecimal getgEL() {
            return gEL;
        }

        public BigDecimal getgGP() {
            return gGP;
        }

        public BigDecimal getgHS() {
            return gHS;
        }

        public BigDecimal getgIP() {
            return gIP;
        }

        public BigDecimal getgMD() {
            return gMD;
        }

        public BigDecimal getgNF() {
            return gNF;
        }

        public BigDecimal getgTQ() {
            return gTQ;
        }

        public BigDecimal getgYD() {
            return gYD;
        }

        public BigDecimal gethKD() {
            return hKD;
        }

        public BigDecimal gethNL() {
            return hNL;
        }

        public BigDecimal gethRK() {
            return hRK;
        }

        public BigDecimal gethTG() {
            return hTG;
        }

        public BigDecimal gethUF() {
            return hUF;
        }

        public BigDecimal getiDR() {
            return iDR;
        }

        public BigDecimal getiLS() {
            return iLS;
        }

        public BigDecimal getiMP() {
            return iMP;
        }

        public BigDecimal getiNR() {
            return iNR;
        }

        public BigDecimal getiQD() {
            return iQD;
        }

        public BigDecimal getiRR() {
            return iRR;
        }

        public BigDecimal getiSK() {
            return iSK;
        }

        public BigDecimal getjEP() {
            return jEP;
        }

        public BigDecimal getjMD() {
            return jMD;
        }

        public BigDecimal getjOD() {
            return jOD;
        }

        public BigDecimal getjPY() {
            return jPY;
        }

        public BigDecimal getkES() {
            return kES;
        }

        public BigDecimal getkGS() {
            return kGS;
        }

        public BigDecimal getkHR() {
            return kHR;
        }

        public BigDecimal getkMF() {
            return kMF;
        }

        public BigDecimal getkPW() {
            return kPW;
        }

        public BigDecimal getkRW() {
            return kRW;
        }

        public BigDecimal getkWD() {
            return kWD;
        }

        public BigDecimal getkYD() {
            return kYD;
        }

        public BigDecimal getkZT() {
            return kZT;
        }

        public BigDecimal getlAK() {
            return lAK;
        }

        public BigDecimal getlBP() {
            return lBP;
        }

        public BigDecimal getlKR() {
            return lKR;
        }

        public BigDecimal getlRD() {
            return lRD;
        }

        public BigDecimal getlSL() {
            return lSL;
        }

        public BigDecimal getlYD() {
            return lYD;
        }

        public BigDecimal getmAD() {
            return mAD;
        }

        public BigDecimal getmDL() {
            return mDL;
        }

        public BigDecimal getmGA() {
            return mGA;
        }

        public BigDecimal getmKD() {
            return mKD;
        }

        public BigDecimal getmMK() {
            return mMK;
        }

        public BigDecimal getmNT() {
            return mNT;
        }

        public BigDecimal getmOP() {
            return mOP;
        }

        public BigDecimal getmRO() {
            return mRO;
        }

        public BigDecimal getmRU() {
            return mRU;
        }

        public BigDecimal getmUR() {
            return mUR;
        }

        public BigDecimal getmVR() {
            return mVR;
        }

        public BigDecimal getmWK() {
            return mWK;
        }

        public BigDecimal getmXN() {
            return mXN;
        }

        public BigDecimal getmYR() {
            return mYR;
        }

        public BigDecimal getmZN() {
            return mZN;
        }

        public BigDecimal getnAD() {
            return nAD;
        }

        public BigDecimal getnGN() {
            return nGN;
        }

        public BigDecimal getnIO() {
            return nIO;
        }

        public BigDecimal getnOK() {
            return nOK;
        }

        public BigDecimal getnPR() {
            return nPR;
        }

        public BigDecimal getnZD() {
            return nZD;
        }

        public BigDecimal getoMR() {
            return oMR;
        }

        public BigDecimal getpAB() {
            return pAB;
        }

        public BigDecimal getpEN() {
            return pEN;
        }

        public BigDecimal getpGK() {
            return pGK;
        }

        public BigDecimal getpHP() {
            return pHP;
        }

        public BigDecimal getpKR() {
            return pKR;
        }

        public BigDecimal getpLN() {
            return pLN;
        }

        public BigDecimal getpYG() {
            return pYG;
        }

        public BigDecimal getqAR() {
            return qAR;
        }

        public BigDecimal getrON() {
            return rON;
        }

        public BigDecimal getrSD() {
            return rSD;
        }

        public BigDecimal getrUB() {
            return rUB;
        }

        public BigDecimal getrWF() {
            return rWF;
        }

        public BigDecimal getsAR() {
            return sAR;
        }

        public BigDecimal getsBD() {
            return sBD;
        }

        public BigDecimal getsCR() {
            return sCR;
        }

        public BigDecimal getsDG() {
            return sDG;
        }

        public BigDecimal getsEK() {
            return sEK;
        }

        public BigDecimal getsGD() {
            return sGD;
        }

        public BigDecimal getsHP() {
            return sHP;
        }

        public BigDecimal getsLL() {
            return sLL;
        }

        public BigDecimal getsOS() {
            return sOS;
        }

        public BigDecimal getsRD() {
            return sRD;
        }

        public BigDecimal getsSP() {
            return sSP;
        }

        public BigDecimal getsTD() {
            return sTD;
        }

        public BigDecimal getsTN() {
            return sTN;
        }

        public BigDecimal getsVC() {
            return sVC;
        }

        public BigDecimal getsYP() {
            return sYP;
        }

        public BigDecimal getsZL() {
            return sZL;
        }

        public BigDecimal gettHB() {
            return tHB;
        }

        public BigDecimal gettJS() {
            return tJS;
        }

        public BigDecimal gettMT() {
            return tMT;
        }

        public BigDecimal gettND() {
            return tND;
        }

        public BigDecimal gettOP() {
            return tOP;
        }

        public BigDecimal gettRY() {
            return tRY;
        }

        public BigDecimal gettTD() {
            return tTD;
        }

        public BigDecimal gettWD() {
            return tWD;
        }

        public BigDecimal gettZS() {
            return tZS;
        }

        public BigDecimal getuAH() {
            return uAH;
        }

        public BigDecimal getuGX() {
            return uGX;
        }

        public BigDecimal getuSD() {
            return uSD;
        }

        public BigDecimal getuYU() {
            return uYU;
        }

        public BigDecimal getuZS() {
            return uZS;
        }

        public BigDecimal getvES() {
            return vES;
        }

        public BigDecimal getvND() {
            return vND;
        }

        public BigDecimal getvUV() {
            return vUV;
        }

        public BigDecimal getwST() {
            return wST;
        }

        public BigDecimal getxAF() {
            return xAF;
        }

        public BigDecimal getxAG() {
            return xAG;
        }

        public BigDecimal getxAU() {
            return xAU;
        }

        public BigDecimal getxCD() {
            return xCD;
        }

        public BigDecimal getxDR() {
            return xDR;
        }

        public BigDecimal getxOF() {
            return xOF;
        }

        public BigDecimal getxPD() {
            return xPD;
        }

        public BigDecimal getxPF() {
            return xPF;
        }

        public BigDecimal getxPT() {
            return xPT;
        }

        public BigDecimal getyER() {
            return yER;
        }

        public BigDecimal getzAR() {
            return zAR;
        }

        public BigDecimal getzMW() {
            return zMW;
        }

        public BigDecimal getzWL() {
            return zWL;
        }
    }
