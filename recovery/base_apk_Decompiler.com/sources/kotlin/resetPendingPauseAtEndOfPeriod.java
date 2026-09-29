package kotlin;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class resetPendingPauseAtEndOfPeriod implements resolvePositionForPlaylistChange {
    private final mediaSourceListUpdateRequestedInternal AudioAttributesCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi26Parcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer;
    private final notifyTrackSelectionRebuffer IconCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal MediaBrowserCompatCustomActionResultReceiver;
    private final releaseRenderers MediaBrowserCompatItemReceiver;
    private final resolvePendingMessagePosition<PointF, PointF> RemoteActionCompatParcelizer;
    private final notifyTrackSelectionPlayWhenReadyChanged read;
    private boolean write;

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return null;
    }

    public resetPendingPauseAtEndOfPeriod() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public resetPendingPauseAtEndOfPeriod(notifyTrackSelectionRebuffer notifytrackselectionrebuffer, resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition, releaseRenderers releaserenderers, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal5) {
        this.write = false;
        this.IconCompatParcelizer = notifytrackselectionrebuffer;
        this.RemoteActionCompatParcelizer = resolvependingmessageposition;
        this.MediaBrowserCompatItemReceiver = releaserenderers;
        this.AudioAttributesImplBaseParcelizer = mediasourcelistupdaterequestedinternal;
        this.read = notifytrackselectionplaywhenreadychanged;
        this.AudioAttributesImplApi21Parcelizer = mediasourcelistupdaterequestedinternal2;
        this.AudioAttributesCompatParcelizer = mediasourcelistupdaterequestedinternal3;
        this.MediaBrowserCompatCustomActionResultReceiver = mediasourcelistupdaterequestedinternal4;
        this.AudioAttributesImplApi26Parcelizer = mediasourcelistupdaterequestedinternal5;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write = z;
    }

    public final notifyTrackSelectionRebuffer read() {
        return this.IconCompatParcelizer;
    }

    public final resolvePendingMessagePosition<PointF, PointF> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final releaseRenderers MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean MediaDescriptionCompat() {
        return this.write;
    }

    public final addMediaItemsInternal RemoteActionCompatParcelizer() {
        return new addMediaItemsInternal(this);
    }
}
