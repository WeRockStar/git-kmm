package com.werockstar.git_kmm.data.remote

import com.werockstar.git_kmm.data.model.GitUserResponse
import com.werockstar.git_kmm.presentation.GitUser
import io.ktor.client.request.*

const val BASE_URL = "https://api.github.com"

class GitLoader {

    private val httpClient by lazy { KtorClient.create() }

    suspend fun fetchUsers(): List<GitUser> {
        val url = "${BASE_URL}/users"
        return httpClient.get<List<GitUserResponse>>(url)
            .map { GitUser(it.username, it.avatarUrl, it.name) }
    }
}