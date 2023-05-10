package com.vgerbot.openai.model

/**
 * @property text
 */
data class CreateTranscriptionResponse(val text: String)

/**
 * @property text
 */
data class CreateTranslationResponse(val text: String)

/**
 * @property id
 * @property object
 * @property deleted
 */
data class DeleteFileResponse(val id: String, val object_: String, val deleted: Boolean)

/**
 * @property id
 * @property object
 * @property deleted
 */
data class DeleteModelResponse(val id: String, val object_: String, val deleted: Boolean)

/**
 * @property id
 * @property object
 * @property created
 * @property ready
 */
data class Engine(val id: String, val object_: String, val created: Int?, val ready: Boolean)

/**
 * @property id
 * @property object
 * @property created_at
 * @property updated_at
 * @property model
 * @property fine_tuned_model
 * @property organization_id
 * @property status
 * @property hyperparams
 * @property training_files
 * @property validation_files
 * @property result_files
 * @property events
 */
data class FineTune(
    val id: String,
    val object_: String,
    val created_at: Int,
    val updated_at: Int,
    val model: String,
    val fine_tuned_model: String?,
    val organization_id: String,
    val status: String,
    val hyperparams: Map<String, Any>,
    val training_files: List<OpenAIFile>,
    val validation_files: List<OpenAIFile>,
    val result_files: List<OpenAIFile>,
    val events: List<FineTuneEvent>?
)

/**
 * @property object
 * @property created_at
 * @property level
 * @property message
 */
data class FineTuneEvent(
    val object_: String,
    val created_at: Int,
    val level: String,
    val message: String
)

/**
 * @property created
 * @property data
 */
data class ImagesResponse(val created: Int, val data: List<ImagesResponseDataInner>)

/**
 * @property url
 * @property b64_json
 */
data class ImagesResponseDataInner(val url: String?, val b64_json: String?)

/**
 * @property object
 * @property data
 */
data class ListEnginesResponse(val object_: String, val data: List<Engine>)

/**
 * @property object
 * @property data
 */
data class ListFilesResponse(val object_: String, val data: List<OpenAIFile>)

/**
 * @property object
 * @property data
 */
data class ListFineTuneEventsResponse(val object_: String, val data: List<FineTuneEvent>)

/**
 * @property object
 * @property data
 */
data class ListFineTunesResponse(val object_: String, val data: List<FineTune>)

/**
 * @property object
 * @property data
 */
data class ListModelsResponse(val object_: String, val data: List<Model>)

/**
 * @property id
 * @property object
 * @property created
 * @property owned_by
 */
data class Model(val id: String, val object_: String, val created: Int, val owned_by: String)

/**
 * @property id
 * @property object
 * @property bytes
 * @property created_at
 * @property filename
 * @property purpose
 * @property status
 * @property status_details
 */
data class OpenAIFile(
    val id: String,
    val object_: String,
    val bytes: Int,
    val created_at: Int,
    val filename: String,
    val purpose: String,
    val status: String?,
    val status_details: Map<String, Any>?
)
