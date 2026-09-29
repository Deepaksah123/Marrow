package kotlin;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
final class BarEntry {
    public static void write(String str) {
        Trace.beginSection(str);
    }

    public static void RemoteActionCompatParcelizer() {
        Trace.endSection();
    }
}
