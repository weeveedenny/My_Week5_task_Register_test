package com.example.my_week5_task_register_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.content.Intent


class Register : AppCompatActivity() {
private lateinit var regbutton : Button
private lateinit var nametext : EditText
private lateinit var emailtext: EditText
private lateinit var phonetext: EditText
private  var spinnerItemSelectedPosition:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

         val my_dropdown = resources.getStringArray(R.array.Sex)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.My_spinner)
        if (spinner != null) { val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, my_dropdown)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    spinnerItemSelectedPosition = position
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        regbutton = findViewById(R.id.reg_button)
        nametext = findViewById(R.id.reg_name)
        emailtext =  findViewById(R.id.reg_email)
        phonetext= findViewById(R.id.reg_phone)

regbutton.setOnClickListener {
    val namestr: String = nametext.getText().toString()
    val emailstr: String = emailtext.getText().toString()
    val phonestr: String = phonetext.getText().toString()
    val sexstr:String = spinner.getItemAtPosition(spinnerItemSelectedPosition).toString()

    val intent = Intent(applicationContext, Welcome::class.java)

    intent.putExtra("name", namestr)
    intent.putExtra("email", emailstr)
    intent.putExtra("phone", phonestr)
     intent.putExtra("sex", sexstr)

    startActivity(intent)

        }

    }
}
