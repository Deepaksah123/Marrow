package kotlin;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.MetadataInputBuffer;
import kotlin.anyIgnorals;
import kotlin.getScore;

/* JADX INFO: loaded from: classes5.dex */
public class MediaCodecSelectorExternalSyntheticLambda0 implements Application.ActivityLifecycleCallbacks, findExplicitNames {
    private static final Timer AudioAttributesCompatParcelizer;
    private static final long IconCompatParcelizer;
    private static ExecutorService read;
    private static volatile MediaCodecSelectorExternalSyntheticLambda0 write;
    private final Timer AudioAttributesImplApi21Parcelizer;
    private final MetadataInputBuffer.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final maybeInitCodecOrBypass AudioAttributesImplBaseParcelizer;
    private final MediaCodecUtilCodecKey MediaBrowserCompatCustomActionResultReceiver;
    private WeakReference<Activity> MediaBrowserCompatItemReceiver;
    private Context RemoteActionCompatParcelizer;
    private WeakReference<Activity> onCustomAction;
    private final Timer onPause;
    private final sortByScore onPlayFromUri;
    private PerfSession onPrepare;
    private boolean MediaMetadataCompat = false;
    private boolean MediaBrowserCompatMediaItem = false;
    private Timer onAddQueueItem = null;
    private Timer onFastForward = null;
    private Timer onPlay = null;
    private Timer RatingCompat = null;
    private Timer MediaBrowserCompatSearchResultReceiver = null;
    private Timer onMediaButtonEvent = null;
    private Timer onPlayFromMediaId = null;
    private Timer handleMediaPlayPauseIfPendingOnHandler = null;
    private boolean MediaDescriptionCompat = false;
    private int onCommand = 0;
    private final write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write(this, 0);
    private boolean onPrepareFromSearch = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    static /* synthetic */ boolean AudioAttributesImplApi26Parcelizer(MediaCodecSelectorExternalSyntheticLambda0 mediaCodecSelectorExternalSyntheticLambda0) {
        mediaCodecSelectorExternalSyntheticLambda0.MediaDescriptionCompat = true;
        return true;
    }

    static /* synthetic */ int MediaBrowserCompatCustomActionResultReceiver(MediaCodecSelectorExternalSyntheticLambda0 mediaCodecSelectorExternalSyntheticLambda0) {
        int i = mediaCodecSelectorExternalSyntheticLambda0.onCommand;
        mediaCodecSelectorExternalSyntheticLambda0.onCommand = i + 1;
        return i;
    }

    static {
        new MediaCodecUtilCodecKey();
        AudioAttributesCompatParcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        IconCompatParcelizer = TimeUnit.MINUTES.toMicros(1L);
    }

    public static MediaCodecSelectorExternalSyntheticLambda0 IconCompatParcelizer() {
        return write != null ? write : IconCompatParcelizer(sortByScore.read(), new MediaCodecUtilCodecKey());
    }

