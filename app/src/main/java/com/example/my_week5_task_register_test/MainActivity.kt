package com.example.my_week5_task_register_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt = findViewById<Button>(R.id.my_button)
        butt.setOnClickListener{
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}