package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class RevisionSubjectStatusModel {
    private final boolean AudioAttributesCompatParcelizer;
    private final getNotesCount IconCompatParcelizer;
    private final getNotesCount RemoteActionCompatParcelizer;

    public static RevisionSubjectStatusModel RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        if (getnotescount == null) {
            read(0);
        }
        return new RevisionSubjectStatusModel(getnotescount.AudioAttributesCompatParcelizer(), getnotescount.IconCompatParcelizer());
    }

    public RevisionSubjectStatusModel(getNotesCount getnotescount, getNotesCount getnotescount2, boolean z) {
        if (getnotescount == null) {
            read(1);
        }
        if (getnotescount2 == null) {
            read(2);
        }
        this.RemoteActionCompatParcelizer = getnotescount;
        this.IconCompatParcelizer = getnotescount2;
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevisionSubjectStatusModel(getNotesCount getnotescount, getRelatedLessonId getrelatedlessonid) {
        this(getnotescount, getNotesCount.IconCompatParcelizer(getrelatedlessonid), false);
        if (getnotescount == null) {
            read(3);
        }
        if (getrelatedlessonid == null) {
            read(4);
        }
    }

    public final getNotesCount RemoteActionCompatParcelizer() {
        getNotesCount getnotescount = this.RemoteActionCompatParcelizer;
        if (getnotescount == null) {
            read(5);
        }
        return getnotescount;
    }

    public final getNotesCount IconCompatParcelizer() {
        getNotesCount getnotescount = this.IconCompatParcelizer;
        if (getnotescount == null) {
            read(6);
        }
        return getnotescount;
    }

    public final getRelatedLessonId AudioAttributesImplApi26Parcelizer() {
        getRelatedLessonId getrelatedlessonidIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        if (getrelatedlessonidIconCompatParcelizer == null) {
            read(7);
        }
        return getrelatedlessonidIconCompatParcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final RevisionSubjectStatusModel read(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            read(8);
        }
        return new RevisionSubjectStatusModel(RemoteActionCompatParcelizer(), this.IconCompatParcelizer.write(getrelatedlessonid), this.AudioAttributesCompatParcelizer);
    }

    public final RevisionSubjectStatusModel write() {
        getNotesCount getnotescountAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        if (getnotescountAudioAttributesCompatParcelizer.read()) {
            return null;
        }
        return new RevisionSubjectStatusModel(RemoteActionCompatParcelizer(), getnotescountAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return !this.IconCompatParcelizer.AudioAttributesCompatParcelizer().read();
    }

    public final getNotesCount AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.read()) {
            getNotesCount getnotescount = this.IconCompatParcelizer;
            if (getnotescount == null) {
                read(9);
            }
            return getnotescount;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        sb.append(".");
        sb.append(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        return new getNotesCount(sb.toString());
    }

    public static RevisionSubjectStatusModel IconCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(str, false);
    }

    public static RevisionSubjectStatusModel RemoteActionCompatParcelizer(String str, boolean z) {
        String str2;
        if (str == null) {
            read(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new RevisionSubjectStatusModel(new getNotesCount(str2), new getNotesCount(str), z);
    }

    public final String read() {
        if (this.RemoteActionCompatParcelizer.read()) {
            String strRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer == null) {
                read(13);
            }
            return strRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().replace('.', '/'));
        sb.append("/");
        sb.append(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        String string = sb.toString();
        if (string == null) {
            read(14);
        }
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RevisionSubjectStatusModel revisionSubjectStatusModel = (RevisionSubjectStatusModel) obj;
        return this.RemoteActionCompatParcelizer.equals(revisionSubjectStatusModel.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(revisionSubjectStatusModel.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == revisionSubjectStatusModel.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.valueOf(this.AudioAttributesCompatParcelizer).hashCode();
    }

    public final String toString() {
        if (!this.RemoteActionCompatParcelizer.read()) {
            return read();
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(read());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void read(int r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RevisionSubjectStatusModel.read(int):void");
    }
}
