package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getRelatedLessonId implements Comparable<getRelatedLessonId> {
    private final String RemoteActionCompatParcelizer;
    private final boolean read;

    private getRelatedLessonId(String str, boolean z) {
        if (str == null) {
            AudioAttributesCompatParcelizer(0);
        }
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            AudioAttributesCompatParcelizer(1);
        }
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        if (this.read) {
            throw new IllegalStateException("not identifier: ".concat(String.valueOf(this)));
        }
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (strAudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(2);
        }
        return strAudioAttributesCompatParcelizer;
    }

    public final boolean read() {
        return this.read;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(getRelatedLessonId getrelatedlessonid) {
        return this.RemoteActionCompatParcelizer.compareTo(getrelatedlessonid.RemoteActionCompatParcelizer);
    }

    public static getRelatedLessonId RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(5);
        }
        return new getRelatedLessonId(str, false);
    }

    public static boolean read(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static getRelatedLessonId AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(7);
        }
        if (!str.startsWith("<")) {
            throw new IllegalArgumentException("special name must start with '<': ".concat(String.valueOf(str)));
        }
        return new getRelatedLessonId(str, true);
    }

    public static getRelatedLessonId IconCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (str.startsWith("<")) {
            return AudioAttributesCompatParcelizer(str);
        }
        return RemoteActionCompatParcelizer(str);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRelatedLessonId)) {
            return false;
        }
        getRelatedLessonId getrelatedlessonid = (getRelatedLessonId) obj;
        return this.read == getrelatedlessonid.read && this.RemoteActionCompatParcelizer.equals(getrelatedlessonid.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + (this.read ? 1 : 0);
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
