package com.deepaksah.marrow.rebuild

object AnalyticsBuilder {
    fun qbank(ids: List<String>, answers: Map<String, McqAnswerState>, timeSpentMs: Long? = null): AnalyticsSnapshot {
        val m = QBankMetrics.from(ids, answers)
        return AnalyticsSnapshot(m.total, m.attempted, m.correct, m.wrong, m.skipped, m.accuracy, timeSpentMs)
    }

    fun test(ids: List<String>, answers: Map<String, McqAnswerState>, timeSpentMs: Long? = null): AnalyticsSnapshot {
        val m = TestEngine.metrics(ids, answers)
        return AnalyticsSnapshot(m.total, m.attempted, m.correct, m.wrong, m.skipped, m.accuracy, timeSpentMs)
    }
}