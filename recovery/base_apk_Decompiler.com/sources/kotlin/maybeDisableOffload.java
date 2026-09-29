package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeDisableOffload extends MagicModuleUseCase implements getAnswerMap {
    public static final maybeDisableOffload read = new maybeDisableOffload();

    public maybeDisableOffload() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Number) obj).intValue() == 0);
    }
}
