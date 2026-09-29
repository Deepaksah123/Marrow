package kotlin;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes5.dex */
public abstract class parseUint8AttributeValue extends AbstractExecutorService implements updateSampleIndex {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return parseSchemeSpecificData.read(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return parseSchemeSpecificData.AudioAttributesCompatParcelizer((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final Mp4ExtractorExternalSyntheticLambda0<?> submit(Runnable runnable) {
        return (Mp4ExtractorExternalSyntheticLambda0) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: write */
    public final <T> Mp4ExtractorExternalSyntheticLambda0<T> submit(Runnable runnable, T t) {
        return (Mp4ExtractorExternalSyntheticLambda0) super.submit(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final <T> Mp4ExtractorExternalSyntheticLambda0<T> submit(Callable<T> callable) {
        return (Mp4ExtractorExternalSyntheticLambda0) super.submit(callable);
    }
}
