package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class setForceShowIcon extends setGroupDividerEnabled {
    private volatile Handler IconCompatParcelizer;
    private final Object write = new Object();
    private final ExecutorService read = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: o.setForceShowIcon.1
        private final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder sb = new StringBuilder("arch_disk_io_");
            sb.append(this.RemoteActionCompatParcelizer.getAndIncrement());
            thread.setName(sb.toString());
            return thread;
        }
    });

    @Override // kotlin.setGroupDividerEnabled
    public final void AudioAttributesCompatParcelizer(Runnable runnable) {
        this.read.execute(runnable);
    }

    @Override // kotlin.setGroupDividerEnabled
    public final void read(Runnable runnable) {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = write(Looper.getMainLooper());
                }
            }
        }
        this.IconCompatParcelizer.post(runnable);
    }

    @Override // kotlin.setGroupDividerEnabled
    public final boolean AudioAttributesCompatParcelizer() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private static Handler write(Looper looper) {
        return read.read(looper);
    }

    static class read {
        public static Handler read(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
