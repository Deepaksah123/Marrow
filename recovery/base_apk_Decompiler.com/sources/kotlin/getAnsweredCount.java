package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getAnsweredCount extends getOriginalPosition implements getPlaybackIndex {
    private final getRelatedLessonId IconCompatParcelizer;
    private final getVideoPageNotesTitle RemoteActionCompatParcelizer;

    private getVideoPageNotesTitle read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getPlaybackIndex
    public final getRelatedLessonId RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAnsweredCount(getVideoPageNotesTitle getvideopagenotestitle, getLink getlink, getRelatedLessonId getrelatedlessonid, getStartIndex getstartindex) {
        super(getlink, getstartindex);
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.RemoteActionCompatParcelizer = getvideopagenotestitle;
        this.IconCompatParcelizer = getrelatedlessonid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cxt { ");
        sb.append(read());
        sb.append(" }");
        return sb.toString();
    }
}
