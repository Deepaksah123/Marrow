package com.marrow.data.api.models.request.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/data/api/models/request/plan/FreeAccessCouponRequest;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/data/api/models/request/plan/FreeAccessCouponRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "coupon", "Ljava/lang/String;", "getCoupon"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeAccessCouponRequest {

    @JsonProperty("coupon_code")
    private final String coupon;

    public FreeAccessCouponRequest(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.coupon = str;
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public static /* synthetic */ FreeAccessCouponRequest copy$default(FreeAccessCouponRequest freeAccessCouponRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = freeAccessCouponRequest.coupon;
        }
        return freeAccessCouponRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoupon() {
        return this.coupon;
    }

    public final FreeAccessCouponRequest copy(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new FreeAccessCouponRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof FreeAccessCouponRequest) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.coupon, (Object) ((FreeAccessCouponRequest) p0).coupon);
    }

    public final int hashCode() {
        return this.coupon.hashCode();
    }

    public final String toString() {
        String str = this.coupon;
        StringBuilder sb = new StringBuilder("FreeAccessCouponRequest(coupon=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
