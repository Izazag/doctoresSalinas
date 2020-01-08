package com.bedu.proyecto.Presenter

import android.util.Log
import com.bedu.proyecto.Model.DoctorImp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

interface MainPage {
    fun mostrarInfoDoctor(id: String)
}