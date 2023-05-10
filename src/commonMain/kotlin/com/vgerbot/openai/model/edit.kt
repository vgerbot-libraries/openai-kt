package com.vgerbot.openai.model

/**
 * @property model ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
 * @property input The input text to use as a starting point for the edit.
 * @property instruction The instruction that tells the model how to edit the prompt.
 * @property n How many edits to generate for the input and instruction.
 * @property temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both.
 * @property top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered. We generally recommend altering this or `temperature` but not both.
 */
data class CreateEditRequest(
    val model: String,
    val instruction: String,
    val input: String? = null,
    val n: Int? = null,
    val temperature: Double? = null,
    val top_p: Double? = null
)

/**
 * @property object
 * @property created
 * @property choices
 * @property usage
 */
data class CreateEditResponse(
    val `object`: String,
    val created: Int,
    val choices: List<CreateCompletionResponseChoicesInner>,
    val usage: CreateCompletionResponseUsage
)
