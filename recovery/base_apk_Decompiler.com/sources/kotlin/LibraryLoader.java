package kotlin;

import com.marrow2.data.user.remote.model.onboarding.OtpVerifyRequestBody;
import com.marrow2.data.user.remote.model.onboarding.PhoneLoginRequestBody;
import com.marrow2.data.user.remote.model.onboarding.PhoneLoginResponseBody;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class LibraryLoader {
    public static final PhoneLoginRequestBody IconCompatParcelizer(createEglPbufferSurface createeglpbuffersurface, String str) {
        toMagicModuleMetaRepoModel.write(createeglpbuffersurface, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return PhoneLoginRequestBody.copy$default(new PhoneLoginRequestBody(createeglpbuffersurface.getOtpRetryType().getKey(), createeglpbuffersurface.getPhoneNumberDetails(), createeglpbuffersurface.getForceLogin(), null, null, createeglpbuffersurface.getOtpDeliveryChannel(), 24, null), null, null, false, null, str, null, 47, null);
    }

    public static final getEglConfig read(PhoneLoginResponseBody phoneLoginResponseBody) {
        toMagicModuleMetaRepoModel.write(phoneLoginResponseBody, "");
        return new getEglConfig(phoneLoginResponseBody.getIs_sent(), phoneLoginResponseBody.getMsg(), phoneLoginResponseBody.getIsWhatsappOtpAllowed(), phoneLoginResponseBody.getDisplayWhatsappCountdown());
    }

    public static final OtpVerifyRequestBody write(focusRenderTarget focusrendertarget, String str) {
        toMagicModuleMetaRepoModel.write(focusrendertarget, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return OtpVerifyRequestBody.copy$default(new OtpVerifyRequestBody(new PhoneNumberDetails(focusrendertarget.IconCompatParcelizer(), focusrendertarget.read(), 0, 4, null), false, null, focusrendertarget.RemoteActionCompatParcelizer(), null, 22, null), null, false, null, null, str, 15, null);
    }
}
