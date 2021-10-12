package com.werockstar.git_kmm.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.werockstar.git_kmm.Greeting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText()
        }
    }
}

@Composable
fun GreetingText() {
    val greeting = Greeting().greeting()
    Text(text = greeting)
}

@Preview
@Composable
fun GreetingPreview() {
    GreetingText()
}