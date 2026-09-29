package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class saveMagicModuleTimeline {
    private static final int write(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long write(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int IconCompatParcelizer(int i, int i2, int i3) {
        return write(write(i, i3) - write(i2, i3), i3);
    }

    private static final long AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        return write(write(j, j3) - write(j2, j3), j3);
    }

    public static final int read(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - IconCompatParcelizer(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + IconCompatParcelizer(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final long read(long j, long j2, long j3) {
        return j < j2 ? j2 - AudioAttributesCompatParcelizer(j2, j, 1L) : j2;
    }
}
