package kotlin;

import kotlin.setVisibleXRange;

/* JADX INFO: loaded from: classes2.dex */
public final class setScaleMinima implements setDrawHoleEnabled {
    private final setDrawSliceText RemoteActionCompatParcelizer;

    public setScaleMinima(setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        this.RemoteActionCompatParcelizer = setdrawslicetext;
    }

    public final setDrawSliceText read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setDrawHoleEnabled
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setVisibleXRange IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        setVisibleXRange.Companion writeVar = setVisibleXRange.INSTANCE;
        return setVisibleXRange.Companion.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str);
    }

    @Override // kotlin.setDrawHoleEnabled, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }
}
