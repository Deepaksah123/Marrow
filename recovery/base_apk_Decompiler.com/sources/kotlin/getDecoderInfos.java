package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getDecoderInfos extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ MagicModuleUseCase read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public getDecoderInfos(getCreatedOnDateMs getcreatedondatems) {
        super(1);
        this.read = (MagicModuleUseCase) getcreatedondatems;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.MagicModuleUseCase, o.getCreatedOnDateMs] */
    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return this.read.invoke();
    }
}
