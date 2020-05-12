package com.example.coronavirustracker.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiCallService{

    private val BASE_URL = "https://corona.lmao.ninja/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiCall::class.java)

    fun call() = api.callGet()

}