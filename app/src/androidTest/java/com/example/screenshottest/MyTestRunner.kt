package com.example.screenshottest

import android.os.Bundle
import android.support.test.runner.AndroidJUnitRunner
import com.facebook.testing.screenshot.ScreenshotRunner

class MyTestRunner : AndroidJUnitRunner() {
    override fun onCreate(args: Bundle) {
        ScreenshotRunner.onCreate(this, args)
        super.onCreate(args)
    }

    override fun finish(resultCode: Int, results: Bundle) {
        ScreenshotRunner.onDestroy()
        super.finish(resultCode, results)
    }
}