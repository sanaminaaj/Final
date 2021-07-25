package com.example.projectwork

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity8 : AppCompatActivity() {
    private lateinit var courseNameEdt: EditText
    private lateinit var courseTracksEdt: EditText
    private lateinit var courseDurationEdt: EditText
    private lateinit var courseDescriptionEdt: EditText
    private lateinit var addCourseBtn: Button
    private lateinit var dbHandler: DataBaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        // initializing all our variables.
        courseNameEdt = findViewById(R.id.idEdtCourseName)
        courseTracksEdt = findViewById(R.id.idEdtCourseTracks)
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration)
        courseDescriptionEdt = findViewById(R.id.idEdtCourseDescription)
        addCourseBtn = findViewById(R.id.idBtnAddCourse)

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = DataBaseHelper(this)

        // below line is to add on click listener for our add course button.
        addCourseBtn.setOnClickListener(View.OnClickListener { // below line is to get data from all edit text fields.
            val courseName = courseNameEdt.text.toString()
            val courseTracks = courseTracksEdt.text.toString()
            val courseDuration = courseDurationEdt.text.toString()
            val courseDescription = courseDescriptionEdt.text.toString()

            // validating if the text fields are empty or not.
            if (courseName.isNotEmpty() && courseTracks.isNotEmpty() && courseDuration.isNotEmpty() && courseDescription.isNotEmpty())
            {
                dbHandler.addNewCourse(courseName, courseDuration, courseDescription, courseTracks)
                courseNameEdt.setText("")
                courseDurationEdt.setText("")
                courseTracksEdt.setText("")
                courseDescriptionEdt.setText("")
                Toast.makeText(this@MainActivity8, "Registration successful.", Toast.LENGTH_SHORT).show()
                val i=Intent(this,MainActivity6::class.java)
                startActivity(i)
            }
            // on below line we are calling a method to add new
            // course to sqlite data and pass all our values to it.
            Toast.makeText(this@MainActivity8, "Please enter all the data..", Toast.LENGTH_SHORT).show()
            return@OnClickListener
        })

    }}
