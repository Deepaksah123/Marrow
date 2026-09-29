# Marrow Runtime Route Contract

This is the source-backed navigation contract. It is not a claim that all runtime/server payloads are locally available.

## QBank

`qbank -> module -> lesson -> question -> qbank-score -> review`

Recovered state includes question/session identifiers, MCQ ID list, start index, total MCQs, resume explanation state, vibration/navigation state, selected/first/server answer state, correctness/guess state, bookmark state, silly-mistake state, skipped state, and question media/reference/tag/high-yield metadata.

### Review filters

All, Bookmarked, Changed By You, Correct, Guess correct, Guess wrong, Schema MCQs, New/Revised, Silly Mistakes, Skipped, Wrong.

## Tests

`tests -> test-intro -> test-play -> test-score -> test-review -> test-analytics`

Actual test payloads must come from C or verified runtime data.

## Schema

`schema-list -> schema-detail -> schema-review`

Complete runtime schema payload remains subject to evidence availability.

## Rules

- Option selection is a state transition.
- Explanation visibility follows recovered MCQ/review state.
- Next/previous are pager-driven.
- Skip is distinct from answered state.
- Bookmark/review state persists in session state.
- Timers are rendered only when source-backed state supplies one.
