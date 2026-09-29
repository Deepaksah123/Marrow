package com.marrow.data.api.models.response.plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0012R\u001a\u00105\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019"}, d2 = {"Lcom/marrow/data/api/models/response/plan/RenewEligible;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "Lcom/marrow/data/api/models/response/plan/PlanDetails;", "p2", "Lcom/marrow/data/api/models/response/plan/RenewBanner;", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;JLcom/marrow/data/api/models/response/plan/PlanDetails;Lcom/marrow/data/api/models/response/plan/RenewBanner;JI)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/marrow/data/api/models/response/plan/PlanDetails;", "component4", "()Lcom/marrow/data/api/models/response/plan/RenewBanner;", "component5", "component6", "()I", "copy", "(Ljava/lang/String;JLcom/marrow/data/api/models/response/plan/PlanDetails;Lcom/marrow/data/api/models/response/plan/RenewBanner;JI)Lcom/marrow/data/api/models/response/plan/RenewEligible;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "coupon", "Ljava/lang/String;", "getCoupon", "subscriptionExpiresOn", "J", "getSubscriptionExpiresOn", "planDetails", "Lcom/marrow/data/api/models/response/plan/PlanDetails;", "getPlanDetails", "rfBanners", "Lcom/marrow/data/api/models/response/plan/RenewBanner;", "getRfBanners", "renewExpiresOn", "getRenewExpiresOn", "renewFlowType", "I", "getRenewFlowType", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RenewEligible implements Parcelable {
    public static final int RENEW_FLOW_TYPE_FOUR = 4;
    public static final int RENEW_FLOW_TYPE_ONE = 1;
    public static final int RENEW_FLOW_TYPE_THREE = 3;
    public static final int RENEW_FLOW_TYPE_TWO = 2;
    private String coupon;
    private PlanDetails planDetails;
    private long renewExpiresOn;
    private int renewFlowType;
    private RenewBanner rfBanners;
    private long subscriptionExpiresOn;
    public static final Parcelable.Creator<RenewEligible> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RenewEligible> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RenewEligible createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new RenewEligible(parcel.readString(), parcel.readLong(), PlanDetails.CREATOR.createFromParcel(parcel), RenewBanner.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RenewEligible[] newArray(int i) {
            return new RenewEligible[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RenewEligible(@JsonProperty("coupon") String str, @JsonProperty("expires_on") long j, @JsonProperty("plan_details") PlanDetails planDetails, @JsonProperty("rf_banners") RenewBanner renewBanner, @JsonProperty("rf_expires_on") long j2, @JsonProperty("rf_type") int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(planDetails, "");
        toMagicModuleMetaRepoModel.write(renewBanner, "");
        this.coupon = str;
        this.subscriptionExpiresOn = j;
        this.planDetails = planDetails;
        this.rfBanners = renewBanner;
        this.renewExpiresOn = j2;
        this.renewFlowType = i;
    }

    public /* synthetic */ RenewEligible(String str, long j, PlanDetails planDetails, RenewBanner renewBanner, long j2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i2 & 2) != 0 ? 0L : j, planDetails, renewBanner, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? -1 : i);
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public final long getSubscriptionExpiresOn() {
        return this.subscriptionExpiresOn;
    }

    public final PlanDetails getPlanDetails() {
        return this.planDetails;
    }

    public final RenewBanner getRfBanners() {
        return this.rfBanners;
    }

    public final long getRenewExpiresOn() {
        return this.renewExpiresOn;
    }

    public final int getRenewFlowType() {
        return this.renewFlowType;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoupon() {
        return this.coupon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSubscriptionExpiresOn() {
        return this.subscriptionExpiresOn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlanDetails getPlanDetails() {
        return this.planDetails;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RenewBanner getRfBanners() {
        return this.rfBanners;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRenewExpiresOn() {
        return this.renewExpiresOn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRenewFlowType() {
        return this.renewFlowType;
    }

    public final RenewEligible copy(@JsonProperty("coupon") String p0, @JsonProperty("expires_on") long p1, @JsonProperty("plan_details") PlanDetails p2, @JsonProperty("rf_banners") RenewBanner p3, @JsonProperty("rf_expires_on") long p4, @JsonProperty("rf_type") int p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new RenewEligible(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RenewEligible)) {
            return false;
        }
        RenewEligible renewEligible = (RenewEligible) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.coupon, (Object) renewEligible.coupon) && this.subscriptionExpiresOn == renewEligible.subscriptionExpiresOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planDetails, renewEligible.planDetails) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.rfBanners, renewEligible.rfBanners) && this.renewExpiresOn == renewEligible.renewExpiresOn && this.renewFlowType == renewEligible.renewFlowType;
    }

    public final int hashCode() {
        return (((((((((this.coupon.hashCode() * 31) + Long.hashCode(this.subscriptionExpiresOn)) * 31) + this.planDetails.hashCode()) * 31) + this.rfBanners.hashCode()) * 31) + Long.hashCode(this.renewExpiresOn)) * 31) + Integer.hashCode(this.renewFlowType);
    }

    public final String toString() {
        String str = this.coupon;
        long j = this.subscriptionExpiresOn;
        PlanDetails planDetails = this.planDetails;
        RenewBanner renewBanner = this.rfBanners;
        long j2 = this.renewExpiresOn;
        int i = this.renewFlowType;
        StringBuilder sb = new StringBuilder("RenewEligible(coupon=");
        sb.append(str);
        sb.append(", subscriptionExpiresOn=");
        sb.append(j);
        sb.append(", planDetails=");
        sb.append(planDetails);
        sb.append(", rfBanners=");
        sb.append(renewBanner);
        sb.append(", renewExpiresOn=");
        sb.append(j2);
        sb.append(", renewFlowType=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.coupon);
        p0.writeLong(this.subscriptionExpiresOn);
        this.planDetails.writeToParcel(p0, p1);
        this.rfBanners.writeToParcel(p0, p1);
        p0.writeLong(this.renewExpiresOn);
        p0.writeInt(this.renewFlowType);
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        read(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 142);
        downloadHelper2.AudioAttributesCompatParcelizer(this.coupon);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 183);
        PlanDetails planDetails = this.planDetails;
        sendSetRequirements.write(setdownloadingstatestoqueued, PlanDetails.class, planDetails).read(downloadHelper2, planDetails);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 108);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.renewExpiresOn);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 38);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.renewFlowType));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 19);
        RenewBanner renewBanner = this.rfBanners;
        sendSetRequirements.write(setdownloadingstatestoqueued, RenewBanner.class, renewBanner).read(downloadHelper2, renewBanner);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 25);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(this.subscriptionExpiresOn);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
    }

    public /* synthetic */ RenewEligible() {
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 12) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.renewFlowType = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 17) {
            if (z) {
                this.planDetails = (PlanDetails) setdownloadingstatestoqueued.read(PlanDetails.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.planDetails = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 92) {
            if (!z) {
                this.coupon = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.coupon = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.coupon = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 128) {
            if (z) {
                this.subscriptionExpiresOn = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 145) {
            if (z) {
                this.rfBanners = (RenewBanner) setdownloadingstatestoqueued.read(RenewBanner.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.rfBanners = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 166) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.renewExpiresOn = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
        } else {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }
}
