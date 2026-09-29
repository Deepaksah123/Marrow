package kotlin;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class jumpDrawablesToCurrentState {
    public static void AudioAttributesCompatParcelizer(Class cls, String str) {
        RemoteActionCompatParcelizer(cls);
        IconCompatParcelizer();
    }

    private static void AudioAttributesCompatParcelizer(Class cls, String str, long j, long j2) {
        long jAbs = Math.abs(j2 - j);
        if (jAbs > 50 && read()) {
            AudioAttributesCompatParcelizer(cls, "************ Took high processing time **************");
        }
        StringBuilder sb = new StringBuilder("Method: ");
        sb.append(str);
        sb.append(", Diff: ");
        sb.append(jAbs);
        sb.append("ms");
        AudioAttributesCompatParcelizer(cls, sb.toString());
    }

    public static void write(Class cls, String str, long j) {
        AudioAttributesCompatParcelizer(cls, str, j, System.currentTimeMillis());
    }

    private static String RemoteActionCompatParcelizer(Class cls) {
        StringBuilder sb = new StringBuilder("com.marrow.data->");
        sb.append(cls.getSimpleName());
        return sb.toString();
    }

    private static String IconCompatParcelizer() {
        return read() ? "   *******UI THREAD *********   " : "";
    }

    private static boolean read() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
