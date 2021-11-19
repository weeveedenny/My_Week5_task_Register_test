package com.example.my_week5_task_register_test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4ClassRunner::class)
class UI {
    @get:Rule
    val activityRule:ActivityScenarioRule<Register> = ActivityScenarioRule(Register::class.java)


    @Test
    fun Check_Register_Activity_Visibility(){

        onView(withId(R.id.Register_activity)).check(matches(isDisplayed()))
    }


    @Test
    fun Animation_visibility(){

        onView(withId(R.id.animationView)).check(matches(isDisplayed()))
    }


    @Test
    fun Check_name_textView(){

        onView(withId(R.id.reg_name)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_email_textView(){

        onView(withId(R.id.reg_email)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_phone_textView(){

        onView(withId(R.id.reg_phone)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_gender_textView(){

        onView(withId(R.id.My_spinner)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_register_button_visibility(){

        onView(withId(R.id.`reg_button.`)).check(matches(isDisplayed()))
    }

    @Test
    fun second_activity_is_displayed_when_button_is_clicked(){
        onView(withId(R.id.reg_name)).perform(replaceText("Dennis"))
        onView(withId(R.id.reg_email)).perform(replaceText("dennisbaddest@gmail.com"))
        onView(withId(R.id.reg_phone)).perform(replaceText("08112345678"))
        onView(withId(R.id.`reg_button.`)).perform(click())
        onView(withId(R.id.welcome_activity_root_layout)).check(matches(isDisplayed()))
    }




}