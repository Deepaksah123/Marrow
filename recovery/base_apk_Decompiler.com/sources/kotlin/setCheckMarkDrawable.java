package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setCheckMarkDrawable {
    public static final int[] write = new int[0];
    public static final long[] AudioAttributesCompatParcelizer = new long[0];
    public static final Object[] read = new Object[0];

    private static int AudioAttributesCompatParcelizer(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public static final int RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i << 2) / 4;
    }

    public static final int read(int i) {
        return AudioAttributesCompatParcelizer(i << 3) / 8;
    }

    public static final boolean IconCompatParcelizer(Object obj, Object obj2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, obj2);
    }

    public static final int IconCompatParcelizer(int[] iArr, int i, int i2) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int AudioAttributesCompatParcelizer(long[] jArr, int i, long j) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
