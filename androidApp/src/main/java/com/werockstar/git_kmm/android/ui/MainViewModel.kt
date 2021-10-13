package com.werockstar.git_kmm.android.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.werockstar.git_kmm.data.remote.GitLoader
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val loader: GitLoader) : ViewModel() {

    fun fetchUsers() {
        viewModelScope.launch {

        }
    }
}