package kotlin;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
public final class addSegmentTimelineElementsToList {
    private static SecureRandom write = new SecureRandom();

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    private static byte[] RemoteActionCompatParcelizer() {
        byte[] bArr = new byte[16];
        write.nextBytes(bArr);
        return bArr;
    }

    private static byte[] read() {
        byte[] bArr = new byte[16];
        write.nextBytes(bArr);
        return bArr;
    }

    private static int write() {
        return write.nextInt(5) + 1;
    }

    private static byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2, int i) {
        try {
            byte[] bArrDigest = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArrDigest, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArrDigest, bArr.length, bArr2.length);
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

    private static byte[] write(byte[] bArr, String str, int i) {
        try {
            return IconCompatParcelizer(bArr, str.getBytes(CharsetNames.US_ASCII), i);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String AudioAttributesCompatParcelizer(String str, String str2) {
        try {
            byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            byte[] bArr = read();
            int iWrite = write();
            byte[] bArrRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(write(bArrRemoteActionCompatParcelizer, str, iWrite), bArr, str2.getBytes(CharsetNames.US_ASCII));
            byte[] bArr2 = new byte[bArrRemoteActionCompatParcelizer2.length + 33];
            System.arraycopy(bArrRemoteActionCompatParcelizer, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 0, bArr2, 16, 16);
            bArr2[32] = (byte) String.valueOf(iWrite).charAt(0);
            System.arraycopy(bArrRemoteActionCompatParcelizer2, 0, bArr2, 33, bArrRemoteActionCompatParcelizer2.length);
            return IconCompatParcelizer(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
