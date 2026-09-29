package com.deepaksah.marrow.rebuild

data class ReviewMetrics(
    val total: Int,
    val correct: Int,
    val wrong: Int,
    val skipped: Int,
    val bookmarked: Int
) {
    companion object {
        fun from(ids: List<String>, answers: Map<String, McqAnswerState>) =
            ReviewMetrics(
                ids.size,
                ids.count { answers[it]?.isRight == true },
                ids.count { answers[it]?.isRight == false && answers[it]?.skipped != true },
                ids.count { answers[it]?.skipped == true },
                ids.count { answers[it]?.isStarred == true }
            )
    }
}