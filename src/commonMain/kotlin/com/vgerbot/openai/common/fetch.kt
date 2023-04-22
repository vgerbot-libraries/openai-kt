package com.vgerbot.openai.common

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

val client = HttpClient()
suspend fun fetch(url: Url, init: HttpRequestBuilder.() -> Unit): HttpResponse {
    return client.request(url, init)
}
