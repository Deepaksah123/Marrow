package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.models.plan.PlanAddOnsKt;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;
import java.util.List;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.SilenceMediaSourceSilenceSampleStream;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0098\u0001\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0018R$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u00109R\"\u0010B\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u00104R\"\u0010E\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00101\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u00104R(\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010#\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u00106\u001a\u0004\bS\u0010\u001a\"\u0004\bT\u00109R$\u0010U\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u00101\u001a\u0004\bV\u0010\u0018\"\u0004\bW\u00104R$\u0010X\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u00101\u001a\u0004\bY\u0010\u0018\"\u0004\bZ\u00104R$\u0010[\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010(\"\u0004\b^\u0010_"}, d2 = {"Lcom/marrow/data/api/models/response/plan/UpgradePlanResponseV2;", "", "", "p0", "", "p1", "Lcom/marrow/data/api/models/response/plan/UpgradeCardContent;", "p2", "p3", "p4", "p5", "", "Lcom/marrow/data/api/models/response/plan/PlanBUpgradeData;", "p6", "", "p7", "p8", "p9", "p10", "Lcom/marrow/data/api/models/response/plan/OrderDetails;", "p11", "<init>", "(Ljava/lang/String;ILcom/marrow/data/api/models/response/plan/UpgradeCardContent;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;JILjava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/OrderDetails;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/marrow/data/api/models/response/plan/UpgradeCardContent;", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()J", "component9", "component10", "component11", "component12", "()Lcom/marrow/data/api/models/response/plan/OrderDetails;", "copy", "(Ljava/lang/String;ILcom/marrow/data/api/models/response/plan/UpgradeCardContent;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;JILjava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/OrderDetails;)Lcom/marrow/data/api/models/response/plan/UpgradePlanResponseV2;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "basePrice", "I", "getBasePrice", "setBasePrice", "(I)V", "cardContent", "Lcom/marrow/data/api/models/response/plan/UpgradeCardContent;", "getCardContent", "setCardContent", "(Lcom/marrow/data/api/models/response/plan/UpgradeCardContent;)V", "price", "getPrice", "setPrice", "groupSubTitle", "getGroupSubTitle", "setGroupSubTitle", "groupTitle", "getGroupTitle", "setGroupTitle", "planBUpgradeDataList", "Ljava/util/List;", "getPlanBUpgradeDataList", "setPlanBUpgradeDataList", "(Ljava/util/List;)V", "validTill", "J", "getValidTill", "setValidTill", "(J)V", "subscriptionPeriod", "getSubscriptionPeriod", "setSubscriptionPeriod", "orderId", "getOrderId", "setOrderId", "groupId", "getGroupId", "setGroupId", PaymentConstants.ORDER_DETAILS_CAMEL, "Lcom/marrow/data/api/models/response/plan/OrderDetails;", "getOrderDetails", "setOrderDetails", "(Lcom/marrow/data/api/models/response/plan/OrderDetails;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpgradePlanResponseV2 {
    private int basePrice;
    private UpgradeCardContent cardContent;
    private String groupId;
    private String groupSubTitle;
    private String groupTitle;
    private String id;
    private OrderDetails orderDetails;
    private String orderId;
    private List<PlanBUpgradeData> planBUpgradeDataList;
    private int price;
    private int subscriptionPeriod;
    private long validTill;

    public UpgradePlanResponseV2(@JsonProperty("_id") String str, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) int i, @JsonProperty("card_content") UpgradeCardContent upgradeCardContent, @JsonProperty("price") int i2, @JsonProperty("group_sub_title") String str2, @JsonProperty("group_title") String str3, @JsonProperty("group_description") List<PlanBUpgradeData> list, @JsonProperty("valid_till") long j, @JsonProperty("subscription_period") int i3, @JsonProperty(PaymentConstants.ORDER_ID) String str4, @JsonProperty("group_id") String str5, @JsonProperty("order_details") OrderDetails orderDetails) {
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.basePrice = i;
        this.cardContent = upgradeCardContent;
        this.price = i2;
        this.groupSubTitle = str2;
        this.groupTitle = str3;
        this.planBUpgradeDataList = list;
        this.validTill = j;
        this.subscriptionPeriod = i3;
        this.orderId = str4;
        this.groupId = str5;
        this.orderDetails = orderDetails;
    }

    public /* synthetic */ UpgradePlanResponseV2(String str, int i, UpgradeCardContent upgradeCardContent, int i2, String str2, String str3, List list, long j, int i3, String str4, String str5, OrderDetails orderDetails, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? null : str, i, (i4 & 4) != 0 ? null : upgradeCardContent, i2, str2, str3, list, j, i3, (i4 & 512) != 0 ? null : str4, (i4 & 1024) != 0 ? null : str5, (i4 & 2048) != 0 ? null : orderDetails);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final int getBasePrice() {
        return this.basePrice;
    }

    public final void setBasePrice(int i) {
        this.basePrice = i;
    }

    public final UpgradeCardContent getCardContent() {
        return this.cardContent;
    }

    public final void setCardContent(UpgradeCardContent upgradeCardContent) {
        this.cardContent = upgradeCardContent;
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final String getGroupSubTitle() {
        return this.groupSubTitle;
    }

    public final void setGroupSubTitle(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.groupSubTitle = str;
    }

    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final void setGroupTitle(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.groupTitle = str;
    }

    public final List<PlanBUpgradeData> getPlanBUpgradeDataList() {
        return this.planBUpgradeDataList;
    }

    public final void setPlanBUpgradeDataList(List<PlanBUpgradeData> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.planBUpgradeDataList = list;
    }

    public final long getValidTill() {
        return this.validTill;
    }

    public final void setValidTill(long j) {
        this.validTill = j;
    }

    public final int getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final void setSubscriptionPeriod(int i) {
        this.subscriptionPeriod = i;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UpgradeCardContent getCardContent() {
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

    public final List<PlanBUpgradeData> component7() {
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

    public final UpgradePlanResponseV2 copy(@JsonProperty("_id") String p0, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) int p1, @JsonProperty("card_content") UpgradeCardContent p2, @JsonProperty("price") int p3, @JsonProperty("group_sub_title") String p4, @JsonProperty("group_title") String p5, @JsonProperty("group_description") List<PlanBUpgradeData> p6, @JsonProperty("valid_till") long p7, @JsonProperty("subscription_period") int p8, @JsonProperty(PaymentConstants.ORDER_ID) String p9, @JsonProperty("group_id") String p10, @JsonProperty("order_details") OrderDetails p11) {
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        return new UpgradePlanResponseV2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpgradePlanResponseV2)) {
            return false;
        }
        UpgradePlanResponseV2 upgradePlanResponseV2 = (UpgradePlanResponseV2) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) upgradePlanResponseV2.id) && this.basePrice == upgradePlanResponseV2.basePrice && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cardContent, upgradePlanResponseV2.cardContent) && this.price == upgradePlanResponseV2.price && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.groupSubTitle, (Object) upgradePlanResponseV2.groupSubTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.groupTitle, (Object) upgradePlanResponseV2.groupTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planBUpgradeDataList, upgradePlanResponseV2.planBUpgradeDataList) && this.validTill == upgradePlanResponseV2.validTill && this.subscriptionPeriod == upgradePlanResponseV2.subscriptionPeriod && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) upgradePlanResponseV2.orderId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.groupId, (Object) upgradePlanResponseV2.groupId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.orderDetails, upgradePlanResponseV2.orderDetails);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.basePrice);
        UpgradeCardContent upgradeCardContent = this.cardContent;
        int iHashCode3 = upgradeCardContent == null ? 0 : upgradeCardContent.hashCode();
        int iHashCode4 = Integer.hashCode(this.price);
        int iHashCode5 = this.groupSubTitle.hashCode();
        int iHashCode6 = this.groupTitle.hashCode();
        int iHashCode7 = this.planBUpgradeDataList.hashCode();
        int iHashCode8 = Long.hashCode(this.validTill);
        int iHashCode9 = Integer.hashCode(this.subscriptionPeriod);
        String str2 = this.orderId;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupId;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        OrderDetails orderDetails = this.orderDetails;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (orderDetails != null ? orderDetails.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        int i = this.basePrice;
        UpgradeCardContent upgradeCardContent = this.cardContent;
        int i2 = this.price;
        String str2 = this.groupSubTitle;
        String str3 = this.groupTitle;
        List<PlanBUpgradeData> list = this.planBUpgradeDataList;
        long j = this.validTill;
        int i3 = this.subscriptionPeriod;
        String str4 = this.orderId;
        String str5 = this.groupId;
        OrderDetails orderDetails = this.orderDetails;
        StringBuilder sb = new StringBuilder("UpgradePlanResponseV2(id=");
        sb.append(str);
        sb.append(", basePrice=");
        sb.append(i);
        sb.append(", cardContent=");
        sb.append(upgradeCardContent);
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
        sb.append(", groupId=");
        sb.append(str5);
        sb.append(", orderDetails=");
        sb.append(orderDetails);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 21);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.basePrice));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 137);
        UpgradeCardContent upgradeCardContent = this.cardContent;
        sendSetRequirements.write(setdownloadingstatestoqueued, UpgradeCardContent.class, upgradeCardContent).read(downloadHelper2, upgradeCardContent);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 67);
        downloadHelper2.AudioAttributesCompatParcelizer(this.groupId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 175);
        downloadHelper2.AudioAttributesCompatParcelizer(this.groupSubTitle);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_E_AC3);
        downloadHelper2.AudioAttributesCompatParcelizer(this.groupTitle);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 180);
        downloadHelper2.AudioAttributesCompatParcelizer(this.id);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 70);
        OrderDetails orderDetails = this.orderDetails;
        sendSetRequirements.write(setdownloadingstatestoqueued, OrderDetails.class, orderDetails).read(downloadHelper2, orderDetails);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 16);
        downloadHelper2.AudioAttributesCompatParcelizer(this.orderId);
        if (this != this.planBUpgradeDataList) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 34);
            SilenceMediaSourceSilenceSampleStream silenceMediaSourceSilenceSampleStream = new SilenceMediaSourceSilenceSampleStream();
            List<PlanBUpgradeData> list = this.planBUpgradeDataList;
            sendSetRequirements.write(setdownloadingstatestoqueued, silenceMediaSourceSilenceSampleStream, list).read(downloadHelper2, list);
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

    public /* synthetic */ UpgradePlanResponseV2() {
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
        switch (i) {
            case 10:
                if (z) {
                    this.validTill = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                    return;
                } else {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            case 15:
                if (z) {
                    this.planBUpgradeDataList = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new SilenceMediaSourceSilenceSampleStream()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                    return;
                } else {
                    this.planBUpgradeDataList = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            case 29:
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
            case 37:
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
            case 50:
                if (z) {
                    this.cardContent = (UpgradeCardContent) setdownloadingstatestoqueued.read(UpgradeCardContent.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                    return;
                } else {
                    this.cardContent = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            case 64:
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
            case 76:
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
            case 106:
                if (z) {
                    this.orderDetails = (OrderDetails) setdownloadingstatestoqueued.read(OrderDetails.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                    return;
                } else {
                    this.orderDetails = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            case 121:
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
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
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
            case 136:
                if (!z) {
                    this.groupTitle = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.groupTitle = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                    return;
                } else {
                    this.groupTitle = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                    return;
                }
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                if (!z) {
                    this.groupId = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.groupId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                    return;
                } else {
                    this.groupId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                    return;
                }
            default:
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                return;
        }
    }
}
