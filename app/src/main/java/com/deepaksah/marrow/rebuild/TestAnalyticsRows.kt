package com.deepaksah.marrow.rebuild
object TestAnalyticsRows {
    fun from(state: TestState): List<Pair<String,String>> {
        val a=TestAnalyticsModel.from(state)
        return listOf(
            "Completion" to String.format("%.1f%%",a.completionPercent),
            "Accuracy" to String.format("%.1f%%",a.accuracyPercent),
            "Total" to a.metrics.total.toString(),
            "Attempted" to a.metrics.attempted.toString(),
            "Correct" to a.metrics.correct.toString(),
            "Wrong" to a.metrics.wrong.toString(),
            "Skipped" to a.metrics.skipped.toString()
        )
    }
}