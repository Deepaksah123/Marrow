package com.deepaksah.marrow.rebuild
data class QBankTrackerRows(val metrics: QBankMetrics) {
    fun rows(): List<Pair<String,String>> = listOf(
        "Total questions" to metrics.total.toString(),
        "Attempted" to metrics.attempted.toString(),
        "Correct" to metrics.correct.toString(),
        "Wrong" to metrics.wrong.toString(),
        "Skipped" to metrics.skipped.toString(),
        "Bookmarked" to metrics.bookmarked.toString(),
        "Accuracy" to String.format("%.1f%%",metrics.accuracy)
    )
}