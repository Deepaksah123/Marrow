package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemHandlerWrapper1 {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public SystemHandlerWrapper1(String str, String str2, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.write = i;
        this.read = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver() ? 1 : 0;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        int i = this.read;
        return i == this.AudioAttributesImplApi21Parcelizer && i > 0;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatItemReceiver() && this.AudioAttributesCompatParcelizer < 40;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemHandlerWrapper1)) {
            return false;
        }
        SystemHandlerWrapper1 systemHandlerWrapper1 = (SystemHandlerWrapper1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) systemHandlerWrapper1.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) systemHandlerWrapper1.AudioAttributesImplApi26Parcelizer) && this.write == systemHandlerWrapper1.write && this.read == systemHandlerWrapper1.read && this.AudioAttributesCompatParcelizer == systemHandlerWrapper1.AudioAttributesCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == systemHandlerWrapper1.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((((((((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesImplApi26Parcelizer;
        int i = this.write;
        int i2 = this.read;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("SchemaItemUCModel(id=");
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
