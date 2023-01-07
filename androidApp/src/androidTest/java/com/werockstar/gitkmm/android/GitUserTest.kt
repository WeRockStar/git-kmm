package com.werockstar.gitkmm.android

import androidx.compose.ui.test.junit4.createComposeRule
import com.karumi.shot.ScreenshotTest
import com.werockstar.gitkmm.android.ui.composable.GitUser
import com.werockstar.gitkmm.ui.GithubUser
import org.junit.Rule
import org.junit.Test

class GitUserTest : ScreenshotTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun github_user() {
        val user = GithubUser("WeRockStar", "https://google.com/image.jpg", "Kotchaphan Muangsan")
        composeRule.setContent {
            GitUser(user = user)
        }

        compareScreenshot(composeRule)
    }
}