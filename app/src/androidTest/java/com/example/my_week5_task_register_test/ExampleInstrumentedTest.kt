package com.example.my_week5_task_register_test

import androidx.test.platform.app.InstrumentationRegistry

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner


import androidx.test.espresso.action.ViewActions.*

import androidx.test.espresso.matcher.ViewMatchers.*

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


import org.junit.Assert.*


@RunWith(AndroidJUnit4ClassRunner::class)
class ExampleInstrumentedTest {


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.my_week5_task_register_test", appContext.packageName)
    }

    @Test
    fun registerActivity_visibility(){

    }
}