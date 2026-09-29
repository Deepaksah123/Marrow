package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setLogSessionIdToMediaCodecFormat {
    public static String read(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", RemoteActionCompatParcelizer(str, str2), "perf-android-sdk", "android-ide");
    }

    public static String IconCompatParcelizer(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", RemoteActionCompatParcelizer(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    public static String RemoteActionCompatParcelizer(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", RemoteActionCompatParcelizer(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    private static String RemoteActionCompatParcelizer(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
