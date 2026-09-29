package kotlin;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class setForceDefaultLicenseUri implements ExecutorService {
    private static volatile int AudioAttributesCompatParcelizer;
    private static final long write = TimeUnit.SECONDS.toMillis(10);
    private final ExecutorService RemoteActionCompatParcelizer;

    private static write AudioAttributesImplApi21Parcelizer() {
        return new write(true).RemoteActionCompatParcelizer(1).IconCompatParcelizer("disk-cache");
    }

    public static setForceDefaultLicenseUri IconCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer().read();
    }

    private static write AudioAttributesImplApi26Parcelizer() {
        return new write(false).RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver()).IconCompatParcelizer("source");
    }

    public static setForceDefaultLicenseUri AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer().read();
    }

    public static setForceDefaultLicenseUri RemoteActionCompatParcelizer() {
        return new setForceDefaultLicenseUri(new ThreadPoolExecutor(0, Integer.MAX_VALUE, write, TimeUnit.MILLISECONDS, new SynchronousQueue(), new RemoteActionCompatParcelizer(new read((byte) 0), "source-unlimited", AudioAttributesCompatParcelizer.read, false)));
    }

    private static write MediaBrowserCompatItemReceiver() {
        return new write(true).RemoteActionCompatParcelizer(write()).IconCompatParcelizer("animation");
    }

    private static int write() {
        return MediaBrowserCompatCustomActionResultReceiver() >= 4 ? 2 : 1;
    }

    public static setForceDefaultLicenseUri read() {
        return MediaBrowserCompatItemReceiver().read();
    }

    setForceDefaultLicenseUri(ExecutorService executorService) {
        this.RemoteActionCompatParcelizer = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.RemoteActionCompatParcelizer.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.RemoteActionCompatParcelizer.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.RemoteActionCompatParcelizer.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.RemoteActionCompatParcelizer.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.RemoteActionCompatParcelizer.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.RemoteActionCompatParcelizer.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.RemoteActionCompatParcelizer.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.RemoteActionCompatParcelizer.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.RemoteActionCompatParcelizer.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.RemoteActionCompatParcelizer.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.RemoteActionCompatParcelizer.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.RemoteActionCompatParcelizer.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.RemoteActionCompatParcelizer.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    private static int MediaBrowserCompatCustomActionResultReceiver() {
        if (AudioAttributesCompatParcelizer == 0) {
            AudioAttributesCompatParcelizer = Math.min(4, setLicenseRequestHeaders.write());
        }
        return AudioAttributesCompatParcelizer;
    }

    public interface AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer read;

        void RemoteActionCompatParcelizer(Throwable th);

        static {
            new AudioAttributesCompatParcelizer() { // from class: o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer.4
                @Override // o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer
                public final void RemoteActionCompatParcelizer(Throwable th) {
                }
            };
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer() { // from class: o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer.5
                @Override // o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer
                public final void RemoteActionCompatParcelizer(Throwable th) {
                }
            };
            new AudioAttributesCompatParcelizer() { // from class: o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer.2
                @Override // o.setForceDefaultLicenseUri.AudioAttributesCompatParcelizer
                public final void RemoteActionCompatParcelizer(Throwable th) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            };
            read = audioAttributesCompatParcelizer;
        }
    }

    static final class read implements ThreadFactory {
        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable) { // from class: o.setForceDefaultLicenseUri.read.3
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    static final class RemoteActionCompatParcelizer implements ThreadFactory {
        final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        final boolean RemoteActionCompatParcelizer;
        private final ThreadFactory read;
        private final AtomicInteger write = new AtomicInteger();

        RemoteActionCompatParcelizer(ThreadFactory threadFactory, String str, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            this.read = threadFactory;
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Thread threadNewThread = this.read.newThread(new Runnable() { // from class: o.setForceDefaultLicenseUri.RemoteActionCompatParcelizer.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        RemoteActionCompatParcelizer.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(th);
                    }
                }
            });
            StringBuilder sb = new StringBuilder("glide-");
            sb.append(this.IconCompatParcelizer);
            sb.append("-thread-");
            sb.append(this.write.getAndIncrement());
            threadNewThread.setName(sb.toString());
            return threadNewThread;
        }
    }

    public static final class write {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private long MediaBrowserCompatItemReceiver;
        private final boolean RemoteActionCompatParcelizer;
        private String write;
        private ThreadFactory read = new read(0);
        private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer.read;

        write(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        public final write RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final write IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        public final setForceDefaultLicenseUri read() {
            if (TextUtils.isEmpty(this.write)) {
                StringBuilder sb = new StringBuilder("Name must be non-null and non-empty, but given: ");
                sb.append(this.write);
                throw new IllegalArgumentException(sb.toString());
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new RemoteActionCompatParcelizer(this.read, this.write, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer));
            if (this.MediaBrowserCompatItemReceiver != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new setForceDefaultLicenseUri(threadPoolExecutor);
        }
    }
}
