package kotlin;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    public static int AudioAttributesCompatParcelizer(byte[] bArr) {
        return IconCompatParcelizer(bArr, bArr.length);
    }

    private static int IconCompatParcelizer(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter 'byteArray' cannot be null");
        }
        if (i > 0 && i <= 4) {
            if (bArr.length < i) {
                throw new IllegalArgumentException("Length or startPos not valid");
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += (bArr[i3] & 255) << (((i - i3) - 1) << 3);
            }
            return i2;
        }
        throw new IllegalArgumentException("Length must be between 1 and 4. Length = ".concat(String.valueOf(i)));
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        return read(bArr, "%02x ");
    }

    private static String read(byte[] bArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr != null) {
            for (byte b : bArr) {
                stringBuffer.append(String.format(str, Integer.valueOf(b & 255)));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.getDefault()).trim();
    }

    public static byte[] write(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument can't be null");
        }
        String strReplace = str.replace(" ", "");
        if (strReplace.length() % 2 != 0) {
            throw new IllegalArgumentException("Hex binary needs to be even-length :".concat(String.valueOf(str)));
        }
        byte[] bArr = new byte[Math.round(strReplace.length() / 2.0f)];
        int i = 0;
        int i2 = 0;
        while (i < strReplace.length()) {
            int i3 = i + 2;
            bArr[i2] = Integer.valueOf(Integer.parseInt(strReplace.substring(i, i3), 16)).byteValue();
            i2++;
            i = i3;
        }
        return bArr;
    }

    public static boolean IconCompatParcelizer(int i, int i2) {
        if (i2 < 0 || i2 > 31) {
            throw new IllegalArgumentException("parameter 'pBitIndex' must be between 0 and 31. pBitIndex=".concat(String.valueOf(i2)));
        }
        return (i & (1 << i2)) != 0;
    }

    public static byte RemoteActionCompatParcelizer(byte b, int i, boolean z) {
        if (i < 0 || i > 7) {
            throw new IllegalArgumentException("parameter 'pBitIndex' must be between 0 and 7. pBitIndex=".concat(String.valueOf(i)));
        }
        return (byte) (b | (1 << i));
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        if (bArr == null) {
            return "!!!EMPTY BYTES!!!";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }
}
