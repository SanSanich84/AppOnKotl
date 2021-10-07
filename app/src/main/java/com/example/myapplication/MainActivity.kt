package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but = findViewById<Button>(R.id.My_button1)
        val textView = findViewById<TextView>(R.id.My_textView1)
        but.setOnClickListener() {
            empl_add()
            textView.setText("Объект класса создан")
        }
    }

    fun empl_add() {
        var employe1 = employe("Иван", "Иванов", 32)


    }
}