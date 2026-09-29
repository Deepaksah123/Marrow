package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setMinPcmBufferDurationUs extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ MagicModuleUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setMinPcmBufferDurationUs(getAnswerMap getanswermap) {
        super(0);
        this.write = (MagicModuleUseCase) getanswermap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.MagicModuleUseCase, o.getAnswerMap] */
    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return this.write.invoke(moveNewSamplesToPitchBuffer.RemoteActionCompatParcelizer);
    }
}
