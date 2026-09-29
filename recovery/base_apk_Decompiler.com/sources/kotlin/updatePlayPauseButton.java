package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.exoplayer2.C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class updatePlayPauseButton {
    private static final char[] write = {'w', 'o', 'r', 'r', 'a', 'm', '.', 'm', 'o', 'c'};

    /* JADX INFO: loaded from: classes3.dex */
    static class RemoteActionCompatParcelizer extends RuntimeException {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class write extends RuntimeException {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class read extends RuntimeException {
        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }
    }

    private static void write(Context context) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        String packageName = context.getPackageName();
        int length = write.length;
        byte b = 0;
        if (length != packageName.length()) {
            throw new RemoteActionCompatParcelizer(b);
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < length) {
            if (write[i] != packageName.charAt(i2)) {
                throw new RemoteActionCompatParcelizer(b);
            }
            i2++;
            i--;
        }
        Signature[] apkContentsSigners = context.getPackageManager().getPackageInfo(packageName, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo.getApkContentsSigners();
        if (apkContentsSigners == null || apkContentsSigners.length == 0) {
            throw new read(b);
        }
        for (Signature signature : apkContentsSigners) {
            if (!"FFD2CABB99EC831F9D1C1DDCA45E936B7C5EEA2C".equals(AudioAttributesCompatParcelizer(signature.toByteArray()))) {
                throw new write(b);
            }
        }
    }

    private static String AudioAttributesCompatParcelizer(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        return write(messageDigest.digest());
    }

    private static String write(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static void RemoteActionCompatParcelizer(Context context) {
        try {
            write(context);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Tamper faced exception", e2);
        }
    }
}
