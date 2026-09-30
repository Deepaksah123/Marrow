# Native surface status

The compact reconstruction now has executable local/native flows for the recovered navigation families, including QBank, review, tests, videos, custom module, bookmarks, search, Pearls, Schema, profile and settings/theme.

## Verified local/runtime-backed areas

- Theme selection persists Light/Dark state and reapplies it on activity recreation.
- Settings exposes persisted vibration preference.
- QBank review supports the recovered answer-state filters and local answer/explanation rendering.
- Local Edition 8 QBank content is imported from the verified asset source at startup.
- Search is content-backed and opens matching local questions.
- Bookmarks are content-linked for loaded local questions.

## Evidence-boundary areas

Profile identity/update data, video lesson payloads/DRM URLs, schema MCQ payloads, account/session state, server-side custom-module generation/join results, recommendation payloads and other authenticated runtime data remain explicitly unresolved when no verified local payload exists.

This distinction is intentional: recovered APK source/resources prove that the surfaces exist, but do not prove that unavailable live backend payloads can be reconstructed locally.

## QA rule

A source-backed surface is considered implemented only when its verified local behavior is executable. Backend-only content remains unresolved rather than being replaced with guessed data.
