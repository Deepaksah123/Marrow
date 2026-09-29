package com.deepaksah.marrow.rebuild

data class ContentValidationResult(
    val valid: Boolean,
    val errors: List<String> = emptyList()
)

object ContentValidation {
    fun validateQuestions(questions: List<McqContent>): ContentValidationResult {
        val errors = mutableListOf<String>()
        val ids = mutableSetOf<String>()
        questions.forEachIndexed { i, q ->
            if (q.id.isBlank()) errors += "Question[" + i + "] has no id"
            if (!ids.add(q.id)) errors += "Duplicate question id: " + q.id
            if (q.choices.isEmpty()) errors += "Question[" + i + "] has no choices"
            if (q.correctChoiceId != null && q.choices.none { it.id == q.correctChoiceId }) {
                errors += "Question[" + i + "] correct_choice_id is not present in choices"
            }
        }
        return ContentValidationResult(errors.isEmpty(), errors)
    }
}