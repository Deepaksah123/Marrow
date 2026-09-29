package kotlin;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
abstract class SdkPayloadKt extends AtomicReference<Future<?>> implements MarkIncompleteResponseBody {
    protected static final FutureTask<Void> AudioAttributesCompatParcelizer = new FutureTask<>(toVideoBookmarkTimeline.read, null);
    private static FutureTask<Void> read = new FutureTask<>(toVideoBookmarkTimeline.read, null);
    protected Thread RemoteActionCompatParcelizer;
    protected final Runnable write;

    SdkPayloadKt(Runnable runnable) {
        this.write = runnable;
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == AudioAttributesCompatParcelizer || future == (futureTask = read) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        Future<?> future = get();
        return future == AudioAttributesCompatParcelizer || future == read;
    }

    public final void read(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == AudioAttributesCompatParcelizer) {
                return;
            }
            if (future2 == read) {
                future.cancel(this.RemoteActionCompatParcelizer != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
