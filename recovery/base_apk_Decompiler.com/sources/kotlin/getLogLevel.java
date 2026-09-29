package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getLogLevel {
    private String AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final float write;

    public getLogLevel(String str, long j, long j2, long j3, float f, int i, String str2, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        this.IconCompatParcelizer = j3;
        this.write = f;
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
    }

    public final float read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLogLevel)) {
            return false;
        }
        getLogLevel getloglevel = (getLogLevel) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getloglevel.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == getloglevel.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getloglevel.MediaBrowserCompatCustomActionResultReceiver && this.IconCompatParcelizer == getloglevel.IconCompatParcelizer && Float.compare(this.write, getloglevel.write) == 0 && this.AudioAttributesImplBaseParcelizer == getloglevel.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getloglevel.AudioAttributesImplApi26Parcelizer) && this.RemoteActionCompatParcelizer == getloglevel.RemoteActionCompatParcelizer && this.read == getloglevel.read;
    }

    public final int hashCode() {
        return (((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + Long.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        long j = this.AudioAttributesImplApi21Parcelizer;
        long j2 = this.MediaBrowserCompatCustomActionResultReceiver;
        long j3 = this.IconCompatParcelizer;
        float f = this.write;
        int i = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        StringBuilder sb = new StringBuilder("VideoCacheInfoRepoModel(id=");
        sb.append(str);
        sb.append(", lastUpdatedTimeMs=");
        sb.append(j);
        sb.append(", lastQueuedTimeMs=");
        sb.append(j2);
        sb.append(", downloadStartedTimeMs=");
        sb.append(j3);
        sb.append(", downloadPercent=");
        sb.append(f);
        sb.append(", pixelRate=");
        sb.append(i);
        sb.append(", referenceId=");
        sb.append(str2);
        sb.append(", downloadStatus=");
        sb.append(i2);
        sb.append(", downloadVersion=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
