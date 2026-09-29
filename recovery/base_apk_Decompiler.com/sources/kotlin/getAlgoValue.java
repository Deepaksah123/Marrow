package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ju\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0011\u0010'\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001e¨\u0006<"}, d2 = {"Lcom/marrow2/ui/plan/post_purchase/PaymentDoneUiState;", "", "appliedCoupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "plan", "Lcom/marrow/data/models/plan/Plan;", "paymentId", "", "addOnId", "expiryDate", "isPlanBUpgrade", "", "paymentGateway", "", "orderId", "shouldShowKycDisclaimer", "addressForm", "Lcom/marrow2/ui/notespurchase/addressinput/AddressFormUiState;", "<init>", "(Lcom/marrow/data/api/models/response/plan/Coupon;Lcom/marrow/data/models/plan/Plan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ZLcom/marrow2/ui/notespurchase/addressinput/AddressFormUiState;)V", "getAppliedCoupon", "()Lcom/marrow/data/api/models/response/plan/Coupon;", "setAppliedCoupon", "(Lcom/marrow/data/api/models/response/plan/Coupon;)V", "getPlan", "()Lcom/marrow/data/models/plan/Plan;", "getPaymentId", "()Ljava/lang/String;", "getAddOnId", "getExpiryDate", "()Z", "getPaymentGateway", "()I", "getOrderId", "getShouldShowKycDisclaimer", "getAddressForm", "()Lcom/marrow2/ui/notespurchase/addressinput/AddressFormUiState;", "shouldAllowKycAction", "getShouldAllowKycAction", "shouldShowStartLearningButton", "getShouldShowStartLearningButton", "shouldShowPlanDetails", "getShouldShowPlanDetails", "shouldShowCloseIcon", "getShouldShowCloseIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getAlgoValue {
    private final boolean AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final Plan AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private Coupon IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final GmsLogger RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private getAlgoValue(Coupon coupon, Plan plan, String str, String str2, String str3, boolean z, int i, String str4, boolean z2, GmsLogger gmsLogger) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.IconCompatParcelizer = coupon;
        this.AudioAttributesImplApi26Parcelizer = plan;
        this.AudioAttributesImplBaseParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaBrowserCompatItemReceiver = z2;
        this.RemoteActionCompatParcelizer = gmsLogger;
    }

    public /* synthetic */ getAlgoValue(Coupon coupon, Plan plan, String str, String str2, String str3, boolean z, int i, String str4, boolean z2, GmsLogger gmsLogger, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? null : coupon, (i2 & 2) != 0 ? null : plan, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? null : gmsLogger);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Coupon getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Plan getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final GmsLogger getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver && this.RemoteActionCompatParcelizer == null;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return !this.MediaBrowserCompatItemReceiver;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return !this.AudioAttributesCompatParcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer == null;
    }

    public getAlgoValue() {
        this(null, null, null, null, null, false, 0, null, false, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public static getAlgoValue read(Coupon coupon, Plan plan, String str, String str2, String str3, boolean z, int i, String str4, boolean z2, GmsLogger gmsLogger) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        return new getAlgoValue(coupon, plan, str, str2, str3, z, i, str4, z2, gmsLogger);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getAlgoValue)) {
            return false;
        }
        getAlgoValue getalgovalue = (getAlgoValue) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getalgovalue.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getalgovalue.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getalgovalue.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getalgovalue.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getalgovalue.read) && this.AudioAttributesCompatParcelizer == getalgovalue.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getalgovalue.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getalgovalue.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatItemReceiver == getalgovalue.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getalgovalue.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        Coupon coupon = this.IconCompatParcelizer;
        int iHashCode = coupon == null ? 0 : coupon.hashCode();
        Plan plan = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode2 = plan == null ? 0 : plan.hashCode();
        int iHashCode3 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        String str = this.read;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode7 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode8 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode9 = Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
        GmsLogger gmsLogger = this.RemoteActionCompatParcelizer;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (gmsLogger != null ? gmsLogger.hashCode() : 0);
    }

    public final String toString() {
        Coupon coupon = this.IconCompatParcelizer;
        Plan plan = this.AudioAttributesImplApi26Parcelizer;
        String str = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.write;
        String str3 = this.read;
        boolean z = this.AudioAttributesCompatParcelizer;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        GmsLogger gmsLogger = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("PaymentDoneUiState(appliedCoupon=");
        sb.append(coupon);
        sb.append(", plan=");
        sb.append(plan);
        sb.append(", paymentId=");
        sb.append(str);
        sb.append(", addOnId=");
        sb.append(str2);
        sb.append(", expiryDate=");
        sb.append(str3);
        sb.append(", isPlanBUpgrade=");
        sb.append(z);
        sb.append(", paymentGateway=");
        sb.append(i);
        sb.append(", orderId=");
        sb.append(str4);
        sb.append(", shouldShowKycDisclaimer=");
        sb.append(z2);
        sb.append(", addressForm=");
        sb.append(gmsLogger);
        sb.append(")");
        return sb.toString();
    }
}
