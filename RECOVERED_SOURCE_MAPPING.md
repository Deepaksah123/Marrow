# Marrow reconstruction — recovered source → current implementation mapping

Updated: 2026-10-05 (Home source reconciliation)

## Evidence rule

The recovered APK tree under `recovery/base_apk_Decompiler.com/` is the authoritative reconstruction source. Screenshots are QA/reference only.

## Recovery inventory verified in repository

- Recovered tree entries: 28,297
- Decompiled UI source files under `com/marrow2/ui`: 233
- Relevant recovered layout resources: 155
- Original APK inventory previously verified: 5,128 ZIP entries
- Original APK SHA-256: `e03a582c20eec102510509918315be53e45bb9fe90647207b2c956a0f55316a3`

## Surface mapping

| Original recovered surface | Recovered behavioral source | Current reconstruction | Status |
|---|---|---|---|
| Home | `ui/home/HomeViewModelV2.java`; `ui/main/viewmodel/HomeUIActivityViewModel.java`; `HomeNavigationActivityViewModel.java`; `RevampHomeActivityViewModel.java` | `MainActivity.showHome()`, `screen_home.xml` | Partial — contract reconciled; renderer/data wiring still incomplete |
| QBank landing | `ui/qbank/landing/QBankLandingViewModel.java` | `showQBank()`, `screen_qbank.xml` | Partial |
| QBank introduction | `ui/qbank/introduction/QbankIntroductionViewModel.java` | `QBankIntroductionModel.kt`, `showQBankIntroduction()` | Partial |
| QBank lesson list | `ui/qbank/lesson_list/QBankLessonListViewModel.java` | `showLessons()` | Partial |
| QBank play | `ui/qbank/play/QBankPlayViewModel.java`, `QBankMcqViewModel.java` | `showPlayer()` | Partial |
| QBank score | `ui/qbank/score/QbankScoreViewModel.java` | `showScore()`, `QBankScoreModel.kt` | Partial |
| QBank tracker | `ui/qbank/tracker/QbankTrackerViewModel.java` | `showQBankTracker()` | Partial |
| Tests landing | `ui/test/landing/HomeTestViewModel.java` | `showTests()` | Partial |
| Test introduction | `ui/test/introduction/TestIntroductionViewModel.java` | `showTestIntro()` | Partial |
| Test play | `ui/test/testplay/TestPlayViewModel.java`, `TestMcqViewModel.java` | `showTestPlay()` | Partial |
| Test score | `ui/test/score/TestScoreViewModel.java` | `showTestScore()` | Partial |
| Test review | `ui/test/testReview/ReviewViewModel.java`, `CommonReviewViewModel.java` | `showTestReview()` | Partial |
| Test analytics | `ui/test/analytics/TestAnalyticsViewModel.java` | `showTestAnalytics()` | Partial |
| Grand-test analytics | `ui/test/gtanalytics/GTAnalyticsViewModel.java`, `GTAnalyticsSubjectViewModel.java` | No dedicated renderer | Missing |
| Video landing | `ui/video/landing/VideoLandingViewModel.java` | `showVideos()` | Unresolved/placeholder |
| Video lesson list | `ui/video/lesson_list/VideoLessonListViewModel.java`, `VideoLessonListActivityViewModel.java` | No dedicated renderer | Missing |
| Video notes | `ui/video/notes/viewmodel/VideoNotesViewModel.java` | No renderer | Missing |
| Downloaded videos | `ui/video/downloaded_videos/DownloadedVideoListViewModel.java` | No renderer | Missing |
| Revision videos | `ui/video/revision_video/VideoRevisionListViewModel.java` | No renderer | Missing |
| Sample videos | `ui/video/sample_videos/viewmodel/SampleVideosViewModel.java` | No renderer | Missing |
| Custom module creation | `ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel.java` plus mode/subject/topic/tag/add-on VMs | `showCustom()` | Partial; current UI is only a flow shell |
| Custom module introduction | `ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel.java` | Route exists; no dedicated renderer | Missing |
| Custom module join-by-code | `ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel.java` | Route exists; no dedicated renderer | Missing |
| Custom module score | `ui/custom_module/done/CustomModuleScoreViewModel.java` | Route exists; no dedicated renderer | Missing |
| Profile edit | `ui/profile/viewmodel/ProfileEditViewModel.java` | Route exists; no renderer | Missing |
| Search | Recovered search layouts include `activity_better_search`, `fragment_better_search`, `item_better_search` | `showSearch()` | Functional local-content implementation; original parity incomplete |
| Bookmarks | Recovered layouts include bookmark landing/main/video/timeline surfaces | `showBookmarks()` | Functional current-session implementation; original parity incomplete |
| Pearls | Recovered pearl list/subject/detail layouts | `showPearls()` | Content unresolved; no verified local payload |
| Schema | Recovered QBank schema layouts and related QBank surfaces | Routes exist | Missing |
| PYQ | Route exists | No dedicated renderer | Missing |

