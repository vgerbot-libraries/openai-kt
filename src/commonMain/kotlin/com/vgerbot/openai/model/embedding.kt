package com.vgerbot.openai.model

/**
 * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
 * @param input Input text to get embeddings for, encoded as a string or array of tokens. To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed 8192 tokens in length.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
 */
data class CreateEmbeddingRequest(
    val model: String,
    val input: CreateEmbeddingRequestInput,
    val user: String? = null
)

/**
 * Input text to get embeddings for, encoded as a string or array of tokens.
 * To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays.
 * Each input must not exceed 8192 tokens in length.
 */
sealed class CreateEmbeddingRequestInput {
    data class ArrayAny(val value: List<Any>) : CreateEmbeddingRequestInput()
    data class ArrayNumber(val value: List<Number>) : CreateEmbeddingRequestInput()
    data class ArrayString(val value: List<String>) : CreateEmbeddingRequestInput()
    data class String(val value: kotlin.String) : CreateEmbeddingRequestInput()
}

/**
 * @param object
 * @param model
 * @param data
 * @param usage
 */
data class CreateEmbeddingResponse(
    val `object`: String,
    val model: String,
    val data: List<CreateEmbeddingResponseDataInner>,
    val usage: CreateEmbeddingResponseUsage
)

/**
 * @param index
 * @param object
 * @param embedding
 */
data class CreateEmbeddingResponseDataInner(
    val index: Int,
    val `object`: String,
    val embedding: List<Int>
)

/**
 * @param prompt_tokens
 * @param total_tokens
 */
data class CreateEmbeddingResponseUsage(
    val prompt_tokens: Int,
    val total_tokens: Int
)
