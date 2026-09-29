package com.deepaksah.marrow.rebuild

enum class PaletteStatus { UNANSWERED, CORRECT, WRONG, SKIPPED, BOOKMARKED }

object QuestionPalette {
    fun status(id: String, answers: Map<String, McqAnswerState>): PaletteStatus {
        val a = answers[id] ?: return PaletteStatus.UNANSWERED
        if (a.isStarred) return PaletteStatus.BOOKMARKED
        if (a.skipped) return PaletteStatus.SKIPPED
        if (a.isRight == true) return PaletteStatus.CORRECT
        if (a.isRight == false) return PaletteStatus.WRONG
        return PaletteStatus.UNANSWERED
    }
}