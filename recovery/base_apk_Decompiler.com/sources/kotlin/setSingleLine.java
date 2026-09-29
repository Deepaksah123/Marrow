package kotlin;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\"\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001a\u0010\u001d\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001a\u0010\u001e"}, d2 = {"Lo/setSingleLine;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIIJJ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "J", "AudioAttributesImplBaseParcelizer", "()J", "AudioAttributesCompatParcelizer", "write", "I", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setSingleLine {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    public setSingleLine(String str, String str2, long j, long j2, int i, int i2, long j3, long j4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = j;
        this.write = j2;
        this.read = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.MediaBrowserCompatItemReceiver = j3;
        this.AudioAttributesImplBaseParcelizer = j4;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: o.setSingleLine$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setSingleLine$IconCompatParcelizer;", "", "<init>", "()V", "", "Lo/setSingleLine;", "p0", "write", "(Ljava/util/List;)Lo/setSingleLine;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setSingleLine write(List<setSingleLine> p0) {
            Object next;
            toMagicModuleMetaRepoModel.write(p0, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<T> it = p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                setSingleLine setsingleline = (setSingleLine) next;
                if (setsingleline.getMediaBrowserCompatItemReceiver() < jCurrentTimeMillis && setsingleline.getAudioAttributesImplBaseParcelizer() >= jCurrentTimeMillis) {
                    break;
                }
            }
            setSingleLine setsingleline2 = (setSingleLine) next;
            if (setsingleline2 != null) {
                return setsingleline2;
            }
            if (jCurrentTimeMillis < ((setSingleLine) IntermediateLoginResponseBody.RatingCompat((List) p0)).getMediaBrowserCompatItemReceiver()) {
                throw new IllegalStateException("Test cannot be started before the start time.");
            }
            return (setSingleLine) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setSingleLine)) {
            return false;
        }
        setSingleLine setsingleline = (setSingleLine) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setsingleline.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setsingleline.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == setsingleline.AudioAttributesCompatParcelizer && this.write == setsingleline.write && this.read == setsingleline.read && this.MediaBrowserCompatCustomActionResultReceiver == setsingleline.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == setsingleline.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == setsingleline.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Long.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        long j2 = this.write;
        int i = this.read;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        long j3 = this.MediaBrowserCompatItemReceiver;
        long j4 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("setSingleLine(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(j);
        sb.append(", write=");
        sb.append(j2);
        sb.append(", read=");
        sb.append(i);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(j3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }
}
