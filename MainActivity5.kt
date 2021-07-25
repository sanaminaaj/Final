package com.example.projectwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        val login= findViewById<Button>(R.id.login)
        login.setOnClickListener{
            val name= findViewById<EditText>(R.id.text1)
            val password= findViewById<EditText>(R.id.text2)
            if(name.text.toString() == "student" && password.text.toString() == "student")
            {
                Toast.makeText(applicationContext, "This is a valid ", Toast.LENGTH_LONG).show()
                val intent= Intent(this,MainActivity8::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(applicationContext, "This is not valid", Toast.LENGTH_LONG).show()
        }
    }
}
