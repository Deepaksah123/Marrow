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

data class SourceHomeFeatured(
    val id: String? = null,
    val contentType: String? = null,
    val contentId: String? = null,
    val contentTitle: String? = null,
    val subTitle: String? = null,
    val thumbnail: String? = null,
    val label: String? = null
)

data class SourceHomeTest(
    val id: String,
    val title: String? = null,
    val isPaid: Boolean = false,
    val status: Int = 0,
    val isResultAvailable: Boolean = false,
    val testType: String? = null,
    val resultTimeStamp: Long = 0L,
    val expiryTimeStamp: Long = 0L,
    val startTimeStamp: Long = 0L,
    val duration: Int = 0,
    val availabilityType: Int = 0,
    val questionCount: Int = 0,
    val userStartedTimestamp: Long = 0L,
    val hasAccess: Boolean = false
)

data class SourceHomeVideo(
    val id: String? = null,
    val thumbnail: String? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val subject: String? = null,
    val durationText: String? = null,
    val rating: Float = 0f,
    val count: Int = 0,
    val reason: Int = 0,
    val isPaid: Boolean = false,
    val status: Int = 0,
    val isDownloaded: Boolean = false,
    val isUnlocked: Boolean = false,
    val videoProgress: Int = 0
)

data class SourceHomeMain(
    val featuredCards: List<SourceHomeFeatured> = emptyList(),
    val qbankModels: List<SourceHomeQBank> = emptyList(),
    val testModels: List<SourceHomeTest> = emptyList(),
    val videoModels: List<SourceHomeVideo> = emptyList()
)


/**
 * Exact HomePageItems contract recovered from CourseConfigV2/HomeViewModelV2.
 * Order is the native enum/config order; it is NOT a guessed UI order.
 */
enum class RecoveredHomePageItem {
    MCQ_OF_THE_DAY,
    FEATURED_CARD,
    SUGGESTED_TEST,
    SUGGESTED_QBANK,
    SUGGESTED_VIDEO,
    PEARLS,
    RECENT_UPDATES,
    RENEW_CARD,
    MAGIC_MODULE
}

object HomeSurfacePolicy {
    fun enabled(config: Set<RecoveredHomePageItem>, item: RecoveredHomePageItem): Boolean =
        item in config
}
