package kotlin;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda8 extends MediaSourceListForwardingEventListenerExternalSyntheticLambda9<JSONArray> {
    private String AudioAttributesCompatParcelizer;
    private final JSONArray IconCompatParcelizer;
    private int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListForwardingEventListenerExternalSyntheticLambda8(JSONArray jSONArray, String str) {
        super(jSONArray, 0, str);
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = jSONArray;
        this.read = 0;
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda11
    public final boolean AudioAttributesCompatParcelizer() {
        boolean z = this.IconCompatParcelizer == null;
        if (z) {
            onDrmSessionAcquired.IconCompatParcelizer();
        }
        return !z;
    }
}
