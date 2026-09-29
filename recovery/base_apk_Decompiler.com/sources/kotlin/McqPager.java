package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class McqPager extends getOriginalPosition implements getPlaybackIndex {
    private final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer;
    private final getRelatedLessonId write;

    @Override // kotlin.getPlaybackIndex
    public final getRelatedLessonId RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McqPager(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getLink getlink, getRelatedLessonId getrelatedlessonid) {
        super(getlink, null);
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.RemoteActionCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
        this.write = getrelatedlessonid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(write());
        sb.append(": Ctx { ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" }");
        return sb.toString();
    }
}
