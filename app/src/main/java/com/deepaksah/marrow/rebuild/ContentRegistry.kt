package com.deepaksah.marrow.rebuild

class ContentRegistry(
    private val validator: (McqContent) -> ContentValidationResult = ContentValidator::validate
) {
    private val modules = LinkedHashMap<String, List<String>>()
    private val questions = LinkedHashMap<String, McqContent>()

    fun registerModule(moduleId: String, sourceQuestions: List<McqContent>): ContentValidationResult {
        val moduleResult = ContentValidator.validateModule(moduleId, sourceQuestions)
        if (!moduleResult.valid) return moduleResult
        sourceQuestions.forEach { questions[it.id] = it }
        modules[moduleId] = sourceQuestions.map { it.id }
        return ContentValidationResult(true, emptyList())
    }

    fun question(id: String): McqContent? = questions[id]
    fun questionIds(moduleId: String): List<String> = modules[moduleId].orEmpty()
    fun moduleIds(): List<String> = modules.keys.toList()

    fun search(query: String): List<McqContent> {
        val needle = query.trim().lowercase()
        if (needle.isBlank()) return emptyList()
        return questions.values.filter { q ->
            q.text.lowercase().contains(needle) ||
                q.solution.lowercase().contains(needle) ||
                q.tags.any { it.lowercase().contains(needle) }
        }
    }

    fun findModuleForQuestion(questionId: String): String? =
        modules.entries.firstOrNull { questionId in it.value }?.key
}