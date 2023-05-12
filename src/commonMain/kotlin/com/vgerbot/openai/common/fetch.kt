package com.vgerbot.openai.common

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

expect class FetchInit(
    val method: String,
    val headers: Map<String, String>,
    val body: String?
)

expect class Response {
    val ok: Boolean
    val status: Int
    val statusText: String
    suspend fun text(): String
    suspend inline fun <reified T> json(deserializer: KSerializer<T>): T
}

expect suspend fun fetch(url: String, init: FetchInit.() -> Unit): Response;


