package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getAbandonedBeforeReadyRatio extends MagicModuleUseCase implements getAnswerMap {
    public static final getAbandonedBeforeReadyRatio AudioAttributesCompatParcelizer = new getAbandonedBeforeReadyRatio();

    public getAbandonedBeforeReadyRatio() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return String.format("%02x", Byte.valueOf(((Number) obj).byteValue()));
    }
}
