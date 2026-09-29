package kotlin;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class getIds {
    static final long RemoteActionCompatParcelizer = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract IconCompatParcelizer IconCompatParcelizer();

    public void write() {
    }

    public MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable) {
        return IconCompatParcelizer(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        IconCompatParcelizer IconCompatParcelizer2 = IconCompatParcelizer();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(getPaymentRefIds.RemoteActionCompatParcelizer(runnable), IconCompatParcelizer2);
        IconCompatParcelizer2.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, j, timeUnit);
        return audioAttributesCompatParcelizer;
    }

    public MarkIncompleteResponseBody write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IconCompatParcelizer IconCompatParcelizer2 = IconCompatParcelizer();
        write writeVar = new write(getPaymentRefIds.RemoteActionCompatParcelizer(runnable), IconCompatParcelizer2);
        MarkIncompleteResponseBody markIncompleteResponseBody = IconCompatParcelizer2.read(writeVar, j, j2, timeUnit);
        return markIncompleteResponseBody == isLessonPaid.INSTANCE ? markIncompleteResponseBody : writeVar;
    }

    public static abstract class IconCompatParcelizer implements MarkIncompleteResponseBody {
        public abstract MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit);

        public MarkIncompleteResponseBody read(Runnable runnable) {
            return RemoteActionCompatParcelizer(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public final MarkIncompleteResponseBody read(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            getTimelineTitle gettimelinetitle = new getTimelineTitle();
            getTimelineTitle gettimelinetitle2 = new getTimelineTitle(gettimelinetitle);
            Runnable runnableRemoteActionCompatParcelizer = getPaymentRefIds.RemoteActionCompatParcelizer(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jWrite = write(TimeUnit.NANOSECONDS);
            MarkIncompleteResponseBody markIncompleteResponseBodyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(new read(jWrite + timeUnit.toNanos(j), runnableRemoteActionCompatParcelizer, jWrite, gettimelinetitle2, nanos), j, timeUnit);
            if (markIncompleteResponseBodyRemoteActionCompatParcelizer == isLessonPaid.INSTANCE) {
                return markIncompleteResponseBodyRemoteActionCompatParcelizer;
            }
            gettimelinetitle.AudioAttributesCompatParcelizer(markIncompleteResponseBodyRemoteActionCompatParcelizer);
            return gettimelinetitle2;
        }

        public static long write(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: loaded from: classes5.dex */
        final class read implements Runnable {
            private long AudioAttributesCompatParcelizer;
            private long AudioAttributesImplApi26Parcelizer;
            private Runnable IconCompatParcelizer;
            private getTimelineTitle RemoteActionCompatParcelizer;
            private long read;
            private long write;

            read(long j, Runnable runnable, long j2, getTimelineTitle gettimelinetitle, long j3) {
                this.IconCompatParcelizer = runnable;
                this.RemoteActionCompatParcelizer = gettimelinetitle;
                this.read = j3;
                this.write = j2;
                this.AudioAttributesImplApi26Parcelizer = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.IconCompatParcelizer.run();
                if (this.RemoteActionCompatParcelizer.write()) {
                    return;
                }
                long jWrite = IconCompatParcelizer.write(TimeUnit.NANOSECONDS);
                long j2 = getIds.RemoteActionCompatParcelizer;
                long j3 = this.write;
                if (j2 + jWrite < j3 || jWrite >= j3 + this.read + getIds.RemoteActionCompatParcelizer) {
                    long j4 = this.read;
                    long j5 = jWrite + j4;
                    long j6 = this.AudioAttributesCompatParcelizer + 1;
                    this.AudioAttributesCompatParcelizer = j6;
                    this.AudioAttributesImplApi26Parcelizer = j5 - (j4 * j6);
                    j = j5;
                } else {
                    long j7 = this.AudioAttributesImplApi26Parcelizer;
                    long j8 = this.AudioAttributesCompatParcelizer + 1;
                    this.AudioAttributesCompatParcelizer = j8;
                    j = j7 + (j8 * this.read);
                }
                this.write = jWrite;
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer.this.RemoteActionCompatParcelizer(this, j - jWrite, TimeUnit.NANOSECONDS));
            }
        }
    }

    static final class write implements MarkIncompleteResponseBody, Runnable {
        private Runnable IconCompatParcelizer;
        private volatile boolean RemoteActionCompatParcelizer;
        private IconCompatParcelizer write;

        write(Runnable runnable, IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = runnable;
            this.write = iconCompatParcelizer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            try {
                this.IconCompatParcelizer.run();
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                this.write.aL_();
                throw OrderDetails.RemoteActionCompatParcelizer(th);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.RemoteActionCompatParcelizer = true;
            this.write.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static final class AudioAttributesCompatParcelizer implements MarkIncompleteResponseBody, Runnable {
        private Runnable IconCompatParcelizer;
        private Thread RemoteActionCompatParcelizer;
        private IconCompatParcelizer write;

        AudioAttributesCompatParcelizer(Runnable runnable, IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = runnable;
            this.write = iconCompatParcelizer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.RemoteActionCompatParcelizer = Thread.currentThread();
            try {
                this.IconCompatParcelizer.run();
            } finally {
                aL_();
                this.RemoteActionCompatParcelizer = null;
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (this.RemoteActionCompatParcelizer == Thread.currentThread()) {
                IconCompatParcelizer iconCompatParcelizer = this.write;
                if (iconCompatParcelizer instanceof getCouponCode) {
                    ((getCouponCode) iconCompatParcelizer).read();
                    return;
                }
            }
            this.write.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.write.write();
        }
    }
}
