package com.werockstar.gitkmm.android.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberAsyncImagePainter

@Composable
fun UserImage(url: String?, contentDescription: String = "", modifier: Modifier) {
    Image(
        painter = rememberAsyncImagePainter(url),
        contentDescription = contentDescription,
        modifier = modifier
    )
}

fun Todo() = "Pipeline should fail"
