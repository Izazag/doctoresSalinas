package com.bedu.proyecto.Retrofit

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


data class DoctorInfo(
    @SerializedName("nombre") var nombre: String,
    @SerializedName("id") var id: Int,
    @SerializedName("apellidos") var apellidos: String,
    @SerializedName("cedula") var cedula: String,
    @SerializedName("experiencia") var experiencia: String,
    @SerializedName("calificacion") var calificacion: String,
    @SerializedName("clinica") var clinica: String,
    @SerializedName("foto") var foto: String
)

data class loginResult(
    @SerializedName("result") var result: String,
    @SerializedName("isDoctor") var type: Int
)

data class loginSend(
    @SerializedName("email") var email: String,
    @SerializedName("password") var password: String
)

data class CitaInfo(
    @SerializedName("id") var id: String
)

data class registroInfo(
    @SerializedName("id") var id: String,
    @SerializedName("userId") var userId: String,
    @SerializedName("nombre") var nombre: String,
    @SerializedName("ine") var ine: String,
    @SerializedName("fechaNacimiento") var fechaNacimiento: String,
    @SerializedName("foto") var foto: String,
    @SerializedName("email") var email: String,
    @SerializedName("password") var password: String
)