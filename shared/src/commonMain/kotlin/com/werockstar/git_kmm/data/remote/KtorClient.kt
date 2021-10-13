package com.werockstar.git_kmm.data.remote

import io.ktor.client.*

expect class KtorClient {
    fun create(): HttpClient
}