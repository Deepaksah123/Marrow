package kotlin;

import android.net.Uri;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class setDeviceMuted extends isDeviceMuted<Uri> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDeviceMuted(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
    }

    @Override // kotlin.isDeviceMuted
    public final /* synthetic */ ThemeAlphaConstantsKt IconCompatParcelizer(Uri uri) {
        return AudioAttributesCompatParcelizer(uri);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ String RemoteActionCompatParcelizer(Object obj) {
        return IconCompatParcelizer2((Uri) obj);
    }

    @Override // kotlin.isDeviceMuted, kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return write((Uri) obj);
    }

    private static boolean write(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "http") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "https");
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String IconCompatParcelizer2(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        String string = uri.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private static ThemeAlphaConstantsKt AudioAttributesCompatParcelizer(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        ThemeAlphaConstantsKt themeAlphaConstantsKtAudioAttributesCompatParcelizer = ThemeAlphaConstantsKt.AudioAttributesCompatParcelizer(uri.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(themeAlphaConstantsKtAudioAttributesCompatParcelizer, "");
        return themeAlphaConstantsKtAudioAttributesCompatParcelizer;
    }
}
