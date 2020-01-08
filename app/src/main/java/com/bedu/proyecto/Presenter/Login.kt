package com.bedu.proyecto.Presenter

interface Login {
    fun sendLogin(email: String, password: String): Boolean
}