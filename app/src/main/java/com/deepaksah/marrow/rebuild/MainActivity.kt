package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.app.AlertDialog
import android.app.UiModeManager
import android.media.AudioManager
import android.os.Build
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.graphics.Typeface
import android.graphics.BitmapFactory
import android.util.Base64
import java.io.ByteArrayInputStream
import android.text.Html
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import android.webkit.WebView
import android.webkit.WebSettings

class MainActivity : Activity() {
    private lateinit var content: FrameLayout
    private val state = MarrowStateStore()
    private val qbank by lazy { QBankNavigator(state) }
    private val tests by lazy { TestNavigator(state) }
    private val custom by lazy { CustomModuleNavigator(state) }
    private var selectedSchemaTitle: String = ""
    private var selectedVideoSubject: String = ""
    private var customStage: Int = 0
    private var customSubject: String = ""
    private var customTopic: String = ""
    private var customTags: String = ""
    private val subjects = listOf("Anatomy","Anaesthesia","Biochemistry","Community Medicine","Dermatology","ENT","Forensic Medicine","Medicine","Microbiology","Obstetrics & Gynaecology","Ophthalmology","Orthopaedics","Paediatrics","Pathology","Pharmacology","Physiology","Psychiatry","Radiology","Surgery")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        state.restore(savedInstanceState)
        applySavedThemeMode()
        setContentView(R.layout.activity_main)
        content = findViewById(R.id.content)
        val navHome = findViewById<TextView>(R.id.navHome)
        val navQBank = findViewById<TextView>(R.id.navQBank)
        val navTests = findViewById<TextView>(R.id.navTests)
        val navVideos = findViewById<TextView>(R.id.navVideos)
        fun renderBottomNav() {
            val active = when (state.session.route) {
                MarrowRoute.QBANK, MarrowRoute.QBANK_INTRO, MarrowRoute.QBANK_TRACKER, MarrowRoute.QBANK_MODULE,
                MarrowRoute.QBANK_LESSON, MarrowRoute.QBANK_PLAY, MarrowRoute.QBANK_SCORE, MarrowRoute.QBANK_REVIEW,
                MarrowRoute.QBANK_ANALYTICS, MarrowRoute.PYQ, MarrowRoute.SCHEMA, MarrowRoute.SCHEMA_DETAIL, MarrowRoute.SCHEMA_REVIEW -> navQBank
                MarrowRoute.TESTS, MarrowRoute.TEST_INTRO, MarrowRoute.TEST_PLAY, MarrowRoute.TEST_SCORE,
                MarrowRoute.TEST_REVIEW, MarrowRoute.TEST_ANALYTICS, MarrowRoute.GT_ANALYTICS -> navTests
                MarrowRoute.VIDEOS, MarrowRoute.VIDEO_SUBJECT, MarrowRoute.VIDEO_PLAYER -> navVideos
                else -> navHome
            }
            listOf(navHome, navQBank, navTests, navVideos).forEach {
                it.setTextColor(if (it == active) getColor(R.color.marrow_primary) else getColor(R.color.marrow_muted))
            }
        }
        navHome.setOnClickListener { state.navigate(MarrowRoute.HOME); renderBottomNav(); showHome() }
        navQBank.setOnClickListener { state.navigate(MarrowRoute.QBANK); renderBottomNav(); showQBank() }
        navTests.setOnClickListener { state.navigate(MarrowRoute.TESTS); renderBottomNav(); showTests() }
        navVideos.setOnClickListener { state.navigate(MarrowRoute.VIDEOS); renderBottomNav(); showVideos() }
        renderBottomNav()
        loadMarrowContentThenHome()
    }

    private fun loadMarrowContentThenHome() {
        val splash = LayoutInflater.from(this).inflate(R.layout.screen_splash, content, false)
        replace(splash)
        Thread {
            val imported = runCatching {
                MarrowJsonImporter(assets).loadEdition8QBank()
            }.getOrElse { emptyMap() }
            runOnUiThread {
                if (imported.isNotEmpty()) {
                    state.importContent(imported)
                    state.rehydrateAfterContentImport()
                }
                Handler(Looper.getMainLooper()).postDelayed({ renderCurrent() }, 350L)
            }
        }.start()
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
        updateBottomNavigation()
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
            MarrowRoute.PYQ -> showPyq()
            MarrowRoute.SCHEMA -> showSchemaList()
            MarrowRoute.SCHEMA_DETAIL -> showSchemaDetail()
            MarrowRoute.SCHEMA_REVIEW -> showSchemaReview()
            MarrowRoute.PROFILE -> showProfile()
            MarrowRoute.SETTINGS -> showSettings()
            MarrowRoute.THEME -> showTheme()
            MarrowRoute.CUSTOM_MODULE, MarrowRoute.CUSTOM_INTRO, MarrowRoute.CUSTOM_CREATION, MarrowRoute.CUSTOM_MODE,
            MarrowRoute.CUSTOM_SUBJECTS, MarrowRoute.CUSTOM_TOPICS, MarrowRoute.CUSTOM_TAGS, MarrowRoute.CUSTOM_ADDONS,
            MarrowRoute.CUSTOM_JOIN, MarrowRoute.CUSTOM_PLAY, MarrowRoute.CUSTOM_SCORE -> showCustom()
        }
    }

    private fun updateBottomNavigation() {
        val route = state.session.route
        val selected = when (route) {
            MarrowRoute.QBANK, MarrowRoute.QBANK_INTRO, MarrowRoute.QBANK_TRACKER, MarrowRoute.QBANK_MODULE,
            MarrowRoute.QBANK_LESSON, MarrowRoute.QBANK_PLAY, MarrowRoute.QBANK_SCORE, MarrowRoute.QBANK_REVIEW,
            MarrowRoute.QBANK_ANALYTICS, MarrowRoute.PYQ, MarrowRoute.SCHEMA, MarrowRoute.SCHEMA_DETAIL,
            MarrowRoute.SCHEMA_REVIEW, MarrowRoute.BOOKMARKS, MarrowRoute.SEARCH -> R.id.navQBank
            MarrowRoute.TESTS, MarrowRoute.TEST_INTRO, MarrowRoute.TEST_PLAY, MarrowRoute.TEST_SCORE,
            MarrowRoute.TEST_REVIEW, MarrowRoute.TEST_ANALYTICS, MarrowRoute.GT_ANALYTICS -> R.id.navTests
            MarrowRoute.VIDEOS, MarrowRoute.VIDEO_SUBJECT, MarrowRoute.VIDEO_PLAYER -> R.id.navVideos
            else -> R.id.navHome
        }
        listOf(R.id.navHome, R.id.navQBank, R.id.navTests, R.id.navVideos).forEach { id ->
            findViewById<TextView>(id)?.apply {
                setTextColor(if (id == selected) getColor(R.color.marrow_primary) else getColor(R.color.marrow_muted))
                alpha = if (id == selected) 1f else 0.72f
            }
        }
    }

    private fun replace(v: View) { content.removeAllViews(); content.addView(v) }
    private fun showHome() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.homeMenu).setOnClickListener { showHomeMenu(v.findViewById(R.id.homeMenu)) }
        v.findViewById<ImageButton>(R.id.homeSearch).setOnClickListener {
            state.navigate(MarrowRoute.SEARCH)
            showSearch()
        }
        v.findViewById<ImageButton>(R.id.homeBookmark).setOnClickListener {
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
            isSingleLine = true
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


    private fun showPyq() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        box.addView(TextView(this).apply { text = "PYQ"; textSize = 22f; setTypeface(typeface, Typeface.BOLD) })
        val results = state.contentRegistry.search("pyq")
        box.addView(TextView(this).apply {
            text = if (results.isEmpty()) "No verified PYQ-tagged questions are loaded in the current local content registry. No PYQ data has been fabricated." else "Verified PYQ-tagged questions: ${results.size}"
            setPadding(4,16,4,16)
        })
        results.take(100).forEachIndexed { index, q ->
            box.addView(Button(this).apply {
                text = "${index + 1}. ${q.text}"
                setOnClickListener {
                    val module = state.contentRegistry.findModuleForQuestion(q.id)
                    if (module != null) {
                        val ids = state.contentRegistry.questionIds(module)
                        state.selectModule(module, ids)
                        state.moveQuestion(ids.indexOf(q.id).coerceAtLeast(0))
                        state.navigate(MarrowRoute.QBANK_PLAY)
                        showPlayer()
                    }
                }
            })
        }
        box.addView(Button(this).apply { text = "BACK TO QBANK"; setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() } })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showSchemaList() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        box.addView(TextView(this).apply { text = "Schema"; textSize = 22f; setTypeface(typeface, Typeface.BOLD) })
        box.addView(TextView(this).apply {
            text = "Recovered native Schema flow: Listing → Detail → Review. Live schema payload is not present in the local content registry."
            setPadding(4,16,4,16)
        })
        box.addView(Button(this).apply {
            text = "OPEN SCHEMA DETAIL"
            setOnClickListener { selectedSchemaTitle = "Schema"; state.navigate(MarrowRoute.SCHEMA_DETAIL); showSchemaDetail() }
        })
        box.addView(Button(this).apply { text = "BACK TO QBANK"; setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() } })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showSchemaDetail() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        box.addView(TextView(this).apply { text = selectedSchemaTitle.ifBlank { "Schema" }; textSize = 22f; setTypeface(typeface, Typeface.BOLD) })
        box.addView(TextView(this).apply {
            text = "Source-backed detail flow recovered. Schema ID, lesson payload, completion status and MCQ groups are server-backed in the original app and are not fabricated here."
            setPadding(4,16,4,16)
        })
        box.addView(Button(this).apply { text = "OPEN SCHEMA REVIEW"; setOnClickListener { state.navigate(MarrowRoute.SCHEMA_REVIEW); showSchemaReview() } })
        box.addView(Button(this).apply { text = "BACK TO SCHEMA LIST"; setOnClickListener { state.navigate(MarrowRoute.SCHEMA); showSchemaList() } })
        replace(ScrollView(this).apply { addView(box) })
    }

    private fun showSchemaReview() {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        box.addView(TextView(this).apply { text = "Schema Review"; textSize = 22f; setTypeface(typeface, Typeface.BOLD) })
        box.addView(TextView(this).apply {
            text = "Recovered review state supports answer/review loading and navigation, but the original schema MCQ payload is remote and unavailable in the local reconstruction."
            setPadding(4,16,4,16)
        })
        box.addView(Button(this).apply { text = "BACK TO SCHEMA DETAIL"; setOnClickListener { state.navigate(MarrowRoute.SCHEMA_DETAIL); showSchemaDetail() } })
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
        data class PearlSource(val title: String, val url: String, val alternateUrl: String)

        // Source: Marrow_Pearls_Standalone.html -> LECTURE_DATA.
        // The custom HTML wrapper/player layer is intentionally not used in the native app.
        val pearls = listOf(
            PearlSource("Anatomy pearl marrow .pdf", "https://web.afrahtafreeh.site/prepare/tYc8h1Hwan9ZJvcHxV378w?type=download", "https://webx.afrahtafreeh.site/prepare/6ph9m1017cfhaWEN90wnUg?type=download"),
            PearlSource("Physio pearls marrow .pdf", "https://web.afrahtafreeh.site/prepare/5PzSPnV9tMnl9eOyEB0Gpw?type=download", "https://webx.afrahtafreeh.site/prepare/AY7DY6lh3wLPFHeSLwae3w?type=download"),
            PearlSource("Marrow anesthesia Pearls.pdf", "https://web.afrahtafreeh.site/prepare/UddWM1i_jX2yc337p7nv2w?type=download", "https://webx.afrahtafreeh.site/prepare/31EusIPYfQ255TcOSUQKuw?type=download"),
            PearlSource("Marrow Psm pearls.pdf", "https://web.afrahtafreeh.site/prepare/03wMK6g6O1qFcekGdCjJnQ?type=download", "https://webx.afrahtafreeh.site/prepare/HUbYBqPb8TOn6pJZtH-luA?type=download"),
            PearlSource("Ortho marrow pearl .pdf", "https://web.afrahtafreeh.site/prepare/ln9cSWzlSUNSCSAA_TqjOA?type=download", "https://webx.afrahtafreeh.site/prepare/l38HqpV3ANvmz6FwP3BLfw?type=download"),
            PearlSource("Optha marrow pearl .pdf", "https://web.afrahtafreeh.site/prepare/z5vqIQB_-oS3P64VOuPSNw?type=download", "https://webx.afrahtafreeh.site/prepare/BQEydJkhfvJSsaiN8DCvXw?type=download"),
            PearlSource("Biochem marrow pearl .pdf", "https://web.afrahtafreeh.site/prepare/cWVwwZk9zi7AMdgX-hsoJA?type=download", "https://webx.afrahtafreeh.site/prepare/JXBYvRh_EcWl7Dk6bnYVnQ?type=download"),
            PearlSource("Derma pearl marrow .pdf", "https://web.afrahtafreeh.site/prepare/S58VksiphMd1AV1xi48igQ?type=download", "https://webx.afrahtafreeh.site/prepare/VYep_8XK58xbuoaWZ8kJnQ?type=download"),
            PearlSource("ECG Marrow pearl .pdf", "https://web.afrahtafreeh.site/prepare/L0dnzWX0nn-7lnC7hWig2g?type=download", "https://webx.afrahtafreeh.site/prepare/3Ax5hbDA8a_13NLvIGmX7w?type=download"),
            PearlSource("Psy pearl marrow .pdf", "https://web.afrahtafreeh.site/prepare/2nw3q_oYtlOE5ezNM-MvWA?type=download", "https://webx.afrahtafreeh.site/prepare/gPW2Kourd0dgKm8qjF1ghQ?type=download"),
            PearlSource("radio pearl only neet pg notes 2020 .pdf", "https://web.afrahtafreeh.site/prepare/4EN5Vr1b9o_YZdKptiYT6A?type=download", "https://webx.afrahtafreeh.site/prepare/hf4SKrsegzLJOpwMg03HUw?type=download"),
            PearlSource("Marrow Micro Pearls.pdf", "https://web.afrahtafreeh.site/prepare/jQWOvsf0_GjJPtjcsuOvpQ?type=download", "https://webx.afrahtafreeh.site/prepare/t5wpfT-3cyD1rsFlwDY0tA?type=download"),
            PearlSource("Patho Pearls nd Treasure.pdf", "https://web.afrahtafreeh.site/prepare/tWn_D-8wLghXlSvWt1oyBw?type=download", "https://webx.afrahtafreeh.site/prepare/SHUFrirszceT5fKuh9ahzA?type=download")
        )

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        root.addView(TextView(this).apply {
            text = "Pearls"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        root.addView(TextView(this).apply {
            text = "Verified Pearl resources · ${pearls.size}"
            textSize = 13f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(4, 4, 4, 14)
        })

        val search = EditText(this).apply {
            hint = "Search Pearls"
            isSingleLine = true
        }
        root.addView(search)

        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        root.addView(list)

        fun openPearl(source: PearlSource) {
            runCatching {
                startActivity(Intent(Intent.ACTION_VIEW, android.net.Uri.parse(source.url)))
            }.onFailure {
                runCatching {
                    startActivity(Intent(Intent.ACTION_VIEW, android.net.Uri.parse(source.alternateUrl)))
                }.onFailure {
                    Toast.makeText(this, "Pearl source could not be opened.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        fun render(filter: String) {
            list.removeAllViews()
            val q = filter.trim().lowercase()
            pearls.filter { q.isBlank() || it.title.lowercase().contains(q) }
                .forEachIndexed { index, source ->
                    val row = LinearLayout(this).apply {
                        orientation = LinearLayout.VERTICAL
                        setPadding(14, 12, 14, 12)
                        setBackgroundColor(getColor(R.color.marrow_surface))
                        setOnClickListener { openPearl(source) }
                    }
                    row.addView(TextView(this@MainActivity).apply {
                        text = "${index + 1}. ${source.title}"
                        textSize = 16f
                        setTypeface(typeface, Typeface.BOLD)
                        setTextColor(getColor(R.color.marrow_text))
                    })
                    row.addView(TextView(this@MainActivity).apply {
                        text = "Marrow Pearls · PDF resource"
                        textSize = 12f
                        setTextColor(getColor(R.color.marrow_muted))
                        setPadding(0, 5, 0, 0)
                    })
                    list.addView(row)
                    addDivider(list)
                }
            if (list.childCount == 0) {
                list.addView(TextView(this@MainActivity).apply {
                    text = "No matching Pearls."
                    setPadding(4, 24, 4, 24)
                })
            }
        }

        search.addTextChangedListener(object : android.text.TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                render(s?.toString().orEmpty())
            }
            override fun afterTextChanged(s: android.text.Editable?) = Unit
        })

        render("")
        root.addView(Button(this).apply {
            text = "BACK TO HOME"
            setOnClickListener {
                state.navigate(MarrowRoute.HOME)
                showHome()
            }
        })
        replace(ScrollView(this).apply { addView(root) })
    }
    private fun showBookmarks() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        root.addView(TextView(this).apply {
            text = "Bookmarks"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        root.addView(TextView(this).apply {
            text = "Saved questions"
            textSize = 13f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(0, 5, 0, 18)
        })

        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        root.addView(list)

        fun render(allContent: Boolean) {
            list.removeAllViews()
            val pairs = if (allContent) {
                state.contentRegistry.moduleIds().flatMap { module ->
                    state.contentRegistry.questionIds(module)
                        .filter { id -> state.session.answers[id]?.isStarred == true }
                        .map { module to it }
                }
            } else {
                BookmarkNavigationModel.ids(state).map { (state.session.moduleId ?: "") to it }
            }

            list.addView(TextView(this).apply {
                text = if (allContent) "All loaded bookmarks · " + pairs.size else "Current module bookmarks · " + pairs.size
                textSize = 14f
                setTypeface(typeface, Typeface.BOLD)
                setPadding(4, 8, 4, 12)
            })

            if (pairs.isEmpty()) {
                list.addView(TextView(this).apply {
                    text = "No bookmarked questions."
                    textSize = 15f
                    setPadding(4, 18, 4, 18)
                    setTextColor(getColor(R.color.marrow_muted))
                })
                return
            }

            pairs.forEachIndexed { index, pair ->
                val module = pair.first
                val id = pair.second
                val q = state.contentRegistry.question(module, id)
                val row = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(14, 12, 14, 12)
                    setBackgroundColor(getColor(R.color.marrow_surface))
                }
                row.addView(TextView(this@MainActivity).apply {
                    text = (index + 1).toString() + ". " + (q?.text ?: "Question " + (index + 1))
                    textSize = 16f
                    setTextColor(getColor(R.color.marrow_text))
                })
                row.addView(TextView(this@MainActivity).apply {
                    text = module
                    textSize = 12f
                    setTextColor(getColor(R.color.marrow_muted))
                    setPadding(0, 5, 0, 8)
                })
                row.addView(Button(this@MainActivity).apply {
                    text = "OPEN"
                    setOnClickListener {
                        if (module.isNotBlank()) {
                            val idsForModule = state.contentRegistry.questionIds(module)
                            state.selectModule(module, idsForModule)
                            state.moveQuestion(idsForModule.indexOf(id).coerceAtLeast(0))
                            state.navigate(MarrowRoute.QBANK_PLAY)
                            showPlayer()
                        }
                    }
                })
                row.addView(Button(this@MainActivity).apply {
                    text = "REMOVE BOOKMARK"
                    setOnClickListener {
                        QBankSession(state).toggleBookmark(id)
                        render(allContent)
                    }
                })
                list.addView(row)
                addDivider(list)
            }
        }

        val switch = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(0, 0, 0, 12)
        }
        switch.addView(Button(this).apply {
            text = "ALL LOADED"
            isAllCaps = false
            layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
            setOnClickListener { render(true) }
        })
        switch.addView(Button(this).apply {
            text = "CURRENT MODULE"
            isAllCaps = false
            layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
            setOnClickListener { render(false) }
        })
        root.addView(switch, 2)
        render(true)
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showQBank() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        replace(v)
        val tracker = v.findViewById<TextView>(R.id.qbankTracker)
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        tracker.text = "QBank tracker   ·   " + metrics.attempted + "/" + metrics.total + " attempted   ·   " + String.format("%.1f", metrics.accuracy) + "% accuracy"
        tracker.setOnClickListener { state.navigate(MarrowRoute.QBANK_TRACKER); showQBankTracker() }
        val c = v.findViewById<LinearLayout>(R.id.subjectContainer)
        fun sourceCard(label: String, detail: String, action: () -> Unit) {
            c.addView(LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL; setPadding(14,12,14,12)
                setBackgroundColor(getColor(R.color.marrow_surface)); setOnClickListener { action() }
                addView(TextView(this@MainActivity).apply { text=label; textSize=16f; setTypeface(typeface,Typeface.BOLD); setTextColor(getColor(R.color.marrow_text)) })
                addView(TextView(this@MainActivity).apply { text=detail; textSize=13f; setPadding(0,4,0,0); setTextColor(getColor(R.color.marrow_muted)) })
            }); addDivider(c)
        }
        sourceCard("Bookmarks","Saved questions") { state.navigate(MarrowRoute.BOOKMARKS); showBookmarks() }
        sourceCard("Custom Module","Customised MCQs") { customStage=0; state.navigate(MarrowRoute.CUSTOM_MODULE); showCustom() }
        subjects.forEach { s ->
            val moduleIds = state.contentRegistry.moduleIds().filter { it.startsWith("$s/") || it == s }
            val questionCount = moduleIds.sumOf { state.contentRegistry.questionIds(it).size }
            val row = LinearLayout(this).apply {
                orientation=LinearLayout.HORIZONTAL; setPadding(14,12,14,12); gravity=android.view.Gravity.CENTER_VERTICAL
                setBackgroundColor(getColor(R.color.marrow_surface)); setOnClickListener {
                    qbank.openSubject(s)
                    state.navigate(MarrowRoute.QBANK_MODULE)
                    showLessons(s)
                }
            }
            row.addView(ImageView(this).apply { layoutParams=LinearLayout.LayoutParams(52,52).apply { marginEnd=12 }; setImageResource(R.drawable.ic_pc_circle_including_logo); scaleType=ImageView.ScaleType.CENTER_INSIDE; contentDescription="Question Bank" })            row.addView(LinearLayout(this).apply {
                orientation=LinearLayout.VERTICAL; layoutParams=LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT,1f)
                addView(TextView(this@MainActivity).apply { text=s; textSize=17f; setTypeface(typeface,Typeface.BOLD); setTextColor(getColor(R.color.marrow_text)) })
                addView(TextView(this@MainActivity).apply { text="$" + "{moduleIds.size} modules  ·  $" + "{questionCount} questions"; textSize=13f; setPadding(0,5,0,0); setTextColor(getColor(R.color.marrow_muted)) })
            }); c.addView(row); addDivider(c)
        }
        sourceCard("Previous Year Question Papers","Question paper modules") { state.navigate(MarrowRoute.PYQ); showPyq() }
        sourceCard("Schema","Collection of important and repeatedly asked topics from all modules") { state.navigate(MarrowRoute.SCHEMA); showSchemaList() }
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
            setPadding(4, 4, 4, 12)
        })
        box.addView(ImageView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                120
            ).apply {
                topMargin = 4
                bottomMargin = 16
            }
            setImageResource(R.drawable.ic_pc_intro_bottom)
            scaleType = ImageView.ScaleType.CENTER_INSIDE
            contentDescription = "Question Bank"
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
            text = "Progress and completion"
            textSize = 13f
            setPadding(0, 6, 0, 16)
        })

        val summary = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(12, 12, 12, 12)
            setBackgroundColor(getColor(R.color.marrow_surface))
        }
        listOf(
            "Total questions" to metrics.total,
            "Attempted" to metrics.attempted,
            "Correct" to metrics.correct,
            "Wrong" to metrics.wrong,
            "Skipped" to metrics.skipped,
            "Bookmarked" to metrics.bookmarked
        ).forEach { (label, value) ->
            summary.addView(TextView(this).apply {
                text = "$label    $value"
                textSize = 16f
                setPadding(4, 8, 4, 8)
            })
        }
        summary.addView(TextView(this).apply {
            text = "Accuracy    " + String.format("%.1f", metrics.accuracy) + "%"
            textSize = 17f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(4, 10, 4, 6)
        })
        box.addView(summary)

        box.addView(TextView(this).apply {
            text = "Subject progress"
            textSize = 19f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(4, 22, 4, 10)
        })

        subjects.forEach { subject ->
            val moduleIds = state.contentRegistry.moduleIds().filter { it.startsWith("$subject/") || it == subject }
            val total = moduleIds.sumOf { state.contentRegistry.questionIds(it).size }
            val answered = moduleIds.sumOf { module ->
                state.contentRegistry.questionIds(module).count { state.session.answers[it]?.selectedAnswer != null || state.session.answers[it]?.skipped == true }
            }
            val percent = if (total == 0) 0 else (answered * 100 / total)
            box.addView(TextView(this).apply {
                text = "$subject    $answered/$total   ·   $percent%"
                textSize = 15f
                setPadding(8, 10, 8, 10)
            })
        }

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
        val tabs = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(0, 4, 0, 12)
        }
        val tabNames = listOf("All", "Paused", "Completed", "Unattempted", "Free")
        fun moduleState(ids: List<String>): String {
            if (ids.isEmpty()) return "unattempted"
            val answered = ids.count { state.session.answers[it]?.selectedAnswer != null || state.session.answers[it]?.skipped == true }
            val locked = ids.count { state.session.answers[it]?.locked == true }
            return when {
                locked >= ids.size -> "completed"
                answered > 0 -> "paused"
                else -> "unattempted"
            }
        }
        fun render(filter: String) {
            c.removeAllViews()
            val filtered = moduleIds.filter { module ->
                val ids = state.contentRegistry.questionIds(module)
                when (filter) {
                    "all" -> true
                    "completed" -> moduleState(ids) == "completed"
                    "paused" -> moduleState(ids) == "paused"
                    "unattempted" -> moduleState(ids) == "unattempted"
                    // No verified local free-module flag exists in the supplied content contract.
                    "free" -> false
                    else -> true
                }
            }
            if (filtered.isEmpty()) {
                c.addView(TextView(this).apply {
                    text = if (filter == "free") "No verified free-module payload is attached." else "No modules match this filter."
                    textSize = 15f
                    setPadding(16, 18, 16, 18)
                    setTextColor(getColor(R.color.marrow_muted))
                })
                return
            }
            filtered.forEach { moduleId ->
                val ids = state.contentRegistry.questionIds(moduleId)
                val solved = ids.count { state.session.answers[it]?.locked == true }
                val row = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(14, 12, 14, 12)
                    setBackgroundColor(getColor(R.color.marrow_surface))
                    setOnClickListener {
                        state.session.moduleId = moduleId
                        state.session.subjectId = subject
                        state.session.mcqIds = ids.toMutableList()
                        state.session.currentMcqIndex = 0
                        state.navigate(MarrowRoute.QBANK_LESSON)
                        showLessonDetail(subject, moduleId, ids)
                    }
                }
                row.addView(TextView(this).apply {
                    text = moduleId.removePrefix("$subject/")
                    textSize = 16f
                    setTypeface(typeface, Typeface.BOLD)
                    setTextColor(getColor(R.color.marrow_text))
                })
                row.addView(TextView(this).apply {
                    text = ids.size.toString() + " MCQs  ·  " + solved + "/" + ids.size + " completed"
                    textSize = 13f
                    setPadding(0, 4, 0, 0)
                    setTextColor(getColor(R.color.marrow_muted))
                })
                c.addView(row)
                addDivider(c)
            }
        }
        tabNames.forEachIndexed { index, name ->
            tabs.addView(Button(this).apply {
                text = name
                isAllCaps = false
                textSize = 12f
                setPadding(8, 2, 8, 2)
                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
                setOnClickListener { render(name.lowercase()) }
            })
        }
        v.findViewById<TextView>(R.id.lessonSource).text = "Modules · All · Paused · Completed · Unattempted · Free"
        v.findViewById<LinearLayout>(R.id.lessonRoot).addView(tabs, 2)
        render("all")
    }

    private fun showLessonDetail(subject: String, moduleId: String, ids: List<String>) {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 24)
        }
        root.addView(TextView(this).apply {
            text = subject
            textSize = 14f
            setTextColor(getColor(R.color.marrow_primary))
            setTypeface(typeface, Typeface.BOLD)
        })
        root.addView(TextView(this).apply {
            text = moduleId.removePrefix("$" + "subject/")
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(0, 6, 0, 8)
        })
        root.addView(TextView(this).apply {
            text = "Module"
            textSize = 13f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(0, 0, 0, 18)
        })
        val solved = ids.count { state.session.answers[it]?.locked == true }
        root.addView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(14, 14, 14, 14)
            setBackgroundColor(getColor(R.color.marrow_surface))
            addView(TextView(this@MainActivity).apply {
                text = ids.size.toString() + " MCQs"
                textSize = 17f
                setTypeface(typeface, Typeface.BOLD)
            })
            addView(TextView(this@MainActivity).apply {
                text = if (solved >= ids.size && ids.isNotEmpty()) "All completed" else solved.toString() + "/" + ids.size + " completed"
                textSize = 13f
                setTextColor(getColor(R.color.marrow_muted))
                setPadding(0, 5, 0, 0)
            })
        })
        root.addView(Button(this).apply {
            text = "SOLVE"
            isEnabled = ids.isNotEmpty()
            setOnClickListener {
                qbank.openModule(subject, ids)
                state.navigate(MarrowRoute.QBANK_PLAY)
                showPlayer()
            }
        })
        val bookmarked = ids.count { state.session.answers[it]?.isStarred == true }
        root.addView(TextView(this).apply {
            text = "🔖  " + bookmarked + " Bookmarks"
            textSize = 15f
            setPadding(14, 16, 14, 16)
        })
        root.addView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(14, 16, 14, 16)
            addView(TextView(this@MainActivity).apply {
                text = "◉  Schema"
                textSize = 16f
                setTypeface(typeface, Typeface.BOLD)
            })
            addView(TextView(this@MainActivity).apply {
                text = "Schema is a curated list of important and repeatedly asked topics."
                textSize = 13f
                setTextColor(getColor(R.color.marrow_muted))
                setPadding(0, 5, 0, 12)
            })
            addView(TextView(this@MainActivity).apply {
                text = "Source-backed schema surface; live schema payload is not fabricated locally."
                textSize = 13f
                setTextColor(getColor(R.color.marrow_muted))
            })
        })
        root.addView(TextView(this).apply {
            text = "Module progress"
            textSize = 17f
            setTypeface(typeface, Typeface.BOLD)
            setPadding(4, 22, 4, 8)
        })
        root.addView(TextView(this).apply {
            text = if (ids.isEmpty()) "No verified local MCQs are attached to this module." else "You have solved " + solved + " of " + ids.size + " MCQs in this local session."
            textSize = 14f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(4, 0, 4, 18)
        })
        root.addView(Button(this).apply {
            text = "BACK TO " + subject
            setOnClickListener {
                state.navigate(MarrowRoute.QBANK_MODULE)
                showLessons(subject)
            }
        })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun currentQuestion(): McqContent? {
        val ids = state.session.mcqIds
        val index = state.session.currentMcqIndex
        return if (index in ids.indices) {
            state.contentRegistry.question(state.session.moduleId, ids[index])
        } else null
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
            questionView.text = formatRichContent(question.text)
            val questionMedia = v.findViewById<LinearLayout>(R.id.questionMedia)
            renderContentImages(questionMedia, question.questionImages)
            val existing = state.session.answers[question.id]
            question.choices.forEach { choice ->
                optionContainer.addView(Button(this).apply {
                    text = formatRichContent(choice.text)
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
            if (existing?.locked == true && (question.solution.isNotBlank() || question.explanationImages.isNotEmpty())) {
                explanation.text = formatRichContent("Explanation\n\n" + question.solution)
                explanation.visibility = if (question.solution.isNotBlank()) View.VISIBLE else View.GONE
                val explanationMedia = v.findViewById<LinearLayout>(R.id.explanationMedia)
                renderContentImages(explanationMedia, question.explanationImages)
                explanationMedia.visibility = if (question.explanationImages.isNotEmpty()) View.VISIBLE else View.GONE
            } else {
                explanation.visibility = View.GONE
                v.findViewById<LinearLayout>(R.id.explanationMedia).visibility = View.GONE
            }
            v.findViewById<TextView>(R.id.playBookmark).text =
                if (existing?.isStarred == true) "★" else "☆"
        }

        v.findViewById<TextView>(R.id.playBookmark).setOnClickListener {
            question?.let { QBankSession(state).toggleBookmark(it.id); showPlayer() }
        }

        v.findViewById<Button>(R.id.playReport).setOnClickListener {
            Toast.makeText(this@MainActivity, "Report action recorded for this local reconstruction.", Toast.LENGTH_SHORT).show()
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

    private fun renderContentImages(container: LinearLayout, sources: List<String>) {
        container.removeAllViews()
        sources.forEach { source ->
            val image = decodeContentImage(source) ?: return@forEach
            container.addView(ImageView(this).apply {
                setImageBitmap(image)
                adjustViewBounds = true
                scaleType = ImageView.ScaleType.FIT_CENTER
                setPadding(0, 8, 0, 8)
                contentDescription = "Question content image"
            }, LinearLayout.LayoutParams(-1, -2))
        }
    }

    private fun decodeContentImage(source: String): android.graphics.Bitmap? {
        val value = source.trim()
        if (value.isBlank()) return null
        return runCatching {
            when {
                value.startsWith("data:image", ignoreCase = true) -> {
                    val comma = value.indexOf(',')
                    if (comma < 0) null else {
                        val bytes = Base64.decode(value.substring(comma + 1), Base64.DEFAULT)
                        BitmapFactory.decodeStream(ByteArrayInputStream(bytes))
                    }
                }                value.startsWith("base64:", ignoreCase = true) -> {
                    val bytes = Base64.decode(value.substringAfter(':'), Base64.DEFAULT)
                    BitmapFactory.decodeStream(ByteArrayInputStream(bytes))
                }
                else -> {
                    val assetPath = if (value.startsWith("file:///android_asset/")) {
                        value.removePrefix("file:///android_asset/")
                    } else value
                    assets.open(assetPath).use { BitmapFactory.decodeStream(it) }
                }
            }
        }.getOrNull()
    }

    private fun formatRichContent(value: String): Spanned {
        return Html.fromHtml(value, Html.FROM_HTML_MODE_LEGACY)
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
        v.findViewById<Button>(R.id.analyticsButton).setOnClickListener {
            state.navigate(MarrowRoute.QBANK_ANALYTICS)
            showAnalytics()
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
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply {
            text = "QBank Review"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        var showAnswer = false
        var activeFilter = ReviewFilter.ALL
        val answerToggle = CheckBox(this).apply {
            text = "Show answer / explanation"
            isChecked = false
        }
        root.addView(answerToggle)
        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        root.addView(list)

        fun render(filter: ReviewFilter = activeFilter) {
            activeFilter = filter
            list.removeAllViews()
            val ids = ReviewEngine.filter(
                state.session.mcqIds,
                state.session.answers,
                state.contentRegistry.allQuestions(state.session.moduleId),
                activeFilter
            )
            list.addView(TextView(this).apply {
                text = activeFilter.name.replace('_', ' ') + " · " + ids.size
                textSize = 15f
                setTypeface(typeface, Typeface.BOLD)
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
                val q = state.contentRegistry.question(state.session.moduleId, id)
                val answerState = state.session.answers[id]
                val item = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(4,8,4,12)
                }
                val status = when {
                    answerState?.skipped == true -> "Skipped"
                    answerState?.isRight == true -> "Correct"
                    answerState?.isRight == false -> "Wrong"
                    else -> "Unanswered"
                }
                item.addView(TextView(this@MainActivity).apply {
                    text = (index + 1).toString() + ". " + status
                    textSize = 13f
                    setTypeface(typeface, Typeface.BOLD)
                    setPadding(4,2,4,4)
                })
                item.addView(TextView(this@MainActivity).apply {
                    text = q?.text ?: "Question " + (index + 1)
                    textSize = 16f
                    setTypeface(typeface, Typeface.BOLD)
                    setPadding(4,2,4,6)
                })
                if (answerState?.selectedAnswer != null) {
                    val selected = q?.choices?.firstOrNull { it.id == answerState.selectedAnswer }?.text
                    item.addView(TextView(this@MainActivity).apply {
                        text = "Your answer: " + (selected ?: answerState.selectedAnswer)
                        textSize = 14f
                        setPadding(4,2,4,4)
                    })
                }
                if (showAnswer && q != null) {
                    val answer = q.choices.firstOrNull { it.id == q.correctChoiceId }?.text
                    item.addView(TextView(this@MainActivity).apply {
                        text = formatRichContent(
                            "Answer: " + (answer ?: "Not available") +
                                if (q.solution.isNotBlank()) "\n\nExplanation:\n" + q.solution else ""
                        )
                        setPadding(8,8,8,8)
                    })
                }
                item.setOnClickListener {
                    val questionIndex = state.session.mcqIds.indexOf(id)
                    if (questionIndex >= 0) {
                        state.moveQuestion(questionIndex)
                        state.navigate(MarrowRoute.QBANK_PLAY)
                        showPlayer()
                    }
                }
                list.addView(item)
                addDivider(list)
            }
        }

        answerToggle.setOnCheckedChangeListener { _, checked ->
            showAnswer = checked
            render()
        }
        ReviewFilter.values().forEach { filter ->
            root.addView(Button(this).apply {
                text = filter.name.replace('_', ' ')
                setOnClickListener { render(filter) }
            })
        }
        root.addView(Button(this).apply {
            text = "BACK TO SCORE"
            setOnClickListener {
                qbank.openScore()
                showScore()
            }
        })
        render()
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
                val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(20,20,20,20) }
                box.addView(TextView(this).apply { text="Tests"; textSize=26f; setTypeface(typeface,Typeface.BOLD) })
                val tabs=listOf("Grand Tests","Mini Tests","Subject Tests")
                val tabRow=LinearLayout(this).apply { orientation=LinearLayout.HORIZONTAL }
                tabs.forEach { tab -> tabRow.addView(Button(this).apply {
                    text=tab
                    setOnClickListener { tests.selectConfiguredTab(tab); Toast.makeText(this@MainActivity,"Selected $tab",Toast.LENGTH_SHORT).show() }
                },LinearLayout.LayoutParams(0,-2,1f)) }
                box.addView(tabRow)
                box.addView(TextView(this).apply { text="Tests"; textSize=18f; setTypeface(typeface,Typeface.BOLD); setPadding(4,20,4,8) })
                val testList=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(12,12,12,12) }
                testList.addView(TextView(this).apply { text="Test list"; textSize=16f; setTypeface(typeface,Typeface.BOLD) })
                testList.addView(Button(this).apply { text="OPEN TEST INTRO"; setOnClickListener { tests.openIntro("source-test"); showTests() } })
                box.addView(testList)
                box.addView(TextView(this).apply { text="Previous Year Tests"; textSize=18f; setTypeface(typeface,Typeface.BOLD); setPadding(4,20,4,8) })
                box.addView(Button(this).apply { text="Previous Year Tests   ›"; setOnClickListener { tests.openIntro("previous-year"); showTests() } })
                box.addView(Button(this).apply { text="Test Analytics   ›"; setOnClickListener { tests.openAnalytics(); showTests() } })
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
        box.addView(TextView(this).apply {            text = "Completion: ${String.format("%.1f", analytics.completionPercent)}%\nAccuracy: ${String.format("%.1f", analytics.accuracyPercent)}%\n\nTotal: ${m.total}\nAttempted: ${m.attempted}\nCorrect: ${m.correct}\nWrong: ${m.wrong}\nSkipped: ${m.skipped}\nUnanswered: ${m.unanswered}\n\nBookmarked: ${analytics.bookmarked}\nGuessed: ${analytics.guessed}\nChanged by you: ${analytics.changedByYou}"
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
        when (state.session.route) {
            MarrowRoute.VIDEO_SUBJECT -> showVideoLessons()
            MarrowRoute.VIDEO_PLAYER -> showVideoPlayer()
            else -> {
                val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
                root.addView(TextView(this).apply { text="Videos"; textSize=26f; setTypeface(typeface,Typeface.BOLD) })
                val topRow=LinearLayout(this).apply { orientation=LinearLayout.HORIZONTAL }
                listOf("Downloaded","Sample Videos").forEach { title ->
                    topRow.addView(Button(this).apply {
                        text=title
                        setOnClickListener {
                            if(title=="Downloaded") showVideoInfo("Downloaded","Downloaded videos surface recovered; no verified downloaded payload is bundled locally.")
                            else showVideoInfo("Sample Videos","Sample-video surface recovered; no verified sample payload is bundled locally.")
                        }
                    },LinearLayout.LayoutParams(0,-2,1f))
                }
                root.addView(topRow)
                root.addView(Button(this).apply {
                    text="World of Revision   ›"
                    setOnClickListener { showVideoInfo("World of Revision","Recovered World of Revision navigation surface. Remote lesson payload is not fabricated locally.") }
                })
                root.addView(TextView(this).apply {
                    text="SUBJECTS"; textSize=16f; setTypeface(typeface,Typeface.BOLD); setPadding(4,20,4,8)
                })
                root.addView(TextView(this).apply {
                    text="Video subject catalog is server-backed; no verified local subject payload is bundled."
                    setPadding(4,8,4,18)
                })
                root.addView(Button(this).apply {
                    text="OPEN VIDEO SUBJECTS"
                    setOnClickListener { state.navigate(MarrowRoute.VIDEO_SUBJECT); showVideoLessons() }
                })
                root.addView(Button(this).apply { text="BACK HOME"; setOnClickListener { state.navigate(MarrowRoute.HOME); showHome() } })
                replace(ScrollView(this).apply { addView(root) })
            }
        }
    }

    private fun showVideoLessons() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text="Video Lessons"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text="Select subject"; setPadding(4,12,4,18) })
        subjects.forEach { subject ->
            root.addView(Button(this).apply {
                text=subject
                setOnClickListener { selectedVideoSubject=subject; state.navigate(MarrowRoute.VIDEO_PLAYER); showVideoPlayer() }
            })
        }
        root.addView(Button(this).apply { text="BACK"; setOnClickListener { state.navigate(MarrowRoute.VIDEOS); showVideos() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showVideoPlayer() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text="Video Player"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text="Subject: $selectedVideoSubject"; setPadding(4,12,4,18) })
        root.addView(TextView(this).apply { text="No verified local stream/file is bundled, so playback is not faked."; setPadding(4,8,4,18) })
        val speed=TextView(this).apply { text="Playback speed: 1.0×"; setPadding(4,12,4,8) }; root.addView(speed)
        val speedRow=LinearLayout(this).apply { orientation=LinearLayout.HORIZONTAL }
        listOf("0.75×","1.0×","1.25×","1.5×","2.0×").forEach { s ->
            speedRow.addView(Button(this).apply {
                text=s
                setOnClickListener { speed.text="Playback speed: $s" }
            }, LinearLayout.LayoutParams(0,-2,1f))
        }
        root.addView(speedRow)
        root.addView(TextView(this).apply { text="Brightness"; setPadding(4,18,4,4) })
        val brightness = SeekBar(this).apply {
            max=100
            progress=((window.attributes.screenBrightness.takeIf { it >= 0f } ?: 0.5f) * 100f).toInt()
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(bar: SeekBar?, value: Int, fromUser: Boolean) {
                    if (!fromUser) return
                    val params=window.attributes
                    params.screenBrightness=(value.coerceIn(1,100) / 100f)
                    window.attributes=params
                }
                override fun onStartTrackingTouch(bar: SeekBar?) {}
                override fun onStopTrackingTouch(bar: SeekBar?) {}
            })
        }
        root.addView(brightness)
        root.addView(TextView(this).apply { text="Volume"; setPadding(4,12,4,4) })
        val audioManager=getSystemService(AudioManager::class.java)
        val maxVolume=audioManager?.getStreamMaxVolume(AudioManager.STREAM_MUSIC)?.coerceAtLeast(1) ?: 1
        val currentVolume=audioManager?.getStreamVolume(AudioManager.STREAM_MUSIC) ?: 0
        val volume = SeekBar(this).apply {
            max=100
            progress=(currentVolume * 100 / maxVolume).coerceIn(0,100)
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(bar: SeekBar?, value: Int, fromUser: Boolean) {
                    if (fromUser) audioManager?.setStreamVolume(AudioManager.STREAM_MUSIC, value * maxVolume / 100, 0)
                }
                override fun onStartTrackingTouch(bar: SeekBar?) {}
                override fun onStopTrackingTouch(bar: SeekBar?) {}
            })
        }
        root.addView(volume)
        root.addView(Button(this).apply { text="DOWNLOAD"; setOnClickListener { Toast.makeText(this@MainActivity,"No verified video file available.",Toast.LENGTH_SHORT).show() } })
        root.addView(Button(this).apply { text="NOTES"; setOnClickListener { showVideoInfo("Video Notes","Native notes flow recovered; remote note content is unavailable locally.") } })
        root.addView(Button(this).apply { text="BACK TO LESSONS"; setOnClickListener { state.navigate(MarrowRoute.VIDEO_SUBJECT); showVideoLessons() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showVideoInfo(title:String,message:String) {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text=title; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text=message; setPadding(4,18,4,20) })
        root.addView(Button(this).apply { text="BACK TO VIDEOS"; setOnClickListener { state.navigate(MarrowRoute.VIDEOS); showVideos() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showCustom() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        val stages=listOf("Mode","Subjects","Topics","Tags","Add-ons","Join by Code","Play","Score")
        root.addView(TextView(this).apply { text="Custom Module"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text="Step " + (customStage+1) + "/" + stages.size + ": " + stages[customStage]; setPadding(4,14,4,14) })
        when(customStage) {
            0 -> root.addView(Button(this).apply { text="QBank mode"; setOnClickListener { customStage=1; showCustom() } })
            1 -> subjects.forEach { s -> root.addView(Button(this).apply { text=s; setOnClickListener { customSubject=s; customStage=2; showCustom() } }) }
            2 -> {
                val modules=state.contentRegistry.moduleIds().filter { it.contains(customSubject,true) }
                if(modules.isEmpty()) root.addView(TextView(this).apply { text="No verified local topic payload for " + customSubject + "."; setPadding(4,12,4,12) })
                modules.take(30).forEach { moduleId -> root.addView(Button(this).apply { text=moduleId; setOnClickListener { customTopic=moduleId; customStage=3; showCustom() } }) }
            }
            3 -> { val input=EditText(this).apply { hint="Tags (optional)" }; root.addView(input); root.addView(Button(this).apply { text="CONTINUE"; setOnClickListener { customTags=input.text.toString(); customStage=4; showCustom() } }) }
            4 -> root.addView(Button(this).apply { text="USE DEFAULT ADD-ONS"; setOnClickListener { customStage=5; showCustom() } })
            5 -> { val code=EditText(this).apply { hint="Join code" }; root.addView(code); root.addView(Button(this).apply { text="JOIN"; setOnClickListener { Toast.makeText(this@MainActivity,"Join-by-code requires original server endpoint; not fabricated.",Toast.LENGTH_SHORT).show() } }); root.addView(Button(this).apply { text="SKIP"; setOnClickListener { customStage=6; showCustom() } }) }
            6 -> { root.addView(TextView(this).apply { text="Generated module payload is server-backed. Local verified QBank content remains available."; setPadding(4,12,4,12) }); root.addView(Button(this).apply { text="OPEN QBANK"; setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() } }); root.addView(Button(this).apply { text="SCORE"; setOnClickListener { customStage=7; showCustom() } }) }
            else -> { root.addView(TextView(this).apply { text="Score uses only locally loaded QBank answers."; setPadding(4,12,4,12) }); root.addView(Button(this).apply { text="RESET"; setOnClickListener { customStage=0; customSubject=""; customTopic=""; customTags=""; showCustom() } }) }
        }
        root.addView(Button(this).apply { text="BACK"; setOnClickListener { if(customStage>0){customStage--;showCustom()}else{state.navigate(MarrowRoute.QBANK);showQBank()} } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showProfile() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text="Profile"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text="Recovered profile surface. Account identity is not fabricated locally."; setPadding(4,18,4,20) })
        root.addView(Button(this).apply { text="SETTINGS"; setOnClickListener { state.navigate(MarrowRoute.SETTINGS); showSettings() } })
        root.addView(Button(this).apply { text="BACK HOME"; setOnClickListener { state.navigate(MarrowRoute.HOME); showHome() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showSettings() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text="Settings"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(Button(this).apply { text="THEME"; setOnClickListener { state.navigate(MarrowRoute.THEME); showTheme() } })
        root.addView(Button(this).apply { text="PROFILE"; setOnClickListener { state.navigate(MarrowRoute.PROFILE); showProfile() } })
        root.addView(Button(this).apply { text="BACK"; setOnClickListener { state.navigate(MarrowRoute.PROFILE); showProfile() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun applySavedThemeMode() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val manager = getSystemService(UiModeManager::class.java)
            manager?.setApplicationNightMode(
                if (MarrowTheme.isDark(this)) UiModeManager.MODE_NIGHT_YES else UiModeManager.MODE_NIGHT_NO
            )
        }
    }

    private fun setDarkTheme(enabled: Boolean) {
        MarrowTheme.setDark(this, enabled)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            getSystemService(UiModeManager::class.java)?.setApplicationNightMode(
                if (enabled) UiModeManager.MODE_NIGHT_YES else UiModeManager.MODE_NIGHT_NO
            )
        }
        recreate()
    }

    private fun showHomeMenu(anchor: View) {
        PopupMenu(this, anchor).apply {
            menu.add("Search")
            menu.add("Bookmarks")
            menu.add("Profile")
            menu.add("Settings")
            menu.add("Custom Module")
            setOnMenuItemClickListener {
                when (it.title.toString()) {
                    "Search" -> { state.navigate(MarrowRoute.SEARCH); showSearch(); true }
                    "Bookmarks" -> { state.navigate(MarrowRoute.BOOKMARKS); showBookmarks(); true }
                    "Profile" -> { state.navigate(MarrowRoute.PROFILE); showProfile(); true }
                    "Settings" -> { state.navigate(MarrowRoute.SETTINGS); showSettings(); true }
                    "Custom Module" -> { customStage = 0; state.navigate(MarrowRoute.CUSTOM_MODULE); showCustom(); true }
                    else -> false
                }
            }
            show()
        }
    }

    private fun showTheme() {
        val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(20,20,20,20) }
        root.addView(TextView(this).apply { text="Theme"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply { text="Theme selection is stored locally and applied to the app."; setPadding(4,18,4,18) })
        root.addView(Button(this).apply { text="LIGHT"; setOnClickListener { setDarkTheme(false) } })
        root.addView(Button(this).apply { text="DARK"; setOnClickListener { setDarkTheme(true) } })
        root.addView(Button(this).apply { text="BACK SETTINGS"; setOnClickListener { state.navigate(MarrowRoute.SETTINGS); showSettings() } })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun addDivider(c: LinearLayout) {
        c.addView(View(this).apply { setBackgroundColor(0xFFE6E6E6.toInt()) }, LinearLayout.LayoutParams(-1,1))
    }
}