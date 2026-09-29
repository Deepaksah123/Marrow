package kotlin;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class setSkipped implements setMaxMcqCount {
    private final Future<?> write;

    public setSkipped(Future<?> future) {
        this.write = future;
    }

    @Override // kotlin.setMaxMcqCount
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        this.write.cancel(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelFutureOnCancel[");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }
}
