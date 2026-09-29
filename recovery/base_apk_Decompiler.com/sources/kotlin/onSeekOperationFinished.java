package kotlin;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class onSeekOperationFinished implements BinarySearchSeeker {
    @Override // kotlin.BinarySearchSeeker
    public final long IconCompatParcelizer() {
        return SystemClock.elapsedRealtime();
    }
}
