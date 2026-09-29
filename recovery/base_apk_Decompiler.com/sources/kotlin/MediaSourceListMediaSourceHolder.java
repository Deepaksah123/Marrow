package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListMediaSourceHolder extends MediaSourceListForwardingEventListenerExternalSyntheticLambda9<String> {
    private String AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListMediaSourceHolder(String str, String str2) {
        super(str, 0, str2);
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = str2;
    }

    @Override // kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda11
    public final boolean AudioAttributesCompatParcelizer() {
        String string;
        String str = this.write;
        boolean z = ((str == null || (string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) str).toString()) == null) ? -1 : string.length()) <= this.RemoteActionCompatParcelizer;
        if (z) {
            onDrmSessionAcquired.IconCompatParcelizer();
        }
        return !z;
    }
}
