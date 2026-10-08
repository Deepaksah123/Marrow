# ChatGPT-Native Marrow Replica Orchestrator

## Purpose
This is the operating contract for continuing the Marrow reconstruction from ChatGPT. It is not a Claude plugin, Cloud workflow, or external agent.

ChatGPT uses this file together with the existing replica evidence and QA documents to decide the next implementation batch.

## Non-negotiable evidence hierarchy
1. Original APK exact extraction
2. Recovered/decompiled Java/Kotlin/Smali/XML
3. Verified Marrow content/assets
4. Screenshots/reference material — visual QA only

Never invent functionality from screenshots. If implementation evidence is insufficient, record the item as unresolved.

## Repository boundary
- Primary repository: Deepaksah123/Marrow
- Do not import Marrow functionality/content from unrelated repositories.
- Do not re-add Edition 8 QBank content that was intentionally removed.
- Preserve existing working implementation; do not replace it with a prototype.

## Autonomous execution loop
1. Read current git/CI/PR state.
2. Read replica/features.csv, replica/recon.md, replica/SOURCE_EVIDENCE.md, and replica/QA_PROTOCOL.md.
3. Identify the highest-impact unresolved S1/S2 or must-have gap.
4. Group related changes into one meaningful batch rather than making tiny isolated edits.
5. Inspect source evidence before implementation.
6. Implement the batch directly in the repository.
7. Run/inspect the relevant GitHub Actions build and installation checks.
8. Review the resulting diff for regressions and evidence violations.
9. Update the feature matrix/recon/checklist when the batch is actually verified.
10. Immediately select the next logical batch and continue without waiting for the user to say “kro”.
11. Stop only for a genuine external blocker, missing source evidence, permission failure, or a user decision that cannot safely be inferred.

## Batch sizing
Prefer a coherent 10–15 minute work unit or the largest safe batch supported by the available tools.

Good batch: inspect a complete flow, implement related screens/states, build, fix build failures, update parity records.

Bad batch: change one padding value, stop, and ask whether to continue.

## Change safety
Before changing build configuration, dependencies, package identity, signing, or Gradle/JDK versions, prove that the change is required.

Never introduce unrelated build-system changes into a feature change.

Never claim build/install success without checking the actual CI result.

## Parallelism
Parallelize independent read-only inspection and verification where possible. Do not parallelize conflicting writes to the same file/path. After parallel inspection, consolidate implementation into one coherent change.

## Definition of done
A flow is complete only when:
- source mapping is documented
- source-proven states are implemented
- relevant loading/empty/error states are handled where evidenced
- navigation works through the reachable flow
- 390x844 and a larger Android viewport are considered
- no new S1/S2 blocker exists
- CI/build status is verified
- feature matrix/recon status is updated

## ChatGPT role
ChatGPT is the active orchestrator. GitHub is the shared source of truth for code and CI. External agents such as Claude/Jules may be inspected through GitHub when their branches/PRs exist, but their changes are not trusted automatically and must pass the same evidence and safety rules.
