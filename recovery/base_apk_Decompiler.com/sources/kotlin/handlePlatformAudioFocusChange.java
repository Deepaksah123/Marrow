package kotlin;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.isCurrentWindowSeekable;

/* JADX INFO: loaded from: classes2.dex */
public final class handlePlatformAudioFocusChange implements toBundle {
    private WorkDatabase MediaBrowserCompatCustomActionResultReceiver;
    private setEnableDecoderFallback MediaBrowserCompatSearchResultReceiver;
    private b RemoteActionCompatParcelizer;
    private Context read;
    private Map<String, isCurrentWindowSeekable> write = new HashMap();
    private Map<String, isCurrentWindowSeekable> AudioAttributesImplApi21Parcelizer = new HashMap();
    private Set<String> IconCompatParcelizer = new HashSet();
    private final List<AudioBecomingNoisyManagerAudioBecomingNoisyReceiver> AudioAttributesImplApi26Parcelizer = new ArrayList();
    private PowerManager.WakeLock AudioAttributesCompatParcelizer = null;
    private final Object AudioAttributesImplBaseParcelizer = new Object();
    private Map<String, Set<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener>> MediaBrowserCompatItemReceiver = new HashMap();

    static {
        n.write("Processor");
    }

    public handlePlatformAudioFocusChange(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase) {
        this.read = context;
        this.RemoteActionCompatParcelizer = bVar;
        this.MediaBrowserCompatSearchResultReceiver = setenabledecoderfallback;
        this.MediaBrowserCompatCustomActionResultReceiver = workDatabase;
    }

