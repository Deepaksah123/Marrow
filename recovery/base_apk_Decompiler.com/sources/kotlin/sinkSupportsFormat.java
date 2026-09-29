package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class sinkSupportsFormat extends MagicModuleUseCase implements getAnswerMap {
    public static final sinkSupportsFormat IconCompatParcelizer = new sinkSupportsFormat();

    public sinkSupportsFormat() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((String) obj).length() == 0);
    }
}
