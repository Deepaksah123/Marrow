package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.plan.Meta;
import com.marrow.data.models.plan.TaxInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.isDvbProfileDeclared;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001EBs\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J|\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0018R\u001a\u00106\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0018R\u001c\u00108\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u0010\u0016R\u001c\u0010:\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010 R\u001a\u0010B\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\""}, d2 = {"Lcom/marrow/data/models/plan/PlanAddOns;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "", "p6", "p7", "Lcom/marrow/data/models/plan/TaxInfo;", "p8", "Lcom/marrow/data/models/plan/Meta;", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/Double;DDDLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/marrow/data/models/plan/TaxInfo;Lcom/marrow/data/models/plan/Meta;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "()D", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Lcom/marrow/data/models/plan/TaxInfo;", "component10", "()Lcom/marrow/data/models/plan/Meta;", "copy", "(Ljava/lang/String;Ljava/lang/Double;DDDLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/marrow/data/models/plan/TaxInfo;Lcom/marrow/data/models/plan/Meta;)Lcom/marrow/data/models/plan/PlanAddOns;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "basePrice", "Ljava/lang/Double;", "getBasePrice", "offerPrice", "D", "getOfferPrice", "price", "getPrice", "shippingCharge", "getShippingCharge", "noteEdition", "getNoteEdition", "totalSubject", "Ljava/lang/Integer;", "getTotalSubject", "description", "getDescription", "taxInfo", "Lcom/marrow/data/models/plan/TaxInfo;", "getTaxInfo", "meta", "Lcom/marrow/data/models/plan/Meta;", "getMeta", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanAddOns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double basePrice;
    private final String description;
    private final String id;
    private final Meta meta;
    private final Double noteEdition;
    private final double offerPrice;
    private final double price;
    private final double shippingCharge;
    private final TaxInfo taxInfo;
    private final Integer totalSubject;

    public PlanAddOns(@JsonProperty("_id") String str, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) Double d, @JsonProperty(PlanAddOnsKt.KEY_OFFER_PRICE) double d2, @JsonProperty("price") double d3, @JsonProperty(PlanAddOnsKt.KEY_SHIPPING_CHARGE) double d4, @JsonProperty(PlanAddOnsKt.KEY_NOTES_EDITION) Double d5, @JsonProperty(PlanAddOnsKt.KEY_TOTAL_SUBJECT) Integer num, @JsonProperty("description") String str2, @JsonProperty(AddOnMetaKt.KEY_TAX_INFO) TaxInfo taxInfo, @JsonProperty("meta") Meta meta) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(taxInfo, "");
        toMagicModuleMetaRepoModel.write(meta, "");
        this.id = str;
        this.basePrice = d;
        this.offerPrice = d2;
        this.price = d3;
        this.shippingCharge = d4;
        this.noteEdition = d5;
        this.totalSubject = num;
        this.description = str2;
        this.taxInfo = taxInfo;
        this.meta = meta;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getBasePrice() {
        return this.basePrice;
    }

    public final double getOfferPrice() {
        return this.offerPrice;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getShippingCharge() {
        return this.shippingCharge;
    }

    public final Double getNoteEdition() {
        return this.noteEdition;
    }

    public final Integer getTotalSubject() {
        return this.totalSubject;
    }

    public final String getDescription() {
        return this.description;
    }

    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\t2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u0007J\f\u0010\n\u001a\u00020\f*\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/marrow/data/models/plan/PlanAddOns$Companion;", "", "<init>", "()V", "fromJSON", "Ljava/util/ArrayList;", "Lcom/marrow/data/models/plan/PlanAddOns;", "Lkotlin/collections/ArrayList;", "array", "Lorg/json/JSONArray;", "toJSON", "planAddOnsList", "Lorg/json/JSONObject;", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final ArrayList<PlanAddOns> fromJSON(JSONArray array) {
            JSONArray jSONArray = array;
            toMagicModuleMetaRepoModel.write(jSONArray, "");
            int length = array.length();
            ArrayList<PlanAddOns> arrayList = new ArrayList<>(length);
            int i = 0;
            while (i < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("_id");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
                double dOptDouble = jSONObjectOptJSONObject.optDouble(PlanAddOnsKt.KEY_BASE_PRICE);
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble(PlanAddOnsKt.KEY_OFFER_PRICE);
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("price");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble(PlanAddOnsKt.KEY_SHIPPING_CHARGE);
                Double dValueOf = Double.valueOf(jSONObjectOptJSONObject.optDouble(PlanAddOnsKt.KEY_NOTES_EDITION));
                if (Double.isNaN(dValueOf.doubleValue())) {
                    dValueOf = null;
                }
                Double d = dValueOf;
                String strOptString2 = jSONObjectOptJSONObject.optString("description");
                int iOptInt = jSONObjectOptJSONObject.optInt(PlanAddOnsKt.KEY_TOTAL_SUBJECT);
                TaxInfo.Companion companion = TaxInfo.INSTANCE;
                int i2 = length;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(AddOnMetaKt.KEY_TAX_INFO);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectOptJSONObject2, "");
                TaxInfo taxInfoFromJSON = companion.fromJSON(jSONObjectOptJSONObject2);
                Meta.Companion companion2 = Meta.INSTANCE;
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("meta");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectOptJSONObject3, "");
                arrayList.add(new PlanAddOns(strOptString, Double.valueOf(dOptDouble), dOptDouble2, dOptDouble3, dOptDouble4, d, Integer.valueOf(iOptInt), strOptString2, taxInfoFromJSON, companion2.fromJSON(jSONObjectOptJSONObject3)));
                i++;
                length = i2;
                jSONArray = array;
            }
            return arrayList;
        }

        @getMagicModuleMeta
        public final JSONArray toJSON(ArrayList<PlanAddOns> planAddOnsList) {
            JSONArray jSONArray = new JSONArray();
            if (planAddOnsList != null) {
                Iterator<T> it = planAddOnsList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(PlanAddOns.INSTANCE.toJSON((PlanAddOns) it.next()));
                }
            }
            return jSONArray;
        }

        @getMagicModuleMeta
        public final JSONObject toJSON(PlanAddOns planAddOns) {
            toMagicModuleMetaRepoModel.write(planAddOns, "");
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, "_id", planAddOns.getId());
            isDvbProfileDeclared.read(jSONObject, PlanAddOnsKt.KEY_BASE_PRICE, planAddOns.getBasePrice());
            isDvbProfileDeclared.read(jSONObject, PlanAddOnsKt.KEY_OFFER_PRICE, Double.valueOf(planAddOns.getOfferPrice()));
            isDvbProfileDeclared.read(jSONObject, "price", Double.valueOf(planAddOns.getPrice()));
            isDvbProfileDeclared.read(jSONObject, PlanAddOnsKt.KEY_SHIPPING_CHARGE, Double.valueOf(planAddOns.getShippingCharge()));
            isDvbProfileDeclared.read(jSONObject, PlanAddOnsKt.KEY_NOTES_EDITION, planAddOns.getNoteEdition());
            isDvbProfileDeclared.read(jSONObject, PlanAddOnsKt.KEY_TOTAL_SUBJECT, planAddOns.getTotalSubject());
            isDvbProfileDeclared.write(jSONObject, "description", planAddOns.getDescription());
            isDvbProfileDeclared.read(jSONObject, AddOnMetaKt.KEY_TAX_INFO, TaxInfo.INSTANCE.toJSON(planAddOns.getTaxInfo()));
            isDvbProfileDeclared.read(jSONObject, "meta", Meta.INSTANCE.toJSON(planAddOns.getMeta()));
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final ArrayList<PlanAddOns> fromJSON(JSONArray jSONArray) {
        return INSTANCE.fromJSON(jSONArray);
    }

    @getMagicModuleMeta
    public static final JSONArray toJSON(ArrayList<PlanAddOns> arrayList) {
        return INSTANCE.toJSON(arrayList);
    }

    @getMagicModuleMeta
    public static final JSONObject toJSON(PlanAddOns planAddOns) {
        return INSTANCE.toJSON(planAddOns);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getOfferPrice() {
        return this.offerPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getShippingCharge() {
        return this.shippingCharge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getNoteEdition() {
        return this.noteEdition;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTotalSubject() {
        return this.totalSubject;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    public final PlanAddOns copy(@JsonProperty("_id") String p0, @JsonProperty(PlanAddOnsKt.KEY_BASE_PRICE) Double p1, @JsonProperty(PlanAddOnsKt.KEY_OFFER_PRICE) double p2, @JsonProperty("price") double p3, @JsonProperty(PlanAddOnsKt.KEY_SHIPPING_CHARGE) double p4, @JsonProperty(PlanAddOnsKt.KEY_NOTES_EDITION) Double p5, @JsonProperty(PlanAddOnsKt.KEY_TOTAL_SUBJECT) Integer p6, @JsonProperty("description") String p7, @JsonProperty(AddOnMetaKt.KEY_TAX_INFO) TaxInfo p8, @JsonProperty("meta") Meta p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        return new PlanAddOns(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanAddOns)) {
            return false;
        }
        PlanAddOns planAddOns = (PlanAddOns) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planAddOns.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.basePrice, planAddOns.basePrice) && Double.compare(this.offerPrice, planAddOns.offerPrice) == 0 && Double.compare(this.price, planAddOns.price) == 0 && Double.compare(this.shippingCharge, planAddOns.shippingCharge) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.noteEdition, planAddOns.noteEdition) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.totalSubject, planAddOns.totalSubject) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) planAddOns.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.taxInfo, planAddOns.taxInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.meta, planAddOns.meta);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        Double d = this.basePrice;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        int iHashCode3 = Double.hashCode(this.offerPrice);
        int iHashCode4 = Double.hashCode(this.price);
        int iHashCode5 = Double.hashCode(this.shippingCharge);
        Double d2 = this.noteEdition;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        Integer num = this.totalSubject;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str = this.description;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.taxInfo.hashCode()) * 31) + this.meta.hashCode();
    }

    public final String toString() {
        String str = this.id;
        Double d = this.basePrice;
        double d2 = this.offerPrice;
        double d3 = this.price;
        double d4 = this.shippingCharge;
        Double d5 = this.noteEdition;
        Integer num = this.totalSubject;
        String str2 = this.description;
        TaxInfo taxInfo = this.taxInfo;
        Meta meta = this.meta;
        StringBuilder sb = new StringBuilder("PlanAddOns(id=");
        sb.append(str);
        sb.append(", basePrice=");
        sb.append(d);
        sb.append(", offerPrice=");
        sb.append(d2);
        sb.append(", price=");
        sb.append(d3);
        sb.append(", shippingCharge=");
        sb.append(d4);
        sb.append(", noteEdition=");
        sb.append(d5);
        sb.append(", totalSubject=");
        sb.append(num);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", taxInfo=");
        sb.append(taxInfo);
        sb.append(", meta=");
        sb.append(meta);
        sb.append(")");
        return sb.toString();
    }
}
