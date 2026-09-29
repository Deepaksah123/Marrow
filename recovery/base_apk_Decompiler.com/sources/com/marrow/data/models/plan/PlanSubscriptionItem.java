package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0018\b\u0001\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0011j\b\u0012\u0004\u0012\u00020\u0003`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0011j\b\u0012\u0004\u0012\u00020\u0003`\u0012HÆ\u0003J\u0092\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0011j\b\u0012\u0004\u0012\u00020\u0003`\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\r\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u000f\u0010\"R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0011j\b\u0012\u0004\u0012\u00020\u0003`\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006;"}, d2 = {"Lcom/marrow/data/models/plan/PlanSubscriptionItem;", "", "id", "", "invoiceUrl", "paymentDate", "", "paymentRefId", "planData", "Lcom/marrow/data/models/plan/PlanData;", "planId", "sortOrder", "", "isFreePlan", "", "isAddressAvailable", "addOnPlans", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/marrow/data/models/plan/PlanData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;)V", "getId", "()Ljava/lang/String;", "getInvoiceUrl", "getPaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPaymentRefId", "getPlanData", "()Lcom/marrow/data/models/plan/PlanData;", "getPlanId", "getSortOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAddOnPlans", "()Ljava/util/ArrayList;", "itemExpanded", "getItemExpanded", "()Z", "setItemExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/marrow/data/models/plan/PlanData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lcom/marrow/data/models/plan/PlanSubscriptionItem;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanSubscriptionItem {
    private final ArrayList<String> addOnPlans;
    private final String id;
    private final String invoiceUrl;
    private final Boolean isAddressAvailable;
    private final Boolean isFreePlan;
    private boolean itemExpanded;
    private final Long paymentDate;
    private final String paymentRefId;
    private final PlanData planData;
    private final String planId;
    private final Integer sortOrder;

    public PlanSubscriptionItem(@JsonProperty("_id") String str, @JsonProperty("invoice_url") String str2, @JsonProperty("payment_date") Long l, @JsonProperty("payment_ref_id") String str3, @JsonProperty("plan_data") PlanData planData, @JsonProperty("plan_id") String str4, @JsonProperty("sort_order") Integer num, @JsonProperty("free_plan") Boolean bool, @JsonProperty("is_address_available") Boolean bool2, @JsonProperty("addon_plans") ArrayList<String> arrayList) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(arrayList, "");
        this.id = str;
        this.invoiceUrl = str2;
        this.paymentDate = l;
        this.paymentRefId = str3;
        this.planData = planData;
        this.planId = str4;
        this.sortOrder = num;
        this.isFreePlan = bool;
        this.isAddressAvailable = bool2;
        this.addOnPlans = arrayList;
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

    public final PlanData getPlanData() {
        return this.planData;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final Boolean isFreePlan() {
        return this.isFreePlan;
    }

    public final Boolean isAddressAvailable() {
        return this.isAddressAvailable;
    }

    public final ArrayList<String> getAddOnPlans() {
        return this.addOnPlans;
    }

    public final boolean getItemExpanded() {
        return this.itemExpanded;
    }

    public final void setItemExpanded(boolean z) {
        this.itemExpanded = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ArrayList<String> component10() {
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
    public final PlanData getPlanData() {
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
    public final Boolean getIsFreePlan() {
        return this.isFreePlan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsAddressAvailable() {
        return this.isAddressAvailable;
    }

    public final PlanSubscriptionItem copy(@JsonProperty("_id") String id, @JsonProperty("invoice_url") String invoiceUrl, @JsonProperty("payment_date") Long paymentDate, @JsonProperty("payment_ref_id") String paymentRefId, @JsonProperty("plan_data") PlanData planData, @JsonProperty("plan_id") String planId, @JsonProperty("sort_order") Integer sortOrder, @JsonProperty("free_plan") Boolean isFreePlan, @JsonProperty("is_address_available") Boolean isAddressAvailable, @JsonProperty("addon_plans") ArrayList<String> addOnPlans) {
        toMagicModuleMetaRepoModel.write(id, "");
        toMagicModuleMetaRepoModel.write(addOnPlans, "");
        return new PlanSubscriptionItem(id, invoiceUrl, paymentDate, paymentRefId, planData, planId, sortOrder, isFreePlan, isAddressAvailable, addOnPlans);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanSubscriptionItem)) {
            return false;
        }
        PlanSubscriptionItem planSubscriptionItem = (PlanSubscriptionItem) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planSubscriptionItem.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.invoiceUrl, (Object) planSubscriptionItem.invoiceUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.paymentDate, planSubscriptionItem.paymentDate) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.paymentRefId, (Object) planSubscriptionItem.paymentRefId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planData, planSubscriptionItem.planData) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planId, (Object) planSubscriptionItem.planId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sortOrder, planSubscriptionItem.sortOrder) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.isFreePlan, planSubscriptionItem.isFreePlan) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.isAddressAvailable, planSubscriptionItem.isAddressAvailable) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.addOnPlans, planSubscriptionItem.addOnPlans);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.invoiceUrl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l = this.paymentDate;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str2 = this.paymentRefId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        PlanData planData = this.planData;
        int iHashCode5 = planData == null ? 0 : planData.hashCode();
        String str3 = this.planId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.sortOrder;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isFreePlan;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isAddressAvailable;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.addOnPlans.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.invoiceUrl;
        Long l = this.paymentDate;
        String str3 = this.paymentRefId;
        PlanData planData = this.planData;
        String str4 = this.planId;
        Integer num = this.sortOrder;
        Boolean bool = this.isFreePlan;
        Boolean bool2 = this.isAddressAvailable;
        ArrayList<String> arrayList = this.addOnPlans;
        StringBuilder sb = new StringBuilder("PlanSubscriptionItem(id=");
        sb.append(str);
        sb.append(", invoiceUrl=");
        sb.append(str2);
        sb.append(", paymentDate=");
        sb.append(l);
        sb.append(", paymentRefId=");
        sb.append(str3);
        sb.append(", planData=");
        sb.append(planData);
        sb.append(", planId=");
        sb.append(str4);
        sb.append(", sortOrder=");
        sb.append(num);
        sb.append(", isFreePlan=");
        sb.append(bool);
        sb.append(", isAddressAvailable=");
        sb.append(bool2);
        sb.append(", addOnPlans=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }
}
