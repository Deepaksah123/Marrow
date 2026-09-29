package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
final class setBookmarked implements Callable<Void>, MarkIncompleteResponseBody {
    private static FutureTask<Void> write = new FutureTask<>(toVideoBookmarkTimeline.read, null);
    private ExecutorService AudioAttributesCompatParcelizer;
    private Runnable MediaBrowserCompatCustomActionResultReceiver;
    private Thread RemoteActionCompatParcelizer;
    private AtomicReference<Future<?>> IconCompatParcelizer = new AtomicReference<>();
    private AtomicReference<Future<?>> read = new AtomicReference<>();

    setBookmarked(Runnable runnable, ExecutorService executorService) {
        this.MediaBrowserCompatCustomActionResultReceiver = runnable;
        this.AudioAttributesCompatParcelizer = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.RemoteActionCompatParcelizer = Thread.currentThread();
        try {
            this.MediaBrowserCompatCustomActionResultReceiver.run();
            write(this.AudioAttributesCompatParcelizer.submit(this));
            this.RemoteActionCompatParcelizer = null;
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer = null;
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
        return null;
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        AtomicReference<Future<?>> atomicReference = this.IconCompatParcelizer;
        FutureTask<Void> futureTask = write;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
        }
        Future<?> andSet2 = this.read.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return this.IconCompatParcelizer.get() == write;
    }

    final void read(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.IconCompatParcelizer.get();
            if (future2 == write) {
                future.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
                return;
            }
        } while (!setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, future2, future));
    }

    private void write(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.read.get();
            if (future2 == write) {
                future.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
                return;
            }
        } while (!setBackInvokedCallbackEnabled.read(this.read, future2, future));
    }
}
