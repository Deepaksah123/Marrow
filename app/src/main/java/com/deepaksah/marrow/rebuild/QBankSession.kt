package com.deepaksah.marrow.rebuild

class QBankSession(private val state: MarrowStateStore) {
    fun answer(mcqId: String, selected: String, correct: String?) {
        val old = state.session.answers[mcqId]
        val right = correct != null && selected == correct
        state.setAnswer(McqAnswerState(
            mcqId = mcqId, selectedAnswer = selected,
            firstAnswer = old?.firstAnswer ?: selected,
            serverAnswer = correct, isRight = right,
            isStarred = old?.isStarred ?: false,
            isGuessed = old?.isGuessed ?: false,
            isSillyMistake = old?.isSillyMistake ?: false,
            skipped = false, changedByYou = old?.firstAnswer != null && old.firstAnswer != selected,
            locked = true
        ))
    }
    fun skip(mcqId: String) {
        val old = state.session.answers[mcqId] ?: McqAnswerState(mcqId)
        state.setAnswer(old.copy(skipped = true, locked = true))
    }
    fun toggleBookmark(mcqId: String) {
        val old = state.session.answers[mcqId] ?: McqAnswerState(mcqId)
        state.setAnswer(old.copy(isStarred = !old.isStarred))
    }
}