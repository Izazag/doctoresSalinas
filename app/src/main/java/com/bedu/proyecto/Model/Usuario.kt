package com.bedu.proyecto.Model

import com.bedu.proyecto.Retrofit.RetrofitAPIs

interface Usuario {
    var email: String
    var password: String
    fun Login(): RetrofitAPIs
}