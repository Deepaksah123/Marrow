package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isIndexFile {
    private final isHoleSpan AudioAttributesCompatParcelizer;
    private final int read;

    public isIndexFile(isHoleSpan isholespan, int i) {
        toMagicModuleMetaRepoModel.write(isholespan, "");
        this.AudioAttributesCompatParcelizer = isholespan;
        this.read = i;
    }

    public final isHoleSpan RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isIndexFile)) {
            return false;
        }
        isIndexFile isindexfile = (isIndexFile) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, isindexfile.AudioAttributesCompatParcelizer) && this.read == isindexfile.read;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        isHoleSpan isholespan = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("McqIndexWithAnswerRepoModel(mcqIndexRepoModel=");
        sb.append(isholespan);
        sb.append(", answer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
