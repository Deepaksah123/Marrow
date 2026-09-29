package kotlin;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class setChannelCount implements ThreadFactory {
    private static final AtomicInteger IconCompatParcelizer = new AtomicInteger(1);
    private final String RemoteActionCompatParcelizer;
    private final ThreadGroup read;
    private final AtomicInteger write = new AtomicInteger(1);

    public setChannelCount() {
        SecurityManager securityManager = System.getSecurityManager();
        this.read = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        StringBuilder sb = new StringBuilder("lottie-");
        sb.append(IconCompatParcelizer.getAndIncrement());
        sb.append("-thread-");
        this.RemoteActionCompatParcelizer = sb.toString();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.read;
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(this.write.getAndIncrement());
        Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
