# Original Runtime Surface Inventory

Source of truth: `recovery/base_apk_Decompiler.com/` recovered from the original APK.

## Recovery integrity
- Original APK exact archive: 5,128 APK entries.
- Recovered archive inventory: 5,146 entries including archive/container metadata.
- Corrupt/unreadable ZIP members: 0.
- Decompiled Java/Kotlin source is present under `sources/`.
- Original Android resources are present under `resources/`.
- Smali is present under `smali/`.
- This inventory is source mapping only; it does not treat screenshots as implementation.

## Main source-backed runtime surfaces

### Home / main navigation
- `sources/com/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeUIActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeSharedViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel_HiltModules.java`
- `sources/com/marrow2/ui/home/HomeViewModelV2.java`
- `resources/res/layout/activity_home_revamp.xml`
- `resources/res/layout/fragment_home.xml`
- `resources/res/layout/custom_home_tab.xml`

### QBank
- `sources/com/marrow2/ui/qbank/landing/QBankLandingViewModel.java`
- `sources/com/marrow2/ui/qbank/introduction/QbankIntroductionViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankPlayViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankMcqViewModel.java`
- `sources/com/marrow2/ui/qbank/score/QbankScoreViewModel.java`
- `sources/com/marrow2/ui/qbank/tracker/QbankTrackerViewModel.java`
- `sources/com/marrow2/ui/review_components/ui/pagers/ReviewPagerViewModel.java`
- `sources/com/marrow2/ui/search_qbank_play/SearchQbankPlayViewModel.java`
- `resources/res/layout/fragment_qbank_landing.xml`
- `resources/res/layout/activity_qbank_lesson_list.xml`
- `resources/res/layout/activity_qbank_play.xml`
- `resources/res/layout/activity_qbank_score.xml`
- `resources/res/layout/fragment_qbank_tracker.xml`
- `resources/res/layout/activity_review.xml`
- `resources/res/layout/activity_search_qbank_play.xml`
- `resources/res/layout/activity_schema_review.xml`

### Tests
- `sources/com/marrow2/ui/test/landing/HomeTestViewModel.java`
- `sources/com/marrow2/ui/test/introduction/TestIntroductionViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestPlayViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestMcqViewModel.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestSubmitWorker.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestTimesUpWorker.java`
- `sources/com/marrow2/ui/test/testReview/ReviewViewModel.java`
- `sources/com/marrow2/ui/test/score/TestScoreViewModel.java`
- `sources/com/marrow2/ui/test/analytics/TestAnalyticsViewModel.java`
- `resources/res/layout/fragment_home_test.xml`
- `resources/res/layout/fragment_test_introduction_marrow2.xml`
- `resources/res/layout/activity_test_play_2.xml`
- `resources/res/layout/fragment_test_score.xml`
- `resources/res/layout/fragment_test_analytics.xml`
- `resources/res/layout/layout_test_instruction.xml`
- `resources/res/layout/test_tab_toolbar.xml`

### Videos
- `sources/com/marrow2/ui/video/landing/VideoLandingViewModel.java`
- `sources/com/marrow2/ui/video/landing/epoxy_rv/VideoSubjectsModelController.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListViewModel.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel.java`
- `sources/com/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel.java`
- `sources/com/marrow2/ui/video/revision_video/VideoRevisionListViewModel.java`
- `sources/com/marrow/ui/activities/learn/video/LessonVideoActivity.java`
- `resources/res/layout/fragment_video_landing.xml`
- `resources/res/layout/fragment_video_lesson_list.xml`
- `resources/res/layout/activity_lesson_video.xml`
- `resources/res/layout/fragment_video_notes.xml`
- `resources/res/layout/view_video_end_with_active_recall.xml`
- `resources/res/layout/view_mcq_video_player.xml`

### Custom Module
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel.java`
- `sources/com/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel.java`
- `sources/com/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel.java`
- `sources/com/marrow2/ui/custom_module/done/CustomModuleScoreViewModel.java`
- `resources/res/layout/activity_custom_module_creation.xml`
- `resources/res/layout/activity_custom_module_introduction.xml`
- `resources/res/layout/activity_custom_module_topics_selection.xml`
- `resources/res/layout/fragment_custom_module_creation.xml`
- `resources/res/layout/fragment_custom_module_subjects_selection.xml`
- `resources/res/layout/fragment_custom_module_topics_selection.xml`
- `resources/res/layout/fragment_custom_module_tags_selection.xml`
- `resources/res/layout/fragment_custom_module_add_ons_selection.xml`
- `resources/res/layout/fragment_custom_module_test_mode_selection.xml`
- `resources/res/layout/fragment_custom_module_score.xml`
- `resources/res/layout/dialog_custom_module_join_by_code.xml`

## Source-backed data contracts discovered
- Home models: `HomeMainModel`, `HomeCardModel`, `HomeQbankModel`, `HomeTestModel`, `HomeVideoModel`.
- QBank models: `McqContentBody`, `McqIndex`, `McqPager`, `McqAnswer`, `McqTimeSpent`, `McqTimerAnalyticsModel`, schema models, bookmark models.
- Test models: `TestIndex`, `TestContainer`, `TestGroupLSModel`, `TestAnalytics`, `TestScoreRSModel`, `TestTimerRSModel`, `TestProgressV2RSModel`.
- Video models: `VideoInfo`, `VideoPlaybackInfo`, `VideoPlaybackConfiguration`, `VideoResumeInfo`, `VideoSubtitle`, `Timeline`, cache/download models.
- Review: `ReviewFilter` and review pager/viewmodel.
- Search: `SearchMcqResponseBody`, `SearchTextResponseBody`, `SearchQbankPlayViewModel`.

## Current reconstruction gap
The current `app/src/main` implementation is a separate reconstruction layer. It should not be treated as the original implementation. The next integration batches must map each current route/state/rendering function to these recovered source contracts and original layouts, preserving unresolved server/runtime dependencies as unresolved.

## Integration order
1. Home + bottom navigation
2. QBank landing → lesson list → play → score → review/tracker
3. Test landing → introduction → play/timer/submit → score/review/analytics
4. Video landing → lesson list → player/notes/timeline
5. Custom Module creation → mode → subjects → topics → tags → add-ons → score/join
6. Profile/settings/search/bookmarks and remaining source-backed surfaces

No functionality is marked complete merely because a similarly named reconstructed screen exists.
