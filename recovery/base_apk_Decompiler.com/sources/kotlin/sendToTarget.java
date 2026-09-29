package kotlin;

import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.CourseDetail;
import com.marrow2.data.user.remote.model.KYCMetaV2;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.UserConfigV2;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sendToTarget {
    public static final obtainMessage IconCompatParcelizer(SaveUserResponseModel saveUserResponseModel) {
        zaB zab;
        toMagicModuleMetaRepoModel.write(saveUserResponseModel, "");
        String token = saveUserResponseModel.getToken();
        String refreshToken = saveUserResponseModel.getRefreshToken();
        String email = saveUserResponseModel.getEmail();
        boolean emailVerified = saveUserResponseModel.getEmailVerified();
        String userId = saveUserResponseModel.getUserId();
        String profilePic = saveUserResponseModel.getProfilePic();
        String firstName = saveUserResponseModel.getFirstName();
        String lastName = saveUserResponseModel.getLastName();
        PhoneNumberDetails phoneNumber = saveUserResponseModel.getPhoneNumber();
        CollegeDetails college = saveUserResponseModel.getCollege();
        boolean showLegalPopup = saveUserResponseModel.getShowLegalPopup();
        String profession = saveUserResponseModel.getProfession();
        String specialty = saveUserResponseModel.getSpecialty();
        int kycStatus = saveUserResponseModel.getKycStatus();
        int kycFailureCount = saveUserResponseModel.getKycFailureCount();
        long createdOn = saveUserResponseModel.getCreatedOn();
        CourseDetail courseDetail = saveUserResponseModel.getCourseDetail();
        boolean tncConsentRequired = saveUserResponseModel.getTncConsentRequired();
        long tncConsentDate = saveUserResponseModel.getTncConsentDate();
        boolean isYearUpdateRequired = saveUserResponseModel.getIsYearUpdateRequired();
        Map<String, UserConfigV2> userConfig = saveUserResponseModel.getUserConfig();
        KYCMetaV2 kycMeta = saveUserResponseModel.getKycMeta();
        if (kycMeta != null) {
            String userId2 = saveUserResponseModel.getUserId();
            if (userId2 == null) {
                userId2 = "";
            }
            zab = read(kycMeta, userId2);
        } else {
            zab = null;
        }
        return new obtainMessage(token, refreshToken, email, emailVerified, userId, profilePic, firstName, lastName, phoneNumber, college, showLegalPopup, profession, specialty, kycStatus, kycFailureCount, createdOn, courseDetail, tncConsentRequired, tncConsentDate, isYearUpdateRequired, userConfig, zab);
    }

    private static zaB read(KYCMetaV2 kYCMetaV2, String str) {
        toMagicModuleMetaRepoModel.write(kYCMetaV2, "");
        toMagicModuleMetaRepoModel.write(str, "");
        boolean initiateKyc = kYCMetaV2.getInitiateKyc();
        String refreshToken = kYCMetaV2.getRefreshToken();
        String token = kYCMetaV2.getToken();
        String transactionId = kYCMetaV2.getTransactionId();
        String kycStatus = kYCMetaV2.getKycStatus();
        return new zaB(initiateKyc, refreshToken, token, transactionId, kycStatus == null ? "" : kycStatus, kYCMetaV2.getWorkFlowId(), write(str, kYCMetaV2.getDkycToken()), kYCMetaV2.getDeviceCount(), str);
    }

    private static final String write(String str, String str2) {
        return new postDelayed(str).read(str2, "");
    }
}
