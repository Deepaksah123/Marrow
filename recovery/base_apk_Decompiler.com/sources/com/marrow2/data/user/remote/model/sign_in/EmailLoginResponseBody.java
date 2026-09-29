package com.marrow2.data.user.remote.model.sign_in;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginResponseBody;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "message", "Ljava/lang/String;", "getMessage", "loginType", "getLoginType"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailLoginResponseBody {
    public static final int $stable = 0;
    private final String loginType;
    private final String message;

    public EmailLoginResponseBody(@JsonProperty("msg") String str, @JsonProperty("login_type") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.message = str;
        this.loginType = str2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public static /* synthetic */ EmailLoginResponseBody copy$default(EmailLoginResponseBody emailLoginResponseBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailLoginResponseBody.message;
        }
        if ((i & 2) != 0) {
            str2 = emailLoginResponseBody.loginType;
        }
        return emailLoginResponseBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoginType() {
        return this.loginType;
    }

    public final EmailLoginResponseBody copy(@JsonProperty("msg") String p0, @JsonProperty("login_type") String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new EmailLoginResponseBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmailLoginResponseBody)) {
            return false;
        }
        EmailLoginResponseBody emailLoginResponseBody = (EmailLoginResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) emailLoginResponseBody.message) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.loginType, (Object) emailLoginResponseBody.loginType);
    }

    public final int hashCode() {
        return (this.message.hashCode() * 31) + this.loginType.hashCode();
    }

    public final String toString() {
        String str = this.message;
        String str2 = this.loginType;
        StringBuilder sb = new StringBuilder("EmailLoginResponseBody(message=");
        sb.append(str);
        sb.append(", loginType=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
