package com.werockstar.git_kmm.data.remote

import io.ktor.client.engine.*

expect class KtorEngine() {
    fun create(): HttpClientEngine
}