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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/models/plan/TaxPercentInfo;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/plan/TaxPercentInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "cgstPercentInfo", "Ljava/lang/String;", "getCgstPercentInfo", "sgstPercentInfo", "getSgstPercentInfo", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxPercentInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cgstPercentInfo;
    private final String sgstPercentInfo;

    public TaxPercentInfo(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) String str, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.cgstPercentInfo = str;
        this.sgstPercentInfo = str2;
    }

    public final String getCgstPercentInfo() {
        return this.cgstPercentInfo;
    }

    public final String getSgstPercentInfo() {
        return this.sgstPercentInfo;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/plan/TaxPercentInfo$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lcom/marrow/data/models/plan/TaxPercentInfo;", "fromJSON", "(Lorg/json/JSONObject;)Lcom/marrow/data/models/plan/TaxPercentInfo;", "toJSON", "(Lcom/marrow/data/models/plan/TaxPercentInfo;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final TaxPercentInfo fromJSON(JSONObject p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strOptString = p0.optString(AddOnTaxInfoKt.KEY_CGST);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
            String strOptString2 = p0.optString(AddOnTaxInfoKt.KEY_SGST);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
            return new TaxPercentInfo(strOptString, strOptString2);
        }

        @getMagicModuleMeta
        public final JSONObject toJSON(TaxPercentInfo taxPercentInfo) {
            toMagicModuleMetaRepoModel.write(taxPercentInfo, "");
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, AddOnTaxInfoKt.KEY_CGST, taxPercentInfo.getCgstPercentInfo());
            isDvbProfileDeclared.write(jSONObject, AddOnTaxInfoKt.KEY_SGST, taxPercentInfo.getSgstPercentInfo());
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ TaxPercentInfo copy$default(TaxPercentInfo taxPercentInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxPercentInfo.cgstPercentInfo;
        }
        if ((i & 2) != 0) {
            str2 = taxPercentInfo.sgstPercentInfo;
        }
        return taxPercentInfo.copy(str, str2);
    }

    @getMagicModuleMeta
    public static final TaxPercentInfo fromJSON(JSONObject jSONObject) {
        return INSTANCE.fromJSON(jSONObject);
    }

    @getMagicModuleMeta
    public static final JSONObject toJSON(TaxPercentInfo taxPercentInfo) {
        return INSTANCE.toJSON(taxPercentInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCgstPercentInfo() {
        return this.cgstPercentInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSgstPercentInfo() {
        return this.sgstPercentInfo;
    }

    public final TaxPercentInfo copy(@JsonProperty(AddOnTaxInfoKt.KEY_CGST) String p0, @JsonProperty(AddOnTaxInfoKt.KEY_SGST) String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new TaxPercentInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TaxPercentInfo)) {
            return false;
        }
        TaxPercentInfo taxPercentInfo = (TaxPercentInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.cgstPercentInfo, (Object) taxPercentInfo.cgstPercentInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.sgstPercentInfo, (Object) taxPercentInfo.sgstPercentInfo);
    }

    public final int hashCode() {
        return (this.cgstPercentInfo.hashCode() * 31) + this.sgstPercentInfo.hashCode();
    }

    public final String toString() {
        String str = this.cgstPercentInfo;
        String str2 = this.sgstPercentInfo;
        StringBuilder sb = new StringBuilder("TaxPercentInfo(cgstPercentInfo=");
        sb.append(str);
        sb.append(", sgstPercentInfo=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
