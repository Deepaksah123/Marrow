package com.deepaksah.marrow.rebuild

enum class ReviewFilter {
    ALL, BOOKMARKED, CHANGED_BY_YOU, CORRECT, GUESS_CORRECT,
    GUESS_WRONG, SCHEMA_MCQS, NEW_REVISED, SILLY_MISTAKES, SKIPPED, WRONG
}

data class ReviewState(
    val filter: ReviewFilter = ReviewFilter.ALL,
    val visibleMcqIds: List<String> = emptyList(),
    val selectedMcqId: String? = null,
    val returnRoute: MarrowRoute = MarrowRoute.QBANK_REVIEW
)
