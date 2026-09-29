# Recovered UI Surface Index

Source root: `recovery/base_apk_Decompiler.com/`

This index records exact recovered members that are relevant to the current native reconstruction. It is a mapping aid, not an implementation substitute.

## Home / navigation
- `sources/com/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel.java`
- `sources/com/marrow/ui/activities/onboarding/splash/SplashActivity.java`
- `sources/com/marrow/ui/activities/onboarding/deeplinkroute/DeeplinkActivity.java`
- `sources/com/marrow/ui/activities/onboarding/deeplinkroute/DeeplinkProcessorActivity.java`
- `sources/com/marrow/ui/activities/base/BaseActivity.java`
- `sources/com/marrow/ui/activities/base/BaseDaggerActivity.java`

## Home card models
- `sources/com/marrow/data/models/home/qbank/HomeQbankModel.java`
  - id, thumbnail, title, subject, rating, count, status, paid/unlocked state, reason, updated/new MCQ counts, MCQ count, subjectId.
  - reason semantics recovered in code: 1 = paused module, 2 = based on last solved module, 6 = recently updated.
  - completed/paused/unattempted are derived from reason.
- `sources/com/marrow/data/models/home/test/HomeTestModel.java`
  - id, title, paid state, status, result availability, test type, result/expiry/start timestamps, duration, availability type, question count, user-started timestamp, access.

## QBank / MCQ
- `sources/com/marrow/data/api/models/response/mcq/McqResponseBody.java`
- `sources/com/marrow/data/models/mcq/McqIndex.java`
- `sources/com/marrow/data/models/mcq/McqContentBody.java`
- `sources/com/marrow/data/models/mcq/McqAnswer.java`
- `sources/com/marrow/data/models/mcq/McqAnswerIndexModel.java`
- `sources/com/marrow/data/models/mcq/McqPager.java`
- `sources/com/marrow/data/models/mcq/McqParentInfo.java`
- `sources/com/marrow/data/models/mcq/McqPearlInfo.java`
- `sources/com/marrow/data/models/mcq/McqTimeSpent.java`
- `sources/com/marrow/data/models/mcq/McqTimerAnalyticsModel.java`
- `sources/com/marrow/data/models/mcq/bookmark/FilterItemRecord.java`
- `sources/com/marrow/data/models/mcq/bookmark/MultiBookmarkCounter.java`
- `sources/com/marrow/data/models/mcq/schema/SchemaDetail.java`
- `sources/com/marrow/data/models/mcq/schema/SchemaDetailLesson.java`
- `sources/com/marrow/data/models/mcq/schema/SchemaLessonCompletionMcqMap.java`
- `sources/com/marrow/data/models/mcq/schema/SchemaLessonItem.java`
- `sources/com/marrow/data/models/mcq/schema/SchemaQbankItem.java`

## Test
- `sources/com/marrow/data/api/models/response/test/TestResponseBody.java`
  - questions, testId, test groups, my_answer, answers_changed, starred map, guessed map.
- `sources/com/marrow/data/api/models/response/test/TestStartResponseBody.java`
- `sources/com/marrow/data/api/models/request/test/TestMarrowRequestBody.java`
- `sources/com/marrow/data/api/models/request/test/MarkTestCompleteRequestBody.java`
- `sources/com/marrow/data/models/test/TestAnalytics.java`
- `sources/com/marrow/data/models/test/TestContainer.java`
- `sources/com/marrow/data/models/test/TestIndex.java`
- `sources/com/marrow/data/models/test/TestStatusResponse.java`
- `sources/com/marrow/data/models/test/TestSubjectStat.java`
- `sources/com/marrow/data/models/test/RankPair.java`
- `sources/com/marrow/data/models/test/Result.java`
- `sources/com/marrow/data/models/test/StateResult.java`

## Video
- `sources/com/marrow/ui/activities/learn/video/LessonVideoActivity.java`
- `sources/com/marrow/data/models/content/VideoInfo.java`
- `sources/com/marrow/data/models/video/DownloadableResolution.java`
- `sources/com/marrow/data/models/video/PixelInfo.java`
- `sources/com/marrow/data/models/video/cache/VideoCacheInfo.java`
- `sources/com/marrow/data/api/models/request/video/VideoHeartbeatRequestBody.java`
- `sources/com/marrow/data/api/models/request/lesson/MarkVideoCompleteRequestBody.java`

## Original QBank/Test/Video resource evidence
QBank resources include:
- `resources/res/drawable/bg_continue_qbank.xml`
- `resources/res/drawable/drw_qbank_lesson_index_circle.xml`
- `resources/res/drawable/ic_bookmark_question.xml`
- `resources/res/drawable/ic_circle_mcq_correct.xml`
- `resources/res/drawable/ic_circle_mcq_wrong.xml`
- `resources/res/drawable/ic_circle_mcq_skipped.xml`
- `resources/res/drawable/ic_circle_mcq_unattempted.xml`
- `resources/res/drawable/selector_mcq_option_dark_selected.xml`
- `resources/res/drawable/selector_mcq_option_normal_selected.xml`

Test resources include:
- `resources/res/drawable/drw_selected_test_option_background.xml`
- `resources/res/drawable/drw_selected_test_option_background_dark.xml`
- `resources/res/drawable/drw_selected_test_option_background_sepia.xml`
- `resources/res/drawable/ic_share_test_score.xml`
- `resources/res/drawable/ic_test_header.xml`
- `resources/res/drawable/icv_test_status_complete.xml`
- `resources/res/drawable/icv_test_status_pause.xml`
- `resources/res/drawable/icv_test_status_skipped.xml`
- `resources/res/drawable/icv_test_status_upcoming.xml`

Video resources include:
- `resources/res/drawable/bg_video_player_controller_landscape_half.xml`
- `resources/res/drawable/bg_video_player_controller_landscape_half_bottom.xml`
- `resources/res/drawable/ic_video_download_completed.xml`
- `resources/res/drawable/ic_video_download_start.xml`
- `resources/res/drawable/ic_video_downloaded.xml`
- `resources/res/drawable/ic_video_feedback.xml`
- `resources/res/drawable/ic_video_lesson_timeline.xml`
- `resources/res/drawable/next_video_bg.xml`

## Important boundary
The recovered source proves client-side models, resources, and implementation surfaces. It does not by itself provide authenticated live server responses, account state, or a complete live content dataset. Those remain separate evidence layers.
