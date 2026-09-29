package com.deepaksah.marrow.rebuild

data class TestState(
    val testId: String? = null,
    val parentType: String? = null,
    val groups: List<String> = emptyList(),
    val mcqIds: List<String> = emptyList(),
    val currentIndex: Int = 0,
    val currentGroup: Int = 0,
    val testEndTimeMs: Long? = null,
    val timedOut: Boolean = false,
    val submissionInProcess: Boolean = false,
    val reviewState: Boolean = false,
    val navigationButtonStatus: NavigationButtonStatus = NavigationButtonStatus.NEXT,
    val timerRunning: Boolean = false,
    val remainingTimeMs: Long? = null,
    val submissionConfirmed: Boolean = false,
    /**
     * Test-local answer state. The original TestResponseBody keeps my_answer,
     * answer_changed, mark_reviewed and guessed separate from QBank state.
     */
    val answers: Map<String, McqAnswerState> = emptyMap()
) {
    val totalMcq: Int get() = mcqIds.size
}
