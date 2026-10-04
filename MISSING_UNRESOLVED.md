# Missing / Unresolved Registry

This file is intentionally explicit. An item stays here until evidence from A (Original APK), B (Recovered/Decompiled Source) or C (Actual Content) proves the mapping.

| Area | Status | Current evidence boundary |
|---|---|---|
| Authenticated backend responses | UNRESOLVED | Client contracts/routes are recoverable; authenticated live responses are not part of the recovered APK source. |
| Account/session state | UNRESOLVED | Static client behavior is recoverable; live account state is not. |
| Live DRM/video URLs | UNRESOLVED | Client/player contracts exist; live protected URLs are runtime data. |
| Complete lecture-question runtime dataset | UNRESOLVED | APK models/code exist; a complete standalone readable live dataset is not established. |
| Exact runtime asset-to-screen mapping for every surface | PARTIAL | Original resources are recoverable; some screen-level associations still require reconciliation. |
| Full QBank/Test/Custom content attachment | PARTIAL | Verified content layer exists for available datasets; remaining mappings must be proven before attachment. |
| Exact server-side recommendation payloads | UNRESOLVED | Home data models/categories are known; live recommendation payloads are not proven. |
| Exact authenticated Home `home_items` configuration | UNRESOLVED | `CourseConfigV2.homePageItems` and the complete nine-value enum are recovered; the target session's runtime `home_items` list is not locally verified. |

## Rules

- Never convert UNRESOLVED into a guessed implementation.
- Never use screenshot pixels as a substitute for missing source.
- Never invent question text, answers, scores, ranks, timers, API payloads or protected media URLs.
- When new evidence resolves an item, record the evidence and move it out of this registry.
