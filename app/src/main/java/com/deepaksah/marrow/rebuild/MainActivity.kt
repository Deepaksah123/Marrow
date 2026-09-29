package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.os.Bundle
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
            MarrowRoute.QBANK_MODULE, MarrowRoute.QBANK_LESSON -> showLessons(state.session.subjectId ?: "")
            MarrowRoute.QBANK_PLAY -> showPlayer()
            MarrowRoute.QBANK_SCORE -> showScore()
            MarrowRoute.QBANK_REVIEW -> showReview()
            MarrowRoute.TESTS, MarrowRoute.TEST_INTRO, MarrowRoute.TEST_PLAY, MarrowRoute.TEST_SCORE, MarrowRoute.TEST_REVIEW, MarrowRoute.TEST_ANALYTICS -> showTests()
            MarrowRoute.VIDEOS, MarrowRoute.VIDEO_SUBJECT, MarrowRoute.VIDEO_PLAYER -> showVideos()
            MarrowRoute.CUSTOM_MODULE, MarrowRoute.CUSTOM_INTRO, MarrowRoute.CUSTOM_CREATION, MarrowRoute.CUSTOM_MODE,
            MarrowRoute.CUSTOM_SUBJECTS, MarrowRoute.CUSTOM_TOPICS, MarrowRoute.CUSTOM_TAGS, MarrowRoute.CUSTOM_ADDONS,
            MarrowRoute.CUSTOM_JOIN, MarrowRoute.CUSTOM_PLAY, MarrowRoute.CUSTOM_SCORE -> showCustom()
            else -> showHome()
        }
    }

    private fun replace(v: View) { content.removeAllViews(); content.addView(v) }
    private fun showHome() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.homeMenu).setOnClickListener { Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show() }
        v.findViewById<TextView>(R.id.homeSearch).setOnClickListener { Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show() }
        v.findViewById<TextView>(R.id.homeBookmark).setOnClickListener { Toast.makeText(this, "Bookmarks", Toast.LENGTH_SHORT).show() }
        v.findViewById<View>(R.id.homeQBankCard).setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }
        v.findViewById<View>(R.id.homeTestCard).setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        v.findViewById<View>(R.id.homeVideoCard).setOnClickListener { state.navigate(MarrowRoute.VIDEOS); showVideos() }
        v.findViewById<Button>(R.id.homeShare).setOnClickListener { Toast.makeText(this, "Share Marrow", Toast.LENGTH_SHORT).show() }
    }

    private fun showQBank() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        replace(v)
        val c = v.findViewById<LinearLayout>(R.id.subjectContainer)
        subjects.forEach { s ->
            val row = TextView(this).apply {
                text = s
                textSize = 16f
                setTypeface(typeface, Typeface.BOLD)
                setPadding(20,22,20,22)
                setOnClickListener { qbank.openSubject(s); showLessons(s) }
            }
            c.addView(row)
            addDivider(c)
        }
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
        v.findViewById<Button>(R.id.playPrevious).setOnClickListener {
            if (state.session.currentMcqIndex > 0) {
                state.moveQuestion(state.session.currentMcqIndex - 1)
                showPlayer()
            }
        }
        v.findViewById<Button>(R.id.playSkip).setOnClickListener {
            question?.let {
                QBankSession(state).skip(it.id)
                if (state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                    state.moveQuestion(state.session.currentMcqIndex + 1)
                    showPlayer()
                } else {
                    qbank.openScore()
                    showScore()
                }
            }
        }
        v.findViewById<Button>(R.id.playNext).setOnClickListener {
            if (state.session.qbank.totalMcq > 0 && state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                state.moveQuestion(state.session.currentMcqIndex + 1)
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
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        v.findViewById<TextView>(R.id.scoreSummary).text =
            "Total: " + metrics.total + "   Attempted: " + metrics.attempted + "\n" +
            "Correct: " + metrics.correct + "   Wrong: " + metrics.wrong + "\n" +
            "Skipped: " + metrics.skipped + "   Accuracy: " + String.format("%.1f", metrics.accuracy) + "%"
        v.findViewById<Button>(R.id.reviewButton).setOnClickListener { qbank.openReview(); showReview() }
        v.findViewById<Button>(R.id.reviewLessonButton).setOnClickListener {
            state.navigate(MarrowRoute.QBANK_MODULE)
            showLessons(state.session.subjectId ?: "")
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
            val ids = ReviewEngine.filter(state.session.mcqIds, state.session.answers, filter)
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
                    text = q?.text?.let { "\${index + 1}. \$it" } ?: "Question \${index + 1}"
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

    private fun showTests() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_tests, content, false)
        replace(v)
        v.findViewById<Button>(R.id.testStart).setOnClickListener {
            tests.openIntro("source-test")
            showTests()
        }
        v.findViewById<Button>(R.id.testReview).setOnClickListener {
            tests.openAnalytics()
            showTests()
        }
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
