package kotlin;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getShortDescription {
    private static final getLongDescription IconCompatParcelizer = new getLongDescription();

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        return write(bArr, bArr.length);
    }

    private static byte[] write(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("exception encoding Hex string: ");
            sb.append(e.getMessage());
            throw new getParams(sb.toString(), e);
        }
    }
}
