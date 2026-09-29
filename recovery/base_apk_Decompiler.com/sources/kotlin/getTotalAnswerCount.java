package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalAnswerCount extends getOption7AnsweredCount<Short> {
    public getTotalAnswerCount(short s) {
        super(Short.valueOf(s));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return IconCompatParcelizer(gettopsection);
    }

    private static getHref IconCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefOnPause = gettopsection.write().onPause();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnPause, "");
        return gethrefOnPause;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().intValue());
        sb.append(".toShort()");
        return sb.toString();
    }
}
