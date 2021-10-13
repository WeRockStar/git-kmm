package com.werockstar.git_kmm.android.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppBar() {
    Box(
        modifier = Modifier
            .height(58.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colors.primary)
    ) {
        Text(
            text = "KMM (Jetpack Compose)",
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.h6,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun AppBarPreview() {
    AppBar()
}