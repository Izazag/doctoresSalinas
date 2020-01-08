package com.bedu.proyecto.Model

import android.util.Log
import com.bedu.proyecto.Retrofit.DoctorInfo
import com.bedu.proyecto.Retrofit.RetrofitAPIs
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DoctorImp: Doctor {
        override fun dataDoctor(): RetrofitAPIs {
                val BASE_URL = "http://192.168.0.7:9097/getDoctors/"

                var retrofitDoctor = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

                var apiWeb = retrofitDoctor.create(RetrofitAPIs::class.java)

                return apiWeb
        }

        override fun infoDoctores(): Call<List<DoctorInfo>> {
                val BASE_URL = "http://192.168.0.7:9097/"

                var retrofitDoctors = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

                var apiWeb = retrofitDoctors.create(RetrofitAPIs::class.java)

                var callResponse = apiWeb.getInfoDoctores("getDoctors")


                callResponse.enqueue(object: Callback<List<DoctorInfo>> {
                        override fun onFailure(call: Call<List<DoctorInfo>>, t: Throwable) {
                                Log.d("MessageError", t.toString())
                        }

                        override fun onResponse(
                                call: Call<List<DoctorInfo>>,
                                response: Response<List<DoctorInfo>>
                        ) {
                                if(response.isSuccessful){
                                        for(doctor in response.body()!!){
                                                Log.d("Message", "$doctor")
                                        }
                                }
                        }

                })

                return callResponse
        }

        override fun guardarInfo() {

        }
}

