package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getCorrectCount {
    public static /* synthetic */ long read(InputStream inputStream, OutputStream outputStream) {
        return read(inputStream, outputStream, 8192);
    }

    private static long read(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        toMagicModuleMetaRepoModel.write(inputStream, "");
        toMagicModuleMetaRepoModel.write(outputStream, "");
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] write(InputStream inputStream) {
        toMagicModuleMetaRepoModel.write(inputStream, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        read(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteArray, "");
        return byteArray;
    }
}
