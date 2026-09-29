package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getStatusUpdateStartTimeMs extends getOption7AnsweredCount<Long> {
    public getStatusUpdateStartTimeMs(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return IconCompatParcelizer(gettopsection);
    }

    private static getHref IconCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefOnAddQueueItem = gettopsection.write().onAddQueueItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnAddQueueItem, "");
        return gethrefOnAddQueueItem;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().longValue());
        sb.append(".toLong()");
        return sb.toString();
    }
}
