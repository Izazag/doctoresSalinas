package com.bedu.proyecto.Retrofit

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


data class DoctorInfo(
    @SerializedName("nombre") var nombre: String,
    @SerializedName("id") var id: String,
    @SerializedName("apellidos") var apellidos: String,
    @SerializedName("cedula") var cedula: String,
    @SerializedName("experiencia") var experiencia: String,
    @SerializedName("calificacion") var calificacion: String,
    @SerializedName("clinica") var clinica: String,
    @SerializedName("foto") var foto: String
)

data class CitaInfo(
    @SerializedName("id") var id: String
)

class Doctores:RealmObject(){
    @PrimaryKey
    var id = 0
    lateinit var nombre: String
    lateinit var apellidos: String
    lateinit var cedula: String
    lateinit var experiencia: String
    lateinit var calificacion: String
    lateinit var clinica: String
    lateinit var foto: String
}