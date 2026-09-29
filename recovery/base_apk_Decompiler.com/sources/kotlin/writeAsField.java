package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
final class writeAsField implements _hasTypeResolver {
    private final byte[] AudioAttributesCompatParcelizer;
    private final _hasTypeResolver IconCompatParcelizer;
    private CipherInputStream read;
    private final byte[] write;

    public writeAsField(_hasTypeResolver _hastyperesolver, byte[] bArr, byte[] bArr2) {
        this.IconCompatParcelizer = _hastyperesolver;
        this.write = bArr;
        this.AudioAttributesCompatParcelizer = bArr2;
    }

    @Override // kotlin._hasTypeResolver
    public final void read(TypeNameIdResolver typeNameIdResolver) {
        this.IconCompatParcelizer.read(typeNameIdResolver);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IOException {
        try {
            Cipher cipherWrite = write();
            try {
                cipherWrite.init(2, new SecretKeySpec(this.write, "AES"), new IvParameterSpec(this.AudioAttributesCompatParcelizer));
                verifyBaseTypeValidity verifybasetypevalidity = new verifyBaseTypeValidity(this.IconCompatParcelizer, subTypeValidator);
                this.read = new CipherInputStream(verifybasetypevalidity, cipherWrite);
                verifybasetypevalidity.IconCompatParcelizer();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.read.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        return this.IconCompatParcelizer.read();
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws IOException {
        if (this.read != null) {
            this.read = null;
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    private static Cipher write() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
