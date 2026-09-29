package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public final void sharedInitializeOrWait(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        synchronized (this) {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j3 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !isInitialized()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("TimestampAdjuster failed to initialize in ");
                            sb.append(j2);
                            sb.append(" milliseconds");
                            throw new TimeoutException(sb.toString());
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        }
    }

    public final long getFirstSampleTimestampUs() {
        long j;
        synchronized (this) {
            j = this.firstSampleTimestampUs;
            if (j == Long.MAX_VALUE || j == MODE_SHARED) {
                j = C.TIME_UNSET;
            }
        }
        return j;
    }

    public final long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        synchronized (this) {
            long j = this.lastUnadjustedTimestampUs;
            if (j != C.TIME_UNSET) {
                firstSampleTimestampUs = j + this.timestampOffsetUs;
            } else {
                firstSampleTimestampUs = getFirstSampleTimestampUs();
            }
        }
        return firstSampleTimestampUs;
    }

    public final long getTimestampOffsetUs() {
        long j;
        synchronized (this) {
            j = this.timestampOffsetUs;
        }
        return j;
    }

    public final void reset(long j) {
        synchronized (this) {
            this.firstSampleTimestampUs = j;
            this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.lastUnadjustedTimestampUs = C.TIME_UNSET;
        }
    }

    public final long adjustTsTimestamp(long j) {
        long j2;
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            long j3 = this.lastUnadjustedTimestampUs;
            if (j3 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j3);
                long j4 = 0;
                long j5 = 0;
                long j6 = (((((long) 1) << 32) | (j4 - ((j4 >> 63) << 32))) + jUsToNonWrappedPts) / ((((long) 2) << 32) | (j5 - ((j5 >> 63) << 32)));
                long j7 = 0;
                long j8 = ((j6 - 1) * ((((long) 2) << 32) | (j7 - ((j7 >> 63) << 32)))) + j;
                long j9 = 0;
                j2 = j + (j6 * ((((long) 2) << 32) | (j9 - ((j9 >> 63) << 32))));
                if (Math.abs(j8 - jUsToNonWrappedPts) < Math.abs(j2 - jUsToNonWrappedPts)) {
                    j2 = j8;
                }
            } else {
                j2 = j;
            }
            return adjustSampleTimestamp(ptsToUs(j2));
        }
    }

    public final long adjustSampleTimestamp(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        }
    }

    public final boolean isInitialized() {
        boolean z;
        synchronized (this) {
            z = this.timestampOffsetUs != C.TIME_UNSET;
        }
        return z;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToWrappedPts(long j) {
        long j2 = 0;
        return usToNonWrappedPts(j) % ((((long) 2) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }
}
