# SOURCE-BACKED UI / STATE INVENTORY

This file records verified surfaces found in `recovery/base_apk_Decompiler.com/`. It is evidence, not a replacement for the recovered source tree.

## Recovery inventory
- Recovered tree: `recovery/base_apk_Decompiler.com/`
- Entries: 28,297
- Files: 26,825
- Java/Kotlin source: 20,526
- Smali: 817
- XML/resources: 2,371

## Verified original layout resources
- `activity_home_revamp`
- `fragment_home`
- `fragment_home_test`
- `fragment_qbank_landing`
- `fragment_qbank_introduction_marrow2`
- `activity_qbank_lesson_list`
- `fragment_qbank_lesson_list`
- `activity_qbank_play`
- `activity_qbank_score`
- `activity_qbank_tracker`
- `activity_review`
- `activity_schema_detail`
- `activity_schema_list`
- `activity_schema_review`
- `activity_search_qbank_play`
- `activity_test_introduction_marrow2`
- `activity_test_play_2`
- `fragment_test_introduction_marrow2`
- `fragment_test_score`
- `fragment_test_analytics`
- `activity_gt_analytics`
- `activity_custom_module_creation`
- `activity_custom_module_introduction`
- `activity_custom_module_score`
- `activity_custom_module_topics_selection`
- `fragment_custom_module_creation`
- `fragment_custom_module_introduction`
- `fragment_custom_module_score`
- `fragment_custom_module_subjects_selection`
- `fragment_custom_module_tags_selection`
- `fragment_custom_module_test_mode_selection`
- `fragment_custom_module_topics_selection`
- `fragment_custom_module_add_ons_selection`
- `fragment_video_landing`
- `fragment_video_lesson_list`
- `fragment_video`
- `activity_lesson_video`
- `fragment_video_notes`
- `fragment_video_timelines_sidesheet`
- `activity_bookmark_landing`
- `activity_bookmark_main`
- `activity_bookmark_video`
- `activity_pearl_list_revamp`
- `activity_pearl_subject_list`
- `activity_pearl_detail`
- `activity_profile_edit`
- `fragment_profile_landing`
- `activity_main_settings`
- `activity_theme_selection`

## Verified model contracts

### Home QBank
Recovered `com.marrow.data.models.home.qbank.HomeQbankModel` contains:
`id`, `thumbnail`, `title`, `subject`, `rating`, `count`, `status`, `isPaid`, `reason`, `updatedMcqCount`, `newMcqCount`, `isUnlocked`, `mcqCount`, `subjectId`, plus derived completion/paused/unattempted state.

### Home Test
Recovered `HomeTestModel` contains:
`id`, `title`, `isPaid`, `status`, `isResultAvailable`, `testType`, `resultTimeStamp`, `expiryTimeStamp`, `startTimeStamp`, `duration`, `availabilityType`, `questionCount`, `userStartedTimestamp`, `hasAccess`.

### Home Video
Recovered `HomeVideoModel` contains:
`id`, `thumbnail`, `title`, `subtitle`, `subject`, `durationText`, `rating`, `count`, `reason`, `isPaid`, `status`, `isDownloaded`, `isUnlocked`, `videoProgress`, plus derived completion/paused/unattempted state.

### MCQ content
Recovered `McqContentBody` supports:
`_id`, `title`, `questionDescription`, options 1–8, and `answer_desc` content bodies. Options are dynamically collected from option 1 through option 8, retaining non-empty options.

### Test response state
Recovered `TestResponseBody` keeps test state separately:
- `questions`
- `_id` / testId
- `test_groups`
- `my_answer`
- `answer_changed`
- `mark_reviewed`
- `guessed`

The native reconstruction therefore must not share Test answer storage with QBank answer storage.

### MCQ answer semantics
Recovered `McqAnswer` defines:
- selected/server answer and selected index
- first answer
- skipped sentinel
- guessed
- starred/review
- right/wrong
- silly-mistake state
- parent MCQ ID
- high-yield IDs
- changed-answer detection

## Current reconstruction action
The native reconstruction now has a separate `TestState.answers` map and `TestSession`, and Test play/score/review/analytics use this isolated test state. QBank state remains in `MarrowSessionState.answers`.

## Unresolved
The recovered source does not by itself provide authenticated live backend responses, account state, DRM/session URLs, or a complete current C-layer test/video dataset. Those remain separate evidence layers and are not fabricated here.
