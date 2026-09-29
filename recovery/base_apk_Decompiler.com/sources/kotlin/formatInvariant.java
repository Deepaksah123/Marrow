package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class formatInvariant {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final long read;
    private final long write;

    public formatInvariant(String str, String str2, long j, long j2, long j3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = j;
        this.MediaBrowserCompatItemReceiver = j2;
        this.write = j3;
        this.IconCompatParcelizer = z;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long read() {
        return this.write;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formatInvariant)) {
            return false;
        }
        formatInvariant formatinvariant = (formatInvariant) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) formatinvariant.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) formatinvariant.AudioAttributesCompatParcelizer) && this.read == formatinvariant.read && this.MediaBrowserCompatItemReceiver == formatinvariant.MediaBrowserCompatItemReceiver && this.write == formatinvariant.write && this.IconCompatParcelizer == formatinvariant.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.read)) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Long.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        long j = this.read;
        long j2 = this.MediaBrowserCompatItemReceiver;
        long j3 = this.write;
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqTimerAnalyticsUcModel(parentId=");
        sb.append(str);
        sb.append(", mcqId=");
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
