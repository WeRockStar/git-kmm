package com.werockstar.gitkmm.data.ktor

import io.ktor.client.engine.*

expect class KtorEngine() {
    fun create(): HttpClientEngine
}