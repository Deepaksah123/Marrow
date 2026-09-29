# Marrow native reconstruction

This is the native Android target. The original APK package is com.marrow; this rebuild deliberately uses the separate application ID com.deepaksah.marrow.rebuild so both apps can remain installed side-by-side.

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
