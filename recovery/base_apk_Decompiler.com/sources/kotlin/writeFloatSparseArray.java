package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/marrow2/ui/onboarding/phone/model/OtpLoginUiData;", "", "otpText", "", "isContinueEnabled", "", "callOtpTextTimer", "otpButtonType", "Lcom/marrow2/ui/onboarding/phone/model/OtpButtonType;", "shouldShowRequestOtpViaWhatsappButton", "shouldShowWhatsappOtpDeliveredMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/marrow2/ui/onboarding/phone/model/OtpButtonType;ZZ)V", "getOtpText", "()Ljava/lang/String;", "()Z", "getCallOtpTextTimer", "getOtpButtonType", "()Lcom/marrow2/ui/onboarding/phone/model/OtpButtonType;", "getShouldShowRequestOtpViaWhatsappButton", "getShouldShowWhatsappOtpDeliveredMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class writeFloatSparseArray {
    private final writeDoubleSparseArray AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    private writeFloatSparseArray(String str, boolean z, String str2, writeDoubleSparseArray writedoublesparsearray, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(writedoublesparsearray, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = writedoublesparsearray;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
    }

    public /* synthetic */ writeFloatSparseArray(String str, boolean z, String str2, writeDoubleSparseArray writedoublesparsearray, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? writeDoubleSparseArray.read : writedoublesparsearray, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final writeDoubleSparseArray getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public writeFloatSparseArray() {
        this(null, false, null, null, false, false, 63, null);
    }

    public static /* synthetic */ writeFloatSparseArray RemoteActionCompatParcelizer(writeFloatSparseArray writefloatsparsearray, String str, boolean z, String str2, writeDoubleSparseArray writedoublesparsearray, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = writefloatsparsearray.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z = writefloatsparsearray.write;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            str2 = writefloatsparsearray.read;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            writedoublesparsearray = writefloatsparsearray.AudioAttributesCompatParcelizer;
        }
        writeDoubleSparseArray writedoublesparsearray2 = writedoublesparsearray;
        if ((i & 16) != 0) {
            z2 = writefloatsparsearray.IconCompatParcelizer;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = writefloatsparsearray.MediaBrowserCompatCustomActionResultReceiver;
        }
        return write(str, z4, str3, writedoublesparsearray2, z5, z3);
    }

    private static writeFloatSparseArray write(String str, boolean z, String str2, writeDoubleSparseArray writedoublesparsearray, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(writedoublesparsearray, "");
        return new writeFloatSparseArray(str, z, str2, writedoublesparsearray, z2, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof writeFloatSparseArray)) {
            return false;
        }
        writeFloatSparseArray writefloatsparsearray = (writeFloatSparseArray) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) writefloatsparsearray.RemoteActionCompatParcelizer) && this.write == writefloatsparsearray.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writefloatsparsearray.read) && this.AudioAttributesCompatParcelizer == writefloatsparsearray.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == writefloatsparsearray.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == writefloatsparsearray.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write)) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.write;
        String str2 = this.read;
        writeDoubleSparseArray writedoublesparsearray = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("OtpLoginUiData(otpText=");
        sb.append(str);
        sb.append(", isContinueEnabled=");
        sb.append(z);
        sb.append(", callOtpTextTimer=");
        sb.append(str2);
        sb.append(", otpButtonType=");
        sb.append(writedoublesparsearray);
        sb.append(", shouldShowRequestOtpViaWhatsappButton=");
        sb.append(z2);
        sb.append(", shouldShowWhatsappOtpDeliveredMessage=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
