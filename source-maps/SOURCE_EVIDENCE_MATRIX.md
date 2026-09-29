# Marrow Source Evidence Matrix

This matrix is the implementation gate for the A/B/C source architecture.

## Evidence layers

| Layer | Meaning | Authority |
|---|---|---|
| A | Exact original APK member/recovered APK extraction | Highest |
| B | Decompiled/recovered source, XML, Smali, forensic maps and model/route reports | Explains A |
| C | Verified actual QBank/Test/MCQ content | Supplies displayable content |
| U | Missing/unresolved runtime evidence | Must not be guessed |

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
