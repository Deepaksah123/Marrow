package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class getDefaultSampleValues {
    static int read(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    static int read(Object obj) {
        return read(obj == null ? 0 : obj.hashCode());
    }

    static int IconCompatParcelizer(int i) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (((double) iHighestOneBit) * 1.0d))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
