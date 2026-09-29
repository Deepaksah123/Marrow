package kotlin;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
final class setChartView {
    public static boolean IconCompatParcelizer() {
        return Trace.isEnabled();
    }

    public static void write(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void RemoteActionCompatParcelizer(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
