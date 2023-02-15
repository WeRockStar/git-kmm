package com.werockstar.gitkmm.data.ktor

import io.ktor.client.engine.*
import io.ktor.client.engine.darwin.*

actual class KtorEngine {
    actual fun create(): HttpClientEngine = Darwin.create()
}