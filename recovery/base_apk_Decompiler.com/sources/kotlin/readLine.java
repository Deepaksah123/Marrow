package kotlin;

import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.User;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.UserConfigV2;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class readLine {
    public static final LoggedUser read(readDouble readdouble) {
        toMagicModuleMetaRepoModel.write(readdouble, "");
        User user = new User();
        user.setId(readdouble.getUserId());
        user.setProfilePic(readdouble.getProfilePic());
        user.setFirstName(readdouble.getFirstName());
        user.setLastName(readdouble.getLastName());
        CollegeDetails college = readdouble.getCollege();
        user.setCollege(college != null ? gzip.RemoteActionCompatParcelizer(college) : null);
        user.setPhoneNumber(gzip.RemoteActionCompatParcelizer(readdouble.getPhoneNumber()));
        user.setCreatedOn(readdouble.getCreatedOn());
        LoggedUser loggedUser = new LoggedUser(user);
        loggedUser.setToken(readdouble.getToken());
        loggedUser.setRefreshToken(readdouble.getRefreshToken());
        loggedUser.setEmail(readdouble.getEmail());
        loggedUser.setEmailVerified(readdouble.getEmailVerified());
        loggedUser.setShowLegalPopup(readdouble.getShowLegalPopup());
        loggedUser.setTncConsentRequired(readdouble.getTncConsentRequired());
        loggedUser.setTncConsentDate(readdouble.getTncConsentDate());
        loggedUser.setYearUpdateRequired(readdouble.getIsYearUpdateRequired());
        loggedUser.setCourseId(readdouble.getCourseDetail().getDefaultCourse());
        loggedUser.setDefaultCourseEdition(readdouble.getCourseDetail().getDefaultEdition());
        Map<String, UserConfigV2> mapMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readdouble.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        loggedUser.setUserConfig(mapMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null ? gzip.AudioAttributesCompatParcelizer(mapMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) : null);
        return loggedUser;
    }
}
