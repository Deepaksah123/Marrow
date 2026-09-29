package kotlin;

import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0015R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0015R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u0015R\u001c\u0010%\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u0015R\u001a\u0010'\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u0015"}, d2 = {"Lo/zaB;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "initiateKyc", "Z", "write", "()Z", "refreshToken", "Ljava/lang/String;", "RemoteActionCompatParcelizer", LoggedUserResponse.KEY_TOKEN, "MediaBrowserCompatCustomActionResultReceiver", "transactionId", "AudioAttributesImplApi21Parcelizer", "kycStatus", "IconCompatParcelizer", "workFlowId", "AudioAttributesImplBaseParcelizer", "dkycToken", "AudioAttributesCompatParcelizer", "deviceCount", "I", "read", "userId", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zaB {
    public static final int $stable = 0;
    private final int deviceCount;
    private final String dkycToken;
    private final boolean initiateKyc;
    private final String kycStatus;
    private final String refreshToken;
    private final String token;
    private final String transactionId;
    private final String userId;
    private final String workFlowId;

    public zaB(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.initiateKyc = z;
        this.refreshToken = str;
        this.token = str2;
        this.transactionId = str3;
        this.kycStatus = str4;
        this.workFlowId = str5;
        this.dkycToken = str6;
        this.deviceCount = i;
        this.userId = str7;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getInitiateKyc() {
        return this.initiateKyc;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getKycStatus() {
        return this.kycStatus;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getWorkFlowId() {
        return this.workFlowId;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getDkycToken() {
        return this.dkycToken;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getDeviceCount() {
        return this.deviceCount;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zaB)) {
            return false;
        }
        zaB zab = (zaB) p0;
        return this.initiateKyc == zab.initiateKyc && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.refreshToken, (Object) zab.refreshToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.token, (Object) zab.token) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.transactionId, (Object) zab.transactionId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.kycStatus, (Object) zab.kycStatus) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.workFlowId, (Object) zab.workFlowId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.dkycToken, (Object) zab.dkycToken) && this.deviceCount == zab.deviceCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) zab.userId);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.initiateKyc);
        int iHashCode2 = this.refreshToken.hashCode();
        int iHashCode3 = this.token.hashCode();
        int iHashCode4 = this.transactionId.hashCode();
        int iHashCode5 = this.kycStatus.hashCode();
        int iHashCode6 = this.workFlowId.hashCode();
        String str = this.dkycToken;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.deviceCount)) * 31) + this.userId.hashCode();
    }

    public final String toString() {
        boolean z = this.initiateKyc;
        String str = this.refreshToken;
        String str2 = this.token;
        String str3 = this.transactionId;
        String str4 = this.kycStatus;
        String str5 = this.workFlowId;
        String str6 = this.dkycToken;
        int i = this.deviceCount;
        String str7 = this.userId;
        StringBuilder sb = new StringBuilder("zaB(initiateKyc=");
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
        sb.append(", deviceCount=");
        sb.append(i);
        sb.append(", userId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
