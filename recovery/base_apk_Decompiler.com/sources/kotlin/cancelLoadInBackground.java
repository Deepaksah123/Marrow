package kotlin;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002#!B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0006*\u00020\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)"}, d2 = {"Lo/cancelLoadInBackground;", "Lo/setPriority;", "Lo/setPriorityTaskManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "", "run", "()V", "", "AudioAttributesCompatParcelizer", "()Z", "", "doFrame", "(J)V", "RemoteActionCompatParcelizer", "Lo/setPauseAtEndOfMediaItems;", "read", "(Lo/setPauseAtEndOfMediaItems;)V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "MediaBrowserCompatItemReceiver", "Landroid/view/View;", "Ljava/util/PriorityQueue;", "Lo/setPreloadConfiguration;", "AudioAttributesImplBaseParcelizer", "Ljava/util/PriorityQueue;", "AudioAttributesImplApi26Parcelizer", "Z", "IconCompatParcelizer", "Landroid/view/Choreographer;", "write", "Landroid/view/Choreographer;", "Lo/cancelLoadInBackground$write;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/cancelLoadInBackground$write;", "AudioAttributesImplApi21Parcelizer", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelLoadInBackground implements setPriorityTaskManager, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static long read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final View read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final PriorityQueue<setPreloadConfiguration> AudioAttributesCompatParcelizer = new PriorityQueue<>(11, new Comparator() { // from class: o.onActivityStopped
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return cancelLoadInBackground.RemoteActionCompatParcelizer((setPreloadConfiguration) obj, (setPreloadConfiguration) obj2);
        }
    });
    private final Choreographer write = Choreographer.getInstance();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final write RemoteActionCompatParcelizer = new write();

    public cancelLoadInBackground(View view) {
        this.read = view;
        INSTANCE.AudioAttributesCompatParcelizer(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(setPreloadConfiguration setpreloadconfiguration, setPreloadConfiguration setpreloadconfiguration2) {
        return toMagicModuleMetaRepoModel.read(setpreloadconfiguration2.getIconCompatParcelizer(), setpreloadconfiguration.getIconCompatParcelizer());
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.AudioAttributesCompatParcelizer.isEmpty() || !this.IconCompatParcelizer || !this.AudioAttributesImplBaseParcelizer || this.read.getWindowVisibility() != 0) {
            this.IconCompatParcelizer = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.read.getDrawingTime());
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(System.nanoTime() > (read * 2) + nanos);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(Math.max(this.AudioAttributesImplApi21Parcelizer, nanos) + read);
        boolean zAudioAttributesCompatParcelizer = false;
        while (!this.AudioAttributesCompatParcelizer.isEmpty() && !zAudioAttributesCompatParcelizer) {
            if (!this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()) {
                zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            } else {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                } finally {
                    Trace.endSection();
                }
            }
        }
        if (zAudioAttributesCompatParcelizer) {
            this.write.postFrameCallback(this);
        } else {
            this.IconCompatParcelizer = false;
        }
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    private final boolean AudioAttributesCompatParcelizer() {
        long jRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("compose:lazy:prefetch:available_time_nanos", jRemoteActionCompatParcelizer);
        boolean z = true;
        if (jRemoteActionCompatParcelizer > 0) {
            setPreloadConfiguration setpreloadconfigurationPeek = this.AudioAttributesCompatParcelizer.peek();
            toMagicModuleMetaRepoModel.write(setpreloadconfigurationPeek);
            if (!setpreloadconfigurationPeek.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) {
                this.AudioAttributesCompatParcelizer.poll();
                z = false;
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(false);
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long p0) {
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = p0;
            this.read.post(this);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        this.read.post(this);
    }

    @Override // kotlin.setPriorityTaskManager
    public final void read(setPauseAtEndOfMediaItems p0) {
        this.AudioAttributesCompatParcelizer.add(new setPreloadConfiguration(setPreloadConfiguration.INSTANCE.read(), p0));
        RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setPriorityTaskManager
    public final void AudioAttributesCompatParcelizer(setPauseAtEndOfMediaItems p0) {
        this.AudioAttributesCompatParcelizer.add(new setPreloadConfiguration(setPreloadConfiguration.INSTANCE.IconCompatParcelizer(), p0));
        RemoteActionCompatParcelizer();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        this.AudioAttributesImplBaseParcelizer = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        this.AudioAttributesImplBaseParcelizer = false;
        this.read.removeCallbacks(this);
        this.write.removeFrameCallback(this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0005\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000e\"\u0004\b\u0005\u0010\u000f"}, d2 = {"Lo/cancelLoadInBackground$write;", "Lo/setHandleAudioBecomingNoisy;", "<init>", "()V", "", "RemoteActionCompatParcelizer", "()J", "", "IconCompatParcelizer", "Z", "write", "()Z", "AudioAttributesCompatParcelizer", "(Z)V", "J", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setHandleAudioBecomingNoisy {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private long IconCompatParcelizer;

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.setHandleAudioBecomingNoisy
        public final long RemoteActionCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.IconCompatParcelizer - System.nanoTime());
        }
    }

    /* JADX INFO: renamed from: o.cancelLoadInBackground$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/cancelLoadInBackground$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/view/View;)V", "", "read", "J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void AudioAttributesCompatParcelizer(android.view.View r5) {
            /*
                r4 = this;
                long r0 = kotlin.cancelLoadInBackground.IconCompatParcelizer()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2a
                android.view.Display r4 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L20
                if (r4 == 0) goto L20
                float r4 = r4.getRefreshRate()
                r5 = 1106247680(0x41f00000, float:30.0)
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 >= 0) goto L22
            L20:
                r4 = 1114636288(0x42700000, float:60.0)
            L22:
                r5 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r5 = r5 / r4
                long r4 = (long) r5
                kotlin.cancelLoadInBackground.RemoteActionCompatParcelizer(r4)
            L2a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.cancelLoadInBackground.Companion.AudioAttributesCompatParcelizer(android.view.View):void");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
