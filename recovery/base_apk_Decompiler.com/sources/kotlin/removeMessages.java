package kotlin;

import com.marrow2.data.user.remote.model.onboarding.AccountSelectionRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class removeMessages {
    public static final AccountSelectionRequestBody RemoteActionCompatParcelizer(isYuvTargetExtensionSupported isyuvtargetextensionsupported, String str) {
        toMagicModuleMetaRepoModel.write(isyuvtargetextensionsupported, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return AccountSelectionRequestBody.copy$default(new AccountSelectionRequestBody(isyuvtargetextensionsupported.write(), isyuvtargetextensionsupported.read(), isyuvtargetextensionsupported.AudioAttributesCompatParcelizer(), isyuvtargetextensionsupported.IconCompatParcelizer(), null, null, 48, null), null, null, null, false, null, str, 31, null);
    }
}
