package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class Finalizer {
    private final int AudioAttributesCompatParcelizer;
    private final standardIsEmpty IconCompatParcelizer;

    public Finalizer(standardIsEmpty standardisempty, int i) {
        toMagicModuleMetaRepoModel.write(standardisempty, "");
        this.IconCompatParcelizer = standardisempty;
        this.AudioAttributesCompatParcelizer = i;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final standardIsEmpty write() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Finalizer)) {
            return false;
        }
        Finalizer finalizer = (Finalizer) obj;
        return this.IconCompatParcelizer == finalizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == finalizer.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        standardIsEmpty standardisempty = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("ErrorTypeConfig(resolutionType=");
        sb.append(standardisempty);
        sb.append(", errorCode=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
