package com.deepaksah.marrow.rebuild

/**
 * Recovered Marrow APK field-parity contracts for Test and Video surfaces.
 * No live/server values are embedded here.
 */
data class SourceTestHomeItem(
    val duration: Int = 0,
    val id: String = "",
    val isPaid: Boolean = false,
    val mcqCount: Int = 0,
    val monthString: String? = null,
    val msEndTimestamp: Long = 0L,
    val msResultPublishTimestamp: Long = 0L,
    val msStartTimeStamp: Long = 0L,
    val rank: Int = 0,
    val status: Int = 0,
    val testType: String? = null,
    val title: String? = null
)

data class SourceTestMini(
    val id: String? = null,
    val testType: String? = null,
    val subjectId: String? = null,
    val title: String? = null,
    val duration: Int = 0,
    val mcqCount: Int = 0,
    val rank: Int = 0,
    val status: Int = 0,
    val startTimestamp: Long = 0L,
    val endTimestamp: Long = 0L,
    val modifiedEndTimestampMs: Long = 0L,
    val testPattern: Int = 0,
    val isMockTest: Boolean = false,
    val maxMcqCount: Int = 0,
    val availabilityType: Int = 0,
    val userStartedTimestampMs: Long = 0L,
    val userSubmittedTimestampMs: Long = 0L,
    val testStatus: Int = 0,
    val isPaid: Boolean = false,
    val resultPublishTimestamp: Long = 0L
)

data class SourceVideoInfoMini(
    val id: String? = null,
    val mediaId: String? = null,
    val psshData: String? = null
)
