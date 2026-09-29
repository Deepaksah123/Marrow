package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.MetadataInputBuffer;
import kotlin.avcProfileNumberToConst;
import kotlin.getScore;

/* JADX INFO: loaded from: classes3.dex */
public class getCodecOutputMediaFormat implements Application.ActivityLifecycleCallbacks {
    private static volatile getCodecOutputMediaFormat read;
    private final WeakHashMap<Activity, getCodecNeedsEosPropagation> AudioAttributesCompatParcelizer;
    private final Set<WeakReference<write>> AudioAttributesImplApi21Parcelizer;
    private final MediaCodecUtilCodecKey AudioAttributesImplApi26Parcelizer;
    private Set<AudioAttributesCompatParcelizer> AudioAttributesImplBaseParcelizer;
    private final WeakHashMap<Activity, Boolean> IconCompatParcelizer;
    private lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter MediaBrowserCompatCustomActionResultReceiver;
    private final maybeInitCodecOrBypass MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private Timer MediaDescriptionCompat;
    private final Map<String, Long> MediaMetadataCompat;
    private boolean RatingCompat;
    private final WeakHashMap<Activity, Trace> RemoteActionCompatParcelizer;
    private Timer handleMediaPlayPauseIfPendingOnHandler;
    private final sortByScore onAddQueueItem;
    private final AtomicInteger onCustomAction;
    private final WeakHashMap<Activity, getCodecOperatingRate> write;

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer();
    }

    public interface write {
        void AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    public static getCodecOutputMediaFormat RemoteActionCompatParcelizer() {
        if (read == null) {
            synchronized (getCodecOutputMediaFormat.class) {
                if (read == null) {
                    read = new getCodecOutputMediaFormat(sortByScore.read(), new MediaCodecUtilCodecKey());
                }
            }
        }
        return read;
    }

    private getCodecOutputMediaFormat(sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey) {
        this(sortbyscore, mediaCodecUtilCodecKey, maybeInitCodecOrBypass.IconCompatParcelizer(), AudioAttributesCompatParcelizer());
    }

    private getCodecOutputMediaFormat(sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, maybeInitCodecOrBypass maybeinitcodecorbypass, boolean z) {
        this.IconCompatParcelizer = new WeakHashMap<>();
        this.write = new WeakHashMap<>();
        this.AudioAttributesCompatParcelizer = new WeakHashMap<>();
        this.RemoteActionCompatParcelizer = new WeakHashMap<>();
        this.MediaMetadataCompat = new HashMap();
        this.AudioAttributesImplApi21Parcelizer = new HashSet();
        this.AudioAttributesImplBaseParcelizer = new HashSet();
        this.onCustomAction = new AtomicInteger(0);
        this.MediaBrowserCompatCustomActionResultReceiver = lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.BACKGROUND;
        this.RatingCompat = false;
        this.MediaBrowserCompatMediaItem = true;
        this.onAddQueueItem = sortbyscore;
        this.AudioAttributesImplApi26Parcelizer = mediaCodecUtilCodecKey;
        this.MediaBrowserCompatItemReceiver = maybeinitcodecorbypass;
        this.MediaBrowserCompatSearchResultReceiver = z;
    }

    public final void IconCompatParcelizer(Context context) {
        synchronized (this) {
            if (this.RatingCompat) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.RatingCompat = true;
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        synchronized (this.MediaMetadataCompat) {
            Long l = this.MediaMetadataCompat.get(str);
            if (l == null) {
                this.MediaMetadataCompat.put(str, 1L);
            } else {
                this.MediaMetadataCompat.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.onCustomAction.addAndGet(1);
    }

    private void read(Activity activity) {
        if (read() && this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
            getCodecOperatingRate getcodecoperatingrate = new getCodecOperatingRate(activity);
            this.write.put(activity, getcodecoperatingrate);
            if (activity instanceof maybeGetTypeVariable) {
                getCodecNeedsEosPropagation getcodecneedseospropagation = new getCodecNeedsEosPropagation(this.AudioAttributesImplApi26Parcelizer, this.onAddQueueItem, this, getcodecoperatingrate);
                this.AudioAttributesCompatParcelizer.put(activity, getcodecneedseospropagation);
                ((maybeGetTypeVariable) activity).getSupportFragmentManager().write((FragmentManager.IconCompatParcelizer) getcodecneedseospropagation, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        read(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.write.remove(activity);
        if (this.AudioAttributesCompatParcelizer.containsKey(activity)) {
            ((maybeGetTypeVariable) activity).getSupportFragmentManager().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (read() && this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
                if (!this.write.containsKey(activity)) {
                    read(activity);
                }
                this.write.get(activity).write();
                Trace trace = new Trace(AudioAttributesCompatParcelizer(activity), this.onAddQueueItem, this.AudioAttributesImplApi26Parcelizer, this);
                trace.MediaBrowserCompatMediaItem();
                this.RemoteActionCompatParcelizer.put(activity, trace);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        synchronized (this) {
            if (read()) {
                write(activity);
            }
            if (this.IconCompatParcelizer.containsKey(activity)) {
                this.IconCompatParcelizer.remove(activity);
                if (this.IconCompatParcelizer.isEmpty()) {
                    this.handleMediaPlayPauseIfPendingOnHandler = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
                    RemoteActionCompatParcelizer(getScore.AudioAttributesCompatParcelizer.FOREGROUND_TRACE_NAME.toString(), this.MediaDescriptionCompat, this.handleMediaPlayPauseIfPendingOnHandler);
                    write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.BACKGROUND);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        synchronized (this) {
            if (this.IconCompatParcelizer.isEmpty()) {
                this.MediaDescriptionCompat = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
                this.IconCompatParcelizer.put(activity, Boolean.TRUE);
                if (this.MediaBrowserCompatMediaItem) {
                    write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND);
                    write();
                    this.MediaBrowserCompatMediaItem = false;
                } else {
                    RemoteActionCompatParcelizer(getScore.AudioAttributesCompatParcelizer.BACKGROUND_TRACE_NAME.toString(), this.handleMediaPlayPauseIfPendingOnHandler, this.MediaDescriptionCompat);
                    write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND);
                }
            } else {
                this.IconCompatParcelizer.put(activity, Boolean.TRUE);
            }
        }
    }

    public final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(WeakReference<write> weakReference) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer.add(weakReference);
        }
    }

    public final void write(WeakReference<write> weakReference) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer.remove(weakReference);
        }
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplBaseParcelizer.add(audioAttributesCompatParcelizer);
        }
    }

    private void write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.MediaBrowserCompatCustomActionResultReceiver = lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            Iterator<WeakReference<write>> it = this.AudioAttributesImplApi21Parcelizer.iterator();
            while (it.hasNext()) {
                write writeVar = it.next().get();
                if (writeVar != null) {
                    writeVar.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                } else {
                    it.remove();
                }
            }
        }
    }

    private void write() {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.AudioAttributesImplBaseParcelizer) {
                if (audioAttributesCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    private void write(Activity activity) {
        Trace trace = this.RemoteActionCompatParcelizer.get(activity);
        if (trace == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.remove(activity);
        MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer = this.write.get(activity).IconCompatParcelizer();
        if (!mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.RemoteActionCompatParcelizer()) {
            new Object[]{activity.getClass().getSimpleName()};
        } else {
            getCodecInfoAt.AudioAttributesCompatParcelizer(trace, mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.AudioAttributesCompatParcelizer());
            trace.MediaDescriptionCompat();
        }
    }

    private void RemoteActionCompatParcelizer(String str, Timer timer, Timer timer2) {
        if (this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
            MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = MetadataInputBuffer.read().read(str).IconCompatParcelizer(timer.write()).read(timer.write(timer2)).IconCompatParcelizer(getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer());
            int andSet = this.onCustomAction.getAndSet(0);
            synchronized (this.MediaMetadataCompat) {
                remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
                if (andSet != 0) {
                    remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer(getScore.read.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.MediaMetadataCompat.clear();
            }
            this.onAddQueueItem.IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer.MediaBrowserCompatMediaItem(), lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND_BACKGROUND);
        }
    }

    private boolean read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private static boolean AudioAttributesCompatParcelizer() {
        return getCodecOperatingRate.RemoteActionCompatParcelizer();
    }

    private static String AudioAttributesCompatParcelizer(Activity activity) {
        StringBuilder sb = new StringBuilder("_st_");
        sb.append(activity.getClass().getSimpleName());
        return sb.toString();
    }
}
