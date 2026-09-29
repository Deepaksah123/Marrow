package com.marrow.data.models.user.phonenumberchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.prelogin.ResendOtpRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/marrow/data/models/user/phonenumberchange/VerifyCurrentNumberRequest;", "Lcom/marrow/data/api/models/request/prelogin/ResendOtpRequestBody;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/user/phonenumberchange/VerifyCurrentNumberRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "otp", "Ljava/lang/String;", "getOtp", "rcToken", "getRcToken"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyCurrentNumberRequest extends ResendOtpRequestBody {

    @JsonProperty("otp")
    private final String otp;

    @JsonProperty("config_hash")
    private final String rcToken;

    public VerifyCurrentNumberRequest(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.otp = str;
        this.rcToken = str2;
    }

    public /* synthetic */ VerifyCurrentNumberRequest(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getRcToken() {
        return this.rcToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyCurrentNumberRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VerifyCurrentNumberRequest copy$default(VerifyCurrentNumberRequest verifyCurrentNumberRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyCurrentNumberRequest.otp;
        }
        if ((i & 2) != 0) {
            str2 = verifyCurrentNumberRequest.rcToken;
        }
        return verifyCurrentNumberRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRcToken() {
        return this.rcToken;
    }

    public final VerifyCurrentNumberRequest copy(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new VerifyCurrentNumberRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VerifyCurrentNumberRequest)) {
            return false;
        }
        VerifyCurrentNumberRequest verifyCurrentNumberRequest = (VerifyCurrentNumberRequest) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otp, (Object) verifyCurrentNumberRequest.otp) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) verifyCurrentNumberRequest.rcToken);
    }

    public final int hashCode() {
        return (this.otp.hashCode() * 31) + this.rcToken.hashCode();
    }

    public final String toString() {
        String str = this.otp;
        String str2 = this.rcToken;
        StringBuilder sb = new StringBuilder("VerifyCurrentNumberRequest(otp=");
        sb.append(str);
        sb.append(", rcToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
