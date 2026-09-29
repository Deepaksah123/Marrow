package com.deepaksah.marrow.rebuild

data class AnalyticsSnapshot(
    val total: Int,
    val attempted: Int,
    val correct: Int,
    val wrong: Int,
    val skipped: Int,
    val accuracy: Double,
    val timeSpentMs: Long? = null
)