package com.deepaksah.marrow.rebuild

class ContentImporter(private val registry: ContentRegistry) {
    fun import(modules: Map<String, List<McqContent>>): ContentImportResult {
        var moduleCount = 0
        var questionCount = 0
        val errors = mutableListOf<String>()

        modules.forEach { (moduleId, questions) ->
            val result = registry.registerModule(moduleId, questions)
            if (result.valid) {
                moduleCount++
                questionCount += questions.size
            } else {
                result.errors.forEach { errors += "$moduleId: $it" }
            }
        }
        return ContentImportResult(moduleCount, questionCount, errors)
    }
}