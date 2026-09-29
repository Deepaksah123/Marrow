package kotlin;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTextAttribute extends Mp4Extractor {
    public static int IconCompatParcelizer(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    private static int read(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int write(int i) {
        return i;
    }

    public static int write(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int RemoteActionCompatParcelizer(long j) {
        int i = (int) j;
        parseStsd.AudioAttributesCompatParcelizer(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int AudioAttributesCompatParcelizer(int[] iArr, int i) {
        return read(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int read(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        parseStsd.RemoteActionCompatParcelizer(i2 <= 1073741823, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr) {
        parseStsd.RemoteActionCompatParcelizer(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return read(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int[] write(Collection<? extends Number> collection) {
        if (collection instanceof RemoteActionCompatParcelizer) {
            return ((RemoteActionCompatParcelizer) collection).AudioAttributesCompatParcelizer();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) parseStsd.IconCompatParcelizer(array[i])).intValue();
        }
        return iArr;
    }

    public static List<Integer> write(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new RemoteActionCompatParcelizer(iArr);
    }

    static class RemoteActionCompatParcelizer extends AbstractList<Integer> implements RandomAccess, Serializable {
        private int IconCompatParcelizer;
        private int read;
        private int[] write;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        RemoteActionCompatParcelizer(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        private RemoteActionCompatParcelizer(int[] iArr, int i, int i2) {
            this.write = iArr;
            this.IconCompatParcelizer = i;
            this.read = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.read - this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            parseStsd.write(i, size());
            return Integer.valueOf(this.write[this.IconCompatParcelizer + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return (obj instanceof Integer) && parseTextAttribute.read(this.write, ((Integer) obj).intValue(), this.IconCompatParcelizer, this.read) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            int i;
            if (!(obj instanceof Integer) || (i = parseTextAttribute.read(this.write, ((Integer) obj).intValue(), this.IconCompatParcelizer, this.read)) < 0) {
                return -1;
            }
            return i - this.IconCompatParcelizer;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int iIconCompatParcelizer;
            if (!(obj instanceof Integer) || (iIconCompatParcelizer = parseTextAttribute.IconCompatParcelizer(this.write, ((Integer) obj).intValue(), this.IconCompatParcelizer, this.read)) < 0) {
                return -1;
            }
            return iIconCompatParcelizer - this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            parseStsd.write(i, size());
            int[] iArr = this.write;
            int i2 = this.IconCompatParcelizer + i;
            int i3 = iArr[i2];
            iArr[i2] = ((Integer) parseStsd.IconCompatParcelizer(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            parseStsd.read(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.write;
            int i3 = this.IconCompatParcelizer;
            return new RemoteActionCompatParcelizer(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
                int size = size();
                if (remoteActionCompatParcelizer.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.write[this.IconCompatParcelizer + i] != remoteActionCompatParcelizer.write[remoteActionCompatParcelizer.IconCompatParcelizer + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int iWrite = 1;
            for (int i = this.IconCompatParcelizer; i < this.read; i++) {
                iWrite = (iWrite * 31) + parseTextAttribute.write(this.write[i]);
            }
            return iWrite;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.write[this.IconCompatParcelizer]);
            int i = this.IconCompatParcelizer;
            while (true) {
                i++;
                if (i < this.read) {
                    sb.append(", ");
                    sb.append(this.write[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        final int[] AudioAttributesCompatParcelizer() {
            return Arrays.copyOfRange(this.write, this.IconCompatParcelizer, this.read);
        }
    }

    public static Integer RemoteActionCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(str);
    }

    private static Integer AudioAttributesCompatParcelizer(String str) {
        Long lAudioAttributesCompatParcelizer = setFormatMetadata.AudioAttributesCompatParcelizer(str, 10);
        if (lAudioAttributesCompatParcelizer == null || lAudioAttributesCompatParcelizer.longValue() != lAudioAttributesCompatParcelizer.intValue()) {
            return null;
        }
        return Integer.valueOf(lAudioAttributesCompatParcelizer.intValue());
    }
}
