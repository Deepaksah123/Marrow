package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00032\n\u0010\u0001\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a/\u0010\n\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\t\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f*\n\u0010\u0010\"\u00020\u00062\u00020\u0006*\n\u0010\u0011\"\u00020\u00022\u00020\u0002"}, d2 = {"", "p0", "", "Lo/SnapshotIdArray;", "write", "(I)[J", "", "Lo/SnapshotId;", "([JJ)I", "p1", "IconCompatParcelizer", "([JIJ)[J", "AudioAttributesCompatParcelizer", "([JI)[J", "RemoteActionCompatParcelizer", "(I)J", "SnapshotId", "SnapshotIdArray"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toDecimal {
    public static final long RemoteActionCompatParcelizer(int i) {
        return i;
    }

    public static final long[] write(int i) {
        return new long[i];
    }

    public static final int write(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long[] IconCompatParcelizer(long[] jArr, int i, long j) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr2, 0, 0, i);
        getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr2, i + 1, i, length);
        jArr2[i] = j;
        return jArr2;
    }

    public static final long[] AudioAttributesCompatParcelizer(long[] jArr, int i) {
        int length = jArr.length;
        int i2 = length - 1;
        if (i2 == 0) {
            return null;
        }
        long[] jArr2 = new long[i2];
        if (i > 0) {
            getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr2, 0, 0, i);
        }
        if (i < i2) {
            getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr2, i, i + 1, length);
        }
        return jArr2;
    }
}
