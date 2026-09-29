package com.marrow2.data.user.remote.model.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateRequestBody;", "", "", "p0", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateRequestBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "otp", "Ljava/lang/String;", "primary_contact", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "force_attach", "Z", "rcToken", "deviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpValidateRequestBody {
    public static final int $stable = 8;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("force_attach")
    private final boolean force_attach;

    @JsonProperty("otp")
    private final String otp;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails primary_contact;

    @JsonProperty("config_hash")
    private final String rcToken;

    public OtpValidateRequestBody(String str, PhoneNumberDetails phoneNumberDetails, boolean z, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.otp = str;
        this.primary_contact = phoneNumberDetails;
        this.force_attach = z;
        this.rcToken = str2;
        this.deviceInfo = str3;
    }

    public /* synthetic */ OtpValidateRequestBody(String str, PhoneNumberDetails phoneNumberDetails, boolean z, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, phoneNumberDetails, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final PhoneNumberDetails getPrimary_contact() {
        return this.primary_contact;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final boolean getForce_attach() {
        return this.force_attach;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ OtpValidateRequestBody copy$default(OtpValidateRequestBody otpValidateRequestBody, String str, PhoneNumberDetails phoneNumberDetails, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otpValidateRequestBody.otp;
        }
        if ((i & 2) != 0) {
            phoneNumberDetails = otpValidateRequestBody.primary_contact;
        }
        PhoneNumberDetails phoneNumberDetails2 = phoneNumberDetails;
        if ((i & 4) != 0) {
            z = otpValidateRequestBody.force_attach;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = otpValidateRequestBody.rcToken;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = otpValidateRequestBody.deviceInfo;
        }
        return otpValidateRequestBody.copy(str, phoneNumberDetails2, z2, str4, str3);
    }

    public final OtpValidateRequestBody copy(String p0, PhoneNumberDetails p1, boolean p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new OtpValidateRequestBody(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OtpValidateRequestBody)) {
            return false;
        }
        OtpValidateRequestBody otpValidateRequestBody = (OtpValidateRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otp, (Object) otpValidateRequestBody.otp) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.primary_contact, otpValidateRequestBody.primary_contact) && this.force_attach == otpValidateRequestBody.force_attach && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) otpValidateRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) otpValidateRequestBody.deviceInfo);
    }

    public final int hashCode() {
        return (((((((this.otp.hashCode() * 31) + this.primary_contact.hashCode()) * 31) + Boolean.hashCode(this.force_attach)) * 31) + this.rcToken.hashCode()) * 31) + this.deviceInfo.hashCode();
    }

    public final String toString() {
        String str = this.otp;
        PhoneNumberDetails phoneNumberDetails = this.primary_contact;
        boolean z = this.force_attach;
        String str2 = this.rcToken;
        String str3 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("OtpValidateRequestBody(otp=");
        sb.append(str);
        sb.append(", primary_contact=");
        sb.append(phoneNumberDetails);
        sb.append(", force_attach=");
        sb.append(z);
        sb.append(", rcToken=");
        sb.append(str2);
        sb.append(", deviceInfo=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
