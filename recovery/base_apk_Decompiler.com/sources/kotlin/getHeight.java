package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u001c\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\"\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0018\u0010!"}, d2 = {"Lo/getHeight;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDIJ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "read", "D", "()D", "I", "J", "()J", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getHeight {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final double write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final double AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public getHeight(String str, String str2, double d, double d2, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = d;
        this.write = d2;
        this.read = i;
        this.AudioAttributesImplBaseParcelizer = j;
    }

    public /* synthetic */ getHeight(String str, String str2, double d, double d2, int i, long j, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final double getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final double getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public getHeight() {
        this(null, null, 0.0d, 0.0d, 0, 0L, 63, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getHeight)) {
            return false;
        }
        getHeight getheight = (getHeight) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getheight.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getheight.RemoteActionCompatParcelizer) && Double.compare(this.AudioAttributesCompatParcelizer, getheight.AudioAttributesCompatParcelizer) == 0 && Double.compare(this.write, getheight.write) == 0 && this.read == getheight.read && this.AudioAttributesImplBaseParcelizer == getheight.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Double.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Double.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Long.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        double d = this.AudioAttributesCompatParcelizer;
        double d2 = this.write;
        int i = this.read;
        long j = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("getHeight(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(d);
        sb.append(", write=");
        sb.append(d2);
        sb.append(", read=");
        sb.append(i);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
