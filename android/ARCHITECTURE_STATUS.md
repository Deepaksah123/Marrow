# Architecture status

Implemented source-backed foundations:
- central routes and session restoration
- QBank MCQ model/store, answer locking, bookmarking, metrics and review filters
- isolated Test state/metrics/submission transition
- explicit Custom Module flow state
- content validation and registration boundary
- QA gates preventing synthetic content

Remaining integration gate: register the actual supplied Marrow content package and connect recovered native resources/layout behavior. No placeholder question payload is being promoted as real content.
