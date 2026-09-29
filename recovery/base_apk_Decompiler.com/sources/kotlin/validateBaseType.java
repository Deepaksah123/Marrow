package kotlin;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class validateBaseType {
    private final Object RemoteActionCompatParcelizer = new Object();
    private final PriorityQueue<Integer> IconCompatParcelizer = new PriorityQueue<>(10, Collections.reverseOrder());
    private int read = Integer.MIN_VALUE;

    public final void AudioAttributesCompatParcelizer(int i) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.add(Integer.valueOf(i));
            this.read = Math.max(this.read, i);
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.remove(Integer.valueOf(i));
            this.read = this.IconCompatParcelizer.isEmpty() ? Integer.MIN_VALUE : ((Integer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.peek())).intValue();
            this.RemoteActionCompatParcelizer.notifyAll();
        }
    }
}
