package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class AsPropertyTypeSerializer {
    private static boolean IconCompatParcelizer(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (IconCompatParcelizer(i4, i2)) {
                return i4;
            }
        }
        return i;
    }
}
