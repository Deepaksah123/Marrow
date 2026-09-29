package kotlin;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class isVendor {
    private final ScheduledExecutorService AudioAttributesCompatParcelizer;
    private final Runtime IconCompatParcelizer;
    private ScheduledFuture RemoteActionCompatParcelizer;
    public final ConcurrentLinkedQueue<SynchronousMediaCodecAdapterExternalSyntheticLambda0> read;
    private long write;

    public static boolean read(long j) {
        return j <= 0;
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    isVendor() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private isVendor(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.RemoteActionCompatParcelizer = null;
        this.write = -1L;
        this.AudioAttributesCompatParcelizer = scheduledExecutorService;
        this.read = new ConcurrentLinkedQueue<>();
        this.IconCompatParcelizer = runtime;
    }

    public final void write(long j, Timer timer) {
        if (read(j)) {
            return;
        }
        if (this.RemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(j, timer);
        } else if (this.write != j) {
            write();
            IconCompatParcelizer(j, timer);
        }
    }

    public final void write() {
        ScheduledFuture scheduledFuture = this.RemoteActionCompatParcelizer;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.RemoteActionCompatParcelizer = null;
        this.write = -1L;
    }

    public final void IconCompatParcelizer(Timer timer) {
        read(timer);
    }

    private void IconCompatParcelizer(long j, final Timer timer) {
        synchronized (this) {
            this.write = j;
            try {
                this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.scheduleAtFixedRate(new Runnable() { // from class: o.lambdaapplyWorkarounds2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(timer);
                    }
                }, 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e.getMessage();
            }
        }
    }

    final /* synthetic */ void write(Timer timer) {
        SynchronousMediaCodecAdapterExternalSyntheticLambda0 synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(timer);
        if (synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer != null) {
            this.read.add(synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer);
        }
    }

    private void read(final Timer timer) {
        synchronized (this) {
            try {
                this.AudioAttributesCompatParcelizer.schedule(new Runnable() { // from class: o.lambdaapplyWorkarounds1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.RemoteActionCompatParcelizer(timer);
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e.getMessage();
            }
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(Timer timer) {
        SynchronousMediaCodecAdapterExternalSyntheticLambda0 synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(timer);
        if (synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer != null) {
            this.read.add(synchronousMediaCodecAdapterExternalSyntheticLambda0AudioAttributesCompatParcelizer);
        }
    }

    private SynchronousMediaCodecAdapterExternalSyntheticLambda0 AudioAttributesCompatParcelizer(Timer timer) {
        if (timer == null) {
            return null;
        }
        return SynchronousMediaCodecAdapterExternalSyntheticLambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(timer.RemoteActionCompatParcelizer()).write(read()).MediaBrowserCompatMediaItem();
    }

    private int read() {
        return secureDecodersExplicit.RemoteActionCompatParcelizer(isFeatureRequired.BYTES.IconCompatParcelizer(this.IconCompatParcelizer.totalMemory() - this.IconCompatParcelizer.freeMemory()));
    }
}