    private static MediaCodecSelectorExternalSyntheticLambda0 IconCompatParcelizer(sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey) {
        if (write == null) {
            synchronized (MediaCodecSelectorExternalSyntheticLambda0.class) {
                if (write == null) {
                    write = new MediaCodecSelectorExternalSyntheticLambda0(sortbyscore, mediaCodecUtilCodecKey, maybeInitCodecOrBypass.IconCompatParcelizer(), new ThreadPoolExecutor(0, 1, 10 + IconCompatParcelizer, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return write;
    }

    private MediaCodecSelectorExternalSyntheticLambda0(sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, maybeInitCodecOrBypass maybeinitcodecorbypass, ExecutorService executorService) {
        this.onPlayFromUri = sortbyscore;
        this.MediaBrowserCompatCustomActionResultReceiver = mediaCodecUtilCodecKey;
        this.AudioAttributesImplBaseParcelizer = maybeinitcodecorbypass;
        read = executorService;
        this.AudioAttributesImplApi26Parcelizer = MetadataInputBuffer.read().read("_experiment_app_start_ttid");
        this.onPause = Timer.IconCompatParcelizer(Process.getStartElapsedRealtime());
        TrackTransformation trackTransformation = (TrackTransformation) FirebaseApp.write().AudioAttributesCompatParcelizer(TrackTransformation.class);
        this.AudioAttributesImplApi21Parcelizer = trackTransformation != null ? Timer.IconCompatParcelizer(trackTransformation.read()) : null;
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        synchronized (this) {
            if (this.MediaMetadataCompat) {
                return;
            }
            POJOPropertyBuilderExternalSyntheticLambda0.read().getLifecycle().IconCompatParcelizer(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.onPrepareFromSearch = this.onPrepareFromSearch || write(applicationContext);
                this.MediaMetadataCompat = true;
                this.RemoteActionCompatParcelizer = applicationContext;
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            if (this.MediaMetadataCompat) {
                POJOPropertyBuilderExternalSyntheticLambda0.read().getLifecycle().AudioAttributesCompatParcelizer(this);
                ((Application) this.RemoteActionCompatParcelizer).unregisterActivityLifecycleCallbacks(this);
                this.MediaMetadataCompat = false;
            }
        }
    }

    private Timer AudioAttributesCompatParcelizer() {
        Timer timer = this.onPause;
        return timer != null ? timer : read();
    }

    private Timer read() {
        Timer timer = this.AudioAttributesImplApi21Parcelizer;
        return timer != null ? timer : AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.onMediaButtonEvent != null) {
            return;
        }
        this.onMediaButtonEvent = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(this.onMediaButtonEvent));
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatItemReceiver() {
        if (this.onPlayFromMediaId != null) {
            return;
        }
        this.onPlayFromMediaId = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.write(MetadataInputBuffer.read().read("_experiment_preDrawFoQ").IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(this.onPlayFromMediaId)).MediaBrowserCompatMediaItem());
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.write(MetadataInputBuffer.read().read("_experiment_onDrawFoQ").IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(this.handleMediaPlayPauseIfPendingOnHandler)).MediaBrowserCompatMediaItem());
        if (this.onPause != null) {
            this.AudioAttributesImplApi26Parcelizer.write(MetadataInputBuffer.read().read("_experiment_procStart_to_classLoad").IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(read())).MediaBrowserCompatMediaItem());
        }
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer("systemDeterminedForeground", this.onPrepareFromSearch ? "true" : "false");
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer("onDrawCount", this.onCommand);
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.onPrepare.IconCompatParcelizer());
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this) {
            if (!this.MediaDescriptionCompat && this.onAddQueueItem == null) {
                this.onPrepareFromSearch = this.onPrepareFromSearch || write(this.RemoteActionCompatParcelizer);
                this.onCustomAction = new WeakReference<>(activity);
                this.onAddQueueItem = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
                if (AudioAttributesCompatParcelizer().write(this.onAddQueueItem) > IconCompatParcelizer) {
                    this.MediaBrowserCompatMediaItem = true;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (!this.MediaDescriptionCompat && this.onFastForward == null && !this.MediaBrowserCompatMediaItem) {
                this.onFastForward = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        synchronized (this) {
            if (!this.MediaDescriptionCompat && !this.MediaBrowserCompatMediaItem) {
                boolean z = this.AudioAttributesImplBaseParcelizer.read();
                if (z) {
                    View viewFindViewById = activity.findViewById(R.id.content);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    MediaCodecUtil1.IconCompatParcelizer(viewFindViewById, new Runnable() { // from class: o.copyWithFallbackException
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.IconCompatParcelizer.write();
                        }
                    });
                    getCodecCount.write(viewFindViewById, new Runnable() { // from class: o.MediaCodecUtil
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.read.MediaBrowserCompatCustomActionResultReceiver();
                        }
                    }, new Runnable() { // from class: o.MediaCodecSelector
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                        }
                    });
                }
                if (this.onPlay != null) {
                    return;
                }
                this.MediaBrowserCompatItemReceiver = new WeakReference<>(activity);
                this.onPlay = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
                this.onPrepare = getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
                activity.getClass().getName();
                read().write(this.onPlay);
                read.execute(new Runnable() { // from class: o.MediaCodecRendererOutputStreamInfo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    }
                });
                if (!z) {
                    AudioAttributesImplBaseParcelizer();
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(final MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.onMediaButtonEvent == null || this.onPlayFromMediaId == null || this.handleMediaPlayPauseIfPendingOnHandler == null) {
            return;
        }
        read.execute(new Runnable() { // from class: o.avcLevelNumberToConst
            @Override // java.lang.Runnable
            public final void run() {
                this.read.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
            }
        });
        AudioAttributesImplBaseParcelizer();
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.onPlayFromUri.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem(), lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer() {
        MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = MetadataInputBuffer.read().read(getScore.AudioAttributesCompatParcelizer.APP_START_TRACE_NAME.toString()).IconCompatParcelizer(read().write()).read(read().write(this.onPlay));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(MetadataInputBuffer.read().read(getScore.AudioAttributesCompatParcelizer.ON_CREATE_TRACE_NAME.toString()).IconCompatParcelizer(read().write()).read(read().write(this.onAddQueueItem)).MediaBrowserCompatMediaItem());
        if (this.onFastForward != null) {
            MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = MetadataInputBuffer.read();
            remoteActionCompatParcelizer2.read(getScore.AudioAttributesCompatParcelizer.ON_START_TRACE_NAME.toString()).IconCompatParcelizer(this.onAddQueueItem.write()).read(this.onAddQueueItem.write(this.onFastForward));
            arrayList.add(remoteActionCompatParcelizer2.MediaBrowserCompatMediaItem());
            MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = MetadataInputBuffer.read();
            remoteActionCompatParcelizer3.read(getScore.AudioAttributesCompatParcelizer.ON_RESUME_TRACE_NAME.toString()).IconCompatParcelizer(this.onFastForward.write()).read(this.onFastForward.write(this.onPlay));
            arrayList.add(remoteActionCompatParcelizer3.MediaBrowserCompatMediaItem());
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(arrayList).IconCompatParcelizer(this.onPrepare.IconCompatParcelizer());
        this.onPlayFromUri.IconCompatParcelizer((MetadataInputBuffer) remoteActionCompatParcelizer.MediaBrowserCompatMediaItem(), lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND_BACKGROUND);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.MediaDescriptionCompat || this.MediaBrowserCompatMediaItem || !this.AudioAttributesImplBaseParcelizer.read()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @withMember(read = anyIgnorals.read.ON_START)
    public void onAppEnteredForeground() {
        if (this.MediaDescriptionCompat || this.MediaBrowserCompatMediaItem || this.RatingCompat != null) {
            return;
        }
        this.RatingCompat = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.write(MetadataInputBuffer.read().read("_experiment_firstForegrounding").IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(this.RatingCompat)).MediaBrowserCompatMediaItem());
    }

    @withMember(read = anyIgnorals.read.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.MediaDescriptionCompat || this.MediaBrowserCompatMediaItem || this.MediaBrowserCompatSearchResultReceiver != null) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.write(MetadataInputBuffer.read().read("_experiment_firstBackgrounding").IconCompatParcelizer(AudioAttributesCompatParcelizer().write()).read(AudioAttributesCompatParcelizer().write(this.MediaBrowserCompatSearchResultReceiver)).MediaBrowserCompatMediaItem());
    }

    private static boolean write(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(":");
        String string = sb.toString();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(string))) {
                return true;
            }
        }
        return false;
    }

    public static class AudioAttributesCompatParcelizer implements Runnable {
        private final MediaCodecSelectorExternalSyntheticLambda0 IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(MediaCodecSelectorExternalSyntheticLambda0 mediaCodecSelectorExternalSyntheticLambda0) {
            this.IconCompatParcelizer = mediaCodecSelectorExternalSyntheticLambda0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.IconCompatParcelizer.onAddQueueItem == null) {
                MediaCodecSelectorExternalSyntheticLambda0.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            }
        }
    }

    final class write implements ViewTreeObserver.OnDrawListener {
        private write() {
        }

        /* synthetic */ write(MediaCodecSelectorExternalSyntheticLambda0 mediaCodecSelectorExternalSyntheticLambda0, byte b) {
            this();
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            MediaCodecSelectorExternalSyntheticLambda0.MediaBrowserCompatCustomActionResultReceiver(MediaCodecSelectorExternalSyntheticLambda0.this);
        }
    }
}
