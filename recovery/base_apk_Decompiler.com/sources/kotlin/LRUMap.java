package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.getTypeDescription;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
final class LRUMap {
    public final int AudioAttributesCompatParcelizer;
    public final getTypeDescription.RemoteActionCompatParcelizer IconCompatParcelizer;
    public final long[] MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    private LRUMap(getTypeDescription.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, long j2, long[] jArr, int i, int i2) {
        this.IconCompatParcelizer = new getTypeDescription.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        this.write = j;
        this.read = j2;
        this.MediaBrowserCompatItemReceiver = jArr;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
    }

    public static LRUMap IconCompatParcelizer(getTypeDescription.RemoteActionCompatParcelizer remoteActionCompatParcelizer, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long[] jArr;
        int i;
        int i2;
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iOnPrepareFromSearch = (iMediaBrowserCompatItemReceiver & 1) != 0 ? asPropertyTypeDeserializer.onPrepareFromSearch() : -1;
        long jOnMediaButtonEvent = (iMediaBrowserCompatItemReceiver & 2) != 0 ? asPropertyTypeDeserializer.onMediaButtonEvent() : -1L;
        if ((iMediaBrowserCompatItemReceiver & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = asPropertyTypeDeserializer.onPlayFromMediaId();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iMediaBrowserCompatItemReceiver & 8) != 0) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        }
        if (asPropertyTypeDeserializer.IconCompatParcelizer() >= 24) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(21);
            int iOnPause = asPropertyTypeDeserializer.onPause();
            i = (iOnPause & 16773120) >> 12;
            i2 = iOnPause & UnixStat.PERM_MASK;
        } else {
            i = -1;
            i2 = -1;
        }
        return new LRUMap(remoteActionCompatParcelizer, iOnPrepareFromSearch, jOnMediaButtonEvent, jArr, i, i2);
    }

    public final long RemoteActionCompatParcelizer() {
        long j = this.write;
        return (j == -1 || j == 0) ? C.TIME_UNSET : LaissezFaireSubTypeValidator.IconCompatParcelizer((j * ((long) this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer)) - 1, this.IconCompatParcelizer.write);
    }
}
