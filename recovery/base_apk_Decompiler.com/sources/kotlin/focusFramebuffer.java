package kotlin;

import com.marrow.data.models.user.User;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class focusFramebuffer {
    public static final destroyEglSurface RemoteActionCompatParcelizer(User user) {
        toMagicModuleMetaRepoModel.write(user, "");
        String countryCode = user.getPhoneNumber().getCountryCode();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(countryCode, "");
        String nationalNumber = user.getPhoneNumber().getNationalNumber();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nationalNumber, "");
        PhoneNumberDetails phoneNumberDetails = new PhoneNumberDetails(countryCode, nationalNumber, user.getPhoneNumber().isVerified() ? 1 : 0);
        String userId = user.getUserId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userId, "");
        String firstName = user.getFirstName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(firstName, "");
        String lastName = user.getLastName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lastName, "");
        String profession = user.getProfession();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(profession, "");
        String profilePic = user.getProfilePic();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(profilePic, "");
        int kycStatus = user.getKycStatus();
        int kycFailureCount = user.getKycFailureCount();
        long createdOn = user.getCreatedOn();
        String displayName = user.getDisplayName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(displayName, "");
        String collegeName = user.getCollege().getCollegeName();
        String str = collegeName == null ? "" : collegeName;
        String currentYear = user.getCollege().getCurrentYear();
        String str2 = currentYear == null ? "" : currentYear;
        String userNameInitials = user.getUserNameInitials();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userNameInitials, "");
        String stateId = user.getCollege().getStateId();
        String str3 = stateId == null ? "" : stateId;
        String yearOfAdmission = user.getCollege().getYearOfAdmission();
        String str4 = yearOfAdmission == null ? "" : yearOfAdmission;
        Integer yearOfPassout = user.getCollege().getYearOfPassout();
        int iIntValue = yearOfPassout != null ? yearOfPassout.intValue() : 0;
        String country = user.getCollege().getCountry();
        String str5 = country == null ? "" : country;
        String collegeId = user.getCollege().getCollegeId();
        String str6 = collegeId == null ? "" : collegeId;
        int mbbsVerificationYear = user.getCollege().getMbbsVerificationYear();
        Long verifiedOn = user.getCollege().getVerifiedOn();
        return new destroyEglSurface(userId, firstName, lastName, profession, profilePic, kycStatus, kycFailureCount, createdOn, displayName, str, str2, userNameInitials, phoneNumberDetails, str3, str5, str6, str4, iIntValue, mbbsVerificationYear, verifiedOn != null ? verifiedOn.longValue() : -1L, user.getCollege().isUserCollegeDataAvailable());
    }
}
