package org.apache.commons.compress.compressors.bzip2;

import java.util.BitSet;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class BlockSort {
    private static final int CLEARMASK = -2097153;
    private static final int DEPTH_THRESH = 10;
    private static final int FALLBACK_QSORT_SMALL_THRESH = 10;
    private static final int FALLBACK_QSORT_STACK_SIZE = 100;
    private static final int[] INCS = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};
    private static final int QSORT_STACK_SIZE = 1000;
    private static final int SETMASK = 2097152;
    private static final int SMALL_THRESH = 20;
    private static final int STACK_SIZE = 1000;
    private static final int WORK_FACTOR = 30;
    private int[] eclass;
    private boolean firstAttempt;
    private final char[] quadrant;
    private int workDone;
    private int workLimit;
    private final int[] stack_ll = new int[1000];
    private final int[] stack_hh = new int[1000];
    private final int[] stack_dd = new int[1000];
    private final int[] mainSort_runningOrder = new int[256];
    private final int[] mainSort_copy = new int[256];
    private final boolean[] mainSort_bigDone = new boolean[256];
    private final int[] ftab = new int[65537];

    private int fmin(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte med3(byte r0, byte r1, byte r2) {
        /*
            if (r0 >= r1) goto L7
            if (r1 < r2) goto L9
            if (r0 >= r2) goto Ld
            goto Lc
        L7:
            if (r1 <= r2) goto La
        L9:
            return r1
        La:
            if (r0 <= r2) goto Ld
        Lc:
            return r2
        Ld:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.bzip2.BlockSort.med3(byte, byte, byte):byte");
    }

    BlockSort(BZip2CompressorOutputStream.Data data) {
        this.quadrant = data.sfmap;
    }

    void blockSort(BZip2CompressorOutputStream.Data data, int i) {
        this.workLimit = i * 30;
        this.workDone = 0;
        this.firstAttempt = true;
        if (i + 1 < 10000) {
            fallbackSort(data, i);
        } else {
            mainSort(data, i);
            if (this.firstAttempt && this.workDone > this.workLimit) {
                fallbackSort(data, i);
            }
        }
        int[] iArr = data.fmap;
        data.origPtr = -1;
        for (int i2 = 0; i2 <= i; i2++) {
            if (iArr[i2] == 0) {
                data.origPtr = i2;
                return;
            }
        }
    }

    final void fallbackSort(BZip2CompressorOutputStream.Data data, int i) {
        int i2 = i + 1;
        data.block[0] = data.block[i2];
        fallbackSort(data.fmap, data.block, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            data.fmap[i3] = r0[i3] - 1;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (data.fmap[i4] == -1) {
                data.fmap[i4] = i;
                return;
            }
        }
    }

    private void fallbackSimpleSort(int[] iArr, int[] iArr2, int i, int i2) {
        if (i != i2) {
            if (i2 - i > 3) {
                for (int i3 = i2 - 4; i3 >= i; i3--) {
                    int i4 = iArr[i3];
                    int i5 = iArr2[i4];
                    int i6 = i3 + 4;
                    while (i6 <= i2) {
                        int i7 = iArr[i6];
                        if (i5 > iArr2[i7]) {
                            iArr[i6 - 4] = i7;
                            i6 += 4;
                        }
                    }
                    iArr[i6 - 4] = i4;
                }
            }
            for (int i8 = i2 - 1; i8 >= i; i8--) {
                int i9 = iArr[i8];
                int i10 = iArr2[i9];
                int i11 = i8 + 1;
                while (i11 <= i2) {
                    int i12 = iArr[i11];
                    if (i10 > iArr2[i12]) {
                        iArr[i11 - 1] = i12;
                        i11++;
                    }
                }
                iArr[i11 - 1] = i9;
            }
        }
    }

    private void fswap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    private void fvswap(int[] iArr, int i, int i2, int i3) {
        while (i3 > 0) {
            fswap(iArr, i, i2);
            i++;
            i2++;
            i3--;
        }
    }

    private void fpush(int i, int i2, int i3) {
        this.stack_ll[i] = i2;
        this.stack_hh[i] = i3;
    }

    private int[] fpop(int i) {
        return new int[]{this.stack_ll[i], this.stack_hh[i]};
    }

    private void fallbackQSort3(int[] iArr, int[] iArr2, int i, int i2) {
        int i3;
        boolean z;
        int[] iArr3 = iArr2;
        char c = 0;
        fpush(0, i, i2);
        long j = 0;
        int i4 = 1;
        long j2 = 0;
        int i5 = 1;
        while (i5 > 0) {
            int i6 = i5 - 1;
            int[] iArrFpop = fpop(i6);
            int i7 = iArrFpop[c];
            int i8 = iArrFpop[i4];
            if (i8 - i7 < 10) {
                fallbackSimpleSort(iArr, iArr3, i7, i8);
                i5 = i6;
            } else {
                j2 = ((j2 * 7621) + 1) % 32768;
                long j3 = j2 % 3;
                if (j3 == j) {
                    i3 = iArr3[iArr[i7]];
                } else if (j3 == 1) {
                    i3 = iArr3[iArr[(i7 + i8) >>> i4]];
                } else {
                    i3 = iArr3[iArr[i8]];
                }
                long j4 = i3;
                int i9 = i8;
                int i10 = i9;
                int i11 = i7;
                int i12 = i11;
                while (true) {
                    if (i12 <= i9) {
                        int i13 = iArr3[iArr[i12]] - ((int) j4);
                        if (i13 == 0) {
                            fswap(iArr, i12, i11);
                            i11++;
                        } else {
                            if (i13 > 0) {
                            }
                            iArr3 = iArr2;
                        }
                        i12++;
                        z = true;
                        iArr3 = iArr2;
                    }
                    while (i12 <= i9) {
                        int i14 = iArr3[iArr[i9]] - ((int) j4);
                        if (i14 == 0) {
                            fswap(iArr, i9, i10);
                            i10--;
                        } else if (i14 < 0) {
                            break;
                        }
                        i9--;
                        iArr3 = iArr2;
                    }
                    if (i12 > i9) {
                        break;
                    }
                    z = true;
                    fswap(iArr, i12, i9);
                    i12++;
                    i9--;
                    iArr3 = iArr2;
                }
                if (i10 < i11) {
                    iArr3 = iArr2;
                    i5 = i6;
                    c = 0;
                    j = 0;
                    i4 = 1;
                } else {
                    int iFmin = fmin(i11 - i7, i12 - i11);
                    fvswap(iArr, i7, i12 - iFmin, iFmin);
                    int i15 = i10 - i9;
                    int iFmin2 = fmin(i8 - i10, i15);
                    fvswap(iArr, i9 + 1, (i8 - iFmin2) + 1, iFmin2);
                    int i16 = ((i12 + i7) - i11) - 1;
                    int i17 = (i8 - i15) + 1;
                    if (i16 - i7 > i8 - i17) {
                        fpush(i6, i7, i16);
                        fpush(i5, i17, i8);
                    } else {
                        fpush(i6, i17, i8);
                        fpush(i5, i7, i16);
                    }
                    i5++;
                    iArr3 = iArr2;
                    i4 = 1;
                    c = 0;
                    j = 0;
                }
            }
        }
    }

    private int[] getEclass() {
        int[] iArr = this.eclass;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[this.quadrant.length / 2];
        this.eclass = iArr2;
        return iArr2;
    }

    final void fallbackSort(int[] iArr, byte[] bArr, int i) {
        int i2;
        int[] iArr2 = new int[257];
        int[] eclass = getEclass();
        for (int i3 = 0; i3 < i; i3++) {
            eclass[i3] = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i4] & 255;
            iArr2[i5] = iArr2[i5] + 1;
        }
        for (int i6 = 1; i6 < 257; i6++) {
            iArr2[i6] = iArr2[i6] + iArr2[i6 - 1];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = iArr2[i8] - 1;
            iArr2[i8] = i9;
            iArr[i9] = i7;
        }
        BitSet bitSet = new BitSet(i + 64);
        for (int i10 = 0; i10 < 256; i10++) {
            bitSet.set(iArr2[i10]);
        }
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = (i11 << 1) + i;
            bitSet.set(i12);
            bitSet.clear(i12 + 1);
        }
        int i13 = 1;
        do {
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                if (bitSet.get(i15)) {
                    i14 = i15;
                }
                int i16 = iArr[i15] - i13;
                if (i16 < 0) {
                    i16 += i;
                }
                eclass[i16] = i14;
            }
            int iNextSetBit = -1;
            i2 = 0;
            while (true) {
                int iNextClearBit = bitSet.nextClearBit(iNextSetBit + 1);
                int i17 = iNextClearBit - 1;
                if (i17 >= i || (iNextSetBit = bitSet.nextSetBit(iNextClearBit + 1) - 1) >= i) {
                    break;
                }
                if (iNextSetBit > i17) {
                    i2 += (iNextSetBit - i17) + 1;
                    fallbackQSort3(iArr, eclass, i17, iNextSetBit);
                    int i18 = -1;
                    while (i17 <= iNextSetBit) {
                        int i19 = eclass[iArr[i17]];
                        if (i18 != i19) {
                            bitSet.set(i17);
                            i18 = i19;
                        }
                        i17++;
                    }
                }
            }
            i13 <<= 1;
            if (i13 > i) {
                return;
            }
        } while (i2 != 0);
    }

    private boolean mainSimpleSort(BZip2CompressorOutputStream.Data data, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        int i11 = (i2 - i) + 1;
        int i12 = 0;
        if (i11 < 2) {
            return this.firstAttempt && this.workDone > this.workLimit;
        }
        int i13 = 0;
        while (INCS[i13] < i11) {
            i13++;
        }
        int[] iArr = data.fmap;
        char[] cArr = this.quadrant;
        byte[] bArr = data.block;
        int i14 = i4 + 1;
        boolean z = this.firstAttempt;
        int i15 = this.workLimit;
        int i16 = this.workDone;
        loop1: while (true) {
            i13 -= i10;
            if (i13 < 0) {
                break;
            }
            int i17 = INCS[i13];
            int i18 = i + i17;
            int i19 = i18;
            while (i19 <= i2) {
                int i20 = 3;
                while (i19 <= i2) {
                    int i21 = i20 - i10;
                    if (i21 < 0) {
                        break;
                    }
                    int i22 = iArr[i19];
                    int i23 = i22 + i3;
                    int i24 = i12;
                    int i25 = i24;
                    int i26 = i19;
                    while (true) {
                        if (i24 != 0) {
                            iArr[i26] = i25;
                            i9 = i26 - i17;
                            if (i9 <= i18 - 1) {
                                i8 = i13;
                                i7 = i17;
                                i6 = i18;
                                i5 = i21;
                                break;
                            }
                            i26 = i9;
                        } else {
                            i24 = 1;
                        }
                        int i27 = iArr[i26 - i17];
                        int i28 = i27 + i3;
                        byte b = bArr[i28 + 1];
                        i8 = i13;
                        byte b2 = bArr[i23 + 1];
                        if (b != b2) {
                            i7 = i17;
                            i6 = i18;
                            i5 = i21;
                            if ((b & 255) <= (b2 & 255)) {
                                break;
                            }
                            i25 = i27;
                            i13 = i8;
                            i17 = i7;
                            i18 = i6;
                            i21 = i5;
                        } else {
                            byte b3 = bArr[i28 + 2];
                            byte b4 = bArr[i23 + 2];
                            if (b3 != b4) {
                                i7 = i17;
                                i6 = i18;
                                i5 = i21;
                                if ((b3 & 255) <= (b4 & 255)) {
                                    break;
                                }
                                i25 = i27;
                                i13 = i8;
                                i17 = i7;
                                i18 = i6;
                                i21 = i5;
                            } else {
                                byte b5 = bArr[i28 + 3];
                                byte b6 = bArr[i23 + 3];
                                if (b5 != b6) {
                                    i7 = i17;
                                    i6 = i18;
                                    i5 = i21;
                                    if ((b5 & 255) <= (b6 & 255)) {
                                        break;
                                    }
                                    i25 = i27;
                                    i13 = i8;
                                    i17 = i7;
                                    i18 = i6;
                                    i21 = i5;
                                } else {
                                    byte b7 = bArr[i28 + 4];
                                    byte b8 = bArr[i23 + 4];
                                    if (b7 != b8) {
                                        i7 = i17;
                                        i6 = i18;
                                        i5 = i21;
                                        if ((b7 & 255) <= (b8 & 255)) {
                                            break;
                                        }
                                        i25 = i27;
                                        i13 = i8;
                                        i17 = i7;
                                        i18 = i6;
                                        i21 = i5;
                                    } else {
                                        byte b9 = bArr[i28 + 5];
                                        byte b10 = bArr[i23 + 5];
                                        if (b9 != b10) {
                                            i7 = i17;
                                            i6 = i18;
                                            i5 = i21;
                                            if ((b9 & 255) <= (b10 & 255)) {
                                                break;
                                            }
                                            i25 = i27;
                                            i13 = i8;
                                            i17 = i7;
                                            i18 = i6;
                                            i21 = i5;
                                        } else {
                                            int i29 = i28 + 6;
                                            byte b11 = bArr[i29];
                                            int i30 = i23 + 6;
                                            byte b12 = bArr[i30];
                                            if (b11 != b12) {
                                                i7 = i17;
                                                i6 = i18;
                                                i5 = i21;
                                                if ((b11 & 255) <= (b12 & 255)) {
                                                    break;
                                                }
                                                i25 = i27;
                                                i13 = i8;
                                                i17 = i7;
                                                i18 = i6;
                                                i21 = i5;
                                            } else {
                                                int i31 = i4;
                                                int i32 = i29;
                                                while (true) {
                                                    if (i31 <= 0) {
                                                        i7 = i17;
                                                        i6 = i18;
                                                        i5 = i21;
                                                        break;
                                                    }
                                                    int i33 = i32 + 1;
                                                    i7 = i17;
                                                    byte b13 = bArr[i33];
                                                    int i34 = i30 + 1;
                                                    i6 = i18;
                                                    byte b14 = bArr[i34];
                                                    if (b13 != b14) {
                                                        i5 = i21;
                                                        if ((b13 & 255) <= (b14 & 255)) {
                                                            break;
                                                        }
                                                    } else {
                                                        char c = cArr[i32];
                                                        char c2 = cArr[i30];
                                                        if (c != c2) {
                                                            i5 = i21;
                                                            if (c <= c2) {
                                                                break;
                                                            }
                                                        } else {
                                                            int i35 = i32 + 2;
                                                            byte b15 = bArr[i35];
                                                            int i36 = i30 + 2;
                                                            i5 = i21;
                                                            byte b16 = bArr[i36];
                                                            if (b15 != b16) {
                                                                if ((b15 & 255) <= (b16 & 255)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                char c3 = cArr[i33];
                                                                char c4 = cArr[i34];
                                                                if (c3 != c4) {
                                                                    if (c3 <= c4) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    int i37 = i32 + 3;
                                                                    byte b17 = bArr[i37];
                                                                    int i38 = i30 + 3;
                                                                    byte b18 = bArr[i38];
                                                                    if (b17 != b18) {
                                                                        if ((b17 & 255) <= (b18 & 255)) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        char c5 = cArr[i35];
                                                                        char c6 = cArr[i36];
                                                                        if (c5 != c6) {
                                                                            if (c5 <= c6) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            i32 += 4;
                                                                            byte b19 = bArr[i32];
                                                                            i30 += 4;
                                                                            byte b20 = bArr[i30];
                                                                            if (b19 != b20) {
                                                                                if ((b19 & 255) <= (b20 & 255)) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                char c7 = cArr[i37];
                                                                                char c8 = cArr[i38];
                                                                                if (c7 != c8) {
                                                                                    if (c7 <= c8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    if (i32 >= i14) {
                                                                                        i32 -= i14;
                                                                                    }
                                                                                    if (i30 >= i14) {
                                                                                        i30 -= i14;
                                                                                    }
                                                                                    i16++;
                                                                                    i31 -= 4;
                                                                                    i17 = i7;
                                                                                    i18 = i6;
                                                                                    i21 = i5;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i25 = i27;
                                                i13 = i8;
                                                i17 = i7;
                                                i18 = i6;
                                                i21 = i5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i9 = i26;
                    iArr[i9] = i22;
                    i19++;
                    i13 = i8;
                    i17 = i7;
                    i18 = i6;
                    i20 = i5;
                    i10 = 1;
                    i12 = 0;
                }
                int i39 = i13;
                int i40 = i17;
                int i41 = i18;
                if (z && i19 <= i2 && i16 > i15) {
                    break loop1;
                }
                i13 = i39;
                i17 = i40;
                i18 = i41;
                i10 = 1;
                i12 = 0;
            }
        }
        this.workDone = i16;
        return z && i16 > i15;
    }

    private static void vswap(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i; i4 < i3 + i; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[i2];
            iArr[i2] = i5;
            i2++;
        }
    }

    private void mainQSort3(BZip2CompressorOutputStream.Data data, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int[] iArr = this.stack_ll;
        int[] iArr2 = this.stack_hh;
        int[] iArr3 = this.stack_dd;
        int[] iArr4 = data.fmap;
        byte[] bArr = data.block;
        iArr[0] = i;
        iArr2[0] = i2;
        iArr3[0] = i3;
        boolean z2 = true;
        int i7 = 1;
        while (true) {
            int i8 = i7 - 1;
            if (i8 < 0) {
                return;
            }
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            int i11 = iArr3[i8];
            if (i10 - i9 < 20 || i11 > 10) {
                z = z2;
                if (mainSimpleSort(data, i9, i10, i11, i4)) {
                    return;
                } else {
                    i7 = i8;
                }
            } else {
                int i12 = i11 + 1;
                int iMed3 = med3(bArr[iArr4[i9] + i12], bArr[iArr4[i10] + i12], bArr[iArr4[(i9 + i10) >>> 1] + i12]) & 255;
                int i13 = i9;
                int i14 = i13;
                int i15 = i10;
                int i16 = i15;
                while (true) {
                    if (i14 <= i15) {
                        int i17 = iArr4[i14];
                        int i18 = (bArr[i17 + i12] & 255) - iMed3;
                        if (i18 == 0) {
                            iArr4[i14] = iArr4[i13];
                            iArr4[i13] = i17;
                            i13++;
                        } else {
                            if (i18 < 0) {
                            }
                            i7 = i6;
                        }
                        i14++;
                        i6 = i7;
                        i7 = i6;
                    }
                    i5 = i16;
                    while (true) {
                        if (i14 > i15) {
                            i6 = i7;
                            break;
                        }
                        int i19 = iArr4[i15];
                        i6 = i7;
                        int i20 = (bArr[i19 + i12] & 255) - iMed3;
                        if (i20 != 0) {
                            if (i20 <= 0) {
                                break;
                            }
                        } else {
                            iArr4[i15] = iArr4[i5];
                            iArr4[i5] = i19;
                            i5--;
                        }
                        i15--;
                        i7 = i6;
                    }
                    if (i14 > i15) {
                        break;
                    }
                    int i21 = iArr4[i14];
                    iArr4[i14] = iArr4[i15];
                    iArr4[i15] = i21;
                    i15--;
                    i14++;
                    i16 = i5;
                    i7 = i6;
                }
                if (i5 < i13) {
                    iArr[i8] = i9;
                    iArr2[i8] = i10;
                    iArr3[i8] = i12;
                    i7 = i6;
                    z = true;
                } else {
                    int i22 = i13 - i9;
                    int i23 = i14 - i13;
                    if (i22 >= i23) {
                        i22 = i23;
                    }
                    vswap(iArr4, i9, i14 - i22, i22);
                    int i24 = i10 - i5;
                    int i25 = i5 - i15;
                    if (i24 >= i25) {
                        i24 = i25;
                    }
                    vswap(iArr4, i14, (i10 - i24) + 1, i24);
                    int i26 = (i14 + i9) - i13;
                    int i27 = i10 - i25;
                    iArr[i8] = i9;
                    iArr2[i8] = i26 - 1;
                    iArr3[i8] = i11;
                    iArr[i6] = i26;
                    iArr2[i6] = i27;
                    iArr3[i6] = i12;
                    int i28 = i6 + 1;
                    z = true;
                    iArr[i28] = i27 + 1;
                    iArr2[i28] = i10;
                    iArr3[i28] = i11;
                    i7 = i6 + 2;
                }
            }
            z2 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        r7 = r24;
        r24 = r9;
        r9 = r5;
        r2 = r4;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r1 > r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018a, code lost:
    
        r10[r1] = r12[(r1 << 8) + r21] & org.apache.commons.compress.compressors.bzip2.BlockSort.CLEARMASK;
        r1 = r1 + 1;
        r2 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        r1 = r21 << 8;
        r2 = r12[r1] & org.apache.commons.compress.compressors.bzip2.BlockSort.CLEARMASK;
        r3 = (r21 + 1) << 8;
        r4 = r12[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a5, code lost:
    
        if (r2 >= (r4 & r0)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a7, code lost:
    
        r5 = r14[r2];
        r22 = r4;
        r0 = r13[r5] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b2, code lost:
    
        if (r11[r0] != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b4, code lost:
    
        r4 = r10[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b6, code lost:
    
        if (r5 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b8, code lost:
    
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ba, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bc, code lost:
    
        r14[r4] = r5;
        r10[r0] = r10[r0] + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c4, code lost:
    
        r2 = r2 + 1;
        r4 = r22;
        r0 = org.apache.commons.compress.compressors.bzip2.BlockSort.CLEARMASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cc, code lost:
    
        r0 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ce, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d0, code lost:
    
        if (r0 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d2, code lost:
    
        r2 = (r0 << 8) + r21;
        r12[r2] = r12[r2] | org.apache.commons.compress.compressors.bzip2.BlockSort.SETMASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dd, code lost:
    
        r11[r21] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e1, code lost:
    
        if (r9 >= 255) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
    
        r1 = r12[r1] & org.apache.commons.compress.compressors.bzip2.BlockSort.CLEARMASK;
        r2 = (org.apache.commons.compress.compressors.bzip2.BlockSort.CLEARMASK & r12[r3]) - r1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f4, code lost:
    
        if ((r2 >> r3) <= 65534) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f6, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        if (r4 >= r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01fd, code lost:
    
        r5 = r14[r1 + r4];
        r0 = (char) (r4 >> r3);
        r15[r5] = r0;
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        if (r5 >= 20) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020c, code lost:
    
        r15[(r5 + r31) + 1] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0211, code lost:
    
        r4 = r4 + 1;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0218, code lost:
    
        r5 = r9 + 1;
        r9 = r24;
        r4 = 255;
        r24 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void mainSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r30, int r31) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.bzip2.BlockSort.mainSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data, int):void");
    }
}
