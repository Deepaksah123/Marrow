package kotlin;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class setMediaClockPlaybackParameters implements resolvePositionForPlaylistChange {
    private final boolean AudioAttributesCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi26Parcelizer;
    private final resolvePendingMessagePosition<PointF, PointF> AudioAttributesImplBaseParcelizer;
    private final mediaSourceListUpdateRequestedInternal IconCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal MediaBrowserCompatCustomActionResultReceiver;
    private final mediaSourceListUpdateRequestedInternal MediaBrowserCompatItemReceiver;
    private final RemoteActionCompatParcelizer MediaDescriptionCompat;
    private final mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    public enum RemoteActionCompatParcelizer {
        STAR(1),
        POLYGON(2);

        private final int RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : values()) {
                if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == i) {
                    return remoteActionCompatParcelizer;
                }
            }
            return null;
        }
    }

    public setMediaClockPlaybackParameters(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal5, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal6, boolean z, boolean z2) {
        this.read = str;
        this.MediaDescriptionCompat = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = mediasourcelistupdaterequestedinternal;
        this.AudioAttributesImplBaseParcelizer = resolvependingmessageposition;
        this.MediaBrowserCompatItemReceiver = mediasourcelistupdaterequestedinternal2;
        this.IconCompatParcelizer = mediasourcelistupdaterequestedinternal3;
        this.MediaBrowserCompatCustomActionResultReceiver = mediasourcelistupdaterequestedinternal4;
        this.RemoteActionCompatParcelizer = mediasourcelistupdaterequestedinternal5;
        this.AudioAttributesImplApi21Parcelizer = mediasourcelistupdaterequestedinternal6;
        this.write = z;
        this.AudioAttributesCompatParcelizer = z2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final resolvePendingMessagePosition<PointF, PointF> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final mediaSourceListUpdateRequestedInternal write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }
}
