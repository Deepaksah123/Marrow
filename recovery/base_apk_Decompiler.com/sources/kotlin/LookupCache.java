package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class LookupCache implements contents {
    private final long AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final long[] MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final long write;

    public static LookupCache read(LRUMap lRUMap, long j) {
        long jRemoteActionCompatParcelizer = lRUMap.RemoteActionCompatParcelizer();
        if (jRemoteActionCompatParcelizer == C.TIME_UNSET) {
            return null;
        }
        if (lRUMap.read == -1 || lRUMap.MediaBrowserCompatItemReceiver == null) {
            return new LookupCache(j, lRUMap.IconCompatParcelizer.read, jRemoteActionCompatParcelizer, lRUMap.IconCompatParcelizer.AudioAttributesCompatParcelizer);
        }
        return new LookupCache(j, lRUMap.IconCompatParcelizer.read, jRemoteActionCompatParcelizer, lRUMap.IconCompatParcelizer.AudioAttributesCompatParcelizer, lRUMap.read, lRUMap.MediaBrowserCompatItemReceiver);
    }

    private LookupCache(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    private LookupCache(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.read = j2;
        this.IconCompatParcelizer = i2;
        this.write = j3;
        this.MediaBrowserCompatItemReceiver = jArr;
        this.AudioAttributesCompatParcelizer = j3 != -1 ? j + j3 : -1L;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver != null;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        if (!IconCompatParcelizer()) {
            return new isCollectionMapOrArray.read(new isLocalType(0L, this.RemoteActionCompatParcelizer + ((long) this.AudioAttributesImplApi26Parcelizer)));
        }
        long j2 = LaissezFaireSubTypeValidator.read(j, 0L, this.read);
        double d = (j2 * 100.0d) / this.read;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver))[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new isCollectionMapOrArray.read(new isLocalType(j2, this.RemoteActionCompatParcelizer + LaissezFaireSubTypeValidator.read(Math.round((d2 / 256.0d) * this.write), this.AudioAttributesImplApi26Parcelizer, this.write - 1)));
    }

    @Override // kotlin.contents
    public final long RemoteActionCompatParcelizer(long j) {
        long j2 = j - this.RemoteActionCompatParcelizer;
        if (!IconCompatParcelizer() || j2 <= this.AudioAttributesImplApi26Parcelizer) {
            return 0L;
        }
        long[] jArr = (long[]) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        double d = (j2 * 256.0d) / this.write;
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(jArr, (long) d, true);
        long jIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
        long j3 = jArr[iRemoteActionCompatParcelizer];
        int i = iRemoteActionCompatParcelizer + 1;
        long jIconCompatParcelizer2 = IconCompatParcelizer(i);
        return jIconCompatParcelizer + Math.round((j3 == (iRemoteActionCompatParcelizer == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jIconCompatParcelizer2 - jIconCompatParcelizer));
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.read;
    }

    @Override // kotlin.contents
    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.contents
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private long IconCompatParcelizer(int i) {
        return (this.read * ((long) i)) / 100;
    }
}
