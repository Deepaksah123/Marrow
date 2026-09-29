package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda6 extends MediaSourceListForwardingEventListenerExternalSyntheticLambda9<List<? extends Object>> {
    private int IconCompatParcelizer;
    private final List<Object> RemoteActionCompatParcelizer;
    private String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListForwardingEventListenerExternalSyntheticLambda6(List<? extends Object> list, String str) {
        super(list, 3, str);
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = 3;
        this.write = str;
    }

    @Override // kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda11
    public final boolean AudioAttributesCompatParcelizer() {
        List<Object> list = this.RemoteActionCompatParcelizer;
        boolean z = list == null || list.size() != this.IconCompatParcelizer;
        if (z) {
            onDrmSessionAcquired.IconCompatParcelizer();
        }
        return !z;
    }
}
