package com.example.myapplication



import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loginComSucesso(){
        onView(withText("MEU PRIMEIRO APP - AUTOMACAO")).check(matches(isDisplayed()))
        onView(withId(R.id.campoemail)).perform(typeText("lucas.emanuel@test.com.br"))
        onView(withId(R.id.camposenha)).perform(typeText("LucQAs123"))
        closeSoftKeyboard()
        onView(withText("LOGAR")).perform(click())
        onView(withText("Logado!!")).check(matches(isDisplayed()))
        onView(withId(R.id.voltar)).perform(click())
    //sprender sobre o framework Barista o mesmo é louvavel para fazer asserssoes e cliques no elemento
    }
}