# Recovered Source UI Map

This map records exact recovered source paths found under `recovery/base_apk_Decompiler.com/`. It is an evidence map, not an implementation claim.

## Core application / entry

- Package: `com.marrow`
- Application: `sources/com/marrow/TrainingApplication.java`
- Launcher: `sources/com/marrow/ui/activities/onboarding/splash/SplashActivity.java`
- Deep links: `sources/com/marrow/ui/activities/onboarding/deeplinkroute/DeeplinkActivity.java`, `DeeplinkProcessorActivity.java`
- Manifest: `resources/AndroidManifest.xml`

## Home / main navigation

- `sources/com/marrow2/ui/home/HomeViewModelV2.java`
- `sources/com/marrow2/ui/home/ZenAreaViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeSharedViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/HomeUIActivityViewModel.java`
- `sources/com/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel.java`
- Home models:
  - `sources/com/marrow/data/models/home/HomeMainModel.java`
  - `sources/com/marrow/data/models/home/HomeCardModel.java`
  - `sources/com/marrow/data/models/home/qbank/HomeQbankModel.java`
  - `sources/com/marrow/data/models/home/test/HomeTestModel.java`
  - `sources/com/marrow/data/models/home/video/HomeVideoModel.java`

## QBank

### Landing / introduction / lesson list

- `sources/com/marrow2/ui/qbank/introduction/QbankIntroductionViewModel.java`
- `sources/com/marrow2/ui/qbank/landing/QBankLandingViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel.java`
- `sources/com/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel.java`

### MCQ play / score / tracker

- `sources/com/marrow2/ui/qbank/play/QBankMcqViewModel.java`
- `sources/com/marrow2/ui/qbank/play/QBankPlayViewModel.java`
- `sources/com/marrow2/ui/qbank/score/QbankScoreViewModel.java`
- `sources/com/marrow2/ui/qbank/score/model/RevisionSubjectUIModel.java`
- `sources/com/marrow2/ui/qbank/tracker/QbankTrackerViewModel.java`

### MCQ contracts / state

- `sources/com/marrow/data/models/mcq/McqContentBody.java`
- `sources/com/marrow/data/models/mcq/McqAnswer.java`
- `sources/com/marrow/data/models/mcq/McqAnswerIndexModel.java`
- `sources/com/marrow/data/models/mcq/McqIndex.java`
- `sources/com/marrow/data/models/mcq/McqIndexMini.java`
- `sources/com/marrow/data/models/mcq/McqPager.java`
- `sources/com/marrow/data/models/mcq/McqParentInfo.java`
- `sources/com/marrow/data/models/mcq/McqPearlInfo.java`
- `sources/com/marrow/data/models/mcq/McqTimeSpent.java`
- `sources/com/marrow/data/models/mcq/McqTimerAnalyticsModel.java`
- `sources/com/marrow/data/models/mcq/BookReference.java`
- `sources/com/marrow/data/models/lesson/McqHighYieldRecord.java`
- `sources/com/marrow/data/models/lesson/McqSchemaGroupInfo.java`

### Bookmark / review / search

- `sources/com/marrow2/ui/bookmark/landing/BookmarkLandingViewModel.java`
- `sources/com/marrow2/ui/bookmark/detail/BookmarkMainViewModel.java`
- `sources/com/marrow2/ui/review_components/McqReviewViewModel.java`
- `sources/com/marrow2/ui/review_components/ui/pagers/ReviewPagerViewModel.java`
- `sources/com/marrow2/ui/search_qbank_play/SearchQbankPlayViewModel.java`
- `sources/com/marrow2/ui/better_search/BetterSearchViewModel.java`
- `sources/com/marrow/data/models/review/ReviewFilter.java`
- `sources/com/marrow/data/models/mcq/bookmark/FilterItemRecord.java`
- `sources/com/marrow/data/models/mcq/bookmark/MultiBookmarkCounter.java`

## Tests

- Landing: `sources/com/marrow2/ui/test/landing/HomeTestViewModel.java`
- Introduction: `sources/com/marrow2/ui/test/introduction/TestIntroductionViewModel.java`
- Play: `sources/com/marrow2/ui/test/testplay/TestMcqViewModel.java`, `TestPlayViewModel.java`
- Score: `sources/com/marrow2/ui/test/score/TestScoreViewModel.java`
- Review: `sources/com/marrow2/ui/test/testReview/CommonReviewViewModel.java`, `ReviewViewModel.java`
- Analytics: `sources/com/marrow2/ui/test/analytics/TestAnalyticsViewModel.java`
- Grand-test analytics: `sources/com/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel.java`, `GTAnalyticsSubjectViewModel.java`
- Timed submission workers:
  - `sources/com/marrow2/ui/test/testplay/worker/TestSubmitWorker.java`
  - `sources/com/marrow2/ui/test/testplay/worker/TestTimesUpWorker.java`

### Test models

- `sources/com/marrow/data/models/test/TestIndex.java`
- `sources/com/marrow/data/models/test/TestContainer.java`
- `sources/com/marrow/data/models/test/TestMini.java`
- `sources/com/marrow/data/models/test/TestAnalytics.java`
- `sources/com/marrow/data/models/test/Result.java`
- `sources/com/marrow/data/models/test/StateResult.java`
- `sources/com/marrow/data/models/test/RankPair.java`
- `sources/com/marrow/data/api/models/response/test/TestResponseBody.java`
- `sources/com/marrow/data/api/models/response/test/TestStartResponseBody.java`

## Custom modules

- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel.java`
- `sources/com/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel.java`
- `sources/com/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel.java`
- `sources/com/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel.java`
- `sources/com/marrow2/ui/custom_module/done/CustomModuleScoreViewModel.java`

## Videos

- `sources/com/marrow/ui/activities/learn/video/LessonVideoActivity.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel.java`
- `sources/com/marrow2/ui/video/lesson_list/VideoLessonListViewModel.java`
- Video playback/settings models are under `sources/com/marrow/data/models/video/`.

## Exact recovered UI resources already present

Relevant original drawables include:

- `resources/res/drawable/ic_home_tab_home.xml`
- `resources/res/drawable/ic_home_tab_qbank.xml`
- `resources/res/drawable/ic_home_tab_tests.xml`
- `resources/res/drawable/ic_home_tab_videos.xml`
- `resources/res/drawable/ic_qbank_header.xml`
- `resources/res/drawable/ic_test_header.xml`
- `resources/res/drawable/ic_videos_r.xml`
- `resources/res/drawable/ic_bookmark_border.xml`
- `resources/res/drawable/ic_bookmark_filled.xml`
- `resources/res/drawable/progress_bar_qbank_result_3_segments.xml`
- `resources/res/drawable/progress_bar_qbank_result_3_segments_revamp.xml`
- `resources/res/drawable/test_capsule.xml`
- `resources/res/drawable/qbank_capsule.xml`

## Implementation rule

The current reconstructed app remains the implementation target. Recovered source/resources are evidence and source material. Do not copy decompiler output wholesale into the app. Implement only after mapping the exact behavior/resource to the corresponding current route and validating the change.
