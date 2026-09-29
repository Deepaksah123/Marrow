package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeSampleSyncParams extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ replaceOutputBuffer IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maybeSampleSyncParams(replaceOutputBuffer replaceoutputbuffer) {
        super(0);
        this.IconCompatParcelizer = replaceoutputbuffer;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer.read();
    }
}
