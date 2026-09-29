package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public class backticked implements isCollectionMapOrArray {
    private final long AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final long write;

    public backticked(long j, long j2, int i, int i2, boolean z) {
        this.MediaBrowserCompatItemReceiver = j;
        this.RemoteActionCompatParcelizer = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = i2 == -1 ? 1 : i2;
        this.read = i;
        this.IconCompatParcelizer = z;
        if (j == -1) {
            this.write = -1L;
            this.AudioAttributesCompatParcelizer = C.TIME_UNSET;
        } else {
            this.write = j - j2;
            this.AudioAttributesCompatParcelizer = IconCompatParcelizer(j, j2, i);
        }
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return this.write != -1 || this.IconCompatParcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        if (this.write == -1 && !this.IconCompatParcelizer) {
            return new isCollectionMapOrArray.read(new isLocalType(0L, this.RemoteActionCompatParcelizer));
        }
        long j2 = read(j);
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j2);
        isLocalType islocaltype = new isLocalType(jAudioAttributesCompatParcelizer, j2);
        if (this.write != -1 && jAudioAttributesCompatParcelizer < j) {
            long j3 = ((long) this.MediaBrowserCompatCustomActionResultReceiver) + j2;
            if (j3 < this.MediaBrowserCompatItemReceiver) {
                return new isCollectionMapOrArray.read(islocaltype, new isLocalType(AudioAttributesCompatParcelizer(j3), j3));
            }
        }
        return new isCollectionMapOrArray.read(islocaltype);
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long AudioAttributesCompatParcelizer(long j) {
        return IconCompatParcelizer(j, this.RemoteActionCompatParcelizer, this.read);
    }

    private static long IconCompatParcelizer(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    private long read(long j) {
        long j2 = (j * ((long) this.read)) / 8000000;
        long j3 = this.MediaBrowserCompatCustomActionResultReceiver;
        long jMin = (j2 / j3) * j3;
        long j4 = this.write;
        if (j4 != -1) {
            jMin = Math.min(jMin, j4 - j3);
        }
        return this.RemoteActionCompatParcelizer + Math.max(jMin, 0L);
    }
}
