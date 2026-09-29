package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class getPlanBUpgradeDataList extends getValidTill {
    public static final <T> List<T> read(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        List<T> listIconCompatParcelizer = setOrderDetails.IconCompatParcelizer(tArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listIconCompatParcelizer, "");
        return listIconCompatParcelizer;
    }

    public static final class IconCompatParcelizer extends setUrl<Integer> implements RandomAccess {
        private /* synthetic */ int[] read;

        IconCompatParcelizer(int[] iArr) {
            this.read = iArr;
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return read(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.setUrl, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return RemoteActionCompatParcelizer(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.setUrl, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return AudioAttributesCompatParcelizer(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.setBigButtonText
        public final int AudioAttributesCompatParcelizer() {
            return this.read.length;
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.read.length == 0;
        }

        private boolean read(int i) {
            return getOrderDetails.write(this.read, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setUrl, java.util.List
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            return Integer.valueOf(this.read[i]);
        }

        private int RemoteActionCompatParcelizer(int i) {
            return getOrderDetails.AudioAttributesImplBaseParcelizer(this.read, i);
        }

        private int AudioAttributesCompatParcelizer(int i) {
            return getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(this.read, i);
        }
    }

    public static final List<Integer> AudioAttributesCompatParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return new IconCompatParcelizer(iArr);
    }

    public static final int IconCompatParcelizer(float[] fArr, float f, int i, int i2) {
        toMagicModuleMetaRepoModel.write(fArr, "");
        return Arrays.binarySearch(fArr, 0, i2, f);
    }

    public static /* synthetic */ Object[] read(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, 0, i, i2);
    }

    public static final <T> T[] RemoteActionCompatParcelizer(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(tArr2, "");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static final byte[] read(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(bArr2, "");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ int[] RemoteActionCompatParcelizer(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        return getOrderDetails.read(iArr, iArr2, i, 0, i2);
    }

    public static final int[] read(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(iArr2, "");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static final long[] AudioAttributesCompatParcelizer(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        toMagicModuleMetaRepoModel.write(jArr2, "");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static final float[] IconCompatParcelizer(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(fArr, "");
        toMagicModuleMetaRepoModel.write(fArr2, "");
        System.arraycopy(fArr, 0, fArr2, 0, i3);
        return fArr2;
    }

    public static final char[] RemoteActionCompatParcelizer(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        toMagicModuleMetaRepoModel.write(cArr2, "");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static final <T> T[] IconCompatParcelizer(T[] tArr, int i, int i2) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        getOrderDetails.read(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tArr2, "");
        return tArr2;
    }

    public static final byte[] write(byte[] bArr, int i, int i2) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        getOrderDetails.read(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOfRange, "");
        return bArrCopyOfRange;
    }

    public static final <T> void AudioAttributesCompatParcelizer(T[] tArr, T t, int i, int i2) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        Arrays.fill(tArr, i, i2, t);
    }

    public static final void RemoteActionCompatParcelizer(int[] iArr, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        Arrays.fill(iArr, 0, i3, i);
    }

    public static final void read(long[] jArr, long j, int i, int i2) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        Arrays.fill(jArr, 0, i2, j);
    }

    public static final void IconCompatParcelizer(boolean[] zArr, boolean z, int i, int i2) {
        toMagicModuleMetaRepoModel.write(zArr, "");
        Arrays.fill(zArr, 0, i2, false);
    }

    public static final <T> T[] IconCompatParcelizer(T[] tArr, T t) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        toMagicModuleMetaRepoModel.write(tArr2);
        return tArr2;
    }

    public static final byte[] RemoteActionCompatParcelizer(byte[] bArr, byte b) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b;
        toMagicModuleMetaRepoModel.write(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final int[] RemoteActionCompatParcelizer(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        toMagicModuleMetaRepoModel.write(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final <T> T[] RemoteActionCompatParcelizer(T[] tArr, Collection<? extends T> collection) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        toMagicModuleMetaRepoModel.write(tArr2);
        return tArr2;
    }

    public static final byte[] RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(bArr2, "");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        toMagicModuleMetaRepoModel.write(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final int[] RemoteActionCompatParcelizer(int[] iArr, int[] iArr2) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(iArr2, "");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        toMagicModuleMetaRepoModel.write(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final void IconCompatParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static final <T> void AudioAttributesCompatParcelizer(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final void IconCompatParcelizer(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        Arrays.sort(iArr, 0, i);
    }

    public static final <T> void IconCompatParcelizer(T[] tArr, Comparator<? super T> comparator) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T> void write(T[] tArr, Comparator<? super T> comparator, int i) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        Arrays.sort(tArr, 0, i, comparator);
    }
}
