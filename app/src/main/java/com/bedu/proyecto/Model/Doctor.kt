package com.bedu.proyecto.Model

import com.bedu.proyecto.Retrofit.DoctorInfo
import com.bedu.proyecto.Retrofit.RetrofitAPIs
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import retrofit2.Call

interface Doctor {
    fun infoDoctores(): Call<List<DoctorInfo>>
    fun dataDoctor(): RetrofitAPIs
    fun guardarInfo()
}