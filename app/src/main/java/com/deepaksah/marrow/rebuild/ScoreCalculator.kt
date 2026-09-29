package com.deepaksah.marrow.rebuild

data class ScoreSnapshot(
    val total: Int,
    val attempted: Int,
    val correct: Int,
    val wrong: Int,
    val skipped: Int,
    val accuracy: Double
)

object ScoreCalculator {
    fun qbank(ids: List<String>, answers: Map<String, McqAnswerState>): ScoreSnapshot {
        val rows = ids.mapNotNull { answers[it] }
        val attempted = rows.count { it.selectedAnswer != null && !it.skipped }
        val correct = rows.count { it.isRight == true }
        val wrong = rows.count { it.isRight == false && !it.skipped }
        val skipped = rows.count { it.skipped }
        val accuracy = if (attempted == 0) 0.0 else correct.toDouble() / attempted * 100.0
        return ScoreSnapshot(ids.size, attempted, correct, wrong, skipped, accuracy)
    }
}