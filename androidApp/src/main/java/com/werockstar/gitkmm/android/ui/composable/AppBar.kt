package com.werockstar.gitkmm.android.ui.composable

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppBar() {
    TopAppBar {
        Text(
            text = "KMM (Jetpack Compose)",
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview
@Composable
fun AppBarPreview() {
    AppBar()
}