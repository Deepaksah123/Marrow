package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final PlayerMessage setType(int i) {
        Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public final int getType() {
        return this.type;
    }

    public final PlayerMessage setPayload(Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public final Object getPayload() {
        return this.payload;
    }

    @Deprecated
    public final PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public final PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    public final Looper getLooper() {
        return this.looper;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final PlayerMessage setPosition(long j) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public final PlayerMessage setPosition(int i, long j) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j != C.TIME_UNSET);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i, j);
        }
        this.mediaItemIndex = i;
        this.positionMs = j;
        return this;
    }

    public final int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public final PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public final boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public final PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public final PlayerMessage cancel() {
        synchronized (this) {
            Assertions.checkState(this.isSent);
            this.isCanceled = true;
            markAsProcessed(false);
        }
        return this;
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.isCanceled;
        }
        return z;
    }

    public final void markAsProcessed(boolean z) {
        synchronized (this) {
            this.isDelivered = z | this.isDelivered;
            this.isProcessed = true;
            notifyAll();
        }
    }

    public final boolean blockUntilDelivered() throws InterruptedException {
        boolean z;
        synchronized (this) {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
            z = this.isDelivered;
        }
        return z;
    }

    public final boolean blockUntilDelivered(long j) throws InterruptedException, TimeoutException {
        boolean z;
        boolean z2;
        synchronized (this) {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long jElapsedRealtime2 = j;
            while (true) {
                z = this.isProcessed;
                if (z || jElapsedRealtime2 <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(jElapsedRealtime2);
                jElapsedRealtime2 = (jElapsedRealtime + j) - this.clock.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
            z2 = this.isDelivered;
        }
        return z2;
    }
}
