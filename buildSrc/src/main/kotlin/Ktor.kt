object Ktor {
    private const val ktorVersion = "2.3.0"
    const val core = "io.ktor:ktor-client-core:${ktorVersion}"
    const val serialization = "io.ktor:ktor-serialization-kotlinx-json:$ktorVersion"
    const val android = "io.ktor:ktor-client-android:${ktorVersion}"
    const val ios = "io.ktor:ktor-client-ios:${ktorVersion}"
    const val logging = "io.ktor:ktor-client-logging:${ktorVersion}"
    const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${ktorVersion}"
}