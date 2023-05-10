package com.vgerbot.openai.model

/**
 * @property input The input text to classify
 * @property model Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`.
 */
data class CreateModerationRequest(
    val input: CreateModerationRequestInput,
    val model: String? = null
)

sealed class CreateModerationRequestInput {
    data class ListInput(val list: List<String>): CreateModerationRequestInput()
    data class StringInput(val string: String): CreateModerationRequestInput()
}

/**
 * @property id
 * @property model
 * @property results
 */
data class CreateModerationResponse(
    val id: String,
    val model: String,
    val results: List<CreateModerationResponseResultsInner>
)

/**
 * @property flagged
 * @property categories
 * @property category_scores
 */
data class CreateModerationResponseResultsInner(
    val flagged: Boolean,
    val categories: CreateModerationResponseResultsInnerCategories,
    val category_scores: CreateModerationResponseResultsInnerCategoryScores
)

/**
 * @property hate
 * @property hateThreatening
 * @property selfHarm
 * @property sexual
 * @property sexualMinors
 * @property violence
 * @property violenceGraphic
 */
data class CreateModerationResponseResultsInnerCategories(
    val hate: Boolean,
    val hateThreatening: Boolean,
    val selfHarm: Boolean,
    val sexual: Boolean,
    val sexualMinors: Boolean,
    val violence: Boolean,
    val violenceGraphic: Boolean
)

/**
 * @property hate
 * @property hateThreatening
 * @property selfHarm
 * @property sexual
 * @property sexualMinors
 * @property violence
 * @property violenceGraphic
 */
data class CreateModerationResponseResultsInnerCategoryScores(
    val hate: Double,
    val hateThreatening: Double,
    val selfHarm: Double,
    val sexual: Double,
    val sexualMinors: Double,
    val violence: Double,
    val violenceGraphic: Double
)
