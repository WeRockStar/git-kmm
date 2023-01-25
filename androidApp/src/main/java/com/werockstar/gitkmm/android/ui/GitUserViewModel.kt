package com.werockstar.gitkmm.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.werockstar.gitkmm.data.remote.GitLoader
import com.werockstar.gitkmm.ui.GithubUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GitUserViewModel @Inject constructor(private val loader: GitLoader) : ViewModel() {

    private val _users: MutableLiveData<List<GithubUser>> = MutableLiveData()
    val users: LiveData<List<GithubUser>> = _users

    fun fetchGithubUsers() {
        viewModelScope.launch {
            _users.value = loader.fetchUsers()
        }
    }
}
