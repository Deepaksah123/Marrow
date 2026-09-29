package kotlin;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class checkContentTypeConsistency {
    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] read(String str, int i) throws NoSuchAlgorithmException {
        toMagicModuleMetaRepoModel.write(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(getSubmissionTimestamp.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        for (int i2 = 0; i2 <= 0; i2++) {
            bytes = messageDigest.digest(bytes);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        }
        return bytes;
    }

    public static final byte[] write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return Base64.decode(str, 0);
    }

    public static final String IconCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return getOrderDetails.write(bArr, "", "", "", -1, "...", (getAnswerMap<? super Byte, ? extends CharSequence>) new getAnswerMap() { // from class: o.fillInClearKeyInformation
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return checkContentTypeConsistency.RemoteActionCompatParcelizer(((Byte) obj).byteValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence RemoteActionCompatParcelizer(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
