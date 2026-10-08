# Marrow Replica QA Workflow

This folder adapts the methodology of Jakeschincariol/replica-skill to this Android reconstruction project.

## Purpose

Prevent prototype drift by enforcing a measurable loop:

1. Evidence reconciliation
2. Screen/flow inventory
3. Feature matrix
4. Build
5. Android smoke QA
6. Source-vs-app parity
7. Screenshot layout diff
8. Fix unresolved gaps
9. Repeat

## Marrow-specific evidence rule

This project does **not** replace its existing source hierarchy with the generic replica-skill rules.

**A — Original APK exact extraction > B — recovered/decompiled source > C — verified actual content > screenshots/reference material.**

Screenshots are visual QA only. They are never implementation source.

Unresolved server/account/DRM/runtime data remains unresolved; it is not fabricated.

## Scope

This workflow is for the existing Marrow Android reconstruction only. It must not import content from unrelated repositories.

## Current phase

Source-backed parity reconstruction. Existing working implementation must be preserved; changes should close verified gaps rather than create a new prototype.

## Outputs

- recon.md — verified screen/flow inventory
- features.csv — measurable feature parity matrix
- SOURCE_EVIDENCE.md — evidence mapping rules
- QA_PROTOCOL.md — batch QA and diff protocol


## ChatGPT-native orchestration

- CHATGPT_ORCHESTRATOR.md — operating contract for autonomous ChatGPT-led batches.
- CHATGPT_SESSION_STATE.md — persistent session constraints and continuation state.

These files are for the ChatGPT workflow; no Claude/Cloud plugin installation is required.
