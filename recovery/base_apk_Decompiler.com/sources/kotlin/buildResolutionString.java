package kotlin;

import android.os.Looper;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class buildResolutionString {
    public static void IconCompatParcelizer(String str, String str2) {
    }

    public static void read(Class cls, String str) {
        String str2 = read(cls);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(write());
        IconCompatParcelizer(str2, sb.toString());
    }

    public static void IconCompatParcelizer(Class cls, String str, Object... objArr) {
        String str2 = read(cls);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.getDefault(), str, objArr));
        sb.append(write());
        IconCompatParcelizer(str2, sb.toString());
    }

    public static void IconCompatParcelizer(Class cls, String str, long j, long j2) {
        long jAbs = Math.abs(j2 - j);
        StringBuilder sb = new StringBuilder("Method: ");
        sb.append(str);
        sb.append(", Diff: ");
        sb.append(jAbs);
        sb.append("ms");
        read(cls, sb.toString());
    }

    public static void read(Class cls, String str, long j) {
        IconCompatParcelizer(cls, str, j, System.currentTimeMillis());
    }

    public static void IconCompatParcelizer(String str, String str2, Object... objArr) {
        IconCompatParcelizer(str, String.format(Locale.getDefault(), str2, objArr));
    }

    private static String read(Class cls) {
        StringBuilder sb = new StringBuilder("com.marrow->");
        sb.append(cls.getSimpleName());
        return sb.toString();
    }

    private static String write() {
        return AudioAttributesCompatParcelizer() ? "   *******UI THREAD *********   " : "";
    }

    private static boolean AudioAttributesCompatParcelizer() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void read(Throwable th) throws Throwable {
        updateShuffleButton.RemoteActionCompatParcelizer(th);
    }
}
