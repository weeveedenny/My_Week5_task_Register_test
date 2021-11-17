package com.example.my_week5_task_register_test.util

import android.util.Patterns
import java.util.regex.Pattern


object AppValidation {

    fun validateName(name: String): Boolean {
        if (name.isEmpty()) {
            return false
        }
        return true
    }



    fun validateEmail(email: String): Boolean {

        if (email.isEmpty()){
            return false
        }

        val pattern: Pattern = Patterns.EMAIL_ADDRESS
        pattern.matcher(email).matches()
        return true
    }



    fun validatePhoneNumber(phoneNumber: String): Boolean {

        if (phoneNumber.startsWith("070", true) && (phoneNumber.length == 13)) {
            return true
        }
        else if (phoneNumber.startsWith("080", true) && (phoneNumber.length == 13)) {
            return true
        }
        else if (phoneNumber.startsWith("090", true) && (phoneNumber.length == 13)) {
            return true
        }
        else if (phoneNumber.startsWith("081", true) && (phoneNumber.length == 13)) {
            return true
        }
        else if (phoneNumber.startsWith("+234", true) && (phoneNumber.length == 13)) {
            return true
        } else if (phoneNumber.startsWith("234", true) && (phoneNumber.length == 13)) {
            return true
        }
        return false
    }
}