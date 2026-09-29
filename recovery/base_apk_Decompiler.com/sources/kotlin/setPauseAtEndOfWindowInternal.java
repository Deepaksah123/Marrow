package kotlin;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class setPauseAtEndOfWindowInternal implements resolvePositionForPlaylistChange {
    private final boolean AudioAttributesCompatParcelizer;
    private final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesImplBaseParcelizer;
    private final maybeUpdateReadingRenderers IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final Path.FillType write;

    public setPauseAtEndOfWindowInternal(String str, boolean z, Path.FillType fillType, maybeUpdateReadingRenderers maybeupdatereadingrenderers, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, boolean z2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
        this.write = fillType;
        this.IconCompatParcelizer = maybeupdatereadingrenderers;
        this.AudioAttributesImplBaseParcelizer = notifytrackselectionplaywhenreadychanged;
        this.AudioAttributesCompatParcelizer = z2;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final maybeUpdateReadingRenderers AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final Path.FillType read() {
        return this.write;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new onVideoDecoderReleased(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
