package com.bedu.proyecto.Presenter

import com.bedu.proyecto.Retrofit.DoctorInfo

interface ListaDoctores {
    fun mostarListaDoctores(Doctores: List<DoctorInfo>)
}