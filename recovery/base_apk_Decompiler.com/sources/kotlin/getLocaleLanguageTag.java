package kotlin;

import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class getLocaleLanguageTag {
    private final boolean IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final PhoneNumberDetails read;
    private final String write;

    public getLocaleLanguageTag(String str, String str2, PhoneNumberDetails phoneNumberDetails) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.read = phoneNumberDetails;
        this.IconCompatParcelizer = false;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final PhoneNumberDetails IconCompatParcelizer() {
        return this.read;
    }

    public final boolean write() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLocaleLanguageTag)) {
            return false;
        }
        getLocaleLanguageTag getlocalelanguagetag = (getLocaleLanguageTag) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getlocalelanguagetag.RemoteActionCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getlocalelanguagetag.write) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getlocalelanguagetag.read)) {
            return false;
        }
        boolean z = getlocalelanguagetag.IconCompatParcelizer;
        return true;
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        PhoneNumberDetails phoneNumberDetails = this.read;
        StringBuilder sb = new StringBuilder("AccountSelectionRequestUCModel(token=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", forceLogin=false");
        sb.append(")");
        return sb.toString();
    }
}
