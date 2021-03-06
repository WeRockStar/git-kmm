package com.werockstar.git_kmm.data.remote

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*

object KtorClient {
    fun create(): HttpClient {
        val engine = KtorEngine().create()
        return HttpClient(engine) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(
                    kotlinx.serialization.json.Json {
                        ignoreUnknownKeys = true
                        isLenient = true
                        encodeDefaults = false
                    }
                )
            }
            install(Logging) {
                level = LogLevel.HEADERS
                logger = KtorLogging.create()
            }
        }
    }
}