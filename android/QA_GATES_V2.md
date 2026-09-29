# QA gates v2

1. Content validation must pass before a real payload is registered.
2. QBank and Test state remain separate.
3. Review filters never infer source-only classifications.
4. No synthetic question, option, answer, score, rank, percentile, timer or media URL is introduced.
5. UI may render only fields present in the canonical content state.
6. Browser/Android runtime PASS is reported only after an actual build/run check; static source inspection is not a runtime pass.
