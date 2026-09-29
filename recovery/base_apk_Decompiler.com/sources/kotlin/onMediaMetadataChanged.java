package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onMediaMetadataChanged {
    public static final onSeekForwardIncrementChanged write(setTileCountVertical<? extends Object> settilecountvertical) {
        toMagicModuleMetaRepoModel.write(settilecountvertical, "");
        if (RemoteActionCompatParcelizer(settilecountvertical)) {
            return new onSeekForwardIncrementChanged(settilecountvertical.handleMediaPlayPauseIfPendingOnHandler(), settilecountvertical.onAddQueueItem());
        }
        return null;
    }

    private static boolean RemoteActionCompatParcelizer(setTileCountVertical<? extends Object> settilecountvertical) {
        toMagicModuleMetaRepoModel.write(settilecountvertical, "");
        return onLoadingChanged.RemoteActionCompatParcelizer(settilecountvertical.handleMediaPlayPauseIfPendingOnHandler()) && onLoadingChanged.RemoteActionCompatParcelizer(settilecountvertical.onAddQueueItem());
    }

    public static final onSeekForwardIncrementChanged read(long j) {
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.RemoteActionCompatParcelizer(j) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : Integer.MIN_VALUE;
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesCompatParcelizer(j) ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) : Integer.MIN_VALUE;
        if (onLoadingChanged.RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer) && onLoadingChanged.RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer)) {
            return new onSeekForwardIncrementChanged(iAudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer);
        }
        return null;
    }
}
