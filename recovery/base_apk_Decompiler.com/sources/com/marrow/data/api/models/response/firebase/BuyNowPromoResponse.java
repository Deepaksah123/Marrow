package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/BuyNowPromoResponse;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/marrow/data/api/models/response/firebase/BuyNowPromoResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isLive", "Z", "labelText", "Ljava/lang/String;", "getLabelText"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BuyNowPromoResponse {
    private final boolean isLive;
    private final String labelText;

    public BuyNowPromoResponse(@JsonProperty("is_live") boolean z, @JsonProperty("text") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.isLive = z;
        this.labelText = str;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public /* synthetic */ BuyNowPromoResponse(boolean z, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final String getLabelText() {
        return this.labelText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyNowPromoResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BuyNowPromoResponse copy$default(BuyNowPromoResponse buyNowPromoResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buyNowPromoResponse.isLive;
        }
        if ((i & 2) != 0) {
            str = buyNowPromoResponse.labelText;
        }
        return buyNowPromoResponse.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    public final BuyNowPromoResponse copy(@JsonProperty("is_live") boolean p0, @JsonProperty("text") String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return new BuyNowPromoResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BuyNowPromoResponse)) {
            return false;
        }
        BuyNowPromoResponse buyNowPromoResponse = (BuyNowPromoResponse) p0;
        return this.isLive == buyNowPromoResponse.isLive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.labelText, (Object) buyNowPromoResponse.labelText);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.isLive) * 31) + this.labelText.hashCode();
    }

    public final String toString() {
        boolean z = this.isLive;
        String str = this.labelText;
        StringBuilder sb = new StringBuilder("BuyNowPromoResponse(isLive=");
        sb.append(z);
        sb.append(", labelText=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
