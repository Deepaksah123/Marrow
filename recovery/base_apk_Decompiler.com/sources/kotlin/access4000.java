package kotlin;

import java.util.Queue;
import kotlin.setRelativeToDefaultPosition;

/* JADX INFO: loaded from: classes2.dex */
abstract class access4000<T extends setRelativeToDefaultPosition> {
    private final Queue<T> IconCompatParcelizer = moveMediaSourceRange.write(20);

    abstract T read();

    access4000() {
    }

    final T write() {
        T tPoll = this.IconCompatParcelizer.poll();
        return tPoll == null ? (T) read() : tPoll;
    }

    public final void read(T t) {
        if (this.IconCompatParcelizer.size() < 20) {
            this.IconCompatParcelizer.offer(t);
        }
    }
}
