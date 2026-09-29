package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJn\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0013R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0013R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0013R\u001c\u0010,\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u0013R\u001c\u00100\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0013R\u001a\u00104\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001b"}, d2 = {"Lcom/marrow2/data/user/remote/model/KYCMetaV2;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/marrow2/data/user/remote/model/KYCMetaV2;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "initiateKyc", "Z", "getInitiateKyc", "refreshToken", "Ljava/lang/String;", "getRefreshToken", LoggedUserResponse.KEY_TOKEN, "getToken", "transactionId", "getTransactionId", "kycStatus", "getKycStatus", "workFlowId", "getWorkFlowId", "dkycToken", "getDkycToken", "kycMessage", "getKycMessage", "deviceCount", "I", "getDeviceCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KYCMetaV2 {
    public static final int $stable = 0;
    private final int deviceCount;
    private final String dkycToken;
    private final boolean initiateKyc;
    private final String kycMessage;
    private final String kycStatus;
    private final String refreshToken;
    private final String token;
    private final String transactionId;
    private final String workFlowId;

    public KYCMetaV2(@JsonProperty("initiate_kyc") boolean z, @JsonProperty(LoggedUserResponse.KEY_REFRESH_TOKEN) String str, @JsonProperty(LoggedUserResponse.KEY_TOKEN) String str2, @JsonProperty("transaction_id") String str3, @JsonProperty("user_device_kyc_status") String str4, @JsonProperty("workflow_id") String str5, @JsonProperty("hyperverge_access_token") String str6, @JsonProperty("kyc_message") String str7, @JsonProperty("current_allowed_devices_count") int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.initiateKyc = z;
        this.refreshToken = str;
        this.token = str2;
        this.transactionId = str3;
        this.kycStatus = str4;
        this.workFlowId = str5;
        this.dkycToken = str6;
        this.kycMessage = str7;
        this.deviceCount = i;
    }

    public final boolean getInitiateKyc() {
        return this.initiateKyc;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getKycStatus() {
        return this.kycStatus;
    }

    public final String getWorkFlowId() {
        return this.workFlowId;
    }

    public final String getDkycToken() {
        return this.dkycToken;
    }

    public final String getKycMessage() {
        return this.kycMessage;
    }

    public final int getDeviceCount() {
        return this.deviceCount;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getInitiateKyc() {
        return this.initiateKyc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKycStatus() {
        return this.kycStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWorkFlowId() {
        return this.workFlowId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDkycToken() {
        return this.dkycToken;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKycMessage() {
        return this.kycMessage;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeviceCount() {
        return this.deviceCount;
    }

    public final KYCMetaV2 copy(@JsonProperty("initiate_kyc") boolean p0, @JsonProperty(LoggedUserResponse.KEY_REFRESH_TOKEN) String p1, @JsonProperty(LoggedUserResponse.KEY_TOKEN) String p2, @JsonProperty("transaction_id") String p3, @JsonProperty("user_device_kyc_status") String p4, @JsonProperty("workflow_id") String p5, @JsonProperty("hyperverge_access_token") String p6, @JsonProperty("kyc_message") String p7, @JsonProperty("current_allowed_devices_count") int p8) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        return new KYCMetaV2(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof KYCMetaV2)) {
            return false;
        }
        KYCMetaV2 kYCMetaV2 = (KYCMetaV2) p0;
        return this.initiateKyc == kYCMetaV2.initiateKyc && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.refreshToken, (Object) kYCMetaV2.refreshToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.token, (Object) kYCMetaV2.token) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.transactionId, (Object) kYCMetaV2.transactionId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.kycStatus, (Object) kYCMetaV2.kycStatus) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.workFlowId, (Object) kYCMetaV2.workFlowId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.dkycToken, (Object) kYCMetaV2.dkycToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.kycMessage, (Object) kYCMetaV2.kycMessage) && this.deviceCount == kYCMetaV2.deviceCount;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.initiateKyc);
        int iHashCode2 = this.refreshToken.hashCode();
        int iHashCode3 = this.token.hashCode();
        int iHashCode4 = this.transactionId.hashCode();
        String str = this.kycStatus;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.workFlowId.hashCode();
        String str2 = this.dkycToken;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.kycMessage.hashCode()) * 31) + Integer.hashCode(this.deviceCount);
    }

    public final String toString() {
        boolean z = this.initiateKyc;
        String str = this.refreshToken;
        String str2 = this.token;
        String str3 = this.transactionId;
        String str4 = this.kycStatus;
        String str5 = this.workFlowId;
        String str6 = this.dkycToken;
        String str7 = this.kycMessage;
        int i = this.deviceCount;
        StringBuilder sb = new StringBuilder("KYCMetaV2(initiateKyc=");
        sb.append(z);
        sb.append(", refreshToken=");
        sb.append(str);
        sb.append(", token=");
        sb.append(str2);
        sb.append(", transactionId=");
        sb.append(str3);
        sb.append(", kycStatus=");
        sb.append(str4);
        sb.append(", workFlowId=");
        sb.append(str5);
        sb.append(", dkycToken=");
        sb.append(str6);
        sb.append(", kycMessage=");
        sb.append(str7);
        sb.append(", deviceCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
