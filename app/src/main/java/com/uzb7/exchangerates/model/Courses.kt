package com.uzb7.exchangerates.model

import com.google.gson.annotations.SerializedName

data class Courses(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("rates")
	val rates: Rates? = null,

	@field:SerializedName("timestamp")
	val timestamp: Int? = null,

	@field:SerializedName("base")
	val base: String? = null
)

data class Rates(

	@field:SerializedName("FJD")
	val fJD: Any? = null,

	@field:SerializedName("MXN")
	val mXN: Any? = null,

	@field:SerializedName("STD")
	val sTD: Any? = null,

	@field:SerializedName("LVL")
	val lVL: Any? = null,

	@field:SerializedName("SCR")
	val sCR: Any? = null,

	@field:SerializedName("CDF")
	val cDF: Any? = null,

	@field:SerializedName("BBD")
	val bBD: Any? = null,

	@field:SerializedName("GTQ")
	val gTQ: Any? = null,

	@field:SerializedName("CLP")
	val cLP: Any? = null,

	@field:SerializedName("HNL")
	val hNL: Any? = null,

	@field:SerializedName("UGX")
	val uGX: Any? = null,

	@field:SerializedName("ZAR")
	val zAR: Any? = null,

	@field:SerializedName("TND")
	val tND: Any? = null,

	@field:SerializedName("SLE")
	val sLE: Any? = null,

	@field:SerializedName("CUC")
	val cUC: Any? = null,

	@field:SerializedName("BSD")
	val bSD: Any? = null,

	@field:SerializedName("SLL")
	val sLL: Any? = null,

	@field:SerializedName("SDG")
	val sDG: Any? = null,

	@field:SerializedName("IQD")
	val iQD: Any? = null,

	@field:SerializedName("CUP")
	val cUP: Any? = null,

	@field:SerializedName("GMD")
	val gMD: Any? = null,

	@field:SerializedName("TWD")
	val tWD: Any? = null,

	@field:SerializedName("RSD")
	val rSD: Any? = null,

	@field:SerializedName("DOP")
	val dOP: Any? = null,

	@field:SerializedName("KMF")
	val kMF: Any? = null,

	@field:SerializedName("MYR")
	val mYR: Any? = null,

	@field:SerializedName("FKP")
	val fKP: Any? = null,

	@field:SerializedName("XOF")
	val xOF: Any? = null,

	@field:SerializedName("GEL")
	val gEL: Any? = null,

	@field:SerializedName("BTC")
	val bTC: Any? = null,

	@field:SerializedName("UYU")
	val uYU: Any? = null,

	@field:SerializedName("MAD")
	val mAD: Any? = null,

	@field:SerializedName("CVE")
	val cVE: Any? = null,

	@field:SerializedName("TOP")
	val tOP: Any? = null,

	@field:SerializedName("AZN")
	val aZN: Any? = null,

	@field:SerializedName("OMR")
	val oMR: Any? = null,

	@field:SerializedName("PGK")
	val pGK: Any? = null,

	@field:SerializedName("KES")
	val kES: Any? = null,

	@field:SerializedName("SEK")
	val sEK: Any? = null,

	@field:SerializedName("BTN")
	val bTN: Any? = null,

	@field:SerializedName("UAH")
	val uAH: Any? = null,

	@field:SerializedName("GNF")
	val gNF: Any? = null,

	@field:SerializedName("ERN")
	val eRN: Any? = null,

	@field:SerializedName("MZN")
	val mZN: Any? = null,

	@field:SerializedName("SVC")
	val sVC: Any? = null,

	@field:SerializedName("ARS")
	val aRS: Any? = null,

	@field:SerializedName("QAR")
	val qAR: Any? = null,

	@field:SerializedName("IRR")
	val iRR: Any? = null,

	@field:SerializedName("MRO")
	val mRO: Any? = null,

	@field:SerializedName("CNY")
	val cNY: Any? = null,

	@field:SerializedName("THB")
	val tHB: Any? = null,

	@field:SerializedName("UZS")
	val uZS: Any? = null,

	@field:SerializedName("XPF")
	val xPF: Any? = null,

	@field:SerializedName("BDT")
	val bDT: Any? = null,

	@field:SerializedName("LYD")
	val lYD: Any? = null,

	@field:SerializedName("BMD")
	val bMD: Any? = null,

	@field:SerializedName("KWD")
	val kWD: Any? = null,

	@field:SerializedName("PHP")
	val pHP: Any? = null,

	@field:SerializedName("RUB")
	val rUB: Any? = null,

	@field:SerializedName("PYG")
	val pYG: Any? = null,

	@field:SerializedName("ISK")
	val iSK: Any? = null,

	@field:SerializedName("JMD")
	val jMD: Any? = null,

	@field:SerializedName("COP")
	val cOP: Any? = null,

	@field:SerializedName("MKD")
	val mKD: Any? = null,

	@field:SerializedName("USD")
	val uSD: Any? = null,

	@field:SerializedName("DZD")
	val dZD: Any? = null,

	@field:SerializedName("PAB")
	val pAB: Any? = null,

	@field:SerializedName("GGP")
	val gGP: Any? = null,

	@field:SerializedName("SGD")
	val sGD: Any? = null,

	@field:SerializedName("ETB")
	val eTB: Any? = null,

	@field:SerializedName("JEP")
	val jEP: Any? = null,

	@field:SerializedName("KGS")
	val kGS: Any? = null,

	@field:SerializedName("SOS")
	val sOS: Any? = null,

	@field:SerializedName("VEF")
	val vEF: Any? = null,

	@field:SerializedName("VUV")
	val vUV: Any? = null,

	@field:SerializedName("LAK")
	val lAK: Any? = null,

	@field:SerializedName("BND")
	val bND: Any? = null,

	@field:SerializedName("ZMK")
	val zMK: Any? = null,

	@field:SerializedName("XAF")
	val xAF: Any? = null,

	@field:SerializedName("LRD")
	val lRD: Any? = null,

	@field:SerializedName("XAG")
	val xAG: Any? = null,

	@field:SerializedName("CHF")
	val cHF: Any? = null,

	@field:SerializedName("HRK")
	val hRK: Any? = null,

	@field:SerializedName("ALL")
	val aLL: Any? = null,

	@field:SerializedName("DJF")
	val dJF: Any? = null,

	@field:SerializedName("VES")
	val vES: Any? = null,

	@field:SerializedName("ZMW")
	val zMW: Any? = null,

	@field:SerializedName("TZS")
	val tZS: Any? = null,

	@field:SerializedName("VND")
	val vND: Any? = null,

	@field:SerializedName("XAU")
	val xAU: Any? = null,

	@field:SerializedName("AUD")
	val aUD: Any? = null,

	@field:SerializedName("ILS")
	val iLS: Any? = null,

	@field:SerializedName("GHS")
	val gHS: Any? = null,

	@field:SerializedName("GYD")
	val gYD: Any? = null,

	@field:SerializedName("KPW")
	val kPW: Any? = null,

	@field:SerializedName("BOB")
	val bOB: Any? = null,

	@field:SerializedName("KHR")
	val kHR: Any? = null,

	@field:SerializedName("MDL")
	val mDL: Any? = null,

	@field:SerializedName("IDR")
	val iDR: Any? = null,

	@field:SerializedName("KYD")
	val kYD: Any? = null,

	@field:SerializedName("AMD")
	val aMD: Any? = null,

	@field:SerializedName("BWP")
	val bWP: Any? = null,

	@field:SerializedName("SHP")
	val sHP: Any? = null,

	@field:SerializedName("TRY")
	val tRY: Any? = null,

	@field:SerializedName("LBP")
	val lBP: Any? = null,

	@field:SerializedName("TJS")
	val tJS: Any? = null,

	@field:SerializedName("JOD")
	val jOD: Any? = null,

	@field:SerializedName("AED")
	val aED: Int? = null,

	@field:SerializedName("HKD")
	val hKD: Any? = null,

	@field:SerializedName("RWF")
	val rWF: Any? = null,

	@field:SerializedName("EUR")
	val eUR: Any? = null,

	@field:SerializedName("LSL")
	val lSL: Any? = null,

	@field:SerializedName("DKK")
	val dKK: Any? = null,

	@field:SerializedName("CAD")
	val cAD: Any? = null,

	@field:SerializedName("BGN")
	val bGN: Any? = null,

	@field:SerializedName("MMK")
	val mMK: Any? = null,

	@field:SerializedName("MUR")
	val mUR: Any? = null,

	@field:SerializedName("NOK")
	val nOK: Any? = null,

	@field:SerializedName("SYP")
	val sYP: Any? = null,

	@field:SerializedName("IMP")
	val iMP: Any? = null,

	@field:SerializedName("ZWL")
	val zWL: Any? = null,

	@field:SerializedName("GIP")
	val gIP: Any? = null,

	@field:SerializedName("RON")
	val rON: Any? = null,

	@field:SerializedName("LKR")
	val lKR: Any? = null,

	@field:SerializedName("NGN")
	val nGN: Any? = null,

	@field:SerializedName("CRC")
	val cRC: Any? = null,

	@field:SerializedName("CZK")
	val cZK: Any? = null,

	@field:SerializedName("PKR")
	val pKR: Any? = null,

	@field:SerializedName("XCD")
	val xCD: Any? = null,

	@field:SerializedName("ANG")
	val aNG: Any? = null,

	@field:SerializedName("HTG")
	val hTG: Any? = null,

	@field:SerializedName("BHD")
	val bHD: Any? = null,

	@field:SerializedName("KZT")
	val kZT: Any? = null,

	@field:SerializedName("SRD")
	val sRD: Any? = null,

	@field:SerializedName("SZL")
	val sZL: Any? = null,

	@field:SerializedName("LTL")
	val lTL: Any? = null,

	@field:SerializedName("SAR")
	val sAR: Any? = null,

	@field:SerializedName("TTD")
	val tTD: Any? = null,

	@field:SerializedName("YER")
	val yER: Any? = null,

	@field:SerializedName("MVR")
	val mVR: Any? = null,

	@field:SerializedName("AFN")
	val aFN: Any? = null,

	@field:SerializedName("INR")
	val iNR: Any? = null,

	@field:SerializedName("AWG")
	val aWG: Any? = null,

	@field:SerializedName("KRW")
	val kRW: Any? = null,

	@field:SerializedName("NPR")
	val nPR: Any? = null,

	@field:SerializedName("JPY")
	val jPY: Any? = null,

	@field:SerializedName("MNT")
	val mNT: Any? = null,

	@field:SerializedName("AOA")
	val aOA: Any? = null,

	@field:SerializedName("PLN")
	val pLN: Any? = null,

	@field:SerializedName("GBP")
	val gBP: Any? = null,

	@field:SerializedName("SBD")
	val sBD: Any? = null,

	@field:SerializedName("BYN")
	val bYN: Any? = null,

	@field:SerializedName("HUF")
	val hUF: Any? = null,

	@field:SerializedName("BYR")
	val bYR: Any? = null,

	@field:SerializedName("BIF")
	val bIF: Any? = null,

	@field:SerializedName("MWK")
	val mWK: Any? = null,

	@field:SerializedName("MGA")
	val mGA: Any? = null,

	@field:SerializedName("XDR")
	val xDR: Any? = null,

	@field:SerializedName("BZD")
	val bZD: Any? = null,

	@field:SerializedName("BAM")
	val bAM: Any? = null,

	@field:SerializedName("EGP")
	val eGP: Any? = null,

	@field:SerializedName("MOP")
	val mOP: Any? = null,

	@field:SerializedName("NAD")
	val nAD: Any? = null,

	@field:SerializedName("NIO")
	val nIO: Any? = null,

	@field:SerializedName("PEN")
	val pEN: Any? = null,

	@field:SerializedName("NZD")
	val nZD: Any? = null,

	@field:SerializedName("WST")
	val wST: Any? = null,

	@field:SerializedName("TMT")
	val tMT: Any? = null,

	@field:SerializedName("CLF")
	val cLF: Any? = null,

	@field:SerializedName("BRL")
	val bRL: Any? = null
)
