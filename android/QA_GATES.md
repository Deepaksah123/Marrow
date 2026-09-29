# Runtime QA gates

- Build must compile with the repository's declared Android toolchain.
- No synthetic MCQ content is accepted as production content.
- QBank state must be driven by actual MCQ IDs/payload.
- Test state remains separate from QBank state.
- Custom Module remains a separate route branch.
- Review filters remain state-driven.
- Timer duration is only rendered when supplied by source/payload.
- Theme state persists.
- Back navigation restores the immediately previous logical surface.
- Screenshots are visual references only and are never UI assets.
