package com.marrow2.data.subscription.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J~\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0015R\u001c\u00100\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0015R\u001a\u00105\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u0015R\u001c\u0010:\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001eR\u001a\u0010=\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010 R\u001a\u0010?\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b?\u0010 R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010#"}, d2 = {"Lcom/marrow2/data/subscription/remote/model/PlanSubscriptionRSModel;", "", "", "p0", "p1", "", "p2", "p3", "Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;", "p4", "p5", "", "p6", "", "p7", "p8", "", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Z", "component9", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/util/List;)Lcom/marrow2/data/subscription/remote/model/PlanSubscriptionRSModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "invoiceUrl", "getInvoiceUrl", "paymentDate", "Ljava/lang/Long;", "getPaymentDate", "paymentRefId", "getPaymentRefId", "planData", "Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;", "getPlanData", "planId", "getPlanId", "sortOrder", "Ljava/lang/Integer;", "getSortOrder", "isFreePlan", "Z", "isAddressAvailable", "addOnPlans", "Ljava/util/List;", "getAddOnPlans"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanSubscriptionRSModel {
    public static final int $stable = 8;

    @JsonProperty("addon_plans")
    private final List<String> addOnPlans;

    @JsonProperty("_id")
    private final String id;

    @JsonProperty("invoice_url")
    private final String invoiceUrl;

    @JsonProperty("is_address_available")
    private final boolean isAddressAvailable;

    @JsonProperty("free_plan")
    private final boolean isFreePlan;

    @JsonProperty("payment_date")
    private final Long paymentDate;

    @JsonProperty("payment_ref_id")
    private final String paymentRefId;

    @JsonProperty("plan_data")
    private final PlanDetailRSModel planData;

    @JsonProperty("plan_id")
    private final String planId;

    @JsonProperty("sort_order")
    private final Integer sortOrder;

    public PlanSubscriptionRSModel(String str, String str2, Long l, String str3, PlanDetailRSModel planDetailRSModel, String str4, Integer num, boolean z, boolean z2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(planDetailRSModel, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.invoiceUrl = str2;
        this.paymentDate = l;
        this.paymentRefId = str3;
        this.planData = planDetailRSModel;
        this.planId = str4;
        this.sortOrder = num;
        this.isFreePlan = z;
        this.isAddressAvailable = z2;
        this.addOnPlans = list;
    }

    public /* synthetic */ PlanSubscriptionRSModel(String str, String str2, Long l, String str3, PlanDetailRSModel planDetailRSModel, String str4, Integer num, boolean z, boolean z2, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new PlanDetailRSModel(null, 0, null, null, 15, null) : planDetailRSModel, (i & 32) == 0 ? str4 : "", (i & 64) == 0 ? num : null, (i & 128) != 0 ? false : z, (i & 256) == 0 ? z2 : false, (i & 512) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final String getId() {
        return this.id;
    }

    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    public final PlanDetailRSModel getPlanData() {
        return this.planData;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final boolean isFreePlan() {
        return this.isFreePlan;
    }

    public final boolean isAddressAvailable() {
        return this.isAddressAvailable;
    }

    public final List<String> getAddOnPlans() {
        return this.addOnPlans;
    }

    public PlanSubscriptionRSModel() {
        this(null, null, null, null, null, null, null, false, false, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.addOnPlans;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PlanDetailRSModel getPlanData() {
        return this.planData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFreePlan() {
        return this.isFreePlan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAddressAvailable() {
        return this.isAddressAvailable;
    }

    public final PlanSubscriptionRSModel copy(String p0, String p1, Long p2, String p3, PlanDetailRSModel p4, String p5, Integer p6, boolean p7, boolean p8, List<String> p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        return new PlanSubscriptionRSModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanSubscriptionRSModel)) {
            return false;
        }
        PlanSubscriptionRSModel planSubscriptionRSModel = (PlanSubscriptionRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planSubscriptionRSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.invoiceUrl, (Object) planSubscriptionRSModel.invoiceUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.paymentDate, planSubscriptionRSModel.paymentDate) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.paymentRefId, (Object) planSubscriptionRSModel.paymentRefId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planData, planSubscriptionRSModel.planData) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planId, (Object) planSubscriptionRSModel.planId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sortOrder, planSubscriptionRSModel.sortOrder) && this.isFreePlan == planSubscriptionRSModel.isFreePlan && this.isAddressAvailable == planSubscriptionRSModel.isAddressAvailable && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.addOnPlans, planSubscriptionRSModel.addOnPlans);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.invoiceUrl.hashCode();
        Long l = this.paymentDate;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        int iHashCode4 = this.paymentRefId.hashCode();
        int iHashCode5 = this.planData.hashCode();
        int iHashCode6 = this.planId.hashCode();
        Integer num = this.sortOrder;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFreePlan)) * 31) + Boolean.hashCode(this.isAddressAvailable)) * 31) + this.addOnPlans.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.invoiceUrl;
        Long l = this.paymentDate;
        String str3 = this.paymentRefId;
        PlanDetailRSModel planDetailRSModel = this.planData;
        String str4 = this.planId;
        Integer num = this.sortOrder;
        boolean z = this.isFreePlan;
        boolean z2 = this.isAddressAvailable;
        List<String> list = this.addOnPlans;
        StringBuilder sb = new StringBuilder("PlanSubscriptionRSModel(id=");
        sb.append(str);
        sb.append(", invoiceUrl=");
        sb.append(str2);
        sb.append(", paymentDate=");
        sb.append(l);
        sb.append(", paymentRefId=");
        sb.append(str3);
        sb.append(", planData=");
        sb.append(planDetailRSModel);
        sb.append(", planId=");
        sb.append(str4);
        sb.append(", sortOrder=");
        sb.append(num);
        sb.append(", isFreePlan=");
        sb.append(z);
        sb.append(", isAddressAvailable=");
        sb.append(z2);
        sb.append(", addOnPlans=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
