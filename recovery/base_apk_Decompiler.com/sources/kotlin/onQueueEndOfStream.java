package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onQueueEndOfStream extends MagicModuleUseCase implements getAnswerMap {
    public static final onQueueEndOfStream AudioAttributesCompatParcelizer = new onQueueEndOfStream();

    public onQueueEndOfStream() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Number) obj).longValue() == 0);
    }
}
