package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.view.View
import org.junit.Assert.*
import androidx.fragment.app.Fragment
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.PositionAssertions.isCompletelyLeftOf
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith



@RunWith(AndroidJUnit4::class)
    class CrimeDetailFragmentTest {
        private lateinit var scenario: FragmentScenario<CrimeDetailFragment>
    @Before
    fun setUp() {
        scenario = launchFragmentInContainer()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
    @Test
    fun checkCheckboxOnLaunch(){
        onView(withId(R.id.crime_solved)).check(matches(withText(R.string.crime_solved_label)))
        onView(withText(R.string.crime_solved_label)).check(isCompletelyLeftOf(withId(R.id.crime_solved)))
    }
    @Test
    fun checkTextOnLaunch(){
        onView(withId(R.id.crime_date)).check(matches(withText("Wed May 11 11:56 EST 2022")))
        onView(withText("Wed May 11 11:56 EST 2022")).check(isCompletelyLeftOf(withId(R.id.crime_date)))
    }
}
