package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class getTrackFormat implements Executor {
    private Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.RemoteActionCompatParcelizer.post(runnable);
    }
}
