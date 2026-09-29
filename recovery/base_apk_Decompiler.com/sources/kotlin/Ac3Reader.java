package kotlin;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac3Reader implements ThreadFactory {
    private static final ThreadFactory RemoteActionCompatParcelizer = Executors.defaultThreadFactory();
    private final int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final StrictMode.ThreadPolicy read;
    private final AtomicLong write = new AtomicLong();

    public Ac3Reader(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.read = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = RemoteActionCompatParcelizer.newThread(new Ac4ExtractorExternalSyntheticLambda0(this, runnable));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.IconCompatParcelizer, Long.valueOf(this.write.getAndIncrement())));
        return threadNewThread;
    }

    final /* synthetic */ void write(Runnable runnable) {
        Process.setThreadPriority(this.AudioAttributesCompatParcelizer);
        StrictMode.ThreadPolicy threadPolicy = this.read;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }
}
