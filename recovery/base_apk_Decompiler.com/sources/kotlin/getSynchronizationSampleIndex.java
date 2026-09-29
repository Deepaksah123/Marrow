package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.setFormatGaplessInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class getSynchronizationSampleIndex<V> extends processFtypAtom<V> {

    static abstract class RemoteActionCompatParcelizer<V> extends getSynchronizationSampleIndex<V> implements setFormatGaplessInfo.AudioAttributesImplApi21Parcelizer<V> {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // kotlin.setFormatGaplessInfo, kotlin.Mp4ExtractorExternalSyntheticLambda0
        public final void IconCompatParcelizer(Runnable runnable, Executor executor) {
            super.IconCompatParcelizer(runnable, executor);
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    getSynchronizationSampleIndex() {
    }
}
