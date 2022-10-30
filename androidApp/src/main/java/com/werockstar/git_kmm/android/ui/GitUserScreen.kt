package com.werockstar.git_kmm.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.werockstar.git_kmm.android.ui.composable.GitUser
import com.werockstar.git_kmm.ui.GitUser

@Composable
fun GitUserScreen(paddingValues: PaddingValues, users: List<GitUser>, ) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp), contentPadding = paddingValues) {
        items(users) {
            GitUser(user = it)
        }
    }
}