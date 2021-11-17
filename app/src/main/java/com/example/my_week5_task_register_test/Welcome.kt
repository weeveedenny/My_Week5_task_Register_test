package com.example.my_week5_task_register_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val nameView = findViewById<TextView>(R.id.name_text)
        val emailView = findViewById<TextView>(R.id.email_text)
        val phoneView= findViewById<TextView>(R.id.phone_text)
        val sexView = findViewById<TextView>(R.id.sex_text)


        val myName = intent.getStringExtra("name")
        val myEmail = intent.getStringExtra("email")
        val myPhone = intent.getStringExtra("phone")
        val sex = intent.getStringExtra("sex")

        nameView.text = myName
        emailView.text = myEmail
        phoneView.text = myPhone
        sexView.text = sex


    }
}