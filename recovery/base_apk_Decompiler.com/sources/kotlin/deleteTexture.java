package kotlin;

import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteTexture {
    public static final destroyEglSurface RemoteActionCompatParcelizer(SaveUserResponseModel saveUserResponseModel) {
        toMagicModuleMetaRepoModel.write(saveUserResponseModel, "");
        String userId = saveUserResponseModel.getUserId();
        String str = userId == null ? "" : userId;
        String firstName = saveUserResponseModel.getFirstName();
        String str2 = firstName == null ? "" : firstName;
        String lastName = saveUserResponseModel.getLastName();
        String profession = saveUserResponseModel.getProfession();
        String profilePic = saveUserResponseModel.getProfilePic();
        String str3 = profilePic == null ? "" : profilePic;
        int kycStatus = saveUserResponseModel.getKycStatus();
        int kycFailureCount = saveUserResponseModel.getKycFailureCount();
        long createdOn = saveUserResponseModel.getCreatedOn();
        String firstName2 = saveUserResponseModel.getFirstName();
        if (firstName2 == null) {
            firstName2 = "";
        }
        String strWrite = write(firstName2, saveUserResponseModel.getLastName());
        CollegeDetails college = saveUserResponseModel.getCollege();
        String clg_name = college != null ? college.getClg_name() : null;
        String str4 = clg_name == null ? "" : clg_name;
        CollegeDetails college2 = saveUserResponseModel.getCollege();
        String curr_year = college2 != null ? college2.getCurr_year() : null;
        String str5 = curr_year == null ? "" : curr_year;
        String firstName3 = saveUserResponseModel.getFirstName();
        if (firstName3 == null) {
            firstName3 = "";
        }
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(firstName3);
        PhoneNumberDetails phoneNumber = saveUserResponseModel.getPhoneNumber();
        CollegeDetails college3 = saveUserResponseModel.getCollege();
        String state_id = college3 != null ? college3.getState_id() : null;
        String str6 = state_id == null ? "" : state_id;
        CollegeDetails college4 = saveUserResponseModel.getCollege();
        String country = college4 != null ? college4.getCountry() : null;
        String str7 = country == null ? "" : country;
        CollegeDetails college5 = saveUserResponseModel.getCollege();
        String clg_id = college5 != null ? college5.getClg_id() : null;
        String str8 = clg_id == null ? "" : clg_id;
        CollegeDetails college6 = saveUserResponseModel.getCollege();
        String year_of_admission = college6 != null ? college6.getYear_of_admission() : null;
        String str9 = year_of_admission == null ? "" : year_of_admission;
        CollegeDetails college7 = saveUserResponseModel.getCollege();
        int yop = college7 != null ? college7.getYop() : -1;
        CollegeDetails college8 = saveUserResponseModel.getCollege();
        int mbbs_verified_year = college8 != null ? college8.getMbbs_verified_year() : 0;
        CollegeDetails college9 = saveUserResponseModel.getCollege();
        long verified_on = college9 != null ? college9.getVerified_on() : -1L;
        CollegeDetails college10 = saveUserResponseModel.getCollege();
        return new destroyEglSurface(str, str2, lastName, profession, str3, kycStatus, kycFailureCount, createdOn, strWrite, str4, str5, strRemoteActionCompatParcelizer, phoneNumber, str6, str7, str8, str9, yop, mbbs_verified_year, verified_on, college10 != null ? college10.isUserCollegeDataAvailable() : false);
    }

    private static String write(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) ".")) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static String RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            return String.valueOf(str.charAt(0));
        } catch (Exception unused) {
            return "";
        }
    }
}
