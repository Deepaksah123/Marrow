package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getStatusUpdateEndTimeMs extends getMagicLine<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStatusUpdateEndTimeMs(String str) {
        super(str);
        toMagicModuleMetaRepoModel.write(str, "");
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return write(gettopsection);
    }

    private static getHref write(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefOnPrepareFromSearch = gettopsection.write().onPrepareFromSearch();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnPrepareFromSearch, "");
        return gethrefOnPrepareFromSearch;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder("\"");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append('\"');
        return sb.toString();
    }
}
