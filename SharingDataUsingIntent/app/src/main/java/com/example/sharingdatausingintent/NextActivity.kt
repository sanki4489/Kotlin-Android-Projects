package com.example.sharingdatausingintent

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val bundle: Bundle?=intent.extras
        val msg= bundle!!.getString("keys")

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        txt.text = msg


    }
}