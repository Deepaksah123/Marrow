package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c"}, d2 = {"Lcom/marrow2/data/user/remote/model/SignUpRequestBody;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/SignUpRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "password", "getPassword", "fname", "getFname", "rcToken", "googleToken", "deviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignUpRequestBody {
    public static final int $stable = 0;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("fname")
    private final String fname;

    @JsonProperty("google_token")
    private final String googleToken;

    @JsonProperty("password")
    private final String password;

    @JsonProperty("config_hash")
    private final String rcToken;

    public SignUpRequestBody(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.email = str;
        this.password = str2;
        this.fname = str3;
        this.rcToken = str4;
        this.googleToken = str5;
        this.deviceInfo = str6;
    }

    public /* synthetic */ SignUpRequestBody(String str, String str2, String str3, String str4, String str5, String str6, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getFname() {
        return this.fname;
    }

    public SignUpRequestBody() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getGoogleToken() {
        return this.googleToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ SignUpRequestBody copy$default(SignUpRequestBody signUpRequestBody, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpRequestBody.email;
        }
        if ((i & 2) != 0) {
            str2 = signUpRequestBody.password;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = signUpRequestBody.fname;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = signUpRequestBody.rcToken;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = signUpRequestBody.googleToken;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = signUpRequestBody.deviceInfo;
        }
        return signUpRequestBody.copy(str, str7, str8, str9, str10, str6);
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
    public final String getFname() {
        return this.fname;
    }

    public final SignUpRequestBody copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new SignUpRequestBody(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SignUpRequestBody)) {
            return false;
        }
        SignUpRequestBody signUpRequestBody = (SignUpRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) signUpRequestBody.email) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.password, (Object) signUpRequestBody.password) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.fname, (Object) signUpRequestBody.fname) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) signUpRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.googleToken, (Object) signUpRequestBody.googleToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) signUpRequestBody.deviceInfo);
    }

    public final int hashCode() {
        return (((((((((this.email.hashCode() * 31) + this.password.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.rcToken.hashCode()) * 31) + this.googleToken.hashCode()) * 31) + this.deviceInfo.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.fname;
        String str4 = this.rcToken;
        String str5 = this.googleToken;
        String str6 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("SignUpRequestBody(email=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", fname=");
        sb.append(str3);
        sb.append(", rcToken=");
        sb.append(str4);
        sb.append(", googleToken=");
        sb.append(str5);
        sb.append(", deviceInfo=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
