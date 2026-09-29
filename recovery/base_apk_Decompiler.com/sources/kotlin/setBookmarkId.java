package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setBookmarkId implements Comparable<setBookmarkId> {
    public abstract setActiveLessonPaid read();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(setBookmarkId setbookmarkid) {
        toMagicModuleMetaRepoModel.write(setbookmarkid, "");
        return read().compareTo(setbookmarkid.read());
    }
}
