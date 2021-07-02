package com.example.studentregistration

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ShareCompat
class Contactus : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    fun opengmail(view: View) {
        val email:TextView=findViewById(R.id.editText1)
        val subject:EditText=findViewById(R.id.editTextSubject)
        val mes:EditText=findViewById(R.id.editTextMessage)
        val sendmail:TextView=findViewById(R.id.textView)
        ShareCompat.IntentBuilder.from(this).setText(mes.text.toString()).setSubject(subject.text.toString()).setEmailTo(arrayOf("sanafarooqui2002@gmail.com")).setChooserTitle("share to").setType("plain/text").startChooser()


    }


}
