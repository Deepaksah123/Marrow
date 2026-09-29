package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public interface updateSampleIndex extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    Mp4ExtractorExternalSyntheticLambda0<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    <T> Mp4ExtractorExternalSyntheticLambda0<T> submit(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService, kotlin.updateSampleIndex
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    <T> Mp4ExtractorExternalSyntheticLambda0<T> submit(Runnable runnable, T t);
}
