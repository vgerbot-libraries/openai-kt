package com.vgerbot.openai.model

/**
 * @property query Query to search against the documents.
 * @property documents Up to 200 documents to search over, provided as a list of strings. The maximum document length (in tokens) is 2034 minus the number of tokens in the query. You should specify either `documents` or a `file`, but not both.
 * @property file The ID of an uploaded file that contains documents to search over. You should specify either `documents` or a `file`, but not both.
 * @property max_rerank The maximum number of documents to be re-ranked and returned by search. This flag only takes effect when `file` is set.
 * @property return_metadata A special boolean flag for showing metadata. If set to `true`, each document entry in the returned JSON will contain a \"metadata\" field. This flag only takes effect when `file` is set.
 * @property user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
 */
data class CreateSearchRequest(
    val query: String,
    val documents: List<String>? = null,
    val file: String? = null,
    val max_rerank: Int? = null,
    val return_metadata: Boolean? = null,
    val user: String? = null
)

/**
 * @property object
 * @property model
 * @property data
 */
data class CreateSearchResponse(
    val object_: String? = null,
    val model: String? = null,
    val data: List<CreateSearchResponseDataInner>? = null
)

/**
 * @property object
 * @property document
 * @property score
 */
data class CreateSearchResponseDataInner(
    val object_: String? = null,
    val document: Int? = null,
    val score: Double? = null
)
