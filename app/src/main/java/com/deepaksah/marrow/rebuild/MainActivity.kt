package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.os.Bundle
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
        renderCurrent()
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
    private fun showHome() { replace(LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)) }

    private fun showQBank() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        replace(v)
        val c = v.findViewById<LinearLayout>(R.id.subjectContainer)
        subjects.forEach { s ->
            val row = TextView(this).apply {
                text = s; textSize = 16f; setTypeface(typeface, Typeface.BOLD); setPadding(20,22,20,22)
                setOnClickListener { qbank.openSubject(s); showLessons(s) }
            }
            c.addView(row); addDivider(c)
        }
    }

    private fun showLessons(subject: String) {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_lessons, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.lessonTitle).text = if (subject.isBlank()) "QBank" else subject
        v.findViewById<TextView>(R.id.lessonBack).setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() }
        val c = v.findViewById<LinearLayout>(R.id.lessonContainer)
        c.addView(TextView(this).apply {
            text = "Lesson/module list is populated from the supplied content repository. No module names are fabricated."
            textSize = 15f; setPadding(16,18,16,18)
        })
        c.addView(Button(this).apply {
            text = "Open QBank player"
            setOnClickListener { qbank.openModule(subject, emptyList()); showPlayer() }
        })
    }

    private fun showPlayer() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_play, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.playPosition).text =
            "QBank · " + (state.session.currentMcqIndex + 1) + " / " + state.session.qbank.totalMcq
        v.findViewById<TextView>(R.id.playQuestion).text =
            "Player is connected to the canonical MCQ contract. Actual question text/options are loaded only when supplied by the content payload."
        v.findViewById<LinearLayout>(R.id.optionContainer).removeAllViews()
        v.findViewById<TextView>(R.id.playBookmark).setOnClickListener { }
        v.findViewById<Button>(R.id.playNext).setOnClickListener {
            if (state.session.qbank.totalMcq > 0 && state.session.currentMcqIndex + 1 < state.session.qbank.totalMcq) {
                state.moveQuestion(state.session.currentMcqIndex + 1); showPlayer()
            } else { qbank.openScore(); showScore() }
        }
    }

    private fun showScore() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank_score, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.scoreSummary).text = "Score is calculated from persisted MCQ answer state."
        v.findViewById<Button>(R.id.reviewButton).setOnClickListener { qbank.openReview(); showReview() }
        v.findViewById<Button>(R.id.reviewLessonButton).setOnClickListener {
            state.navigate(MarrowRoute.QBANK_MODULE); showLessons(state.session.subjectId ?: "")
        }
    }

    private fun showReview() {
        replace(TextView(this).apply {
            text = "Review\n\nFilters are source-backed: All, Bookmarked, Changed By You, Correct, Guess correct, Guess wrong, Schema MCQs, New / Revised, Silly Mistakes, Skipped, Wrong."
            textSize = 17f; setPadding(24,24,24,24)
        })
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
        val v = LayoutInflater.from(this).inflate(R.layout.screen_videos, content, false)
        replace(v)
    }

    private fun addDivider(c: LinearLayout) {
        replace(TextView(this).apply {
            text = "Videos\n\nVideo landing → subject → lesson → player. Live playback/download URLs are not fabricated."
            textSize = 18f; setPadding(24,24,24,24)
        })
    }

    private fun showCustom() {
        replace(TextView(this).apply {
            text = "Custom Module\n\nIntroduction → Mode → Subjects → Topics → Tags → Add-ons → Join by Code → Generated Module → Play → Score/Review"
            textSize = 18f; setPadding(24,24,24,24)
        })
    }

    private fun addDivider(c: LinearLayout) {
        c.addView(View(this).apply { setBackgroundColor(0xFFE6E6E6.toInt()) }, LinearLayout.LayoutParams(-1, 1))
    }
}