package com.werockstar.git_kmm.android.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberImagePainter

@Composable
fun UserImage(url: String?, contentDescription: String = "", modifier: Modifier) {
    Image(
        painter = rememberImagePainter(url),
        contentDescription = contentDescription,
        modifier = modifier
    )
}