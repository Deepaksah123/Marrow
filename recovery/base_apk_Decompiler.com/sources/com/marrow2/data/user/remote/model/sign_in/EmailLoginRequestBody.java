package com.marrow2.data.user.remote.model.sign_in;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018"}, d2 = {"Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginRequestBody;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "rcToken", "deviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailLoginRequestBody {
    public static final int $stable = 8;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("config_hash")
    private final String rcToken;

    public EmailLoginRequestBody(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.email = str;
        this.password = str2;
        this.rcToken = str3;
        this.deviceInfo = str4;
    }

    public /* synthetic */ EmailLoginRequestBody(String str, String str2, String str3, String str4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.email = str;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public EmailLoginRequestBody() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ EmailLoginRequestBody copy$default(EmailLoginRequestBody emailLoginRequestBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailLoginRequestBody.email;
        }
        if ((i & 2) != 0) {
            str2 = emailLoginRequestBody.password;
        }
        if ((i & 4) != 0) {
            str3 = emailLoginRequestBody.rcToken;
        }
        if ((i & 8) != 0) {
            str4 = emailLoginRequestBody.deviceInfo;
        }
        return emailLoginRequestBody.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final EmailLoginRequestBody copy(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new EmailLoginRequestBody(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmailLoginRequestBody)) {
            return false;
        }
        EmailLoginRequestBody emailLoginRequestBody = (EmailLoginRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) emailLoginRequestBody.email) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.password, (Object) emailLoginRequestBody.password) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) emailLoginRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) emailLoginRequestBody.deviceInfo);
    }

    public final int hashCode() {
        int iHashCode = this.email.hashCode();
        String str = this.password;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.rcToken.hashCode()) * 31) + this.deviceInfo.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.rcToken;
        String str4 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("EmailLoginRequestBody(email=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", rcToken=");
        sb.append(str3);
        sb.append(", deviceInfo=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
