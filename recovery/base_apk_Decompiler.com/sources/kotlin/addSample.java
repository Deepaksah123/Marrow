package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class addSample {
    private long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public addSample(boolean z, int i, long j, String str, int i2, String str2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesCompatParcelizer = j;
        this.write = str;
        this.read = i2;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = i3;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addSample)) {
            return false;
        }
        addSample addsample = (addSample) obj;
        return this.AudioAttributesImplBaseParcelizer == addsample.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == addsample.AudioAttributesImplApi26Parcelizer && this.AudioAttributesCompatParcelizer == addsample.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) addsample.write) && this.read == addsample.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) addsample.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == addsample.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((Boolean.hashCode(this.AudioAttributesImplBaseParcelizer) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        String str = this.write;
        int i2 = this.read;
        String str2 = this.IconCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ImageUploadLSModel(isUploaded=");
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
