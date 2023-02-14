package com.werockstar.gitkmm.data.ktor

import io.ktor.client.plugins.logging.*

expect object KtorLogging {
    fun create(): Logger
}