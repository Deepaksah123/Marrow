package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.b;
import kotlin.n;

/* JADX INFO: loaded from: classes2.dex */
public final class hasPrevious extends getChildIndexByWindowIndex {
    private static final Object AudioAttributesCompatParcelizer;
    private static hasPrevious IconCompatParcelizer;
    private static hasPrevious write;
    private forceDisableMediaCodecAsynchronousQueueing AudioAttributesImplApi21Parcelizer;
    private handlePlatformAudioFocusChange AudioAttributesImplApi26Parcelizer;
    private BroadcastReceiver.PendingResult AudioAttributesImplBaseParcelizer;
    private Context MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver = false;
    private WorkDatabase MediaBrowserCompatMediaItem;
    private List<willPauseWhenDucked> MediaBrowserCompatSearchResultReceiver;
    private setEnableDecoderFallback MediaDescriptionCompat;
    private final Bundleable MediaMetadataCompat;
    private final TopUserCompanion RatingCompat;
    private b RemoteActionCompatParcelizer;

    static {
        n.write("WorkManagerImpl");
        write = null;
        IconCompatParcelizer = null;
        AudioAttributesCompatParcelizer = new Object();
    }

    @Deprecated
    private static hasPrevious MediaMetadataCompat() {
        synchronized (AudioAttributesCompatParcelizer) {
            hasPrevious hasprevious = write;
            if (hasprevious != null) {
                return hasprevious;
            }
            return IconCompatParcelizer;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hasPrevious read(Context context) {
        hasPrevious haspreviousMediaMetadataCompat;
        synchronized (AudioAttributesCompatParcelizer) {
            haspreviousMediaMetadataCompat = MediaMetadataCompat();
            if (haspreviousMediaMetadataCompat == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.write) {
                    write(applicationContext, ((b.write) applicationContext).AudioAttributesCompatParcelizer());
                    haspreviousMediaMetadataCompat = read(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return haspreviousMediaMetadataCompat;
    }

    private static void write(Context context, b bVar) {
        synchronized (AudioAttributesCompatParcelizer) {
            hasPrevious hasprevious = write;
            if (hasprevious != null && IconCompatParcelizer != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (hasprevious == null) {
                Context applicationContext = context.getApplicationContext();
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = getPreviousMediaItemIndex.IconCompatParcelizer(applicationContext, bVar);
                }
                write = IconCompatParcelizer;
            }
        }
    }

    public hasPrevious(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase, List<willPauseWhenDucked> list, handlePlatformAudioFocusChange handleplatformaudiofocuschange, Bundleable bundleable) {
        Context applicationContext = context.getApplicationContext();
        if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        n.IconCompatParcelizer(new n.write(bVar.getMediaBrowserCompatSearchResultReceiver()));
        this.MediaBrowserCompatCustomActionResultReceiver = applicationContext;
        this.MediaDescriptionCompat = setenabledecoderfallback;
        this.MediaBrowserCompatMediaItem = workDatabase;
        this.AudioAttributesImplApi26Parcelizer = handleplatformaudiofocuschange;
        this.MediaMetadataCompat = bundleable;
        this.RemoteActionCompatParcelizer = bVar;
        this.MediaBrowserCompatSearchResultReceiver = list;
        TopUserCompanion topUserCompanion = getPreviousMediaItemIndex.read(setenabledecoderfallback);
        this.RatingCompat = topUserCompanion;
        this.AudioAttributesImplApi21Parcelizer = new forceDisableMediaCodecAsynchronousQueueing(this.MediaBrowserCompatMediaItem);
        setAudioFocusState.RemoteActionCompatParcelizer(list, this.AudioAttributesImplApi26Parcelizer, setenabledecoderfallback.read(), this.MediaBrowserCompatMediaItem, bVar);
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(new ForceStopRunnable(applicationContext, this));
        BasePlayer.write(topUserCompanion, this.MediaBrowserCompatCustomActionResultReceiver, bVar, workDatabase);
    }

    private Context RatingCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final WorkDatabase AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final b AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<willPauseWhenDucked> RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final handlePlatformAudioFocusChange IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setEnableDecoderFallback MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final forceDisableMediaCodecAsynchronousQueueing write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Bundleable MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.getChildIndexByWindowIndex
    public final onTransact AudioAttributesCompatParcelizer(List<? extends getChildIndexByChildUid> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new AudioFocusManagerPlayerControl(this, list).read();
    }

    @Override // kotlin.getChildIndexByWindowIndex
    public final onTransact write(String str, g2 g2Var, List<onServiceDisconnected> list) {
        return new AudioFocusManagerPlayerControl(this, str, g2Var, list).read();
    }

    @Override // kotlin.getChildIndexByWindowIndex
    public final onTransact RemoteActionCompatParcelizer(String str, fa faVar, AbstractConcatenatedTimeline abstractConcatenatedTimeline) {
        if (faVar == fa.write) {
            return isCurrentMediaItemSeekable.read(this, str, abstractConcatenatedTimeline);
        }
        return AudioAttributesCompatParcelizer(str, faVar, abstractConcatenatedTimeline).read();
    }

    private AudioFocusManagerPlayerControl AudioAttributesCompatParcelizer(String str, fa faVar, AbstractConcatenatedTimeline abstractConcatenatedTimeline) {
        g2 g2Var;
        if (faVar == fa.read) {
            g2Var = g2.read;
        } else {
            g2Var = g2.AudioAttributesCompatParcelizer;
        }
        return new AudioFocusManagerPlayerControl(this, str, g2Var, Collections.singletonList(abstractConcatenatedTimeline));
    }

    public final onTransact read(UUID uuid) {
        return DefaultMediaClock.AudioAttributesCompatParcelizer(uuid, this);
    }

    @Override // kotlin.getChildIndexByWindowIndex
    public final onTransact IconCompatParcelizer(String str) {
        return DefaultMediaClock.read(str, this);
    }

    @Override // kotlin.getChildIndexByWindowIndex
    public final onTransact read() {
        return DefaultMediaClock.AudioAttributesCompatParcelizer(this);
    }

    public final void AudioAttributesCompatParcelizer(CProjection cProjection, int i) {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(new forceEnableMediaCodecAsynchronousQueueing(this.AudioAttributesImplApi26Parcelizer, new lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener(cProjection), true, i));
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        getPreviousChildIndex.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer().getOnFastForward(), "ReschedulingWork", new getCreatedOnDateMs() { // from class: o.hasNextWindow
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        });
    }

    final /* synthetic */ getShowPopup AudioAttributesImplBaseParcelizer() {
        seekToNextWindow.RemoteActionCompatParcelizer(RatingCompat());
        AudioAttributesImplApi26Parcelizer().onMediaButtonEvent().MediaBrowserCompatItemReceiver();
        setAudioFocusState.write(AudioAttributesCompatParcelizer(), AudioAttributesImplApi26Parcelizer(), RemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        synchronized (AudioAttributesCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver = true;
            BroadcastReceiver.PendingResult pendingResult = this.AudioAttributesImplBaseParcelizer;
            if (pendingResult != null) {
                pendingResult.finish();
                this.AudioAttributesImplBaseParcelizer = null;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (AudioAttributesCompatParcelizer) {
            BroadcastReceiver.PendingResult pendingResult2 = this.AudioAttributesImplBaseParcelizer;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.AudioAttributesImplBaseParcelizer = pendingResult;
            if (this.MediaBrowserCompatItemReceiver) {
                pendingResult.finish();
                this.AudioAttributesImplBaseParcelizer = null;
            }
        }
    }

    static class AudioAttributesCompatParcelizer {
        static boolean RemoteActionCompatParcelizer(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
}
