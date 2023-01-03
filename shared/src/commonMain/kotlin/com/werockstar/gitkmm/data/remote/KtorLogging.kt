package com.werockstar.gitkmm.data.remote

import io.ktor.client.features.logging.*

expect object KtorLogging {
    fun create(): Logger
}