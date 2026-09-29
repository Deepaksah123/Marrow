package com.marrow.data.api.models.response.plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JB\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u000fR\u001a\u0010)\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0012R\"\u0010,\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010/"}, d2 = {"Lcom/marrow/data/api/models/response/plan/PlanDetails;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "", "p3", "p4", "<init>", "(IJJLjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()J", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(IJJLjava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/plan/PlanDetails;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "planDuration", "I", "getPlanDuration", "planNewPrice", "J", "getPlanNewPrice", "planOldPrice", "getPlanOldPrice", "planName", "Ljava/lang/String;", "getPlanName", "renewGrpId", "getRenewGrpId", "setRenewGrpId", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDetails implements Parcelable {
    public static final Parcelable.Creator<PlanDetails> CREATOR = new Creator();
    private int planDuration;
    private String planName;
    private long planNewPrice;
    private long planOldPrice;
    private String renewGrpId;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlanDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanDetails createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new PlanDetails(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanDetails[] newArray(int i) {
            return new PlanDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PlanDetails(@JsonProperty("duration") int i, @JsonProperty("new_price") long j, @JsonProperty("old_price") long j2, @JsonProperty("name") String str, @JsonProperty("group_id") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.planDuration = i;
        this.planNewPrice = j;
        this.planOldPrice = j2;
        this.planName = str;
        this.renewGrpId = str2;
    }

    public final int getPlanDuration() {
        return this.planDuration;
    }

    public final long getPlanNewPrice() {
        return this.planNewPrice;
    }

    public final long getPlanOldPrice() {
        return this.planOldPrice;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public /* synthetic */ PlanDetails(int i, long j, long j2, String str, String str2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, str, (i2 & 16) != 0 ? "3" : str2);
    }

    public final String getRenewGrpId() {
        return this.renewGrpId;
    }

    public final void setRenewGrpId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.renewGrpId = str;
    }

    public static /* synthetic */ PlanDetails copy$default(PlanDetails planDetails, int i, long j, long j2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = planDetails.planDuration;
        }
        if ((i2 & 2) != 0) {
            j = planDetails.planNewPrice;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = planDetails.planOldPrice;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            str = planDetails.planName;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            str2 = planDetails.renewGrpId;
        }
        return planDetails.copy(i, j3, j4, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPlanDuration() {
        return this.planDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPlanNewPrice() {
        return this.planNewPrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPlanOldPrice() {
        return this.planOldPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRenewGrpId() {
        return this.renewGrpId;
    }

    public final PlanDetails copy(@JsonProperty("duration") int p0, @JsonProperty("new_price") long p1, @JsonProperty("old_price") long p2, @JsonProperty("name") String p3, @JsonProperty("group_id") String p4) {
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new PlanDetails(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanDetails)) {
            return false;
        }
        PlanDetails planDetails = (PlanDetails) p0;
        return this.planDuration == planDetails.planDuration && this.planNewPrice == planDetails.planNewPrice && this.planOldPrice == planDetails.planOldPrice && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planName, (Object) planDetails.planName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.renewGrpId, (Object) planDetails.renewGrpId);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.planDuration) * 31) + Long.hashCode(this.planNewPrice)) * 31) + Long.hashCode(this.planOldPrice)) * 31) + this.planName.hashCode()) * 31) + this.renewGrpId.hashCode();
    }

    public final String toString() {
        int i = this.planDuration;
        long j = this.planNewPrice;
        long j2 = this.planOldPrice;
        String str = this.planName;
        String str2 = this.renewGrpId;
        StringBuilder sb = new StringBuilder("PlanDetails(planDuration=");
        sb.append(i);
        sb.append(", planNewPrice=");
        sb.append(j);
        sb.append(", planOldPrice=");
        sb.append(j2);
        sb.append(", planName=");
        sb.append(str);
        sb.append(", renewGrpId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.planDuration);
        p0.writeLong(this.planNewPrice);
        p0.writeLong(this.planOldPrice);
        p0.writeString(this.planName);
        p0.writeString(this.renewGrpId);
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 63);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.planDuration));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 49);
        downloadHelper2.AudioAttributesCompatParcelizer(this.planName);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.planNewPrice);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 95);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(this.planOldPrice);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 67);
        downloadHelper2.AudioAttributesCompatParcelizer(this.renewGrpId);
    }

    public /* synthetic */ PlanDetails() {
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 0) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.planDuration = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 21) {
            if (!z) {
                this.planName = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.planName = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.planName = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 42) {
            if (z) {
                this.planOldPrice = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 102) {
            if (z) {
                this.planNewPrice = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 172) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.renewGrpId = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.renewGrpId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.renewGrpId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
