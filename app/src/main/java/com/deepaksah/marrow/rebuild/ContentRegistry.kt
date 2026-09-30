package com.deepaksah.marrow.rebuild

class ContentRegistry(
    private val validator: (McqContent) -> ContentValidationResult = ContentValidator::validate
) {
    private val modules = LinkedHashMap<String, List<String>>()
    private val questions = LinkedHashMap<String, McqContent>()
    private val questionsByModule = LinkedHashMap<String, Map<String, McqContent>>()

    fun registerModule(moduleId: String, sourceQuestions: List<McqContent>): ContentValidationResult {
        val moduleResult = ContentValidator.validateModule(moduleId, sourceQuestions)
        if (!moduleResult.valid) return moduleResult

        val moduleQuestions = LinkedHashMap<String, McqContent>()
        sourceQuestions.forEach { question ->
            moduleQuestions[question.id] = question
            questions.putIfAbsent(question.id, question)
        }
        questionsByModule[moduleId] = moduleQuestions
        modules[moduleId] = sourceQuestions.map { it.id }
        return ContentValidationResult(true, emptyList())
    }

    fun question(id: String): McqContent? = questions[id]

    fun question(moduleId: String?, id: String): McqContent? =
        moduleId?.let { questionsByModule[it]?.get(id) } ?: questions[id]

    fun questionIds(moduleId: String): List<String> = modules[moduleId].orEmpty()

    fun moduleIds(): List<String> = modules.keys.toList()

    fun allQuestions(): Map<String, McqContent> = questions.toMap()

    fun allQuestions(moduleId: String?): Map<String, McqContent> =
        moduleId?.let { questionsByModule[it].orEmpty() } ?: allQuestions()

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
