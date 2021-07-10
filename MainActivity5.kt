package com.example.projectwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ShareCompat

class MainActivity5 : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        button=findViewById(R.id.button3)
        button.setOnClickListener()
        {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
}}
