package com.marrow2.data.pref.repo.model;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.List;
import kotlin.AesCipherDataSource;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015Jz\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0015R\u0017\u0010*\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u00100\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010\u0015R \u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001eR\u001a\u0010<\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010 R\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u0010\u0017R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010\u0015"}, d2 = {"Lcom/marrow2/data/pref/repo/model/UpgradePlanRepoModel;", "", "", "p0", "", "p1", "Lcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;", "p2", "p3", "p4", "p5", "", "Lcom/marrow2/data/pref/repo/model/PlanBUpgradeLSModel;", "p6", "", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;ILcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;JILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()J", "component9", "component10", "copy", "(Ljava/lang/String;ILcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;JILjava/lang/String;)Lcom/marrow2/data/pref/repo/model/UpgradePlanRepoModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "basePrice", "I", "getBasePrice", "cardContent", "Lcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;", "getCardContent", "price", "getPrice", "groupSubTitle", "getGroupSubTitle", "groupTitle", "getGroupTitle", "planBUpgradeDataList", "Ljava/util/List;", "getPlanBUpgradeDataList", "validTill", "J", "getValidTill", "subscriptionPeriod", "getSubscriptionPeriod", "orderId", "getOrderId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpgradePlanRepoModel {
    public static final int $stable = 8;
    private int basePrice;
    private UpgradeContentRepoModel cardContent;
    private String groupSubTitle;
    private String groupTitle;
    private String id;
    private String orderId;
    private List<PlanBUpgradeLSModel> planBUpgradeDataList;
    private int price;
    private int subscriptionPeriod;
    private long validTill;

    public UpgradePlanRepoModel(String str, int i, UpgradeContentRepoModel upgradeContentRepoModel, int i2, String str2, String str3, List<PlanBUpgradeLSModel> list, long j, int i3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(upgradeContentRepoModel, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.id = str;
        this.basePrice = i;
        this.cardContent = upgradeContentRepoModel;
        this.price = i2;
        this.groupSubTitle = str2;
        this.groupTitle = str3;
        this.planBUpgradeDataList = list;
        this.validTill = j;
        this.subscriptionPeriod = i3;
        this.orderId = str4;
    }

    public /* synthetic */ UpgradePlanRepoModel(String str, int i, UpgradeContentRepoModel upgradeContentRepoModel, int i2, String str2, String str3, List list, long j, int i3, String str4, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? new UpgradeContentRepoModel(null, null, 3, null) : upgradeContentRepoModel, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i4 & 128) != 0 ? 0L : j, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) == 0 ? str4 : "");
    }

    public final String getId() {
        return this.id;
    }

    public final int getBasePrice() {
        return this.basePrice;
    }

    public final UpgradeContentRepoModel getCardContent() {
        return this.cardContent;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getGroupSubTitle() {
        return this.groupSubTitle;
    }

    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final List<PlanBUpgradeLSModel> getPlanBUpgradeDataList() {
        return this.planBUpgradeDataList;
    }

    public final long getValidTill() {
        return this.validTill;
    }

    public final int getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public UpgradePlanRepoModel() {
        this(null, 0, null, 0, null, null, null, 0L, 0, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UpgradeContentRepoModel getCardContent() {
        return this.cardContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupSubTitle() {
        return this.groupSubTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final List<PlanBUpgradeLSModel> component7() {
        return this.planBUpgradeDataList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getValidTill() {
        return this.validTill;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final UpgradePlanRepoModel copy(String p0, int p1, UpgradeContentRepoModel p2, int p3, String p4, String p5, List<PlanBUpgradeLSModel> p6, long p7, int p8, String p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        return new UpgradePlanRepoModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpgradePlanRepoModel)) {
            return false;
        }
        UpgradePlanRepoModel upgradePlanRepoModel = (UpgradePlanRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) upgradePlanRepoModel.id) && this.basePrice == upgradePlanRepoModel.basePrice && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cardContent, upgradePlanRepoModel.cardContent) && this.price == upgradePlanRepoModel.price && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.groupSubTitle, (Object) upgradePlanRepoModel.groupSubTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.groupTitle, (Object) upgradePlanRepoModel.groupTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planBUpgradeDataList, upgradePlanRepoModel.planBUpgradeDataList) && this.validTill == upgradePlanRepoModel.validTill && this.subscriptionPeriod == upgradePlanRepoModel.subscriptionPeriod && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) upgradePlanRepoModel.orderId);
    }

    public final int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.basePrice)) * 31) + this.cardContent.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + this.groupSubTitle.hashCode()) * 31) + this.groupTitle.hashCode()) * 31) + this.planBUpgradeDataList.hashCode()) * 31) + Long.hashCode(this.validTill)) * 31) + Integer.hashCode(this.subscriptionPeriod)) * 31) + this.orderId.hashCode();
    }

    public final String toString() {
        String str = this.id;
        int i = this.basePrice;
        UpgradeContentRepoModel upgradeContentRepoModel = this.cardContent;
        int i2 = this.price;
        String str2 = this.groupSubTitle;
        String str3 = this.groupTitle;
        List<PlanBUpgradeLSModel> list = this.planBUpgradeDataList;
        long j = this.validTill;
        int i3 = this.subscriptionPeriod;
        String str4 = this.orderId;
        StringBuilder sb = new StringBuilder("UpgradePlanRepoModel(id=");
        sb.append(str);
        sb.append(", basePrice=");
        sb.append(i);
        sb.append(", cardContent=");
        sb.append(upgradeContentRepoModel);
        sb.append(", price=");
        sb.append(i2);
        sb.append(", groupSubTitle=");
        sb.append(str2);
        sb.append(", groupTitle=");
        sb.append(str3);
        sb.append(", planBUpgradeDataList=");
        sb.append(list);
        sb.append(", validTill=");
        sb.append(j);
        sb.append(", subscriptionPeriod=");
        sb.append(i3);
        sb.append(", orderId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        read(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 21);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.basePrice));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 137);
        UpgradeContentRepoModel upgradeContentRepoModel = this.cardContent;
        sendSetRequirements.write(setdownloadingstatestoqueued, UpgradeContentRepoModel.class, upgradeContentRepoModel).read(downloadHelper2, upgradeContentRepoModel);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 175);
        downloadHelper2.AudioAttributesCompatParcelizer(this.groupSubTitle);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_E_AC3);
        downloadHelper2.AudioAttributesCompatParcelizer(this.groupTitle);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 180);
        downloadHelper2.AudioAttributesCompatParcelizer(this.id);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 16);
        downloadHelper2.AudioAttributesCompatParcelizer(this.orderId);
        if (this != this.planBUpgradeDataList) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 34);
            AesCipherDataSource aesCipherDataSource = new AesCipherDataSource();
            List<PlanBUpgradeLSModel> list = this.planBUpgradeDataList;
            sendSetRequirements.write(setdownloadingstatestoqueued, aesCipherDataSource, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 85);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.price));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 90);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.subscriptionPeriod));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 29);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.validTill);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 10) {
            if (z) {
                this.validTill = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 15) {
            if (z) {
                this.planBUpgradeDataList = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new AesCipherDataSource()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.planBUpgradeDataList = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 29) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.subscriptionPeriod = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 37) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.price = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
        if (i == 50) {
            if (z) {
                this.cardContent = (UpgradeContentRepoModel) setdownloadingstatestoqueued.read(UpgradeContentRepoModel.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.cardContent = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 64) {
            if (!z) {
                this.id = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.id = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.id = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 76) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.basePrice = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e3) {
                throw new getPercentDownloaded(e3);
            }
        }
        if (i == 121) {
            if (!z) {
                this.groupSubTitle = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.groupSubTitle = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.groupSubTitle = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 134) {
            if (!z) {
                this.orderId = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.orderId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.orderId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 136) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.groupTitle = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.groupTitle = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.groupTitle = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
