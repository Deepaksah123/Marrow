package com.deepaksah.marrow.rebuild

data class QBankState(
    val parentId: String? = null,
    val mcqIds: List<String> = emptyList(),
    val startIndex: Int = 0,
    val currentIndex: Int = 0,
    val totalMcq: Int = 0,
    val resumeExplanation: Boolean = false,
    val vibrationEnabled: Boolean = false,
    val navigationButtonStatus: NavigationButtonStatus = NavigationButtonStatus.NEXT,
    val timerEnabled: Boolean = true,
    val timerDouble: Boolean = false,
    val timerEndAtMs: Long? = null,
    val timerExpired: Boolean = false,
    val answerPositions: Map<String, Int> = emptyMap()
)

enum class NavigationButtonStatus { SKIP, NEXT, COMPLETE, DONE }

data class McqAnswerState(
    val mcqId: String,
    val selectedAnswer: String? = null,
    val firstAnswer: String? = null,
    val serverAnswer: String? = null,
    val isRight: Boolean? = null,
    val isStarred: Boolean = false,
    val isGuessed: Boolean = false,
    val isSillyMistake: Boolean = false,
    val skipped: Boolean = false,
    val changedByYou: Boolean = false,
    val locked: Boolean = false
)
