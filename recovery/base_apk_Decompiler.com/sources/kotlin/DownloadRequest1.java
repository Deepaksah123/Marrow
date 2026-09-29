package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest1 {
    public static void RemoteActionCompatParcelizer(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AudioAttributesCompatParcelizer(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int i6 = i2 ^ read(i5, iArr2);
            i4++;
            i2 = i5;
            i = i6;
        }
        int i7 = i ^ iArr[iArr.length - 2];
        int i8 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            AudioAttributesCompatParcelizer(iArr);
        }
        iArr3[0] = i8;
        iArr3[1] = i7;
    }

    private static void AudioAttributesCompatParcelizer(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    private static int read(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
