package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class getPlaybackState implements Executor {
    final Handler IconCompatParcelizer;

    getPlaybackState(Handler handler) {
        this.IconCompatParcelizer = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.IconCompatParcelizer.getLooper()) {
            runnable.run();
        } else {
            this.IconCompatParcelizer.post(runnable);
        }
    }
}
