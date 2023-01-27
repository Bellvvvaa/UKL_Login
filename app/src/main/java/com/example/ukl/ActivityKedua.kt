package com.example.ukl

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityKedua : AppCompatActivity() {

    private lateinit var tvemail : TextView
    private lateinit var tvpassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        tvemail = findViewById(R.id.tv_email)
        tvpassword = findViewById(R.id.tv_password)

        val bundle = intent.extras
        tvemail.setText(bundle?.getString("email"))
        tvpassword.setText(bundle?.getString("password"))
    }
}