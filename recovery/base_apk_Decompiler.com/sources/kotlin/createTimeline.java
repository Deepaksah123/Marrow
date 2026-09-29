package kotlin;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class createTimeline {
    private static final double write = 1.0d / Math.pow(10.0d, 6.0d);

    public static long RemoteActionCompatParcelizer() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double AudioAttributesCompatParcelizer(long j) {
        return (RemoteActionCompatParcelizer() - j) * write;
    }
}
