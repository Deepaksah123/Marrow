# Marrow Source Layers

This repository follows the agreed source-of-truth hierarchy.

## A — Original APK layer

Authoritative implementation source.

Contains or references exact members recovered from the original base.apk. Resources, manifests, packaged assets, DEX and other APK members must not be silently replaced by reconstructed or decompiler-generated equivalents.

Use A when the question is: "What was actually packaged in the original APK?"

## B — Recovered / Decompiled Source layer

Evidence and implementation-mapping layer.

Contains decompiled Java/Kotlin/Smali/XML/resource interpretations, forensic reports, model contracts, route maps and other recovered source representations.

B can explain behavior and relationships that are difficult to read directly from A, but it does not override A.

Use B when the question is: "How did the original client implement or connect this surface?"

## C — Actual Content layer

Real content data, kept separate from the APK/client layer.

This includes verified user-provided or otherwise source-backed QBank/Test/MCQ datasets and their images, solutions and metadata.

C must not be confused with static APK UI resources. Content delivered by authenticated runtime/API/session data is not fabricated into C.

Use C when the question is: "What actual questions/content should this UI display?"

## Missing / Unresolved

Anything not proven by A, B or C is recorded as unresolved.

Examples:
- authenticated server responses not present in the recovered source
- live session/account state
- live DRM/video URLs
- incomplete runtime mappings
- source-to-content mappings that cannot be proven
- assets whose original association is unknown

Rule: unresolved means unresolved. We do not fill the gap with guessed values, screenshots, placeholder questions, synthetic scores, invented URLs or assumed API responses.

## Implementation order

1. Reconcile A to B.
2. Identify the exact UI/runtime contract.
3. Attach C only where the content is actually verified.
4. Record every remaining gap in MISSING_UNRESOLVED.md.
5. Implement only verified mappings.
6. Run Android build/QA manually after a meaningful batch, not on every push.

## Evidence precedence

A Original APK > B Recovered/Decompiled Source > C Actual Content > screenshots/reference material.

Screenshots are visual QA/reference only and are never treated as implementation source.
