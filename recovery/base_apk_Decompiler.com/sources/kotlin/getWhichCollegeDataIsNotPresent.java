package kotlin;

import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.get_id;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0003j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0002H\u0016¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0016J)\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\t2\n\u0010)\u001a\u00060\u0003j\u0002`\u00022\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020\fH\u0002J\r\u0010/\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0019H\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\tJ\b\u00104\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u00105\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001a¨\u00068"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "<init>", "()V", "THREAD_NAME", "", "DEFAULT_KEEP_ALIVE_MS", "", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "thread", "getThread", "()Ljava/lang/Thread;", "FRESH", "", "ACTIVE", "SHUTDOWN_REQ", "SHUTDOWN_ACK", "SHUTDOWN", "debugStatus", "isShutDown", "", "()Z", "isShutdownRequested", "enqueue", "", "task", "(Ljava/lang/Runnable;)V", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shutdownError", "shutdown", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "run", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "notifyStartup", "shutdownForTests", "timeout", "acknowledgeShutdownIfNeeded", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getWhichCollegeDataIsNotPresent extends get_id implements Runnable {
    private static final long AudioAttributesCompatParcelizer;
    public static final getWhichCollegeDataIsNotPresent IconCompatParcelizer;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    private getWhichCollegeDataIsNotPresent() {
    }

    static {
        Long l;
        getWhichCollegeDataIsNotPresent getwhichcollegedataisnotpresent = new getWhichCollegeDataIsNotPresent();
        IconCompatParcelizer = getwhichcollegedataisnotpresent;
        getwhichcollegedataisnotpresent.read(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        AudioAttributesCompatParcelizer = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlin.getDisplay
    protected final Thread IconCompatParcelizer() {
        Thread thread = _thread;
        return thread == null ? MediaBrowserCompatMediaItem() : thread;
    }

    private static boolean RatingCompat() {
        return debugStatus == 4;
    }

    private static boolean MediaDescriptionCompat() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // kotlin.get_id
    public final void read(Runnable runnable) {
        if (RatingCompat()) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        super.read(runnable);
    }

    @Override // kotlin.getDisplay
    protected final void write(long j, get_id.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private static void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlin.get_id, kotlin.CollegeJsonParser
    public final void AudioAttributesCompatParcelizer() {
        debugStatus = 4;
        super.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.get_id, kotlin.getCurrentYear
    public final setYearOfPassout read(long j, Runnable runnable, CurrentQuery currentQuery) {
        return AudioAttributesCompatParcelizer(j, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zWrite;
        getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
        getAddLine2.AudioAttributesCompatParcelizer(this);
        try {
            if (!MediaBrowserCompatSearchResultReceiver()) {
                if (zWrite) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                if (jAudioAttributesImplBaseParcelizer == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = AudioAttributesCompatParcelizer + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        MediaMetadataCompat();
                        if (write()) {
                            return;
                        }
                        IconCompatParcelizer();
                        return;
                    }
                    jAudioAttributesImplBaseParcelizer = getQues.AudioAttributesCompatParcelizer(jAudioAttributesImplBaseParcelizer, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jAudioAttributesImplBaseParcelizer > 0) {
                    if (MediaDescriptionCompat()) {
                        _thread = null;
                        MediaMetadataCompat();
                        if (write()) {
                            return;
                        }
                        IconCompatParcelizer();
                        return;
                    }
                    LockSupport.parkNanos(this, jAudioAttributesImplBaseParcelizer);
                }
            }
        } finally {
            _thread = null;
            MediaMetadataCompat();
            if (!write()) {
                IconCompatParcelizer();
            }
        }
    }

    private final Thread MediaBrowserCompatMediaItem() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                getWhichCollegeDataIsNotPresent getwhichcollegedataisnotpresent = IconCompatParcelizer;
                _thread = thread;
                thread.setContextClassLoader(getwhichcollegedataisnotpresent.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final boolean MediaBrowserCompatSearchResultReceiver() {
        synchronized (this) {
            if (MediaDescriptionCompat()) {
                return false;
            }
            debugStatus = 1;
            toMagicModuleMetaRepoModel.read(this, "");
            notifyAll();
            return true;
        }
    }

    private final void MediaMetadataCompat() {
        synchronized (this) {
            if (MediaDescriptionCompat()) {
                debugStatus = 3;
                MediaBrowserCompatItemReceiver();
                toMagicModuleMetaRepoModel.read(this, "");
                notifyAll();
            }
        }
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        return "DefaultExecutor";
    }
}
