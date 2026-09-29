package com.deepaksah.marrow.rebuild

import android.os.Bundle

class MarrowStateStore {
    var session = MarrowSessionState()
        private set

    fun navigate(route: MarrowRoute) {
        session = session.copy(route = route)
    }

    fun selectSubject(id: String) {
        session = session.copy(subjectId = id, moduleId = null, currentMcqIndex = 0)
    }

    fun selectModule(id: String, mcqIds: List<String>) {
        session = session.copy(moduleId = id, mcqIds = mcqIds, currentMcqIndex = 0,
            qbank = session.qbank.copy(parentId = id, mcqIds = mcqIds, totalMcq = mcqIds.size))
    }

    fun moveQuestion(index: Int) {
        val safe = index.coerceIn(0, (session.mcqIds.size - 1).coerceAtLeast(0))
        session = session.copy(currentMcqIndex = safe, qbank = session.qbank.copy(currentIndex = safe))
    }

    fun save(out: Bundle) {
        out.putString("route", session.route.name)
        out.putString("subjectId", session.subjectId)
        out.putString("moduleId", session.moduleId)
        out.putInt("currentMcqIndex", session.currentMcqIndex)
    }

    fun restore(input: Bundle?) {
        if (input == null) return
        val route = input.getString("route")?.let { runCatching { MarrowRoute.valueOf(it) }.getOrNull() } ?: MarrowRoute.HOME
        session = session.copy(route = route, subjectId = input.getString("subjectId"),
            moduleId = input.getString("moduleId"), currentMcqIndex = input.getInt("currentMcqIndex", 0))
    }
}
