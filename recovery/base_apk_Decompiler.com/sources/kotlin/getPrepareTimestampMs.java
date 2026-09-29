package kotlin;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrepareTimestampMs {
    private static final Collection<CoroutineExceptionHandler> RemoteActionCompatParcelizer = StateResult.MediaBrowserCompatItemReceiver(StateResult.read(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final Collection<CoroutineExceptionHandler> IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final void read(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
