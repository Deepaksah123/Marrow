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
    val imageUrl: String? = null,
    val imageUrlV2: String? = null,
    val displayId: String? = null,
    val tags: List<String> = emptyList(),
    val highYieldIds: List<String> = emptyList(),
    val pearlIds: List<String> = emptyList(),
    val magicLine: String? = null,
    val locked: Boolean = false
)