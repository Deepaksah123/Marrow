package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getThumbnailUrl {
    public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private static final getThumbnailUrl write = new getThumbnailUrl(getExamDurationSeconds.STRICT, null, 0 == true ? 1 : 0, 6);
    private final getShowFullPage IconCompatParcelizer;
    private final getExamDurationSeconds RemoteActionCompatParcelizer;
    private final getExamDurationSeconds read;

    public getThumbnailUrl(getExamDurationSeconds getexamdurationseconds, getShowFullPage getshowfullpage, getExamDurationSeconds getexamdurationseconds2) {
        toMagicModuleMetaRepoModel.write(getexamdurationseconds, "");
        toMagicModuleMetaRepoModel.write(getexamdurationseconds2, "");
        this.RemoteActionCompatParcelizer = getexamdurationseconds;
        this.IconCompatParcelizer = getshowfullpage;
        this.read = getexamdurationseconds2;
    }

    public final getExamDurationSeconds read() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ getThumbnailUrl(getExamDurationSeconds getexamdurationseconds, getShowFullPage getshowfullpage, getExamDurationSeconds getexamdurationseconds2, int i) {
        this(getexamdurationseconds, (i & 2) != 0 ? new getShowFullPage(0) : getshowfullpage, (i & 4) != 0 ? getexamdurationseconds : getexamdurationseconds2);
    }

    public final getShowFullPage write() {
        return this.IconCompatParcelizer;
    }

    public final getExamDurationSeconds RemoteActionCompatParcelizer() {
        return this.read;
    }

    public static final class RemoteActionCompatParcelizer {
        private static final byte[] $$a = {11, -82, -98, -28, -19, -10, -3, 20, -6, 5};
        private static final int $$b = 123;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.getThumbnailUrl.RemoteActionCompatParcelizer.$$a
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r6 = r6 * 39
                int r6 = 114 - r6
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2d:
                int r6 = r6 + r8
                int r6 = r6 + 6
                int r8 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getThumbnailUrl.RemoteActionCompatParcelizer.a(short, int, int, java.lang.Object[]):void");
        }

        private RemoteActionCompatParcelizer() {
        }

        public static getThumbnailUrl AudioAttributesCompatParcelizer() {
            return getThumbnailUrl.write;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x07b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] RemoteActionCompatParcelizer(int r36, int r37, int r38) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2588
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getThumbnailUrl.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(int, int, int):java.lang.Object[]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getThumbnailUrl)) {
            return false;
        }
        getThumbnailUrl getthumbnailurl = (getThumbnailUrl) obj;
        return this.RemoteActionCompatParcelizer == getthumbnailurl.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getthumbnailurl.IconCompatParcelizer) && this.read == getthumbnailurl.read;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        getShowFullPage getshowfullpage = this.IconCompatParcelizer;
        return (((iHashCode * 31) + (getshowfullpage == null ? 0 : getshowfullpage.hashCode())) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaNullabilityAnnotationsStatus(reportLevelBefore=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sinceVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", reportLevelAfter=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
