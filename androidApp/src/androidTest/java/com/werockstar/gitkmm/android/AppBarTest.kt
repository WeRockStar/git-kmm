package com.werockstar.gitkmm.android

import androidx.compose.ui.test.junit4.createComposeRule
import com.karumi.shot.ScreenshotTest
import com.werockstar.gitkmm.android.ui.composable.AppBar
import org.junit.Rule
import org.junit.Test

class AppBarTest : ScreenshotTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun app_bar() {
        composeRule.setContent { AppBar() }

        compareScreenshot(composeRule)
    }
}