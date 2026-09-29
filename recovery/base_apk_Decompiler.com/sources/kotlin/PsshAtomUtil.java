package kotlin;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
final class PsshAtomUtil {
    static void write(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
