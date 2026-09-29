package in.juspay.hypersdk.security;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.Constants;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public class EncryptionHelper {
    public static final String ENCRYPTED_VERSION = "v1";
    private static final String LOG_TAG = "EncryptionHelper";
    private static final String algorithm = "AES";
    private static final byte[] logsEntryRequirement = {-52, TarConstants.LF_CHR, -68, -121, -44, -114, -59, -20, -79, 22, 34, -77, -48, -75, 45, 93};

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] decryptThenGunzip(byte[] bArr, String str) {
        try {
            return gunzipContent(v1Decrypt(bArr));
        } catch (Exception e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception in decrypting", e);
            throw new RuntimeException(e);
        }
    }

    private static Key generateKey() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(logsEntryRequirement);
            try {
                int iAvailable = byteArrayInputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i = 0;
                do {
                    i += byteArrayInputStream.read(bArr);
                } while (i < iAvailable);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, algorithm);
                byteArrayInputStream.close();
                return secretKeySpec;
            } finally {
            }
        } catch (IOException e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, PaymentConstants.Category.SDK, LogSubCategory.Action.SYSTEM, "generate_key", null, e);
            return null;
        }
    }

    private static KeyStore getAndroidKeyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(Constants.ANDROID_KEYSTORE);
        keyStore.load(null);
        return keyStore;
    }

    public static KeyPair getKeyPair(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore androidKeyStore = getAndroidKeyStore();
        return new KeyPair(androidKeyStore.getCertificate(str).getPublicKey(), (PrivateKey) androidKeyStore.getKey(str, null));
    }

    public static String getSHA256Hash(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            String strBytesToHexString = bytesToHexString(messageDigest.digest());
            String str2 = LOG_TAG;
            StringBuilder sb = new StringBuilder("result is ");
            sb.append(strBytesToHexString);
            JuspayLogger.d(str2, sb.toString());
            return strBytesToHexString;
        } catch (NoSuchAlgorithmException e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception caught trying to SHA-256 hash", e);
            return null;
        }
    }

    public static byte[] gunzipContent(byte[] bArr) {
        byte[] bArr2 = new byte[1024];
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                    while (true) {
                        try {
                            int i = gZIPInputStream.read(bArr2);
                            if (i == -1) {
                                gZIPInputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                byteArrayInputStream.close();
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Error while gunzipping", e);
            throw new RuntimeException(e);
        }
    }

    public static byte[] gzipThenEncrypt(byte[] bArr, RSAPublicKey rSAPublicKey) {
        try {
            String strConstructPayload = JOSEUtils.constructPayload(JOSEUtils.jweEncrypt(Utils.gzipContent(bArr), "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}", rSAPublicKey));
            if (strConstructPayload != null) {
                return strConstructPayload.getBytes(StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception while GZipping and encrypting", e);
            return null;
        }
    }

    public static byte[] gzipThenEncryptExp(byte[] bArr, RSAPublicKey rSAPublicKey, Map<String, String> map) {
        try {
            HashMap<String, Object> mapJweEncrypt = JOSEUtils.jweEncrypt(Utils.gzipContent(bArr), "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}", rSAPublicKey);
            if (mapJweEncrypt.containsKey("headers") && mapJweEncrypt.containsKey("encryptedKey") && mapJweEncrypt.containsKey("iv") && mapJweEncrypt.containsKey("cipherText") && mapJweEncrypt.containsKey("authTag")) {
                String str = (String) mapJweEncrypt.get("headers");
                String str2 = (String) mapJweEncrypt.get("encryptedKey");
                String str3 = (String) mapJweEncrypt.get("iv");
                byte[] bArr2 = (byte[]) mapJweEncrypt.get("cipherText");
                String str4 = (String) mapJweEncrypt.get("authTag");
                if (str != null && str2 != null && str3 != null && bArr2 != null && str4 != null) {
                    map.put("protectedHeaders", str);
                    map.put("encryptedKey", str2);
                    map.put("iv", str3);
                    map.put("authTag", str4);
                    return bArr2;
                }
            }
            return null;
        } catch (Exception e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception while GZipping and encrypting", e);
            return null;
        }
    }

    public static String md5(String str) {
        return md5(str.getBytes());
    }

    public static byte[] v1Decrypt(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 8];
        int length = bArr.length;
        byte[] bArr3 = {bArr[9], bArr[19], bArr[29], bArr[39], bArr[49], bArr[59], bArr[69], bArr[79]};
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 % 10 != 9 || i >= 8) {
                bArr2[i2] = (byte) (bArr[i3] ^ bArr3[i2 % 8]);
                i2++;
            } else {
                i++;
            }
        }
        return bArr2;
    }

    public static byte[] v1Encrypt(byte[] bArr) throws IOException {
        byte[] bArrGzipContent = Utils.gzipContent(bArr);
        byte[] bArr2 = new byte[8];
        new SecureRandom().nextBytes(bArr2);
        int length = bArrGzipContent.length;
        int i = length + 8;
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i2 < length && i4 < i; i4++) {
            if (i4 % 10 != 9 || i3 >= 8) {
                bArr3[i4] = (byte) (bArrGzipContent[i2] ^ bArr2[i2 % 8]);
                i2++;
            } else {
                bArr3[i4] = bArr2[i3];
                i3++;
            }
        }
        return bArr3;
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                StringBuilder sb2 = new StringBuilder(Integer.toHexString(b & 255));
                while (sb2.length() < 2) {
                    sb2.insert(0, SessionDescription.SUPPORTED_SDP_VERSION);
                }
                sb.append((CharSequence) sb2);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception trying to calculate md5sum from given string", e);
            return null;
        }
    }

    public static String md5(InputStream inputStream) {
        try {
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance("MD5"));
            do {
                try {
                } catch (Throwable th) {
                    try {
                        digestInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (digestInputStream.read() != -1);
            byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
            digestInputStream.close();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                StringBuilder sb2 = new StringBuilder(Integer.toHexString(b & 255));
                while (sb2.length() < 2) {
                    sb2.insert(0, SessionDescription.SUPPORTED_SDP_VERSION);
                }
                sb.append((CharSequence) sb2);
            }
            return sb.toString();
        } catch (IOException | NoSuchAlgorithmException e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception trying to get md5sum from input stream", e);
            return null;
        }
    }
}
