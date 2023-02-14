package com.werockstar.gitkmm.data.ktor

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.plugins.logging.*

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