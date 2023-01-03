package com.werockstar.gitkmm.data.remote

import com.werockstar.gitkmm.data.model.GitUserResponse
import com.werockstar.gitkmm.ui.GitUser
import io.ktor.client.request.*

class GitLoader {

    private val httpClient by lazy { KtorClient.create() }

    suspend fun fetchUsers(): List<GitUser> {
        return httpClient.get<List<GitUserResponse>>(GitURL.USERS)
            .map { GitUser(it.username, it.avatarUrl, it.name) }
    }
}