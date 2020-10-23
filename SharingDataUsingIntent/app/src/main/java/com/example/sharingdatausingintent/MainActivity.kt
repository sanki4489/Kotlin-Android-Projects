package com.example.sharingdatausingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val message:String?=msgshare.text.toString()

            val intent=Intent(this,NextActivity::class.java)
            intent.putExtra("keys",message)
            startActivity(intent)


        }
    }
}