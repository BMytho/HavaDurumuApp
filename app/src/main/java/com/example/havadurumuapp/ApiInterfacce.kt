package com.example.havadurumuapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterfacce {

    @GET("weather")
     fun getWeatherData(
        @Query("q") city: String,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Call<WeatherApp>

}