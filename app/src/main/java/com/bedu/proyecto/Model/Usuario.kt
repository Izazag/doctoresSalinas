package com.bedu.proyecto.Model

import com.bedu.proyecto.Retrofit.RetrofitAPIs

interface Usuario {
    fun Login(): RetrofitAPIs
}