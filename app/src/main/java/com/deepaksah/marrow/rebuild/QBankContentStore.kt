package com.deepaksah.marrow.rebuild

class QBankContentStore {
    private val byId = LinkedHashMap<String, McqContent>()
    private val moduleIds = LinkedHashMap<String, List<String>>()

    fun replaceModule(moduleId: String, questions: List<McqContent>) {
        questions.forEach { byId[it.id] = it }
        moduleIds[moduleId] = questions.map { it.id }
    }

    fun put(question: McqContent) { byId[question.id] = question }

    fun get(id: String): McqContent? = byId[id]

    fun idsForModule(moduleId: String): List<String> = moduleIds[moduleId].orEmpty()

    fun clear() { byId.clear(); moduleIds.clear() }
}