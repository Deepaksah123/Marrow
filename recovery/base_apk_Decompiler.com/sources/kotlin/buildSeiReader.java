package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public enum buildSeiReader implements Executor {
    INSTANCE;

    private static final Handler write = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        write.post(runnable);
    }
}
