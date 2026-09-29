package com.marrow.data.models.user.phonenumberchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/marrow/data/models/user/phonenumberchange/VerifyNewNumberResponse;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/marrow/data/models/user/phonenumberchange/VerifyNewNumberResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "msg", "getMsg", "isContactVerified", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyNewNumberResponse {
    private final String id;
    private final boolean isContactVerified;
    private final String msg;

    public VerifyNewNumberResponse(@JsonProperty("_id") String str, @JsonProperty("msg") String str2, @JsonProperty("verify_contact") boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.msg = str2;
        this.isContactVerified = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final boolean isContactVerified() {
        return this.isContactVerified;
    }

    public static /* synthetic */ VerifyNewNumberResponse copy$default(VerifyNewNumberResponse verifyNewNumberResponse, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyNewNumberResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = verifyNewNumberResponse.msg;
        }
        if ((i & 4) != 0) {
            z = verifyNewNumberResponse.isContactVerified;
        }
        return verifyNewNumberResponse.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsContactVerified() {
        return this.isContactVerified;
    }

    public final VerifyNewNumberResponse copy(@JsonProperty("_id") String p0, @JsonProperty("msg") String p1, @JsonProperty("verify_contact") boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new VerifyNewNumberResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VerifyNewNumberResponse)) {
            return false;
        }
        VerifyNewNumberResponse verifyNewNumberResponse = (VerifyNewNumberResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) verifyNewNumberResponse.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.msg, (Object) verifyNewNumberResponse.msg) && this.isContactVerified == verifyNewNumberResponse.isContactVerified;
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.msg.hashCode()) * 31) + Boolean.hashCode(this.isContactVerified);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.msg;
        boolean z = this.isContactVerified;
        StringBuilder sb = new StringBuilder("VerifyNewNumberResponse(id=");
        sb.append(str);
        sb.append(", msg=");
        sb.append(str2);
        sb.append(", isContactVerified=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
