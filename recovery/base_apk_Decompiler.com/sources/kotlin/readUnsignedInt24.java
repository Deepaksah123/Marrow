package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readUnsignedInt24 {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public readUnsignedInt24(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readUnsignedInt24)) {
            return false;
        }
        readUnsignedInt24 readunsignedint24 = (readUnsignedInt24) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readunsignedint24.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readunsignedint24.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("PearlIdUCModel(pearlId=");
        sb.append(str);
        sb.append(", pearlDisplayId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
