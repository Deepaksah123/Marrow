package kotlin;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class skipSampleEncryptionData {
    private static double read(double d, RoundingMode roundingMode) {
        if (!getEncryptionBoxIfEncrypted.write(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.IconCompatParcelizer[roundingMode.ordinal()]) {
            case 1:
                MetadataUtil.IconCompatParcelizer(AudioAttributesCompatParcelizer(d));
                return d;
            case 2:
                return (d >= 0.0d || AudioAttributesCompatParcelizer(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || AudioAttributesCompatParcelizer(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (AudioAttributesCompatParcelizer(d)) {
                    return d;
                }
                return ((long) d) + ((long) (d > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d);
            case 7:
                double dRint = Math.rint(d);
                return Math.abs(d - dRint) == 0.5d ? d + Math.copySign(0.5d, d) : dRint;
            case 8:
                double dRint2 = Math.rint(d);
                return Math.abs(d - dRint2) == 0.5d ? d : dRint2;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: o.skipSampleEncryptionData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IconCompatParcelizer[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IconCompatParcelizer[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IconCompatParcelizer[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long IconCompatParcelizer(double d, RoundingMode roundingMode) {
        double d2 = read(d, roundingMode);
        MetadataUtil.write(((-9.223372036854776E18d) - d2 < 1.0d) & (d2 < 9.223372036854776E18d), d, roundingMode);
        return (long) d2;
    }

    private static boolean AudioAttributesCompatParcelizer(double d) {
        if (getEncryptionBoxIfEncrypted.write(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(getEncryptionBoxIfEncrypted.RemoteActionCompatParcelizer(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
