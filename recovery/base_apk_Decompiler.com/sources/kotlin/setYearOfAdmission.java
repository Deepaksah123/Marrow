package kotlin;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class setYearOfAdmission implements setYearOfPassout {
    private final Future<?> read;

    public setYearOfAdmission(Future<?> future) {
        this.read = future;
    }

    @Override // kotlin.setYearOfPassout
    public final void write() {
        this.read.cancel(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposableFutureHandle[");
        sb.append(this.read);
        sb.append(']');
        return sb.toString();
    }
}
