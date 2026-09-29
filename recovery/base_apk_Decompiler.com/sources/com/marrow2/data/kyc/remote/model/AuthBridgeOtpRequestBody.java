package com.marrow2.data.kyc.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpRequestBody;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "userId", "Ljava/lang/String;", "getUserId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthBridgeOtpRequestBody {
    public static final int $stable = 0;
    private final String userId;

    public AuthBridgeOtpRequestBody(@JsonProperty("user_id") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.userId = str;
    }

    public final String getUserId() {
        return this.userId;
    }

    public static /* synthetic */ AuthBridgeOtpRequestBody copy$default(AuthBridgeOtpRequestBody authBridgeOtpRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authBridgeOtpRequestBody.userId;
        }
        return authBridgeOtpRequestBody.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final AuthBridgeOtpRequestBody copy(@JsonProperty("user_id") String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new AuthBridgeOtpRequestBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AuthBridgeOtpRequestBody) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) ((AuthBridgeOtpRequestBody) p0).userId);
    }

    public final int hashCode() {
        return this.userId.hashCode();
    }

    public final String toString() {
        String str = this.userId;
        StringBuilder sb = new StringBuilder("AuthBridgeOtpRequestBody(userId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
