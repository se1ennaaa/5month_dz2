package com.example.a5month_dz2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") first: String,
        @Query("sname") second: String,
        @Header("X-RapidAPI-Key") key: String = "7830d9ed18msh98e62accda3d0b4p1d3d51jsncdd805bb7c2a",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}