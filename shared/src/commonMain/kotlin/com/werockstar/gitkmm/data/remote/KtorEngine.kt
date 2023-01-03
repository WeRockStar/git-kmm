package com.werockstar.gitkmm.data.remote

import io.ktor.client.engine.*

expect class KtorEngine() {
    fun create(): HttpClientEngine
}