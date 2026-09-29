package kotlin;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class MinimalClassNameIdResolver {
    private long AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private long read;
    private final ThreadLocal<Long> write = new ThreadLocal<>();

    public MinimalClassNameIdResolver(long j) {
        MediaBrowserCompatCustomActionResultReceiver(j);
    }

    public final void read(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        synchronized (this) {
            buildTypeSerializer.write(this.IconCompatParcelizer == TimestampAdjuster.MODE_SHARED);
            if (read()) {
                return;
            }
            if (z) {
                this.write.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!read()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        buildTypeSerializer.write(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !read()) {
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

    public final long AudioAttributesCompatParcelizer() {
        long j;
        synchronized (this) {
            j = this.IconCompatParcelizer;
            if (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) {
                j = C.TIME_UNSET;
            }
        }
        return j;
    }

    public final long IconCompatParcelizer() {
        long jAudioAttributesCompatParcelizer;
        synchronized (this) {
            long j = this.AudioAttributesCompatParcelizer;
            if (j != C.TIME_UNSET) {
                jAudioAttributesCompatParcelizer = j + this.read;
            } else {
                jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            }
        }
        return jAudioAttributesCompatParcelizer;
    }

    public final long write() {
        long j;
        synchronized (this) {
            j = this.read;
        }
        return j;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(long j) {
        synchronized (this) {
            this.IconCompatParcelizer = j;
            this.read = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.AudioAttributesCompatParcelizer = C.TIME_UNSET;
        }
    }

    public final long write(long j) {
        long j2;
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            long j3 = this.AudioAttributesCompatParcelizer;
            if (j3 != C.TIME_UNSET) {
                long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(j3);
                long j4 = 0;
                long j5 = 0;
                long j6 = (((((long) 1) << 32) | (j4 - ((j4 >> 63) << 32))) + jMediaBrowserCompatItemReceiver) / ((((long) 2) << 32) | (j5 - ((j5 >> 63) << 32)));
                long j7 = 0;
                long j8 = ((j6 - 1) * ((((long) 2) << 32) | (j7 - ((j7 >> 63) << 32)))) + j;
                long j9 = 0;
                j2 = j + (j6 * ((((long) 2) << 32) | (j9 - ((j9 >> 63) << 32))));
                if (Math.abs(j8 - jMediaBrowserCompatItemReceiver) < Math.abs(j2 - jMediaBrowserCompatItemReceiver)) {
                    j2 = j8;
                }
            } else {
                j2 = j;
            }
            return RemoteActionCompatParcelizer(IconCompatParcelizer(j2));
        }
    }

    public final long AudioAttributesCompatParcelizer(long j) {
        long j2;
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            long j3 = this.AudioAttributesCompatParcelizer;
            if (j3 != C.TIME_UNSET) {
                long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(j3);
                long j4 = 0;
                long j5 = jMediaBrowserCompatItemReceiver / ((((long) 2) << 32) | (j4 - ((j4 >> 63) << 32)));
                long j6 = 0;
                long j7 = (((((long) 2) << 32) | (j6 - ((j6 >> 63) << 32))) * j5) + j;
                long j8 = 0;
                j2 = j + ((j5 + 1) * ((((long) 2) << 32) | (j8 - ((j8 >> 63) << 32))));
                if (j7 >= jMediaBrowserCompatItemReceiver) {
                    j2 = j7;
                }
            } else {
                j2 = j;
            }
            return RemoteActionCompatParcelizer(IconCompatParcelizer(j2));
        }
    }

    public final long RemoteActionCompatParcelizer(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            if (!read()) {
                long jLongValue = this.IconCompatParcelizer;
                if (jLongValue == TimestampAdjuster.MODE_SHARED) {
                    jLongValue = ((Long) buildTypeSerializer.IconCompatParcelizer(this.write.get())).longValue();
                }
                this.read = jLongValue - j;
                notifyAll();
            }
            this.AudioAttributesCompatParcelizer = j;
            return j + this.read;
        }
    }

    public final boolean read() {
        boolean z;
        synchronized (this) {
            z = this.read != C.TIME_UNSET;
        }
        return z;
    }

    public static long IconCompatParcelizer(long j) {
        return (j * 1000000) / 90000;
    }

    public static long read(long j) {
        long j2 = 0;
        return MediaBrowserCompatItemReceiver(j) % ((((long) 2) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    private static long MediaBrowserCompatItemReceiver(long j) {
        return (j * 90000) / 1000000;
    }
}
