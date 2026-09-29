package kotlin;

import kotlin.getTypeDescription;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class IgnorePropertiesUtilChecker implements contents {
    private final long[] AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final long[] write;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public static IgnorePropertiesUtilChecker AudioAttributesCompatParcelizer(long j, long j2, getTypeDescription.RemoteActionCompatParcelizer remoteActionCompatParcelizer, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPlayFromMediaId;
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(10);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver <= 0) {
            return null;
        }
        int i = remoteActionCompatParcelizer.write;
        long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
        int iOnPrepare3 = asPropertyTypeDeserializer.onPrepare();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        long j3 = j2 + ((long) remoteActionCompatParcelizer.read);
        long[] jArr = new long[iOnPrepare];
        long[] jArr2 = new long[iOnPrepare];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iOnPrepare) {
            int i3 = iOnPrepare2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jAudioAttributesCompatParcelizer) / ((long) iOnPrepare);
            jArr2[i2] = Math.max(j4, j5);
            if (iOnPrepare3 == 1) {
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            } else if (iOnPrepare3 == 2) {
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPrepare();
            } else if (iOnPrepare3 == 3) {
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPause();
            } else {
                if (iOnPrepare3 != 4) {
                    return null;
                }
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPrepareFromSearch();
            }
            j4 += ((long) iOnPlayFromMediaId) * ((long) i3);
            i2++;
            iOnPrepare = iOnPrepare;
            iOnPrepare2 = i3;
            j3 = j5;
        }
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
            prune.RemoteActionCompatParcelizer("VbriSeeker", sb.toString());
        }
        return new IgnorePropertiesUtilChecker(jArr, jArr2, jAudioAttributesCompatParcelizer, j4, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    private IgnorePropertiesUtilChecker(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.AudioAttributesCompatParcelizer = jArr;
        this.write = jArr2;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = i;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, j, true);
        isLocalType islocaltype = new isLocalType(this.AudioAttributesCompatParcelizer[iRemoteActionCompatParcelizer], this.write[iRemoteActionCompatParcelizer]);
        if (islocaltype.IconCompatParcelizer < j) {
            long[] jArr = this.AudioAttributesCompatParcelizer;
            if (iRemoteActionCompatParcelizer != jArr.length - 1) {
                int i = iRemoteActionCompatParcelizer + 1;
                return new isCollectionMapOrArray.read(islocaltype, new isLocalType(jArr[i], this.write[i]));
            }
        }
        return new isCollectionMapOrArray.read(islocaltype);
    }

    @Override // kotlin.contents
    public final long RemoteActionCompatParcelizer(long j) {
        return this.AudioAttributesCompatParcelizer[LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.write, j, true)];
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.contents
    public final long AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.contents
    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }
}
