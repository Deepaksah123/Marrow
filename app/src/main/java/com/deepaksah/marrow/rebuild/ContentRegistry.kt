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
}