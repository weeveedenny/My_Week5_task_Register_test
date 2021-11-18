package com.example.my_week5_task_register_test.util



object AppValidation {

    fun validateName(name: String): Boolean {
        if (name.isBlank()) {
            return false
        }
        return true
    }



    fun validateEmail(email: String): Boolean {

        if (email.isBlank()){
            return false
        }
        val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"

            return EMAIL_REGEX.toRegex().matches(email);
    }



    fun validatePhoneNumber(phoneNumber: String): Boolean {

        if (phoneNumber.startsWith("070", true) && (phoneNumber.length == 11)) {
            return true
        }
        else if (phoneNumber.startsWith("080", true) && (phoneNumber.length == 11)) {
            return true
        }
        else if (phoneNumber.startsWith("090", true) && (phoneNumber.length == 11)) {
            return true
        }
        else if (phoneNumber.startsWith("081", true) && (phoneNumber.length == 11)) {
            return true
        }
        else if (phoneNumber.startsWith("+234", true) && (phoneNumber.length > 11)) {
            return true
        } else if (phoneNumber.startsWith("234", true) && (phoneNumber.length == 11)) {
            return true
        }
        return false
    }

    fun validateInputs(name: String, email: String, phoneNumber: String): Boolean {
        return  validateEmail(email) && validateName(name) && validatePhoneNumber(phoneNumber)
    }
}