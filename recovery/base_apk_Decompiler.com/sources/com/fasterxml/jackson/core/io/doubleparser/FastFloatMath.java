package com.fasterxml.jackson.core.io.doubleparser;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
class FastFloatMath {
    private static final float[] FLOAT_POWER_OF_TEN = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    static float decFloatLiteralToFloat(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (!z2) {
            if (-45 > i || i > 38) {
                return Float.NaN;
            }
            return tryDecToFloatWithFastAlgorithm(z, j, i);
        }
        if (-45 <= i2 && i2 <= 38) {
            float fTryDecToFloatWithFastAlgorithm = tryDecToFloatWithFastAlgorithm(z, j, i2);
            float fTryDecToFloatWithFastAlgorithm2 = tryDecToFloatWithFastAlgorithm(z, j + 1, i2);
            if (!Float.isNaN(fTryDecToFloatWithFastAlgorithm) && fTryDecToFloatWithFastAlgorithm2 == fTryDecToFloatWithFastAlgorithm) {
                return fTryDecToFloatWithFastAlgorithm;
            }
        }
        return Float.NaN;
    }

    static float hexFloatLiteralToFloat(boolean z, long j, int i, boolean z2, int i2) {
        if (z2) {
            i = i2;
        }
        if (-126 > i || i > 127) {
            return Float.NaN;
        }
        float fAbs = Math.abs(j) * Math.scalb(1.0f, i);
        return z ? -fAbs : fAbs;
    }

    static float tryDecToFloatWithFastAlgorithm(boolean z, long j, int i) {
        float f;
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f2 = j;
            if (i < 0) {
                f = f2 / FLOAT_POWER_OF_TEN[-i];
            } else {
                f = f2 * FLOAT_POWER_OF_TEN[i];
            }
            return z ? -f : f;
        }
        long j2 = FastDoubleMath.MANTISSA_64[i + 325];
        long j3 = i;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j4 = FastIntegerMath.fullMultiplication(j << iNumberOfLeadingZeros, j2).high;
        long j5 = j4 >>> 63;
        long j6 = j4 >>> ((int) (38 + j5));
        int i2 = iNumberOfLeadingZeros + ((int) (j5 ^ 1));
        long j7 = j4 & 274877906943L;
        if (j7 == 274877906943L) {
            return Float.NaN;
        }
        if (j7 == 0 && (3 & j6) == 1) {
            return Float.NaN;
        }
        long j8 = (j6 + 1) >>> 1;
        if (j8 >= 16777216) {
            i2--;
            j8 = 8388608;
        }
        long j9 = (((j3 * 217706) >> 16) + 191) - ((long) i2);
        if (j9 < 1 || j9 > 254) {
            return Float.NaN;
        }
        return Float.intBitsToFloat((int) ((j8 & (-8388609)) | (j9 << 23) | (z ? 2147483648L : 0L)));
    }
}
