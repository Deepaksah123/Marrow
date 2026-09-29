package com.deepaksah.marrow.rebuild

import android.os.Bundle

class MarrowStateStore {
    var session = MarrowSessionState()
        private set
    var test = TestState()
        private set
    var customModule = CustomModuleState()
        private set

    val contentRegistry = ContentRegistry()

    fun navigate(route: MarrowRoute) { session = session.copy(route = route) }

    fun importContent(modules: Map<String, List<McqContent>>): ContentImportResult =
        ContentImporter(contentRegistry).import(modules)

    fun selectSubject(id: String) {
        session = session.copy(subjectId = id, moduleId = null, mcqIds = emptyList(), currentMcqIndex = 0)
    }

    private fun navigationStatus(index: Int, total: Int): NavigationButtonStatus {
        if (total <= 0) return NavigationButtonStatus.DONE
        return if (index >= total - 1) NavigationButtonStatus.COMPLETE else NavigationButtonStatus.NEXT
    }

    fun selectModule(id: String, mcqIds: List<String>) {
        session = session.copy(
            moduleId = id,
            mcqIds = mcqIds,
            currentMcqIndex = 0,
            qbank = session.qbank.copy(
                parentId = id,
                mcqIds = mcqIds,
                totalMcq = mcqIds.size,
                startIndex = 0,
                currentIndex = 0,
                navigationButtonStatus = navigationStatus(0, mcqIds.size),
                timerEnabled = true,
                timerDouble = false,
                timerEndAtMs = null,
                timerExpired = false
            )
        )
    }

    fun moveQuestion(index: Int) {
        val total = session.mcqIds.size
        val safe = index.coerceIn(0, (total - 1).coerceAtLeast(0))
        session = session.copy(
            currentMcqIndex = safe,
            qbank = session.qbank.copy(
                currentIndex = safe,
                navigationButtonStatus = navigationStatus(safe, total),
                timerEndAtMs = null,
                timerExpired = false
            )
        )
    }

    fun startQBankTimer(nowMs: Long = System.currentTimeMillis()) {
        if (!session.qbank.timerEnabled || session.qbank.timerExpired) return
        if (session.qbank.timerEndAtMs == null) {
            val duration = if (session.qbank.timerDouble) 60_000L else 30_000L
            session = session.copy(qbank = session.qbank.copy(timerEndAtMs = nowMs + duration))
        }
    }

    fun clearQBankTimer(expired: Boolean = false) {
        session = session.copy(qbank = session.qbank.copy(timerEndAtMs = null, timerExpired = expired))
    }

    fun recordQBankAnswerPosition(mcqId: String, position: Int) {
        if (session.qbank.answerPositions.containsKey(mcqId)) return
        session = session.copy(
            qbank = session.qbank.copy(
                answerPositions = session.qbank.answerPositions + (mcqId to position)
            )
        )
    }

    fun setAnswer(answer: McqAnswerState) {
        session = session.copy(answers = session.answers + (answer.mcqId to answer))
    }

    fun setTestAnswer(answer: McqAnswerState) {
        test = test.copy(answers = test.answers + (answer.mcqId to answer))
    }

    fun selectTest(id: String, mcqIds: List<String>) {
        val sameTest = test.testId == id
        test = test.copy(
            testId = id,
            mcqIds = mcqIds,
            currentIndex = 0,
            answers = if (sameTest) test.answers else emptyMap()
        )
        session = session.copy(
            selectedTestId = id,
            testMcqIds = mcqIds,
            currentTestIndex = 0,
            testEndTimeMs = null
        )
    }

    fun moveTestQuestion(index: Int) {
        val safe = index.coerceIn(0, (test.mcqIds.size - 1).coerceAtLeast(0))
        test = test.copy(currentIndex = safe)
        session = session.copy(currentTestIndex = safe)
    }

    fun setTestState(value: TestState) { test = value }

    fun setTestEndTime(endTimeMs: Long?) {
        test = test.copy(testEndTimeMs = endTimeMs)
        session = session.copy(testEndTimeMs = endTimeMs)
    }

    fun setCustomStep(step: CustomModuleStep) { customModule = customModule.copy(step = step) }

    fun save(out: Bundle) {
        out.putString("route", session.route.name)
        out.putString("subjectId", session.subjectId)
        out.putString("moduleId", session.moduleId)
        out.putInt("currentMcqIndex", session.currentMcqIndex)
        out.putString("testId", test.testId)
        out.putInt("testIndex", test.currentIndex)
    }

    fun restore(input: Bundle?) {
        if (input == null) return
        val route = input.getString("route")?.let { runCatching { MarrowRoute.valueOf(it) }.getOrNull() } ?: MarrowRoute.HOME
        session = session.copy(
            route = route,
            subjectId = input.getString("subjectId"),
            moduleId = input.getString("moduleId"),
            currentMcqIndex = input.getInt("currentMcqIndex", 0)
        )
        test = test.copy(testId = input.getString("testId"), currentIndex = input.getInt("testIndex", 0))
    }
}
