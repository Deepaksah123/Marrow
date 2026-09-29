package com.deepaksah.marrow.rebuild

object ReviewEngine {
    fun filter(ids: List<String>, answers: Map<String, McqAnswerState>, filter: ReviewFilter): List<String> =
        ids.filter { id ->
            val a = answers[id]
            when (filter) {
                ReviewFilter.ALL -> true
                ReviewFilter.BOOKMARKED -> a?.isStarred == true
                ReviewFilter.CHANGED_BY_YOU -> a?.changedByYou == true
                ReviewFilter.CORRECT -> a?.isRight == true
                ReviewFilter.GUESS_CORRECT -> a?.isGuessed == true && a.isRight == true
                ReviewFilter.GUESS_WRONG -> a?.isGuessed == true && a.isRight == false
                ReviewFilter.SILLY_MISTAKES -> a?.isSillyMistake == true
                ReviewFilter.SKIPPED -> a?.skipped == true
                ReviewFilter.WRONG -> a?.let { it.isRight == false && !it.skipped } == true
                ReviewFilter.SCHEMA_MCQS, ReviewFilter.NEW_REVISED -> false
            }
        }
}
