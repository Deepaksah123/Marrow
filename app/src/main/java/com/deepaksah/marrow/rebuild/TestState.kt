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
    val navigationButtonStatus: NavigationButtonStatus = NavigationButtonStatus.NEXT
) {
    val totalMcq: Int get() = mcqIds.size
}