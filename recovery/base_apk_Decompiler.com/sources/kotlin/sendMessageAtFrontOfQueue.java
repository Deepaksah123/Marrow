package kotlin;

import com.marrow2.data.user.remote.model.onboarding.OtpValidateIntermediateResponseModel;
import com.marrow2.data.user.remote.model.onboarding.OtpValidateRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sendMessageAtFrontOfQueue {
    public static final setToIdentity write(OtpValidateIntermediateResponseModel otpValidateIntermediateResponseModel) {
        toMagicModuleMetaRepoModel.write(otpValidateIntermediateResponseModel, "");
        return new setToIdentity(otpValidateIntermediateResponseModel.getIntermediateToken(), otpValidateIntermediateResponseModel.getUserMini(), sendToTarget.IconCompatParcelizer(otpValidateIntermediateResponseModel));
    }

    public static final OtpValidateRequestBody write(GlUtilApi17 glUtilApi17, String str) {
        toMagicModuleMetaRepoModel.write(glUtilApi17, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return OtpValidateRequestBody.copy$default(new OtpValidateRequestBody(glUtilApi17.getOtp(), glUtilApi17.getPhoneNumberDetails(), glUtilApi17.getForceLogin(), null, null, 24, null), null, null, false, null, str, 15, null);
    }
}
