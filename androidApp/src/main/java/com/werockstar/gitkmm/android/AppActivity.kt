package com.werockstar.gitkmm.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.werockstar.gitkmm.android.ui.GitUserScreen
import com.werockstar.gitkmm.android.ui.GitUserViewModel
import com.werockstar.gitkmm.android.ui.composable.AppBar
import com.werockstar.gitkmm.ui.GithubUser
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppActivity : AppCompatActivity() {

    private val viewModel: GitUserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaunchedEffect(Unit) {
                viewModel.fetchUsers()
            }
            val users = viewModel.users.observeAsState(emptyList())
            GitUserApp(users.value)
        }
    }
}

@Composable
fun GitUserApp(users: List<GithubUser>) {
    Scaffold(topBar = {
        AppBar()
    }) {
        GitUserScreen(it, users)
    }
}

@Composable
@Preview(widthDp = 300, heightDp = 480)
fun GitUserAppPreview() {
    val users = listOf(GithubUser("WeRockStar", "", "", 1))
    GitUserApp(users)
}
