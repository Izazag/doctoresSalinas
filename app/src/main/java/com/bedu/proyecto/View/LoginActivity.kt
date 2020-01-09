package com.bedu.proyecto.View

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bedu.proyecto.Presenter.LoginImp
import com.bedu.proyecto.Presenter.MainPageImp
import com.bedu.proyecto.R
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity: AppCompatActivity(), LoginView {
    override fun getLoginResponse(answer: String) {
        Toast.makeText(this, answer, Toast.LENGTH_LONG).show()
    }

    val presenter = LoginImp(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        var email = usernameEdit.text.toString()
        var password = passwordEdit.text.toString()

        login.setOnClickListener {
            presenter.sendLogin(email, password)
        }
    }
}