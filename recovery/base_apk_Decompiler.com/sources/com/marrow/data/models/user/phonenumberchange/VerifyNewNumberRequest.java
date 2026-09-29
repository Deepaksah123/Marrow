package com.marrow.data.models.user.phonenumberchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.prelogin.OtpVerifyRequestBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/marrow/data/models/user/phonenumberchange/VerifyNewNumberRequest;", "Lcom/marrow/data/api/models/request/prelogin/OtpVerifyRequestBody;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/data/models/user/phonenumberchange/VerifyNewNumberRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "validationToken", "Ljava/lang/String;", "getValidationToken"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyNewNumberRequest extends OtpVerifyRequestBody {

    @JsonProperty("v_token")
    private final String validationToken;

    public VerifyNewNumberRequest(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.validationToken = str;
    }

    public final String getValidationToken() {
        return this.validationToken;
    }

    public static /* synthetic */ VerifyNewNumberRequest copy$default(VerifyNewNumberRequest verifyNewNumberRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyNewNumberRequest.validationToken;
        }
        return verifyNewNumberRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    public final VerifyNewNumberRequest copy(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new VerifyNewNumberRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof VerifyNewNumberRequest) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.validationToken, (Object) ((VerifyNewNumberRequest) p0).validationToken);
    }

    public final int hashCode() {
        return this.validationToken.hashCode();
    }

    public final String toString() {
        String str = this.validationToken;
        StringBuilder sb = new StringBuilder("VerifyNewNumberRequest(validationToken=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
