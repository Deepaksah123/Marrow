package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaw {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int write;

    public zaaw(int i, int i2, int i3) {
        this.write = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.IconCompatParcelizer = i3;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaaw)) {
            return false;
        }
        zaaw zaawVar = (zaaw) obj;
        return this.write == zaawVar.write && this.AudioAttributesCompatParcelizer == zaawVar.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == zaawVar.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.write) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = this.write;
        int i2 = this.AudioAttributesCompatParcelizer;
        int i3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("ModuleMcqDetails(totalMcqs=");
        sb.append(i);
        sb.append(", correctMcqCount=");
        sb.append(i2);
        sb.append(", percentage=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
