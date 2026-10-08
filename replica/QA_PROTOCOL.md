# Marrow Replica QA Protocol

## Batch strategy

Do not repeatedly stop after tiny edits. Work in meaningful batches, then verify.

### Batch 1 — Shell and Home
- splash/loading layering
- home hierarchy
- navigation/footer
- theme/dimensions
- state wiring proven by recovered Home ViewModels

### Batch 2 — QBank
- landing
- introduction
- lesson list
- play
- score
- tracker
- bookmark/answer/timer states
- Edition 8 content integrity

### Batch 3 — Tests
- landing/tabs
- introduction
- play
- score
- review
- analytics
- GT analytics

### Batch 4 — Videos
- landing
- lesson list
- notes
- downloaded
- revision
- sample
- player only where runtime/session evidence exists

### Batch 5 — Custom Module / Profile / Search / Bookmarks / Pearls / PYQ
Implement only source-backed behavior; keep unresolved runtime dependencies explicit.

## Per-screen acceptance

A screen is not complete until:
- verified source mapping exists
- all source-proven states are accounted for
- loading/empty/error states are handled where evidenced
- 390x844 and a larger Android viewport are checked
- no new crash/blocking issue is present
- feature matrix is updated
- screenshot is captured for visual diff where a trusted reference exists

## Diff policy

Use layout diff to detect structural drift. Do not chase exact original colours/branding as a metric.

Compare:
- same viewport
- same data shape
- same navigation state
- same theme
- same scroll position

Use pixel diff only for regression testing of our own app.

## Bug priority

S1 = core flow blocked, data loss, security issue
S2 = feature broken without workaround
S3 = visible/functional defect with workaround
S4 = cosmetic

Never call a screen complete with an open S1/S2 affecting that flow.
