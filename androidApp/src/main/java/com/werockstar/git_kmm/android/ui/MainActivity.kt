package com.werockstar.git_kmm.android.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.viewmodel.compose.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GreetingText()
        }
    }
}

@Composable
fun GreetingText(viewModel: MainViewModel = viewModel()) {
    LaunchedEffect(Unit) {
        viewModel.fetchUsers()
    }

    val users = viewModel.users.observeAsState(emptyList())
    Text(text = users.value.firstOrNull()?.username.orEmpty())
}

@Preview
@Composable
fun GreetingPreview() {

}