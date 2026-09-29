package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class isCurrentMediaItemLive extends CancellationException {
    private final int read;

    public isCurrentMediaItemLive(int i) {
        this.read = i;
    }

    public final int write() {
        return this.read;
    }
}
