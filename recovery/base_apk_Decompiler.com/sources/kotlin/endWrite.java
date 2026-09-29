package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class endWrite {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public endWrite(String str, String str2, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesImplApi26Parcelizer = i4;
        this.read = (i2 != i4 || i4 <= 0) ? 0 : 1;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endWrite)) {
            return false;
        }
        endWrite endwrite = (endWrite) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) endwrite.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) endwrite.AudioAttributesImplApi21Parcelizer) && this.write == endwrite.write && this.RemoteActionCompatParcelizer == endwrite.RemoteActionCompatParcelizer && this.IconCompatParcelizer == endwrite.IconCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == endwrite.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        int i = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("SchemaItemLSModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", completenessScore=");
        sb.append(i);
        sb.append(", attempted=");
        sb.append(i2);
        sb.append(", correctnessScore=");
        sb.append(i3);
        sb.append(", mcqCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
