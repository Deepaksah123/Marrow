# Marrow reconstruction implementation order

1. Foundation: canonical models, route registry, theme, asset resolver, JSON parser, local repository.
2. Shell: splash, home, primary navigation, profile entry.
3. QBank: subject, module, player, answer/explanation, tracker.
4. Review: score, review, analytics/progress.
5. Test/GT: intro, instructions, player, timer, submit, review, score, analytics.
6. Custom Module: creation, filters, generated module, play, score/review.
7. Video/Pearls/Schema/Profile/Settings.
8. Visual QA and runtime-state verification.

No synthetic question text, answers, scores, ranks, fixed timers, screenshot UI, or guessed asset ownership.