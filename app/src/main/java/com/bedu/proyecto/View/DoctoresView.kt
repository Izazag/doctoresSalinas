package com.bedu.proyecto.View

import com.bedu.proyecto.Retrofit.DoctorInfo

interface DoctoresView {
    fun listaDoctores(infoDoctores: List<DoctorInfo>)
}