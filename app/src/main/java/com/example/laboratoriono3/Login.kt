package com.example.laboratoriono3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var ingresarBoton = findViewById<Button>(R.id.ingresar)

        ingresarBoton.setOnClickListener(){
            veriicarCredenciales()
        }

        var addUserButton = findViewById<ImageButton>(R.id.registrar)

        addUserButton.setOnClickListener(){
            addUser()
        }

        var forgotPasswordButton = findViewById<Button>(R.id.olvideContra)

        forgotPasswordButton.setOnClickListener(){
            forgotPasword()
        }
    }

    private fun veriicarCredenciales(){
        var usuario = findViewById<EditText>(R.id.usuario)
        var password = findViewById<EditText>(R.id.contrasenia)

        if(usuario.text.isEmpty() || password.text.isEmpty()){
            Toast.makeText(this@Login, "Hay algun campo vacio", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this@Login, "Insertar nuevo usuario", Toast.LENGTH_LONG).show()

            this@Login.finish()
            val i = Intent(this@Login, MainActivity::class.java)
            startActivity(i)
        }
    }
    private fun addUser(){

    }

    private fun forgotPasword(){

    }
}