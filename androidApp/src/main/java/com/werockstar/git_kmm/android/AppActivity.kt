package com.werockstar.git_kmm.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.werockstar.git_kmm.android.ui.GitUserScreen
import com.werockstar.git_kmm.android.ui.GitUserViewModel
import com.werockstar.git_kmm.android.ui.composable.AppBar
import com.werockstar.git_kmm.ui.GitUser
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
fun GitUserApp(users: List<GitUser>) {
    Scaffold(topBar = {
        AppBar()
    }) {
        GitUserScreen(it, users)
    }
}

@Composable
@Preview
fun GitUserAppPreview() {
    val users = listOf(GitUser("WeRockStar", "", ""))
    GitUserApp(users)
}