package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list:ArrayList<String>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {


    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        lateinit var res :TextView
        init {
            res = view.findViewById(R.id.text)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.res.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}