package com.example.my_week5_task_register_test

import android.view.View
import com.example.my_week5_task_register_test.util.AppValidation
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class FormValidationTests {

    @Test
    fun name_not_empty(){
        var name = "Dennis"
        var result = AppValidation.validateName(name)
        assertTrue(result)
    }

    @Test
    fun name_is_empty(){
        var name = ""
        assertFalse(AppValidation.validateName(name))
    }


    @Test
    fun is_valid_email_address(){
        var emailAddress = ""
        assertTrue(AppValidation.validateEmail(emailAddress))
    }


    @Test
    fun phonenumber_is_valid() {
        val phoneNumber = "08123672345"
        assertTrue(AppValidation.validatePhoneNumber(phoneNumber))
    }

    @Test
    fun phone_number_is_invalid() {
        val phoneNumber = "23481667654"
        assertFalse(AppValidation.validatePhoneNumber(phoneNumber))
    }
}