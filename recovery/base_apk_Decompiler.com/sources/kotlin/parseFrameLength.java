package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class parseFrameLength {
    private final AtomicInteger write = new AtomicInteger();
    private final AtomicInteger read = new AtomicInteger();

    public final void RemoteActionCompatParcelizer() {
        this.write.getAndIncrement();
    }

    public final void IconCompatParcelizer() {
        this.read.getAndIncrement();
    }

    public final void read() {
        this.read.set(0);
    }
}
