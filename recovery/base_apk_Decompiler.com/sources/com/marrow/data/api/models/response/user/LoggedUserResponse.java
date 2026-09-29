package com.marrow.data.api.models.response.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.CourseDetail;
import com.marrow.data.models.user.EducationalDegree;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoggedUserResponse implements Serializable {
    public static final String KEY_CONSENT_DATE = "tnc_consent_date";
    public static final String KEY_CONSENT_REQUIRED = "tnc_consent_required";
    public static final String KEY_COURSE_DETAIL = "course_details";
    public static final String KEY_CREATED_ON = "created_on";
    public static final String KEY_EDUCATION = "education";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_EMAIL_VERIFIED = "verify_email";
    public static final String KEY_FIRSTNAME = "fname";
    public static final String KEY_KYC_FAILURE_COUNT = "kyc_failure_count";
    public static final String KEY_KYC_META = "kyc_meta";
    public static final String KEY_KYC_STATUS = "kyc_status";
    public static final String KEY_LASTNAME = "lname";
    public static final String KEY_MBBS = "college_details";
    public static final String KEY_PHONE_NUMBER = "primary_contact";
    public static final String KEY_PROFESSION = "profession";
    public static final String KEY_PROFILE_PICTURE = "profile_pic";
    public static final String KEY_REFRESH_TOKEN = "refresh_token";
    public static final String KEY_SHOW_LEGAL_POPUP = "show_legal_popup";
    public static final String KEY_SPECIALTY = "specialty";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_USERID = "_id";
    public static final String KEY_USER_CONFIG = "feature_config";
    public static final String KEY_YEAR_UPDATE_REQUIRED = "year_of_admission_needed";

    @JsonProperty(KEY_MBBS)
    public College college;

    @JsonProperty(KEY_COURSE_DETAIL)
    public CourseDetail courseDetail;

    @JsonProperty(KEY_YEAR_UPDATE_REQUIRED)
    public boolean isYearUpdateRequired;

    @JsonProperty(KEY_KYC_META)
    public KYCMetaV1 kycMeta;

    @JsonProperty(KEY_EDUCATION)
    public List<EducationalDegree> mDegrees;

    @JsonProperty("email")
    public String mEmail;

    @JsonProperty(KEY_EMAIL_VERIFIED)
    public boolean mEmailVerified;

    @JsonProperty("fname")
    public String mFirstName;

    @JsonProperty(KEY_KYC_FAILURE_COUNT)
    public int mKycFailureCount;

    @JsonProperty(KEY_KYC_STATUS)
    public int mKycStatus;

    @JsonProperty("primary_contact")
    public PhoneNumber mPhoneNumber;

    @JsonProperty("profile_pic")
    public String mProfilePic;

    @JsonProperty(KEY_SHOW_LEGAL_POPUP)
    public boolean mShowLegalPopup;

    @JsonProperty(KEY_SPECIALTY)
    public String mSpecialty;

    @JsonProperty("_id")
    public String mUserId;

    @JsonProperty(KEY_CREATED_ON)
    public long msCreatedOn;

    @JsonProperty(KEY_REFRESH_TOKEN)
    public String refreshToken;

    @JsonProperty(KEY_CONSENT_DATE)
    public long tncConsentDate;

    @JsonProperty(KEY_CONSENT_REQUIRED)
    public boolean tncConsentRequired;

    @JsonProperty(KEY_TOKEN)
    public String token;

    @JsonProperty(KEY_USER_CONFIG)
    public Map<String, UserConfig> userConfig;

    @JsonProperty("lname")
    public String mLastName = "";

    @JsonProperty(KEY_PROFESSION)
    public String mProfession = User.DEFAULT_PROFESSION;

    public static LoggedUser getLoggedUser(LoggedUserResponse loggedUserResponse) {
        if (loggedUserResponse == null) {
            return null;
        }
        LoggedUser loggedUser = new LoggedUser(getUser(loggedUserResponse));
        loggedUser.setEmail(loggedUserResponse.mEmail);
        loggedUser.setEmailVerified(loggedUserResponse.mEmailVerified);
        loggedUser.setToken(loggedUserResponse.token);
        loggedUser.setShowLegalPopup(loggedUserResponse.mShowLegalPopup);
        loggedUser.setRefreshToken(loggedUserResponse.refreshToken);
        loggedUser.setTncConsentRequired(loggedUserResponse.tncConsentRequired);
        loggedUser.setTncConsentDate(loggedUserResponse.tncConsentDate);
        loggedUser.setYearUpdateRequired(loggedUserResponse.isYearUpdateRequired);
        loggedUser.setCourseId(loggedUserResponse.courseDetail.getDefaultCourse());
        loggedUser.setDefaultCourseEdition(loggedUserResponse.courseDetail.getDefaultEdition());
        loggedUser.setUserConfig(loggedUserResponse.userConfig);
        return loggedUser;
    }

    private static User getUser(LoggedUserResponse loggedUserResponse) {
        if (loggedUserResponse == null) {
            return null;
        }
        User user = new User();
        user.setId(loggedUserResponse.mUserId);
        user.setShowLegalPopup(loggedUserResponse.mShowLegalPopup);
        user.setFirstName(loggedUserResponse.mFirstName);
        user.setLastName(loggedUserResponse.mLastName);
        user.setCollege(loggedUserResponse.college);
        user.setPhoneNumber(loggedUserResponse.mPhoneNumber);
        user.setProfilePic(loggedUserResponse.mProfilePic);
        user.setCollege(loggedUserResponse.college);
        user.setKycStatus(loggedUserResponse.mKycStatus);
        user.setKycFailureCount(loggedUserResponse.mKycFailureCount);
        user.setCreatedOn(loggedUserResponse.msCreatedOn);
        return user;
    }
}
