package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006 "}, d2 = {"Lcom/marrow2/ui/settings/kyc/authbridge/KycAuthBridgeUiState;", "", "phoneNumber", "", "continueButtonEnable", "", "resendOtpVisible", "Lcom/marrow2/ui/settings/kyc/authbridge/ResendOtpStatus;", "timeLeftTimer", "", "kycStatus", "<init>", "(Ljava/lang/String;ZLcom/marrow2/ui/settings/kyc/authbridge/ResendOtpStatus;II)V", "getPhoneNumber", "()Ljava/lang/String;", "getContinueButtonEnable", "()Z", "getResendOtpVisible", "()Lcom/marrow2/ui/settings/kyc/authbridge/ResendOtpStatus;", "getTimeLeftTimer", "()I", "getKycStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isNetworkLocationPresent {
    private final LocationStatusCodes AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    private isNetworkLocationPresent(String str, boolean z, LocationStatusCodes locationStatusCodes, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(locationStatusCodes, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = locationStatusCodes;
        this.write = i;
        this.read = i2;
    }

    public /* synthetic */ isNetworkLocationPresent(String str, boolean z, LocationStatusCodes locationStatusCodes, int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? LocationStatusCodes.AudioAttributesCompatParcelizer : locationStatusCodes, (i3 & 8) == 0 ? i : 0, (i3 & 16) != 0 ? 1 : i2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final LocationStatusCodes getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public isNetworkLocationPresent() {
        this(null, false, null, 0, 0, 31, null);
    }

    public static /* synthetic */ isNetworkLocationPresent read(isNetworkLocationPresent isnetworklocationpresent, String str, boolean z, LocationStatusCodes locationStatusCodes, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = isnetworklocationpresent.RemoteActionCompatParcelizer;
        }
        if ((i3 & 2) != 0) {
            z = isnetworklocationpresent.IconCompatParcelizer;
        }
        if ((i3 & 4) != 0) {
            locationStatusCodes = isnetworklocationpresent.AudioAttributesCompatParcelizer;
        }
        if ((i3 & 8) != 0) {
            i = isnetworklocationpresent.write;
        }
        if ((i3 & 16) != 0) {
            i2 = isnetworklocationpresent.read;
        }
        return RemoteActionCompatParcelizer(str, z, locationStatusCodes, i, i2);
    }

    private static isNetworkLocationPresent RemoteActionCompatParcelizer(String str, boolean z, LocationStatusCodes locationStatusCodes, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(locationStatusCodes, "");
        return new isNetworkLocationPresent(str, z, locationStatusCodes, i, i2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof isNetworkLocationPresent)) {
            return false;
        }
        isNetworkLocationPresent isnetworklocationpresent = (isNetworkLocationPresent) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) isnetworklocationpresent.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == isnetworklocationpresent.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == isnetworklocationpresent.AudioAttributesCompatParcelizer && this.write == isnetworklocationpresent.write && this.read == isnetworklocationpresent.read;
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.IconCompatParcelizer;
        LocationStatusCodes locationStatusCodes = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("KycAuthBridgeUiState(phoneNumber=");
        sb.append(str);
        sb.append(", continueButtonEnable=");
        sb.append(z);
        sb.append(", resendOtpVisible=");
        sb.append(locationStatusCodes);
        sb.append(", timeLeftTimer=");
        sb.append(i);
        sb.append(", kycStatus=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
