package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class skipBytes {
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public skipBytes(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = i;
    }

    public final String read() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipBytes)) {
            return false;
        }
        skipBytes skipbytes = (skipBytes) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) skipbytes.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) skipbytes.write) && this.RemoteActionCompatParcelizer == skipbytes.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubjectBookmarkCountUCModel(subjectId=");
        sb.append(str);
        sb.append(", subjectTitle=");
        sb.append(str2);
        sb.append(", count=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
