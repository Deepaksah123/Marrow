package kotlin;

import java.util.List;
import kotlin.setSeekParametersInternal;

/* JADX INFO: loaded from: classes2.dex */
public final class seekToCurrentPosition implements resolvePositionForPlaylistChange {
    private final notifyTrackSelectionDiscontinuity AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final float AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final seekToPeriodPosition IconCompatParcelizer;
    private final setSeekParametersInternal.RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final List<mediaSourceListUpdateRequestedInternal> MediaBrowserCompatItemReceiver;
    private final notifyTrackSelectionPlayWhenReadyChanged MediaBrowserCompatSearchResultReceiver;
    private final releaseInternal MediaDescriptionCompat;
    private final mediaSourceListUpdateRequestedInternal MediaMetadataCompat;
    private final setSeekParametersInternal.IconCompatParcelizer RemoteActionCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal read;
    private final releaseInternal write;

    public seekToCurrentPosition(String str, seekToPeriodPosition seektoperiodposition, notifyTrackSelectionDiscontinuity notifytrackselectiondiscontinuity, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, releaseInternal releaseinternal, releaseInternal releaseinternal2, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, setSeekParametersInternal.IconCompatParcelizer iconCompatParcelizer, setSeekParametersInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer, float f, List<mediaSourceListUpdateRequestedInternal> list, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, boolean z) {
        this.AudioAttributesImplApi21Parcelizer = str;
        this.IconCompatParcelizer = seektoperiodposition;
        this.AudioAttributesCompatParcelizer = notifytrackselectiondiscontinuity;
        this.MediaBrowserCompatSearchResultReceiver = notifytrackselectionplaywhenreadychanged;
        this.MediaDescriptionCompat = releaseinternal;
        this.write = releaseinternal2;
        this.MediaMetadataCompat = mediasourcelistupdaterequestedinternal;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = f;
        this.MediaBrowserCompatItemReceiver = list;
        this.read = mediasourcelistupdaterequestedinternal2;
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final seekToPeriodPosition AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final notifyTrackSelectionDiscontinuity read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final releaseInternal MediaBrowserCompatMediaItem() {
        return this.MediaDescriptionCompat;
    }

    public final releaseInternal write() {
        return this.write;
    }

    public final mediaSourceListUpdateRequestedInternal RatingCompat() {
        return this.MediaMetadataCompat;
    }

    public final setSeekParametersInternal.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setSeekParametersInternal.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<mediaSourceListUpdateRequestedInternal> AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final mediaSourceListUpdateRequestedInternal IconCompatParcelizer() {
        return this.read;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new onVideoSizeChanged(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }
}
