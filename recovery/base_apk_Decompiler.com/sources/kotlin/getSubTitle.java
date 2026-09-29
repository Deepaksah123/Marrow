package kotlin;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubTitle {
    private static Thread RemoteActionCompatParcelizer;

    private static boolean AudioAttributesCompatParcelizer() {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == RemoteActionCompatParcelizer;
    }

    public static void write() {
        if (!AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
