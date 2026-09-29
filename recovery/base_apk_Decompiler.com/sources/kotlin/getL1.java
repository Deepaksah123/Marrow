package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class getL1 extends getL3 {
    public static final int read(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static final long write(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static final int RemoteActionCompatParcelizer(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final long IconCompatParcelizer(float f) {
        return getOnline.write(f);
    }

    public static final int write(int i) {
        return Integer.signum(i);
    }

    public static final int write(long j) {
        return Long.signum(j);
    }
}
