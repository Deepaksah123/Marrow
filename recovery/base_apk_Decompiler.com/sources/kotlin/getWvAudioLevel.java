package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getWvAudioLevel<T> implements SampleVideos<T>, getNextQuery {
    private final SampleVideos<T> AudioAttributesCompatParcelizer;
    private final CurrentQuery write;

    @Override // kotlin.getNextQuery
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getWvAudioLevel(SampleVideos<? super T> sampleVideos, CurrentQuery currentQuery) {
        this.AudioAttributesCompatParcelizer = sampleVideos;
        this.write = currentQuery;
    }

    @Override // kotlin.SampleVideos
    public final CurrentQuery getContext() {
        return this.write;
    }

    @Override // kotlin.getNextQuery
    public final getNextQuery getCallerFrame() {
        SampleVideos<T> sampleVideos = this.AudioAttributesCompatParcelizer;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object obj) {
        this.AudioAttributesCompatParcelizer.resumeWith(obj);
    }
}
