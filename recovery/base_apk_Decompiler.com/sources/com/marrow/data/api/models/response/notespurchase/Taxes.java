package com.marrow.data.api.models.response.notespurchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.plan.AddOnTaxInfoKt;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/api/models/response/notespurchase/Taxes;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "component1", "()Ljava/lang/Double;", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/marrow/data/api/models/response/notespurchase/Taxes;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "cgst", "Ljava/lang/Double;", "getCgst", "sgst", "getSgst"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Taxes {
    private final Double cgst;
    private final Double sgst;

    public Taxes(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) Double d, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) Double d2) {
        this.cgst = d;
        this.sgst = d2;
    }

    public /* synthetic */ Taxes(Double d, Double d2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public final Double getCgst() {
        return this.cgst;
    }

    public final Double getSgst() {
        return this.sgst;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Taxes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Taxes copy$default(Taxes taxes, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = taxes.cgst;
        }
        if ((i & 2) != 0) {
            d2 = taxes.sgst;
        }
        return taxes.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCgst() {
        return this.cgst;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSgst() {
        return this.sgst;
    }

    public final Taxes copy(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) Double p0, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) Double p1) {
        return new Taxes(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Taxes)) {
            return false;
        }
        Taxes taxes = (Taxes) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cgst, taxes.cgst) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sgst, taxes.sgst);
    }

    public final int hashCode() {
        Double d = this.cgst;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.sgst;
        return (iHashCode * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        Double d = this.cgst;
        Double d2 = this.sgst;
        StringBuilder sb = new StringBuilder("Taxes(cgst=");
        sb.append(d);
        sb.append(", sgst=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}
