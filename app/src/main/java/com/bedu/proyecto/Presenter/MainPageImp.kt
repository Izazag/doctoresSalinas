package com.bedu.proyecto.Presenter

import android.util.Log
import com.bedu.proyecto.Model.DoctorImp
import com.bedu.proyecto.Retrofit.DoctorInfo
import com.bedu.proyecto.View.InfoDoctorView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPageImp(var vista: InfoDoctorView): MainPage {

    override fun mostrarInfoDoctor(id: String){

        lateinit var nombreDoctor: String

        val apiWeb = DoctorImp().dataDoctor()

        var callResponse = apiWeb.getInfoDoctor(id)

        nombreDoctor = ""

        callResponse.enqueue(object: Callback<DoctorInfo> {
            override fun onResponse(
                call: Call<DoctorInfo>,
                response: Response<DoctorInfo>
            ) {
                if(response.isSuccessful){
                    nombreDoctor = response.body()!!.nombre
                    vista.infoDoctor(nombreDoctor)
                    Log.d("Message", "${response.body()}")
                }
            }

            override fun onFailure(call: Call<DoctorInfo>, t: Throwable) {
                Log.d("MessageError", t.toString())
            }

        })

    }

}