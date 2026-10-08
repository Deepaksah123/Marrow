# ChatGPT Session State

## Active mode
ChatGPT-native autonomous Marrow reconstruction workflow

## Current repository
Deepaksah123/Marrow

## Current hard constraints
- Android-only workflow.
- Preserve existing native UI/functionality.
- No prototype substitution.
- Original APK/decompiled source is authoritative.
- Screenshots are QA references only.
- Do not re-add intentionally deleted Edition 8 QBank content.
- Do not mix content from unrelated repositories.
- Prefer large coherent batches and automatic continuation.

## Next-action rule
After completing a verified batch, immediately inspect the next highest-priority unresolved gap and continue. Ask the user only when a genuine decision or missing evidence prevents safe continuation.

## External-agent rule
Jules/Claude work found on GitHub is treated as untrusted incoming work until reviewed against the Marrow evidence hierarchy and build/QA requirements.
