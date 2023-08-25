package com.example.valyutaapiconnectionsretrofit.models

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET

interface ApiServis {
    @GET("json")
      fun getResponse():Call<List<Valyuta>>
}