package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybePollAndCheckTimestamp extends MagicModuleUseCase implements getAnswerMap {
    public static final maybePollAndCheckTimestamp AudioAttributesCompatParcelizer = new maybePollAndCheckTimestamp();

    public maybePollAndCheckTimestamp() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((String) obj).length() == 0);
    }
}
