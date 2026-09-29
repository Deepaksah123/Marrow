package com.deepaksah.marrow.rebuild

data class QBankMetrics(
    val total: Int,
    val attempted: Int,
    val correct: Int,
    val wrong: Int,
    val skipped: Int,
    val bookmarked: Int
) {
    val unanswered: Int get() = (total - attempted - skipped).coerceAtLeast(0)
    val accuracy: Double get() = if (attempted == 0) 0.0 else correct.toDouble() / attempted * 100.0

    companion object {
        fun from(ids: List<String>, answers: Map<String, McqAnswerState>): QBankMetrics {
            val rows = ids.mapNotNull { answers[it] }
            val attempted = rows.count { it.selectedAnswer != null && !it.skipped }
            val correct = rows.count { it.isRight == true }
            val wrong = rows.count { it.isRight == false && !it.skipped }
            val skipped = rows.count { it.skipped }
            val bookmarked = rows.count { it.isStarred }
            return QBankMetrics(ids.size, attempted, correct, wrong, skipped, bookmarked)
        }
    }
}
