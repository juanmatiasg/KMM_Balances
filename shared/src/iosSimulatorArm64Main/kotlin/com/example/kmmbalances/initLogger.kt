package com.example.kmmbalances

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.HttpClient

actual fun initLogger() {
    Napier.base(DebugAntilog())
}

actual fun createHttpClient(): HttpClient {
    return HttpClient()
}