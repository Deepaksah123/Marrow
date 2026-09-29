package kotlin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class SampleVideosRSModel {

    public static class IconCompatParcelizer<T> implements Iterator<T> {
        private int RemoteActionCompatParcelizer = 0;
        private final T[] read;

        public IconCompatParcelizer(T[] tArr) {
            this.read = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer < this.read.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.RemoteActionCompatParcelizer;
            T[] tArr = this.read;
            if (i != tArr.length) {
                this.RemoteActionCompatParcelizer = i + 1;
                return tArr[i];
            }
            StringBuilder sb = new StringBuilder("Out of elements: ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new NoSuchElementException(sb.toString());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean write(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean read(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static int write(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int IconCompatParcelizer(byte[] bArr, int i) {
        if (bArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ bArr[i];
        }
    }

    public static int write(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public static byte[] write(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }
}
