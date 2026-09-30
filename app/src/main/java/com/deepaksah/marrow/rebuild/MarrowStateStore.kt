package com.deepaksah.marrow.rebuild

import android.os.Bundle
import org.json.JSONArray
import org.json.JSONObject

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

    fun setSelectedTestGroup(id: String) { session = session.copy(selectedTestGroup = id) }

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

    fun completeQBank() {
        session = session.copy(
            qbank = session.qbank.copy(
                completed = true,
                submissionInProcess = false,
                timerEndAtMs = null
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
        val status = when {
            test.mcqIds.isEmpty() -> NavigationButtonStatus.DONE
            safe >= test.mcqIds.lastIndex -> NavigationButtonStatus.COMPLETE
            else -> NavigationButtonStatus.NEXT
        }
        test = test.copy(currentIndex = safe, navigationButtonStatus = status)
        session = session.copy(currentTestIndex = safe)
    }

    fun startTestTimer(nowMs: Long = System.currentTimeMillis()) {
        val end = test.testEndTimeMs
        if (end != null) {
            test = test.copy(timerRunning = end > nowMs, remainingTimeMs = (end - nowMs).coerceAtLeast(0L))
        }
    }

    fun updateTestRemainingTime(nowMs: Long = System.currentTimeMillis()) {
        val end = test.testEndTimeMs ?: return
        val remaining = (end - nowMs).coerceAtLeast(0L)
        test = test.copy(timerRunning = remaining > 0L, remainingTimeMs = remaining, timedOut = remaining == 0L)
    }

    fun confirmTestSubmission() {
        test = test.copy(submissionConfirmed = true, submissionInProcess = false, timerRunning = false)
    }

    fun setTestState(value: TestState) { test = value }

    fun setTestEndTime(endTimeMs: Long?) {
        test = test.copy(testEndTimeMs = endTimeMs)
        session = session.copy(testEndTimeMs = endTimeMs)
    }

    fun setCustomStep(step: CustomModuleStep) { customModule = customModule.copy(step = step) }

    private fun encodeAnswers(answers: Map<String, McqAnswerState>): String {
        val array = JSONArray()
        answers.values.forEach { answer ->
            array.put(JSONObject().apply {
                put("mcqId", answer.mcqId)
                put("selectedAnswer", answer.selectedAnswer)
                put("firstAnswer", answer.firstAnswer)
                put("serverAnswer", answer.serverAnswer)
                put("isRight", answer.isRight)
                put("isStarred", answer.isStarred)
                put("isGuessed", answer.isGuessed)
                put("isSillyMistake", answer.isSillyMistake)
                put("skipped", answer.skipped)
                put("changedByYou", answer.changedByYou)
                put("locked", answer.locked)
            })
        }
        return array.toString()
    }

    private fun decodeAnswers(raw: String?): Map<String, McqAnswerState> {
        if (raw.isNullOrBlank()) return emptyMap()
        return runCatching {
            val array = JSONArray(raw)
            buildMap {
                for (i in 0 until array.length()) {
                    val item = array.getJSONObject(i)
                    val id = item.optString("mcqId").takeIf { it.isNotBlank() } ?: continue
                    put(id, McqAnswerState(
                        mcqId = id,
                        selectedAnswer = item.optString("selectedAnswer").takeIf { it.isNotBlank() },
                        firstAnswer = item.optString("firstAnswer").takeIf { it.isNotBlank() },
                        serverAnswer = item.optString("serverAnswer").takeIf { it.isNotBlank() },
                        isRight = if (item.isNull("isRight")) null else item.optBoolean("isRight"),
                        isStarred = item.optBoolean("isStarred"),
                        isGuessed = item.optBoolean("isGuessed"),
                        isSillyMistake = item.optBoolean("isSillyMistake"),
                        skipped = item.optBoolean("skipped"),
                        changedByYou = item.optBoolean("changedByYou"),
                        locked = item.optBoolean("locked")
                    ))
                }
            }
        }.getOrDefault(emptyMap())
    }

    fun save(out: Bundle) {
        out.putString("route", session.route.name)
        out.putString("subjectId", session.subjectId)
        out.putString("moduleId", session.moduleId)
        out.putStringArrayList("mcqIds", ArrayList(session.mcqIds))
        out.putInt("currentMcqIndex", session.currentMcqIndex)
        out.putInt("qbankStartIndex", session.qbank.startIndex)
        out.putInt("qbankCurrentIndex", session.qbank.currentIndex)
        out.putInt("qbankTotalMcq", session.qbank.totalMcq)
        out.putBoolean("qbankTimerEnabled", session.qbank.timerEnabled)
        out.putBoolean("qbankTimerDouble", session.qbank.timerDouble)
        out.putLong("qbankTimerEndAtMs", session.qbank.timerEndAtMs ?: -1L)
        out.putBoolean("qbankTimerExpired", session.qbank.timerExpired)
        out.putBoolean("qbankCompleted", session.qbank.completed)
        out.putString("qbankAnswers", encodeAnswers(session.answers))
        out.putString("selectedTestId", test.testId)
        out.putString("selectedTestGroup", session.selectedTestGroup)
        out.putStringArrayList("testMcqIds", ArrayList(test.mcqIds))
        out.putInt("testIndex", test.currentIndex)
        out.putLong("testEndTimeMs", test.testEndTimeMs ?: -1L)
        out.putBoolean("testTimedOut", test.timedOut)
        out.putBoolean("testSubmissionConfirmed", test.submissionConfirmed)
        out.putBoolean("testSubmissionInProcess", test.submissionInProcess)
        out.putString("testAnswers", encodeAnswers(test.answers))
    }

    fun restore(input: Bundle?) {
        if (input == null) return
        val route = input.getString("route")?.let { runCatching { MarrowRoute.valueOf(it) }.getOrNull() } ?: MarrowRoute.HOME
        val qbankEnd = input.getLong("qbankTimerEndAtMs", -1L).takeIf { it >= 0L }
        val testEnd = input.getLong("testEndTimeMs", -1L).takeIf { it >= 0L }
        val restoredMcqIds = input.getStringArrayList("mcqIds").orEmpty()
        val restoredTestIds = input.getStringArrayList("testMcqIds").orEmpty()
        session = session.copy(
            route = route,
            subjectId = input.getString("subjectId"),
            moduleId = input.getString("moduleId"),
            mcqIds = restoredMcqIds,
            currentMcqIndex = input.getInt("currentMcqIndex", 0),
            qbank = session.qbank.copy(
                parentId = input.getString("moduleId"),
                mcqIds = restoredMcqIds,
                startIndex = input.getInt("qbankStartIndex", 0),
                currentIndex = input.getInt("qbankCurrentIndex", input.getInt("currentMcqIndex", 0)),
                totalMcq = input.getInt("qbankTotalMcq", restoredMcqIds.size),
                timerEnabled = input.getBoolean("qbankTimerEnabled", true),
                timerDouble = input.getBoolean("qbankTimerDouble", false),
                timerEndAtMs = qbankEnd,
                timerExpired = input.getBoolean("qbankTimerExpired", false),
                completed = input.getBoolean("qbankCompleted", false)
            ),
            answers = decodeAnswers(input.getString("qbankAnswers")),
            selectedTestId = input.getString("selectedTestId"),
            selectedTestGroup = input.getString("selectedTestGroup"),
            testMcqIds = restoredTestIds,
            currentTestIndex = input.getInt("testIndex", 0),
            testEndTimeMs = testEnd
        )
        test = test.copy(
            testId = input.getString("selectedTestId"),
            mcqIds = restoredTestIds,
            currentIndex = input.getInt("testIndex", 0),
            testEndTimeMs = testEnd,
            timedOut = input.getBoolean("testTimedOut", false),
            submissionConfirmed = input.getBoolean("testSubmissionConfirmed", false),
            submissionInProcess = input.getBoolean("testSubmissionInProcess", false),
            answers = decodeAnswers(input.getString("testAnswers"))
        )
    }

    fun rehydrateAfterContentImport() {
        val moduleId = session.moduleId ?: return
        if (session.mcqIds.isNotEmpty()) return
        val ids = contentRegistry.questionIds(moduleId)
        if (ids.isEmpty()) return
        val safeIndex = session.currentMcqIndex.coerceIn(0, ids.lastIndex)
        session = session.copy(
            mcqIds = ids,
            currentMcqIndex = safeIndex,
            qbank = session.qbank.copy(
                parentId = moduleId,
                mcqIds = ids,
                totalMcq = ids.size,
                currentIndex = safeIndex,
                navigationButtonStatus = navigationStatus(safeIndex, ids.size)
            )
        )
    }
}
