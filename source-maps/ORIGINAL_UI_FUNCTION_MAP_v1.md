# Marrow Original UI / Function Map v1

Source of truth: `recovery/base_apk_Decompiler.com/` recovered from the three-part decompiler archive.

## Recovery completeness
- Recovered tree entries: 28,297
- Recovered files: 26,825
- Recovered directories: 1,472
- Java/Kotlin source files: 20,526
- Smali files: 817
- XML files: 2,371
- Original APK archive integrity: recorded in `recovery/RECOVERY_ZIP_INVENTORY.json`

## Original UI surfaces proven by recovered resources
- Home: `resources/res/layout/activity_home_revamp`, `fragment_home`, `fragment_home_test`
- QBank landing/introduction: `fragment_qbank_landing`, `fragment_qbank_introduction_marrow2`
- QBank lesson list: `activity_qbank_lesson_list`, `fragment_qbank_lesson_list`
- QBank play: `activity_qbank_play`
- QBank score: `activity_qbank_score`
- QBank tracker: `activity_qbank_tracker`, `fragment_qbank_tracker`
- Search QBank play: `activity_search_qbank_play`
- Review: `activity_review`
- Schema: `activity_schema_list`, `activity_schema_detail`, `activity_schema_review`, `activity_schema_incomplete`
- Tests: `activity_home_test`, `activity_test_introduction_marrow2`, `activity_test_play_2`, `fragment_test_score`, `fragment_test_analytics`
- Videos: `fragment_video_landing`, `fragment_video`, `fragment_video_lesson_list`, `activity_lesson_video`, `fragment_video_notes`, `fragment_video_timelines_sidesheet`
- Custom modules: `activity_custom_module_creation`, `activity_custom_module_introduction`, `activity_custom_module_topics_selection`, `activity_custom_module_score` plus the corresponding `fragment_custom_module_*` screens
- Bookmarks: `activity_bookmark_landing`, `activity_bookmark_main`, `activity_bookmark_video`
- Profile/settings/theme: `fragment_profile_landing`, `fragment_profile_edit_marrow`, `activity_theme_selection`

## Original source-backed ViewModels / state owners
### Home
`sources/com/marrow2/ui/home/HomeViewModelV2.java`
Proven state/data streams include Zen area, Pearls, recent updates, QBank suggestions, Magic Module suggestions, Video suggestions, Test suggestions, feature cards, plan-upgrade data, home configuration, loading/error state and home navigation events.

### QBank
- `sources/com/marrow2/ui/qbank/landing/QBankLandingViewModel.java`
- `sources/com/marrow2/ui/qbank/introduction/QbankIntroductionViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankPlayViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankMcqViewModel.java`
- `sources/com/marrow2/ui/qbank/score/QbankScoreViewModel.java`
- `sources/com/marrow2/ui/qbank/tracker/QbankTrackerViewModel.java`

The recovered QBank play ViewModel explicitly contains QBank UI state, answer state, navigation state, MCQ timer state, timer start/stop behavior, answer handling, page jumping, completion actions, bookmark-start state and answer-list retrieval.

### Tests
- `sources/com/marrow2/ui/test/landing/HomeTestViewModel.java`
- `sources/com/marrow2/ui/test/introduction/TestIntroductionViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestPlayViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestMcqViewModel.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestSubmitWorker.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestTimesUpWorker.java`
- `sources/com/marrow2/ui/test/score/TestScoreViewModel.java`
- `sources/com/marrow2/ui/test/testReview/ReviewViewModel.java`
- `sources/com/marrow2/ui/test/testReview/CommonReviewViewModel.java`
- `sources/com/marrow2/ui/test/analytics/TestAnalyticsViewModel.java`
- `sources/com/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel.java`

### Video
- `sources/com/marrow2/ui/video/landing/VideoLandingViewModel.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListViewModel.java`
- `sources/com/marrow/ui/activities/learn/video/LessonVideoActivity.java`
- `sources/com/marrow/ui/activities/learn/video/overlay/*`
- video playback/config/download models and services under `sources/com/marrow/data/dataprovider/video`, `sources/com/marrow/video`, and `sources/com/marrow2/core/services/video_download`

### Custom Module
The recovered source contains dedicated creation, mode, subject, topic, tag, add-on, introduction, join-by-code and score ViewModels under `sources/com/marrow2/ui/custom_module/`.

## Important implementation rule
The recovered tree proves the existence and structure of these surfaces, but static decompiled code does not prove authenticated server responses or live account content. The reconstruction must implement only behavior supported by recovered code/resources and the verified C content layer. Unknown runtime/backend behavior remains unresolved rather than fabricated.
