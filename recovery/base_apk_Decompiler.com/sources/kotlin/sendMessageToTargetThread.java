package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class sendMessageToTargetThread implements resolvePositionForPlaylistChange {
    private final mediaSourceListUpdateRequestedInternal AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final resetPendingPauseAtEndOfPeriod RemoteActionCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal read;
    private final String write;

    public sendMessageToTargetThread(String str, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod, boolean z) {
        this.write = str;
        this.read = mediasourcelistupdaterequestedinternal;
        this.AudioAttributesCompatParcelizer = mediasourcelistupdaterequestedinternal2;
        this.RemoteActionCompatParcelizer = resetpendingpauseatendofperiod;
        this.IconCompatParcelizer = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final mediaSourceListUpdateRequestedInternal read() {
        return this.read;
    }

    public final mediaSourceListUpdateRequestedInternal IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final resetPendingPauseAtEndOfPeriod write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda1(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }
}
