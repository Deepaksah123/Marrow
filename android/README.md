# Marrow native reconstruction

This is the native Android target. The original APK package is com.marrow; this rebuild deliberately uses the separate application ID com.deepaksah.marrow.rebuild so both apps can remain installed side-by-side.

## Installing a debug APK

Build with JDK 17, then install the single file at `app/build/outputs/apk/debug/app-debug.apk`. The app supports Android 6.0 (API 23) and newer. The base APK deliberately includes only the Edition 8 QBank content that the current importer loads. The larger recovered test-series JSON archives remain in the repository but are excluded from the installable APK until on-demand content support is implemented; this avoids an unnecessarily large APK and installation failures caused by insufficient device storage.

If installation still fails, use ADB rather than the generic Android installer message to see the exact cause:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

If ADB reports a signing conflict, uninstall the previous build of this rebuild and install again:

```bash
adb uninstall com.deepaksah.marrow.rebuild
adb install app/build/outputs/apk/debug/app-debug.apk
```

## Verified implementation scope

Source-backed branches currently mapped:
- Home
- QBank: landing -> subject -> module/lesson -> question -> score/review/analytics/tracker
- Test/GT: introduction -> instructions/groups -> play/timer/palette -> submit -> score/review/analytics
- Custom Module: introduction -> creation/mode -> subjects -> topics -> tags -> add-ons -> join by code -> generated module -> play -> score/review
- Videos/Lessons
- Profile/Settings
- Bookmarks, Schema, Pearls, Magic Module and related surfaces where source evidence exists

The HTML reconstruction is a reference/prototype and is not treated as the final native implementation.

## Source-of-truth rule

Use original APK resources/decompiled source and verified maps first. Do not invent missing APK behavior or backend responses. Screenshots are QA references only.
