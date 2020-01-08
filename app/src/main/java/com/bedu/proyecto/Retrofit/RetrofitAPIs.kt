package com.bedu.proyecto.Retrofit

import com.bedu.proyecto.Model.DoctorImp
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitAPIs {

    @GET("{params}")
    fun getInfoDoctores(@Path("params")params:String):Call<List<DoctorInfo>>

    @GET("{params}")
    fun getInfoDoctor(@Path("params")params:String):Call<DoctorInfo>

    @POST()
    fun login(@Field("email") email: String, @Field("password") password: String): Call<loginResult>
}