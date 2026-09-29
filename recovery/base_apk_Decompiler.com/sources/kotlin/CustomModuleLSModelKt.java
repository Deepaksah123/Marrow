package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomModuleLSModelKt {
    private static void AudioAttributesCompatParcelizer(InputStream inputStream, OutputStream outputStream) throws IOException {
        read(inputStream, outputStream, 4096);
    }

    private static void read(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = inputStream.read(bArr, 0, 4096);
            if (i2 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public static byte[] IconCompatParcelizer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AudioAttributesCompatParcelizer(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int IconCompatParcelizer(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
