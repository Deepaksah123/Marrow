# Marrow Source Evidence Matrix

This matrix is the implementation gate for the A/B/C source architecture.

## Evidence layers

| Layer | Meaning | Authority |
|---|---|---|
| A | Exact original APK member/recovered APK extraction | Highest |
| B | Decompiled/recovered source, XML, Smali, forensic maps and model/route reports | Explains A |
| C | Verified actual QBank/Test/MCQ content | Supplies displayable content |
| U | Missing/unresolved runtime evidence | Must not be guessed |

## Verified mappings

| Surface | A/B evidence | C attachment | Status | Implementation rule |
|---|---|---|---|---|
| Splash | Original packaged vector/resources + recovered UI mapping | None required | VERIFIED | Reconstruct from source assets; no screenshot pixels |
| Home | Home category/model semantics recovered: Featured=1, Test=2, QBank=3, Video=4; title/subtitle/thumbnail/subject and recommendation fields | Only verified content | VERIFIED/PARTIAL | Use source-backed model; live recommendations remain U |
| QBank subject list | Recovered route/model contracts | C subject/module data where verified | VERIFIED/PARTIAL | Never synthesize missing modules |
| QBank lesson/module | QBank lesson-list contracts and route mapping | C where verified | VERIFIED/PARTIAL | Preserve source hierarchy |
| QBank MCQ | MCQ state/model contract: id, options, answer/explanation, media, tags, high-yield/bookmark state | C actual MCQs | VERIFIED/PARTIAL | Render only fields present in C |
| QBank review | Review state/filter contracts | Derived from answered C questions | VERIFIED/PARTIAL | Calculate only from actual session state |
| QBank score | Score route/model exists | Depends on actual session answers | VERIFIED/PARTIAL | No synthetic score/rank/percentile |
| Tests | Test route/state contracts recovered | C test dataset only where verified | PARTIAL | No invented test payload |
| Custom module | Custom module route/state recovered | C only when verified | PARTIAL | No fabricated question set |
| Videos | Player/content contracts recovered | Live protected media unresolved | PARTIAL | Do not invent playable URLs |
| Recommendations | Static category/model semantics recovered | Live server payload absent | UNRESOLVED | Do not fabricate recommendations |
| Account/session | Client contracts may be recoverable | Live state absent | UNRESOLVED | Do not fake authenticated state |
| DRM/media URLs | Player contracts only | Runtime protected URLs absent | UNRESOLVED | No guessed URLs |

## Required evidence chain

Every implementation change should be traceable as:

**A exact member -> B interpretation -> C content (if needed) -> implementation file -> QA check**

If any link is absent, mark the feature PARTIAL or UNRESOLVED; do not silently fill the gap.

## Prohibited substitutions

- Screenshot pixels as UI implementation.
- Placeholder MCQs presented as real content.
- Synthetic scores, ranks, percentiles or timers.
- Guessed API responses or protected media URLs.
- Decompiled output replacing an exact APK member without verification.