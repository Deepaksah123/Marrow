# Player behavior

Selection is locked after the first persisted answer state. Skip is a distinct persisted state. Bookmarking does not fabricate an answer. Navigation is route/state driven.

The player must receive real `McqContent` before displaying question/choice content; empty content remains visibly unresolved rather than being replaced by invented MCQs.
