package kotlin;

import com.marrow2.data.user.remote.model.onboarding.OtpRetryType;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012"}, d2 = {"Lo/createEglPbufferSurface;", "", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "p0", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p1", "", "p2", "", "p3", "<init>", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "otpRetryType", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "phoneNumberDetails", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "read", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "forceLogin", "Z", "RemoteActionCompatParcelizer", "()Z", "otpDeliveryChannel", "Ljava/lang/String;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createEglPbufferSurface {
    public static final int $stable = 8;
    private final boolean forceLogin;
    private final String otpDeliveryChannel;
    private final OtpRetryType otpRetryType;
    private final PhoneNumberDetails phoneNumberDetails;

    public createEglPbufferSurface(OtpRetryType otpRetryType, PhoneNumberDetails phoneNumberDetails, boolean z, String str) {
        toMagicModuleMetaRepoModel.write(otpRetryType, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.otpRetryType = otpRetryType;
        this.phoneNumberDetails = phoneNumberDetails;
        this.forceLogin = z;
        this.otpDeliveryChannel = str;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final OtpRetryType getOtpRetryType() {
        return this.otpRetryType;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final PhoneNumberDetails getPhoneNumberDetails() {
        return this.phoneNumberDetails;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getForceLogin() {
        return this.forceLogin;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getOtpDeliveryChannel() {
        return this.otpDeliveryChannel;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof createEglPbufferSurface)) {
            return false;
        }
        createEglPbufferSurface createeglpbuffersurface = (createEglPbufferSurface) p0;
        return this.otpRetryType == createeglpbuffersurface.otpRetryType && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumberDetails, createeglpbuffersurface.phoneNumberDetails) && this.forceLogin == createeglpbuffersurface.forceLogin && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.otpDeliveryChannel, (Object) createeglpbuffersurface.otpDeliveryChannel);
    }

    public final int hashCode() {
        return (((((this.otpRetryType.hashCode() * 31) + this.phoneNumberDetails.hashCode()) * 31) + Boolean.hashCode(this.forceLogin)) * 31) + this.otpDeliveryChannel.hashCode();
    }

    public final String toString() {
        OtpRetryType otpRetryType = this.otpRetryType;
        PhoneNumberDetails phoneNumberDetails = this.phoneNumberDetails;
        boolean z = this.forceLogin;
        String str = this.otpDeliveryChannel;
        StringBuilder sb = new StringBuilder("createEglPbufferSurface(otpRetryType=");
        sb.append(otpRetryType);
        sb.append(", phoneNumberDetails=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=");
        sb.append(z);
        sb.append(", otpDeliveryChannel=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
