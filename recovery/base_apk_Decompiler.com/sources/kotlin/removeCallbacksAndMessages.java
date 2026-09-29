package kotlin;

import com.marrow2.data.user.remote.model.LoginRequestBody;
import com.marrow2.data.user.remote.model.SignUpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class removeCallbacksAndMessages {
    public static final LoginRequestBody IconCompatParcelizer(isBt2020PqExtensionSupported isbt2020pqextensionsupported, String str) {
        toMagicModuleMetaRepoModel.write(isbt2020pqextensionsupported, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return LoginRequestBody.copy$default(new LoginRequestBody(isbt2020pqextensionsupported.getRemoteActionCompatParcelizer(), isbt2020pqextensionsupported.getIconCompatParcelizer(), isbt2020pqextensionsupported.getRead(), null, null, 24, null), null, null, null, null, str, 15, null);
    }

    public static final SignUpRequestBody read(hasMessages hasmessages, String str) {
        toMagicModuleMetaRepoModel.write(hasmessages, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new SignUpRequestBody(hasmessages.getRemoteActionCompatParcelizer(), hasmessages.getIconCompatParcelizer(), hasmessages.getWrite(), null, hasmessages.getAudioAttributesCompatParcelizer(), str, 8, null);
    }
}
