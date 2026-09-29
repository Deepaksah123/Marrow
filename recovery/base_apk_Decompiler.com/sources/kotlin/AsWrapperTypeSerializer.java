package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class AsWrapperTypeSerializer {
    public static final AsWrapperTypeSerializer read = new AsWrapperTypeSerializer(-1, -1);
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;

    static {
        new AsWrapperTypeSerializer(0, 0);
    }

    public AsWrapperTypeSerializer(int i, int i2) {
        buildTypeSerializer.IconCompatParcelizer((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AsWrapperTypeSerializer) {
            AsWrapperTypeSerializer asWrapperTypeSerializer = (AsWrapperTypeSerializer) obj;
            if (this.IconCompatParcelizer == asWrapperTypeSerializer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == asWrapperTypeSerializer.AudioAttributesCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append("x");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        return ((i2 << 16) | (i2 >>> 16)) ^ i;
    }
}
