package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class CreationTime extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ ChannelMixingAudioProcessor AudioAttributesCompatParcelizer;
    private /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationTime(ChannelMixingAudioProcessor channelMixingAudioProcessor, int i) {
        super(0);
        this.AudioAttributesCompatParcelizer = channelMixingAudioProcessor;
        this.read = i;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        this.AudioAttributesCompatParcelizer.invoke(Integer.valueOf(this.read));
        return getShowPopup.INSTANCE;
    }
}
