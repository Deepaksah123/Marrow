package kotlin;

import android.util.Base64;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthBridgeOtpVerifyRequestBody {
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

    private static byte[] write(String str) {
        return Base64.decode(str, 0);
    }

    private static byte[] write(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 12, bArr2, 0, 16);
        return bArr2;
    }

    private static byte[] read(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 49, bArr2, 0, 16);
        return bArr2;
    }

    private static int AudioAttributesCompatParcelizer(byte[] bArr) {
        try {
            return Integer.parseInt(String.valueOf(new String(bArr, CharsetNames.US_ASCII).charAt(77)));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static byte[] IconCompatParcelizer(byte[] bArr, String str, int i) {
        try {
            byte[] bytes = str.getBytes(CharsetNames.US_ASCII);
            byte[] bArrDigest = new byte[bArr.length + bytes.length];
            System.arraycopy(bytes, 0, bArrDigest, 0, bytes.length);
            System.arraycopy(bArr, 0, bArrDigest, bytes.length, bArr.length);
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

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        int i = 90;
        byte[] bArr2 = new byte[bArr.length - 90];
        int i2 = 0;
        while (i < bArr.length) {
            bArr2[i2] = bArr[i];
            i++;
            i2++;
        }
        return bArr2;
    }

    public static String AudioAttributesCompatParcelizer(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty()) {
            return null;
        }
        try {
            String strEncodeToString = Base64.encodeToString(str.getBytes(CharsetNames.US_ASCII), 2);
            byte[] bArrWrite = write(str2);
            byte[] bArrWrite2 = write(bArrWrite);
            byte[] bArr = read(bArrWrite);
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArrWrite);
            return AudioAttributesCompatParcelizer(IconCompatParcelizer(bArrWrite2, strEncodeToString, iAudioAttributesCompatParcelizer), bArr, RemoteActionCompatParcelizer(bArrWrite));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
