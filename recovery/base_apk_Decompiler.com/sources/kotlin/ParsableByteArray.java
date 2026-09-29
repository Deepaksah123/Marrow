package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsableByteArray {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public ParsableByteArray(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.RemoteActionCompatParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.read = i4;
        this.write = i5;
        this.IconCompatParcelizer = i6;
        this.AudioAttributesImplApi21Parcelizer = i7;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.write;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsableByteArray)) {
            return false;
        }
        ParsableByteArray parsableByteArray = (ParsableByteArray) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) parsableByteArray.AudioAttributesImplApi26Parcelizer) && this.RemoteActionCompatParcelizer == parsableByteArray.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == parsableByteArray.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesCompatParcelizer == parsableByteArray.AudioAttributesCompatParcelizer && this.read == parsableByteArray.read && this.write == parsableByteArray.write && this.IconCompatParcelizer == parsableByteArray.IconCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == parsableByteArray.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((((this.AudioAttributesImplApi26Parcelizer.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.read;
        int i5 = this.write;
        int i6 = this.IconCompatParcelizer;
        int i7 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("QbankCountStatUCModel(parentId=");
        sb.append(str);
        sb.append(", answeredMcqCount=");
        sb.append(i);
        sb.append(", skippedMcqCount=");
        sb.append(i2);
        sb.append(", bookmarkedMcqCount=");
        sb.append(i3);
        sb.append(", incorrectMcqCount=");
        sb.append(i4);
        sb.append(", correctAnsweredMcqCount=");
        sb.append(i5);
        sb.append(", newAddedMcqCount=");
        sb.append(i6);
        sb.append(", revisedMcqCount=");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }
}
