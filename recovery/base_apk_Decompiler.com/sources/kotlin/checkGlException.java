package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class checkGlException implements bindTexture {
    private final getTexId AudioAttributesCompatParcelizer;

    @setSdkPayload
    public checkGlException(getTexId gettexid) {
        toMagicModuleMetaRepoModel.write(gettexid, "");
        this.AudioAttributesCompatParcelizer = gettexid;
    }

    @Override // kotlin.bindTexture
    public final Object write(String str, String str2) {
        return this.AudioAttributesCompatParcelizer.write(str, str2);
    }

    @Override // kotlin.bindTexture
    public final Object read(String str) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.bindTexture
    public final Object IconCompatParcelizer(List<createEglDisplay> list) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.bindTexture
    public final Object IconCompatParcelizer(String str, String str2) {
        return this.AudioAttributesCompatParcelizer.read(str, str2);
    }

    @Override // kotlin.bindTexture
    public final Object AudioAttributesCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }
}
