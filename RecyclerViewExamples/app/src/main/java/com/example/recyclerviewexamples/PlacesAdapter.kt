package com.example.recyclerviewexamples

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_view.view.*

class PlacesAdapter(val context:Context,val places: List<Places>) : RecyclerView.Adapter<PlacesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_view,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val place=places[position]
        holder.setdata(place,position)
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var currentplace : Places?=null
        var currentposition : Int=0


        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currentplace!!.title +" visited",Toast.LENGTH_LONG).show()
            }
            itemView.imgShare.setOnClickListener {
                val message: String= "Hey you are in" + currentplace!!.title
                val intent=Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                context.startActivity(Intent.createChooser(intent,"choose from these"))
            }
        }

        fun setdata(place: Places?, pos: Int){
            itemView.txvTitle.text=place!!.title
            this.currentplace=place
            this.currentposition=pos
        }
    }
}