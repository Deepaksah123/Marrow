package kotlin;

import com.google.android.exoplayer2.C;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class parseCoverArt {
    private static int AudioAttributesCompatParcelizer(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    private static boolean IconCompatParcelizer(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    /* JADX INFO: renamed from: o.parseCoverArt$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            read = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                read[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                read[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                read[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int write(int i, RoundingMode roundingMode) {
        MetadataUtil.write("x", i);
        switch (AnonymousClass4.read[roundingMode.ordinal()]) {
            case 1:
                MetadataUtil.IconCompatParcelizer(IconCompatParcelizer(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + AudioAttributesCompatParcelizer((-1257966797) >>> iNumberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int read(int i, int i2, RoundingMode roundingMode) {
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (AnonymousClass4.read[roundingMode.ordinal()]) {
            case 1:
                MetadataUtil.IconCompatParcelizer(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                return i3 + i5;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                return i3 + i5;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                return i3 + i5;
            default:
                throw new AssertionError();
        }
    }

    public static int read(int i) {
        int i2 = i % C.DEFAULT_BUFFER_SEGMENT_SIZE;
        return i2 >= 0 ? i2 : i2 + C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public static int IconCompatParcelizer(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        MetadataUtil.IconCompatParcelizer(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int write(int i, int i2) {
        return parseTextAttribute.IconCompatParcelizer(((long) i) * ((long) i2));
    }
}
