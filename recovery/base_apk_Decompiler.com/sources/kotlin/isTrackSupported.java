package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class isTrackSupported<TResult> {
    private TResult AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private Executor IconCompatParcelizer;
    private Executor RemoteActionCompatParcelizer;
    private CleverTapInstanceConfig read;
    private List<isSelected<Exception>> write = new ArrayList();
    private List<WakeLockManager<TResult>> MediaBrowserCompatItemReceiver = new ArrayList();
    private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer.READY_TO_RUN;

    /* JADX INFO: loaded from: classes2.dex */
    protected enum AudioAttributesCompatParcelizer {
        FAILED,
        SUCCESS,
        READY_TO_RUN,
        RUNNING
    }

    isTrackSupported(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String str) {
        this.IconCompatParcelizer = executor;
        this.RemoteActionCompatParcelizer = executor2;
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesImplBaseParcelizer = str;
    }

    private isTrackSupported<TResult> AudioAttributesCompatParcelizer(Executor executor, isAdaptiveSupported<Exception> isadaptivesupported) {
        synchronized (this) {
            if (isadaptivesupported != null) {
                this.write.add(new isSelected<>(executor, isadaptivesupported));
            }
        }
        return this;
    }

    public final isTrackSupported<TResult> read(isAdaptiveSupported<Exception> isadaptivesupported) {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, isadaptivesupported);
    }

    private isTrackSupported<TResult> RemoteActionCompatParcelizer(Executor executor, TracksGroupExternalSyntheticLambda0<TResult> tracksGroupExternalSyntheticLambda0) {
        if (tracksGroupExternalSyntheticLambda0 != null) {
            this.MediaBrowserCompatItemReceiver.add(new WakeLockManager<>(executor, tracksGroupExternalSyntheticLambda0));
        }
        return this;
    }

    public final isTrackSupported<TResult> RemoteActionCompatParcelizer(TracksGroupExternalSyntheticLambda0<TResult> tracksGroupExternalSyntheticLambda0) {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, tracksGroupExternalSyntheticLambda0);
    }

    public final void read(String str, Callable<TResult> callable) {
        this.IconCompatParcelizer.execute(AudioAttributesCompatParcelizer(str, callable));
    }

    public final Future<?> RemoteActionCompatParcelizer(String str, Callable<TResult> callable) {
        Executor executor = this.IconCompatParcelizer;
        if (!(executor instanceof ExecutorService)) {
            throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
        }
        return ((ExecutorService) executor).submit(AudioAttributesCompatParcelizer(str, callable));
    }

    public final TResult IconCompatParcelizer(String str, Callable<TResult> callable, long j) {
        Exception e;
        Future futureSubmit;
        Executor executor = this.IconCompatParcelizer;
        if (!(executor instanceof ExecutorService)) {
            throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
        }
        try {
            futureSubmit = ((ExecutorService) executor).submit(callable);
        } catch (Exception e2) {
            e = e2;
            futureSubmit = null;
        }
        try {
            return (TResult) futureSubmit.get(j, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            if (futureSubmit != null && !futureSubmit.isCancelled()) {
                futureSubmit.cancel(true);
            }
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    final void RemoteActionCompatParcelizer(Exception exc) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.FAILED;
        Iterator<isSelected<Exception>> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().read(exc);
        }
    }

    final void read(TResult tresult) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.SUCCESS;
        AudioAttributesCompatParcelizer(tresult);
        Iterator<WakeLockManager<TResult>> it = this.MediaBrowserCompatItemReceiver.iterator();
        while (it.hasNext()) {
            it.next().read(this.AudioAttributesCompatParcelizer);
        }
    }

    private void AudioAttributesCompatParcelizer(TResult tresult) {
        this.AudioAttributesCompatParcelizer = tresult;
    }

    private Runnable AudioAttributesCompatParcelizer(final String str, final Callable<TResult> callable) {
        return new Runnable() { // from class: o.isTrackSupported.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.RUNNING;
                    isTrackSupported istracksupported = isTrackSupported.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(isTrackSupported.this.AudioAttributesImplBaseParcelizer);
                    sb.append(" Task: ");
                    sb.append(str);
                    sb.append(" starting on...");
                    sb.append(Thread.currentThread().getName());
                    istracksupported.write(sb.toString(), null);
                    Object objCall = callable.call();
                    isTrackSupported istracksupported2 = isTrackSupported.this;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(isTrackSupported.this.AudioAttributesImplBaseParcelizer);
                    sb2.append(" Task: ");
                    sb2.append(str);
                    sb2.append(" executed successfully on...");
                    sb2.append(Thread.currentThread().getName());
                    istracksupported2.write(sb2.toString(), null);
                    isTrackSupported.this.read(objCall);
                } catch (Exception e) {
                    isTrackSupported.this.RemoteActionCompatParcelizer(e);
                    isTrackSupported istracksupported3 = isTrackSupported.this;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(isTrackSupported.this.AudioAttributesImplBaseParcelizer);
                    sb3.append(" Task: ");
                    sb3.append(str);
                    sb3.append(" failed to execute on...");
                    sb3.append(Thread.currentThread().getName());
                    istracksupported3.write(sb3.toString(), e);
                    e.printStackTrace();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(String str, Exception exc) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.read;
        if (cleverTapInstanceConfig != null) {
            cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
            RendererWakeupListener.onAddQueueItem();
        } else {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }
}
