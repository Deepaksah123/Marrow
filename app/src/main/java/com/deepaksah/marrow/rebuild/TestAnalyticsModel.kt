package com.deepaksah.marrow.rebuild

data class TestAnalyticsModel(
    val metrics: TestMetrics,
    val completionPercent: Double,
    val accuracyPercent: Double,
    val bookmarked: Int,
    val guessed: Int,
    val changedByYou: Int
) {
    companion object {
        fun from(state: TestState): TestAnalyticsModel {
            val m = TestEngine.metrics(state)
            val completion = if (m.total == 0) 0.0 else (m.attempted + m.skipped).toDouble() / m.total * 100.0
            val answers = state.answers.values
            return TestAnalyticsModel(
                metrics = m,
                completionPercent = completion,
                accuracyPercent = m.accuracy,
                bookmarked = answers.count { it.isStarred },
                guessed = answers.count { it.isGuessed },
                changedByYou = answers.count { it.changedByYou }
            )
        }
    }
}
