package com.example.jasminvucelj.transitiontestapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;


@RunWith(AndroidJUnit4.class)
public class TransitionTest {

	@Rule
	public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

	@Test
	public void testTransition() {
		onView(withId(R.id.button)).perform(click());
		//onView(withId(R.id.textview)).check(matches(isDisplayed()));

		pressBack();

		//onView(withId(R.id.button)).check(matches(withText(containsString("Hello World!"))));
		onView(withId(R.id.button)).check(matches(isDisplayed()));
	}
}