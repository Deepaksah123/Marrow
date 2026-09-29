package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getOption2AnsweredCount extends getMagicLine<Double> {
    public getOption2AnsweredCount(double d) {
        super(Double.valueOf(d));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return IconCompatParcelizer(gettopsection);
    }

    private static getHref IconCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefMediaBrowserCompatSearchResultReceiver = gettopsection.write().MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefMediaBrowserCompatSearchResultReceiver, "");
        return gethrefMediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().doubleValue());
        sb.append(".toDouble()");
        return sb.toString();
    }
}
