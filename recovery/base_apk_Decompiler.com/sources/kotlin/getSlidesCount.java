package kotlin;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class getSlidesCount {
    private transient getRelatedLessonId AudioAttributesImplApi26Parcelizer;
    private transient getNotesCount AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private transient getSlidesCount RemoteActionCompatParcelizer;
    private static final getRelatedLessonId read = getRelatedLessonId.AudioAttributesCompatParcelizer("<root>");
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("\\.");
    private static final getAnswerMap<String, getRelatedLessonId> write = new getAnswerMap<String, getRelatedLessonId>() { // from class: o.getSlidesCount.5
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getRelatedLessonId invoke(String str) {
            return AudioAttributesCompatParcelizer(str);
        }

        private static getRelatedLessonId AudioAttributesCompatParcelizer(String str) {
            return getRelatedLessonId.IconCompatParcelizer(str);
        }
    };

    getSlidesCount(String str, getNotesCount getnotescount) {
        if (str == null) {
            read(0);
        }
        this.IconCompatParcelizer = str;
        this.AudioAttributesImplBaseParcelizer = getnotescount;
    }

    private getSlidesCount(String str) {
        if (str == null) {
            read(2);
        }
        this.IconCompatParcelizer = str;
    }

    private getSlidesCount(String str, getSlidesCount getslidescount, getRelatedLessonId getrelatedlessonid) {
        if (str == null) {
            read(3);
        }
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = getslidescount;
        this.AudioAttributesImplApi26Parcelizer = getrelatedlessonid;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int iLastIndexOf = this.IconCompatParcelizer.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.AudioAttributesImplApi26Parcelizer = getRelatedLessonId.IconCompatParcelizer(this.IconCompatParcelizer.substring(iLastIndexOf + 1));
            this.RemoteActionCompatParcelizer = new getSlidesCount(this.IconCompatParcelizer.substring(0, iLastIndexOf));
        } else {
            this.AudioAttributesImplApi26Parcelizer = getRelatedLessonId.IconCompatParcelizer(this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = getNotesCount.read.AudioAttributesImplApi26Parcelizer();
        }
    }

    public final String RemoteActionCompatParcelizer() {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            read(4);
        }
        return str;
    }

    public final boolean read() {
        return this.AudioAttributesImplBaseParcelizer != null || RemoteActionCompatParcelizer().indexOf(60) < 0;
    }

    public final getNotesCount MediaBrowserCompatItemReceiver() {
        getNotesCount getnotescount = this.AudioAttributesImplBaseParcelizer;
        if (getnotescount != null) {
            if (getnotescount == null) {
                read(5);
            }
            return getnotescount;
        }
        getNotesCount getnotescount2 = new getNotesCount(this);
        this.AudioAttributesImplBaseParcelizer = getnotescount2;
        return getnotescount2;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.isEmpty();
    }

    public final getSlidesCount AudioAttributesCompatParcelizer() {
        getSlidesCount getslidescount = this.RemoteActionCompatParcelizer;
        if (getslidescount != null) {
            if (getslidescount == null) {
                read(7);
            }
            return getslidescount;
        }
        if (IconCompatParcelizer()) {
            throw new IllegalStateException("root");
        }
        AudioAttributesImplApi21Parcelizer();
        getSlidesCount getslidescount2 = this.RemoteActionCompatParcelizer;
        if (getslidescount2 == null) {
            read(8);
        }
        return getslidescount2;
    }

    public final getSlidesCount read(getRelatedLessonId getrelatedlessonid) {
        String string;
        if (getrelatedlessonid == null) {
            read(9);
        }
        if (IconCompatParcelizer()) {
            string = getrelatedlessonid.AudioAttributesCompatParcelizer();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(".");
            sb.append(getrelatedlessonid.AudioAttributesCompatParcelizer());
            string = sb.toString();
        }
        return new getSlidesCount(string, this, getrelatedlessonid);
    }

    public final getRelatedLessonId AudioAttributesImplApi26Parcelizer() {
        getRelatedLessonId getrelatedlessonid = this.AudioAttributesImplApi26Parcelizer;
        if (getrelatedlessonid != null) {
            if (getrelatedlessonid == null) {
                read(10);
            }
            return getrelatedlessonid;
        }
        if (IconCompatParcelizer()) {
            throw new IllegalStateException("root");
        }
        AudioAttributesImplApi21Parcelizer();
        getRelatedLessonId getrelatedlessonid2 = this.AudioAttributesImplApi26Parcelizer;
        if (getrelatedlessonid2 == null) {
            read(11);
        }
        return getrelatedlessonid2;
    }

    public final getRelatedLessonId AudioAttributesImplBaseParcelizer() {
        if (IconCompatParcelizer()) {
            getRelatedLessonId getrelatedlessonid = read;
            if (getrelatedlessonid == null) {
                read(12);
            }
            return getrelatedlessonid;
        }
        getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (getrelatedlessonidAudioAttributesImplApi26Parcelizer == null) {
            read(13);
        }
        return getrelatedlessonidAudioAttributesImplApi26Parcelizer;
    }

    public final List<getRelatedLessonId> write() {
        List<getRelatedLessonId> listEmptyList = IconCompatParcelizer() ? Collections.emptyList() : getOrderDetails.read((Object[]) AudioAttributesCompatParcelizer.split(this.IconCompatParcelizer), (getAnswerMap) write);
        if (listEmptyList == null) {
            read(14);
        }
        return listEmptyList;
    }

    public final boolean IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            read(15);
        }
        if (IconCompatParcelizer()) {
            return false;
        }
        int iIndexOf = this.IconCompatParcelizer.indexOf(46);
        String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
        String str = this.IconCompatParcelizer;
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strAudioAttributesCompatParcelizer.length());
        }
        return str.regionMatches(0, strAudioAttributesCompatParcelizer, 0, iIndexOf);
    }

    public static getSlidesCount write(getRelatedLessonId getrelatedlessonid) {
        if (getrelatedlessonid == null) {
            read(16);
        }
        return new getSlidesCount(getrelatedlessonid.AudioAttributesCompatParcelizer(), getNotesCount.read.AudioAttributesImplApi26Parcelizer(), getrelatedlessonid);
    }

    public final String toString() {
        String strAudioAttributesCompatParcelizer = IconCompatParcelizer() ? read.AudioAttributesCompatParcelizer() : this.IconCompatParcelizer;
        if (strAudioAttributesCompatParcelizer == null) {
            read(17);
        }
        return strAudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getSlidesCount) && this.IconCompatParcelizer.equals(((getSlidesCount) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    private static /* synthetic */ void read(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
