package com.marrow.data.api.models.request.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003Je\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/marrow/data/api/models/request/payment/CreateOrderRequest;", "", "user_id", "", "coupon", "rf_coupon", "plan_id", "amount", "", "addons", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "address", "Lcom/marrow/data/api/models/request/payment/Address;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/util/ArrayList;Lcom/marrow/data/api/models/request/payment/Address;)V", "getUser_id", "()Ljava/lang/String;", "getCoupon", "getRf_coupon", "getPlan_id", "getAmount", "()D", "getAddons", "()Ljava/util/ArrayList;", "getAddress", "()Lcom/marrow/data/api/models/request/payment/Address;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateOrderRequest {

    @isFirst(RemoteActionCompatParcelizer = "addons")
    private final ArrayList<String> addons;

    @isFirst(RemoteActionCompatParcelizer = "address")
    private final Address address;

    @isFirst(RemoteActionCompatParcelizer = "amount")
    private final double amount;

    @isFirst(RemoteActionCompatParcelizer = "coupon")
    private final String coupon;

    @isFirst(RemoteActionCompatParcelizer = "plan_id")
    private final String plan_id;

    @isFirst(RemoteActionCompatParcelizer = "rf_coupon")
    private final String rf_coupon;

    @isFirst(RemoteActionCompatParcelizer = "user_id")
    private final String user_id;

    public CreateOrderRequest(@JsonProperty("user_id") String str, @JsonProperty("coupon") String str2, @JsonProperty("rf_coupon") String str3, @JsonProperty("plan_id") String str4, @JsonProperty("amount") double d, @JsonProperty("addons") ArrayList<String> arrayList, @JsonProperty("address") Address address) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(arrayList, "");
        this.user_id = str;
        this.coupon = str2;
        this.rf_coupon = str3;
        this.plan_id = str4;
        this.amount = d;
        this.addons = arrayList;
        this.address = address;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public final String getRf_coupon() {
        return this.rf_coupon;
    }

    public final String getPlan_id() {
        return this.plan_id;
    }

    public final double getAmount() {
        return this.amount;
    }

    public /* synthetic */ CreateOrderRequest(String str, String str2, String str3, String str4, double d, ArrayList arrayList, Address address, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, d, (i & 32) != 0 ? new ArrayList() : arrayList, (i & 64) != 0 ? null : address);
    }

    public final ArrayList<String> getAddons() {
        return this.addons;
    }

    public final Address getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoupon() {
        return this.coupon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRf_coupon() {
        return this.rf_coupon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlan_id() {
        return this.plan_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public final ArrayList<String> component6() {
        return this.addons;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    public final CreateOrderRequest copy(@JsonProperty("user_id") String user_id, @JsonProperty("coupon") String coupon, @JsonProperty("rf_coupon") String rf_coupon, @JsonProperty("plan_id") String plan_id, @JsonProperty("amount") double amount, @JsonProperty("addons") ArrayList<String> addons, @JsonProperty("address") Address address) {
        toMagicModuleMetaRepoModel.write(user_id, "");
        toMagicModuleMetaRepoModel.write(plan_id, "");
        toMagicModuleMetaRepoModel.write(addons, "");
        return new CreateOrderRequest(user_id, coupon, rf_coupon, plan_id, amount, addons, address);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.user_id, (Object) createOrderRequest.user_id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.coupon, (Object) createOrderRequest.coupon) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rf_coupon, (Object) createOrderRequest.rf_coupon) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.plan_id, (Object) createOrderRequest.plan_id) && Double.compare(this.amount, createOrderRequest.amount) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.addons, createOrderRequest.addons) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.address, createOrderRequest.address);
    }

    public final int hashCode() {
        int iHashCode = this.user_id.hashCode();
        String str = this.coupon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.rf_coupon;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.plan_id.hashCode();
        int iHashCode5 = Double.hashCode(this.amount);
        int iHashCode6 = this.addons.hashCode();
        Address address = this.address;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (address != null ? address.hashCode() : 0);
    }

    public final String toString() {
        String str = this.user_id;
        String str2 = this.coupon;
        String str3 = this.rf_coupon;
        String str4 = this.plan_id;
        double d = this.amount;
        ArrayList<String> arrayList = this.addons;
        Address address = this.address;
        StringBuilder sb = new StringBuilder("CreateOrderRequest(user_id=");
        sb.append(str);
        sb.append(", coupon=");
        sb.append(str2);
        sb.append(", rf_coupon=");
        sb.append(str3);
        sb.append(", plan_id=");
        sb.append(str4);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", addons=");
        sb.append(arrayList);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }
}
