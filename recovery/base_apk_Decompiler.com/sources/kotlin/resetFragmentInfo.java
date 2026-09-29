package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class resetFragmentInfo {
    private static byte[] AudioAttributesCompatParcelizer(InputStream inputStream, Queue<byte[]> queue) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) << 1));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return AudioAttributesCompatParcelizer(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = parseCoverArt.write(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return AudioAttributesCompatParcelizer(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] AudioAttributesCompatParcelizer(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i) {
            return bArrRemove;
        }
        int length = i - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] AudioAttributesCompatParcelizer(InputStream inputStream) throws IOException {
        return AudioAttributesCompatParcelizer(inputStream, new ArrayDeque(20));
    }

    static {
        new OutputStream() { // from class: o.resetFragmentInfo.3
            @Override // java.io.OutputStream
            public final void write(int i) {
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr) {
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                parseStsd.read(i, i2 + i, bArr.length);
            }

            public final String toString() {
                return "ByteStreams.nullOutputStream()";
            }
        };
    }
}
