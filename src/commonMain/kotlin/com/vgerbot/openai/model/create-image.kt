package com.vgerbot.openai.model

/**
 *
 * @property prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @property n The number of images to generate. Must be between 1 and 10.
 * @property size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @property response_format The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @property user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
 */
data class CreateImageRequest(
    val prompt: String,
    val n: Int? = null,
    val size: CreateImageRequestSizeEnum? = null,
    val response_format: CreateImageRequestResponseFormatEnum? = null,
    val user: String? = null
)

/**
 * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 */
enum class CreateImageRequestSizeEnum(private val width: Int, private val height: Int) {
    _256x256(256,256),
    _512x512(512,512),
    _1024x1024(1024,1024);

    override fun toString(): String = "${width}x${height}"
}

/**
 * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 */
enum class CreateImageRequestResponseFormatEnum {
    Url,
    B64Json
}
