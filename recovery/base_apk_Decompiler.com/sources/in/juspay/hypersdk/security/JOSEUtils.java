package in.juspay.hypersdk.security;

import in.juspay.hypersdk.core.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JOSEUtils {
    public static RSAPublicKey JWKtoRSAPublicKey(JSONObject jSONObject) throws JSONException {
        return (RSAPublicKey) KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64Codec.decode(jSONObject.getString("n"))), new BigInteger(1, Base64Codec.decode(jSONObject.getString("e")))));
    }

    public static void assertIfMatches(String str, String str2) throws Exception {
        if (str.equals(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Assert failed, org=");
        sb.append(str);
        sb.append(", expected=");
        sb.append(str2);
        throw new Exception(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void assertIfSupportedEncAlg(java.lang.String r4) throws java.lang.Exception {
        /*
            r4.hashCode()
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = -1868738169(0xffffffff909d5187, float:-6.2051194E-29)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L30
            r1 = -890830960(0xffffffffcae6ff90, float:-7569352.0)
            if (r0 == r1) goto L26
            r1 = -565207670(0xffffffffde4f9d8a, float:-3.7400663E18)
            if (r0 == r1) goto L1c
            goto L3a
        L1c:
            java.lang.String r0 = "RSA-OAEP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3a
            r0 = r2
            goto L3b
        L26:
            java.lang.String r0 = "RSA-OAEP-256"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3a
            r0 = r3
            goto L3b
        L30:
            java.lang.String r0 = "RSA1_5"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3a
            r0 = 0
            goto L3b
        L3a:
            r0 = -1
        L3b:
            if (r0 == 0) goto L52
            if (r0 == r3) goto L52
            if (r0 != r2) goto L42
            goto L52
        L42:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Not supported signing alg "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.security.JOSEUtils.assertIfSupportedEncAlg(java.lang.String):void");
    }

    public static void assertIfSupportedSigningAlg(String str) throws Exception {
        str.hashCode();
        if (!str.equals("RS256") && !str.equals("RS512")) {
            throw new Exception("Not supported signing alg ".concat(String.valueOf(str)));
        }
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                for (byte[] bArr2 : bArr) {
                    if (bArr2 != null) {
                        byteArrayOutputStream.write(bArr2);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public static String constructPayload(HashMap<String, Object> map) {
        if (!map.containsKey("headers") || !map.containsKey("encryptedKey") || !map.containsKey("iv") || !map.containsKey("cipherText") || !map.containsKey("authTag")) {
            return null;
        }
        String str = (String) map.get("headers");
        String str2 = (String) map.get("encryptedKey");
        String str3 = (String) map.get("iv");
        byte[] bArr = (byte[]) map.get("cipherText");
        String str4 = (String) map.get("authTag");
        if (str == null || str2 == null || str3 == null || bArr == null || str4 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append(".");
        sb.append(str3);
        sb.append(".");
        sb.append(Base64Codec.encodeToString(bArr, true));
        sb.append(".");
        sb.append(str4);
        return sb.toString();
    }

    public static String extractKey(String str, String str2) throws Exception {
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        throw new Exception("JWS Sign - header missing ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getJavaAlg(java.lang.String r5) throws java.lang.Exception {
        /*
            r5.hashCode()
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1868738169: goto L3a;
                case -890830960: goto L30;
                case -565207670: goto L26;
                case 78251122: goto L1c;
                case 78253877: goto L12;
                default: goto L11;
            }
        L11:
            goto L44
        L12:
            java.lang.String r0 = "RS512"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = r1
            goto L45
        L1c:
            java.lang.String r0 = "RS256"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = r2
            goto L45
        L26:
            java.lang.String r0 = "RSA-OAEP"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = r3
            goto L45
        L30:
            java.lang.String r0 = "RSA-OAEP-256"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = r4
            goto L45
        L3a:
            java.lang.String r0 = "RSA1_5"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = -1
        L45:
            if (r0 == 0) goto L6b
            if (r0 == r4) goto L68
            if (r0 == r3) goto L65
            if (r0 == r2) goto L62
            if (r0 != r1) goto L52
            java.lang.String r5 = "SHA512withRSA"
            return r5
        L52:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Not supported signing alg "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L62:
            java.lang.String r5 = "SHA256withRSA"
            return r5
        L65:
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding"
            return r5
        L68:
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            return r5
        L6b:
            java.lang.String r5 = "RSA/ECB/PKCS1Padding"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.security.JOSEUtils.getJavaAlg(java.lang.String):java.lang.String");
    }

    public static JSONObject jweDecrypt(String str, PrivateKey privateKey) throws Exception {
        GCMParameterSpec gCMParameterSpec;
        String[] strArrSplit = str.split("\\.");
        String str2 = new String(Base64Codec.decode(strArrSplit[0]));
        String strExtractKey = extractKey("alg", str2);
        assertIfSupportedEncAlg(strExtractKey);
        assertIfMatches(extractKey("enc", str2), "A256GCM");
        new SecureRandom().nextBytes(new byte[2048]);
        String str3 = strArrSplit[1];
        Cipher cipher = Cipher.getInstance(getJavaAlg(strExtractKey));
        cipher.init(2, privateKey);
        SecretKeySpec secretKeySpec = new SecretKeySpec(cipher.doFinal(Base64Codec.decode(str3)), "AES");
        byte[] bytes = Base64Codec.encodeToString(str2.getBytes(StandardCharsets.UTF_8), true).getBytes(StandardCharsets.US_ASCII);
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            gCMParameterSpec = new GCMParameterSpec(128, Base64Codec.decode(strArrSplit[2]));
        } catch (Exception unused) {
            gCMParameterSpec = new GCMParameterSpec(128, Base64Codec.decode(strArrSplit[2]));
        }
        cipher2.init(2, secretKeySpec2, gCMParameterSpec);
        cipher2.updateAAD(bytes);
        byte[] bArrDoFinal = cipher2.doFinal(concat(Base64Codec.decode(strArrSplit[3]), Base64Codec.decode(strArrSplit[4])));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headers", str2);
        jSONObject.put("payload", new String(bArrDoFinal));
        return jSONObject;
    }

    public static String jweEncrypt(String str, String str2, byte[] bArr) {
        return constructPayload(jweEncrypt(str.getBytes(StandardCharsets.UTF_8), str2, (RSAPublicKey) KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(bArr))));
    }

    public static String jwsSign(String str, String str2, PrivateKey privateKey) throws Exception {
        StringBuilder sb = new StringBuilder();
        Charset charset = StandardCharsets.UTF_8;
        sb.append(Base64Codec.encodeToString(str2.getBytes(charset), true));
        sb.append(".");
        sb.append(Base64Codec.encodeToString(str.getBytes(charset), true));
        String string = sb.toString();
        String strExtractKey = extractKey("alg", str2);
        assertIfSupportedSigningAlg(strExtractKey);
        Signature signature = Signature.getInstance(getJavaAlg(strExtractKey));
        signature.initSign(privateKey);
        signature.update(string.getBytes(charset));
        byte[] bArrSign = signature.sign();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(".");
        sb2.append(Base64Codec.encodeToString(bArrSign, true));
        return sb2.toString();
    }

    public static boolean jwsVerify(String str, byte[] bArr) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(bArr));
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 3) {
            StringBuilder sb = new StringBuilder("JWS Verify - mandatory params missing ");
            sb.append(strArrSplit.length);
            throw new Exception(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strArrSplit[0]);
        sb2.append(".");
        sb2.append(strArrSplit[1]);
        String string = sb2.toString();
        String strExtractKey = extractKey("alg", new String(Base64Codec.decode(strArrSplit[0])));
        assertIfSupportedSigningAlg(strExtractKey);
        Signature signature = Signature.getInstance(getJavaAlg(strExtractKey));
        signature.initVerify(rSAPublicKey);
        signature.update(string.getBytes(StandardCharsets.UTF_8));
        return signature.verify(Base64Codec.decode(strArrSplit[2]));
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static HashMap<String, Object> jweEncrypt(byte[] bArr, String str, RSAPublicKey rSAPublicKey) throws Exception {
        GCMParameterSpec gCMParameterSpec;
        byte[] iv;
        String strExtractKey = extractKey("alg", str);
        assertIfSupportedEncAlg(strExtractKey);
        assertIfMatches(extractKey("enc", str), "A256GCM");
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(getJavaAlg(strExtractKey));
        cipher.init(1, rSAPublicKey);
        String strEncodeToString = Base64Codec.encodeToString(cipher.doFinal(secretKeySpec.getEncoded()), true);
        byte[] bytes = Base64Codec.encodeToString(str.getBytes(StandardCharsets.UTF_8), true).getBytes(StandardCharsets.US_ASCII);
        byte[] bArr3 = new byte[12];
        new SecureRandom().nextBytes(bArr3);
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        } catch (Exception unused) {
            gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        }
        cipher2.init(1, secretKeySpec, gCMParameterSpec);
        cipher2.updateAAD(bytes);
        byte[] bArrDoFinal = cipher2.doFinal(bArr);
        int length = bArrDoFinal.length - 16;
        byte[] bArrSubArray = subArray(bArrDoFinal, 0, length);
        byte[] bArrSubArray2 = subArray(bArrDoFinal, length, 16);
        try {
            iv = ((GCMParameterSpec) cipher2.getParameters().getParameterSpec(GCMParameterSpec.class)).getIV();
        } catch (Exception unused2) {
            iv = ((GCMParameterSpec) cipher2.getParameters().getParameterSpec(GCMParameterSpec.class)).getIV();
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("encryptedKey", strEncodeToString);
        map.put("iv", Base64Codec.encodeToString(iv, true));
        map.put("cipherText", bArrSubArray);
        map.put("authTag", Base64Codec.encodeToString(bArrSubArray2, true));
        map.put("headers", Base64Codec.encodeToString(str.getBytes(StandardCharsets.UTF_8), true));
        return map;
    }
}
