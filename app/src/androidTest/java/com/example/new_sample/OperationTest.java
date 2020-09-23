package com.example.new_sample;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class OperationTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void additionTest() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1+")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));
    }

    @Test
    public void subtractionTest() {
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2-")));
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));
    }

    @Test
    public void multiplicationTest() {
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2×")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("4")));
    }

    @Test
    public void divisionTest() {
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("4/")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

//    @Test
//    public void extraTest() {
//        onView(withId(R.id.button2)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("2")));
//        onView(withId(R.id.button_para1)).perform(click());
//        onView(withId(R.id.output)).check(matches(withText("2-")));
//        onView(withId(R.id.button1)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("1")));
//        onView(withId(R.id.button_equal)).perform(click());
//        onView(withId(R.id.output)).check(matches(withText("1")));
//    }

    @Test
    public void modulusTest() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("10")));
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10%")));
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }

    @Test
    public void repeatedCalcTest() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1+")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));

        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("6×")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("12")));
    }
}