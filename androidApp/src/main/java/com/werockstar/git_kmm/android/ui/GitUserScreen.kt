package com.werockstar.git_kmm.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.werockstar.git_kmm.android.ui.composable.GitUser

@Composable
fun GitUserScreen(viewModel: GitUserViewModel = viewModel()) {
    val users = viewModel.users.observeAsState(emptyList())
    LaunchedEffect(Unit) {
        viewModel.fetchUsers()
    }
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        items(users.value) {
            GitUser(user = it)
        }
    }
}