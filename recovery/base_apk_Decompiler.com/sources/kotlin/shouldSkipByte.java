package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldSkipByte {
    private final String AudioAttributesCompatParcelizer;
    private final String write;

    public shouldSkipByte(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shouldSkipByte)) {
            return false;
        }
        shouldSkipByte shouldskipbyte = (shouldSkipByte) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) shouldskipbyte.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) shouldskipbyte.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("GetCallbackResult(emailTitle=");
        sb.append(str);
        sb.append(", emailBody=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
