package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda5 extends MediaSourceListForwardingEventListenerExternalSyntheticLambda9<List<? extends Object>> {
    private int AudioAttributesCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private final List<Object> write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListForwardingEventListenerExternalSyntheticLambda5(List<? extends Object> list, int i, String str) {
        super(list, i, str);
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = list;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda11
    public final boolean AudioAttributesCompatParcelizer() {
        List<Object> list = this.write;
        boolean z = list == null || list.size() < this.AudioAttributesCompatParcelizer;
        if (z) {
            onDrmSessionAcquired.IconCompatParcelizer();
        }
        return !z;
    }
}
