# Home Exact-Parity Source Trace — 2026-10-04

## Scope
This batch traces the recovered Home configuration contract and separates what is proven from what remains runtime-dependent.

## Proven from the original APK recovery

### Configuration model
- Original source: `recovery/base_apk_Decompiler.com/sources/com/marrow/data/models/common/CourseConfigV2.java`
- `CourseConfigV2` contains `homePageItems: List<HomePageItems>`.
- `getHomePageItems()` returns that configuration list.
- `CourseConfigKeyConstantsKt` defines `KEY_HOME_PAGE_ITEMS = "home_items"`.

### Exact HomePageItems values
Recovered enum values and their source order:
1. `MCQ_OF_THE_DAY`
2. `FEATURED_CARD`
3. `SUGGESTED_TEST`
4. `SUGGESTED_QBANK`
5. `SUGGESTED_VIDEO`
6. `PEARLS`
7. `RECENT_UPDATES`
8. `RENEW_CARD`
9. `MAGIC_MODULE`

This is the complete recovered enum; it is not evidence that all nine are enabled for every account/session.

### HomeViewModel contract
Original `HomeViewModelV2` exposes separate state for:
- Zen / MCQ-of-the-day
- Pearls
- Recent updates
- Suggested QBank
- Magic Module
- Suggested Video
- Suggested Test
- Feature cards
- Plan upgrade
- Home configuration list

The constructor injects `CourseConfigUseCase`, confirming that Home configuration is obtained through the course-config layer rather than being a hardcoded UI list.

### Payload separation
Recovered Home models separately define QBank, Test and Video payload contracts. Therefore configuration membership and payload availability are distinct gates.

## Current reconstruction

Current `MainActivity.showHome()`:
- Uses verified local Edition 8 QBank registry for the QBank summary.
- Uses the checked-in `Marrow_pearls.html` asset for Pearls.
- Keeps remote-backed Home cards hidden when their verified runtime payload/configuration is unavailable.
- Does not fabricate Test, Video, Recent Updates, Feature, Plan Upgrade, Magic Module or MCQ-of-the-day payloads.

## Important finding

The exact runtime `home_items` list for a real authenticated session is **not present as a local verified dataset** in the repository. The recovered APK proves the configuration schema and all possible enum values, but not the account/session-specific list.

Therefore:
- Do not hardcode an assumed Home card order.
- Do not enable all nine cards merely because the enum exists.
- Do not invent server payloads to fill configured cards.
- The remaining exact-parity blocker is the authenticated CourseConfig provider/response for the target session.

## Native resource evidence

The recovered APK contains dedicated Home resource families including:
- `activity_home_revamp`
- `fragment_home`
- `custom_home_tab`
- `layout_fc_qbank`
- `layout_fc_video`
- `layout_hc_test_main`
- `layout_hc_pearl`
- `layout_home_cards_shimmer_m2`
- `layout_home_lesson_shimmer_m2`

These are evidence of native surface families, not permission to synthesize missing payloads.

## Implementation decision

No fabricated Home data or guessed configuration order is being introduced in this batch. The current local QBank/Pearls functionality remains intact. The exact Home configuration provider and authenticated payload remain explicitly unresolved until source-backed runtime evidence is available.

## Next source-backed target
Trace the course-config repository/remote response path and its parser for `home_items`, then map each returned enum to the corresponding recovered Home layout and ViewModel state. Only after that should the reconstruction alter runtime Home ordering/visibility.
