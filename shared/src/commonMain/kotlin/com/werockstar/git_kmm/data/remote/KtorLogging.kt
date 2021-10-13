package com.werockstar.git_kmm.data.remote

import io.ktor.client.features.logging.*

expect object KtorLogging {
    fun create(): Logger
}