package com.example.kmmbalances

import io.ktor.client.HttpClient

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun initLogger()

expect fun createHttpClient(): HttpClient
