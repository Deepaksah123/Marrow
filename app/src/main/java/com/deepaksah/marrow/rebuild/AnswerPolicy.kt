package com.deepaksah.marrow.rebuild

object AnswerPolicy {
    fun canSelect(answer: McqAnswerState?): Boolean = answer?.locked != true

    fun select(state: MarrowStateStore, question: McqContent, choiceId: String) {
        if (!canSelect(state.session.answers[question.id])) {
            return
        }
        QBankSession(state).answer(question.id, choiceId, question.correctChoiceId)
    }

    fun skip(state: MarrowStateStore, question: McqContent) {
        if (!canSelect(state.session.answers[question.id])) {
            return
        }
        QBankSession(state).skip(question.id)
    }
}