package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.codecNeedsEosPropagationWorkaround;
import kotlin.drmNeedsCodecReinitialization;

/* JADX INFO: loaded from: classes3.dex */
public class needsDisableAdaptationWorkaround {
    private static ScheduledExecutorService AudioAttributesCompatParcelizer;
    private static drmNeedsCodecReinitialization IconCompatParcelizer;
    private static final long read = TimeUnit.HOURS.toSeconds(8);
    private static DrmUtilApi18 write;
    private final hasSamples AudioAttributesImplApi21Parcelizer;
    private final FirebaseApp AudioAttributesImplApi26Parcelizer;
    private final isVideoSizeAndRateSupportedV21 AudioAttributesImplBaseParcelizer;
    private final Executor MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;
    private final codecNeedsEosPropagationWorkaround MediaBrowserCompatMediaItem;
    private final Application.ActivityLifecycleCallbacks MediaBrowserCompatSearchResultReceiver;
    private final Executor MediaDescriptionCompat;
    private final setInternalException MediaMetadataCompat;
    private final bypassRender RatingCompat;
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private final Executor onAddQueueItem;
    private final Task<drainAndUpdateCodecDrmSessionV23> onCustomAction;

    public static needsDisableAdaptationWorkaround RemoteActionCompatParcelizer() {
        needsDisableAdaptationWorkaround needsdisableadaptationworkaroundRemoteActionCompatParcelizer;
        synchronized (needsDisableAdaptationWorkaround.class) {
            needsdisableadaptationworkaroundRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(FirebaseApp.write());
        }
        return needsdisableadaptationworkaroundRemoteActionCompatParcelizer;
    }

