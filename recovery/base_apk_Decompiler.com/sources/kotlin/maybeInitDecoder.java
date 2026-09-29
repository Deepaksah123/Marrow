package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeInitDecoder extends MagicModuleUseCase implements getAnswerMap {
    public static final maybeInitDecoder IconCompatParcelizer = new maybeInitDecoder();

    public maybeInitDecoder() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((String) obj).length() == 0);
    }
}
