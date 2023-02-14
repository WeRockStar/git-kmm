package com.werockstar.gitkmm.data.ktor

import io.ktor.client.engine.*
import io.ktor.client.engine.ios.*

actual class KtorEngine {
    actual fun create(): HttpClientEngine = Ios.create()
}