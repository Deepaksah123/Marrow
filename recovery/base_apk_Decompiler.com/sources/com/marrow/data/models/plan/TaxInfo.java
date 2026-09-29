package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.isDvbProfileDeclared;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/models/plan/TaxInfo;", "", "", "p0", "p1", "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/marrow/data/models/plan/TaxInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "cgst", "D", "getCgst", "sgst", "getSgst", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double cgst;
    private final double sgst;

    public TaxInfo(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) double d, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) double d2) {
        this.cgst = d;
        this.sgst = d2;
    }

    public final double getCgst() {
        return this.cgst;
    }

    public final double getSgst() {
        return this.sgst;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/plan/TaxInfo$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lcom/marrow/data/models/plan/TaxInfo;", "fromJSON", "(Lorg/json/JSONObject;)Lcom/marrow/data/models/plan/TaxInfo;", "toJSON", "(Lcom/marrow/data/models/plan/TaxInfo;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final TaxInfo fromJSON(JSONObject p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new TaxInfo(p0.optDouble(AddOnTaxInfoKt.KEY_CGST), p0.optDouble(AddOnTaxInfoKt.KEY_SGST));
        }

        @getMagicModuleMeta
        public final JSONObject toJSON(TaxInfo taxInfo) {
            toMagicModuleMetaRepoModel.write(taxInfo, "");
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.read(jSONObject, AddOnTaxInfoKt.KEY_CGST, Double.valueOf(taxInfo.getCgst()));
            isDvbProfileDeclared.read(jSONObject, AddOnTaxInfoKt.KEY_SGST, Double.valueOf(taxInfo.getSgst()));
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = taxInfo.cgst;
        }
        if ((i & 2) != 0) {
            d2 = taxInfo.sgst;
        }
        return taxInfo.copy(d, d2);
    }

    @getMagicModuleMeta
    public static final TaxInfo fromJSON(JSONObject jSONObject) {
        return INSTANCE.fromJSON(jSONObject);
    }

    @getMagicModuleMeta
    public static final JSONObject toJSON(TaxInfo taxInfo) {
        return INSTANCE.toJSON(taxInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getCgst() {
        return this.cgst;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getSgst() {
        return this.sgst;
    }

    public final TaxInfo copy(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) double p0, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) double p1) {
        return new TaxInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TaxInfo)) {
            return false;
        }
        TaxInfo taxInfo = (TaxInfo) p0;
        return Double.compare(this.cgst, taxInfo.cgst) == 0 && Double.compare(this.sgst, taxInfo.sgst) == 0;
    }

    public final int hashCode() {
        return (Double.hashCode(this.cgst) * 31) + Double.hashCode(this.sgst);
    }

    public final String toString() {
        double d = this.cgst;
        double d2 = this.sgst;
        StringBuilder sb = new StringBuilder("TaxInfo(cgst=");
        sb.append(d);
        sb.append(", sgst=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}
