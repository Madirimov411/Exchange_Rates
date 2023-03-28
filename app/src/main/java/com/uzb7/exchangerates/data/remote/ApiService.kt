package com.uzb7.exchangerates.data.remote

import com.uzb7.exchangerates.model.Courses
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("latest")
    fun getLatestCourses(
        @Query("base") base:String
    ):Call<Courses>

}