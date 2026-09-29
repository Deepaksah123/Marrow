package kotlin;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class sendMessageInternal implements resolvePositionForPlaylistChange {
    private final seekToPeriodPosition AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesImplBaseParcelizer;
    private final notifyTrackSelectionDiscontinuity IconCompatParcelizer;
    private final releaseInternal MediaBrowserCompatItemReceiver;
    private final Path.FillType RemoteActionCompatParcelizer;
    private final releaseInternal read;
    private final boolean write;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer = null;
    private final mediaSourceListUpdateRequestedInternal MediaBrowserCompatCustomActionResultReceiver = null;

    public sendMessageInternal(String str, seekToPeriodPosition seektoperiodposition, Path.FillType fillType, notifyTrackSelectionDiscontinuity notifytrackselectiondiscontinuity, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, releaseInternal releaseinternal, releaseInternal releaseinternal2, boolean z) {
        this.AudioAttributesCompatParcelizer = seektoperiodposition;
        this.RemoteActionCompatParcelizer = fillType;
        this.IconCompatParcelizer = notifytrackselectiondiscontinuity;
        this.AudioAttributesImplBaseParcelizer = notifytrackselectionplaywhenreadychanged;
        this.MediaBrowserCompatItemReceiver = releaseinternal;
        this.read = releaseinternal2;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.write = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final seekToPeriodPosition read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Path.FillType IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final notifyTrackSelectionDiscontinuity write() {
        return this.IconCompatParcelizer;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final releaseInternal MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final releaseInternal RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.write;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new onVideoSurfaceDestroyed(exoPlayerImplExternalSyntheticLambda6, exoPlayerImplExternalSyntheticLambda19, setshufflemodeenabledinternal, this);
    }
}
