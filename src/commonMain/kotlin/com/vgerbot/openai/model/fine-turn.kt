package com.vgerbot.openai.model

import kotlin.String
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.List

/**
 * @property training_file The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.
 * @property validation_file The ID of an uploaded file that contains validation data.
 * @property model The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21.
 * @property n_epochs The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
 * @property batch_size The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.
 * @property learning_rate_multiplier The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.
 * @property prompt_loss_weight The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt.
 * @property compute_classification_metrics If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch.
 * @property classification_n_classes The number of classes in a classification task.  This parameter is required for multiclass classification.
 * @property classification_positive_class The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
 * @property classification_betas If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score.
 * @property suffix A string of up to 40 characters that will be added to your fine-tuned model name.
 */
data class CreateFineTuneRequest(
    val training_file: String,
    val validation_file: String? = null,
    val model: String? = null,
    val n_epochs: Number? = null,
    val batch_size: Number? = null,
    val learning_rate_multiplier: Number? = null,
    val prompt_loss_weight: Number? = null,
    val compute_classification_metrics: Boolean? = null,
    val classification_n_classes: Number? = null,
    val classification_positive_class: String? = null,
    val classification_betas: List<Number>? = null,
    val suffix: String? = null
)
