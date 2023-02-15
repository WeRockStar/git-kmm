package com.werockstar.gitkmm.data.ktor

import com.werockstar.gitkmm.data.remote.GitURL
import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object KtorClient {
    fun create(): HttpClient {
        val engine = KtorEngine().create()
        return HttpClient(engine) {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                })
            }
            defaultRequest {
                url(GitURL.BASE_URL)
            }
            install(Logging) {
                level = LogLevel.INFO
                logger = KtorLogging.create()
            }
        }
    }
}