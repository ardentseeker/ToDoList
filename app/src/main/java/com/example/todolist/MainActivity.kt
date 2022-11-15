package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var task:TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        task = findViewById(R.id.editText)
        btn = findViewById(R.id.button)

        val rv = findViewById<RecyclerView>(R.id.rv)
        val listToDo = ArrayList<String>()
        val myAdapter = Adapter(listToDo)
        rv.layoutManager = LinearLayoutManager(this)


        btn.setOnClickListener {
            listToDo.add(task.text.toString())
            rv.adapter = myAdapter
            task.setText("")
        }
    }
}