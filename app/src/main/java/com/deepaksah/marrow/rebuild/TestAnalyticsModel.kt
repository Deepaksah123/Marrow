package com.deepaksah.marrow.rebuild

data class TestAnalyticsModel(
    val metrics: TestMetrics,
    val completionPercent: Double,
    val accuracyPercent: Double
) {
    companion object {
        fun from(state: TestState): TestAnalyticsModel {
            val m = TestEngine.metrics(state)
            val completion = if (m.total == 0) 0.0 else (m.attempted + m.skipped).toDouble() / m.total * 100.0
            return TestAnalyticsModel(m, completion, m.accuracy)
        }
    }
}
