package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class calculateAccumulatedSampleSizes<V> extends brandToFileType<V> implements Mp4ExtractorExternalSyntheticLambda0<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.brandToFileType
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public abstract Mp4ExtractorExternalSyntheticLambda0<? extends V> delegate();

    protected calculateAccumulatedSampleSizes() {
    }

    @Override // kotlin.Mp4ExtractorExternalSyntheticLambda0
    public final void IconCompatParcelizer(Runnable runnable, Executor executor) {
        delegate().IconCompatParcelizer(runnable, executor);
    }

    public static abstract class IconCompatParcelizer<V> extends calculateAccumulatedSampleSizes<V> {
        private final Mp4ExtractorExternalSyntheticLambda0<V> read;

        protected IconCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0<V> mp4ExtractorExternalSyntheticLambda0) {
            this.read = (Mp4ExtractorExternalSyntheticLambda0) parseStsd.IconCompatParcelizer(mp4ExtractorExternalSyntheticLambda0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.calculateAccumulatedSampleSizes, kotlin.brandToFileType
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Mp4ExtractorExternalSyntheticLambda0<V> delegate() {
            return this.read;
        }
    }
}
