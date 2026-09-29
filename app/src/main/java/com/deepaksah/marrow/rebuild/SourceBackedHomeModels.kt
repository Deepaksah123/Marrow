package com.deepaksah.marrow.rebuild

/**
 * Field-parity models derived from the recovered Marrow APK source.
 * These models intentionally mirror the recovered data contracts; they do not
 * fabricate server data.
 */
data class SourceHomeQBank(
    val id: String,
    val thumbnail: String? = null,
    val title: String? = null,
    val subject: String,
    val rating: Float = 0f,
    val count: Int = 0,
    val status: Int = 0,
    val isPaid: Boolean = false,
    val reason: Int = 0,
    val updatedMcqCount: Int = 0,
    val newMcqCount: Int = 0,
    val isUnlocked: Boolean = false,
    val mcqCount: Int = 0,
    val subjectId: String
) {
    fun reasonString(): String = when (reason) {
        1 -> "This is where you paused your last module"
        2 -> "Based on your last solved module"
        6 -> "Recently updated"
        else -> ""
    }

    fun isCompleted(): Boolean = reason == 2
    fun isPaused(): Boolean = reason == 1
    fun isUnattempted(): Boolean = reason == 0
}

data class SourceHomeMain(
    val featuredCards: List<Any> = emptyList(),
    val qbankModels: List<SourceHomeQBank> = emptyList(),
    val testModels: List<Any> = emptyList(),
    val videoModels: List<Any> = emptyList()
)
