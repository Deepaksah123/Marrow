package kotlin;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
public final class belongsToCourseId extends getIds {
    static final getCouponType AudioAttributesCompatParcelizer;
    private static getCouponType AudioAttributesImplBaseParcelizer;
    private static final TimeUnit IconCompatParcelizer = TimeUnit.SECONDS;
    private static IconCompatParcelizer read;
    static final write write;
    private ThreadFactory AudioAttributesImplApi21Parcelizer;
    private AtomicReference<IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;

    static {
        write writeVar = new write(new getCouponType("RxCachedThreadSchedulerShutdown"));
        write = writeVar;
        writeVar.aL_();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        getCouponType getcoupontype = new getCouponType("RxCachedThreadScheduler", iMax);
        AudioAttributesImplBaseParcelizer = getcoupontype;
        AudioAttributesCompatParcelizer = new getCouponType("RxCachedWorkerPoolEvictor", iMax);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(0L, null, getcoupontype);
        read = iconCompatParcelizer;
        iconCompatParcelizer.write();
    }

    static final class IconCompatParcelizer implements Runnable {
        private final ConcurrentLinkedQueue<write> AudioAttributesCompatParcelizer;
        private final ThreadFactory AudioAttributesImplApi21Parcelizer;
        private final ScheduledExecutorService IconCompatParcelizer;
        private final long RemoteActionCompatParcelizer;
        private getSno read;
        private final Future<?> write;

        IconCompatParcelizer(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.RemoteActionCompatParcelizer = nanos;
            this.AudioAttributesCompatParcelizer = new ConcurrentLinkedQueue<>();
            this.read = new getSno();
            this.AudioAttributesImplApi21Parcelizer = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, belongsToCourseId.AudioAttributesCompatParcelizer);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.IconCompatParcelizer = scheduledExecutorServiceNewScheduledThreadPool;
            this.write = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AudioAttributesCompatParcelizer();
        }

        final write read() {
            if (this.read.write()) {
                return belongsToCourseId.write;
            }
            while (!this.AudioAttributesCompatParcelizer.isEmpty()) {
                write writeVarPoll = this.AudioAttributesCompatParcelizer.poll();
                if (writeVarPoll != null) {
                    return writeVarPoll;
                }
            }
            write writeVar = new write(this.AudioAttributesImplApi21Parcelizer);
            this.read.read(writeVar);
            return writeVar;
        }

        final void AudioAttributesCompatParcelizer(write writeVar) {
            writeVar.IconCompatParcelizer(IconCompatParcelizer() + this.RemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer.offer(writeVar);
        }

        private void AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer.isEmpty()) {
                return;
            }
            long jIconCompatParcelizer = IconCompatParcelizer();
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                if (writeVar.RemoteActionCompatParcelizer() > jIconCompatParcelizer) {
                    return;
                }
                if (this.AudioAttributesCompatParcelizer.remove(writeVar)) {
                    this.read.RemoteActionCompatParcelizer(writeVar);
                }
            }
        }

        private static long IconCompatParcelizer() {
            return System.nanoTime();
        }

        final void write() {
            this.read.aL_();
            Future<?> future = this.write;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.IconCompatParcelizer;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public belongsToCourseId() {
        this(AudioAttributesImplBaseParcelizer);
    }

    private belongsToCourseId(ThreadFactory threadFactory) {
        this.AudioAttributesImplApi21Parcelizer = threadFactory;
        this.MediaBrowserCompatCustomActionResultReceiver = new AtomicReference<>(read);
        write();
    }

    @Override // kotlin.getIds
    public final void write() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(60L, IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (setBackInvokedCallbackEnabled.read(this.MediaBrowserCompatCustomActionResultReceiver, read, iconCompatParcelizer)) {
            return;
        }
        iconCompatParcelizer.write();
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new read(this.MediaBrowserCompatCustomActionResultReceiver.get());
    }

    static final class read extends getIds.IconCompatParcelizer {
        private final IconCompatParcelizer AudioAttributesCompatParcelizer;
        private final write IconCompatParcelizer;
        private AtomicBoolean read = new AtomicBoolean();
        private final getSno write = new getSno();

        read(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            this.IconCompatParcelizer = iconCompatParcelizer.read();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (this.read.compareAndSet(false, true)) {
                this.write.aL_();
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.read.get();
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.write.write()) {
                return isLessonPaid.INSTANCE;
            }
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(runnable, j, timeUnit, this.write);
        }
    }

    static final class write extends getCouponCode {
        private long RemoteActionCompatParcelizer;

        write(ThreadFactory threadFactory) {
            super(threadFactory);
            this.RemoteActionCompatParcelizer = 0L;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void IconCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
        }
    }
}
