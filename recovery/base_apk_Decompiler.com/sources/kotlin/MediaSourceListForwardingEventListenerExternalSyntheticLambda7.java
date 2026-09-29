package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda7 extends MediaSourceListForwardingEventListenerExternalSyntheticLambda9<Integer> {
    private int AudioAttributesCompatParcelizer;
    private int read;
    private String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListForwardingEventListenerExternalSyntheticLambda7(int i, String str) {
        super(Integer.valueOf(i), -1, str);
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = i;
        this.read = -1;
        this.write = str;
    }

    @Override // kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda11
    public final boolean AudioAttributesCompatParcelizer() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i == Integer.MIN_VALUE) {
            onDrmSessionAcquired.IconCompatParcelizer();
            return false;
        }
        boolean z = i <= this.read;
        if (z) {
            onDrmSessionAcquired.IconCompatParcelizer();
        }
        return !z;
    }
}
