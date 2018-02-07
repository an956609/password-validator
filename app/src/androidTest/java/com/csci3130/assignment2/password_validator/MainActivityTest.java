package com.csci3130.assignment2.password_validator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;

/**
 * Created by agagne on 06/02/18.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivity =
            new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void checkPassword() throws Exception {
        mActivity.getActivity();

        onView(withId(R.id.password_box)).perform(typeText("password"));
        onView(withId(R.id.validate_button)).perform(click());
        onView(withText("Strength: 1 of 5")).check(matches(isDisplayed()));

        onView(withId(R.id.password_box)).perform(typeText("Th!s_IsMy-P4$$Word"));
        onView(withId(R.id.validate_button)).perform(click());
        onView(withText("Strength: 5 of 5")).check(matches(isDisplayed()));
    }

}