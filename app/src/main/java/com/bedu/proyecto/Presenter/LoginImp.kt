package com.bedu.proyecto.Presenter

import android.util.Log
import com.bedu.proyecto.Model.UsuarioImp
import com.bedu.proyecto.Retrofit.loginResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginImp: Login {
    override fun sendLogin(email: String, password: String): Boolean {
        val apiWeb = UsuarioImp().Login()

        var callResponse = apiWeb.login(email, password)

        callResponse.enqueue(object: Callback<loginResult> {
            override fun onResponse(
                call: Call<loginResult>,
                response: Response<loginResult>
            ) {
                if(response.isSuccessful){
                    Log.d("Message", "${response.body()}")
                }
            }

            override fun onFailure(call: Call<loginResult>, t: Throwable) {
                Log.d("MessageError", t.toString())
            }

        })
        return true
    }
}