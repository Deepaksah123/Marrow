package com.deepaksah.marrow.rebuild

data class MarrowSessionState(
    val route: MarrowRoute = MarrowRoute.HOME,
    val subjectId: String? = null,
    val moduleId: String? = null,
    val mcqIds: List<String> = emptyList(),
    val currentMcqIndex: Int = 0,
    val qbank: QBankState = QBankState(),
    val answers: Map<String, McqAnswerState> = emptyMap(),
    val selectedTestId: String? = null,
    val selectedTestGroup: String? = null,
    val testMcqIds: List<String> = emptyList(),
    val currentTestIndex: Int = 0,
    val testEndTimeMs: Long? = null
)
