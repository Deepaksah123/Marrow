package com.marrow2.data.user.remote.model.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010!\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001f"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/AccountSelectionRequestBody;", "", "", "p0", "p1", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p2", "", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/onboarding/AccountSelectionRequestBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", LoggedUserResponse.KEY_TOKEN, "Ljava/lang/String;", "getToken", "userId", "getUserId", "setUserId", "(Ljava/lang/String;)V", "phoneNumber", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "getPhoneNumber", "forceLogin", "Z", "getForceLogin", "rcToken", "deviceInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSelectionRequestBody {
    public static final int $stable = 8;

    @JsonProperty("dvinfo")
    private final String deviceInfo;

    @JsonProperty("force_attach")
    private final boolean forceLogin;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails phoneNumber;

    @JsonProperty("config_hash")
    private final String rcToken;

    @JsonProperty(LoggedUserResponse.KEY_TOKEN)
    private final String token;

    @JsonProperty("user_id")
    private String userId;

    public AccountSelectionRequestBody(String str, String str2, PhoneNumberDetails phoneNumberDetails, boolean z, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.token = str;
        this.userId = str2;
        this.phoneNumber = phoneNumberDetails;
        this.forceLogin = z;
        this.rcToken = str3;
        this.deviceInfo = str4;
    }

    public /* synthetic */ AccountSelectionRequestBody(String str, String str2, PhoneNumberDetails phoneNumberDetails, boolean z, String str3, String str4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, phoneNumberDetails, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.userId = str;
    }

    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getRcToken() {
        return this.rcToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public static /* synthetic */ AccountSelectionRequestBody copy$default(AccountSelectionRequestBody accountSelectionRequestBody, String str, String str2, PhoneNumberDetails phoneNumberDetails, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSelectionRequestBody.token;
        }
        if ((i & 2) != 0) {
            str2 = accountSelectionRequestBody.userId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            phoneNumberDetails = accountSelectionRequestBody.phoneNumber;
        }
        PhoneNumberDetails phoneNumberDetails2 = phoneNumberDetails;
        if ((i & 8) != 0) {
            z = accountSelectionRequestBody.forceLogin;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = accountSelectionRequestBody.rcToken;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = accountSelectionRequestBody.deviceInfo;
        }
        return accountSelectionRequestBody.copy(str, str5, phoneNumberDetails2, z2, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    public final AccountSelectionRequestBody copy(String p0, String p1, PhoneNumberDetails p2, boolean p3, String p4, String p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new AccountSelectionRequestBody(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AccountSelectionRequestBody)) {
            return false;
        }
        AccountSelectionRequestBody accountSelectionRequestBody = (AccountSelectionRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.token, (Object) accountSelectionRequestBody.token) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) accountSelectionRequestBody.userId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumber, accountSelectionRequestBody.phoneNumber) && this.forceLogin == accountSelectionRequestBody.forceLogin && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) accountSelectionRequestBody.rcToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceInfo, (Object) accountSelectionRequestBody.deviceInfo);
    }

    public final int hashCode() {
        return (((((((((this.token.hashCode() * 31) + this.userId.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + Boolean.hashCode(this.forceLogin)) * 31) + this.rcToken.hashCode()) * 31) + this.deviceInfo.hashCode();
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.userId;
        PhoneNumberDetails phoneNumberDetails = this.phoneNumber;
        boolean z = this.forceLogin;
        String str3 = this.rcToken;
        String str4 = this.deviceInfo;
        StringBuilder sb = new StringBuilder("AccountSelectionRequestBody(token=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=");
        sb.append(z);
        sb.append(", rcToken=");
        sb.append(str3);
        sb.append(", deviceInfo=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
