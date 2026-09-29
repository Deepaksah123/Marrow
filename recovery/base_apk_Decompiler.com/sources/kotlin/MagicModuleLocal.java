package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MagicModuleLocal extends getMonthName {
    public MagicModuleLocal(SampleVideos<Object> sampleVideos) {
        super(sampleVideos);
        if (sampleVideos != null && sampleVideos.getContext() != VideoSessionResponseBody.RemoteActionCompatParcelizer) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // kotlin.SampleVideos
    public CurrentQuery getContext() {
        return VideoSessionResponseBody.RemoteActionCompatParcelizer;
    }
}
