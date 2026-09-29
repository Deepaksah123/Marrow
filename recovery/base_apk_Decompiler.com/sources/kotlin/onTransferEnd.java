package kotlin;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class onTransferEnd implements onTransferInitializing {
    private final parseLongAttr write;

    @setSdkPayload
    public onTransferEnd(parseLongAttr parselongattr) {
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        this.write = parselongattr;
    }

    @Override // kotlin.onTransferInitializing
    public final Object read(Throwable th, String str, HashMap<String, String> map) {
        this.write.read(th, str, map);
        return getShowPopup.INSTANCE;
    }
}
