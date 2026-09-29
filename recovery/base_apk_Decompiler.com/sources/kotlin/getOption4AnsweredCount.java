package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getOption4AnsweredCount extends getMagicLine<Float> {
    public getOption4AnsweredCount(float f) {
        super(Float.valueOf(f));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return RemoteActionCompatParcelizer(gettopsection);
    }

    private static getHref RemoteActionCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefMediaBrowserCompatMediaItem = gettopsection.write().MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefMediaBrowserCompatMediaItem, "");
        return gethrefMediaBrowserCompatMediaItem;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().floatValue());
        sb.append(".toFloat()");
        return sb.toString();
    }
}
