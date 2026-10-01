# Native UI Evidence Gap Matrix — 2026-10-01

Source authority:
1. Original APK recovered resources under `recovery/base_apk_Decompiler.com/resources/`
2. Decompiled Java/Kotlin/Smali under `recovery/base_apk_Decompiler.com/`
3. Current reconstruction under `app/src/main/`
4. Screenshots are QA only.

## Batch status

| Batch | Scope | Status | Finding |
|---|---|---|---|
| UI-A | Home + home navigation chrome | COMPLETE / structural pass | Original Home has distinct QBank/Test/Video/Feature/Pearls/Recent/Plan/Zen surfaces. Current repeated generic rows were replaced by source-backed card hierarchy while preserving existing IDs/routes. |
| UI-B | Original XML/resource ↔ current UI mapping | AUDITED | Major surface-specific resources exist in recovered APK but many current routes collapse into fewer generic reconstruction layouts. |
| UI-C | Interaction/state matrix | COMPLETE / supported local states mapped | Test intro/play, score/review/analytics, Video player and auxiliary state entry points are routed without fabricating server payloads; selected/pressed/disabled/loading/empty/error/back/dialog behavior is handled where the reconstruction has local state/evidence. |

## Evidence-backed original surface families

### Home
Recovered:
- `activity_home_revamp`
- `fragment_home`
- `custom_home_tab`
- `item_home_test_card`
- `item_home_mcq_option`
- `layout_hc_test_main`
- `layout_fc_qbank`
- `layout_fc_video`
- `layout_home_cards_shimmer_m2`
- `layout_home_lesson_shimmer_m2`

Recovered HomeViewModel state includes Zen, Pearls, recent updates, QBank suggestion, Magic Module suggestion, video suggestion, test suggestion, feature cards, plan upgrade, loading/error and home configuration.

Current:
- `screen_home.xml`
- IDs preserved: `homeZenCard`, `homeQBankCard`, `homeTestCard`, `homeVideoCard`, `homeMagicModuleCard`, `homePearlsCard`, `homeFeatureCards`, `homePlanUpgrade`, `homeRecentCard`.
- UI-A changed repeated flat rows into a distinct source-backed card hierarchy and added `bg_home_card.xml`.
- No backend payload was fabricated.

### QBank
Recovered surface families:
- landing/introduction
- lesson list
- play
- score
- tracker
- review
- search
- schema
- header/subject/progress/extra-functionality item layouts

Current dedicated XML:
- `screen_qbank.xml`
- `screen_qbank_lessons.xml`
- `screen_qbank_play.xml`
- `screen_qbank_score.xml`
- `screen_qbank_tracker.xml`
- `screen_qbank_search.xml`
- `screen_schema.xml`

UI-B batch applied: tracker, search and Schema listing now use dedicated source-shaped state layouts while preserving existing metrics/search/navigation logic. Schema detail/review remain intentionally payload-unresolved because live schema data is not locally verified.

### Tests
Recovered:
- home test
- introduction
- play
- score
- analytics
- test instruction
- test tab toolbar
- test cards/header items

Current:
- `screen_tests.xml` is the main reconstructed surface.

Gap: multiple original state-specific surfaces are collapsed into the current implementation. Do not replace with invented payloads; reconstruct only source-backed chrome/state.

### Videos
Recovered:
- landing
- subject/lesson list
- player
- notes
- timelines sidesheet
- downloaded list/options
- watch-next/end/error/completed states
- subject sort/filter

Current:
- `screen_videos.xml`
- `screen_video_lessons.xml`
- `screen_video_player.xml`

UI-B batch applied: Video Landing remains on its dedicated landing layout; Video subject/lesson list and Player now have dedicated state-shaped layouts. Downloaded/sample/notes/timeline/error/completed payload/state surfaces remain unresolved where local evidence does not provide verified payload.

### Custom Module
Recovered dedicated creation/mode/subject/topic/tag/add-on/introduction/join/score resources and ViewModels.

Current:
- `screen_custom.xml`

Status: structural states are decomposed in `screen_custom.xml` and the working navigator preserves the existing route contract. Server-backed creation/join payloads remain intentionally unresolved.

### Bookmarks / Profile / Settings / Theme
Recovered dedicated bookmark landing/main/video, profile landing/edit/update and theme-selection resources.

Current:
- No dedicated equivalent layout family; routes are reconstructed dynamically.

Status: working routes now expose the recovered landing/edit/settings/theme families through native-styled stateful surfaces. Account identity, KYC, password and server timeline payloads remain intentionally unresolved.

## Evidence rules

- Do not use screenshots as implementation authority.
- Do not globally deduplicate question IDs.
- Do not populate GT/Mini/PYQ from QBank.
- Do not delete suspicious content before provenance/dependency is established.
- Keep unsupported backend/account payloads unresolved.
- Preserve working functionality unless regression evidence requires change.

## Final UI gate

1. UI reconstruction pass is complete for the locally supported/native-evidence-backed surfaces.
2. Content is frozen; no Edition 8 QBank content was modified by the UI pass.
3. Server/account-backed payloads (live tests, video streams/notes/downloads, profile identity/KYC, remote settings/account data, schema payloads) remain explicitly unresolved rather than fabricated.
4. Final build/static verification is the remaining mechanical gate. The latest UI commit was pushed successfully; GitHub reported no workflow run for that commit at audit time, so build success is not claimed here.
5. Content audits remain outside this UI completion gate and are not being started under the current content-freeze instruction.
