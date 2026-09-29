package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\"\u0010\u0019\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001a"}, d2 = {"Lcom/marrow2/data/user/remote/model/LoginRequestBody;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/LoginRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "otp", "getOtp", "setOtp", "rcToken", "deviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoginRequestBody {
    public static final int $stable = 8;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("email")
    private String email;

    @JsonProperty("otp")
    private String otp;

    @JsonProperty("password")
    private String password;

    @JsonProperty("config_hash")
    private final String rcToken;

    public LoginRequestBody(String str, String str2, String str3, String str4, String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.email = str;
        this.password = str2;
        this.otp = str3;
        this.rcToken = str4;
        this.deviceInfo = str5;
    }

    public /* synthetic */ LoginRequestBody(String str, String str2, String str3, String str4, String str5, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5);
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

    public final String getOtp() {
        return this.otp;
    }

    public final void setOtp(String str) {
        this.otp = str;
    }

    public LoginRequestBody() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ LoginRequestBody copy$default(LoginRequestBody loginRequestBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginRequestBody.email;
        }
        if ((i & 2) != 0) {
            str2 = loginRequestBody.password;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = loginRequestBody.otp;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = loginRequestBody.rcToken;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = loginRequestBody.deviceInfo;
        }
        return loginRequestBody.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    public final LoginRequestBody copy(String p0, String p1, String p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new LoginRequestBody(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LoginRequestBody)) {
            return false;
        }
        LoginRequestBody loginRequestBody = (LoginRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) loginRequestBody.email) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.password, (Object) loginRequestBody.password) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otp, (Object) loginRequestBody.otp) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) loginRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) loginRequestBody.deviceInfo);
    }

    public final int hashCode() {
        int iHashCode = this.email.hashCode();
        String str = this.password;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.otp;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.rcToken.hashCode();
        String str3 = this.deviceInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.otp;
        String str4 = this.rcToken;
        String str5 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("LoginRequestBody(email=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", otp=");
        sb.append(str3);
        sb.append(", rcToken=");
        sb.append(str4);
        sb.append(", deviceInfo=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
