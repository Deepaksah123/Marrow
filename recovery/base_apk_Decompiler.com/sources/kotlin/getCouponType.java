package kotlin;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class getCouponType extends AtomicLong implements ThreadFactory {
    private boolean RemoteActionCompatParcelizer;
    private String read;
    private int write;

    public getCouponType(String str) {
        this(str, 5, false);
    }

    public getCouponType(String str, int i) {
        this(str, i, false);
    }

    public getCouponType(String str, int i, boolean z) {
        this.read = str;
        this.write = i;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.read);
        sb.append('-');
        sb.append(incrementAndGet());
        String string = sb.toString();
        Thread readVar = this.RemoteActionCompatParcelizer ? new read(runnable, string) : new Thread(runnable, string);
        readVar.setPriority(this.write);
        readVar.setDaemon(true);
        return readVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.read);
        sb.append("]");
        return sb.toString();
    }

    static final class read extends Thread implements getDaysExtension {
        read(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}
