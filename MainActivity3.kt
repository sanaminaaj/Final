package com.example.projectwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val login= findViewById(R.id.login) as Button
    login.setOnClickListener{
        val name=findViewById(R.id.text1) as EditText
        val password=findViewById(R.id.text2) as EditText
        if(name.text.toString().equals("admin")&&password.text.toString().equals("admin"))
            Toast.makeText(applicationContext, "This is a valid ", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(applicationContext, "This is not valid", Toast.LENGTH_LONG).show()
    }
}
}
