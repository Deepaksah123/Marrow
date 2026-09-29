# Marrow Source Reconciliation — Exact APK Recovery

This directory is governed by source evidence, not reconstruction guesses.

## Source layers

1. **Original APK exact extraction** — `base.apk`
2. **Recovered/decompiled source/resources** — only where the recovery is usable
3. **Actual QBank content** — the supplied question-bank dataset
4. **Screenshots/reference pages** — visual QA only; never implementation assets

## Exact APK recovery currently verified

Source recovery archive: `base_apk_recovered_source.zip`

Verified recovery manifest:
- source APK: `base.apk`
- source APK SHA-256: `e03a582c20eec102510509918315be53e45bb9fe90647207b2c956a0f55316a3`
- original APK entries: **5,128**
- exact files extracted: **5,128**
- XML files: **2,012**
- HTML files: **10**
- CSS files: **10**
- JSON files: **27**
- JS files: **0**
- original DEX files: **5**
- native libraries and packaged assets are included in the exact extraction

The extraction was integrity-tested as a ZIP: **5,146 archive entries, 0 unreadable/corrupt ZIP members**. The additional entries are recovery metadata/index material around the 5,128 original APK members.

## Reconciliation policy

- `apk_exact/` is authoritative for byte-for-byte APK members.
- Decompiled/recovered source is a separate evidence layer and must not overwrite exact APK members.
- Generated indexes/manifests are labelled as generated.
- A missing decompiler reconstruction is **not** treated as a missing APK asset when the exact APK member exists.
- A source/API contract without runtime payload is **not** converted into fabricated live data.
- QBank questions are kept in the separate content layer.
- Unknown mappings remain unresolved rather than guessed.

## Runtime limitations

The APK contains client code, resources, models and API contracts. It does not by itself provide authenticated server responses, account state, live DRM/session URLs, or other server-side runtime data. Those remain explicitly outside the static source layer.

## Current next action

Use this reconciliation as the gate before importing source into the application:
**exact APK member -> recovered/decompiled counterpart -> verification status -> implementation owner**.

No screenshot pixels are accepted as source implementation.
