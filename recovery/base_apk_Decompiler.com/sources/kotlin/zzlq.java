package kotlin;

import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0018\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u0014R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010#\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b$\u0010'"}, d2 = {"Lo/zzlq;", "", "", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "", "p8", "<init>", "(IDDJIIIIZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "D", "write", "IconCompatParcelizer", "()D", "AudioAttributesImplApi21Parcelizer", "J", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzlq {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;
    private final double IconCompatParcelizer;
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final double write;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    public zzlq(int i, double d, double d2, long j, int i2, int i3, int i4, int i5, boolean z) {
        this.read = i;
        this.write = d;
        this.IconCompatParcelizer = d2;
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.AudioAttributesImplApi26Parcelizer = i4;
        this.MediaBrowserCompatItemReceiver = i5;
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public /* synthetic */ zzlq(int i, double d, double d2, long j, int i2, int i3, int i4, int i5, boolean z, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0.0d : d, (i6 & 4) == 0 ? d2 : 0.0d, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) == 0 ? z : false);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final double getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public zzlq() {
        this(0, 0.0d, 0.0d, 0L, 0, 0, 0, 0, false, UnixStat.DEFAULT_LINK_PERM, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zzlq)) {
            return false;
        }
        zzlq zzlqVar = (zzlq) p0;
        return this.read == zzlqVar.read && Double.compare(this.write, zzlqVar.write) == 0 && Double.compare(this.IconCompatParcelizer, zzlqVar.IconCompatParcelizer) == 0 && this.AudioAttributesCompatParcelizer == zzlqVar.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == zzlqVar.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == zzlqVar.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == zzlqVar.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatItemReceiver == zzlqVar.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == zzlqVar.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((Integer.hashCode(this.read) * 31) + Double.hashCode(this.write)) * 31) + Double.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        int i = this.read;
        double d = this.write;
        double d2 = this.IconCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = this.AudioAttributesImplApi26Parcelizer;
        int i5 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("zzlq(read=");
        sb.append(i);
        sb.append(", write=");
        sb.append(d);
        sb.append(", IconCompatParcelizer=");
        sb.append(d2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(j);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i3);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
