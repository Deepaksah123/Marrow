package kotlin;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.checkAdtsHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac4Extractor implements ScheduledExecutorService {
    private final ScheduledExecutorService read;
    private final ExecutorService write;

    public Ac4Extractor(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.write = executorService;
        this.read = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
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
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.write.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.write.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.write.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.write.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.write.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.write.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.write.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.write.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.write.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new checkAdtsHeader(new checkAdtsHeader.read() { // from class: o.Ac4Reader
            @Override // o.checkAdtsHeader.read
            public final ScheduledFuture IconCompatParcelizer(checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return this.RemoteActionCompatParcelizer.IconCompatParcelizer(runnable, j, timeUnit, audioAttributesCompatParcelizer);
            }
        });
    }

    final /* synthetic */ ScheduledFuture IconCompatParcelizer(final Runnable runnable, long j, TimeUnit timeUnit, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return this.read.schedule(new Runnable() { // from class: o.AdtsReader
            @Override // java.lang.Runnable
            public final void run() {
                this.write.IconCompatParcelizer(runnable, audioAttributesCompatParcelizer);
            }
        }, j, timeUnit);
    }

    final /* synthetic */ void IconCompatParcelizer(final Runnable runnable, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write.execute(new Runnable() { // from class: o.isAdtsSyncBytes
            @Override // java.lang.Runnable
            public final void run() {
                Ac4Extractor.write(runnable, audioAttributesCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void write(Runnable runnable, checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        try {
            runnable.run();
            audioAttributesCompatParcelizer.read(null);
        } catch (Exception e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new checkAdtsHeader(new checkAdtsHeader.read() { // from class: o.assertTracksCreated
            @Override // o.checkAdtsHeader.read
            public final ScheduledFuture IconCompatParcelizer(checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return this.write.RemoteActionCompatParcelizer(callable, j, timeUnit, audioAttributesCompatParcelizer);
            }
        });
    }

    final /* synthetic */ ScheduledFuture RemoteActionCompatParcelizer(final Callable callable, long j, TimeUnit timeUnit, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return this.read.schedule(new Callable() { // from class: o.AdtsExtractor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.write(callable, audioAttributesCompatParcelizer);
            }
        }, j, timeUnit);
    }

    final /* synthetic */ Future write(final Callable callable, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws Exception {
        return this.write.submit(new Runnable() { // from class: o.findNextSample
            @Override // java.lang.Runnable
            public final void run() {
                Ac4Extractor.IconCompatParcelizer(callable, audioAttributesCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void IconCompatParcelizer(Callable callable, checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        try {
            audioAttributesCompatParcelizer.read(callable.call());
        } catch (Exception e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new checkAdtsHeader(new checkAdtsHeader.read() { // from class: o.peekId3Header
            @Override // o.checkAdtsHeader.read
            public final ScheduledFuture IconCompatParcelizer(checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return this.read.write(runnable, j, j2, timeUnit, audioAttributesCompatParcelizer);
            }
        });
    }

    final /* synthetic */ ScheduledFuture write(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return this.read.scheduleAtFixedRate(new Runnable() { // from class: o.calculateAverageFrameSize
            @Override // java.lang.Runnable
            public final void run() {
                this.read.read(runnable, audioAttributesCompatParcelizer);
            }
        }, j, j2, timeUnit);
    }

    final /* synthetic */ void read(final Runnable runnable, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write.execute(new Runnable() { // from class: o.AdtsExtractorExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                Ac4Extractor.AudioAttributesCompatParcelizer(runnable, audioAttributesCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(Runnable runnable, checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new checkAdtsHeader(new checkAdtsHeader.read() { // from class: o.checkSyncPositionValid
            @Override // o.checkAdtsHeader.read
            public final ScheduledFuture IconCompatParcelizer(checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return this.AudioAttributesCompatParcelizer.read(runnable, j, j2, timeUnit, audioAttributesCompatParcelizer);
            }
        });
    }

    final /* synthetic */ ScheduledFuture read(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return this.read.scheduleWithFixedDelay(new Runnable() { // from class: o.AdtsExtractorFlags
            @Override // java.lang.Runnable
            public final void run() {
                this.read.AudioAttributesImplApi21Parcelizer(runnable, audioAttributesCompatParcelizer);
            }
        }, j, j2, timeUnit);
    }

    final /* synthetic */ void AudioAttributesImplApi21Parcelizer(final Runnable runnable, final checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write.execute(new Runnable() { // from class: o.packetStarted
            @Override // java.lang.Runnable
            public final void run() {
                Ac4Extractor.RemoteActionCompatParcelizer(runnable, audioAttributesCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(Runnable runnable, checkAdtsHeader.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        try {
            runnable.run();
        } catch (Exception e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }
}
