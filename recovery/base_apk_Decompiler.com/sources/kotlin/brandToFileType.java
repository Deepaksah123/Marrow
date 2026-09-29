package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class brandToFileType<V> extends getDrmInitDataFromAtoms implements Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.getDrmInitDataFromAtoms
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> delegate();

    protected brandToFileType() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return delegate().get(j, timeUnit);
    }
}
