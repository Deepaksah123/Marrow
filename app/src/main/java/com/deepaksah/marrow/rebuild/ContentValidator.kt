package com.deepaksah.marrow.rebuild

data class ContentValidationResult(
    val valid: Boolean,
    val errors: List<String>
)

object ContentValidator {
    fun validate(question: McqContent): ContentValidationResult {
        val errors = mutableListOf<String>()
        if (question.id.isBlank()) errors += "missing question id"
        if (question.text.isBlank()) errors += "missing question text"
        if (question.choices.size < 2) errors += "fewer than two choices"
        if (question.choices.map { it.id }.distinct().size != question.choices.size) errors += "duplicate choice ids"
        if (question.correctChoiceId != null && question.correctChoiceId !in question.choices.map { it.id }) {
            errors += "correct choice id does not match supplied choices"
        }
        return ContentValidationResult(errors.isEmpty(), errors)
    }

    fun validateModule(moduleId: String, questions: List<McqContent>): ContentValidationResult {
        val errors = mutableListOf<String>()
        if (moduleId.isBlank()) errors += "missing module id"
        val ids = questions.map { it.id }
        if (ids.size != ids.distinct().size) errors += "duplicate question ids"
        questions.forEachIndexed { index, q ->
            val result = validate(q)
            result.errors.forEach { errors += "question[$index]: $it" }
        }
        return ContentValidationResult(errors.isEmpty(), errors)
    }
}