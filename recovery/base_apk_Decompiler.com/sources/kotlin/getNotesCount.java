package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getNotesCount {
    public static final getNotesCount read = new getNotesCount("");
    private transient getNotesCount IconCompatParcelizer;
    private final getSlidesCount RemoteActionCompatParcelizer;

    public getNotesCount(String str) {
        if (str == null) {
            IconCompatParcelizer(1);
        }
        this.RemoteActionCompatParcelizer = new getSlidesCount(str, this);
    }

    public getNotesCount(getSlidesCount getslidescount) {
        if (getslidescount == null) {
            IconCompatParcelizer(2);
        }
        this.RemoteActionCompatParcelizer = getslidescount;
    }

    private getNotesCount(getSlidesCount getslidescount, getNotesCount getnotescount) {
        if (getslidescount == null) {
            IconCompatParcelizer(3);
        }
        this.RemoteActionCompatParcelizer = getslidescount;
        this.IconCompatParcelizer = getnotescount;
    }

    public final String RemoteActionCompatParcelizer() {
        String strRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(4);
        }
        return strRemoteActionCompatParcelizer;
    }

    public final getSlidesCount AudioAttributesImplApi26Parcelizer() {
        getSlidesCount getslidescount = this.RemoteActionCompatParcelizer;
        if (getslidescount == null) {
            IconCompatParcelizer(5);
        }
        return getslidescount;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final getNotesCount AudioAttributesCompatParcelizer() {
        getNotesCount getnotescount = this.IconCompatParcelizer;
        if (getnotescount != null) {
            if (getnotescount == null) {
                IconCompatParcelizer(6);
            }
            return getnotescount;
        }
        if (read()) {
            throw new IllegalStateException("root");
        }
        getNotesCount getnotescount2 = new getNotesCount(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        this.IconCompatParcelizer = getnotescount2;
        return getnotescount2;
    }

    public final getNotesCount write(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(8);
        }
        return new getNotesCount(this.RemoteActionCompatParcelizer.read(getrelatedlessonid), this);
    }

    public final getRelatedLessonId IconCompatParcelizer() {
        getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        if (getrelatedlessonidAudioAttributesImplApi26Parcelizer == null) {
            IconCompatParcelizer(9);
        }
        return getrelatedlessonidAudioAttributesImplApi26Parcelizer;
    }

    public final getRelatedLessonId AudioAttributesImplApi21Parcelizer() {
        getRelatedLessonId getrelatedlessonidAudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        if (getrelatedlessonidAudioAttributesImplBaseParcelizer == null) {
            IconCompatParcelizer(10);
        }
        return getrelatedlessonidAudioAttributesImplBaseParcelizer;
    }

    public final List<getRelatedLessonId> write() {
        List<getRelatedLessonId> listWrite = this.RemoteActionCompatParcelizer.write();
        if (listWrite == null) {
            IconCompatParcelizer(11);
        }
        return listWrite;
    }

    public final boolean AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(12);
        }
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(getrelatedlessonid);
    }

    public static getNotesCount IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(13);
        }
        return new getNotesCount(getSlidesCount.write(getrelatedlessonid));
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getNotesCount) && this.RemoteActionCompatParcelizer.equals(((getNotesCount) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
