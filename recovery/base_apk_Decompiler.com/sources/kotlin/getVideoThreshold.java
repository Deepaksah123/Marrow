package kotlin;

import android.util.Base64;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoThreshold {
    private static String AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArr3), CharsetNames.US_ASCII);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] read(String str) {
        return Base64.decode(str, 0);
    }

    private static byte[] IconCompatParcelizer(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 16, bArr2, 0, 16);
        return bArr2;
    }

    private static int write(byte[] bArr) {
        try {
            return Integer.parseInt(String.valueOf(new String(bArr, CharsetNames.US_ASCII).charAt(32)));
        } catch (Exception unused) {
            return -1;
        }
    }

    private static byte[] read(byte[] bArr, String str, int i) {
        try {
            byte[] bytes = str.getBytes(CharsetNames.US_ASCII);
            byte[] bArrDigest = new byte[bArr.length + bytes.length];
            System.arraycopy(bArr, 0, bArrDigest, 0, bArr.length);
            System.arraycopy(bytes, 0, bArrDigest, bArr.length, bytes.length);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i2 = 0; i2 < i; i2++) {
                bArrDigest = messageDigest.digest(bArrDigest);
            }
            return bArrDigest;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] read(byte[] bArr) {
        int i = 33;
        byte[] bArr2 = new byte[bArr.length - 33];
        int i2 = 0;
        while (i < bArr.length) {
            bArr2[i2] = bArr[i];
            i++;
            i2++;
        }
        return bArr2;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        try {
            byte[] bArr = read(str2);
            byte[] bArrIconCompatParcelizer = IconCompatParcelizer(bArr);
            byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr);
            int iWrite = write(bArr);
            return AudioAttributesCompatParcelizer(read(bArrIconCompatParcelizer, str, iWrite), bArrRemoteActionCompatParcelizer, read(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
