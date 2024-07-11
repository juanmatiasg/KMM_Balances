package com.example.kmmbalances.data.remote

import com.example.kmmbalances.Config
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.accept
import io.ktor.http.ContentType
import io.ktor.http.path
import io.ktor.http.takeFrom

abstract class KtorApi {

    fun HttpRequestBuilder.pathUrl(path: String) {
        url {
            takeFrom(Config.BASE_URL)
            path(path)
            accept(ContentType.Application.Json)
        }
    }

}
