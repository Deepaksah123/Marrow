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
import android.view.WindowInsets
import android.widget.*
import android.webkit.WebView
import android.webkit.WebSettings
import androidx.drawerlayout.widget.DrawerLayout

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
        val bottomNavigation = findViewById<LinearLayout>(R.id.bottomNavigation)

        // Android 15+ enforces edge-to-edge for targetSdk 35. Apply the
        // system-bar insets explicitly so the native-like toolbar/content does
        // not sit under the status bar and the bottom navigation remains fully
        // touchable above the gesture/navigation area.
        val root = findViewById<LinearLayout>(R.id.root)
        root.setOnApplyWindowInsetsListener { _, insets ->
            val topInset = insets.systemWindowInsetTop
            val bottomInset = insets.systemWindowInsetBottom
            content.setPadding(content.paddingLeft, topInset, content.paddingRight, 0)
            val navParams = bottomNavigation.layoutParams
            navParams.height = dp(56) + bottomInset
            bottomNavigation.layoutParams = navParams
            bottomNavigation.setPadding(
                bottomNavigation.paddingLeft,
                dp(2),
                bottomNavigation.paddingRight,
                bottomInset + dp(2)
            )
            insets
        }
        root.requestApplyInsets()
        bottomNavigation.visibility = View.GONE

        fun renderBottomNav() {
            bottomNavigation.visibility = View.VISIBLE
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
                it.isSelected = it == active
                it.setTextColor(if (it == active) getColor(R.color.marrow_primary) else getColor(R.color.marrow_muted))
            }
        }
        navHome.setOnClickListener { state.navigate(MarrowRoute.HOME); renderBottomNav(); showHome() }
        navQBank.setOnClickListener { state.navigate(MarrowRoute.QBANK); renderBottomNav(); showQBank() }
        navTests.setOnClickListener { state.navigate(MarrowRoute.TESTS); renderBottomNav(); showTests() }
        navVideos.setOnClickListener { state.navigate(MarrowRoute.VIDEOS); renderBottomNav(); showVideos() }
        loadMarrowContentThenHome()
    }

    private fun dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()

    private fun loadMarrowContentThenHome() {
        // The Edition 8 QBank asset bundle was intentionally removed. Keep
        // startup deterministic and do not attempt to recreate/import deleted
        // educational content. The native shell remains fully navigable.
        val splash = LayoutInflater.from(this).inflate(R.layout.screen_splash, content, false)
        replace(splash)
        Handler(Looper.getMainLooper()).postDelayed({ renderCurrent() }, 350L)
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
        val bottomNavigation = findViewById<LinearLayout>(R.id.bottomNavigation)
        val route = state.session.route
        // Profile/Settings/Theme are dedicated account/settings surfaces in the
        // recovered native app, not main-tab destinations.
        if (route == MarrowRoute.PROFILE || route == MarrowRoute.SETTINGS || route == MarrowRoute.THEME) {
            bottomNavigation?.visibility = View.GONE
            return
        }
        bottomNavigation?.visibility = View.VISIBLE
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
                isSelected = id == selected
                setTextColor(if (id == selected) getColor(R.color.marrow_primary) else getColor(R.color.marrow_muted))
                alpha = if (id == selected) 1f else 0.72f
            }
        }
    }

    private fun replace(v: View) { content.removeAllViews(); content.addView(v) }
    private fun showHome() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)
        replace(v)

        v.findViewById<View>(R.id.homeMenu).setOnClickListener {
            showHomeMenu(v.findViewById(R.id.homeMenu))
        }
        v.findViewById<ImageButton>(R.id.homeSearch).setOnClickListener {
            state.navigate(MarrowRoute.SEARCH)
            showSearch()
        }
        v.findViewById<ImageButton>(R.id.homeBookmark).setOnClickListener {
            state.navigate(MarrowRoute.BOOKMARKS)
            showBookmarks()
        }

        // HomePageItems is a native server configuration in the recovered APK.
        // Do not synthesize missing config/payloads. Each surface is exposed only
        // when this reconstruction has the corresponding verified local source.
        val total = state.contentRegistry.allQuestions().size
        val attempted = state.contentRegistry.allQuestions().keys.count { id ->
            state.session.answers[id]?.selectedAnswer != null ||
                state.session.answers[id]?.skipped == true
        }
        val localModule = state.contentRegistry.moduleIds().firstOrNull { moduleId ->
            state.contentRegistry.questionIds(moduleId).any { id ->
                state.session.answers[id]?.selectedAnswer != null ||
                    state.session.answers[id]?.skipped == true
            }
        } ?: state.contentRegistry.moduleIds().firstOrNull()
        val localModuleCount = localModule?.let { state.contentRegistry.questionIds(it).size } ?: 0
        val localModuleTitle = localModule?.substringAfter('/').orEmpty()
        val localModuleSubject = localModule?.substringBefore('/').orEmpty()
        val localModuleAttempted = localModule?.let { moduleId ->
            state.contentRegistry.questionIds(moduleId).count { id ->
                state.session.answers[id]?.selectedAnswer != null ||
                    state.session.answers[id]?.skipped == true
            }
        } ?: 0
        // Only render Home surfaces backed by verified local payloads. The recovered APK's\n        // remaining Home cards are server-configured; showing empty placeholders would create\n        // a fabricated/prototype UI, so their cards and section headers stay hidden offline.\n        listOf(\n            R.id.homeZenSectionTitle, R.id.layoutDynamicZenArea,\n            R.id.homeFeatureSectionTitle, R.id.homeFeatureCards,\n            R.id.homeTestSectionTitle, R.id.llTest,\n            R.id.homeVideoSectionTitle, R.id.llVideo,\n            R.id.homeRecentSectionTitle, R.id.cvRecentUpdate,\n            R.id.renewPlanBanner, R.id.cvMagicModule\n        ).forEach { id -> v.findViewById<View>(id).visibility = View.GONE }\n\n        v.findViewById<TextView>(R.id.homeQBankSummary).text =
            if (localModule.isNullOrBlank()) {
                "QBank shell ready · local question content is not bundled"
            } else {
                val title = localModuleTitle.ifBlank { localModule }
                val subject = localModuleSubject.ifBlank { "Edition 8" }
                "$subject · $title · $localModuleCount MCQs · $localModuleAttempted attempted"
            }

        v.findViewById<View>(R.id.llQbank).setOnClickListener {
            state.navigate(MarrowRoute.QBANK)
            showQBank()
        }

        // Pearls has an actual checked-in source asset, so this surface can be
        // rendered without inventing server data.
        val pearlCount = runCatching { PearlsAssetLoader(assets).load().size }.getOrDefault(0)
        v.findViewById<TextView>(R.id.homePearlsSummary).text =
            if (pearlCount > 0) "$pearlCount Pearls" else ""
        v.findViewById<View>(R.id.cvPearl).setOnClickListener {
            state.navigate(MarrowRoute.PEARLS)
            showPearls()
        }

        // fragment_home contains an explicit llShare surface. The exact native
        // share payload is unavailable offline, so this preserves only the
        // verified share action without inventing a referral/account payload.
        v.findViewById<View>(R.id.llShare).setOnClickListener {
            shareCurrentRoute()
        }

        // GO PRO is account/subscription backed as well. Do not expose a
        // purchase/account action without verified subscription state.
        v.findViewById<Button>(R.id.homeGoPro).visibility = View.GONE
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
 val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank_search,content,false);replace(v)
 val input=v.findViewById<EditText>(R.id.qbankSearchInput);val results=v.findViewById<LinearLayout>(R.id.qbankSearchResults);val st=v.findViewById<TextView>(R.id.qbankSearchState)
 fun renderSearch(){results.removeAllViews();val query=input.text.toString().trim();if(query.isBlank()){st.text="Search questions, explanations or tags in loaded QBank content.";return};val matches=state.contentRegistry.search(query);st.text=if(matches.isEmpty())"No matches in loaded content." else "Matches: "+matches.size;matches.take(100).forEachIndexed{index,q->val module=state.contentRegistry.findModuleForQuestion(q.id).orEmpty();results.addView(Button(this).apply{text=(index+1).toString()+". "+q.text+"\n\n"+module;isAllCaps=false;setOnClickListener{if(module.isNotBlank()){val ids=state.contentRegistry.questionIds(module);state.selectModule(module,ids);state.moveQuestion(ids.indexOf(q.id).coerceAtLeast(0));state.navigate(MarrowRoute.QBANK_PLAY);showPlayer()}}})}}
 val h=Handler(Looper.getMainLooper());var p:Runnable?=null;input.addTextChangedListener(object:android.text.TextWatcher{override fun beforeTextChanged(s:CharSequence?,start:Int,count:Int,after:Int)=Unit;override fun onTextChanged(s:CharSequence?,start:Int,before:Int,count:Int){p?.let(h::removeCallbacks);p=Runnable{renderSearch()}.also{h.postDelayed(it,500L)}};override fun afterTextChanged(s:android.text.Editable?)=Unit})
 v.findViewById<Button>(R.id.qbankSearchButton).setOnClickListener{renderSearch()};renderSearch()
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
        val v=LayoutInflater.from(this).inflate(R.layout.screen_schema,content,false);replace(v)
        v.findViewById<TextView>(R.id.schemaState).text="Recovered native Schema flow: Listing → Detail → Review. Live schema payload is not present in the local content registry."
        v.findViewById<LinearLayout>(R.id.schemaActions).addView(Button(this).apply{text="OPEN SCHEMA DETAIL";isAllCaps=false;setOnClickListener{selectedSchemaTitle="Schema";state.navigate(MarrowRoute.SCHEMA_DETAIL);showSchemaDetail()}})
        v.findViewById<Button>(R.id.schemaBack).setOnClickListener{state.navigate(MarrowRoute.QBANK);showQBank()}
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
            MarrowRoute.PYQ -> "Recovered QBank/PYQ surface is present in the APK inventory; local PYQ-tagged content is shown only when verified in the content registry."
            MarrowRoute.SCHEMA, MarrowRoute.SCHEMA_DETAIL, MarrowRoute.SCHEMA_REVIEW ->
                "Recovered Schema resources and ViewModels are wired through the local navigation surface; live schema payload remains server-backed."
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
        val pearls = runCatching { PearlsAssetLoader(assets).load() }.getOrDefault(emptyList())

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
        val v=LayoutInflater.from(this).inflate(R.layout.screen_bookmarks,content,false); replace(v)
        val list=v.findViewById<LinearLayout>(R.id.bookmarkList); val status=v.findViewById<TextView>(R.id.bookmarkState)
        fun render(allContent:Boolean){
            list.removeAllViews()
            val pairs=if(allContent) state.contentRegistry.moduleIds().flatMap{module->state.contentRegistry.questionIds(module).filter{id->state.session.answers[id]?.isStarred==true}.map{module to it}} else BookmarkNavigationModel.ids(state).map{(state.session.moduleId?:"") to it}
            status.text=if(allContent) "All loaded bookmarks · "+pairs.size else "Current module bookmarks · "+pairs.size
            if(pairs.isEmpty()){list.addView(TextView(this).apply{text="No bookmarked questions.";textSize=15f;setPadding(8,18,8,18);setTextColor(getColor(R.color.marrow_muted))});return}
            pairs.forEachIndexed{index,pair->
                val module=pair.first;val id=pair.second;val q=state.contentRegistry.question(module,id)
                val row=LinearLayout(this).apply{orientation=LinearLayout.VERTICAL;setPadding(14,12,14,12);setBackgroundColor(getColor(R.color.marrow_surface))}
                row.addView(TextView(this).apply{text=(index+1).toString()+". "+(q?.text?:"Question "+(index+1));textSize=16f})
                row.addView(TextView(this).apply{text=module;textSize=12f;setTextColor(getColor(R.color.marrow_muted));setPadding(0,5,0,8)})
                row.addView(Button(this).apply{text="OPEN";setOnClickListener{val ids=state.contentRegistry.questionIds(module);state.selectModule(module,ids);state.moveQuestion(ids.indexOf(id).coerceAtLeast(0));state.navigate(MarrowRoute.QBANK_PLAY);showPlayer()}})
                row.addView(Button(this).apply{text="REMOVE BOOKMARK";setOnClickListener{QBankSession(state).toggleBookmark(id);render(allContent)}})
                list.addView(row);addDivider(list)
            }
        }
        v.findViewById<Button>(R.id.bookmarkQuestionsTab).setOnClickListener{render(true)}
        v.findViewById<Button>(R.id.bookmarkAllTab).setOnClickListener{render(true)}
        v.findViewById<Button>(R.id.bookmarkCurrentTab).setOnClickListener{render(false)}
        v.findViewById<Button>(R.id.bookmarkVideoTab).setOnClickListener{showAccountActionState("Bookmarked Videos","The recovered APK exposes a dedicated bookmark-video surface. No verified local video bookmark payload is bundled.")}
        v.findViewById<Button>(R.id.bookmarkTimelineTab).setOnClickListener{showAccountActionState("Bookmark Timeline","The recovered APK exposes a bookmark timeline surface. Its remote timeline payload is unavailable locally.")}
        render(true)
    }

    private fun verifiedQBankSubjects(): List<String> {
        // The recovered QBank landing surface is data-driven. Preserve the
        // subject order emitted by the verified Edition 8 content registry
        // instead of imposing an alphabetical UI order.
        val fromSource = state.contentRegistry.moduleIds()
            .asSequence()
            .map { it.substringBefore('/') }
            .filter { it.isNotBlank() }
            .distinct()
            .toList()
        // The subject catalogue is source-backed, but question/module payloads
        // are intentionally not bundled in the current build.
        return if (fromSource.isNotEmpty()) fromSource else subjects
    }

    private fun showQBank() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        replace(v)

        val tracker = v.findViewById<TextView>(R.id.qbankTracker)
        val metrics = QBankMetrics.from(state.session.mcqIds, state.session.answers)
        val emptyNotice = v.findViewById<TextView>(R.id.qbankEmptyNotice)
        emptyNotice?.apply {
            visibility = if (state.contentRegistry.allQuestions().isEmpty()) View.VISIBLE else View.GONE
            text = "Question content is not bundled in this build. Native QBank navigation and UI remain available."
        }
        tracker.text = if (metrics.total == 0) {
            "QBank tracker   ·   Select a subject to begin"
        } else {
            "QBank tracker   ·   ${metrics.attempted}/${metrics.total} attempted   ·   ${String.format("%.1f", metrics.accuracy)}% accuracy"
        }
        tracker.setOnClickListener {
            state.navigate(MarrowRoute.QBANK_TRACKER)
            showQBankTracker()
        }

        v.findViewById<Button>(R.id.qbankSearchAction).setOnClickListener {
            state.navigate(MarrowRoute.SEARCH)
            showSearch()
        }
        v.findViewById<Button>(R.id.qbankBookmarkAction).setOnClickListener {
            state.navigate(MarrowRoute.BOOKMARKS)
            showBookmarks()
        }
        v.findViewById<Button>(R.id.qbankCustomAction).setOnClickListener {
            customStage = 0
            state.navigate(MarrowRoute.CUSTOM_MODULE)
            showCustom()
        }

        val subjectsContainer = v.findViewById<LinearLayout>(R.id.subjectContainer)
        val extraContainer = v.findViewById<LinearLayout>(R.id.qbankExtraSurfaces)

        fun sourceCard(container: LinearLayout, label: String, detail: String, action: () -> Unit) {
            container.addView(LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(14, 12, 14, 12)
                setBackgroundColor(getColor(R.color.marrow_surface))
                setOnClickListener { action() }
                addView(TextView(this@MainActivity).apply {
                    text = label
                    textSize = 16f
                    setTypeface(typeface, Typeface.BOLD)
                    setTextColor(getColor(R.color.marrow_text))
                })
                addView(TextView(this@MainActivity).apply {
                    text = detail
                    textSize = 13f
                    setPadding(0, 4, 0, 0)
                    setTextColor(getColor(R.color.marrow_muted))
                })
            })
            addDivider(container)
        }

        verifiedQBankSubjects().forEach { s ->
            val moduleIds = state.contentRegistry.moduleIds().filter { it.startsWith("$s/") || it == s }
            val questionCount = moduleIds.sumOf { state.contentRegistry.questionIds(it).size }
            val row = LinearLayout(this).apply {
                orientation = LinearLayout.HORIZONTAL
                setPadding(14, 12, 14, 12)
                gravity = android.view.Gravity.CENTER_VERTICAL
                setBackgroundColor(getColor(R.color.marrow_surface))
                setOnClickListener {
                    qbank.openSubject(s)
                    state.navigate(MarrowRoute.QBANK_MODULE)
                    showLessons(s)
                }
            }
            row.addView(ImageView(this).apply {
                layoutParams = LinearLayout.LayoutParams(52, 52).apply { marginEnd = 12 }
                setImageResource(R.drawable.ic_qbank_header)
                scaleType = ImageView.ScaleType.CENTER_INSIDE
                contentDescription = "Question Bank"
            })
            row.addView(LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
                addView(TextView(this@MainActivity).apply {
                    text = s
                    textSize = 17f
                    setTypeface(typeface, Typeface.BOLD)
                    setTextColor(getColor(R.color.marrow_text))
                })
                addView(TextView(this@MainActivity).apply {
                    text = "${moduleIds.size} modules  ·  ${questionCount} questions"
                    textSize = 13f
                    setPadding(0, 5, 0, 0)
                    setTextColor(getColor(R.color.marrow_muted))
                })
            })
            subjectsContainer.addView(row)
            addDivider(subjectsContainer)
        }

        sourceCard(extraContainer, "Previous Year Question Papers", "Recovered PYQ surface; local PYQ content is shown only when verified") {
            state.navigate(MarrowRoute.PYQ)
            showPyq()
        }
        sourceCard(extraContainer, "Schema", "Recovered schema navigation; live payload remains server-backed") {
            state.navigate(MarrowRoute.SCHEMA)
            showSchemaList()
        }
        sourceCard(extraContainer, "QBank Manifesto", "Recovered QBank surface; live payload is not bundled locally") {
            AlertDialog.Builder(this)
                .setTitle("QBank Manifesto")
                .setMessage("The recovered app exposes a QBank Manifesto surface. Its live/account-backed payload is not present in the local reconstruction, so no manifesto text is fabricated.")
                .setPositiveButton("OK", null)
                .show()
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
        val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank_tracker,content,false); replace(v)
        val m=QBankMetrics.from(state.session.mcqIds,state.session.answers); val sum=v.findViewById<LinearLayout>(R.id.qbankTrackerSummary)
        listOf("Total questions" to m.total,"Attempted" to m.attempted,"Correct" to m.correct,"Wrong" to m.wrong,"Skipped" to m.skipped,"Bookmarked" to m.bookmarked).forEach{(l,x)->sum.addView(TextView(this).apply{text="$l    $x";textSize=15f;setPadding(4,7,4,7)})}
        sum.addView(TextView(this).apply{text="Accuracy    "+String.format("%.1f",m.accuracy)+"%";textSize=17f;setTypeface(typeface,Typeface.BOLD);setPadding(4,9,4,4)})
        val root=v.findViewById<LinearLayout>(R.id.qbankTrackerSubjects)
        verifiedQBankSubjects().forEach{subject->val ms=state.contentRegistry.moduleIds().filter{it.startsWith("$subject/")||it==subject};val total=ms.sumOf{state.contentRegistry.questionIds(it).size};val answered=ms.sumOf{mod->state.contentRegistry.questionIds(mod).count{state.session.answers[it]?.selectedAnswer!=null||state.session.answers[it]?.skipped==true}};val pct=if(total==0)0 else answered*100/total;root.addView(TextView(this).apply{text="$subject    $answered/$total   ·   $pct%";textSize=14f;setPadding(8,9,8,9)})}
        v.findViewById<Button>(R.id.qbankTrackerBack).setOnClickListener{state.navigate(MarrowRoute.QBANK);showQBank()}
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
                        state.selectSubject(subject)
                        state.selectModule(moduleId, ids)
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
        v.findViewById<LinearLayout>(R.id.lessonFilterTabs).addView(tabs)
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
            text = moduleId.removePrefix("$subject/")
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
                text = "Schema"
                textSize = 13f
                setTextColor(getColor(R.color.marrow_muted))
                setPadding(0, 5, 0, 12)
            })
            addView(Button(this@MainActivity).apply {
                text = "OPEN SCHEMA"
                isAllCaps = false
                setOnClickListener {
                    state.navigate(MarrowRoute.SCHEMA)
                    showSchemaList()
                }
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
        val timerVisible = state.session.qbank.timerEnabled &&
            state.session.qbank.timerEndAtMs != null &&
            question != null &&
            state.session.answers[question.id]?.locked != true
        timerView.visibility = if (timerVisible) View.VISIBLE else View.GONE
        if (timerVisible) {
            val endAt = state.session.qbank.timerEndAtMs ?: return
            val remainingNow = (endAt - System.currentTimeMillis()).coerceAtLeast(0L)
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
                explanationMedia.visibility = if (question.explanationImages.isNotEmpty()) View.VISIBLE else View.GONE            } else {
                explanation.visibility = View.GONE
                v.findViewById<LinearLayout>(R.id.explanationMedia).visibility = View.GONE            }
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
        var renderReview: (ReviewFilter) -> Unit = {}
        val filterRow = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(0, 0, 0, 8)
        }
        listOf(
            ReviewFilter.ALL to "ALL",
            ReviewFilter.BOOKMARKED to "BOOKMARKED",
            ReviewFilter.CHANGED_BY_YOU to "CHANGED",
            ReviewFilter.CORRECT to "CORRECT",
            ReviewFilter.GUESS_CORRECT to "GUESS CORRECT",
            ReviewFilter.GUESS_WRONG to "GUESS WRONG",
            ReviewFilter.SILLY_MISTAKES to "SILLY",
            ReviewFilter.SKIPPED to "SKIPPED",
            ReviewFilter.WRONG to "WRONG",
            ReviewFilter.SCHEMA_MCQS to "SCHEMA",
            ReviewFilter.NEW_REVISED to "NEW/REVISED"
        ).forEach { (filter, label) ->
            filterRow.addView(Button(this).apply {
                text = label
                isAllCaps = false
                minWidth = 0
                setPadding(16, 0, 16, 0)
                setOnClickListener { renderReview(filter) }
            })
        }
        root.addView(HorizontalScrollView(this).apply {
            isHorizontalScrollBarEnabled = false
            addView(filterRow)
        })
        val answerToggle = CheckBox(this).apply {
            text = "Show answer / explanation"
            isChecked = false
            setOnCheckedChangeListener { _, checked ->
                showAnswer = checked
                renderReview(activeFilter)
            }
        }
        root.addView(answerToggle)
        val list = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        root.addView(list)

        renderReview = { filter ->
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
            } else ids.forEachIndexed { index, id ->
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
                    text = q?.text ?: "No supplied question payload is loaded."
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

        renderReview(ReviewFilter.ALL)

        root.addView(Button(this).apply {
            text = "BACK TO SCORE"
            setOnClickListener {
                qbank.openScore()
                showScore()
            }
        })
        renderReview(activeFilter)
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
                val v = LayoutInflater.from(this).inflate(R.layout.screen_tests, content, false)
                replace(v)
                // Recovered APK categories: Grand Tests, Mini Tests, Subject Tests, All Tests.
                val tabs = listOf(
                    R.id.testGrandTab to "Grand Tests",
                    R.id.testMiniTab to "Mini Tests",
                    R.id.testSubjectTab to "Subject Tests",
                    R.id.testSubjectFilterTab to "All Tests"
                )
                tabs.forEach { (id, label) ->
                    v.findViewById<Button>(id).setOnClickListener {
                        tests.selectConfiguredTab(label)
                        v.findViewById<TextView>(R.id.testYear).text = "Test Series"
                        v.findViewById<TextView>(R.id.testPayloadState).text =
                            "Selected: $label · live schedule/payload remains server-backed and is not fabricated."
                    }
                }
                v.findViewById<TextView>(R.id.testYear).text = "Test Series"
                v.findViewById<Button>(R.id.testStart).setOnClickListener {
                    tests.openIntro("source-test")
                    showTests()
                }
                v.findViewById<Button>(R.id.testAnalytics).setOnClickListener {
                    state.navigate(MarrowRoute.GT_ANALYTICS)
                    showGTAnalytics()
                }
                v.findViewById<Button>(R.id.testReview).setOnClickListener {
                    tests.openAnalytics()
                    showTests()
                }
                v.findViewById<View>(R.id.testMonthRow).setOnClickListener {
                    showAccountActionState("This Month", "The native Test surface exposes a monthly schedule row. The actual schedule is account/server-backed and is not fabricated.")
                }
                v.findViewById<View>(R.id.testPreviousYearRow).setOnClickListener {
                    showAccountActionState("Previous Year", "The native Test surface exposes previous-year/archive navigation. No unverified archive payload is fabricated.")
                }
            }
        }
    }

    private fun showTestIntro() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_test_intro, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.testIntroPayload).text = "No verified test payload is attached to the current C content layer."
        v.findViewById<Button>(R.id.testIntroBack).setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
    }

    private fun showTestPlay() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_test_play, content, false)
        replace(v)
        val ids = state.test.mcqIds
        val index = state.test.currentIndex
        val q = if (index in ids.indices) state.contentRegistry.question(ids[index]) else null
        state.startTestTimer()
        v.findViewById<TextView>(R.id.testPlayPosition).text = "Test · ${index + 1} / ${ids.size}"
        val remaining = state.test.remainingTimeMs
        v.findViewById<TextView>(R.id.testPlayTimer).text = if (remaining != null) "Time remaining: " + ((remaining + 999L) / 1000L) + "s" else ""
        v.findViewById<TextView>(R.id.testPlayQuestion).text = q?.text ?: "No supplied test MCQ payload is loaded."
        val stateView = v.findViewById<TextView>(R.id.testPlayState)
        val actions = v.findViewById<LinearLayout>(R.id.testPlayActions)
        val options = v.findViewById<LinearLayout>(R.id.testPlayOptions)
        val nav = v.findViewById<LinearLayout>(R.id.testPlayNav)
        actions.removeAllViews(); options.removeAllViews(); nav.removeAllViews()
        if (q != null) {
            val existing = state.test.answers[q.id]
            stateView.text = when { state.test.timedOut -> "Timed out"; existing?.locked == true -> "Answer locked"; else -> "Select an option" }
            actions.addView(Button(this).apply { text = if (existing?.isGuessed == true) "GUESSED" else "MARK GUESSED"; isAllCaps=false; setOnClickListener { TestSession(state).markGuessed(q.id, existing?.isGuessed != true); showTestPlay() } }, LinearLayout.LayoutParams(0,-2,1f))
            actions.addView(Button(this).apply { text = if (existing?.isStarred == true) "★ BOOKMARKED" else "☆ BOOKMARK"; isAllCaps=false; setOnClickListener { TestSession(state).toggleBookmark(q.id); showTestPlay() } }, LinearLayout.LayoutParams(0,-2,1f))
            q.choices.forEach { choice -> options.addView(Button(this).apply { text=choice.text; isAllCaps=false; isEnabled=!state.test.timedOut; if(existing?.locked==true){ when { choice.id==q.correctChoiceId->{setBackgroundColor(0xFF2E7D32.toInt());setTextColor(0xFFFFFFFF.toInt())}; choice.id==existing.selectedAnswer->{setBackgroundColor(0xFFC62828.toInt());setTextColor(0xFFFFFFFF.toInt())} } }; setOnClickListener{TestSession(state).answer(q.id,choice.id,q.correctChoiceId);showTestPlay()} }) }
            if(existing?.locked==true && q.solution.isNotBlank()) options.addView(TextView(this).apply{text="Explanation\n\n"+q.solution;textSize=14f;setPadding(8,16,8,16)})
        } else stateView.text="No verified local question payload."
        nav.addView(Button(this).apply{text="PREVIOUS";isAllCaps=false;isEnabled=index>0;setOnClickListener{if(index>0){state.moveTestQuestion(index-1);showTestPlay()}}},LinearLayout.LayoutParams(0,-2,1f))
        val navStatus=state.test.navigationButtonStatus
        nav.addView(Button(this).apply{text=if(navStatus==NavigationButtonStatus.COMPLETE)"SUBMIT" else "NEXT";isAllCaps=false;setOnClickListener{if(navStatus==NavigationButtonStatus.COMPLETE){state.confirmTestSubmission();tests.openScore();showTests()}else{state.moveTestQuestion(index+1);showTestPlay()}}},LinearLayout.LayoutParams(0,-2,1f))
        (v.findViewById<LinearLayout>(R.id.testPlayRoot)).addView(Button(this).apply{text="SKIP";isAllCaps=false;isEnabled=!state.test.timedOut;setOnClickListener{q?.let{TestSession(state).skip(it.id)};if(index+1<ids.size){state.moveTestQuestion(index+1);showTestPlay()}else{state.confirmTestSubmission();tests.openScore();showTests()}}})
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
        box.addView(Button(this).apply {            text = "BACK TO TESTS"
            setOnClickListener { state.navigate(MarrowRoute.TESTS); showTests() }
        })
        replace(ScrollView(this).apply { addView(box) })    }

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
        when(state.session.route){MarrowRoute.VIDEO_SUBJECT->showVideoLessons();MarrowRoute.VIDEO_PLAYER->showVideoPlayer();else->{val v=LayoutInflater.from(this).inflate(R.layout.screen_videos,content,false);replace(v);v.findViewById<Button>(R.id.videoDownloaded).setOnClickListener{showVideoInfo("Downloaded Videos","The recovered APK exposes a downloaded-video surface. No verified downloaded payload is bundled locally.")};v.findViewById<Button>(R.id.videoSample).setOnClickListener{showVideoInfo("Sample Videos","The recovered APK exposes a sample-video surface. No verified sample payload is bundled locally.")};v.findViewById<Button>(R.id.videoRevision).setOnClickListener{showVideoInfo("World of Revision","The recovered APK exposes revision-video navigation. Remote lesson payload is not fabricated locally.")};v.findViewById<Button>(R.id.videoNotes).setOnClickListener{showVideoInfo("Video Notes","The recovered APK exposes a video-notes surface. Remote note payload is not fabricated locally.")};v.findViewById<Button>(R.id.videoSubjects).setOnClickListener{state.navigate(MarrowRoute.VIDEO_SUBJECT);showVideoLessons()}}}
    }

    private fun showVideoLessons() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        root.addView(TextView(this).apply {
            text = "Video Subjects"
            textSize = 22f
            setTypeface(typeface, Typeface.BOLD)
        })
        root.addView(TextView(this).apply {
            text = "The recovered native app exposes a video-subject landing surface, but the subject/lesson payload is server-backed. The Edition 8 QBank subject list is not reused here."
            textSize = 14f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(4, 14, 4, 18)
        })
        root.addView(Button(this).apply {
            text = "BACK TO VIDEOS"
            isAllCaps = false
            setOnClickListener {
                state.navigate(MarrowRoute.VIDEOS)
                showVideos()
            }
        })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun renderVideoSubjects(container: LinearLayout, filter: String) {
        container.removeAllViews()
        container.addView(TextView(this).apply {
            text = "No verified local video subject payload is bundled."
            textSize = 14f
            setTextColor(getColor(R.color.marrow_muted))
            setPadding(4, 12, 4, 12)
        })
    }

    private fun showVideoPlayer() {
        val v = LayoutInflater.from(this).inflate(R.layout.screen_video_player, content, false)
        replace(v)
        v.findViewById<TextView>(R.id.videoPlayerSubject).text = "Subject: " + selectedVideoSubject
        val stateView=v.findViewById<TextView>(R.id.videoPlayerState)
        stateView.text="No verified local stream/file is bundled, so playback is not faked."
        val speedRow=v.findViewById<LinearLayout>(R.id.videoSpeedRow)
        listOf("0.75×","1.0×","1.25×","1.5×","2.0×").forEach{s->
            speedRow.addView(Button(this).apply{text=s;isAllCaps=false;setOnClickListener{stateView.text="No verified local stream/file is bundled. Playback speed: "+s}},LinearLayout.LayoutParams(0,-2,1f))
        }
        val brightness=v.findViewById<SeekBar>(R.id.videoBrightness)
        brightness.max=100
        brightness.progress=((window.attributes.screenBrightness.takeIf{it>=0f}?:0.5f)*100f).toInt()
        brightness.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(b:SeekBar?,value:Int,fromUser:Boolean){if(fromUser){val p=window.attributes;p.screenBrightness=value.coerceIn(1,100)/100f;window.attributes=p}}
            override fun onStartTrackingTouch(b:SeekBar?){}
            override fun onStopTrackingTouch(b:SeekBar?){}
        })
        v.findViewById<Button>(R.id.videoPlayerBack).setOnClickListener{state.navigate(MarrowRoute.VIDEO_SUBJECT);showVideoLessons()}
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
        val stages=listOf("Mode","Subjects","Topics","Tags","Add-ons","Creation","Join by Code","Play","Score")
        fun go(stage: Int) {
            customStage = stage
            state.navigate(
                when (stage) {
                    0 -> MarrowRoute.CUSTOM_MODE
                    1 -> MarrowRoute.CUSTOM_SUBJECTS
                    2 -> MarrowRoute.CUSTOM_TOPICS
                    3 -> MarrowRoute.CUSTOM_TAGS
                    4 -> MarrowRoute.CUSTOM_ADDONS
                    5 -> MarrowRoute.CUSTOM_CREATION
                    6 -> MarrowRoute.CUSTOM_JOIN
                    7 -> MarrowRoute.CUSTOM_PLAY
                    8 -> MarrowRoute.CUSTOM_SCORE
                    else -> MarrowRoute.CUSTOM_MODULE
                }
            )
            showCustom()
        }
        root.addView(TextView(this).apply { text="Custom Module"; textSize=24f; setTypeface(typeface,Typeface.BOLD) })
        root.addView(TextView(this).apply {
            text="Step " + (customStage+1) + "/" + stages.size + ": " + stages[customStage]
            setPadding(4,14,4,14)
        })
        when(customStage) {
            0 -> root.addView(Button(this).apply { text="QBank mode"; setOnClickListener { go(1) } })
            1 -> subjects.forEach { s ->
                root.addView(Button(this).apply { text=s; setOnClickListener { customSubject=s; go(2) } })
            }
            2 -> {
                val modules=state.contentRegistry.moduleIds().filter { it.contains(customSubject,true) }
                if(modules.isEmpty()) root.addView(TextView(this).apply { text="No verified local topic payload for $customSubject."; setPadding(4,12,4,12) })
                modules.take(30).forEach { moduleId ->
                    root.addView(Button(this).apply { text=moduleId; setOnClickListener { customTopic=moduleId; go(3) } })
                }
            }
            3 -> {
                val input=EditText(this).apply { hint="Tags (optional)" }
                root.addView(input)
                root.addView(Button(this).apply { text="CONTINUE"; setOnClickListener { customTags=input.text.toString(); go(4) } })
            }
            4 -> root.addView(Button(this).apply { text="USE DEFAULT ADD-ONS"; setOnClickListener { go(5) } })
            5 -> {
                root.addView(TextView(this).apply {
                    text="Creation summary\n\nMode: QBank\nSubject: ${if(customSubject.isBlank()) "Not selected" else customSubject}\nTopic: ${if(customTopic.isBlank()) "Not selected" else customTopic}\nTags: ${if(customTags.isBlank()) "None supplied" else customTags}\nAdd-ons: Default"
                    setPadding(4,12,4,16)
                })
                root.addView(TextView(this).apply {
                    text="The recovered APK uses a server-backed Magic Module creation flow. No verified local creation response/module ID is available here, so generation is not fabricated."
                    setPadding(4,4,4,16)
                })
                root.addView(Button(this).apply { text="CONTINUE TO JOIN"; setOnClickListener { go(6) } })
            }
            6 -> {
                val code=EditText(this).apply { hint="Join code" }
                root.addView(code)
                root.addView(Button(this).apply {
                    text="JOIN"
                    setOnClickListener { Toast.makeText(this@MainActivity,"Join-by-code requires the original server endpoint; no fake join result is created.",Toast.LENGTH_SHORT).show() }
                })
                root.addView(Button(this).apply { text="SKIP"; setOnClickListener { go(7) } })
            }
            7 -> {
                root.addView(TextView(this).apply { text="Generated module payload is server-backed. Local verified QBank content remains available."; setPadding(4,12,4,12) })
                root.addView(Button(this).apply { text="OPEN QBANK"; setOnClickListener { state.navigate(MarrowRoute.QBANK); showQBank() } })
                root.addView(Button(this).apply { text="SCORE"; setOnClickListener { go(8) } })
            }
            else -> {
                root.addView(TextView(this).apply { text="Score uses only locally loaded QBank answers. Server score/rank data is not fabricated."; setPadding(4,12,4,12) })
                root.addView(Button(this).apply {
                    text="RESET"
                    setOnClickListener { customStage=0; customSubject=""; customTopic=""; customTags=""; go(0) }
                })
            }
        }
        root.addView(Button(this).apply {
            text="BACK"
            setOnClickListener { if(customStage>0){ customStage--; showCustom() } else { state.navigate(MarrowRoute.QBANK); showQBank() } }
        })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showProfile() {
        val v=LayoutInflater.from(this).inflate(R.layout.screen_profile,content,false);replace(v)
        v.findViewById<Button>(R.id.profileEdit).setOnClickListener{showProfileEdit()}
        v.findViewById<Button>(R.id.profilePassword).setOnClickListener{showAccountActionState("Change Password","The recovered Profile Landing flow exposes a change-password action. The update response is account/server-backed.")}
        v.findViewById<Button>(R.id.profileKyc).setOnClickListener{showAccountActionState("KYC","The recovered Profile Landing flow exposes KYC navigation. KYC document/name/upload states are server/account-backed.")}
        v.findViewById<Button>(R.id.profileSettings).setOnClickListener{state.navigate(MarrowRoute.SETTINGS);showSettings()}
        v.findViewById<Button>(R.id.profileBack).setOnClickListener{state.navigate(MarrowRoute.HOME);showHome()}
    }

    private fun showAccountActionState(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()
    }

    private fun showProfileEdit() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 20, 20, 20)
        }
        root.addView(TextView(this).apply {
            text = "Edit Profile"
            textSize = 24f
            setTypeface(typeface, Typeface.BOLD)
        })
        root.addView(TextView(this).apply {
            text = "The recovered APK has a dedicated profile-edit/update surface. Account profile data and the remote update response are not bundled locally, so editable identity values are not fabricated."
            setPadding(4, 18, 4, 20)
        })
        root.addView(Button(this).apply {
            text = "BACK TO PROFILE"
            setOnClickListener { state.navigate(MarrowRoute.PROFILE); showProfile() }
        })
        replace(ScrollView(this).apply { addView(root) })
    }

    private fun showSettings() {
        val v=LayoutInflater.from(this).inflate(R.layout.screen_settings,content,false);replace(v)
        val prefs=getSharedPreferences("marrow_preferences",MODE_PRIVATE);val vibration=v.findViewById<Button>(R.id.settingsVibration)
        fun refresh(){vibration.text=if(prefs.getBoolean("vibration_enabled",false))"VIBRATION: ON" else "VIBRATION: OFF"}
        refresh()
        v.findViewById<Button>(R.id.settingsTheme).setOnClickListener{state.navigate(MarrowRoute.THEME);showTheme()}
        vibration.setOnClickListener{prefs.edit().putBoolean("vibration_enabled",!prefs.getBoolean("vibration_enabled",false)).apply();refresh()}
        v.findViewById<Button>(R.id.settingsProfile).setOnClickListener{state.navigate(MarrowRoute.PROFILE);showProfile()}
        v.findViewById<Button>(R.id.settingsBack).setOnClickListener{state.navigate(MarrowRoute.PROFILE);showProfile()}
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
        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        val panel = findViewById<View>(R.id.homeDrawer)
        if (drawer == null || panel == null) return

        fun closeAnd(action: () -> Unit) {
            drawer.closeDrawer(panel)
            action()
        }
        findViewById<TextView>(R.id.drawerSearch).setOnClickListener { closeAnd { state.navigate(MarrowRoute.SEARCH); showSearch() } }
        findViewById<TextView>(R.id.drawerBookmarks).setOnClickListener { closeAnd { state.navigate(MarrowRoute.BOOKMARKS); showBookmarks() } }
        findViewById<TextView>(R.id.drawerCustom).setOnClickListener { closeAnd { customStage = 0; state.navigate(MarrowRoute.CUSTOM_MODULE); showCustom() } }
        findViewById<TextView>(R.id.drawerProfile).setOnClickListener { closeAnd { state.navigate(MarrowRoute.PROFILE); showProfile() } }
        findViewById<TextView>(R.id.drawerSettings).setOnClickListener { closeAnd { state.navigate(MarrowRoute.SETTINGS); showSettings() } }
        drawer.openDrawer(panel)
    }

    private fun showTheme() {
        val v=LayoutInflater.from(this).inflate(R.layout.screen_theme,content,false);replace(v)
        val dark=MarrowTheme.isDark(this);v.findViewById<TextView>(R.id.themeState).text="Current theme: "+if(dark)"Dark" else "Light"
        v.findViewById<Button>(R.id.themeLight).isEnabled=dark;v.findViewById<Button>(R.id.themeDark).isEnabled=!dark
        v.findViewById<Button>(R.id.themeLight).setOnClickListener{setDarkTheme(false)}
        v.findViewById<Button>(R.id.themeDark).setOnClickListener{setDarkTheme(true)}
        v.findViewById<Button>(R.id.themeBack).setOnClickListener{state.navigate(MarrowRoute.SETTINGS);showSettings()}
    }

    private fun addDivider(c: LinearLayout) {
        c.addView(View(this).apply { setBackgroundColor(0xFFE6E6E6.toInt()) }, LinearLayout.LayoutParams(-1,1))
    }
}
