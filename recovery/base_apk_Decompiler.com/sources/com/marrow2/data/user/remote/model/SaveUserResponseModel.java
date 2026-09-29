package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.models.user.User;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\b\u0017\u0018\u0000 g2\u00020\u0001:\u0001gB\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001a\u0010.\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u001a\u0010:\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)R\u001a\u0010H\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001a\u0010N\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010/\u001a\u0004\bW\u00101R\u001a\u0010X\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\bY\u0010QR\u001a\u0010Z\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010/\u001a\u0004\bZ\u00101R(\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010c\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f"}, d2 = {"Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p8", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "p9", "p10", "p11", "p12", "", "p13", "p14", "", "p15", "Lcom/marrow2/data/user/remote/model/CourseDetail;", "p16", "p17", "p18", "p19", "", "Lcom/marrow2/data/user/remote/model/UserConfigV2;", "p20", "Lcom/marrow2/data/user/remote/model/KYCMetaV2;", "p21", "Lcom/marrow2/data/user/remote/model/Triggers;", "p22", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Lcom/marrow2/data/user/remote/model/CollegeDetails;ZLjava/lang/String;Ljava/lang/String;IIJLcom/marrow2/data/user/remote/model/CourseDetail;ZJZLjava/util/Map;Lcom/marrow2/data/user/remote/model/KYCMetaV2;Lcom/marrow2/data/user/remote/model/Triggers;)V", "token", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "refreshToken", "getRefreshToken", "email", "getEmail", "emailVerified", "Z", "getEmailVerified", "()Z", "userId", "getUserId", "profilePic", "getProfilePic", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "getPhoneNumber", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "college", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "getCollege", "()Lcom/marrow2/data/user/remote/model/CollegeDetails;", "showLegalPopup", "getShowLegalPopup", "profession", "getProfession", "specialty", "getSpecialty", "kycStatus", "I", "getKycStatus", "()I", "kycFailureCount", "getKycFailureCount", "createdOn", "J", "getCreatedOn", "()J", "courseDetail", "Lcom/marrow2/data/user/remote/model/CourseDetail;", "getCourseDetail", "()Lcom/marrow2/data/user/remote/model/CourseDetail;", "tncConsentRequired", "getTncConsentRequired", "tncConsentDate", "getTncConsentDate", "isYearUpdateRequired", "userConfig", "Ljava/util/Map;", "getUserConfig", "()Ljava/util/Map;", "kycMeta", "Lcom/marrow2/data/user/remote/model/KYCMetaV2;", "getKycMeta", "()Lcom/marrow2/data/user/remote/model/KYCMetaV2;", SaveUserResponseModel.KEY_TRIGGERS, "Lcom/marrow2/data/user/remote/model/Triggers;", "getTriggers", "()Lcom/marrow2/data/user/remote/model/Triggers;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SaveUserResponseModel {
    private static final String KEY_CONSENT_DATE = "tnc_consent_date";
    private static final String KEY_CONSENT_REQUIRED = "tnc_consent_required";
    private static final String KEY_COURSE_DETAIL = "course_details";
    private static final String KEY_CREATED_ON = "created_on";
    private static final String KEY_DEVICE_INFO_STATUS = "dvinfo_status";
    private static final String KEY_EDUCATION = "education";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_EMAIL_VERIFIED = "verify_email";
    private static final String KEY_FIRSTNAME = "fname";
    private static final String KEY_KYC_FAILURE_COUNT = "kyc_failure_count";
    private static final String KEY_KYC_META = "kyc_meta";
    private static final String KEY_KYC_STATUS = "kyc_status";
    private static final String KEY_LASTNAME = "lname";
    private static final String KEY_MBBS = "college_details";
    private static final String KEY_PHONE_NUMBER = "primary_contact";
    private static final String KEY_PROFESSION = "profession";
    private static final String KEY_PROFILE_PICTURE = "profile_pic";
    private static final String KEY_REFRESH_TOKEN = "refresh_token";
    private static final String KEY_SHOW_LEGAL_POPUP = "show_legal_popup";
    private static final String KEY_SPECIALTY = "specialty";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_TRIGGERS = "triggers";
    private static final String KEY_USERID = "_id";
    private static final String KEY_USER_CONFIG = "feature_config";
    private static final String KEY_YEAR_UPDATE_REQUIRED = "year_of_admission_needed";

    @JsonProperty("college_details")
    private final CollegeDetails college;

    @JsonProperty("course_details")
    private final CourseDetail courseDetail;

    @JsonProperty("created_on")
    private final long createdOn;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("verify_email")
    private final boolean emailVerified;

    @JsonProperty("fname")
    private final String firstName;

    @JsonProperty("year_of_admission_needed")
    private final boolean isYearUpdateRequired;

    @JsonProperty("kyc_failure_count")
    private final int kycFailureCount;

    @JsonProperty("kyc_meta")
    private final KYCMetaV2 kycMeta;

    @JsonProperty("kyc_status")
    private final int kycStatus;

    @JsonProperty("lname")
    private final String lastName;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails phoneNumber;

    @JsonProperty("profession")
    private final String profession;

    @JsonProperty("profile_pic")
    private final String profilePic;

    @JsonProperty("refresh_token")
    private final String refreshToken;

    @JsonProperty("show_legal_popup")
    private final boolean showLegalPopup;

    @JsonProperty("specialty")
    private final String specialty;

    @JsonProperty("tnc_consent_date")
    private final long tncConsentDate;

    @JsonProperty("tnc_consent_required")
    private final boolean tncConsentRequired;

    @JsonProperty("token")
    private final String token;

    @JsonProperty(KEY_TRIGGERS)
    private final Triggers triggers;

    @JsonProperty("feature_config")
    private final Map<String, UserConfigV2> userConfig;

    @JsonProperty("_id")
    private final String userId;
    public static final int $stable = 8;

    public SaveUserResponseModel(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, PhoneNumberDetails phoneNumberDetails, CollegeDetails collegeDetails, boolean z2, String str8, String str9, int i, int i2, long j, CourseDetail courseDetail, boolean z3, long j2, boolean z4, Map<String, UserConfigV2> map, KYCMetaV2 kYCMetaV2, Triggers triggers) {
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(courseDetail, "");
        this.token = str;
        this.refreshToken = str2;
        this.email = str3;
        this.emailVerified = z;
        this.userId = str4;
        this.profilePic = str5;
        this.firstName = str6;
        this.lastName = str7;
        this.phoneNumber = phoneNumberDetails;
        this.college = collegeDetails;
        this.showLegalPopup = z2;
        this.profession = str8;
        this.specialty = str9;
        this.kycStatus = i;
        this.kycFailureCount = i2;
        this.createdOn = j;
        this.courseDetail = courseDetail;
        this.tncConsentRequired = z3;
        this.tncConsentDate = j2;
        this.isYearUpdateRequired = z4;
        this.userConfig = map;
        this.kycMeta = kYCMetaV2;
        this.triggers = triggers;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r46v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.marrow2.data.user.remote.model.KYCMetaV2] */
    public /* synthetic */ SaveUserResponseModel(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, PhoneNumberDetails phoneNumberDetails, CollegeDetails collegeDetails, boolean z2, String str8, String str9, int i, int i2, long j, CourseDetail courseDetail, boolean z3, long j2, boolean z4, Map map, KYCMetaV2 kYCMetaV2, Triggers triggers, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        int i4;
        int i5;
        String str10;
        String str11;
        Triggers triggers2;
        boolean z5;
        CourseDetail courseDetail2;
        String str12 = (i3 & 1) != 0 ? null : str;
        String str13 = (i3 & 2) != 0 ? null : str2;
        String str14 = (i3 & 4) != 0 ? null : str3;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        String str15 = (i3 & 16) != 0 ? null : str4;
        String str16 = (i3 & 32) != 0 ? null : str5;
        String str17 = (i3 & 64) != 0 ? null : str6;
        String str18 = (i3 & 128) != 0 ? "" : str7;
        PhoneNumberDetails phoneNumberDetails2 = (i3 & 256) != 0 ? new PhoneNumberDetails(null, null, 0, 7, null) : phoneNumberDetails;
        CollegeDetails collegeDetails2 = (i3 & 512) != 0 ? null : collegeDetails;
        boolean z7 = (i3 & 1024) != 0 ? false : z2;
        String str19 = (i3 & 2048) != 0 ? User.DEFAULT_PROFESSION : str8;
        String str20 = (i3 & 4096) != 0 ? null : str9;
        int i6 = (i3 & 8192) != 0 ? 0 : i;
        int i7 = (i3 & 16384) != 0 ? 0 : i2;
        long j3 = (i3 & 32768) != 0 ? 0L : j;
        if ((i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            i5 = i7;
            i4 = i6;
            str10 = str19;
            str11 = str20;
            triggers2 = null;
            z5 = false;
            courseDetail2 = new CourseDetail(0, 0, 3, null);
        } else {
            i4 = i6;
            i5 = i7;
            str10 = str19;
            str11 = str20;
            triggers2 = null;
            z5 = false;
            courseDetail2 = courseDetail;
        }
        this(str12, str13, str14, z6, str15, str16, str17, str18, phoneNumberDetails2, collegeDetails2, z7, str10, str11, i4, i5, j3, courseDetail2, (131072 & i3) != 0 ? z5 : z3, (i3 & 262144) == 0 ? j2 : 0L, (i3 & 524288) == 0 ? z4 : z5, (i3 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? triggers2 : map, (i3 & 2097152) != 0 ? triggers2 : kYCMetaV2, (i3 & 4194304) == 0 ? triggers : triggers2);
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    public final CollegeDetails getCollege() {
        return this.college;
    }

    public final boolean getShowLegalPopup() {
        return this.showLegalPopup;
    }

    public final String getProfession() {
        return this.profession;
    }

    public final String getSpecialty() {
        return this.specialty;
    }

    public final int getKycStatus() {
        return this.kycStatus;
    }

    public final int getKycFailureCount() {
        return this.kycFailureCount;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final CourseDetail getCourseDetail() {
        return this.courseDetail;
    }

    public final boolean getTncConsentRequired() {
        return this.tncConsentRequired;
    }

    public final long getTncConsentDate() {
        return this.tncConsentDate;
    }

    /* JADX INFO: renamed from: isYearUpdateRequired, reason: from getter */
    public final boolean getIsYearUpdateRequired() {
        return this.isYearUpdateRequired;
    }

    public final Map<String, UserConfigV2> getUserConfig() {
        return this.userConfig;
    }

    public final KYCMetaV2 getKycMeta() {
        return this.kycMeta;
    }

    public final Triggers getTriggers() {
        return this.triggers;
    }

    public SaveUserResponseModel() {
        this(null, null, null, false, null, null, null, null, null, null, false, null, null, 0, 0, 0L, null, false, 0L, false, null, null, null, 8388607, null);
    }
}
