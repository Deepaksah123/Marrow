package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onSystemTimeUsMismatch extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ setPassthroughBufferDurationUs read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onSystemTimeUsMismatch(setPassthroughBufferDurationUs setpassthroughbufferdurationus) {
        super(1);
        this.read = setpassthroughbufferdurationus;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        this.read.read = ((Number) obj).intValue();
        this.read.MediaBrowserCompatCustomActionResultReceiver = buildAudioTrackWithRetry.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}
