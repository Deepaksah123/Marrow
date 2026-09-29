package kotlin;

import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class isYuvTargetExtensionSupported {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final String read;
    private final PhoneNumberDetails write;

    public isYuvTargetExtensionSupported(String str, String str2, PhoneNumberDetails phoneNumberDetails, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = phoneNumberDetails;
        this.IconCompatParcelizer = z;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final PhoneNumberDetails AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isYuvTargetExtensionSupported)) {
            return false;
        }
        isYuvTargetExtensionSupported isyuvtargetextensionsupported = (isYuvTargetExtensionSupported) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) isyuvtargetextensionsupported.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) isyuvtargetextensionsupported.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, isyuvtargetextensionsupported.write) && this.IconCompatParcelizer == isyuvtargetextensionsupported.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        PhoneNumberDetails phoneNumberDetails = this.write;
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("AccountSelectionRequestRepoModel(token=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
