package kotlin;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.calculateAccumulatedSampleSizes;
import kotlin.setFormatGaplessInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class buildPsshAtom {
    public static Executor IconCompatParcelizer() {
        return lambdaprocessMoovAtom1.INSTANCE;
    }

    public static updateSampleIndex RemoteActionCompatParcelizer(ExecutorService executorService) {
        if (executorService instanceof updateSampleIndex) {
            return (updateSampleIndex) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new RemoteActionCompatParcelizer((ScheduledExecutorService) executorService);
        }
        return new AudioAttributesCompatParcelizer(executorService);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class AudioAttributesCompatParcelizer extends parseUint8AttributeValue {
        private final ExecutorService write;

        AudioAttributesCompatParcelizer(ExecutorService executorService) {
            this.write = (ExecutorService) parseStsd.IconCompatParcelizer(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.write.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.write.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.write.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.write.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.write.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.write.execute(runnable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[");
            sb.append(this.write);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer implements Mp4ExtractorExternalSyntheticLambda1 {
        private ScheduledExecutorService AudioAttributesCompatParcelizer;

        RemoteActionCompatParcelizer(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.AudioAttributesCompatParcelizer = (ScheduledExecutorService) parseStsd.IconCompatParcelizer(scheduledExecutorService);
        }

        @Override // kotlin.Mp4ExtractorExternalSyntheticLambda1, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final readSefData<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            parseSchemeSpecificData parseschemespecificdata = parseSchemeSpecificData.read(runnable, (Object) null);
            return new write(parseschemespecificdata, this.AudioAttributesCompatParcelizer.schedule(parseschemespecificdata, j, timeUnit));
        }

        @Override // kotlin.Mp4ExtractorExternalSyntheticLambda1, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final <V> readSefData<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            parseSchemeSpecificData parseschemespecificdataAudioAttributesCompatParcelizer = parseSchemeSpecificData.AudioAttributesCompatParcelizer((Callable) callable);
            return new write(parseschemespecificdataAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer.schedule(parseschemespecificdataAudioAttributesCompatParcelizer, j, timeUnit));
        }

        @Override // kotlin.Mp4ExtractorExternalSyntheticLambda1, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final readSefData<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0066RemoteActionCompatParcelizer runnableC0066RemoteActionCompatParcelizer = new RunnableC0066RemoteActionCompatParcelizer(runnable);
            return new write(runnableC0066RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.scheduleAtFixedRate(runnableC0066RemoteActionCompatParcelizer, j, j2, timeUnit));
        }

        @Override // kotlin.Mp4ExtractorExternalSyntheticLambda1, java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: write */
        public final readSefData<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0066RemoteActionCompatParcelizer runnableC0066RemoteActionCompatParcelizer = new RunnableC0066RemoteActionCompatParcelizer(runnable);
            return new write(runnableC0066RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.scheduleWithFixedDelay(runnableC0066RemoteActionCompatParcelizer, j, j2, timeUnit));
        }

        static final class write<V> extends calculateAccumulatedSampleSizes.IconCompatParcelizer<V> implements readSefData<V> {
            private final ScheduledFuture<?> AudioAttributesCompatParcelizer;

            public write(Mp4ExtractorExternalSyntheticLambda0<V> mp4ExtractorExternalSyntheticLambda0, ScheduledFuture<?> scheduledFuture) {
                super(mp4ExtractorExternalSyntheticLambda0);
                this.AudioAttributesCompatParcelizer = scheduledFuture;
            }

            @Override // kotlin.brandToFileType, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.AudioAttributesCompatParcelizer.cancel(z);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.AudioAttributesCompatParcelizer.getDelay(timeUnit);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.AudioAttributesCompatParcelizer.compareTo(delayed);
            }
        }

        /* JADX INFO: renamed from: o.buildPsshAtom$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        static final class RunnableC0066RemoteActionCompatParcelizer extends setFormatGaplessInfo.AudioAttributesImplApi26Parcelizer<Void> implements Runnable {
            private final Runnable write;

            public RunnableC0066RemoteActionCompatParcelizer(Runnable runnable) {
                this.write = (Runnable) parseStsd.IconCompatParcelizer(runnable);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.write.run();
                } catch (Throwable th) {
                    IconCompatParcelizer(th);
                    throw th;
                }
            }

            @Override // kotlin.setFormatGaplessInfo
            protected final String AudioAttributesCompatParcelizer() {
                StringBuilder sb = new StringBuilder("task=[");
                sb.append(this.write);
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
