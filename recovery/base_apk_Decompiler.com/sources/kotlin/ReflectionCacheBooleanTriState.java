package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
final class ReflectionCacheBooleanTriState {
    static int write(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    private static void IconCompatParcelizer(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 << 3)) & 255);
        }
        outputStream.write(bArr);
    }

    static void write(OutputStream outputStream, int i) throws IOException {
        IconCompatParcelizer(outputStream, i, 1);
    }

    static void RemoteActionCompatParcelizer(OutputStream outputStream, int i) throws IOException {
        IconCompatParcelizer(outputStream, i, 2);
    }

    static void AudioAttributesCompatParcelizer(OutputStream outputStream, long j) throws IOException {
        IconCompatParcelizer(outputStream, j, 4);
    }

    static void read(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static int RemoteActionCompatParcelizer(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    static byte[] read(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw RemoteActionCompatParcelizer("Not enough bytes to read: ".concat(String.valueOf(i)));
            }
            i2 += i3;
        }
        return bArr;
    }

    private static long RemoteActionCompatParcelizer(InputStream inputStream, int i) throws IOException {
        byte[] bArr = read(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArr[i2] & 255)) << (i2 << 3);
        }
        return j;
    }

    static int RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
        return (int) RemoteActionCompatParcelizer(inputStream, 1);
    }

    static int IconCompatParcelizer(InputStream inputStream) throws IOException {
        return (int) RemoteActionCompatParcelizer(inputStream, 2);
    }

    static long read(InputStream inputStream) throws IOException {
        return RemoteActionCompatParcelizer(inputStream, 4);
    }

    static String write(InputStream inputStream, int i) throws IOException {
        return new String(read(inputStream, i), StandardCharsets.UTF_8);
    }

    static byte[] write(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                    sb.append(i);
                    sb.append(" bytes");
                    throw RemoteActionCompatParcelizer(sb.toString());
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw RemoteActionCompatParcelizer(e.getMessage());
                }
            }
            if (i3 != i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Didn't read enough bytes during decompression. expected=");
                sb2.append(i);
                sb2.append(" actual=");
                sb2.append(i3);
                throw RemoteActionCompatParcelizer(sb2.toString());
            }
            if (inflater.finished()) {
                return bArr;
            }
            throw RemoteActionCompatParcelizer("Inflater did not finish");
        } finally {
            inflater.end();
        }
    }

    static void IconCompatParcelizer(OutputStream outputStream, byte[] bArr) throws IOException {
        AudioAttributesCompatParcelizer(outputStream, bArr.length);
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArr);
        AudioAttributesCompatParcelizer(outputStream, bArrAudioAttributesCompatParcelizer.length);
        outputStream.write(bArrAudioAttributesCompatParcelizer);
    }

    static byte[] AudioAttributesCompatParcelizer(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static void IconCompatParcelizer(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    static RuntimeException RemoteActionCompatParcelizer(String str) {
        return new IllegalStateException(str);
    }
}
