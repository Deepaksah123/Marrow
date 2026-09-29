package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class CBufferFlags {
    private final int AudioAttributesCompatParcelizer;
    public final String IconCompatParcelizer;
    public final int read;

    public CBufferFlags(String str, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.read = i2;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBufferFlags)) {
            return false;
        }
        CBufferFlags cBufferFlags = (CBufferFlags) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cBufferFlags.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == cBufferFlags.AudioAttributesCompatParcelizer && this.read == cBufferFlags.read;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", generation=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", systemId=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
