package kotlin;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrackTransformation {
    public abstract long RemoteActionCompatParcelizer();

    public abstract long read();

    public abstract long write();

    private static TrackTransformation AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        return new readSdrs(j, j2, j3);
    }

    public static TrackTransformation IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}
