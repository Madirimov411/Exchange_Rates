package com.uzb7.exchangerates.data.remote

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ApiClient {

    val isTester=true

    val SERVER_DEVELOPMENT="https://api.apilayer.com/exchangerates_data/"
    val SERVER_PRODUCTION="https://api.apilayer.com/exchangerates_data/"

    private val retrofit= getRetrofit(getClient())

    val apiService:ApiService= retrofit.create(ApiService::class.java)


    fun getRetrofit(client: OkHttpClient): Retrofit {
        val build = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseURL())
            .client(client)
            .build()
        return build
    }

    fun baseURL():String{
        return if(isTester){
            SERVER_DEVELOPMENT
        } else SERVER_PRODUCTION
    }

    fun getClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(160, TimeUnit.SECONDS)
            .readTimeout(160, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })

            .addInterceptor(Interceptor { chain ->
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