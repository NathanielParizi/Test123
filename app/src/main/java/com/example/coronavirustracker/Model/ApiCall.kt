package com.example.coronavirustracker.Model

import retrofit2.Call
import retrofit2.http.GET

interface ApiCall{

    @GET("https://corona.lmao.ninja/v2/states")
    fun callGet() : Call<ApiCallResponse>


}