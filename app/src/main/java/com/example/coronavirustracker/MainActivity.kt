package com.example.coronavirustracker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.coronavirustracker.Model.ApiCallResponse
import com.example.coronavirustracker.Model.ApiCallService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchData()

    }

    fun fetchData() {


        ApiCallService.call().enqueue(object : Callback<ApiCallResponse> {

            override fun onResponse(
                call: Call<ApiCallResponse>,
                response: Response<ApiCallResponse>
            ) {
                //Get an API response


            }

            override fun onFailure(call: Call<ApiCallResponse>, t: Throwable) {

            }


        })
    }
}
