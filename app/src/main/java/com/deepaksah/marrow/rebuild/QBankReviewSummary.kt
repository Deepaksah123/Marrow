package com.deepaksah.marrow.rebuild

data class QBankReviewSummary(
    val total: Int,
    val bookmarked: Int,
    val changedByYou: Int,
    val correct: Int,
    val wrong: Int,
    val guessedCorrect: Int,
    val guessedWrong: Int,
    val sillyMistakes: Int,
    val skipped: Int
) {
    companion object {
        fun from(ids: List<String>, answers: Map<String, McqAnswerState>): QBankReviewSummary {
            val rows = ids.mapNotNull { answers[it] }
            return QBankReviewSummary(
                total = ids.size,
                bookmarked = rows.count { it.isStarred },
                changedByYou = rows.count { it.changedByYou },
                correct = rows.count { it.isRight == true },
                wrong = rows.count { it.isRight == false && !it.skipped },
                guessedCorrect = rows.count { it.isGuessed && it.isRight == true },
                guessedWrong = rows.count { it.isGuessed && it.isRight == false },
                sillyMistakes = rows.count { it.isSillyMistake },
                skipped = rows.count { it.skipped }
            )
        }
    }
}
