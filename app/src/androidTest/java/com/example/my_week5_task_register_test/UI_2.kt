package com.example.my_week5_task_register_test

import androidx.test.espresso.Espresso.onView

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4ClassRunner::class)

class UI_2 {
    @get:Rule
    val activityRule:ActivityScenarioRule<Welcome> = ActivityScenarioRule(Welcome::class.java)


    @Test
    fun Check_Welcome_Activity_Visibility(){

        onView(withId(R.id.welcome_activity_root_layout)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_nameText_visibility(){

        onView(withId(R.id.name_text)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_emailText_vsisbility(){

        onView(withId(R.id.email_text)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_phoneText_visibility(){

        onView(withId(R.id.phone_text)).check(matches(isDisplayed()))
    }

    @Test
    fun Check_sexText_visibility(){

        onView(withId(R.id.sex_text)).check(matches(isDisplayed()))
    }



}