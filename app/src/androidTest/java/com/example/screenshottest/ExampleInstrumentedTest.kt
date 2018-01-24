package com.example.screenshottest

import android.support.test.rule.ActivityTestRule
import com.facebook.testing.screenshot.Screenshot
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    var testRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun takeScreenshot() {
        Screenshot.snapActivity(testRule.activity).record()
    }
}
