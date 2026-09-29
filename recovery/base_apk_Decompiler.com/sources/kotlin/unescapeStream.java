package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class unescapeStream {
    private long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final int write;

    public unescapeStream(boolean z, int i, long j, String str, int i2, String str2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesCompatParcelizer = j;
        this.read = str;
        this.write = i2;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = i3;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unescapeStream)) {
            return false;
        }
        unescapeStream unescapestream = (unescapeStream) obj;
        return this.MediaBrowserCompatCustomActionResultReceiver == unescapestream.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == unescapestream.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer == unescapestream.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) unescapestream.read) && this.write == unescapestream.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) unescapestream.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == unescapestream.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.AudioAttributesImplBaseParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        String str = this.read;
        int i2 = this.write;
        String str2 = this.IconCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ImageUploadUCModel(isUploaded=");
        sb.append(z);
        sb.append(", type=");
        sb.append(i);
        sb.append(", id=");
        sb.append(j);
        sb.append(", filename=");
        sb.append(str);
        sb.append(", docSideType=");
        sb.append(i2);
        sb.append(", docGroupId=");
        sb.append(str2);
        sb.append(", docType=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
