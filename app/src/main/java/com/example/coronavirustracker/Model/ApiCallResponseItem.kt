package com.example.coronavirustracker.Model

data class ApiCallResponseItem(
    val active: Int?,
    val cases: Int?,
    val casesPerOneMillion: Int?,
    val continent: String?,
    val country: String?,
    val countryInfo: CountryInfo?,
    val critical: Int?,
    val deaths: Int?,
    val deathsPerOneMillion: Int?,
    val recovered: Int?,
    val tests: Int?,
    val testsPerOneMillion: Int?,
    val todayCases: Int?,
    val todayDeaths: Int?,
    val updated: Long?
){
    fun flatten(){
        val flatpack = arrayListOf<Item>()
        country?.let { flatpack.add(Item("cases", cases.toString(), TYPE_ITEM))}
    }


}