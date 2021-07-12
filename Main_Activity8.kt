package com.example.projectwork

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projectwork.DBHandler

class MainActivity8 : AppCompatActivity() {
    private lateinit var  courseNameEdt: EditText
    private lateinit var courseTracksEdt: EditText
    private lateinit  var courseDurationEdt: EditText
    private lateinit  var courseDescriptionEdt: EditText
    private val addCourseBtn: Button =findViewById(R.id.idBtnAddCourse)
    private var dbHandler: DBHandler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        // initializing all our variables.
        courseNameEdt = findViewById(R.id.idEdtCourseName)
        courseTracksEdt = findViewById(R.id.idEdtCourseTracks)
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration)
        courseDescriptionEdt = findViewById(R.id.idEdtCourseDescription)

        dbHandler = DBHandler(this)
        val courseName = courseNameEdt.text.toString()
        val courseTracks = courseTracksEdt.text.toString()
        val courseDuration = courseDurationEdt.text.toString()
        val courseDescription = courseDescriptionEdt.text.toString()


        // below line is to add on click listener for our add course button.
        addCourseBtn.setOnClickListener(View.OnClickListener { // below line is to get data from all edit text fields.
            if (courseName.isEmpty() && courseTracks.isEmpty() && courseDuration.isEmpty() && courseDescription.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter all the data..", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }

            // on below line we are calling a method to add new
            // course to sqlite data and pass all our values to it.
            dbHandler!!.addNewCourse(courseName, courseDuration, courseDescription, courseTracks)

            // after adding the data we are displaying a toast message.
            Toast.makeText(applicationContext,"Course has been added.", Toast.LENGTH_LONG).show()
            courseNameEdt.setText("")
            courseDurationEdt.setText("")
            courseTracksEdt.setText("")
            courseDescriptionEdt.setText("")
        })
    }
}
