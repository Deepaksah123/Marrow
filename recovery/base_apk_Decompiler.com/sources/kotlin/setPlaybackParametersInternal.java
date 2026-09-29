package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlaybackParametersInternal implements resolvePositionForPlaylistChange {
    private final replaceStreamsOrDisableRendererForTransition IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    public setPlaybackParametersInternal(String str, int i, replaceStreamsOrDisableRendererForTransition replacestreamsordisablerendererfortransition, boolean z) {
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = replacestreamsordisablerendererfortransition;
        this.write = z;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final replaceStreamsOrDisableRendererForTransition write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda3(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.read);
        sb.append(", index=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
