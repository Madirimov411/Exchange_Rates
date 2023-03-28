package com.uzb7.exchangerates.data.remote

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {

    val isTester=true

    val SERVER_DEVELOPMENT="https://api.apilayer.com/exchangerates_data/"
    val SERVER_PRODUCTION="https://api.apilayer.com/exchangerates_data/"

    private val retrofit= getRetrofit()

    val apiService:ApiService= retrofit.create(ApiService::class.java)


    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURL())
            .addConverterFactory(GsonConverterFactory.create())
            .client(getClient())
            .build()
    }

    fun baseURL():String{
        return if(isTester){
            SERVER_DEVELOPMENT
        } else SERVER_PRODUCTION
    }

    fun getClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(Interceptor { chain ->
            val builder=chain.request().newBuilder()
            builder.addHeader(
                "apikey",
                "aNG4f58T0kcnmc2WGEaiQwvEJrUZXNWb"
            )
            chain.proceed(builder.build())
        })
            .build()

    }

}