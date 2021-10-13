package com.werockstar.git_kmm.data.remote

import io.ktor.client.engine.*
import io.ktor.client.engine.ios.*

actual class KtorEngine {
    actual fun create(): HttpClientEngine = Ios.create()
}