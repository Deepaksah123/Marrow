package com.deepaksah.marrow.rebuild

data class QBankScoreState(
    val total: Int = 0,
    val attempted: Int = 0,
    val correct: Int = 0,
    val wrong: Int = 0,
    val skipped: Int = 0,
    val accuracy: Float = 0f,
    val score: Float? = null,
    val timeMs: Long = 0L,
    val possibleScore: Float? = null,
    val percentile: Float? = null,
    val rank: Int? = null
) {
    companion object {
        fun from(total: Int, answers: Collection<McqAnswerState>): QBankScoreState {
            val attempted = answers.count { it.selectedAnswer != null && !it.skipped }
            val correct = answers.count { it.isRight == true }
            val wrong = answers.count { it.isRight == false }
            val skipped = answers.count { it.skipped }
            val accuracy = if (attempted == 0) 0f else correct.toFloat() * 100f / attempted
            return QBankScoreState(total, attempted, correct, wrong, skipped, accuracy)
        }
    }
}