    private static drmNeedsCodecReinitialization read(Context context) {
        drmNeedsCodecReinitialization drmneedscodecreinitialization;
        synchronized (needsDisableAdaptationWorkaround.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new drmNeedsCodecReinitialization(context);
            }
            drmneedscodecreinitialization = IconCompatParcelizer;
        }
        return drmneedscodecreinitialization;
    }

    private static needsDisableAdaptationWorkaround RemoteActionCompatParcelizer(FirebaseApp firebaseApp) {
        needsDisableAdaptationWorkaround needsdisableadaptationworkaround;
        synchronized (needsDisableAdaptationWorkaround.class) {
            needsdisableadaptationworkaround = (needsDisableAdaptationWorkaround) firebaseApp.AudioAttributesCompatParcelizer(needsDisableAdaptationWorkaround.class);
            Preconditions.checkNotNull(needsdisableadaptationworkaround, "Firebase Messaging component is not present");
        }
        return needsdisableadaptationworkaround;
    }

    public needsDisableAdaptationWorkaround(FirebaseApp firebaseApp, setInternalException setinternalexception, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable, onInputBufferAvailable<maybeThrowInternalException> oninputbufferavailable2, hasSamples hassamples, DrmUtilApi18 drmUtilApi18, AsynchronousMediaCodecBufferEnqueuerMessageParams asynchronousMediaCodecBufferEnqueuerMessageParams) {
        this(firebaseApp, setinternalexception, oninputbufferavailable, oninputbufferavailable2, hassamples, drmUtilApi18, asynchronousMediaCodecBufferEnqueuerMessageParams, new bypassRender(firebaseApp.AudioAttributesCompatParcelizer()));
    }

    private needsDisableAdaptationWorkaround(FirebaseApp firebaseApp, setInternalException setinternalexception, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable, onInputBufferAvailable<maybeThrowInternalException> oninputbufferavailable2, hasSamples hassamples, DrmUtilApi18 drmUtilApi18, AsynchronousMediaCodecBufferEnqueuerMessageParams asynchronousMediaCodecBufferEnqueuerMessageParams, bypassRender bypassrender) {
        this(firebaseApp, setinternalexception, hassamples, drmUtilApi18, asynchronousMediaCodecBufferEnqueuerMessageParams, bypassrender, new isVideoSizeAndRateSupportedV21(firebaseApp, bypassrender, oninputbufferavailable, oninputbufferavailable2, hassamples), isTunnelingV21.write(), isTunnelingV21.IconCompatParcelizer(), isTunnelingV21.read());
    }

    private needsDisableAdaptationWorkaround(FirebaseApp firebaseApp, setInternalException setinternalexception, hasSamples hassamples, DrmUtilApi18 drmUtilApi18, AsynchronousMediaCodecBufferEnqueuerMessageParams asynchronousMediaCodecBufferEnqueuerMessageParams, bypassRender bypassrender, isVideoSizeAndRateSupportedV21 isvideosizeandratesupportedv21, Executor executor, Executor executor2, Executor executor3) {
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        write = drmUtilApi18;
        this.AudioAttributesImplApi26Parcelizer = firebaseApp;
        this.MediaMetadataCompat = setinternalexception;
        this.AudioAttributesImplApi21Parcelizer = hassamples;
        this.RemoteActionCompatParcelizer = new IconCompatParcelizer(asynchronousMediaCodecBufferEnqueuerMessageParams);
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = contextAudioAttributesCompatParcelizer;
        needsRotatedVerticalResolutionWorkaround needsrotatedverticalresolutionworkaround = new needsRotatedVerticalResolutionWorkaround();
        this.MediaBrowserCompatSearchResultReceiver = needsrotatedverticalresolutionworkaround;
        this.RatingCompat = bypassrender;
        this.onAddQueueItem = executor;
        this.AudioAttributesImplBaseParcelizer = isvideosizeandratesupportedv21;
        this.MediaBrowserCompatMediaItem = new codecNeedsEosPropagationWorkaround(executor);
        this.MediaDescriptionCompat = executor2;
        this.MediaBrowserCompatCustomActionResultReceiver = executor3;
        Context contextAudioAttributesCompatParcelizer2 = firebaseApp.AudioAttributesCompatParcelizer();
        if (contextAudioAttributesCompatParcelizer2 instanceof Application) {
            ((Application) contextAudioAttributesCompatParcelizer2).registerActivityLifecycleCallbacks(needsrotatedverticalresolutionworkaround);
        } else {
            Objects.toString(contextAudioAttributesCompatParcelizer2);
        }
        if (setinternalexception != null) {
            new Object() { // from class: o.needsProfileExcludedWorkaround
            };
        }
        executor2.execute(new Runnable() { // from class: o.needsIgnorePerformancePointsWorkaround
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            }
        });
        Task<drainAndUpdateCodecDrmSessionV23> taskRemoteActionCompatParcelizer = drainAndUpdateCodecDrmSessionV23.RemoteActionCompatParcelizer(this, bypassrender, isvideosizeandratesupportedv21, contextAudioAttributesCompatParcelizer, isTunnelingV21.MediaBrowserCompatItemReceiver());
        this.onCustomAction = taskRemoteActionCompatParcelizer;
        taskRemoteActionCompatParcelizer.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: o.isAudioChannelCountSupportedV21
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.write.RemoteActionCompatParcelizer((drainAndUpdateCodecDrmSessionV23) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: o.isFormatSupported
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        });
    }

    final /* synthetic */ void AudioAttributesImplApi21Parcelizer() {
        if (MediaDescriptionCompat()) {
            MediaMetadataCompat();
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(drainAndUpdateCodecDrmSessionV23 drainandupdatecodecdrmsessionv23) {
        if (MediaDescriptionCompat()) {
            drainandupdatecodecdrmsessionv23.RemoteActionCompatParcelizer();
        }
    }

    final /* synthetic */ void AudioAttributesImplBaseParcelizer() {
        codecNeedsFlushWorkaround.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    private boolean MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public final Task<String> IconCompatParcelizer() {
        setInternalException setinternalexception = this.MediaMetadataCompat;
        if (setinternalexception != null) {
            return setinternalexception.AudioAttributesCompatParcelizer();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.MediaDescriptionCompat.execute(new Runnable() { // from class: o.getProfileLevels
            @Override // java.lang.Runnable
            public final void run() {
                this.write.RemoteActionCompatParcelizer(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(AudioAttributesCompatParcelizer());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static DrmUtilApi18 read() {
        return write;
    }

    final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RatingCompat.IconCompatParcelizer();
    }

    final Context write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    final void RemoteActionCompatParcelizer(boolean z) {
        synchronized (this) {
            this.handleMediaPlayPauseIfPendingOnHandler = z;
        }
    }

    final void AudioAttributesCompatParcelizer(long j) {
        synchronized (this) {
            IconCompatParcelizer(new flushCodec(this, Math.min(Math.max(30L, 2 * j), read)), j);
            this.handleMediaPlayPauseIfPendingOnHandler = true;
        }
    }

    static void IconCompatParcelizer(Runnable runnable, long j) {
        synchronized (needsDisableAdaptationWorkaround.class) {
            if (AudioAttributesCompatParcelizer == null) {
                AudioAttributesCompatParcelizer = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            AudioAttributesCompatParcelizer.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        if (this.MediaMetadataCompat == null && AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver())) {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            if (!this.handleMediaPlayPauseIfPendingOnHandler) {
                AudioAttributesCompatParcelizer(0L);
            }
        }
    }

    private drmNeedsCodecReinitialization.IconCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
        return read(this.MediaBrowserCompatItemReceiver).AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver(), bypassRender.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer));
    }

    final String AudioAttributesCompatParcelizer() throws IOException {
        setInternalException setinternalexception = this.MediaMetadataCompat;
        if (setinternalexception != null) {
            try {
                return (String) Tasks.await(setinternalexception.AudioAttributesCompatParcelizer());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final drmNeedsCodecReinitialization.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        if (!AudioAttributesCompatParcelizer(iconCompatParcelizerMediaBrowserCompatSearchResultReceiver)) {
            return iconCompatParcelizerMediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer;
        }
        final String strAudioAttributesCompatParcelizer = bypassRender.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        try {
            return (String) Tasks.await(this.MediaBrowserCompatMediaItem.read(strAudioAttributesCompatParcelizer, new codecNeedsEosPropagationWorkaround.IconCompatParcelizer() { // from class: o.isAudioSampleRateSupportedV21
                @Override // o.codecNeedsEosPropagationWorkaround.IconCompatParcelizer
                public final Task RemoteActionCompatParcelizer() {
                    return this.RemoteActionCompatParcelizer.IconCompatParcelizer(strAudioAttributesCompatParcelizer, iconCompatParcelizerMediaBrowserCompatSearchResultReceiver);
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    final /* synthetic */ Task IconCompatParcelizer(final String str, final drmNeedsCodecReinitialization.IconCompatParcelizer iconCompatParcelizer) {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().onSuccessTask(this.MediaBrowserCompatCustomActionResultReceiver, new SuccessContinuation() { // from class: o.getMaxSupportedInstances
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.AudioAttributesCompatParcelizer.read(str, iconCompatParcelizer, (String) obj);
            }
        });
    }

    final /* synthetic */ Task read(String str, drmNeedsCodecReinitialization.IconCompatParcelizer iconCompatParcelizer, String str2) throws Exception {
        read(this.MediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver(), str, str2, this.RatingCompat.read());
        if (iconCompatParcelizer == null || !str2.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer)) {
            read(str2);
        }
        return Tasks.forResult(str2);
    }

    private String MediaBrowserCompatItemReceiver() {
        if ("[DEFAULT]".equals(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer())) {
            return "";
        }
        return this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    private boolean AudioAttributesCompatParcelizer(drmNeedsCodecReinitialization.IconCompatParcelizer iconCompatParcelizer) {
        return iconCompatParcelizer == null || iconCompatParcelizer.read(this.RatingCompat.read());
    }

    private void read(String str) {
        if ("[DEFAULT]".equals(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(LoggedUserResponse.KEY_TOKEN, str);
            new isTunneling(this.MediaBrowserCompatItemReceiver).AudioAttributesCompatParcelizer(intent);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class IconCompatParcelizer {
        private final AsynchronousMediaCodecBufferEnqueuerMessageParams AudioAttributesCompatParcelizer;
        private Boolean IconCompatParcelizer;
        private doQueueSecureInputBuffer<isCompatibleBrand> RemoteActionCompatParcelizer;
        private boolean read;

        IconCompatParcelizer(AsynchronousMediaCodecBufferEnqueuerMessageParams asynchronousMediaCodecBufferEnqueuerMessageParams) {
            this.AudioAttributesCompatParcelizer = asynchronousMediaCodecBufferEnqueuerMessageParams;
        }

        private void IconCompatParcelizer() {
            synchronized (this) {
                if (this.read) {
                    return;
                }
                Boolean bool = read();
                this.IconCompatParcelizer = bool;
                if (bool == null) {
                    doQueueSecureInputBuffer<isCompatibleBrand> doqueuesecureinputbuffer = new doQueueSecureInputBuffer() { // from class: o.isFormatFunctionallySupported
                        @Override // kotlin.doQueueSecureInputBuffer
                        public final void IconCompatParcelizer(getMessageParams getmessageparams) {
                            this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                        }
                    };
                    this.RemoteActionCompatParcelizer = doqueuesecureinputbuffer;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(isCompatibleBrand.class, doqueuesecureinputbuffer);
                }
                this.read = true;
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer() {
            if (write()) {
                needsDisableAdaptationWorkaround.this.MediaMetadataCompat();
            }
        }

        final boolean write() {
            boolean zAudioAttributesImplApi26Parcelizer;
            synchronized (this) {
                IconCompatParcelizer();
                Boolean bool = this.IconCompatParcelizer;
                if (bool == null) {
                    zAudioAttributesImplApi26Parcelizer = needsDisableAdaptationWorkaround.this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
                } else {
                    zAudioAttributesImplApi26Parcelizer = bool.booleanValue();
                }
            }
            return zAudioAttributesImplApi26Parcelizer;
        }

        private Boolean read() {
            ApplicationInfo applicationInfo;
            Context contextAudioAttributesCompatParcelizer = needsDisableAdaptationWorkaround.this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            SharedPreferences sharedPreferences = contextAudioAttributesCompatParcelizer.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextAudioAttributesCompatParcelizer.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
