package kotlin;

import in.juspay.hyper.constants.LogSubCategory;
import kotlin.MarrowTheme;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class toOldModel implements MarrowTheme {
    private final FilterParamsCreator AudioAttributesCompatParcelizer;
    private final ComplainRequestBody read;
    private final String write;

    public toOldModel(String str, FilterParamsCreator filterParamsCreator, ComplainRequestBody complainRequestBody) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(complainRequestBody, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = filterParamsCreator;
        this.read = complainRequestBody;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        getError_types geterror_types = getError_types.INSTANCE;
        String strWrite = getError_types.write(strValueOf, this.write, LogSubCategory.LifeCycle.ANDROID);
        CustomModuleQuotaModelKt customModuleQuotaModelKt = CustomModuleQuotaModelKt.read;
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer IconCompatParcelizer = themeKtExternalSyntheticLambda0IconCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer("Dr-Dv-Ts", strValueOf).IconCompatParcelizer("Dr-Dv-ENC", CustomModuleQuotaModelKt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, strWrite, strValueOf));
        read(IconCompatParcelizer, strValueOf);
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    private final void read(ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer, String str) {
        if (this.read.RemoteActionCompatParcelizer()) {
            String str2 = this.read.read(str, str);
            if (str2 == null) {
                str2 = "";
            }
            iconCompatParcelizer.IconCompatParcelizer("Dr-Dv-ENC2", str2);
        }
    }
}
