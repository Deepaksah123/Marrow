# Content integration

The native engine now has a canonical `McqContent` model and `QBankContentStore`.

The UI does not manufacture question text, choices, answers, explanations, scores, timers, ranks, or media. A real supplied payload must populate the store before those fields are rendered.

Supported content fields include the recovered MCQ contract: id, title/question text, option choices, answer pointer, explanation, image URL variants, display ID, tags, high-yield IDs, pearl IDs, magic line and locked state.

Module IDs map to ordered MCQ IDs. The order supplied by the content source is preserved.
