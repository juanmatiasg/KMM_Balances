package com.example.kmmbalances

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.HttpClient

actual fun initLogger() {
}

actual fun createHttpClient(): HttpClient {
    Napier.base(DebugAntilog())
}