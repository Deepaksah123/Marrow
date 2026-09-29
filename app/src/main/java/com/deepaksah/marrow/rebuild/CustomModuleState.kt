package com.deepaksah.marrow.rebuild

enum class CustomModuleStep { INTRO, MODE, SUBJECTS, TOPICS, TAGS, ADDONS, JOIN, GENERATED, PLAY, SCORE }

data class CustomModuleState(
    val step: CustomModuleStep = CustomModuleStep.INTRO,
    val mode: String? = null,
    val subjectIds: List<String> = emptyList(),
    val topicIds: List<String> = emptyList(),
    val tagIds: List<String> = emptyList(),
    val addOnIds: List<String> = emptyList(),
    val joinCode: String? = null,
    val generatedModuleId: String? = null,
    val mcqIds: List<String> = emptyList()
)