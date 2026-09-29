package kotlin;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
final class _parseFloatPrimitive {
    private static int AudioAttributesCompatParcelizer(int i) {
        if (i <= 4) {
            return 8;
        }
        return i << 1;
    }

    public static <T> T[] RemoteActionCompatParcelizer(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), AudioAttributesCompatParcelizer(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t;
        return tArr;
    }

    public static int[] write(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[AudioAttributesCompatParcelizer(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }
}
