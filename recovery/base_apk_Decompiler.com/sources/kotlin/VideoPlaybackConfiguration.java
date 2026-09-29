package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoPlaybackConfiguration {
    public static final boolean AudioAttributesCompatParcelizer(String str, boolean z) {
        return accessgetVideoConfigurationC3cp.write(str, z);
    }

    public static final int IconCompatParcelizer() {
        return accessgetVideoConfigurationC1cp.write();
    }

    public static final long IconCompatParcelizer(String str, long j, long j2, long j3) {
        return accessgetVideoConfigurationC3cp.write(str, j, j2, j3);
    }

    public static final int RemoteActionCompatParcelizer(String str, int i, int i2, int i3) {
        return accessgetVideoConfigurationC3cp.AudioAttributesCompatParcelizer(str, i, i2, i3);
    }

    public static final String read(String str, String str2) {
        return accessgetVideoConfigurationC3cp.IconCompatParcelizer(str, str2);
    }

    public static final String write(String str) {
        return accessgetVideoConfigurationC1cp.AudioAttributesCompatParcelizer(str);
    }
}
