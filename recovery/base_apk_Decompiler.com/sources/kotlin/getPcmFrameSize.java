package kotlin;

import com.marrow2.data.user.remote.model.onboarding.OtpRetryType;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u0019\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b\u0018\u0010 "}, d2 = {"Lo/getPcmFrameSize;", "", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "p0", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p1", "", "p2", "Lo/limit;", "p3", "<init>", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;ZLo/limit;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "IconCompatParcelizer", "()Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "write", "RemoteActionCompatParcelizer", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "read", "Z", "()Z", "Lo/limit;", "()Lo/limit;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getPcmFrameSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final OtpRetryType write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final limit RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final PhoneNumberDetails read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    public getPcmFrameSize(OtpRetryType otpRetryType, PhoneNumberDetails phoneNumberDetails, boolean z, limit limitVar) {
        toMagicModuleMetaRepoModel.write(otpRetryType, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(limitVar, "");
        this.write = otpRetryType;
        this.read = phoneNumberDetails;
        this.AudioAttributesCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = limitVar;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final OtpRetryType getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final PhoneNumberDetails getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final limit getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getPcmFrameSize)) {
            return false;
        }
        getPcmFrameSize getpcmframesize = (getPcmFrameSize) p0;
        return this.write == getpcmframesize.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getpcmframesize.read) && this.AudioAttributesCompatParcelizer == getpcmframesize.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == getpcmframesize.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        OtpRetryType otpRetryType = this.write;
        PhoneNumberDetails phoneNumberDetails = this.read;
        boolean z = this.AudioAttributesCompatParcelizer;
        limit limitVar = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("getPcmFrameSize(write=");
        sb.append(otpRetryType);
        sb.append(", read=");
        sb.append(phoneNumberDetails);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(limitVar);
        sb.append(")");
        return sb.toString();
    }
}