## Verified original layout/resource surface names

The recovered resource tree contains, among others:

- `activity_home_revamp`
- `fragment_home`
- `activity_qbank_lesson_list`
- `activity_qbank_play`
- `activity_qbank_score`
- `activity_qbank_tracker`
- `fragment_qbank_landing`
- `fragment_qbank_lesson_list`
- `fragment_qbank_introduction_marrow2`
- `activity_test_introduction_marrow2`
- `activity_test_play_2`
- `fragment_test_introduction_marrow2`
- `fragment_test_score`
- `fragment_test_analytics`
- `activity_gt_analytics`
- `fragment_video_landing`
- `fragment_video_lesson_list`
- `fragment_video_notes`
- `fragment_downloaded_video_list`
- `activity_lesson_video`
- `activity_custom_module_creation`
- `fragment_custom_module_creation`
- `fragment_custom_module_subjects_selection`
- `fragment_custom_module_topics_selection`
- `fragment_custom_module_tags_selection`
- `fragment_custom_module_add_ons_selection`
- `activity_custom_module_introduction`
- `activity_custom_module_score`
- `dialog_custom_module_join_by_code`
- `activity_profile_edit`
- `fragment_profile_landing`
- `activity_better_search`
- `fragment_better_search`
- `activity_bookmark_landing`
- `activity_bookmark_main`
- `activity_bookmark_video`
- `activity_pearl_list_revamp`
- `activity_pearl_subject_list`
- `activity_pearl_detail`
- `activity_analytics_container`
- `activity_score_container`
- `activity_related_mcq`
- `activity_search_qbank_play`

## Important source-backed observations

### Home source reconciliation (2026-10-05)

The recovered source establishes that Home is not a single static renderer. The implementation contract spans:

- `ui/home/HomeViewModelV2.java` — Home content/config state: Zen, Pearls, recent updates, QBank/test/video suggestions, Magic Module, feature cards, plan upgrade, footer visibility, loading/error, notification and sync events.
- `ui/main/viewmodel/HomeUIActivityViewModel.java` — Home UI/session actions and state handling.
- `ui/main/viewmodel/HomeNavigationActivityViewModel.java` — persisted Home navigation state.
- `ui/main/viewmodel/RevampHomeActivityViewModel.java` — revamp Home state/async operations.
- Original packaged resource names include `activity_home_revamp`, `fragment_home`, `layout_dynamic_zen_area`, `layout_fc_qbank`, `layout_hc_pearl`, `layout_hc_recent_updates`, `layout_hc_plan_upgrade_card_m2`, `layout_hc_magic_module`, `item_home_mcq_option`, and `item_home_test_card`.

This is evidence of the native surface structure, not proof of the user's authenticated runtime payload. The reconstruction must therefore use verified local content only where available and keep remote-backed cards unresolved when their payload/configuration is absent.

### Home

`HomeViewModelV2` exposes independent UI-state channels for:

- Zen area
- Pearl information
- recent updates
- QBank suggestion
- Magic Module suggestion
- video suggestion
- test suggestion
- feature cards
- plan-upgrade card
- footer-card visibility
- home configuration
- loading/error state
- notification permission handling
- sync events

The current `screen_home.xml` only approximates these as static cards. The actual state/data wiring is not yet reconstructed.

### QBank

`QBankPlayViewModel` proves the original play layer has substantially more behavior than the current renderer, including:

- lesson title and parent type
- bookmark state/starting position
- MCQ answer state
- MCQ timer and timer visibility
- timer start/stop
- answer checking
- jump-to-page
- QBank completion
- custom-module completion
- answer-map updates
- streak/animation state
- custom-module/magic-module submission paths
- video-list/file-cache integrations

The current QBank player should therefore not be considered parity-complete.

### Tests

`HomeTestViewModel` proves the original test landing has:

- configured test tabs
- current year selection
- test list state
- subscription state
- GT nudge/banner state
- expand/collapse behavior
- GT analytics card state
- scroll-position handling
- test selection and start flows

The current test landing is not equivalent to this surface.

### Videos

`VideoLandingViewModel` and `VideoLessonListViewModel` prove the original video subsystem is a stateful content/lesson surface, not merely a static video page. The current app does not have enough verified content/DRM/session data to fabricate the player or protected URLs.

### Custom Module

The recovered source contains dedicated ViewModels for introduction, creation, mode, subject selection, topic selection, tags, add-ons, join-by-code and score. The current implementation is only a navigation shell and must be expanded from those sources rather than invented.

## Implementation policy

1. Preserve working reconstruction code.
2. Add behavior only where the recovered source/content proves it.
3. Do not turn compiled binary layout resources into guessed XML.
4. Do not fabricate API responses, DRM URLs, protected media, account state, or unavailable server content.
5. When source proves a surface exists but does not provide enough evidence for exact reconstruction, keep that surface explicitly unresolved and continue extracting source evidence.
6. Screenshots are never an implementation source.
