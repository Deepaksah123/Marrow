# Marrow Runtime Route Contract

This is the source-backed navigation contract. It is not a claim that all runtime/server payloads are locally available.

## QBank

`qbank -> module -> lesson -> question -> qbank-score -> review`

Recovered state/contract fields include:
- question/session identifiers
- MCQ ID list
- start index
- total MCQs
- resume explanation state
- vibration/navigation state
- selected/first/server answer state
- correctness and guess state
- bookmark/starred state
- silly-mistake state
- skipped state
- question media/reference/tag/high-yield metadata

### MCQ display contract

Known source-backed fields include:
- `title`
- `questionDescription`
- `option1 ... option8`
- `answerDescription[]`
- `_id`
- `desc_html`
- `answer_desc`
- image/media metadata
- references/tags/high-yield/pearl metadata
- child-question and lock state where supplied

### Review filters

Known filters include:
- All
- Bookmarked
- Changed By You
- Correct
- Guess correct
- Guess wrong
- Schema MCQs
- New/Revised
- Silly Mistakes
- Skipped
- Wrong

## Tests

`tests -> test-intro -> test-play -> test-score -> test-review -> test-analytics`

The route exists in the recovered source contract. Actual test payloads must come from C or verified runtime data.

## Schema

`schema-list -> schema-detail -> schema-review`

The route is source-backed; complete runtime schema payload remains subject to evidence availability.

## Rules

- Option selection is a state transition, not decorative UI.
- Explanation visibility follows the recovered MCQ/review state; it is not hardcoded as always visible.
- Next/previous are pager-driven.
- Skip is distinct from answered state.
- Bookmark/review state must persist in the session/state model.
- A timer is rendered only when its source-backed state supplies one.
- Completion transitions use the corresponding recovered completion action.