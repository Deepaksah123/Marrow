package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class maxValue {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public maxValue(String str, String str2, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaBrowserCompatItemReceiver = i;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.read = i4;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver == this.IconCompatParcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.read == this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maxValue)) {
            return false;
        }
        maxValue maxvalue = (maxValue) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) maxvalue.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) maxvalue.RemoteActionCompatParcelizer) && this.MediaBrowserCompatItemReceiver == maxvalue.MediaBrowserCompatItemReceiver && this.IconCompatParcelizer == maxvalue.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == maxvalue.AudioAttributesCompatParcelizer && this.read == maxvalue.read;
    }

    public final int hashCode() {
        return (((((((((this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        int i = this.MediaBrowserCompatItemReceiver;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.read;
        StringBuilder sb = new StringBuilder("RevisionSubjectUCModel(subjectName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", totalVideoCount=");
        sb.append(i);
        sb.append(", completedVideoCount=");
        sb.append(i2);
        sb.append(", completedARQBankCount=");
        sb.append(i3);
        sb.append(", totalARQBankCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
