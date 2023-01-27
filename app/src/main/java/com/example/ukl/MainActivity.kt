package com.example.ukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity(){
    private lateinit var et_email : EditText
    private lateinit var et_password : EditText
    private lateinit var bt_submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        et_email = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
        bt_submit = findViewById(R.id.bt_submit)

        bt_submit.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("email", et_email.text.toString())
            intent.putExtra("password", et_password.text.toString())
            startActivity(intent)
        }

    }


    }
