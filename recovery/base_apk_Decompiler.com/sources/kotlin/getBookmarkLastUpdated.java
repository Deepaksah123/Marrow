package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getBookmarkLastUpdated extends getOption7AnsweredCount<Byte> {
    public getBookmarkLastUpdated(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return write(gettopsection);
    }

    private static getHref write(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefMediaBrowserCompatItemReceiver = gettopsection.write().MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefMediaBrowserCompatItemReceiver, "");
        return gethrefMediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().intValue());
        sb.append(".toByte()");
        return sb.toString();
    }
}
