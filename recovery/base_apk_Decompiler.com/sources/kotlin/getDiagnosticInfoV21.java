package kotlin;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class getDiagnosticInfoV21 {
    private final IntArrayQueue IconCompatParcelizer = IntArrayQueue.RemoteActionCompatParcelizer();
    private long read;
    private int write;
    private static final long RemoteActionCompatParcelizer = TimeUnit.HOURS.toMillis(24);
    private static final long AudioAttributesCompatParcelizer = TimeUnit.MINUTES.toMillis(30);

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private static boolean IconCompatParcelizer(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    getDiagnosticInfoV21() {
    }

    public final void RemoteActionCompatParcelizer(int i) {
        synchronized (this) {
            if (AudioAttributesCompatParcelizer(i)) {
                AudioAttributesCompatParcelizer();
                return;
            }
            this.write++;
            this.read = this.IconCompatParcelizer.AudioAttributesCompatParcelizer() + read(i);
        }
    }

    private void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            this.write = 0;
        }
    }

    private long read(int i) {
        synchronized (this) {
            if (!IconCompatParcelizer(i)) {
                return RemoteActionCompatParcelizer;
            }
            return (long) Math.min(Math.pow(2.0d, this.write) + IntArrayQueue.write(), AudioAttributesCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.write     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            o.IntArrayQueue r0 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L16
            long r0 = r0.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L16
            long r2 = r4.read     // Catch: java.lang.Throwable -> L16
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            monitor-exit(r4)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDiagnosticInfoV21.write():boolean");
    }
}
