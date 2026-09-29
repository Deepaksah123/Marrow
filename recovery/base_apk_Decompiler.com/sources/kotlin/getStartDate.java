package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum getStartDate {
    Function(getZenArea.IconCompatParcelizer, "Function", false, false),
    SuspendFunction(getZenArea.AudioAttributesImplApi26Parcelizer, "SuspendFunction", true, false),
    KFunction(getZenArea.MediaBrowserCompatSearchResultReceiver, "KFunction", false, true),
    KSuspendFunction(getZenArea.MediaBrowserCompatSearchResultReceiver, "KSuspendFunction", true, true);

    public static final read IconCompatParcelizer = new read(0);
    private final String AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final getNotesCount AudioAttributesImplBaseParcelizer;
    private final boolean MediaBrowserCompatItemReceiver;

    getStartDate(getNotesCount getnotescount, String str, boolean z, boolean z2) {
        this.AudioAttributesImplBaseParcelizer = getnotescount;
        this.AudioAttributesImplApi21Parcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
    }

    public final getNotesCount read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final getRelatedLessonId read(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(i);
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        return getrelatedlessonidRemoteActionCompatParcelizer;
    }

    public static final class read {
        private read() {
        }

        private static getStartDate IconCompatParcelizer(getNotesCount getnotescount, String str) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            toMagicModuleMetaRepoModel.write(str, "");
            for (getStartDate getstartdate : getStartDate.values()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstartdate.read(), getnotescount) && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, getstartdate.RemoteActionCompatParcelizer())) {
                    return getstartdate;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: o.getStartDate$read$read, reason: collision with other inner class name */
        public static final class C0106read {
            private final getStartDate AudioAttributesCompatParcelizer;
            private final int read;

            public C0106read(getStartDate getstartdate, int i) {
                toMagicModuleMetaRepoModel.write(getstartdate, "");
                this.AudioAttributesCompatParcelizer = getstartdate;
                this.read = i;
            }

            public final getStartDate RemoteActionCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final getStartDate AudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final int read() {
                return this.read;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0106read)) {
                    return false;
                }
                C0106read c0106read = (C0106read) obj;
                return this.AudioAttributesCompatParcelizer == c0106read.AudioAttributesCompatParcelizer && this.read == c0106read.read;
            }

            public final int hashCode() {
                return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.AudioAttributesCompatParcelizer);
                sb.append(", arity=");
                sb.append(this.read);
                sb.append(')');
                return sb.toString();
            }
        }

        public static C0106read AudioAttributesCompatParcelizer(String str, getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            getStartDate getstartdateIconCompatParcelizer = IconCompatParcelizer(getnotescount, str);
            if (getstartdateIconCompatParcelizer == null) {
                return null;
            }
            String strSubstring = str.substring(getstartdateIconCompatParcelizer.RemoteActionCompatParcelizer().length());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            Integer numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strSubstring);
            if (numRemoteActionCompatParcelizer != null) {
                return new C0106read(getstartdateIconCompatParcelizer, numRemoteActionCompatParcelizer.intValue());
            }
            return null;
        }

        @getMagicModuleMeta
        public final getStartDate IconCompatParcelizer(String str, getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            C0106read c0106readAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, getnotescount);
            if (c0106readAudioAttributesCompatParcelizer != null) {
                return c0106readAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }
            return null;
        }

        private static Integer RemoteActionCompatParcelizer(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int iCharAt = str.charAt(i2) - '0';
                if (iCharAt < 0 || iCharAt >= 10) {
                    return null;
                }
                i = (i * 10) + iCharAt;
            }
            return Integer.valueOf(i);
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
