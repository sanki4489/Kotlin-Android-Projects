package com.example.buttonevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var message : String=messagepassed.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()
            var intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    fun message(view: View) {
        Log.i("MainActivity","first Button clicked")
        Toast.makeText(this,"first Button clicked",Toast.LENGTH_LONG).show()
    }
}