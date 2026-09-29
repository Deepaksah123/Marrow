package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeUpdateLatency extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ MagicModuleUseCase IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public maybeUpdateLatency(getCreatedOnDateMs getcreatedondatems) {
        super(0);
        this.IconCompatParcelizer = (MagicModuleUseCase) getcreatedondatems;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.MagicModuleUseCase, o.getCreatedOnDateMs] */
    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        this.IconCompatParcelizer.invoke();
        return getShowPopup.INSTANCE;
    }
}
