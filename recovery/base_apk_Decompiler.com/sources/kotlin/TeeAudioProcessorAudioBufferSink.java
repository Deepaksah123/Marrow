package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class TeeAudioProcessorAudioBufferSink extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ int AudioAttributesCompatParcelizer;
    private /* synthetic */ onSystemTimeUsMismatch read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeAudioProcessorAudioBufferSink(onSystemTimeUsMismatch onsystemtimeusmismatch, int i) {
        super(0);
        this.read = onsystemtimeusmismatch;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        this.read.invoke(Integer.valueOf(this.AudioAttributesCompatParcelizer));
        return getShowPopup.INSTANCE;
    }
}
