package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class isStalled extends MagicModuleUseCase implements getAnswerMap {
    public static final isStalled AudioAttributesCompatParcelizer = new isStalled();

    public isStalled() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Number) obj).longValue() == 0);
    }
}
