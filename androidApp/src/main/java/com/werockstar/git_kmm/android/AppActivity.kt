package com.werockstar.git_kmm.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.werockstar.git_kmm.android.ui.GitUserScreen
import com.werockstar.git_kmm.android.ui.composable.AppBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitUserApp()
        }
    }
}

@Composable
fun GitUserApp() {
    Scaffold(topBar = {
        AppBar()
    }) {
        GitUserScreen()
    }
}

@Composable
@Preview
fun GitUserAppPreview() {
    GitUserApp()
}