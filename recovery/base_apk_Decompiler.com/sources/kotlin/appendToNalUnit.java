package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public abstract class appendToNalUnit implements Runnable {
    protected abstract void write();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        write();
    }
}
