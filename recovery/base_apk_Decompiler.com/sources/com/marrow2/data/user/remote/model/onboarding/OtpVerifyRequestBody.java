package com.marrow2.data.user.remote.model.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0011R\u001c\u0010'\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/OtpVerifyRequestBody;", "", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p0", "", "p1", "", "p2", "p3", "p4", "<init>", "(Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/onboarding/OtpVerifyRequestBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "phoneNumberDetails", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "getPhoneNumberDetails", "forceLogin", "Z", "getForceLogin", "rcToken", "Ljava/lang/String;", "getRcToken", "otp", "getOtp", "deviceInfo", "getDeviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpVerifyRequestBody {
    public static final int $stable = 8;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("force_attach")
    private final boolean forceLogin;

    @JsonProperty("otp")
    private final String otp;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails phoneNumberDetails;

    @JsonProperty("config_hash")
    private final String rcToken;

    public OtpVerifyRequestBody(PhoneNumberDetails phoneNumberDetails, boolean z, String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        this.phoneNumberDetails = phoneNumberDetails;
        this.forceLogin = z;
        this.rcToken = str;
        this.otp = str2;
        this.deviceInfo = str3;
    }

    public /* synthetic */ OtpVerifyRequestBody(PhoneNumberDetails phoneNumberDetails, boolean z, String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(phoneNumberDetails, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public final PhoneNumberDetails getPhoneNumberDetails() {
        return this.phoneNumberDetails;
    }

    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    public final String getRcToken() {
        return this.rcToken;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ OtpVerifyRequestBody copy$default(OtpVerifyRequestBody otpVerifyRequestBody, PhoneNumberDetails phoneNumberDetails, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            phoneNumberDetails = otpVerifyRequestBody.phoneNumberDetails;
        }
        if ((i & 2) != 0) {
            z = otpVerifyRequestBody.forceLogin;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = otpVerifyRequestBody.rcToken;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = otpVerifyRequestBody.otp;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = otpVerifyRequestBody.deviceInfo;
        }
        return otpVerifyRequestBody.copy(phoneNumberDetails, z2, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PhoneNumberDetails getPhoneNumberDetails() {
        return this.phoneNumberDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final OtpVerifyRequestBody copy(PhoneNumberDetails p0, boolean p1, String p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new OtpVerifyRequestBody(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OtpVerifyRequestBody)) {
            return false;
        }
        OtpVerifyRequestBody otpVerifyRequestBody = (OtpVerifyRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumberDetails, otpVerifyRequestBody.phoneNumberDetails) && this.forceLogin == otpVerifyRequestBody.forceLogin && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) otpVerifyRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otp, (Object) otpVerifyRequestBody.otp) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) otpVerifyRequestBody.deviceInfo);
    }

    public final int hashCode() {
        int iHashCode = this.phoneNumberDetails.hashCode();
        int iHashCode2 = Boolean.hashCode(this.forceLogin);
        String str = this.rcToken;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.otp;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deviceInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        PhoneNumberDetails phoneNumberDetails = this.phoneNumberDetails;
        boolean z = this.forceLogin;
        String str = this.rcToken;
        String str2 = this.otp;
        String str3 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("OtpVerifyRequestBody(phoneNumberDetails=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=");
        sb.append(z);
        sb.append(", rcToken=");
        sb.append(str);
        sb.append(", otp=");
        sb.append(str2);
        sb.append(", deviceInfo=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
