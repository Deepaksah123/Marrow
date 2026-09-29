package kotlin;

import com.marrow.data.api.models.response.user.UserConfig;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.UserConfigV2;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gzip {
    public static final SaveUserResponseModel IconCompatParcelizer(obtainMessage obtainmessage) {
        toMagicModuleMetaRepoModel.write(obtainmessage, "");
        return new SaveUserResponseModel(obtainmessage.getToken(), obtainmessage.getRefreshToken(), obtainmessage.getEmail(), obtainmessage.getEmailVerified(), obtainmessage.getUserId(), obtainmessage.getProfilePic(), obtainmessage.getFirstName(), obtainmessage.getLastName(), obtainmessage.getPhoneNumber(), obtainmessage.getCollege(), obtainmessage.getShowLegalPopup(), obtainmessage.getProfession(), obtainmessage.getSpecialty(), obtainmessage.getKycStatus(), obtainmessage.getKycFailureCount(), obtainmessage.getCreatedOn(), obtainmessage.getCourseDetail(), obtainmessage.getTncConsentRequired(), obtainmessage.getTncConsentDate(), obtainmessage.getIsYearUpdateRequired(), obtainmessage.onAddQueueItem(), null, null, 6291456, null);
    }

    public static final LoggedUser write(SaveUserResponseModel saveUserResponseModel) {
        toMagicModuleMetaRepoModel.write(saveUserResponseModel, "");
        User user = new User();
        user.setId(saveUserResponseModel.getUserId());
        user.setProfilePic(saveUserResponseModel.getProfilePic());
        user.setFirstName(saveUserResponseModel.getFirstName());
        user.setLastName(saveUserResponseModel.getLastName());
        CollegeDetails college = saveUserResponseModel.getCollege();
        user.setCollege(college != null ? RemoteActionCompatParcelizer(college) : null);
        user.setPhoneNumber(RemoteActionCompatParcelizer(saveUserResponseModel.getPhoneNumber()));
        user.setCreatedOn(saveUserResponseModel.getCreatedOn());
        LoggedUser loggedUser = new LoggedUser(user);
        loggedUser.setToken(saveUserResponseModel.getToken());
        loggedUser.setRefreshToken(saveUserResponseModel.getRefreshToken());
        loggedUser.setEmail(saveUserResponseModel.getEmail());
        loggedUser.setEmailVerified(saveUserResponseModel.getEmailVerified());
        loggedUser.setShowLegalPopup(saveUserResponseModel.getShowLegalPopup());
        loggedUser.setTncConsentRequired(saveUserResponseModel.getTncConsentRequired());
        loggedUser.setTncConsentDate(saveUserResponseModel.getTncConsentDate());
        loggedUser.setYearUpdateRequired(saveUserResponseModel.getIsYearUpdateRequired());
        loggedUser.setCourseId(saveUserResponseModel.getCourseDetail().getDefaultCourse());
        loggedUser.setDefaultCourseEdition(saveUserResponseModel.getCourseDetail().getDefaultEdition());
        Map<String, UserConfigV2> userConfig = saveUserResponseModel.getUserConfig();
        loggedUser.setUserConfig(userConfig != null ? AudioAttributesCompatParcelizer(userConfig) : null);
        return loggedUser;
    }

    public static final User read(destroyEglSurface destroyeglsurface) {
        toMagicModuleMetaRepoModel.write(destroyeglsurface, "");
        College college = new College();
        college.setStateId(destroyeglsurface.MediaMetadataCompat());
        college.setCollegeName(destroyeglsurface.RemoteActionCompatParcelizer());
        college.setCollegeId(destroyeglsurface.read());
        college.setCountry(destroyeglsurface.write());
        college.setYearOfPassout(Integer.valueOf(destroyeglsurface.handleMediaPlayPauseIfPendingOnHandler()));
        college.setVerifiedOn(Long.valueOf(destroyeglsurface.onAddQueueItem()));
        college.setCurrentYear(destroyeglsurface.IconCompatParcelizer());
        college.setYearOfAdmission(destroyeglsurface.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        college.setMbbsVerificationYear(destroyeglsurface.AudioAttributesImplApi26Parcelizer());
        User user = new User();
        user.setId(destroyeglsurface.MediaDescriptionCompat());
        user.setProfilePic(destroyeglsurface.MediaBrowserCompatMediaItem());
        user.setFirstName(destroyeglsurface.MediaBrowserCompatCustomActionResultReceiver());
        user.setLastName(destroyeglsurface.MediaBrowserCompatItemReceiver());
        user.setCollege(college);
        user.setPhoneNumber(RemoteActionCompatParcelizer(destroyeglsurface.RatingCompat()));
        user.setCreatedOn(destroyeglsurface.AudioAttributesCompatParcelizer());
        user.setKycStatus(destroyeglsurface.AudioAttributesImplApi21Parcelizer());
        user.setKycFailureCount(destroyeglsurface.AudioAttributesImplBaseParcelizer());
        user.setProfession(destroyeglsurface.MediaBrowserCompatSearchResultReceiver());
        return user;
    }

    public static final Map<String, UserConfig> AudioAttributesCompatParcelizer(Map<String, UserConfigV2> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : map.keySet()) {
            UserConfigV2 userConfigV2 = map.get(str);
            linkedHashMap.put(str, new UserConfig(userConfigV2 != null ? userConfigV2.isMagicModuleEnabled() : false));
        }
        return linkedHashMap;
    }

    public static final PhoneNumber RemoteActionCompatParcelizer(PhoneNumberDetails phoneNumberDetails) {
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(phoneNumberDetails.getCountryCode());
        phoneNumber.setNationalNumber(phoneNumberDetails.getNationalNumber());
        phoneNumber.setVerified(phoneNumberDetails.isVerified() == 1);
        return phoneNumber;
    }

    public static final College RemoteActionCompatParcelizer(CollegeDetails collegeDetails) {
        toMagicModuleMetaRepoModel.write(collegeDetails, "");
        College college = new College();
        college.setStateId(collegeDetails.getState_id());
        college.setCollegeId(collegeDetails.getClg_id());
        college.setCountry(collegeDetails.getCountry());
        college.setYearOfAdmission(collegeDetails.getYear_of_admission());
        college.setYearOfPassout(Integer.valueOf(collegeDetails.getYop()));
        college.setMbbsVerificationYear(collegeDetails.getMbbs_verified_year());
        college.setCurrentYear(collegeDetails.getCurr_year());
        college.setVerifiedOn(Long.valueOf(collegeDetails.getVerified_on()));
        college.setCollegeName(collegeDetails.getClg_name());
        return college;
    }
}
