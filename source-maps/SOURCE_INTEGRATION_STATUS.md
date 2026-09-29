# Source Integration Status

Generated from the GitHub repository tree on the current `main` branch.

## What is actually present

| Layer | Count |
|---|---:|
| Recovered original tree entries | 28,297 |
| Recovered original files | 26,825 |
| Recovered Java/Kotlin files | 20,526 |
| Recovered Smali files | 817 |
| Recovered XML files | 2,371 |
| Current reconstructed `app/src/main` files | 70 |
| Current reconstructed Kotlin/Java files | 45 |

The recovered source tree is therefore **not missing because only the reconstructed app has 70 files**. The original/decompiled material is stored separately under:

`recovery/base_apk_Decompiler.com/`

The 70-file `app/src/main` tree is the reconstruction/application layer, not a copy of the decompiler output.

## Important distinction

The original APK source cannot be blindly copied into `app/src/main`:

- the recovered Java/Kotlin is decompiler output;
- many classes depend on the original dependency graph, generated code, Hilt/Dagger, Compose, resources, and runtime services;
- server-backed data, account state, DRM/session state, and live API responses are not contained in the static APK;
- blindly copying classes would create a large non-building tree and would not reproduce runtime behavior.

Therefore integration is being done as **source-backed reconstruction**, not as arbitrary file copying.

## First mapping batch completed

The original source has now been mapped for these runtime surfaces:

- Home/main navigation
- QBank landing, introduction, lesson list, play, score, tracker, review/search
- Tests landing, introduction, play, timer/submit, score, review, analytics
- Videos landing, lesson list, player, notes, timeline/download related components
- Custom Module creation, mode, subjects, topics, tags, add-ons, join, score
- Profile/settings/search/bookmarks

The exact source paths are recorded in:
`source-maps/ORIGINAL_RUNTIME_SURFACE_INVENTORY.md`

## Next implementation gate

For each surface, implementation must proceed in this order:

1. Original resource/layout contract
2. Original ViewModel/state contract
3. Original model/API contract
4. Current reconstructed equivalent
5. Implement only what is proven by the source
6. Keep unavailable live/server data explicitly unresolved
7. Build after a meaningful batch

No reconstructed screen is considered equivalent merely because it has the same title or route name.
