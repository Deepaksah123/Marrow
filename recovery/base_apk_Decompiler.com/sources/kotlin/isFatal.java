package kotlin;

import android.util.Pair;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.C;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class isFatal implements contents {
    private final long IconCompatParcelizer;
    private final long[] RemoteActionCompatParcelizer;
    private final long[] write;

    @Override // kotlin.contents
    public final long AudioAttributesCompatParcelizer() {
        return -1L;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin.contents
    public final int RemoteActionCompatParcelizer() {
        return C.RATE_UNSET_INT;
    }

    public static isFatal IconCompatParcelizer(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.read.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.IconCompatParcelizer + mlltFrame.read[i3]);
            j3 += (long) (mlltFrame.write + mlltFrame.AudioAttributesCompatParcelizer[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new isFatal(jArr, jArr2, j2);
    }

    private isFatal(long[] jArr, long[] jArr2, long j) {
        this.RemoteActionCompatParcelizer = jArr;
        this.write = jArr2;
        this.IconCompatParcelizer = j == C.TIME_UNSET ? LaissezFaireSubTypeValidator.IconCompatParcelizer(jArr2[jArr2.length - 1]) : j;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        Pair<Long, Long> pairAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.read(j, 0L, this.IconCompatParcelizer)), this.write, this.RemoteActionCompatParcelizer);
        return new isCollectionMapOrArray.read(new isLocalType(LaissezFaireSubTypeValidator.IconCompatParcelizer(((Long) pairAudioAttributesCompatParcelizer.first).longValue()), ((Long) pairAudioAttributesCompatParcelizer.second).longValue()));
    }

    @Override // kotlin.contents
    public final long RemoteActionCompatParcelizer(long j) {
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(((Long) AudioAttributesCompatParcelizer(j, this.RemoteActionCompatParcelizer, this.write).second).longValue());
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.IconCompatParcelizer;
    }

    private static Pair<Long, Long> AudioAttributesCompatParcelizer(long j, long[] jArr, long[] jArr2) {
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(jArr, j, true);
        long j2 = jArr[iRemoteActionCompatParcelizer];
        long j3 = jArr2[iRemoteActionCompatParcelizer];
        int i = iRemoteActionCompatParcelizer + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
