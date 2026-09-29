package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class focusRenderTarget {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;

    public focusRenderTarget(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof focusRenderTarget)) {
            return false;
        }
        focusRenderTarget focusrendertarget = (focusRenderTarget) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) focusrendertarget.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) focusrendertarget.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) focusrendertarget.read);
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        StringBuilder sb = new StringBuilder("OtpVerifyRepoModel(countryCode=");
        sb.append(str);
        sb.append(", nationalNumber=");
        sb.append(str2);
        sb.append(", otp=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
