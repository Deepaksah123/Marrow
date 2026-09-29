package kotlin;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.getIds;

/* JADX INFO: loaded from: classes.dex */
public final class setCouponCode extends getIds {
    private static final setCouponCode IconCompatParcelizer = new setCouponCode();

    public static setCouponCode AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    setCouponCode() {
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable) {
        getPaymentRefIds.RemoteActionCompatParcelizer(runnable).run();
        return isLessonPaid.INSTANCE;
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            getPaymentRefIds.RemoteActionCompatParcelizer(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            getPaymentRefIds.RemoteActionCompatParcelizer(e);
        }
        return isLessonPaid.INSTANCE;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer extends getIds.IconCompatParcelizer {
        volatile boolean IconCompatParcelizer;
        final PriorityBlockingQueue<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer = new PriorityBlockingQueue<>();
        private final AtomicInteger write = new AtomicInteger();
        private AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger();

        IconCompatParcelizer() {
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody read(Runnable runnable) {
            return RemoteActionCompatParcelizer(runnable, write(TimeUnit.MILLISECONDS));
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
            long jWrite = write(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return RemoteActionCompatParcelizer(new write(runnable, this, jWrite), jWrite);
        }

        private MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j) {
            if (this.IconCompatParcelizer) {
                return isLessonPaid.INSTANCE;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(runnable, Long.valueOf(j), this.RemoteActionCompatParcelizer.incrementAndGet());
            this.AudioAttributesCompatParcelizer.add(audioAttributesCompatParcelizer);
            if (this.write.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.IconCompatParcelizer) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPoll = this.AudioAttributesCompatParcelizer.poll();
                    if (audioAttributesCompatParcelizerPoll != null) {
                        if (!audioAttributesCompatParcelizerPoll.IconCompatParcelizer) {
                            audioAttributesCompatParcelizerPoll.RemoteActionCompatParcelizer.run();
                        }
                    } else {
                        iAddAndGet = this.write.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return isLessonPaid.INSTANCE;
                        }
                    }
                }
                this.AudioAttributesCompatParcelizer.clear();
                return isLessonPaid.INSTANCE;
            }
            return StubResponseBody.write(new write(audioAttributesCompatParcelizer));
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.IconCompatParcelizer = true;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.IconCompatParcelizer;
        }

        final class write implements Runnable {
            private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

            write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer = true;
                IconCompatParcelizer.this.AudioAttributesCompatParcelizer.remove(this.AudioAttributesCompatParcelizer);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer implements Comparable<AudioAttributesCompatParcelizer> {
        private int AudioAttributesCompatParcelizer;
        volatile boolean IconCompatParcelizer;
        final Runnable RemoteActionCompatParcelizer;
        private long read;

        AudioAttributesCompatParcelizer(Runnable runnable, Long l, int i) {
            this.RemoteActionCompatParcelizer = runnable;
            this.read = l.longValue();
            this.AudioAttributesCompatParcelizer = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            int iRemoteActionCompatParcelizer = setHasPyt.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read);
            return iRemoteActionCompatParcelizer == 0 ? setHasPyt.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) : iRemoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write implements Runnable {
        private final Runnable RemoteActionCompatParcelizer;
        private final long read;
        private final IconCompatParcelizer write;

        write(Runnable runnable, IconCompatParcelizer iconCompatParcelizer, long j) {
            this.RemoteActionCompatParcelizer = runnable;
            this.write = iconCompatParcelizer;
            this.read = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.write.IconCompatParcelizer) {
                return;
            }
            long jWrite = IconCompatParcelizer.write(TimeUnit.MILLISECONDS);
            long j = this.read;
            if (j > jWrite) {
                try {
                    Thread.sleep(j - jWrite);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    getPaymentRefIds.RemoteActionCompatParcelizer(e);
                    return;
                }
            }
            if (this.write.IconCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer.run();
        }
    }
}
