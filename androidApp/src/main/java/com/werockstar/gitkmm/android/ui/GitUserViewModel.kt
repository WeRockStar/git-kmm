package com.werockstar.gitkmm.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.werockstar.gitkmm.data.remote.GitLoader
import com.werockstar.gitkmm.ui.GitUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GitUserViewModel @Inject constructor(private val loader: GitLoader) : ViewModel() {

    private val _users: MutableLiveData<List<GitUser>> = MutableLiveData()
    val users: LiveData<List<GitUser>> = _users

    fun fetchUsers() {
        viewModelScope.launch {
            _users.value = loader.fetchUsers()
        }
    }
}