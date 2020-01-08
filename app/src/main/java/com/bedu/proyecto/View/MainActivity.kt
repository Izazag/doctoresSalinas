package com.bedu.proyecto.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bedu.proyecto.Presenter.MainPageImp
import com.bedu.proyecto.R
import com.bedu.proyecto.Retrofit.DoctorInfo

class MainActivity : AppCompatActivity(), MainView {

    val presenter = MainPageImp(this)
    lateinit var listaDoctoresFragment: DoctoresFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.mostrarInfoDoctor("2")
    }

    override fun infoDoctor(nombreDoctor: String) {
        Log.d("Message", nombreDoctor)
    }

}
