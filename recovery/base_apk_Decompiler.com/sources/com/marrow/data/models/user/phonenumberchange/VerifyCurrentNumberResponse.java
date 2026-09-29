package com.marrow.data.models.user.phonenumberchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/models/user/phonenumberchange/VerifyCurrentNumberResponse;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/user/phonenumberchange/VerifyCurrentNumberResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "msg", "Ljava/lang/String;", "getMsg", "validationToken", "getValidationToken"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyCurrentNumberResponse {
    private final String msg;
    private final String validationToken;

    public VerifyCurrentNumberResponse(@JsonProperty("msg") String str, @JsonProperty("v_token") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.msg = str;
        this.validationToken = str2;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getValidationToken() {
        return this.validationToken;
    }

    public static /* synthetic */ VerifyCurrentNumberResponse copy$default(VerifyCurrentNumberResponse verifyCurrentNumberResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyCurrentNumberResponse.msg;
        }
        if ((i & 2) != 0) {
            str2 = verifyCurrentNumberResponse.validationToken;
        }
        return verifyCurrentNumberResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    public final VerifyCurrentNumberResponse copy(@JsonProperty("msg") String p0, @JsonProperty("v_token") String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new VerifyCurrentNumberResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VerifyCurrentNumberResponse)) {
            return false;
        }
        VerifyCurrentNumberResponse verifyCurrentNumberResponse = (VerifyCurrentNumberResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.msg, (Object) verifyCurrentNumberResponse.msg) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.validationToken, (Object) verifyCurrentNumberResponse.validationToken);
    }

    public final int hashCode() {
        return (this.msg.hashCode() * 31) + this.validationToken.hashCode();
    }

    public final String toString() {
        String str = this.msg;
        String str2 = this.validationToken;
        StringBuilder sb = new StringBuilder("VerifyCurrentNumberResponse(msg=");
        sb.append(str);
        sb.append(", validationToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
