package kotlin;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
public final class filterRedundantIncompleteSchemeDatas {
    private static String RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    private static byte[] write(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr3);
    }

    private static byte[] AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] RemoteActionCompatParcelizer(String str) {
        return Base64.decode(str, 0);
    }

    private static byte[] IconCompatParcelizer(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 12, bArr2, 0, 16);
        return bArr2;
    }

    private static byte[] AudioAttributesCompatParcelizer(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 49, bArr2, 0, 16);
        return bArr2;
    }

    private static int RemoteActionCompatParcelizer(byte[] bArr) {
        try {
            return Integer.parseInt(String.valueOf(new String(bArr, CharsetNames.US_ASCII).charAt(77)));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static byte[] write(byte[] bArr, String str, int i) {
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

    private static byte[] write(byte[] bArr) {
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

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str) || parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str2)) {
            return null;
        }
        try {
            String strEncodeToString = Base64.encodeToString(str.getBytes(CharsetNames.US_ASCII), 2);
            byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
            byte[] bArrIconCompatParcelizer = IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
            byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
            return RemoteActionCompatParcelizer(write(bArrIconCompatParcelizer, strEncodeToString, iRemoteActionCompatParcelizer), bArrAudioAttributesCompatParcelizer, write(bArrRemoteActionCompatParcelizer));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] AudioAttributesCompatParcelizer(String str, String str2) {
        try {
            String strEncodeToString = Base64.encodeToString(str.getBytes(CharsetNames.US_ASCII), 2);
            byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
            byte[] bArrIconCompatParcelizer = IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
            byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
            return AudioAttributesCompatParcelizer(write(bArrIconCompatParcelizer, strEncodeToString, iRemoteActionCompatParcelizer), bArrAudioAttributesCompatParcelizer, write(bArrRemoteActionCompatParcelizer));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] write(String str, String str2) throws Exception {
        String strEncodeToString = Base64.encodeToString(str.getBytes(CharsetNames.US_ASCII), 2);
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        byte[] bArrIconCompatParcelizer = IconCompatParcelizer(bArrRemoteActionCompatParcelizer);
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
        return write(write(bArrIconCompatParcelizer, strEncodeToString, iRemoteActionCompatParcelizer), bArrAudioAttributesCompatParcelizer, write(bArrRemoteActionCompatParcelizer));
    }
}
