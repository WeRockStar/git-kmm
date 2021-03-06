package com.werockstar.git_kmm.data.remote

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.features.logging.*

actual object KtorLogging {
    actual fun create(): Logger {
        val logger = object : Logger {
            override fun log(message: String) {
                Napier.d(tag = "iOSKtor", message = message)
            }

        }
        return logger.also {
            Napier.base(DebugAntilog())
        }
    }

}