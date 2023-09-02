package com.curso.android.app.practice.proyectofinal

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.Test

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun tesTextVisible() {
        Espresso.onView(withId(R.id.editText1)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.editText2)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.compareButton)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.resulTextView)).check(matches(isDisplayed()))
    }
}

