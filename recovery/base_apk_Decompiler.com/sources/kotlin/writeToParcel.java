package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class writeToParcel extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final writeToParcel write = new writeToParcel();

    public writeToParcel() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return applyMediaPositionParameters.AudioAttributesCompatParcelizer.write();
    }
}