    public final boolean IconCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        CProjection cProjectionRemoteActionCompatParcelizer = lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener.RemoteActionCompatParcelizer();
        final String strAudioAttributesCompatParcelizer = cProjectionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        final ArrayList arrayList = new ArrayList();
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = (CVideoChangeFrameRateStrategy) this.MediaBrowserCompatCustomActionResultReceiver.write(new Callable() { // from class: o.executePlayerCommand
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.RemoteActionCompatParcelizer(arrayList, strAudioAttributesCompatParcelizer);
            }
        });
        if (cVideoChangeFrameRateStrategy == null) {
            n.write();
            Objects.toString(cProjectionRemoteActionCompatParcelizer);
            IconCompatParcelizer(cProjectionRemoteActionCompatParcelizer);
            return false;
        }
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            if (IconCompatParcelizer(strAudioAttributesCompatParcelizer)) {
                Set<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> set = this.MediaBrowserCompatItemReceiver.get(strAudioAttributesCompatParcelizer);
                if (set.iterator().next().RemoteActionCompatParcelizer().RemoteActionCompatParcelizer() == cProjectionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                    set.add(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener);
                    n.write();
                    Objects.toString(cProjectionRemoteActionCompatParcelizer);
                } else {
                    IconCompatParcelizer(cProjectionRemoteActionCompatParcelizer);
                }
                return false;
            }
            if (cVideoChangeFrameRateStrategy.getOnPlay() != cProjectionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                IconCompatParcelizer(cProjectionRemoteActionCompatParcelizer);
                return false;
            }
            final isCurrentWindowSeekable iscurrentwindowseekableRemoteActionCompatParcelizer = new isCurrentWindowSeekable.AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver, this, this.MediaBrowserCompatCustomActionResultReceiver, cVideoChangeFrameRateStrategy, arrayList).write(remoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            final Mp4ExtractorExternalSyntheticLambda0<Boolean> mp4ExtractorExternalSyntheticLambda0 = iscurrentwindowseekableRemoteActionCompatParcelizer.read();
            mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(new Runnable() { // from class: o.requestAudioFocusDefault
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0, iscurrentwindowseekableRemoteActionCompatParcelizer);
                }
            }, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer());
            this.write.put(strAudioAttributesCompatParcelizer, iscurrentwindowseekableRemoteActionCompatParcelizer);
            HashSet hashSet = new HashSet();
            hashSet.add(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener);
            this.MediaBrowserCompatItemReceiver.put(strAudioAttributesCompatParcelizer, hashSet);
            n.write();
            getClass().getSimpleName();
            Objects.toString(cProjectionRemoteActionCompatParcelizer);
            return true;
        }
    }

    final /* synthetic */ CVideoChangeFrameRateStrategy RemoteActionCompatParcelizer(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.MediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId().IconCompatParcelizer(str));
        return this.MediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent().AudioAttributesCompatParcelizer(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void AudioAttributesCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0, isCurrentWindowSeekable iscurrentwindowseekable) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) mp4ExtractorExternalSyntheticLambda0.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        IconCompatParcelizer(iscurrentwindowseekable, zBooleanValue);
    }

    @Override // kotlin.toBundle
    public final void read(String str, eb ebVar) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            n.write();
            isCurrentWindowSeekable iscurrentwindowseekableRemove = this.write.remove(str);
            if (iscurrentwindowseekableRemove != null) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    PowerManager.WakeLock wakeLockRemoteActionCompatParcelizer = setEnableAudioTrackPlaybackParams.RemoteActionCompatParcelizer(this.read, "ProcessorForegroundLck");
                    this.AudioAttributesCompatParcelizer = wakeLockRemoteActionCompatParcelizer;
                    wakeLockRemoteActionCompatParcelizer.acquire();
                }
                this.AudioAttributesImplApi21Parcelizer.put(str, iscurrentwindowseekableRemove);
                _isNaN.startForegroundService(this.read, BundleListRetriever.RemoteActionCompatParcelizer(this.read, iscurrentwindowseekableRemove.AudioAttributesCompatParcelizer(), ebVar));
            }
        }
    }

    public final boolean IconCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, int i) {
        isCurrentWindowSeekable iscurrentwindowseekableWrite;
        String strAudioAttributesCompatParcelizer = lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            iscurrentwindowseekableWrite = write(strAudioAttributesCompatParcelizer);
        }
        return RemoteActionCompatParcelizer(iscurrentwindowseekableWrite, i);
    }

    public final boolean AudioAttributesCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, int i) {
        String strAudioAttributesCompatParcelizer = lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            if (this.AudioAttributesImplApi21Parcelizer.get(strAudioAttributesCompatParcelizer) != null) {
                n.write();
                return false;
            }
            Set<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> set = this.MediaBrowserCompatItemReceiver.get(strAudioAttributesCompatParcelizer);
            if (set != null && set.contains(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener)) {
                return RemoteActionCompatParcelizer(write(strAudioAttributesCompatParcelizer), i);
            }
            return false;
        }
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        isCurrentWindowSeekable iscurrentwindowseekableWrite;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            n.write();
            this.IconCompatParcelizer.add(str);
            iscurrentwindowseekableWrite = write(str);
        }
        return RemoteActionCompatParcelizer(iscurrentwindowseekableWrite, 1);
    }

    public final boolean AudioAttributesCompatParcelizer(String str) {
        boolean zContains;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            zContains = this.IconCompatParcelizer.contains(str);
        }
        return zContains;
    }

    public final boolean IconCompatParcelizer(String str) {
        boolean z;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            z = AudioAttributesImplApi26Parcelizer(str) != null;
        }
        return z;
    }

    public final void IconCompatParcelizer(AudioBecomingNoisyManagerAudioBecomingNoisyReceiver audioBecomingNoisyManagerAudioBecomingNoisyReceiver) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.add(audioBecomingNoisyManagerAudioBecomingNoisyReceiver);
        }
    }

    public final void read(AudioBecomingNoisyManagerAudioBecomingNoisyReceiver audioBecomingNoisyManagerAudioBecomingNoisyReceiver) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.remove(audioBecomingNoisyManagerAudioBecomingNoisyReceiver);
        }
    }

    private void IconCompatParcelizer(isCurrentWindowSeekable iscurrentwindowseekable, boolean z) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            CProjection cProjectionAudioAttributesCompatParcelizer = iscurrentwindowseekable.AudioAttributesCompatParcelizer();
            String strAudioAttributesCompatParcelizer = cProjectionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            if (AudioAttributesImplApi26Parcelizer(strAudioAttributesCompatParcelizer) == iscurrentwindowseekable) {
                write(strAudioAttributesCompatParcelizer);
            }
            n.write();
            getClass().getSimpleName();
            Iterator<AudioBecomingNoisyManagerAudioBecomingNoisyReceiver> it = this.AudioAttributesImplApi26Parcelizer.iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer(cProjectionAudioAttributesCompatParcelizer, z);
            }
        }
    }

    private isCurrentWindowSeekable AudioAttributesImplApi26Parcelizer(String str) {
        isCurrentWindowSeekable iscurrentwindowseekable = this.AudioAttributesImplApi21Parcelizer.get(str);
        return iscurrentwindowseekable == null ? this.write.get(str) : iscurrentwindowseekable;
    }

    public final CVideoChangeFrameRateStrategy read(String str) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            isCurrentWindowSeekable iscurrentwindowseekableAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(str);
            if (iscurrentwindowseekableAudioAttributesImplApi26Parcelizer == null) {
                return null;
            }
            return iscurrentwindowseekableAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }
    }

    private void IconCompatParcelizer(final CProjection cProjection) {
        final boolean z = false;
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer().execute(new Runnable(cProjection, z) { // from class: o.requestAudioFocus
            public final /* synthetic */ boolean IconCompatParcelizer = false;
            public final /* synthetic */ CProjection read;

            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, this.IconCompatParcelizer);
            }
        });
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(CProjection cProjection, boolean z) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            Iterator<AudioBecomingNoisyManagerAudioBecomingNoisyReceiver> it = this.AudioAttributesImplApi26Parcelizer.iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer(cProjection, z);
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            if (this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
                try {
                    this.read.startService(BundleListRetriever.read(this.read));
                } catch (Throwable unused) {
                    n.write();
                }
                PowerManager.WakeLock wakeLock = this.AudioAttributesCompatParcelizer;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.AudioAttributesCompatParcelizer = null;
                }
            }
        }
    }

    private isCurrentWindowSeekable write(String str) {
        isCurrentWindowSeekable iscurrentwindowseekableRemove = this.AudioAttributesImplApi21Parcelizer.remove(str);
        boolean z = iscurrentwindowseekableRemove != null;
        if (!z) {
            iscurrentwindowseekableRemove = this.write.remove(str);
        }
        this.MediaBrowserCompatItemReceiver.remove(str);
        if (z) {
            RemoteActionCompatParcelizer();
        }
        return iscurrentwindowseekableRemove;
    }

    private static boolean RemoteActionCompatParcelizer(isCurrentWindowSeekable iscurrentwindowseekable, int i) {
        if (iscurrentwindowseekable != null) {
            iscurrentwindowseekable.read(i);
            n.write();
            return true;
        }
        n.write();
        return false;
    }
}
