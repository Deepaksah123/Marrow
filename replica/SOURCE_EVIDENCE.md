# Marrow Replica Evidence Contract

## Precedence

| Priority | Layer | Use |
|---|---|---|
| A | Original APK exact extraction | What was actually packaged |
| B | Recovered/decompiled Java/Kotlin/Smali/XML | Behavior, relationships, UI contracts |
| C | Verified Marrow Edition 8/content assets | What actual content the reconstructed UI may display |
| D | Screenshots/reference material | Visual QA only |

## Non-negotiable rules

- Never replace an exact APK member with a guessed reconstruction.
- Never fabricate authenticated API responses, account state, DRM URLs, scores, ranks, timers, or missing question data.
- Never import Marrow content from another repository.
- Marrow6 is excluded from the active Edition 8 QBank source.
- A screenshot can prove that a visual state existed, but cannot prove the implementation behind it.
- If A/B/C do not establish a fact, record it as unresolved.
- Preserve existing working code while closing one verified gap at a time.

## Verification record

Every parity item should identify:
- source layer (A/B/C/D)
- exact source path/member where possible
- current implementation path
- status: verified / partial / unresolved
- next evidence or implementation action

## Why this differs from generic replica-skill

The upstream methodology is designed for clean-room cloning from public pages/user-visible behavior. This repository already contains an explicitly reconciled original APK evidence layer and recovered source. Therefore, this project follows its existing evidence contract rather than forbidding the project's already-authorized recovery artifacts.
