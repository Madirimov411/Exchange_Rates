package com.uzb7.exchangerates.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.uzb7.exchangerates.R
import com.uzb7.exchangerates.adapter.RatesRecyclerView
import com.uzb7.exchangerates.adapter.SpinnerRatesAdapter
import com.uzb7.exchangerates.data.remote.ApiClient
import com.uzb7.exchangerates.databinding.FragmentRatesBinding
import com.uzb7.exchangerates.model.Courses
import com.uzb7.exchangerates.model.Rates
import com.uzb7.exchangerates.model.Symboles
import com.uzb7.moviedb.utils.viewBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RatesFragment : Fragment(R.layout.fragment_rates) {
    private val binding by viewBinding { FragmentRatesBinding.bind(it) }
    lateinit var list:ArrayList<Symboles>
    lateinit var adapterCourse:RatesRecyclerView
    var flagList=ArrayList<Symboles>()
    var courseList=ArrayList<Double>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            list=listSniper()
            val adapter = SpinnerRatesAdapter(requireContext(),list)
            spinnerRates.adapter = adapter
            spinnerRates.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(requireContext(), list[position].abbr, Toast.LENGTH_SHORT).show()
                    loadCurses(list[position].abbr)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
            adapterCourse=RatesRecyclerView(flagList,courseList)
            rvRates.adapter=adapterCourse
            rvRates.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        }
    }

    private fun loadCurses(base: String) {

        ApiClient.apiService.getLatestCourses(base).enqueue(object :Callback<Courses>{
            override fun onResponse(call: Call<Courses>, response: Response<Courses>) {
                if(response.isSuccessful){
                    Log.d("@@@@", "onResponse: ${response.body().toString()}")
                    loadCourse(response.body()?.rates as ArrayList<Double>)
                    adapterCourse.submitList(flagList,courseList)
                }
            }

            override fun onFailure(call: Call<Courses>, t: Throwable) {
            }


        })

    }

    private fun loadCourse(rates: ArrayList<Double>) {
        rates.forEach {
            courseList.add(it)
        }
    }


    fun listSniper():ArrayList<Symboles>{
        val symboles=ArrayList<Symboles>()
        symboles.add(Symboles("AED","United Arab Emirates Dirham"))
        symboles.add(Symboles("AFN", "Afghan Afghani"))
        symboles.add(Symboles("ALL", "Albanian Lek"))
        symboles.add(Symboles("AMD", "Armenian Dram"))
        symboles.add(Symboles("ANG", "Netherlands Antillean Guilder"))
        symboles.add(Symboles("AOA", "Angolan Kwanza"))
        symboles.add(Symboles("ARS", "Argentine Peso"))
        symboles.add(Symboles("AUD", "Australian Dollar"))
        symboles.add(Symboles("AWG", "Aruban Florin"))
        symboles.add(Symboles("AZN", "Azerbaijani Manat"))
        symboles.add(Symboles("BAM", "Bosnia-Herzegovina Convertible Mark"))
        symboles.add(Symboles("BBD", "Barbadian Dollar"))
        symboles.add(Symboles("BDT", "Bangladeshi Taka"))
        symboles.add(Symboles("BGN", "Bulgarian Lev"))
        symboles.add(Symboles("BHD", "Bahraini Dinar"))
        symboles.add(Symboles("BIF", "Burundian Franc"))
        symboles.add(Symboles("BMD", "Bermudan Dollar"))
        symboles.add(Symboles("BND", "Brunei Dollar"))
        symboles.add(Symboles("BOB", "Bolivian Boliviano"))
        symboles.add(Symboles("BRL", "Brazilian Real"))
        symboles.add(Symboles("BSD", "Bahamian Dollar"))
        symboles.add(Symboles("BTC", "Bitcoin"))
        symboles.add(Symboles("BTN", "Bhutanese Ngultrum"))
        symboles.add(Symboles("BWP", "Botswanan Pula"))
        symboles.add(Symboles("BYN", "New Belarusian Ruble"))
        symboles.add(Symboles("BYR", "Belarusian Ruble"))
        symboles.add(Symboles("BZD", "Belize Dollar"))
        symboles.add(Symboles("CAD", "Canadian Dollar"))
        symboles.add(Symboles("CDF", "Congolese Franc"))
        symboles.add(Symboles("CHF", "Swiss Franc"))
        symboles.add(Symboles("CLF", "Chilean Unit of Account (UF)"))
        symboles.add(Symboles("CLP", "Chilean Peso"))
        symboles.add(Symboles("CNY", "Chinese Yuan"))
        symboles.add(Symboles("COP", "Colombian Peso"))
        symboles.add(Symboles("CRC", "Costa Rican Colón"))
        symboles.add(Symboles("CUC", "Cuban Convertible Peso"))
        symboles.add(Symboles("CUP", "Cuban Peso"))
        symboles.add(Symboles("CVE", "Cape Verdean Escudo"))
        symboles.add(Symboles("CZK", "Czech Republic Koruna"))
        symboles.add(Symboles("DJF", "Djiboutian Franc"))
        symboles.add(Symboles("DKK", "Danish Krone"))
        symboles.add(Symboles("DOP", "Dominican Peso"))
        symboles.add(Symboles("DZD", "Algerian Dinar"))
        symboles.add(Symboles("EGP", "Egyptian Pound"))
        symboles.add(Symboles("ERN", "Eritrean Nakfa"))
        symboles.add(Symboles("ETB", "Ethiopian Birr"))
        symboles.add(Symboles("EUR", "Euro"))
        symboles.add(Symboles("FJD", "Fijian Dollar"))
        symboles.add(Symboles("FKP", "Falkland Islands Pound"))
        symboles.add(Symboles("GBP", "British Pound Sterling"))
        symboles.add(Symboles("GEL", "Georgian Lari"))
        symboles.add(Symboles("GGP", "Guernsey Pound"))
        symboles.add(Symboles("GHS", "Ghanaian Cedi"))
        symboles.add(Symboles("GIP", "Gibraltar Pound"))
        symboles.add(Symboles("GMD", "Gambian Dalasi"))
        symboles.add(Symboles("GNF", "Guinean Franc"))
        symboles.add(Symboles("GTQ", "Guatemalan Quetzal"))
        symboles.add(Symboles("GYD", "Guyanaese Dollar"))
        symboles.add(Symboles("HKD", "Hong Kong Dollar"))
        symboles.add(Symboles("HNL", "Honduran Lempira"))
        symboles.add(Symboles("HRK", "Croatian Kuna"))
        symboles.add(Symboles("HTG", "Haitian Gourde"))
        symboles.add(Symboles("HUF", "Hungarian Forint"))
        symboles.add(Symboles("IDR", "Indonesian Rupiah"))
        symboles.add(Symboles("ILS", "Israeli New Sheqel"))
        symboles.add(Symboles("IMP", "Manx pound"))
        symboles.add(Symboles("INR", "Indian Rupee"))
        symboles.add(Symboles("IQD", "Iraqi Dinar"))
        symboles.add(Symboles("IRR", "Iranian Rial"))
        symboles.add(Symboles("ISK", "Icelandic Króna"))
        symboles.add(Symboles("JEP", "Jersey Pound"))
        symboles.add(Symboles("JMD", "Jamaican Dollar"))
        symboles.add(Symboles("JOD", "Jordanian Dinar"))
        symboles.add(Symboles("JPY", "Japanese Yen"))
        symboles.add(Symboles("KES", "Kenyan Shilling"))
        symboles.add(Symboles("KGS", "Kyrgystani Som"))
        symboles.add(Symboles("KHR", "Cambodian Riel"))
        symboles.add(Symboles("KMF", "Comorian Franc"))
        symboles.add(Symboles("KPW", "North Korean Won"))
        symboles.add(Symboles("KRW", "South Korean Won"))
        symboles.add(Symboles("KWD", "Kuwaiti Dinar"))
        symboles.add(Symboles("KYD", "Cayman Islands Dollar"))
        symboles.add(Symboles("KZT", "Kazakhstani Tenge"))
        symboles.add(Symboles("LAK", "Laotian Kip"))
        symboles.add(Symboles("LBP", "Lebanese Pound"))
        symboles.add(Symboles("LKR", "Sri Lankan Rupee"))
        symboles.add(Symboles("LRD", "Liberian Dollar"))
        symboles.add(Symboles("LSL", "Lesotho Loti"))
        symboles.add(Symboles("LTL", "Lithuanian Litas"))
        symboles.add(Symboles("LVL", "Latvian Lats"))
        symboles.add(Symboles("LYD", "Libyan Dinar"))
        symboles.add(Symboles("MAD", "Moroccan Dirham"))
        symboles.add(Symboles("MDL", "Moldovan Leu"))
        symboles.add(Symboles("MGA", "Malagasy Ariary"))
        symboles.add(Symboles("MKD", "Macedonian Denar"))
        symboles.add(Symboles("MMK", "Myanma Kyat"))
        symboles.add(Symboles("MNT", "Mongolian Tugrik"))
        symboles.add(Symboles("MOP", "Macanese Pataca"))
        symboles.add(Symboles("MRO", "Mauritanian Ouguiya"))
        symboles.add(Symboles("MUR", "Mauritian Rupee"))
        symboles.add(Symboles("MVR", "Maldivian Rufiyaa"))
        symboles.add(Symboles("MWK", "Malawian Kwacha"))
        symboles.add(Symboles("MXN", "Mexican Peso"))
        symboles.add(Symboles("MYR", "Malaysian Ringgit"))
        symboles.add(Symboles("MZN", "Mozambican Metical"))
        symboles.add(Symboles("NAD", "Namibian Dollar"))
        symboles.add(Symboles("NGN", "Nigerian Naira"))
        symboles.add(Symboles("NIO", "Nicaraguan Córdoba"))
        symboles.add(Symboles("NOK", "Norwegian Krone"))
        symboles.add(Symboles("NPR", "Nepalese Rupee"))
        symboles.add(Symboles("NZD", "New Zealand Dollar"))
        symboles.add(Symboles("OMR", "Omani Rial"))
        symboles.add(Symboles("PAB", "Panamanian Balboa"))
        symboles.add(Symboles("PEN", "Peruvian Nuevo Sol"))
        symboles.add(Symboles("PGK", "Papua New Guinean Kina"))
        symboles.add(Symboles("PHP", "Philippine Peso"))
        symboles.add(Symboles("PKR", "Pakistani Rupee"))
        symboles.add(Symboles("PLN", "Polish Zloty"))
        symboles.add(Symboles("PYG", "Paraguayan Guarani"))
        symboles.add(Symboles("QAR", "Qatari Rial"))
        symboles.add(Symboles("RON", "Romanian Leu"))
        symboles.add(Symboles("RSD", "Serbian Dinar"))
        symboles.add(Symboles("RUB", "Russian Ruble"))
        symboles.add(Symboles("RWF", "Rwandan Franc"))
        symboles.add(Symboles("SAR", "Saudi Riyal"))
        symboles.add(Symboles("SBD", "Solomon Islands Dollar"))
        symboles.add(Symboles("SCR", "Seychellois Rupee"))
        symboles.add(Symboles("SDG", "Sudanese Pound"))
        symboles.add(Symboles("SEK", "Swedish Krona"))
        symboles.add(Symboles("SGD", "Singapore Dollar"))
        symboles.add(Symboles("SHP", "Saint Helena Pound"))
        symboles.add(Symboles("SLE", "Sierra Leonean Leone"))
        symboles.add(Symboles("SLL", "Sierra Leonean Leone"))
        symboles.add(Symboles("SOS", "Somali Shilling"))
        symboles.add(Symboles("SRD", "Surinamese Dollar"))
        symboles.add(Symboles("STD", "São Tomé and Príncipe Dobra"))
        symboles.add(Symboles("SVC", "Salvadoran Colón"))
        symboles.add(Symboles("SYP", "Syrian Pound"))
        symboles.add(Symboles("SZL", "Swazi Lilangeni"))
        symboles.add(Symboles("THB", "Thai Baht"))
        symboles.add(Symboles("TJS", "Tajikistani Somoni"))
        symboles.add(Symboles("TMT", "Turkmenistani Manat"))
        symboles.add(Symboles("TND", "Tunisian Dinar"))
        symboles.add(Symboles("TOP", "Tongan Paʻanga"))
        symboles.add(Symboles("TRY", "Turkish Lira"))
        symboles.add(Symboles("TTD", "Trinidad and Tobago Dollar"))
        symboles.add(Symboles("TWD", "New Taiwan Dollar"))
        symboles.add(Symboles("TZS", "Tanzanian Shilling"))
        symboles.add(Symboles("UAH", "Ukrainian Hryvnia"))
        symboles.add(Symboles("UGX", "Ugandan Shilling"))
        symboles.add(Symboles("USD", "United States Dollar"))
        symboles.add(Symboles("UYU", "Uruguayan Peso"))
        symboles.add(Symboles("UZS", "Uzbekistan Som"))
        symboles.add(Symboles("VEF", "Venezuelan Bolívar Fuerte"))
        symboles.add(Symboles("VES", "Sovereign Bolivar"))
        symboles.add(Symboles("VND", "Vietnamese Dong"))
        symboles.add(Symboles("VUV", "Vanuatu Vatu"))
        symboles.add(Symboles("WST", "Samoan Tala"))
        symboles.add(Symboles("XAF", "CFA Franc BEAC"))
        symboles.add(Symboles("XAG", "Silver (troy ounce)"))
        symboles.add(Symboles("XAU", "Gold (troy ounce)"))
        symboles.add(Symboles("XCD", "East Caribbean Dollar"))
        symboles.add(Symboles("XDR", "Special Drawing Rights"))
        symboles.add(Symboles("XOF", "CFA Franc BCEAO"))
        symboles.add(Symboles("XPF", "CFP Franc"))
        symboles.add(Symboles("YER", "Yemeni Rial"))
        symboles.add(Symboles("ZAR", "South African Rand"))
        symboles.add(Symboles("ZMK", "Zambian Kwacha (pre-2013)"))
        symboles.add(Symboles("ZMW", "Zambian Kwacha"))
        symboles.add(Symboles("ZWL", "Zimbabwean Dollar"))
        return symboles
    }
}
