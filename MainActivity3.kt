package com.example.projectwork

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            val name = findViewById<EditText>(R.id.text1)
            val password = findViewById<EditText>(R.id.text2)
            if (name.text.toString() == "admin" && password.text.toString() == "admin") {
                Toast.makeText(applicationContext, "This is a valid ", Toast.LENGTH_LONG).show()
                //displaying data from database

            } else
                Toast.makeText(applicationContext, "This is not a valid ", Toast.LENGTH_LONG).show()
        }
    }}
