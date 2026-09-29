package com.deepaksah.marrow.rebuild
object TestReviewCounts {
    fun answered(state: TestState): Int = state.mcqIds.count { state.answers[it]?.selectedAnswer != null }
    fun skipped(state: TestState): Int = state.mcqIds.count { state.answers[it]?.skipped == true }
    fun bookmarked(state: TestState): Int = state.mcqIds.count { state.answers[it]?.isStarred == true }
}