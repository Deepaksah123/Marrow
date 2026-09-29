package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalFramesDropped<T> implements getValidationToken<T> {
    private final UserConfigSerializer<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getTotalFramesDropped(UserConfigSerializer<? super T> userConfigSerializer) {
        this.read = userConfigSerializer;
    }

    @Override // kotlin.getValidationToken
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(t, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
