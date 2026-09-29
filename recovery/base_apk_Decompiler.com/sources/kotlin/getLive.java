package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getLive {
    private static final char[] RemoteActionCompatParcelizer = new char[64];
    private static final byte[] read;

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            RemoteActionCompatParcelizer[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            RemoteActionCompatParcelizer[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            RemoteActionCompatParcelizer[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = RemoteActionCompatParcelizer;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        read = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = read;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            read[RemoteActionCompatParcelizer[i3]] = (byte) i3;
        }
    }

    public static String IconCompatParcelizer(String str) {
        return new String(read(str.getBytes()));
    }

    private static char[] read(byte[] bArr) {
        return AudioAttributesCompatParcelizer(bArr, bArr.length);
    }

    private static char[] AudioAttributesCompatParcelizer(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = ((i << 2) + 2) / 3;
        char[] cArr = new char[((i + 2) / 3) << 2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = i5 + 1;
            byte b = bArr[i5];
            if (i7 < i) {
                int i8 = bArr[i7] & 255;
                i7 = i5 + 2;
                i2 = i8;
            } else {
                i2 = 0;
            }
            if (i7 < i) {
                i3 = bArr[i7] & 255;
                i7++;
            } else {
                i3 = 0;
            }
            char[] cArr2 = RemoteActionCompatParcelizer;
            cArr[i6] = cArr2[(b & 255) >>> 2];
            int i9 = i6 + 2;
            cArr[i6 + 1] = cArr2[((b & 3) << 4) | (i2 >>> 4)];
            char c = '=';
            cArr[i9] = i9 < i4 ? cArr2[((i2 & 15) << 2) | (i3 >>> 6)] : '=';
            int i10 = i6 + 3;
            if (i10 < i4) {
                c = cArr2[i3 & 63];
            }
            cArr[i10] = c;
            i6 += 4;
            i5 = i7;
        }
        return cArr;
    }
}
