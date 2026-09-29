package kotlin;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
final class drainAndUpdateCodecDrmSessionV23 {
    private static final long read = TimeUnit.HOURS.toSeconds(8);
    private final needsDisableAdaptationWorkaround AudioAttributesCompatParcelizer;
    private final ScheduledExecutorService AudioAttributesImplApi21Parcelizer;
    private final isVideoSizeAndRateSupportedV21 AudioAttributesImplBaseParcelizer;
    private final bypassRender IconCompatParcelizer;
    private final hasOutputBuffer MediaBrowserCompatItemReceiver;
    private final Context write;
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> RemoteActionCompatParcelizer = new setTitleOptional();
    private boolean MediaBrowserCompatCustomActionResultReceiver = false;

    static Task<drainAndUpdateCodecDrmSessionV23> RemoteActionCompatParcelizer(final needsDisableAdaptationWorkaround needsdisableadaptationworkaround, final bypassRender bypassrender, final isVideoSizeAndRateSupportedV21 isvideosizeandratesupportedv21, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: o.isMediaCodecExceptionV21
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return drainAndUpdateCodecDrmSessionV23.read(context, scheduledExecutorService, needsdisableadaptationworkaround, bypassrender, isvideosizeandratesupportedv21);
            }
        });
    }

    static /* synthetic */ drainAndUpdateCodecDrmSessionV23 read(Context context, ScheduledExecutorService scheduledExecutorService, needsDisableAdaptationWorkaround needsdisableadaptationworkaround, bypassRender bypassrender, isVideoSizeAndRateSupportedV21 isvideosizeandratesupportedv21) throws Exception {
        return new drainAndUpdateCodecDrmSessionV23(needsdisableadaptationworkaround, bypassrender, hasOutputBuffer.IconCompatParcelizer(context, scheduledExecutorService), isvideosizeandratesupportedv21, context, scheduledExecutorService);
    }

    private drainAndUpdateCodecDrmSessionV23(needsDisableAdaptationWorkaround needsdisableadaptationworkaround, bypassRender bypassrender, hasOutputBuffer hasoutputbuffer, isVideoSizeAndRateSupportedV21 isvideosizeandratesupportedv21, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.AudioAttributesCompatParcelizer = needsdisableadaptationworkaround;
        this.IconCompatParcelizer = bypassrender;
        this.MediaBrowserCompatItemReceiver = hasoutputbuffer;
        this.AudioAttributesImplBaseParcelizer = isvideosizeandratesupportedv21;
        this.write = context;
        this.AudioAttributesImplApi21Parcelizer = scheduledExecutorService;
    }

    private boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() != null;
    }

    final void RemoteActionCompatParcelizer() {
        if (IconCompatParcelizer()) {
            write();
        }
    }

    private void write() {
        if (AudioAttributesImplApi21Parcelizer()) {
            return;
        }
        read(0L);
    }

    final void read(long j) {
        write(new initBypass(this, this.write, this.IconCompatParcelizer, Math.min(Math.max(30L, 2 * j), read)), j);
        write(true);
    }

    final void write(Runnable runnable, long j) {
        this.AudioAttributesImplApi21Parcelizer.schedule(runnable, j, TimeUnit.SECONDS);
    }

    final boolean read() throws IOException {
        while (true) {
            synchronized (this) {
                getAvailableCodecInfos getavailablecodecinfosAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
                if (getavailablecodecinfosAudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer();
                    return true;
                }
                if (!read(getavailablecodecinfosAudioAttributesCompatParcelizer)) {
                    return false;
                }
                this.MediaBrowserCompatItemReceiver.read(getavailablecodecinfosAudioAttributesCompatParcelizer);
                IconCompatParcelizer(getavailablecodecinfosAudioAttributesCompatParcelizer);
            }
        }
    }

    private void IconCompatParcelizer(getAvailableCodecInfos getavailablecodecinfos) {
        synchronized (this.RemoteActionCompatParcelizer) {
            String strWrite = getavailablecodecinfos.write();
            if (this.RemoteActionCompatParcelizer.containsKey(strWrite)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.RemoteActionCompatParcelizer.get(strWrite);
                TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                if (taskCompletionSourcePoll != null) {
                    taskCompletionSourcePoll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.RemoteActionCompatParcelizer.remove(strWrite);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean read(kotlin.getAvailableCodecInfos r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.IconCompatParcelizer()     // Catch: java.io.IOException -> L57
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L57
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L1c
            r3 = 85
            if (r2 != r3) goto L26
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L57
            if (r1 == 0) goto L26
            r1 = r4
            goto L27
        L1c:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L57
            if (r1 == 0) goto L26
            r1 = r0
            goto L27
        L26:
            r1 = -1
        L27:
            if (r1 == 0) goto L46
            if (r1 == r4) goto L35
            boolean r5 = AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            if (r5 == 0) goto L56
            java.util.Objects.toString(r6)     // Catch: java.io.IOException -> L57
            goto L56
        L35:
            java.lang.String r1 = r6.AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            r5.AudioAttributesCompatParcelizer(r1)     // Catch: java.io.IOException -> L57
            boolean r5 = AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            if (r5 == 0) goto L56
            r6.AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            goto L56
        L46:
            java.lang.String r1 = r6.AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            r5.RemoteActionCompatParcelizer(r1)     // Catch: java.io.IOException -> L57
            boolean r5 = AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
            if (r5 == 0) goto L56
            r6.AudioAttributesCompatParcelizer()     // Catch: java.io.IOException -> L57
        L56:
            return r4
        L57:
            r5 = move-exception
            java.lang.String r6 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r1 = r5.getMessage()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L78
            java.lang.String r6 = "INTERNAL_SERVER_ERROR"
            java.lang.String r1 = r5.getMessage()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L78
            java.lang.String r6 = r5.getMessage()
            if (r6 != 0) goto L77
            return r0
        L77:
            throw r5
        L78:
            r5.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.drainAndUpdateCodecDrmSessionV23.read(o.getAvailableCodecInfos):boolean");
    }

    private void RemoteActionCompatParcelizer(String str) throws IOException {
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.write(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), str));
    }

    private void AudioAttributesCompatParcelizer(String str) throws IOException {
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), str));
    }

    private static <T> void IconCompatParcelizer(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        boolean z;
        synchronized (this) {
            z = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return z;
    }

    final void write(boolean z) {
        synchronized (this) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
        }
    }

    private static boolean AudioAttributesCompatParcelizer() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }
}
