package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class setFormatMetadata {
    public static int AudioAttributesCompatParcelizer(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int write(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static long read(long... jArr) {
        int length = jArr.length;
        parseStsd.RemoteActionCompatParcelizer(true);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    static final class AudioAttributesCompatParcelizer {
        private static final byte[] AudioAttributesCompatParcelizer;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            AudioAttributesCompatParcelizer = bArr;
        }

        static int RemoteActionCompatParcelizer(char c) {
            if (c < 128) {
                return AudioAttributesCompatParcelizer[c];
            }
            return -1;
        }
    }

    public static Long AudioAttributesCompatParcelizer(String str, int i) {
        if (((String) parseStsd.IconCompatParcelizer(str)).isEmpty()) {
            return null;
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int iRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str.charAt(i2));
        if (iRemoteActionCompatParcelizer < 0 || iRemoteActionCompatParcelizer >= 10) {
            return null;
        }
        long j = -iRemoteActionCompatParcelizer;
        long j2 = Long.MIN_VALUE / 10;
        for (int i3 = i2 + 1; i3 < str.length(); i3++) {
            int iRemoteActionCompatParcelizer2 = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str.charAt(i3));
            if (iRemoteActionCompatParcelizer2 < 0 || iRemoteActionCompatParcelizer2 >= 10 || j < -922337203685477580L) {
                return null;
            }
            long j3 = j * 10;
            long j4 = iRemoteActionCompatParcelizer2;
            if (j3 < j4 - Long.MIN_VALUE) {
                return null;
            }
            j = j3 - j4;
        }
        if (i2 != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
