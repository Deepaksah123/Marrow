package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdadrmKeysLoaded1comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher extends drmSessionReleased {
    public lambdadrmKeysLoaded1comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
    }

    @Override // kotlin.drmSessionReleased
    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.reset();
        if (!z) {
            this.IconCompatParcelizer.postTranslate(this.RemoteActionCompatParcelizer.onFastForward(), this.RemoteActionCompatParcelizer.MediaDescriptionCompat() - this.RemoteActionCompatParcelizer.onPlayFromMediaId());
        } else {
            this.IconCompatParcelizer.setTranslate(-(this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() - this.RemoteActionCompatParcelizer.onPlay()), this.RemoteActionCompatParcelizer.MediaDescriptionCompat() - this.RemoteActionCompatParcelizer.onPlayFromMediaId());
            this.IconCompatParcelizer.postScale(-1.0f, 1.0f);
        }
    }
}
