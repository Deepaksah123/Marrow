package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSetExternalSyntheticLambda1 {
    private final float AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private String write;

    public ListenerSetExternalSyntheticLambda1(String str, long j, long j2, long j3, float f, int i, String str2, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.AudioAttributesImplApi21Parcelizer = j2;
        this.IconCompatParcelizer = j3;
        this.AudioAttributesCompatParcelizer = f;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.read = i2;
        this.RemoteActionCompatParcelizer = i3;
    }

    public final String write() {
        return this.write;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListenerSetExternalSyntheticLambda1)) {
            return false;
        }
        ListenerSetExternalSyntheticLambda1 listenerSetExternalSyntheticLambda1 = (ListenerSetExternalSyntheticLambda1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) listenerSetExternalSyntheticLambda1.write) && this.MediaBrowserCompatCustomActionResultReceiver == listenerSetExternalSyntheticLambda1.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi21Parcelizer == listenerSetExternalSyntheticLambda1.AudioAttributesImplApi21Parcelizer && this.IconCompatParcelizer == listenerSetExternalSyntheticLambda1.IconCompatParcelizer && Float.compare(this.AudioAttributesCompatParcelizer, listenerSetExternalSyntheticLambda1.AudioAttributesCompatParcelizer) == 0 && this.AudioAttributesImplApi26Parcelizer == listenerSetExternalSyntheticLambda1.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) listenerSetExternalSyntheticLambda1.AudioAttributesImplBaseParcelizer) && this.read == listenerSetExternalSyntheticLambda1.read && this.RemoteActionCompatParcelizer == listenerSetExternalSyntheticLambda1.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((this.write.hashCode() * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.write;
        long j = this.MediaBrowserCompatCustomActionResultReceiver;
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        long j3 = this.IconCompatParcelizer;
        float f = this.AudioAttributesCompatParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.read;
        int i3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoCacheInfoLSModel(id=");
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
