package com.example.recyclerviewexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*


class RecyclerViewHere : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //we can use here grid,linear,staggered
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL

        recyclerView.layoutManager=layoutManager

        //create instance of place adapter
        val adapter=PlacesAdapter(this, Supplier.places)
        recyclerView.adapter = adapter

    }

}