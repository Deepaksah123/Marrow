package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.user.User;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.CourseDetail;
import com.marrow2.data.user.remote.model.UserConfigV2;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010)R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010)R\u001a\u00101\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010)R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010)R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010)R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010)R\u001a\u0010=\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u0014\u0010G\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010+R\u0016\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010+R\u0014\u0010I\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u001a\u0010L\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bU\u00104R\u001a\u0010V\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010OR\u001a\u0010X\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u00102\u001a\u0004\bY\u00104R(\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010^\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a"}, d2 = {"Lo/readDouble;", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p8", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "p9", "p10", "p11", "p12", "", "p13", "p14", "", "p15", "Lcom/marrow2/data/user/remote/model/CourseDetail;", "p16", "p17", "p18", "p19", "", "Lcom/marrow2/data/user/remote/model/UserConfigV2;", "p20", "Lo/zaB;", "p21", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Lcom/marrow2/data/user/remote/model/CollegeDetails;ZLjava/lang/String;Ljava/lang/String;IIJLcom/marrow2/data/user/remote/model/CourseDetail;ZJZLjava/util/Map;Lo/zaB;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", LoggedUserResponse.KEY_TOKEN, "Ljava/lang/String;", "RatingCompat", "refreshToken", "MediaMetadataCompat", "email", "AudioAttributesCompatParcelizer", "emailVerified", "Z", "IconCompatParcelizer", "()Z", "userId", "onAddQueueItem", "profilePic", "AudioAttributesImplApi21Parcelizer", "firstName", "MediaBrowserCompatItemReceiver", "lastName", "AudioAttributesImplApi26Parcelizer", "phoneNumber", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "MediaBrowserCompatCustomActionResultReceiver", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "college", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "write", "()Lcom/marrow2/data/user/remote/model/CollegeDetails;", "showLegalPopup", "MediaBrowserCompatMediaItem", LoggedUserResponse.KEY_PROFESSION, LoggedUserResponse.KEY_SPECIALTY, "kycStatus", "I", "kycFailureCount", "createdOn", "J", "RemoteActionCompatParcelizer", "()J", "courseDetail", "Lcom/marrow2/data/user/remote/model/CourseDetail;", "read", "()Lcom/marrow2/data/user/remote/model/CourseDetail;", "tncConsentRequired", "MediaBrowserCompatSearchResultReceiver", "tncConsentDate", "MediaDescriptionCompat", "isYearUpdateRequired", "handleMediaPlayPauseIfPendingOnHandler", "userConfig", "Ljava/util/Map;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Ljava/util/Map;", "kycMeta", "Lo/zaB;", "AudioAttributesImplBaseParcelizer", "()Lo/zaB;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class readDouble {
    public static final int $stable = 8;
    private final CollegeDetails college;
    private final CourseDetail courseDetail;
    private final long createdOn;
    private final String email;
    private final boolean emailVerified;
    private final String firstName;
    private final boolean isYearUpdateRequired;
    private final int kycFailureCount;
    private final zaB kycMeta;
    private final int kycStatus;
    private final String lastName;
    private final PhoneNumberDetails phoneNumber;
    private final String profession;
    private final String profilePic;
    private final String refreshToken;
    private final boolean showLegalPopup;
    private final String specialty;
    private final long tncConsentDate;
    private final boolean tncConsentRequired;
    private final String token;
    private final Map<String, UserConfigV2> userConfig;
    private final String userId;

    public readDouble(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, PhoneNumberDetails phoneNumberDetails, CollegeDetails collegeDetails, boolean z2, String str8, String str9, int i, int i2, long j, CourseDetail courseDetail, boolean z3, long j2, boolean z4, Map<String, UserConfigV2> map, zaB zab) {
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
        this.kycMeta = zab;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getProfilePic() {
        return this.profilePic;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r45v1, types: [java.util.Map] */
    public /* synthetic */ readDouble(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, PhoneNumberDetails phoneNumberDetails, CollegeDetails collegeDetails, boolean z2, String str8, String str9, int i, int i2, long j, CourseDetail courseDetail, boolean z3, long j2, boolean z4, Map map, zaB zab, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        int i4;
        int i5;
        String str10;
        String str11;
        zaB zab2;
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
            zab2 = null;
            z5 = false;
            courseDetail2 = new CourseDetail(0, 0, 3, null);
        } else {
            i4 = i6;
            i5 = i7;
            str10 = str19;
            str11 = str20;
            zab2 = null;
            z5 = false;
            courseDetail2 = courseDetail;
        }
        this(str12, str13, str14, z6, str15, str16, str17, str18, phoneNumberDetails2, collegeDetails2, z7, str10, str11, i4, i5, j3, courseDetail2, (131072 & i3) != 0 ? z5 : z3, (i3 & 262144) == 0 ? j2 : 0L, (i3 & 524288) == 0 ? z4 : z5, (i3 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? zab2 : map, (i3 & 2097152) == 0 ? zab : zab2);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final CollegeDetails getCollege() {
        return this.college;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getShowLegalPopup() {
        return this.showLegalPopup;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getCreatedOn() {
        return this.createdOn;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final CourseDetail getCourseDetail() {
        return this.courseDetail;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getTncConsentRequired() {
        return this.tncConsentRequired;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final long getTncConsentDate() {
        return this.tncConsentDate;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getIsYearUpdateRequired() {
        return this.isYearUpdateRequired;
    }

    public final Map<String, UserConfigV2> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.userConfig;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final zaB getKycMeta() {
        return this.kycMeta;
    }

    public readDouble() {
        this(null, null, null, false, null, null, null, null, null, null, false, null, null, 0, 0, 0L, null, false, 0L, false, null, null, 4194303, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof readDouble)) {
            return false;
        }
        readDouble readdouble = (readDouble) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.token, (Object) readdouble.token) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.refreshToken, (Object) readdouble.refreshToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) readdouble.email) && this.emailVerified == readdouble.emailVerified && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) readdouble.userId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.profilePic, (Object) readdouble.profilePic) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.firstName, (Object) readdouble.firstName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lastName, (Object) readdouble.lastName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumber, readdouble.phoneNumber) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.college, readdouble.college) && this.showLegalPopup == readdouble.showLegalPopup && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.profession, (Object) readdouble.profession) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.specialty, (Object) readdouble.specialty) && this.kycStatus == readdouble.kycStatus && this.kycFailureCount == readdouble.kycFailureCount && this.createdOn == readdouble.createdOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.courseDetail, readdouble.courseDetail) && this.tncConsentRequired == readdouble.tncConsentRequired && this.tncConsentDate == readdouble.tncConsentDate && this.isYearUpdateRequired == readdouble.isYearUpdateRequired && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userConfig, readdouble.userConfig) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.kycMeta, readdouble.kycMeta);
    }

    public final int hashCode() {
        String str = this.token;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.refreshToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.email;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Boolean.hashCode(this.emailVerified);
        String str4 = this.userId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.profilePic;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.firstName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        int iHashCode8 = this.lastName.hashCode();
        int iHashCode9 = this.phoneNumber.hashCode();
        CollegeDetails collegeDetails = this.college;
        int iHashCode10 = collegeDetails == null ? 0 : collegeDetails.hashCode();
        int iHashCode11 = Boolean.hashCode(this.showLegalPopup);
        int iHashCode12 = this.profession.hashCode();
        String str7 = this.specialty;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        int iHashCode14 = Integer.hashCode(this.kycStatus);
        int iHashCode15 = Integer.hashCode(this.kycFailureCount);
        int i = iHashCode13;
        int iHashCode16 = Long.hashCode(this.createdOn);
        int iHashCode17 = this.courseDetail.hashCode();
        int iHashCode18 = Boolean.hashCode(this.tncConsentRequired);
        int iHashCode19 = Long.hashCode(this.tncConsentDate);
        int iHashCode20 = Boolean.hashCode(this.isYearUpdateRequired);
        Map<String, UserConfigV2> map = this.userConfig;
        int iHashCode21 = map == null ? 0 : map.hashCode();
        zaB zab = this.kycMeta;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (zab != null ? zab.hashCode() : 0);
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.refreshToken;
        String str3 = this.email;
        boolean z = this.emailVerified;
        String str4 = this.userId;
        String str5 = this.profilePic;
        String str6 = this.firstName;
        String str7 = this.lastName;
        PhoneNumberDetails phoneNumberDetails = this.phoneNumber;
        CollegeDetails collegeDetails = this.college;
        boolean z2 = this.showLegalPopup;
        String str8 = this.profession;
        String str9 = this.specialty;
        int i = this.kycStatus;
        int i2 = this.kycFailureCount;
        long j = this.createdOn;
        CourseDetail courseDetail = this.courseDetail;
        boolean z3 = this.tncConsentRequired;
        long j2 = this.tncConsentDate;
        boolean z4 = this.isYearUpdateRequired;
        Map<String, UserConfigV2> map = this.userConfig;
        zaB zab = this.kycMeta;
        StringBuilder sb = new StringBuilder("readDouble(token=");
        sb.append(str);
        sb.append(", refreshToken=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", emailVerified=");
        sb.append(z);
        sb.append(", userId=");
        sb.append(str4);
        sb.append(", profilePic=");
        sb.append(str5);
        sb.append(", firstName=");
        sb.append(str6);
        sb.append(", lastName=");
        sb.append(str7);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", college=");
        sb.append(collegeDetails);
        sb.append(", showLegalPopup=");
        sb.append(z2);
        sb.append(", profession=");
        sb.append(str8);
        sb.append(", specialty=");
        sb.append(str9);
        sb.append(", kycStatus=");
        sb.append(i);
        sb.append(", kycFailureCount=");
        sb.append(i2);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", courseDetail=");
        sb.append(courseDetail);
        sb.append(", tncConsentRequired=");
        sb.append(z3);
        sb.append(", tncConsentDate=");
        sb.append(j2);
        sb.append(", isYearUpdateRequired=");
        sb.append(z4);
        sb.append(", userConfig=");
        sb.append(map);
        sb.append(", kycMeta=");
        sb.append(zab);
        sb.append(")");
        return sb.toString();
    }
}
