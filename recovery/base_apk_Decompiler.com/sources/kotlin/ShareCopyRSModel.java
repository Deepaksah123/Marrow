package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareCopyRSModel {
    static {
        try {
        } catch (Exception unused) {
        }
    }

    private static char[] IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        return new String(IconCompatParcelizer(bArr));
    }

    public static String read(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iIconCompatParcelizer = CustomModuleLSModel.IconCompatParcelizer(bArr, cArr);
        if (iIconCompatParcelizer >= 0) {
            return new String(cArr, 0, iIconCompatParcelizer);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static byte[] read(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
