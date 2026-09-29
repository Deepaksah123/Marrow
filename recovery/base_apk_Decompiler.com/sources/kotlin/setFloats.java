package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setFloats {
    private final getAttributeArrayLocationAndEnable AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;

    public setFloats(String str, getAttributeArrayLocationAndEnable getattributearraylocationandenable) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getattributearraylocationandenable, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = getattributearraylocationandenable;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final getAttributeArrayLocationAndEnable AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFloats)) {
            return false;
        }
        setFloats setfloats = (setFloats) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setfloats.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == setfloats.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        getAttributeArrayLocationAndEnable getattributearraylocationandenable = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubmitTestRepoModel(ownerCategory=");
        sb.append(str);
        sb.append(", testSubmitStatus=");
        sb.append(getattributearraylocationandenable);
        sb.append(")");
        return sb.toString();
    }
}
