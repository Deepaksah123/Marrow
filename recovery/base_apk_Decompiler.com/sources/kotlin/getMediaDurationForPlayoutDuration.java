package kotlin;

import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/getMediaDurationForPlayoutDuration;", "", "", "p0", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "otp", "Ljava/lang/String;", "read", "phoneNumberDetails", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "write", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "forceLogin", "Z", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getMediaDurationForPlayoutDuration {
    public static final int $stable = 8;
    private final boolean forceLogin;
    private final String otp;
    private final PhoneNumberDetails phoneNumberDetails;

    private getMediaDurationForPlayoutDuration(String str, PhoneNumberDetails phoneNumberDetails, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        this.otp = str;
        this.phoneNumberDetails = phoneNumberDetails;
        this.forceLogin = z;
    }

    public /* synthetic */ getMediaDurationForPlayoutDuration(String str, PhoneNumberDetails phoneNumberDetails, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, phoneNumberDetails, (i & 4) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final PhoneNumberDetails getPhoneNumberDetails() {
        return this.phoneNumberDetails;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getMediaDurationForPlayoutDuration)) {
            return false;
        }
        getMediaDurationForPlayoutDuration getmediadurationforplayoutduration = (getMediaDurationForPlayoutDuration) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otp, (Object) getmediadurationforplayoutduration.otp) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumberDetails, getmediadurationforplayoutduration.phoneNumberDetails) && this.forceLogin == getmediadurationforplayoutduration.forceLogin;
    }

    public final int hashCode() {
        return (((this.otp.hashCode() * 31) + this.phoneNumberDetails.hashCode()) * 31) + Boolean.hashCode(this.forceLogin);
    }

    public final String toString() {
        String str = this.otp;
        PhoneNumberDetails phoneNumberDetails = this.phoneNumberDetails;
        boolean z = this.forceLogin;
        StringBuilder sb = new StringBuilder("getMediaDurationForPlayoutDuration(otp=");
        sb.append(str);
        sb.append(", phoneNumberDetails=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
