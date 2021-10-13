package com.werockstar.git_kmm.data.remote

import com.werockstar.git_kmm.data.model.GitUserResponse
import com.werockstar.git_kmm.ui.GitUser
import io.ktor.client.request.*

class GitLoader {

    private val httpClient by lazy { KtorClient.create() }

    suspend fun fetchUsers(): List<GitUser> {
        return httpClient.get<List<GitUserResponse>>(GitURL.USERS)
            .map { GitUser(it.username, it.avatarUrl, it.name) }
    }
}