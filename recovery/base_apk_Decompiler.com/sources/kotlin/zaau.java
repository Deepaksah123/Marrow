package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class zaau {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int read;

    public zaau(int i, int i2, int i3) {
        this.AudioAttributesCompatParcelizer = i;
        this.read = i2;
        this.IconCompatParcelizer = i3;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaau)) {
            return false;
        }
        zaau zaauVar = (zaau) obj;
        return this.AudioAttributesCompatParcelizer == zaauVar.AudioAttributesCompatParcelizer && this.read == zaauVar.read && this.IconCompatParcelizer == zaauVar.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.read;
        int i3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("OverallStats(attemptedModulesCount=");
        sb.append(i);
        sb.append(", mcqsRevised=");
        sb.append(i2);
        sb.append(", mcqsNeedingRevision=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
