package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecsOfType {
    private final String AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final long read;
    private final String write;

    public getCodecsOfType(String str, String str2, long j, long j2, int i, int i2, long j3, long j4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.MediaBrowserCompatItemReceiver = j;
        this.IconCompatParcelizer = j2;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = j3;
        this.read = j4;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCodecsOfType)) {
            return false;
        }
        getCodecsOfType getcodecsoftype = (getCodecsOfType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getcodecsoftype.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getcodecsoftype.AudioAttributesCompatParcelizer) && this.MediaBrowserCompatItemReceiver == getcodecsoftype.MediaBrowserCompatItemReceiver && this.IconCompatParcelizer == getcodecsoftype.IconCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == getcodecsoftype.AudioAttributesImplApi26Parcelizer && this.RemoteActionCompatParcelizer == getcodecsoftype.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer == getcodecsoftype.AudioAttributesImplBaseParcelizer && this.read == getcodecsoftype.read;
    }

    public final int hashCode() {
        return (((((((((((((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Long.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        long j = this.MediaBrowserCompatItemReceiver;
        long j2 = this.IconCompatParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        long j3 = this.AudioAttributesImplBaseParcelizer;
        long j4 = this.read;
        StringBuilder sb = new StringBuilder("TestGroupUCModel(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", sectionTimeInSec=");
        sb.append(j);
        sb.append(", cutOffTime=");
        sb.append(j2);
        sb.append(", startIndex=");
        sb.append(i);
        sb.append(", endIndex=");
        sb.append(i2);
        sb.append(", startTime=");
        sb.append(j3);
        sb.append(", endTime=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }
}
