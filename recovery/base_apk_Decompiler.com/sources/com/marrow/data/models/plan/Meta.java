package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.plan.TaxInfo;
import com.marrow.data.models.plan.TaxPercentInfo;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.isDvbProfileDeclared;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/plan/Meta;", "", "", "p0", "Lcom/marrow/data/models/plan/TaxInfo;", "p1", "", "p2", "Lcom/marrow/data/models/plan/TaxPercentInfo;", "p3", "<init>", "(DLcom/marrow/data/models/plan/TaxInfo;Ljava/lang/String;Lcom/marrow/data/models/plan/TaxPercentInfo;)V", "component1", "()D", "component2", "()Lcom/marrow/data/models/plan/TaxInfo;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/marrow/data/models/plan/TaxPercentInfo;", "copy", "(DLcom/marrow/data/models/plan/TaxInfo;Ljava/lang/String;Lcom/marrow/data/models/plan/TaxPercentInfo;)Lcom/marrow/data/models/plan/Meta;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "price", "D", "getPrice", "taxInfo", "Lcom/marrow/data/models/plan/TaxInfo;", "getTaxInfo", "title", "Ljava/lang/String;", "getTitle", "taxPercentInfo", "Lcom/marrow/data/models/plan/TaxPercentInfo;", "getTaxPercentInfo", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Meta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double price;
    private final TaxInfo taxInfo;
    private final TaxPercentInfo taxPercentInfo;
    private final String title;

    public Meta(@JsonProperty("price") double d, @JsonProperty(AddOnMetaKt.KEY_TAX_INFO) TaxInfo taxInfo, @JsonProperty("title") String str, @JsonProperty(AddOnMetaKt.KEY_TAX_PERCENT_INFO) TaxPercentInfo taxPercentInfo) {
        toMagicModuleMetaRepoModel.write(taxInfo, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfo, "");
        this.price = d;
        this.taxInfo = taxInfo;
        this.title = str;
        this.taxPercentInfo = taxPercentInfo;
    }

    public final double getPrice() {
        return this.price;
    }

    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TaxPercentInfo getTaxPercentInfo() {
        return this.taxPercentInfo;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/plan/Meta$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lcom/marrow/data/models/plan/Meta;", "fromJSON", "(Lorg/json/JSONObject;)Lcom/marrow/data/models/plan/Meta;", "toJSON", "(Lcom/marrow/data/models/plan/Meta;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final Meta fromJSON(JSONObject p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            double dOptDouble = p0.optDouble("price");
            TaxInfo.Companion companion = TaxInfo.INSTANCE;
            JSONObject jSONObjectOptJSONObject = p0.optJSONObject(AddOnMetaKt.KEY_TAX_INFO);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectOptJSONObject, "");
            TaxInfo taxInfoFromJSON = companion.fromJSON(jSONObjectOptJSONObject);
            String strOptString = p0.optString("title");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
            TaxPercentInfo.Companion companion2 = TaxPercentInfo.INSTANCE;
            JSONObject jSONObjectOptJSONObject2 = p0.optJSONObject(AddOnMetaKt.KEY_TAX_PERCENT_INFO);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectOptJSONObject2, "");
            return new Meta(dOptDouble, taxInfoFromJSON, strOptString, companion2.fromJSON(jSONObjectOptJSONObject2));
        }

        @getMagicModuleMeta
        public final JSONObject toJSON(Meta meta) {
            toMagicModuleMetaRepoModel.write(meta, "");
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.read(jSONObject, "price", Double.valueOf(meta.getPrice()));
            isDvbProfileDeclared.read(jSONObject, AddOnMetaKt.KEY_TAX_INFO, TaxInfo.INSTANCE.toJSON(meta.getTaxInfo()));
            isDvbProfileDeclared.write(jSONObject, "title", meta.getTitle());
            isDvbProfileDeclared.read(jSONObject, AddOnMetaKt.KEY_TAX_PERCENT_INFO, TaxPercentInfo.INSTANCE.toJSON(meta.getTaxPercentInfo()));
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ Meta copy$default(Meta meta, double d, TaxInfo taxInfo, String str, TaxPercentInfo taxPercentInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            d = meta.price;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            taxInfo = meta.taxInfo;
        }
        TaxInfo taxInfo2 = taxInfo;
        if ((i & 4) != 0) {
            str = meta.title;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            taxPercentInfo = meta.taxPercentInfo;
        }
        return meta.copy(d2, taxInfo2, str2, taxPercentInfo);
    }

    @getMagicModuleMeta
    public static final Meta fromJSON(JSONObject jSONObject) {
        return INSTANCE.fromJSON(jSONObject);
    }

    @getMagicModuleMeta
    public static final JSONObject toJSON(Meta meta) {
        return INSTANCE.toJSON(meta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TaxPercentInfo getTaxPercentInfo() {
        return this.taxPercentInfo;
    }

    public final Meta copy(@JsonProperty("price") double p0, @JsonProperty(AddOnMetaKt.KEY_TAX_INFO) TaxInfo p1, @JsonProperty("title") String p2, @JsonProperty(AddOnMetaKt.KEY_TAX_PERCENT_INFO) TaxPercentInfo p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new Meta(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) p0;
        return Double.compare(this.price, meta.price) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.taxInfo, meta.taxInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) meta.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.taxPercentInfo, meta.taxPercentInfo);
    }

    public final int hashCode() {
        return (((((Double.hashCode(this.price) * 31) + this.taxInfo.hashCode()) * 31) + this.title.hashCode()) * 31) + this.taxPercentInfo.hashCode();
    }

    public final String toString() {
        double d = this.price;
        TaxInfo taxInfo = this.taxInfo;
        String str = this.title;
        TaxPercentInfo taxPercentInfo = this.taxPercentInfo;
        StringBuilder sb = new StringBuilder("Meta(price=");
        sb.append(d);
        sb.append(", taxInfo=");
        sb.append(taxInfo);
        sb.append(", title=");
        sb.append(str);
        sb.append(", taxPercentInfo=");
        sb.append(taxPercentInfo);
        sb.append(")");
        return sb.toString();
    }
}
