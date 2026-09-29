package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/marrow2/ui/onboarding/phone/model/PhoneLoginUiData;", "", "countryCode", "", "phoneNumber", "isContinueEnabled", "", "showKeyboard", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCountryCode", "()Ljava/lang/String;", "getPhoneNumber", "()Z", "getShowKeyboard", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class writeIntArray {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final boolean read;
    private final boolean write;

    private writeIntArray(String str, String str2, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = z;
        this.write = z2;
    }

    public /* synthetic */ writeIntArray(String str, String str2, boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public writeIntArray() {
        this(null, null, false, false, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static writeIntArray write(String str, String str2, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new writeIntArray(str, str2, z, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof writeIntArray)) {
            return false;
        }
        writeIntArray writeintarray = (writeIntArray) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeintarray.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeintarray.AudioAttributesCompatParcelizer) && this.read == writeintarray.read && this.write == writeintarray.write;
    }

    public final int hashCode() {
        return (((((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        boolean z2 = this.write;
        StringBuilder sb = new StringBuilder("PhoneLoginUiData(countryCode=");
        sb.append(str);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(", isContinueEnabled=");
        sb.append(z);
        sb.append(", showKeyboard=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
