# Recovered APK → Android Reconstruction Surface Map

Source: `recovery/base_apk_Decompiler.com/` recovered from the verified APK archive.

## Recovery inventory
- Total recovered entries: 28,297
- Files: 26,825
- Directories: 1,472
- Java/Kotlin source files: 20,526
- Smali files: 817
- XML files: 2,371
- Original APK resources include the decoded AndroidManifest and Android resource tree.
- The recovered tree is the authoritative source layer; current `app/src/main` is the reconstruction layer.

## Verified primary application surfaces

### Home
- `sources/com/marrow2/ui/home/HomeViewModelV2.java`
- `sources/com/marrow2/ui/home/ZenAreaViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeBlockingActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeSharedViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeUIActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel.java`
- `resources/res/layout/activity_home_revamp`

Home source dependencies visible in the recovered class include HomeUseCase, McqUseCase, MagicModuleUseCase, QBankUseCase, CourseConfigUseCase, TestUseCase, MagicModuleAPIUseCase, analytics, video notification worker, sync event bus and coroutine dispatcher. Do not replace these with guessed local behavior.

### QBank
- `sources/com/marrow2/ui/qbank/introduction/QbankIntroductionViewModel.java`
- `sources/com/marrow2/ui/qbank/landing/QBankLandingViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankMcqViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankPlayViewModel.java`
- `sources/com/marrow2/ui/qbank/score/QbankScoreViewModel.java`
- `sources/com/marrow2/ui/qbank/tracker/QbankTrackerViewModel.java`
- `sources/com/marrow2/ui/search_qbank_play/SearchQbankPlayViewModel.java`
- `resources/res/layout/activity_qbank_lesson_list`
- `resources/res/layout/activity_qbank_play`
- `resources/res/layout/activity_qbank_score`
- `resources/res/layout/activity_qbank_tracker`
- `resources/res/layout/activity_search_qbank_play`

### Review / Schema
- `sources/com/marrow2/ui/review_components/McqReviewViewModel.java`
- `sources/com/marrow2/ui/review_components/ui/pagers/ReviewPagerViewModel.java`
- `sources/com/marrow2/ui/schema/schemaReview/SchemaReviewViewModel.java`
- `resources/res/layout/activity_review`
- `resources/res/layout/activity_schema_detail`
- `resources/res/layout/activity_schema_incomplete`
- `resources/res/layout/activity_schema_list`
- `resources/res/layout/activity_schema_review`

### Tests
- `sources/com/marrow2/ui/test/landing/HomeTestViewModel.java`
- `sources/com/marrow2/ui/test/introduction/TestIntroductionViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestMcqViewModel.java`
- `sources/com/marrow2/ui/test/testplay/TestPlayViewModel.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestSubmitWorker.java`
- `sources/com/marrow2/ui/test/testplay/worker/TestTimesUpWorker.java`
- `sources/com/marrow2/ui/test/testReview/CommonReviewViewModel.java`
- `sources/com/marrow2/ui/test/testReview/ReviewViewModel.java`
- `sources/com/marrow2/ui/test/score/TestScoreViewModel.java`
- `sources/com/marrow2/ui/test/analytics/TestAnalyticsViewModel.java`
- `sources/com/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel.java`
- `sources/com/marrow2/ui/test/gtanalytics/GTAnalyticsSubjectViewModel.java`
- `resources/res/layout/activity_test_introduction_marrow2`
- `resources/res/layout/activity_test_play_2`
- `resources/res/layout/activity_score_container`
- `resources/res/layout/activity_gt_analytics`

### Videos
- `sources/com/marrow2/ui/video/landing/VideoLandingViewModel.java`
- `sources/com/marrow2/ui/video/landing/epoxy_rv/VideoSubjectsModelController.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListViewModel.java`
- `sources/com/marrow2/ui/video/revision_video/VideoRevisionListViewModel.java`
- `sources/com/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel.java`
- `sources/com/marrow2/ui/video/sample_videos/viewmodel/SampleVideosViewModel.java`
- `sources/com/marrow2/ui/video/downloaded_videos/DownloadedVideoListViewModel.java`
- `sources/com/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel.java`
- `resources/res/layout/activity_lesson_video`
- `resources/res/layout/activity_video_lesson_list`
- `resources/res/layout/activity_video_notes` (where present in recovered resource tree)
- Original video assets include video controller drawables, download states, revision/sample/bookmark icons, timeline assets and video lock selectors.

### Custom Module
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel.java`
- `sources/com/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel.java`
- `sources/com/marrow2/ui/custom_module/done/CustomModuleScoreViewModel.java`
- `sources/com/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel.java`
- `resources/res/layout/activity_custom_module_creation`
- `resources/res/layout/activity_custom_module_introduction`
- `resources/res/layout/activity_custom_module_topics_selection`
- `resources/res/layout/activity_custom_module_score`

### Profile / Settings / Account
- `sources/com/marrow2/ui/profile/viewmodel/ProfileEditViewModel.java`
- `sources/com/marrow2/ui/settings/landing/ProfileLandingViewModel.java`
- `resources/res/layout/activity_profile_edit`
- `resources/res/layout/activity_profile_update`
- `resources/res/layout/activity_main_settings`
- `resources/res/layout/activity_theme_selection`

## Implementation rule
Recovered Java/Kotlin/Smali and decoded resources prove that these surfaces exist. They do **not** by themselves prove current live backend responses, account state, DRM/session data, or complete content. Those remain separate evidence layers.

## Current reconstruction gap
The existing `app/src/main` contains a compact reconstructed engine and a single `MainActivity`. It is not a one-to-one copy of the recovered application architecture. Therefore the next implementation batches must use the surface map above to replace placeholders with source-backed behavior, while keeping unproven live/backend behavior explicitly unresolved.
