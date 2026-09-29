package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u0017R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u0017R\u001a\u00100\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u0019R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lo/LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;", "", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "p5", "p6", "p7", "p8", "", "Lo/ReusableBufferedOutputStream;", "p9", "<init>", "(IILjava/lang/String;ZJIIILjava/lang/String;Ljava/util/List;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "referralBenefitLimit", "I", "MediaBrowserCompatCustomActionResultReceiver", "referralExtensionDaysLimit", "AudioAttributesImplApi21Parcelizer", "referralCode", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "isCodeActive", "Z", "AudioAttributesImplApi26Parcelizer", "()Z", "codeEndTime", "J", "read", "()J", "numberOfReferralCouponsUsedByCurrentUser", "RemoteActionCompatParcelizer", "numberOfTimesCurrentUserReferralUsed", "AudioAttributesCompatParcelizer", "totalRedeemCount", "MediaBrowserCompatItemReceiver", "currentUserId", "write", "benefitDetails", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 {
    public static final int $stable = 8;

    @JsonProperty("benefit_details")
    private final List<ReusableBufferedOutputStream> benefitDetails;

    @JsonProperty("end_time")
    private final long codeEndTime;

    @JsonProperty("user_id")
    private final String currentUserId;

    @JsonProperty("is_active")
    private final boolean isCodeActive;

    @JsonProperty("me_rfc_applied_count")
    private final int numberOfReferralCouponsUsedByCurrentUser;

    @JsonProperty("my_rfc_applied_count")
    private final int numberOfTimesCurrentUserReferralUsed;

    @JsonProperty("REFERRAL_BENEFIT_LIMIT")
    private final int referralBenefitLimit;

    @JsonProperty("_id")
    private final String referralCode;

    @JsonProperty("REFERRAL_EXTENSION_DAYS_LIMIT")
    private final int referralExtensionDaysLimit;

    @JsonProperty("total_redeem_count")
    private final int totalRedeemCount;

    private LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(int i, int i2, String str, boolean z, long j, int i3, int i4, int i5, String str2, List<ReusableBufferedOutputStream> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.referralBenefitLimit = i;
        this.referralExtensionDaysLimit = i2;
        this.referralCode = str;
        this.isCodeActive = z;
        this.codeEndTime = j;
        this.numberOfReferralCouponsUsedByCurrentUser = i3;
        this.numberOfTimesCurrentUserReferralUsed = i4;
        this.totalRedeemCount = i5;
        this.currentUserId = str2;
        this.benefitDetails = list;
    }

    public /* synthetic */ LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(int i, int i2, String str, boolean z, long j, int i3, int i4, int i5, String str2, List list, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? false : z, (i6 & 16) != 0 ? 0L : j, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? "" : str2, (i6 & 512) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getReferralBenefitLimit() {
        return this.referralBenefitLimit;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getReferralExtensionDaysLimit() {
        return this.referralExtensionDaysLimit;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getIsCodeActive() {
        return this.isCodeActive;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getCodeEndTime() {
        return this.codeEndTime;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getNumberOfReferralCouponsUsedByCurrentUser() {
        return this.numberOfReferralCouponsUsedByCurrentUser;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getNumberOfTimesCurrentUserReferralUsed() {
        return this.numberOfTimesCurrentUserReferralUsed;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getTotalRedeemCount() {
        return this.totalRedeemCount;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final List<ReusableBufferedOutputStream> IconCompatParcelizer() {
        return this.benefitDetails;
    }

    public LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0() {
        this(0, 0, null, false, 0L, 0, 0, 0, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0)) {
            return false;
        }
        LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 leastRecentlyUsedCacheEvictorExternalSyntheticLambda0 = (LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0) p0;
        return this.referralBenefitLimit == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.referralBenefitLimit && this.referralExtensionDaysLimit == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.referralExtensionDaysLimit && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.referralCode, (Object) leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.referralCode) && this.isCodeActive == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.isCodeActive && this.codeEndTime == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.codeEndTime && this.numberOfReferralCouponsUsedByCurrentUser == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.numberOfReferralCouponsUsedByCurrentUser && this.numberOfTimesCurrentUserReferralUsed == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.numberOfTimesCurrentUserReferralUsed && this.totalRedeemCount == leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.totalRedeemCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.currentUserId, (Object) leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.currentUserId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.benefitDetails, leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.benefitDetails);
    }

    public final int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.referralBenefitLimit) * 31) + Integer.hashCode(this.referralExtensionDaysLimit)) * 31) + this.referralCode.hashCode()) * 31) + Boolean.hashCode(this.isCodeActive)) * 31) + Long.hashCode(this.codeEndTime)) * 31) + Integer.hashCode(this.numberOfReferralCouponsUsedByCurrentUser)) * 31) + Integer.hashCode(this.numberOfTimesCurrentUserReferralUsed)) * 31) + Integer.hashCode(this.totalRedeemCount)) * 31) + this.currentUserId.hashCode()) * 31) + this.benefitDetails.hashCode();
    }

    public final String toString() {
        int i = this.referralBenefitLimit;
        int i2 = this.referralExtensionDaysLimit;
        String str = this.referralCode;
        boolean z = this.isCodeActive;
        long j = this.codeEndTime;
        int i3 = this.numberOfReferralCouponsUsedByCurrentUser;
        int i4 = this.numberOfTimesCurrentUserReferralUsed;
        int i5 = this.totalRedeemCount;
        String str2 = this.currentUserId;
        List<ReusableBufferedOutputStream> list = this.benefitDetails;
        StringBuilder sb = new StringBuilder("LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(referralBenefitLimit=");
        sb.append(i);
        sb.append(", referralExtensionDaysLimit=");
        sb.append(i2);
        sb.append(", referralCode=");
        sb.append(str);
        sb.append(", isCodeActive=");
        sb.append(z);
        sb.append(", codeEndTime=");
        sb.append(j);
        sb.append(", numberOfReferralCouponsUsedByCurrentUser=");
        sb.append(i3);
        sb.append(", numberOfTimesCurrentUserReferralUsed=");
        sb.append(i4);
        sb.append(", totalRedeemCount=");
        sb.append(i5);
        sb.append(", currentUserId=");
        sb.append(str2);
        sb.append(", benefitDetails=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
