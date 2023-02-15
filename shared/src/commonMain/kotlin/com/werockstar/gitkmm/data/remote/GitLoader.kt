package com.werockstar.gitkmm.data.remote

import com.werockstar.gitkmm.data.ktor.KtorClient
import com.werockstar.gitkmm.data.model.GitUserResponse
import com.werockstar.gitkmm.ui.GithubUser
import io.ktor.client.call.*
import io.ktor.client.request.*

class GitLoader {

    private val httpClient by lazy { KtorClient.create() }

    suspend fun fetchUsers(): List<GithubUser> {
        return httpClient.get("/users")
            .body<List<GitUserResponse>>()
            .map { GithubUser(it.username, it.avatarUrl, it.name, it.id) }
    }
}