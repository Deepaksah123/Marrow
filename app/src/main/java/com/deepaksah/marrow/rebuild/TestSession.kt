package com.deepaksah.marrow.rebuild

/**
 * Test-local interaction state.
 *
 * Kept separate from QBankSession because the recovered source models test
 * answers independently (my_answer, answer_changed, mark_reviewed, guessed).
 */
class TestSession(private val state: MarrowStateStore) {

    fun answer(mcqId: String, selected: String, correct: String?) {
        val old = state.test.answers[mcqId]
        val right = correct != null && selected == correct
        state.setTestAnswer(
            McqAnswerState(
                mcqId = mcqId,
                selectedAnswer = selected,
                firstAnswer = old?.firstAnswer ?: selected,
                serverAnswer = correct,
                isRight = right,
                isStarred = old?.isStarred ?: false,
                isGuessed = old?.isGuessed ?: false,
                isSillyMistake = old?.isSillyMistake ?: false,
                skipped = false,
                changedByYou = old?.firstAnswer != null && old.firstAnswer != selected,
                locked = true
            )
        )
    }

    fun skip(mcqId: String) {
        val old = state.test.answers[mcqId] ?: McqAnswerState(mcqId)
        state.setTestAnswer(old.copy(skipped = true, locked = true))
    }

    fun toggleBookmark(mcqId: String) {
        val old = state.test.answers[mcqId] ?: McqAnswerState(mcqId)
        state.setTestAnswer(old.copy(isStarred = !old.isStarred))
    }

    fun markGuessed(mcqId: String, guessed: Boolean = true) {
        val old = state.test.answers[mcqId] ?: McqAnswerState(mcqId)
        state.setTestAnswer(old.copy(isGuessed = guessed))
    }
}
