package com.marrow2.data.kyc.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpResponseBody;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "success", "Ljava/lang/String;", "getSuccess"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthBridgeOtpResponseBody {
    public static final int $stable = 0;
    private final String success;

    public AuthBridgeOtpResponseBody(@JsonProperty("status") String str) {
        this.success = str;
    }

    public final String getSuccess() {
        return this.success;
    }

    public static /* synthetic */ AuthBridgeOtpResponseBody copy$default(AuthBridgeOtpResponseBody authBridgeOtpResponseBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authBridgeOtpResponseBody.success;
        }
        return authBridgeOtpResponseBody.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    public final AuthBridgeOtpResponseBody copy(@JsonProperty("status") String p0) {
        return new AuthBridgeOtpResponseBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AuthBridgeOtpResponseBody) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.success, (Object) ((AuthBridgeOtpResponseBody) p0).success);
    }

    public final int hashCode() {
        String str = this.success;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.success;
        StringBuilder sb = new StringBuilder("AuthBridgeOtpResponseBody(success=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
