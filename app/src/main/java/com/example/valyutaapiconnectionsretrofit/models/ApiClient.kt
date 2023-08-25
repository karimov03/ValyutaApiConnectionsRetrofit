package com.example.valyutaapiconnectionsretrofit.models

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    val url="https://cbu.uz/uzc/arkhiv-kursov-valyut/"
    private fun getInstanse():Retrofit{
        return Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
    fun getApiServis():ApiServis{
        return getInstanse().create(ApiServis::class.java)
    }
}