package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalVideoCount {
    private final getNotesCount AudioAttributesCompatParcelizer;
    private final getNotesCount IconCompatParcelizer;
    private final getNotesCount RemoteActionCompatParcelizer;
    private final getRelatedLessonId write;

    private getTotalVideoCount(getNotesCount getnotescount, getNotesCount getnotescount2, getRelatedLessonId getrelatedlessonid, getNotesCount getnotescount3) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        this.RemoteActionCompatParcelizer = getnotescount;
        this.AudioAttributesCompatParcelizer = null;
        this.write = getrelatedlessonid;
        this.IconCompatParcelizer = null;
    }

    private /* synthetic */ getTotalVideoCount(getNotesCount getnotescount, getRelatedLessonId getrelatedlessonid, byte b) {
        this(getnotescount, null, getrelatedlessonid, null);
    }

    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        new IconCompatParcelizer((byte) 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getNotesCount.IconCompatParcelizer(getVideoMetaEncrypt.RemoteActionCompatParcelizer), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getTotalVideoCount(getNotesCount getnotescount, getRelatedLessonId getrelatedlessonid) {
        this(getnotescount, getrelatedlessonid, (byte) 0);
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String strRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, '.', '/', false));
        sb.append("/");
        getNotesCount getnotescount = this.AudioAttributesCompatParcelizer;
        if (getnotescount != null) {
            sb.append(getnotescount);
            sb.append(".");
        }
        sb.append(this.write);
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTotalVideoCount)) {
            return false;
        }
        getTotalVideoCount gettotalvideocount = (getTotalVideoCount) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, gettotalvideocount.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, gettotalvideocount.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, gettotalvideocount.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, gettotalvideocount.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        getNotesCount getnotescount = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = getnotescount == null ? 0 : getnotescount.hashCode();
        int iHashCode3 = this.write.hashCode();
        getNotesCount getnotescount2 = this.IconCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (getnotescount2 != null ? getnotescount2.hashCode() : 0);
    }
}
