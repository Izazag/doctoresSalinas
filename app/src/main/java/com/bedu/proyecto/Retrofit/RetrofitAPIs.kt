package com.bedu.proyecto.Retrofit

import com.bedu.proyecto.Model.DoctorImp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitAPIs {

    @GET("{params}")
    fun getInfoDoctores(@Path("params")params:String):Call<List<DoctorInfo>>

    @GET("{params}")
    fun getInfoDoctor(@Path("params")params:String):Call<DoctorInfo>
}