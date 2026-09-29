package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomicFile {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public AtomicFile(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtomicFile)) {
            return false;
        }
        AtomicFile atomicFile = (AtomicFile) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) atomicFile.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) atomicFile.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaQBankItemLSModel(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
