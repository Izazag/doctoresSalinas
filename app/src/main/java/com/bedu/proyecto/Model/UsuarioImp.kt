package com.bedu.proyecto.Model

import com.bedu.proyecto.Retrofit.RetrofitAPIs
import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UsuarioImp() : Usuario {
    override fun Login(): RetrofitAPIs {
        val BASE_URL = "http://192.168.0.7:9097/Login"

        var retrofitDoctor = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var apiWeb = retrofitDoctor.create(RetrofitAPIs::class.java)

        return apiWeb
    }
}