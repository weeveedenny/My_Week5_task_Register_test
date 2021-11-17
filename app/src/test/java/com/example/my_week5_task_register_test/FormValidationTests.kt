package com.example.my_week5_task_register_test

import android.view.View
import com.example.my_week5_task_register_test.util.AppValidation
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class FormValidationTests {

    @Test
    fun valid_name(){
        var name = "Dennis"
        var result = AppValidation.validateName(name)
        assertTrue(result)
    }


    @Test
    fun is_valid_email_address(){
        var emailAddress = "ui89@gmail.com"
        assertTrue(AppValidation.validateEmail(emailAddress))
    }


    @Test
    fun phonenumber_is_valid() {
        val phoneNumber = "+2348055443323"
        assertTrue(AppValidation.validatePhoneNumber(phoneNumber))
    }


}