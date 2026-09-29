package com.marrow.data.api.models.response.notespurchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.PlanAddOnsKt;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0094\u0001\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u00101\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u00104\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010\u0014R\u001c\u00109\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001aR\u001c\u0010;\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001aR\u001c\u0010=\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001aR\u001c\u0010?\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u001aR\u001c\u0010A\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010!"}, d2 = {"Lcom/marrow/data/api/models/response/notespurchase/PlanDetails;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "p5", "p6", "p7", "p8", "p9", "Lcom/marrow/data/api/models/response/notespurchase/Taxes;", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/marrow/data/api/models/response/notespurchase/Taxes;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/Double;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/marrow/data/api/models/response/notespurchase/Taxes;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/marrow/data/api/models/response/notespurchase/Taxes;)Lcom/marrow/data/api/models/response/notespurchase/PlanDetails;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "planGroupId", "getPlanGroupId", "title", "getTitle", "subscriptionPeriod", "Ljava/lang/Integer;", "getSubscriptionPeriod", "basePrice", "Ljava/lang/Double;", "getBasePrice", "courseId", "getCourseId", "discount", "getDiscount", "offerPrice", "getOfferPrice", "price", "getPrice", "shippingCharge", "getShippingCharge", "taxes", "Lcom/marrow/data/api/models/response/notespurchase/Taxes;", "getTaxes"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDetails {
    private final Double basePrice;
    private final String courseId;
    private final Double discount;
    private final String id;
    private final Double offerPrice;
    private final String planGroupId;
    private final Double price;
    private final Double shippingCharge;
    private final Integer subscriptionPeriod;
    private final Taxes taxes;
    private final String title;

    public PlanDetails(@JsonProperty("_id") String str, @JsonProperty("group_id") String str2, @JsonProperty("title") String str3, @JsonProperty("subscription_period") Integer num, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) Double d, @JsonProperty(FilterParams.KEY_COURSE_ID) String str4, @JsonProperty("discount") Double d2, @JsonProperty(PlanAddOnsKt.KEY_OFFER_PRICE) Double d3, @JsonProperty("price") Double d4, @JsonProperty(PlanAddOnsKt.KEY_SHIPPING_CHARGE) Double d5, @JsonProperty("taxes") Taxes taxes) {
        this.id = str;
        this.planGroupId = str2;
        this.title = str3;
        this.subscriptionPeriod = num;
        this.basePrice = d;
        this.courseId = str4;
        this.discount = d2;
        this.offerPrice = d3;
        this.price = d4;
        this.shippingCharge = d5;
        this.taxes = taxes;
    }

    public /* synthetic */ PlanDetails(String str, String str2, String str3, Integer num, Double d, String str4, Double d2, Double d3, Double d4, Double d5, Taxes taxes, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : d3, (i & 256) != 0 ? null : d4, (i & 512) != 0 ? null : d5, (i & 1024) != 0 ? null : taxes);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlanGroupId() {
        return this.planGroupId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final Double getBasePrice() {
        return this.basePrice;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final Double getDiscount() {
        return this.discount;
    }

    public final Double getOfferPrice() {
        return this.offerPrice;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final Double getShippingCharge() {
        return this.shippingCharge;
    }

    public final Taxes getTaxes() {
        return this.taxes;
    }

    public PlanDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getShippingCharge() {
        return this.shippingCharge;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Taxes getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlanGroupId() {
        return this.planGroupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getOfferPrice() {
        return this.offerPrice;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    public final PlanDetails copy(@JsonProperty("_id") String p0, @JsonProperty("group_id") String p1, @JsonProperty("title") String p2, @JsonProperty("subscription_period") Integer p3, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) Double p4, @JsonProperty(FilterParams.KEY_COURSE_ID) String p5, @JsonProperty("discount") Double p6, @JsonProperty(PlanAddOnsKt.KEY_OFFER_PRICE) Double p7, @JsonProperty("price") Double p8, @JsonProperty(PlanAddOnsKt.KEY_SHIPPING_CHARGE) Double p9, @JsonProperty("taxes") Taxes p10) {
        return new PlanDetails(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanDetails)) {
            return false;
        }
        PlanDetails planDetails = (PlanDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planDetails.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planGroupId, (Object) planDetails.planGroupId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) planDetails.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subscriptionPeriod, planDetails.subscriptionPeriod) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.basePrice, planDetails.basePrice) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) planDetails.courseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.discount, planDetails.discount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.offerPrice, planDetails.offerPrice) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.price, planDetails.price) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.shippingCharge, planDetails.shippingCharge) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.taxes, planDetails.taxes);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.planGroupId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.subscriptionPeriod;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Double d = this.basePrice;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        String str4 = this.courseId;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Double d2 = this.discount;
        int iHashCode7 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.offerPrice;
        int iHashCode8 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.price;
        int iHashCode9 = d4 == null ? 0 : d4.hashCode();
        Double d5 = this.shippingCharge;
        int iHashCode10 = d5 == null ? 0 : d5.hashCode();
        Taxes taxes = this.taxes;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (taxes != null ? taxes.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.planGroupId;
        String str3 = this.title;
        Integer num = this.subscriptionPeriod;
        Double d = this.basePrice;
        String str4 = this.courseId;
        Double d2 = this.discount;
        Double d3 = this.offerPrice;
        Double d4 = this.price;
        Double d5 = this.shippingCharge;
        Taxes taxes = this.taxes;
        StringBuilder sb = new StringBuilder("PlanDetails(id=");
        sb.append(str);
        sb.append(", planGroupId=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", subscriptionPeriod=");
        sb.append(num);
        sb.append(", basePrice=");
        sb.append(d);
        sb.append(", courseId=");
        sb.append(str4);
        sb.append(", discount=");
        sb.append(d2);
        sb.append(", offerPrice=");
        sb.append(d3);
        sb.append(", price=");
        sb.append(d4);
        sb.append(", shippingCharge=");
        sb.append(d5);
        sb.append(", taxes=");
        sb.append(taxes);
        sb.append(")");
        return sb.toString();
    }
}
