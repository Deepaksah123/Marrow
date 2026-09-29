package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.widget.*

class MainActivity : Activity() {
    private lateinit var content: FrameLayout
    private val state = MarrowStateStore()
    private val qbank by lazy { QBankNavigator(state) }
    private val tests by lazy { TestNavigator(state) }
    private val custom by lazy { CustomModuleNavigator(state) }
    private val subjects = listOf("Anatomy","Anaesthesia","Biochemistry","Community Medicine","Dermatology","ENT","Forensic Medicine","Medicine","Microbiology","Obstetrics & Gynaecology","Ophthalmology","Orthopaedics","Paediatrics","Pathology","Pharmacology","Physiology","Psychiatry","Radiology","Surgery")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        state.restore(savedInstanceState)
        setContentView(R.layout.activity_main)
        content = findViewById(R.id.content)
        findViewById<TextView>(R.id.navHome).setOnClickListener { state.navigate(MarrowRoute.HOME); showHome() }
        findViewById<TextView>(R.id.navQBank).setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }
        findViewById<TextView>(R.id.navTests).setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        findViewById<TextView>(R.id.navVideos).setOnClickListener { state.navigate(MarrowRoute.VIDEOS); showVideos() }
        showSplashThenHome()
    }

    private fun showSplashThenHome() {
        val splash = LayoutInflater.from(this).inflate(R.layout.screen_splash, content, false)
        replace(splash)
        Handler(Looper.getMainLooper()).postDelayed({ renderCurrent() }, 850L)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        state.save(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        val parent = state.session.route.parent
        if (parent != null) { state.navigate(parent); renderCurrent() } else super.onBackPressed()
    }

    private fun renderCurrent() {
        when (state.session.route) {
            MarrowRoute.HOME -> showHome()
            MarrowRoute.QBANK -> showQBank()
            MarrowRoute.QBANK_INTRO -> showQBankIntroduction()
            MarrowRoute.QBANK_TRACKER -> showQBankTracker()
            MarrowRoute.QBANK_MODULE, MarrowRoute.QBANK_LESSON -> showLessons(state.session.subjectId ?: "")
            MarrowRoute.QBANK_PLAY -> showPlayer()
            MarrowRoute.QBANK_SCORE -> showScore()
            MarrowRoute.QBANK_REVIEW -> showReview()
            MarrowRoute.TESTS, MarrowRoute.TEST_INTRO, MarrowRoute.TEST_PLAY, MarrowRoute.TEST_SCORE, MarrowRoute.TEST_REVIEW, MarrowRoute.TEST_ANALYTICS -> showTests()
            MarrowRoute.GT_ANALYTICS -> showGTAnalytics()
            MarrowRoute.VIDEOS, MarrowRoute.VIDEO_SUBJECT, MarrowRoute.VIDEO_PLAYER -> showVideos()
            MarrowRoute.PEARLS -> showPearls()
            MarrowRoute.BOOKMARKS -> showBookmarks()
            MarrowRoute.SEARCH -> showSearch()
            MarrowRoute.QBANK_ANALYTICS -> showAnalytics()
            MarrowRoute.PYQ,
            MarrowRoute.SCHEMA, MarrowRoute.SCHEMA_DETAIL, MarrowRoute.SCHEMA_REVIEW,
            MarrowRoute.PROFILE, MarrowRoute.SETTINGS, MarrowRoute.THEME -> showUnresolvedSurface(state.session.route)
            MarrowRoute.CUSTOM_MODULE, MarrowRoute.CUSTOM_INTRO, MarrowRoute.CUSTOM_CREATION, MarrowRoute.CUSTOM_MODE,
            MarrowRoute.CUSTOM_SUBJECTS, MarrowRoute.CUSTOM_TOPICS, MarrowRoute.CUSTOM_TAGS, MarrowRoute.CUSTOM_ADDONS,
            MarrowRoute.CUSTOM_JOIN, MarrowRoute.CUSTOM_PLAY, MarrowRoute.CUSTOM_SCORE -> showCustom()
        }
    }

    private fun replace(v: View) { content.removeAllViews(); content.addView(v) }
    private fun showHome() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.homeMenu).setOnClickListener { Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show() }
        v.findViewById<TextView>(R.id.homeSearch).setOnClickListener {
            state.navigate(MarrowRoute.SEARCH)
            showSearch()
        }
        v.findViewById<TextView>(R.id.homeBookmark).setOnClickListener {
            state.navigate(MarrowRoute.BOOKMARKS)
            showBookmarks()
        }
        v.findViewById<View>(R.id.homeQBankCard).setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }
        v.findViewById<View>(R.id.homeTestCard).setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        v.findViewById<View>(R.id.homeVideoCard).setOnClickListener { state.navigate(MarrowRoute.VIDEOS); showVideos() }
        v.findViewById<View>(R.id.homePearlsCard).setOnClickListener {
            state.navigate(MarrowRoute.PEARLS)
            showPearls()
        }
        v.findViewById<Button>(R.id.homeShare).setOnClickListener { shareCurrentRoute() }
    }

    private fun shareCurrentRoute() {
        val text = when (state.session.route) {
            MarrowRoute.HOME -> "Marrow Home"
            MarrowRoute.QBANK, MarrowRoute.QBANK_MODULE, MarrowRoute.QBANK_LESSON, MarrowRoute.QBANK_PLAY -> "Marrow QBank"
            MarrowRoute.TESTS, MarrowRoute.TEST_INTRO, MarrowRoute.TEST_PLAY, MarrowRoute.TEST_SCORE, MarrowRoute.TEST_REVIEW, MarrowRoute.TEST_ANALYTICS -> "Marrow Test"
            else -> "Marrow"
        }
        startActivity(Intent.createChooser(Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }, "Share"))
    }

    private fun showSearch() {
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        box.addView(TextView(this).apply {
            text = "Search"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        val input = EditText(this).apply {
            hint = "Search loaded QBank content"
            singleLine = true
        }
        box.addView(input)
        val results = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        box.addView(results)
        box.addView(Button(this).apply {
            text = "SEARCH"
            setOnClickListener {
                results.removeAllViews()
                val query = input.text.toString().trim()
                if (query.isBlank()) return@setOnClickListener
                val matches = state.contentRegistry.search(query)
                if (matches.isEmpty()) {
                    results.addView(TextView(this@MainActivity).apply {
                        text = "No matches in loaded content."
                        setPadding(4, 20, 4, 20)
                    })
                } else {
                    matches.forEachIndexed { index, q ->
                        results.addView(Button(this@MainActivity).apply {
                            text = "${index + 1}. ${q.text}"
                            setOnClickListener {
                                state.contentRegistry.findModuleForQuestion(q.id)?.let { moduleId ->
                                    val ids = state.contentRegistry.questionIds(moduleId)
                                    state.selectModule(moduleId, ids)
                                    state.moveQuestion(ids.indexOf(q.id).coerceAtLeast(0))
                                    state.navigate(MarrowRoute.QBANK_PLAY)
                                    showPlayer()
                                }
                            }
                        })
                    }
                }
            }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showUnresolvedSurface(route: MarrowRoute) {
        val evidence = when (route) {
            MarrowRoute.QBANK_TRACKER -> "recovery/base_apk_Decompiler.com/sources/com/marrow2/ui/qbank/tracker/QbankTrackerViewModel.java"
            MarrowRoute.PYQ -> "Recovered QBank/PYQ surface is present in the APK inventory; dedicated reconstruction is not yet wired."
            MarrowRoute.SCHEMA, MarrowRoute.SCHEMA_DETAIL, MarrowRoute.SCHEMA_REVIEW ->
                "Recovered QBank schema resources are present; dedicated reconstruction is not yet wired."
            MarrowRoute.PROFILE, MarrowRoute.SETTINGS, MarrowRoute.THEME ->
                "recovery/base_apk_Decompiler.com/sources/com/marrow2/ui/profile/viewmodel/ProfileEditViewModel.java"
            else -> "No recovered evidence mapping has been registered for this route."
        }
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 24, 24, 24)
        }
        box.addView(TextView(this).apply {
            text = route.name.replace('_', ' ')
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "Recovered surface: not yet reconstructed in the native layer.\n\n$evidence"
            textSize = 15f
            setPadding(4, 18, 4, 18)
        })
        box.addView(Button(this).apply {
            text = "BACK"
            setOnClickListener {
                state.session.route.parent?.let {
                    state.navigate(it)
                    renderCurrent()
                } ?: run {
                    state.navigate(MarrowRoute.HOME)
                    showHome()
                }
            }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showPearls() {
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20,20,20,20)
        }
        box.addView(TextView(this).apply {
            text = "Pearls"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "No verified Pearls content is attached to the current C content layer."
            setPadding(4,20,4,20)
        })
        replace(ScrollView(this).apply { addView(box) })
    }
    private fun showBookmarks() {
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20,20,20,20)
        }
        box.addView(TextView(this).apply {
            text = "Bookmarks"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        val ids = BookmarkNavigationModel.ids(state)
        if (ids.isEmpty()) {
            box.addView(TextView(this).apply {
                text = "No bookmarked questions in the current session."
                setPadding(4,20,4,20)
            })
        } else {
            ids.forEachIndexed { index, id ->
                val q = state.contentRegistry.question(id)
                box.addView(Button(this).apply {
                    text = q?.text?.let { "${index + 1}. $it" } ?: "Question ${index + 1}"
                    setOnClickListener {
                        val questionIndex = state.session.mcqIds.indexOf(id)
                        if (questionIndex >= 0) {
                            state.moveQuestion(questionIndex)
                            state.navigate(MarrowRoute.QBANK_PLAY)
                            showPlayer()
                        }
                    }
                })
            }
        }
        replace(ScrollView(this).apply { addView(box) })
    }
    private fun showQBank() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        replace(v)
        val tracker = v.findViewById<TextView>(R.id.qbankTracker)
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        tracker.text = "Progress  ·  " + metrics.attempted + "/" + metrics.total + " attempted  ·  " + String.format("%.1f", metrics.accuracy) + "% accuracy"
        tracker.setOnClickListener {
            state.navigate(MarrowRoute.QBANK_TRACKER)
            showQBankTracker()
        }
        val c = v.findViewById<LinearLayout>(R.id.subjectContainer)
        subjects.forEach { s ->
            val row = TextView(this).apply {
                text = s
                textSize = 16f
                setTypeface(typeface, Typeface.BOLD)
                setPadding(20,22,20,22)
                setOnClickListener { qbank.openSubject(s); showQBankIntroduction() }
            }
            c.addView(row)
            addDivider(c)
        }
    }

    private fun showQBankIntroduction() {
        val lessonId = state.session.moduleId ?: state.session.subjectId ?: ""
        val model = QBankIntroductionModel(lessonId = lessonId)
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 24, 24, 24)
        }
        box.addView(TextView(this).apply {
            text = "QBank Introduction"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = if (model.lessonId.isBlank()) "No lesson selected." else "Lesson: " + model.lessonId
            textSize = 16f
            setPadding(4, 18, 4, 18)
        })
        box.addView(TextView(this).apply {
            text = "Source-backed lesson introduction state. The recovered ViewModel is lesson-specific; no generic subject-level content is invented here."
            setPadding(4, 4, 4, 18)
        })
        box.addView(Button(this).apply {
            text = "CONTINUE"
            isEnabled = model.enabled && model.lessonId.isNotBlank()
            setOnClickListener {
                state.navigate(MarrowRoute.QBANK_MODULE)
                showLessons(state.session.subjectId ?: model.lessonId)
            }
        })
        box.addView(Button(this).apply {
            text = "BACK"
            setOnClickListener {
                state.navigate(MarrowRoute.QBANK)
                showQBank()
            }
        })
        replace(ScrollView(this).apply { addView(box) })
    }
    private fun showQBankTracker() {
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        box.addView(TextView(this).apply {
            text = "QBank Tracker"
            textSize = 26f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "Current loaded QBank session"
            textSize = 13f
            setPadding(0, 6, 0, 20)
        })
        listOf("Total questions" to metrics.total, "Attempted" to metrics.attempted, "Correct" to metrics.correct, "Wrong" to metrics.wrong, "Skipped" to metrics.skipped, "Bookmarked" to metrics.bookmarked).forEach { (label, value) ->
            box.addView(TextView(this).apply {
                text = label + "    " + value
                textSize = 17f
                setPadding(8, 14, 8, 14)
            })
        }
        box.addView(TextView(this).apply {
            text = "Accuracy    " + String.format("%.1f", metrics.accuracy) + "%"
            textSize = 18f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(8, 18, 8, 18)
        })
        box.addView(Button(this).apply {
            text = "BACK TO QBANK"
            setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }
        })
        replace(ScrollView(this).apply { addView(box) })
    }
    private fun showLessons(subject: String) {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_lessons, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.lessonTitle).text = if (subject.isBlank()) "QBank" else subject
        v.findViewById<TextView>(R.id.lessonBack).setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }

        val c = v.findViewById<LinearLayout>(R.id.lessonContainer)
        val moduleIds = state.contentRegistry.moduleIds().filter { it.startsWith("$subject/") || it == subject }
        if (moduleIds.isEmpty()) {
            c.addView(TextView(this).apply {
                text = "No supplied module payload is loaded for this subject."
                textSize = 15f
                setPadding(16,18,16,18)
            })
        } else {
            moduleIds.forEach { moduleId ->
                c.addView(Button(this).apply {
                    text = moduleId.removePrefix("$subject/")
                    setOnClickListener {
                        qbank.openModule(subject, state.contentRegistry.questionIds(moduleId))
                        showPlayer()
                    }
                })
            }
        }
    }

    private fun currentQuestion(): McqContent? {
        val ids = state.session.mcqIds
        val index = state.session.currentMcqIndex
        return if (index in ids.indices) state.contentRegistry.question(ids[index]) else null
    }

    private fun showPlayer() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_play, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.playPosition).text =
            "QBank · " + (state.session.currentMcqIndex + 1) + " / " + state.session.qbank.totalMcq

        val question = currentQuestion()
        val timerView = v.findViewById<TextView>(R.id.playTimer)
        val timerEndAt = state.session.qbank.timerEndAtMs
        val timerRemaining = if (timerEndAt != null) (timerEndAt - System.currentTimeMillis()).coerceAtLeast(0L) else 0L
        val timerVisible = state.session.qbank.timerEnabled && question != null && state.session.answers[question.id]?.locked != true
        timerView.visibility = if (timerVisible) View.VISIBLE else View.GONE
        if (timerVisible) {
            state.startQBankTimer()
            val endAt = state.session.qbank.timerEndAtMs ?: (System.currentTimeMillis() + if (state.session.qbank.timerDouble) 60_000L else 30_000L)
            val remainingNow = (endAt - System.currentTimeMillis()).coerceAtLeast(0L)
            val duration = if (state.session.qbank.timerDouble) 60_000L else 30_000L
            timerView.text = "Time left: " + ((remainingNow + 999L) / 1000L) + "s"
            object : CountDownTimer(remainingNow, 250L) {
                override fun onTick(millisUntilFinished: Long) {
                    if (state.session.route != MarrowRoute.QBANK_PLAY || state.session.currentMcqIndex < 0) {
                        cancel()
                        return
                    }
                    timerView.text = "Time left: " + ((millisUntilFinished + 999L) / 1000L) + "s"
                }
                override fun onFinish() {
                    val current = currentQuestion()
                    if (current != null && state.session.answers[current.id]?.locked != true) {
                        QBankSession(state).timeout(current.id)
                        if (state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                            qbank.openQuestion(state.session.currentMcqIndex + 1)
                            showPlayer()
                        } else {
                            state.completeQBank()
                            qbank.openScore()
                            showScore()
                        }
                    }
                }
            }.start()
        }
        val questionView = v.findViewById<TextView>(R.id.playQuestion)
        val optionContainer = v.findViewById<LinearLayout>(R.id.optionContainer)
        val explanation = v.findViewById<TextView>(R.id.explanation)
        optionContainer.removeAllViews()

        if (question == null) {
            questionView.text = "No supplied MCQ payload is loaded for this module."
        } else {
            questionView.text = question.text
            val existing = state.session.answers[question.id]
            question.choices.forEach { choice ->
                optionContainer.addView(Button(this).apply {
                    text = choice.text
                    isEnabled = existing?.locked != true
                    if (existing?.locked == true) {
                        if (choice.id == question.correctChoiceId) {
                            setBackgroundColor(0xFF2E7D32.toInt())
                            setTextColor(0xFFFFFFFF.toInt())
                        } else if (choice.id == existing.selectedAnswer) {
                            setBackgroundColor(0xFFC62828.toInt())
                            setTextColor(0xFFFFFFFF.toInt())
                        }
                    }
                    setOnClickListener {
                        QBankSession(state).answer(question.id, choice.id, question.correctChoiceId)
                        showPlayer()
                    }
                })
            }
            if (existing?.locked == true && question.solution.isNotBlank()) {
                explanation.text = "Explanation\n\n" + question.solution
                explanation.visibility = View.VISIBLE
            } else {
                explanation.visibility = View.GONE
            }
            v.findViewById<TextView>(R.id.playBookmark).text =
                if (existing?.isStarred == true) "★" else "☆"
        }

        v.findViewById<TextView>(R.id.playBookmark).setOnClickListener {
            question?.let { QBankSession(state).toggleBookmark(it.id); showPlayer() }
        }

        val jumpInput = v.findViewById<EditText>(R.id.qbankJumpInput)
        v.findViewById<Button>(R.id.qbankJumpButton).setOnClickListener {
            val target = jumpInput.text.toString().toIntOrNull()
            if (target != null && target in 1..state.session.qbank.totalMcq) {
                qbank.openQuestion(target - 1)
                showPlayer()
            } else {
                Toast.makeText(this@MainActivity, "Enter 1–" + state.session.qbank.totalMcq, Toast.LENGTH_SHORT).show()
            }
        }

        val navigationStatus = state.session.qbank.navigationButtonStatus
        v.findViewById<Button>(R.id.playComplete).apply {
            visibility = if (navigationStatus == NavigationButtonStatus.COMPLETE) View.VISIBLE else View.GONE
            text = if (navigationStatus == NavigationButtonStatus.COMPLETE) "COMPLETE" else "COMPLETE"
            setOnClickListener {
                state.completeQBank()
                qbank.openScore()
                showScore()
            }
        }
        v.findViewById<Button>(R.id.playPrevious).setOnClickListener {
            if (state.session.currentMcqIndex > 0) {
                qbank.openQuestion(state.session.currentMcqIndex - 1)
                showPlayer()
            }
        }
        v.findViewById<Button>(R.id.playSkip).setOnClickListener {
            question?.let {
                QBankSession(state).skip(it.id)
                if (state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                    qbank.openQuestion(state.session.currentMcqIndex + 1)
                    showPlayer()
                } else {
                    state.completeQBank()
                    qbank.openScore()
                    showScore()
                }
            }
        }
        v.findViewById<Button>(R.id.playNext).setOnClickListener {
            if (state.session.qbank.totalMcq > 0 && state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                qbank.openQuestion(state.session.currentMcqIndex + 1)
                showPlayer()
            } else {
                qbank.openScore()
                showScore()
            }
        }
    }

    private fun showScore() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_score, content, false)
        replace(v)
        val score = QBankScoreModel.from(state.session.mcqIds, state.session.answers)
        val metrics = score.metrics
        v.findViewById<TextView>(R.id.scoreSummary).text =
            "Total: " + metrics.total + "   Attempted: " + metrics.attempted + "\n" +
            "Correct: " + metrics.correct + "   Wrong: " + metrics.wrong + "\n" +
            "Skipped: " + metrics.skipped + "   Unanswered: " + metrics.unanswered + "\n" +
            "Accuracy: " + String.format("%.1f", metrics.accuracy) + "%"

        v.findViewById<Button>(R.id.reviewButton).setOnClickListener {
            qbank.openReview()
            showReview()
        }
        v.findViewById<Button>(R.id.reviewLessonButton).setOnClickListener {
            state.navigate(MarrowRoute.QBANK_MODULE)
            showLessons(state.session.subjectId ?: "")
        }
        v.findViewById<Button>(R.id.reviewButton).setOnLongClickListener {
            state.navigate(MarrowRoute.QBANK_ANALYTICS)
            showAnalytics()
            true
        }
    }

    private fun showReview() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20,20,20,20)
        }
        val title = TextView(this).apply {
            text = "Review"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(4,4,4,12)
        }
        root.addView(title)

        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        root.addView(list)

        fun render(filter: ReviewFilter) {
            list.removeAllViews()
            val ids = ReviewEngine.filter(state.session.mcqIds, state.session.answers, state.contentRegistry.allQuestions(), filter)
            list.addView(TextView(this).apply {
                text = filter.name.replace('_', ' ') + " · " + ids.size
                textSize = 15f
                setPadding(4,8,4,12)
            })
            if (ids.isEmpty()) {
                list.addView(TextView(this).apply {
                    text = "No questions in this filter."
                    setPadding(4,12,4,12)
                })
                return
            }
            ids.forEachIndexed { index, id ->
                val q = state.contentRegistry.question(id)
                list.addView(Button(this).apply {
                    text = q?.text?.let { "${index + 1}. $it" } ?: "Question ${index + 1}"
                    setOnClickListener {
                        val questionIndex = state.session.mcqIds.indexOf(id)
                        if (questionIndex >= 0) {
                            state.moveQuestion(questionIndex)
                            state.navigate(MarrowRoute.QBANK_PLAY)
                            showPlayer()
                        }
                    }
                })
            }
        }

        ReviewFilter.values().forEach { filter ->
            root.addView(Button(this).apply {
                text = filter.name.replace('_', ' ')
                setOnClickListener { render(filter) }
            })
        }
        render(ReviewFilter.ALL)
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showAnalytics() {
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24,24,24,24)
        }
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        val reviewSummary = QBankReviewSummary.from(state.session.mcqIds, state.session.answers)
        val completion = if (metrics.total == 0) 0.0 else (metrics.attempted + metrics.skipped).toDouble() / metrics.total * 100.0
        box.addView(TextView(this).apply {
            text = "QBank Analytics"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "Completion: " + String.format("%.1f", completion) + "%\n\n" +
                "Total: " + metrics.total + "\n" +
                "Attempted: " + metrics.attempted + "\n" +
                "Correct: " + metrics.correct + "\n" +
                "Wrong: " + metrics.wrong + "\n" +
                "Skipped: " + metrics.skipped + "\n" +
                "Unanswered: " + metrics.unanswered + "\n" +
                "Bookmarked: " + metrics.bookmarked + "\n" +
                "Accuracy: " + String.format("%.1f", metrics.accuracy) + "%\n\n" +
                "Changed by you: " + reviewSummary.changedByYou + "\n" +
                "Guess correct: " + reviewSummary.guessedCorrect + "\n" +
                "Guess wrong: " + reviewSummary.guessedWrong + "\n" +
                "Silly mistakes: " + reviewSummary.sillyMistakes
            textSize = 16f
            setPadding(4,18,4,18)
        })
        box.addView(Button(this).apply {
            text = "REVIEW QUESTIONS"
            setOnClickListener { qbank.openReview(); showReview() }
        })
        box.addView(Button(this).apply {
            text = "BACK TO SCORE"
            setOnClickListener { qbank.openScore(); showScore() }
        })
        replace(ScrollView(this).apply { addView(box) })
    }


    private fun showTests() {
        when (state.session.route) {
            MarrowRoute.TEST_INTRO -> showTestIntro()
            MarrowRoute.TEST_PLAY -> showTestPlay()
            MarrowRoute.TEST_SCORE -> showTestScore()
            MarrowRoute.TEST_REVIEW -> showTestReview()
            MarrowRoute.TEST_ANALYTICS -> showTestAnalytics()
            else -> {
                val box = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(20,20,20,20)
                }
                box.addView(TextView(this).apply {
                    text = "Tests"
                    textSize = 26f
                    setTypeface(typeface, Typeface.BOLD)
                })

                val tabs = listOf("ALL TESTS", "GRAND TEST", "SUBJECT TESTS")
                val tabRow = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
                tabs.forEachIndexed { index, tab ->
                    tabRow.addView(Button(this).apply {
                        text = tab
                        setOnClickListener {
                            tests.selectConfiguredTab(tab)
                            Toast.makeText(this@MainActivity, "Selected $tab", Toast.LENGTH_SHORT).show()
                        }
                    }, LinearLayout.LayoutParams(0,-2,1f))
                }
                box.addView(tabRow)

                box.addView(TextView(this).apply {
                    text = "Test year"
                    textSize = 16f
                    setTypeface(typeface, Typeface.BOLD)
                    setPadding(4,20,4,8)
                })
                val yearRow = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
                listOf("2026","2025","2024").forEach { year ->
                    yearRow.addView(Button(this).apply {
                        text = year
                        setOnClickListener {
                            Toast.makeText(this@MainActivity, "Year $year selected", Toast.LENGTH_SHORT).show()
                        }
                    }, LinearLayout.LayoutParams(0,-2,1f))
                }
                box.addView(yearRow)

                box.addView(TextView(this).apply {
                    text = "Configured test list"
                    textSize = 18f
                    setTypeface(typeface, Typeface.BOLD)
                    setPadding(4,20,4,8)
                })
                val testCard = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(12,12,12,12)
                }
                testCard.addView(TextView(this).apply {
                    text = "Source-backed test selection"
                    textSize = 17f
                })
                testCard.addView(TextView(this).apply {
                    text = "The recovered landing ViewModel exposes configured tabs, year selection, test-list state, subscription state and GT analytics/nudge state. No remote test catalog is fabricated here."
                    setPadding(0,8,0,12)
                })
                testCard.addView(Button(this).apply {
                    text = "OPEN TEST INTRO"
                    setOnClickListener { tests.openIntro("source-test"); showTests() }
                })
                box.addView(testCard)

                box.addView(Button(this).apply {
                    text = "GRAND TEST ANALYTICS"
                    setOnClickListener { state.navigate(MarrowRoute.GT_ANALYTICS); showGTAnalytics() }
                })
                box.addView(Button(this).apply {
                    text = "LAST TEST ANALYTICS"
                    setOnClickListener { tests.openAnalytics(); showTests() }
                })
                replace(ScrollView(this).apply { addView(box) })
            }
        }
    }

    private fun showTestIntro() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(24,24,24,24) }
        box.addView(TextView(this).apply { text = "Test Introduction"; textSize = 24f; setTypeface(typeface, Typeface.BOLD) })
        box.addView(TextView(this).apply { text = "No verified test payload is attached to the current C content layer."; setPadding(4,20,4,20) })
        box.addView(Button(this).apply { text = "BACK"; setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() } })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showTestPlay() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        val ids = state.test.mcqIds
        val index = state.test.currentIndex
        val q = if (index in ids.indices) state.contentRegistry.question(ids[index]) else null

        state.startTestTimer()
        val remaining = state.test.remainingTimeMs
        box.addView(TextView(this).apply {
            text = "Test · ${index + 1} / ${ids.size}"
            textSize = 16f
        })
        if (remaining != null) {
            box.addView(TextView(this).apply {
                text = "Time remaining: " + ((remaining + 999L) / 1000L) + "s"
                setPadding(0, 6, 0, 12)
            })
        }
        box.addView(TextView(this).apply {
            text = q?.text ?: "No supplied test MCQ payload is loaded."
            textSize = 20f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(0,18,0,18)
        })
        if (q != null) {
            val existing = state.test.answers[q.id]
            box.addView(Button(this).apply {
                text = if (existing?.isGuessed == true) "GUESSED ✓" else "MARK GUESSED"
                setOnClickListener {
                    TestSession(state).markGuessed(q.id, existing?.isGuessed != true)
                    showTestPlay()
                }
            })
            box.addView(Button(this).apply {
                text = if (existing?.isStarred == true) "★ BOOKMARKED" else "☆ BOOKMARK"
                setOnClickListener {
                    TestSession(state).toggleBookmark(q.id)
                    showTestPlay()
                }
            })
            q.choices.forEach { choice ->
                box.addView(Button(this).apply {
                    text = choice.text
                    isEnabled = !state.test.timedOut
                    if (existing?.locked == true) {
                        when {
                            choice.id == q.correctChoiceId -> {
                                setBackgroundColor(0xFF2E7D32.toInt())
                                setTextColor(0xFFFFFFFF.toInt())
                            }
                            choice.id == existing.selectedAnswer -> {
                                setBackgroundColor(0xFFC62828.toInt())
                                setTextColor(0xFFFFFFFF.toInt())
                            }
                        }
                    }
                    setOnClickListener {
                        TestSession(state).answer(q.id, choice.id, q.correctChoiceId)
                        showTestPlay()
                    }
                })
            }
            if (existing?.locked == true && q.solution.isNotBlank()) {
                box.addView(TextView(this).apply {
                    text = "Explanation\n\n" + q.solution
                    textSize = 14f
                    setPadding(8,16,8,16)
                })
            }
        }
        val jumpRow = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
        val jumpInput = EditText(this).apply { hint = "Question no."; inputType = android.text.InputType.TYPE_CLASS_NUMBER }
        jumpRow.addView(jumpInput, LinearLayout.LayoutParams(0, -2, 1f))
        jumpRow.addView(Button(this).apply {
            text = "JUMP"
            setOnClickListener {
                val target = jumpInput.text.toString().toIntOrNull()
                if (target != null && target in 1..ids.size) {
                    state.moveTestQuestion(target - 1)
                    showTestPlay()
                }
            }
        })
        box.addView(jumpRow)

        val nav = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
        if (index > 0) {
            nav.addView(Button(this).apply {
                text = "PREVIOUS"
                setOnClickListener { state.moveTestQuestion(index - 1); showTestPlay() }
            }, LinearLayout.LayoutParams(0, -2, 1f))
        }
        val navStatus = state.test.navigationButtonStatus
        nav.addView(Button(this).apply {
            text = if (navStatus == NavigationButtonStatus.COMPLETE) "SUBMIT" else "NEXT"
            setOnClickListener {
                if (navStatus == NavigationButtonStatus.COMPLETE) {
                    state.confirmTestSubmission()
                    tests.openScore()
                    showTests()
                } else {
                    state.moveTestQuestion(index + 1)
                    showTestPlay()
                }
            }
        }, LinearLayout.LayoutParams(0, -2, 1f))
        box.addView(nav)
        box.addView(Button(this).apply {
            text = "SKIP"
            isEnabled = !state.test.timedOut
            setOnClickListener {
                q?.let { TestSession(state).skip(it.id) }
                if (index + 1 < ids.size) {
                    state.moveTestQuestion(index + 1)
                    showTestPlay()
                } else {
                    state.confirmTestSubmission()
                    tests.openScore()
                    showTests()
                }
            }
        })
        box.addView(Button(this).apply {
            text = "SUBMIT / SCORE"
            setOnClickListener {
                state.confirmTestSubmission()
                tests.openScore()
                showTests()
            }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showTestScore() {
        val metrics = TestEngine.metrics(state.test)
        val answers = state.test.answers
        val bookmarked = answers.values.count { it.isStarred }
        val guessed = answers.values.count { it.isGuessed }
        val changed = answers.values.count { it.changedByYou }
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(24,24,24,24) }
        box.addView(TextView(this).apply {
            text = "Test Score"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "Total: ${metrics.total}\nAttempted: ${metrics.attempted}\nCorrect: ${metrics.correct}\nWrong: ${metrics.wrong}\nSkipped: ${metrics.skipped}\nUnanswered: ${metrics.unanswered}\nAccuracy: ${String.format("%.1f", metrics.accuracy)}%"
            textSize = 16f
            setPadding(4,18,4,18)
        })
        box.addView(TextView(this).apply {
            text = "Bookmarked: $bookmarked   Guessed: $guessed   Changed: $changed"
            textSize = 15f
            setPadding(4,4,4,18)
        })
        box.addView(Button(this).apply {
            text = "REVIEW"
            setOnClickListener { tests.openReview(); showTests() }
        })
        box.addView(Button(this).apply {
            text = "ANALYTICS"
            setOnClickListener { tests.openAnalytics(); showTests() }
        })
        box.addView(Button(this).apply {
            text = "BACK TO TESTS"
            setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showTestReview() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        box.addView(TextView(this).apply {
            text = "Test Review"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val filters = listOf(
            ReviewFilter.ALL,
            ReviewFilter.BOOKMARKED,
            ReviewFilter.CHANGED_BY_YOU,
            ReviewFilter.CORRECT,
            ReviewFilter.GUESS_CORRECT,
            ReviewFilter.GUESS_WRONG,
            ReviewFilter.SKIPPED,
            ReviewFilter.WRONG
        )
        fun render(filter: ReviewFilter) {
            list.removeAllViews()
            val content = state.test.mcqIds.associateWith { state.contentRegistry.question(it) }.mapNotNull { (id, q) -> q?.let { id to it } }.toMap()
            val ids = ReviewEngine.filter(state.test.mcqIds, state.test.answers, content, filter)
            list.addView(TextView(this).apply {
                text = filter.name.replace('_',' ') + " · " + ids.size
                textSize = 15f
                setPadding(4,10,4,12)
            })
            if (ids.isEmpty()) {
                list.addView(TextView(this).apply {
                    text = "No questions in this filter."
                    setPadding(4,12,4,12)
                })
                return
            }
            ids.forEachIndexed { index, id ->
                val q = state.contentRegistry.question(id)
                val answer = state.test.answers[id]
                list.addView(Button(this).apply {
                    text = q?.let {
                        val status = when {
                            answer?.skipped == true -> "Skipped"
                            answer?.isRight == true -> "Correct"
                            answer?.isRight == false -> "Wrong"
                            else -> "Unanswered"
                        }
                        "${index + 1}. $status — ${it.text}"
                    } ?: "Question ${index + 1}"
                    setOnClickListener {
                        val questionIndex = state.test.mcqIds.indexOf(id)
                        if (questionIndex >= 0) {
                            state.moveTestQuestion(questionIndex)
                            state.navigate(MarrowRoute.TEST_PLAY)
                            showTestPlay()
                        }
                    }
                })
            }
        }
        filters.forEach { filter ->
            box.addView(Button(this).apply {
                text = filter.name.replace('_',' ')
                setOnClickListener { render(filter) }
            })
        }
        box.addView(list)
        box.addView(Button(this).apply {
            text = "BACK TO SCORE"
            setOnClickListener { tests.openScore(); showTests() }
        })
        render(ReviewFilter.ALL)
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showTestAnalytics() {
        val analytics = TestAnalyticsModel.from(state.test)
        val m = analytics.metrics
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24,24,24,24)
        }
        box.addView(TextView(this).apply {
            text = "Test Analytics"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = "Completion: ${String.format("%.1f", analytics.completionPercent)}%\nAccuracy: ${String.format("%.1f", analytics.accuracyPercent)}%\n\nTotal: ${m.total}\nAttempted: ${m.attempted}\nCorrect: ${m.correct}\nWrong: ${m.wrong}\nSkipped: ${m.skipped}\nUnanswered: ${m.unanswered}\n\nBookmarked: ${analytics.bookmarked}\nGuessed: ${analytics.guessed}\nChanged by you: ${analytics.changedByYou}"
            textSize = 16f
            setPadding(4,18,4,18)
        })
        box.addView(TextView(this).apply {
            text = "Remote analytics such as rank, percentile and subject-wise server statistics require the original test payload/API response and are not fabricated locally."
            textSize = 13f
            setPadding(4,8,4,18)
        })
        box.addView(Button(this).apply {
            text = "BACK TO SCORE"
            setOnClickListener { tests.openScore(); showTests() }
        })
        box.addView(Button(this).apply {
            text = "BACK TO TESTS"
            setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showGTAnalytics() {
        val analytics = GTAnalyticsStateModel()
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 24, 24, 24)
        }
        box.addView(TextView(this).apply {
            text = "Grand Test Analytics"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        box.addView(TextView(this).apply {
            text = analytics.summary()
            textSize = 16f
            setPadding(4, 18, 4, 18)
        })
        box.addView(TextView(this).apply {
            text = "Restricted subjects"
            textSize = 18f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(4, 12, 4, 8)
        })
        box.addView(TextView(this).apply {
            text = if (analytics.restrictedSubjects.isEmpty()) "None reported by the recovered state." else analytics.restrictedSubjects.joinToString("\n")
            setPadding(4, 4, 4, 16)
        })
        box.addView(Button(this).apply {
            text = "BACK TO TESTS"
            setOnClickListener {
                state.navigate(MarrowRoute.TESTS)
                showTests()
            }
        })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showVideos() {
        replace(LayoutInflater.from(this).inflate(R.layout.screen_videos, content, false))
    }

    private fun showCustom() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_custom, content, false)
        replace(v)
        v.findViewById<Button>(R.id.customNext).setOnClickListener {
            custom.mode()
            v.findViewById<TextView>(R.id.customFlow).text =
                "Mode → Subjects → Topics → Tags → Add-ons → Join by Code → Generated Module → Play → Score/Review"
        }
    }

    private fun addDivider(c: LinearLayout) {
        c.addView(View(this).apply { setBackgroundColor(0xFFE6E6E6.toInt()) }, LinearLayout.LayoutParams(-1,1))
    }
}
