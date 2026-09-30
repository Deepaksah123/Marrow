package com.deepaksah.marrow.rebuild

data class QChoice(
    val id: String,
    val text: String
)

data class McqContent(
    val id: String,
    val text: String,
    val choices: List<QChoice>,
    val correctChoiceId: String? = null,
    val solution: String = "",
    val questionDescription: String? = null,
    val answerDescriptions: List<String> = emptyList(),
    val imageUrl: String? = null,
    val imageUrlV2: String? = null,
    val questionImages: List<String> = emptyList(),
    val explanationImages: List<String> = emptyList(),
    val difficulty: String? = null,
    val displayId: String? = null,
    val tags: List<String> = emptyList(),
    val reference: String? = null,
    val highYieldIds: List<String> = emptyList(),
    val pearlIds: List<String> = emptyList(),
    val magicLine: String? = null,
    val isNew: Boolean = false,
    val isRevised: Boolean = false,
    val isSchema: Boolean = false,
    val locked: Boolean = false
)
