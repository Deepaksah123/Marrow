# Marrow Reconstruction Recon Map

## Evidence basis

See `SOURCE_EVIDENCE.md` and the repository-level source reconciliation documents.

## Verified surface inventory

| ID | Surface | Current implementation | Status |
|---|---|---|---|
| S01 | Home | MainActivity / screen_home.xml | Partial |
| S02 | QBank landing | showQBank | Partial |
| S03 | QBank introduction | QBankIntroductionModel / route | Partial |
| S04 | QBank lesson list | showLessons | Partial |
| S05 | QBank play | showPlayer | Partial |
| S06 | QBank score | showScore | Partial |
| S07 | QBank tracker | showQBankTracker | Partial |
| S08 | Test landing | showTests | Partial |
| S09 | Test introduction | showTestIntro | Partial |
| S10 | Test play | showTestPlay | Partial |
| S11 | Test score | showTestScore | Partial |
| S12 | Test review | showTestReview | Partial |
| S13 | Test analytics | showTestAnalytics | Partial |
| S14 | GT analytics | no dedicated renderer | Missing |
| S15 | Video landing | showVideos | Unresolved/placeholder |
| S16 | Video lesson list | no dedicated renderer | Missing |
| S17 | Video notes | no renderer | Missing |
| S18 | Downloaded videos | no renderer | Missing |
| S19 | Revision videos | no renderer | Missing |
| S20 | Sample videos | no renderer | Missing |
| S21 | Custom module creation | showCustom | Partial |
| S22 | Custom module introduction | route only | Missing |
| S23 | Custom module join-by-code | route only | Missing |
| S24 | Custom module score | route only | Missing |
| S25 | Profile edit | route only | Missing |
| S26 | Search | showSearch | Partial |
| S27 | Bookmarks | showBookmarks | Partial |
| S28 | Pearls | showPearls | Unresolved |
| S29 | Schema | routes exist | Missing |
| S30 | PYQ | no dedicated renderer | Missing |

## Priority

Must-have reconstruction blockers:
1. Home shell and visual hierarchy
2. QBank end-to-end
3. Test end-to-end
4. Primary navigation/theme
5. Source-backed missing screens that are reachable from those flows

Secondary:
- GT analytics
- complete video navigation
- custom module subflows
- profile/search/bookmark/pearl/schema/PYQ parity

Runtime-unresolved:
- authenticated server payloads
- protected DRM/session URLs
- account-specific configuration
- missing live recommendation data
