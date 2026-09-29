package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class accessgetVideoConfigurationC3cp {
    public static final boolean write(String str, boolean z) {
        String strWrite = VideoPlaybackConfiguration.write(str);
        return strWrite != null ? Boolean.parseBoolean(strWrite) : z;
    }

    public static /* synthetic */ int AudioAttributesCompatParcelizer(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return VideoPlaybackConfiguration.RemoteActionCompatParcelizer(str, i, i2, i3);
    }

    public static final int AudioAttributesCompatParcelizer(String str, int i, int i2, int i3) {
        return (int) VideoPlaybackConfiguration.IconCompatParcelizer(str, i, i2, i3);
    }

    public static final long write(String str, long j, long j2, long j3) {
        String strWrite = VideoPlaybackConfiguration.write(str);
        if (strWrite == null) {
            return j;
        }
        Long lMediaBrowserCompatCustomActionResultReceiver = TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strWrite);
        if (lMediaBrowserCompatCustomActionResultReceiver == null) {
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' has unrecognized value '");
            sb.append(strWrite);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        long jLongValue = lMediaBrowserCompatCustomActionResultReceiver.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j2);
        sb2.append("..");
        sb2.append(j3);
        sb2.append(", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final String IconCompatParcelizer(String str, String str2) {
        String strWrite = VideoPlaybackConfiguration.write(str);
        return strWrite == null ? str2 : strWrite;
    }
}
