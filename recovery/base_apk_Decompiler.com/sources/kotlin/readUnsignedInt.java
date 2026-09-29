package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readUnsignedInt {
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public readUnsignedInt(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = i;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readUnsignedInt)) {
            return false;
        }
        readUnsignedInt readunsignedint = (readUnsignedInt) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readunsignedint.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readunsignedint.RemoteActionCompatParcelizer) && this.read == readunsignedint.read;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("PearlSubjectUCModel(subjectId=");
        sb.append(str);
        sb.append(", subjectTitle=");
        sb.append(str2);
        sb.append(", itemCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
