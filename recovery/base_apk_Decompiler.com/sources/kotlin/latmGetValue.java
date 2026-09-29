package kotlin;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class latmGetValue {
    public static ExecutorService IconCompatParcelizer(String str) {
        ExecutorService executorService = read(RemoteActionCompatParcelizer(str), new ThreadPoolExecutor.DiscardPolicy());
        read(str, executorService);
        return executorService;
    }

    private static ThreadFactory RemoteActionCompatParcelizer(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: o.latmGetValue.5
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new appendToNalUnit() { // from class: o.latmGetValue.5.4
                    @Override // kotlin.appendToNalUnit
                    public final void write() {
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(atomicLong.getAndIncrement());
                threadNewThread.setName(sb.toString());
                return threadNewThread;
            }
        };
    }

    private static ExecutorService read(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    private static void read(String str, ExecutorService executorService) {
        write(str, executorService, TimeUnit.SECONDS);
    }

    private static void write(String str, ExecutorService executorService, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new appendToNalUnit(str, executorService, 2L, timeUnit) { // from class: o.latmGetValue.2
            private /* synthetic */ String AudioAttributesCompatParcelizer;
            private /* synthetic */ ExecutorService RemoteActionCompatParcelizer;
            private /* synthetic */ TimeUnit read;
            private /* synthetic */ long write = 2;

            {
                this.read = timeUnit;
            }

            @Override // kotlin.appendToNalUnit
            public final void write() {
                try {
                    DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                    StringBuilder sb = new StringBuilder("Executing shutdown hook for ");
                    sb.append(this.AudioAttributesCompatParcelizer);
                    dvbSubtitleReader.IconCompatParcelizer(sb.toString());
                    this.RemoteActionCompatParcelizer.shutdown();
                    if (this.RemoteActionCompatParcelizer.awaitTermination(this.write, this.read)) {
                        return;
                    }
                    DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.AudioAttributesCompatParcelizer);
                    sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                    dvbSubtitleReader2.IconCompatParcelizer(sb2.toString());
                    this.RemoteActionCompatParcelizer.shutdownNow();
                } catch (InterruptedException unused) {
                    DvbSubtitleReader.read().IconCompatParcelizer(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.AudioAttributesCompatParcelizer));
                    this.RemoteActionCompatParcelizer.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for ".concat(String.valueOf(str))));
    }
}
