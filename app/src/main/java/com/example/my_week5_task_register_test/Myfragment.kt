package com.example.my_week5_task_register_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Myfragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            // Inflates the custom fragment layout
            val view: View = inflater.inflate(R.layout.fragment_myfragment, container, false)

            // Finds the TextView in the custom fragment
          val  myTextView = view.findViewById<View>(R.id.frag_name) as TextView

            // Gets the data from the passed bundle
            val bundle = arguments
            val message = bundle!!.getString("mText")

            // Sets the derived data (type String) in the TextView
            myTextView.text = message

            return view
        }

    }




