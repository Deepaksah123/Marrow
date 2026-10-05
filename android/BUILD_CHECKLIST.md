# Build integration checklist

- Central route/state architecture
- QBank answer locking, correct/wrong/skipped, bookmark and review state
- Test state isolated from QBank
- Custom Module isolated from QBank
- Supplied JSON remains the content source
- No generated question/answer text in the content layer
- Actual supplied content package is the next integration gate


## 2026-10-05 UI reconstruction checkpoint
- [x] Home toolbar re-aligned to recovered source geometry (58dp, centered Home title, drawer/search/bookmark actions).
- [x] Home feed spacing/card geometry moved away from prototype diagnostics toward recovered source structure.
- [x] Bottom navigation height aligned to the recovered 68dp visual target.
- [x] Prototype "No verified payload" Home diagnostics removed from primary visible copy.
- [x] Build-time Marrow content sync from WEBREPLITX5 removed; repository-local Edition 8 assets are now the build source.
- [ ] Runtime screenshot comparison against original Home reference.
- [ ] Pixel/state verification and remaining screen-by-screen 1:1 UI reconstruction.
