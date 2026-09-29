package com.deepaksah.marrow.rebuild
data class TestScoreModel(val metrics: TestMetrics) {
    val accuracyText get() = String.format("%.1f%%",metrics.accuracy)
}