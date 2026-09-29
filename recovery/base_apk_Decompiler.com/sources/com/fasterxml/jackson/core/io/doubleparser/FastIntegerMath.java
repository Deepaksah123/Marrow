package com.fasterxml.jackson.core.io.doubleparser;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlin.VideoAnalyticModule;

/* JADX INFO: loaded from: classes2.dex */
class FastIntegerMath {
    public static final BigInteger FIVE = BigInteger.valueOf(5);
    static final BigInteger TEN_POW_16 = BigInteger.valueOf(10000000000000000L);
    static final BigInteger FIVE_POW_16 = BigInteger.valueOf(152587890625L);
    private static final BigInteger[] SMALL_POWERS_OF_TEN = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(C.NANOS_PER_SECOND), BigInteger.valueOf(VideoAnalyticModule.IDLE_CONNECTION_HEALTHY_NS), BigInteger.valueOf(100000000000L), BigInteger.valueOf(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    public static long estimateNumBits(long j) {
        return ((j * 3402) >>> 10) + 1;
    }

    static int splitFloor16(int i, int i2) {
        return i2 - ((((i2 - ((i + i2) >>> 1)) + 15) >> 4) << 4);
    }

    static BigInteger computePowerOfTen(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        BigInteger[] bigIntegerArr = SMALL_POWERS_OF_TEN;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        if (navigableMap != null) {
            Map.Entry<Integer, BigInteger> entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i));
            Integer key = entryFloorEntry.getKey();
            if (key.intValue() == i) {
                return entryFloorEntry.getValue();
            }
            return FftMultiplier.multiply(entryFloorEntry.getValue(), computePowerOfTen(navigableMap, i - key.intValue()));
        }
        return FIVE.pow(i).shiftLeft(i);
    }

    static BigInteger computeTenRaisedByNFloor16Recursive(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        int i2 = i & (-16);
        Map.Entry<Integer, BigInteger> entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i2));
        int iIntValue = entryFloorEntry.getKey().intValue();
        BigInteger value = entryFloorEntry.getValue();
        if (iIntValue == i2) {
            return value;
        }
        int i3 = i2 - iIntValue;
        BigInteger bigIntegerComputeTenRaisedByNFloor16Recursive = (BigInteger) navigableMap.get(Integer.valueOf(i3));
        if (bigIntegerComputeTenRaisedByNFloor16Recursive == null) {
            bigIntegerComputeTenRaisedByNFloor16Recursive = computeTenRaisedByNFloor16Recursive(navigableMap, i3);
            navigableMap.put(Integer.valueOf(i3), bigIntegerComputeTenRaisedByNFloor16Recursive);
        }
        return FftMultiplier.multiply(value, bigIntegerComputeTenRaisedByNFloor16Recursive);
    }

    static NavigableMap<Integer, BigInteger> createPowersOfTenFloor16Map() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, TEN_POW_16);
        return treeMap;
    }

    static NavigableMap<Integer, BigInteger> fillPowersOf10Floor16(int i, int i2) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, FIVE_POW_16);
        fillPowersOfNFloor16Recursive(treeMap, i, i2);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        return treeMap;
    }

    static void fillPowersOfNFloor16Recursive(NavigableMap<Integer, BigInteger> navigableMap, int i, int i2) {
        if (i2 - i > 18) {
            int iSplitFloor16 = splitFloor16(i, i2);
            int i3 = i2 - iSplitFloor16;
            if (navigableMap.containsKey(Integer.valueOf(i3))) {
                return;
            }
            fillPowersOfNFloor16Recursive(navigableMap, i, iSplitFloor16);
            fillPowersOfNFloor16Recursive(navigableMap, iSplitFloor16, i2);
            navigableMap.put(Integer.valueOf(i3), computeTenRaisedByNFloor16Recursive(navigableMap, i3));
        }
    }

    static UInt128 fullMultiplication(long j, long j2) {
        long j3 = -1;
        long j4 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        long j5 = j >>> 32;
        long j6 = -1;
        long j7 = j2 & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
        long j8 = j2 >>> 32;
        long j9 = j8 * j4;
        long j10 = j4 * j7;
        long j11 = -1;
        long j12 = (j7 * j5) + (j10 >>> 32) + (((j11 - ((j11 >> 63) << 32)) | (((long) 0) << 32)) & j9);
        long j13 = (j5 * j8) + (j12 >>> 32) + (j9 >>> 32);
        long j14 = j12 << 32;
        long j15 = -1;
        return new UInt128(j13, j14 | (((((long) 0) << 32) | (j15 - ((j15 >> 63) << 32))) & j10));
    }

    static class UInt128 {
        final long high;
        final long low;

        private UInt128(long j, long j2) {
            this.high = j;
            this.low = j2;
        }
    }
}
