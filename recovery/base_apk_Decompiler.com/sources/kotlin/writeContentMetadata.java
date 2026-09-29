package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class writeContentMetadata {
    private final boolean AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final long write;

    public writeContentMetadata(String str, String str2, long j, long j2, long j3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = j;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        this.write = j3;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeContentMetadata)) {
            return false;
        }
        writeContentMetadata writecontentmetadata = (writeContentMetadata) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writecontentmetadata.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writecontentmetadata.read) && this.RemoteActionCompatParcelizer == writecontentmetadata.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == writecontentmetadata.MediaBrowserCompatCustomActionResultReceiver && this.write == writecontentmetadata.write && this.AudioAttributesCompatParcelizer == writecontentmetadata.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.MediaBrowserCompatCustomActionResultReceiver;
        long j3 = this.write;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqTimerAnalyticsRepoModel(mcqId=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", firstAttemptTimeMs=");
        sb.append(j);
        sb.append(", reviewTimeMs=");
        sb.append(j2);
        sb.append(", changeTimeMs=");
        sb.append(j3);
        sb.append(", hasAnswered=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
