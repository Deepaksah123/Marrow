package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class NameTransformer3 {

    public static final class read {
        public final int[] AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;
        public final long[] MediaBrowserCompatItemReceiver;
        public final long[] RemoteActionCompatParcelizer;
        public final int read;
        public final int[] write;

        /* synthetic */ read(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, byte b) {
            this(jArr, iArr, i, jArr2, iArr2, j);
        }

        private read(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.RemoteActionCompatParcelizer = jArr;
            this.AudioAttributesCompatParcelizer = iArr;
            this.read = i;
            this.MediaBrowserCompatItemReceiver = jArr2;
            this.write = iArr2;
            this.IconCompatParcelizer = j;
        }
    }

    public static read write(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 : iArr) {
            iRemoteActionCompatParcelizer += LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i3, i2);
        }
        long[] jArr2 = new long[iRemoteActionCompatParcelizer];
        int[] iArr2 = new int[iRemoteActionCompatParcelizer];
        long[] jArr3 = new long[iRemoteActionCompatParcelizer];
        int[] iArr3 = new int[iRemoteActionCompatParcelizer];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new read(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4), (byte) 0);
    }
}
