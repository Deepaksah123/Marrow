package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlayWhenReadyInternal implements resolvePositionForPlaylistChange {
    private final String IconCompatParcelizer;
    private final resolvePendingMessagePosition<Float, Float> RemoteActionCompatParcelizer;

    public setPlayWhenReadyInternal(String str, resolvePendingMessagePosition<Float, Float> resolvependingmessageposition) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = resolvependingmessageposition;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final resolvePendingMessagePosition<Float, Float> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new surfaceCreated(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }
}
