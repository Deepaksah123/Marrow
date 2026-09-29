package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class toMediaItem {
    private static long AudioAttributesCompatParcelizer(long j, int i) {
        return ((j ^ (j >> 30)) * 1812433253) + ((long) i);
    }

    static long[] IconCompatParcelizer(int i, int i2) {
        long[] jArr = new long[4];
        long j = -1;
        long j2 = -1;
        jArr[0] = ((((long) i) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) << 32) | (((long) i2) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = IconCompatParcelizer(jArr[i3 - 1], i3);
        }
        return jArr;
    }

    private static long IconCompatParcelizer(long j, int i) {
        return AudioAttributesCompatParcelizer(j, i);
    }

    static void RemoteActionCompatParcelizer(long[] jArr, long[] jArr2, int i) {
        long j = jArr[i % 4] * 2147483085;
        long j2 = jArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j2) / 2147483647L;
        jArr[i2] = (j + j2) % 2147483647L;
    }
}
