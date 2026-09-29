package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0015\u0010!"}, d2 = {"Lo/getBytesFromHexString;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDIJ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "D", "write", "()D", "I", "J", "()J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getBytesFromHexString {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final double write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final double AudioAttributesCompatParcelizer;

    public getBytesFromHexString(String str, String str2, double d, double d2, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = d;
        this.AudioAttributesCompatParcelizer = d2;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    public /* synthetic */ getBytesFromHexString(String str, String str2, double d, double d2, int i, long j, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final double getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final double getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public getBytesFromHexString() {
        this(null, null, 0.0d, 0.0d, 0, 0L, 63, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getBytesFromHexString)) {
            return false;
        }
        getBytesFromHexString getbytesfromhexstring = (getBytesFromHexString) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getbytesfromhexstring.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getbytesfromhexstring.read) && Double.compare(this.write, getbytesfromhexstring.write) == 0 && Double.compare(this.AudioAttributesCompatParcelizer, getbytesfromhexstring.AudioAttributesCompatParcelizer) == 0 && this.IconCompatParcelizer == getbytesfromhexstring.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getbytesfromhexstring.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Double.hashCode(this.write)) * 31) + Double.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        double d = this.write;
        double d2 = this.AudioAttributesCompatParcelizer;
        int i = this.IconCompatParcelizer;
        long j = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("getBytesFromHexString(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(d);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(d2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
