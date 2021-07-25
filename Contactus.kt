package com.example.projectwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ShareCompat
class Contactus1 : AppCompatActivity() {
               private lateinit var button: Button
               override fun onCreate(savedInstanceState: Bundle?) {
                   super.onCreate(savedInstanceState)
                   setContentView(R.layout.activity_contactus1)
                   val button:Button=findViewById(R.id.buttonSend)
                   val subject:EditText=findViewById(R.id.editTextSubject)
                   val message:EditText=findViewById(R.id.editTextMessage)
                   button.setOnClickListener()
                   {
                       Toast.makeText(applicationContext, "Choose only Gmail option ", Toast.LENGTH_LONG).show()
                       ShareCompat.IntentBuilder.from(this).setText(message.text.toString()).setSubject(subject.text.toString()).setEmailTo(arrayOf("sanafarooqui2002@gmail.com")).setChooserTitle("share to").setType("plain/text").startChooser()
                   }
                   }

               }
