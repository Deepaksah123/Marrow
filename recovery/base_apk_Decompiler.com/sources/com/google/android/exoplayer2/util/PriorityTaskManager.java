package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* JADX INFO: loaded from: classes5.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            StringBuilder sb = new StringBuilder("Priority too low [priority=");
            sb.append(i);
            sb.append(", highest=");
            sb.append(i2);
            sb.append("]");
            super(sb.toString());
        }
    }

    public final void add(int i) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i));
            this.highestPriority = Math.max(this.highestPriority, i);
        }
    }

    public final void proceed(int i) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i) {
                this.lock.wait();
            }
        }
    }

    public final boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.lock) {
            z = this.highestPriority == i;
        }
        return z;
    }

    public final void proceedOrThrow(int i) throws PriorityTooLowException {
        synchronized (this.lock) {
            if (this.highestPriority != i) {
                throw new PriorityTooLowException(i, this.highestPriority);
            }
        }
    }

    public final void remove(int i) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
