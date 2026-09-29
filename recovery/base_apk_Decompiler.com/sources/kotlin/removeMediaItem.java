package kotlin;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.getChildPeriodUidFromConcatenatedUid;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
public final class removeMediaItem implements willPauseWhenDucked, getMediaClock, AudioBecomingNoisyManagerAudioBecomingNoisyReceiver {
    private final getState AudioAttributesCompatParcelizer;
    private Boolean AudioAttributesImplApi21Parcelizer;
    private final handlePlatformAudioFocusChange AudioAttributesImplApi26Parcelizer;
    private final b IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final seekToNextMediaItem MediaBrowserCompatMediaItem;
    private final setEnableDecoderFallback MediaBrowserCompatSearchResultReceiver;
    private final getCurrentWindowIndex RatingCompat;
    private previous RemoteActionCompatParcelizer;
    private final Context read;
    private final Map<CProjection, setPassingYear> write = new HashMap();
    private final Object AudioAttributesImplBaseParcelizer = new Object();
    private final setAudioAttributes MediaMetadataCompat = setAudioAttributes.RemoteActionCompatParcelizer();
    private final Map<CProjection, write> MediaBrowserCompatItemReceiver = new HashMap();

    @Override // kotlin.willPauseWhenDucked
    public final boolean IconCompatParcelizer() {
        return false;
    }

    static {
        n.write("GreedyScheduler");
    }

    public removeMediaItem(Context context, b bVar, Bundleable bundleable, handlePlatformAudioFocusChange handleplatformaudiofocuschange, getCurrentWindowIndex getcurrentwindowindex, setEnableDecoderFallback setenabledecoderfallback) {
        this.read = context;
        CctBackendFactory mediaBrowserCompatCustomActionResultReceiver = bVar.getMediaBrowserCompatCustomActionResultReceiver();
        this.RemoteActionCompatParcelizer = new previous(this, mediaBrowserCompatCustomActionResultReceiver, bVar.getAudioAttributesCompatParcelizer());
        this.MediaBrowserCompatMediaItem = new seekToNextMediaItem(mediaBrowserCompatCustomActionResultReceiver, getcurrentwindowindex);
        this.MediaBrowserCompatSearchResultReceiver = setenabledecoderfallback;
        this.AudioAttributesCompatParcelizer = new getState(bundleable);
        this.IconCompatParcelizer = bVar;
        this.AudioAttributesImplApi26Parcelizer = handleplatformaudiofocuschange;
        this.RatingCompat = getcurrentwindowindex;
    }

    @Override // kotlin.willPauseWhenDucked
    public final void read(CVideoChangeFrameRateStrategy... cVideoChangeFrameRateStrategyArr) {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            write();
        }
        if (!this.AudioAttributesImplApi21Parcelizer.booleanValue()) {
            n.write();
            return;
        }
        AudioAttributesCompatParcelizer();
        HashSet<CVideoChangeFrameRateStrategy> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy : cVideoChangeFrameRateStrategyArr) {
            if (!this.MediaMetadataCompat.read(onReleased.read(cVideoChangeFrameRateStrategy))) {
                long jMax = Math.max(cVideoChangeFrameRateStrategy.read(), RemoteActionCompatParcelizer(cVideoChangeFrameRateStrategy));
                long j = this.IconCompatParcelizer.getAudioAttributesCompatParcelizer().read();
                if (cVideoChangeFrameRateStrategy.onCommand == getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer) {
                    if (j < jMax) {
                        previous previousVar = this.RemoteActionCompatParcelizer;
                        if (previousVar != null) {
                            previousVar.IconCompatParcelizer(cVideoChangeFrameRateStrategy, jMax);
                        }
                    } else if (cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer()) {
                        e eVar = cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer;
                        if (eVar.getRemoteActionCompatParcelizer()) {
                            n.write();
                            Objects.toString(cVideoChangeFrameRateStrategy);
                        } else if (eVar.MediaBrowserCompatCustomActionResultReceiver()) {
                            n.write();
                            Objects.toString(cVideoChangeFrameRateStrategy);
                        } else {
                            hashSet.add(cVideoChangeFrameRateStrategy);
                            hashSet2.add(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
                        }
                    } else if (!this.MediaMetadataCompat.read(onReleased.read(cVideoChangeFrameRateStrategy))) {
                        n.write();
                        String str = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
                        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer(cVideoChangeFrameRateStrategy);
                        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer);
                        this.RatingCompat.AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer);
                    }
                }
            }
        }
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                n.write();
                for (CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy2 : hashSet) {
                    CProjection cProjection = onReleased.read(cVideoChangeFrameRateStrategy2);
                    if (!this.write.containsKey(cProjection)) {
                        this.write.put(cProjection, getTrackType.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, cVideoChangeFrameRateStrategy2, this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(), this));
                    }
                }
            }
        }
    }

    private void write() {
        this.AudioAttributesImplApi21Parcelizer = Boolean.valueOf(createRenderers.AudioAttributesCompatParcelizer(this.read, this.IconCompatParcelizer));
    }

    @Override // kotlin.willPauseWhenDucked
    public final void AudioAttributesCompatParcelizer(String str) {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            write();
        }
        if (!this.AudioAttributesImplApi21Parcelizer.booleanValue()) {
            n.write();
            return;
        }
        AudioAttributesCompatParcelizer();
        n.write();
        previous previousVar = this.RemoteActionCompatParcelizer;
        if (previousVar != null) {
            previousVar.write(str);
        }
        for (lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener : this.MediaMetadataCompat.write(str)) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener);
            this.RatingCompat.read(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener);
        }
    }

    @Override // kotlin.getMediaClock
    public final void write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, setMediaItems setmediaitems) {
        CProjection cProjection = onReleased.read(cVideoChangeFrameRateStrategy);
        if (setmediaitems instanceof setMediaItems.read) {
            if (this.MediaMetadataCompat.read(cProjection)) {
                return;
            }
            n.write();
            Objects.toString(cProjection);
            lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer(cProjection);
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer);
            this.RatingCompat.AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer);
            return;
        }
        n.write();
        Objects.toString(cProjection);
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer(cProjection);
        if (lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer != null) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer);
            this.RatingCompat.RemoteActionCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer, ((setMediaItems.RemoteActionCompatParcelizer) setmediaitems).write());
        }
    }

    @Override // kotlin.AudioBecomingNoisyManagerAudioBecomingNoisyReceiver
    public final void RemoteActionCompatParcelizer(CProjection cProjection, boolean z) {
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer(cProjection);
        if (lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer != null) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer);
        }
        RemoteActionCompatParcelizer(cProjection);
        if (z) {
            return;
        }
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            this.MediaBrowserCompatItemReceiver.remove(cProjection);
        }
    }

    private void RemoteActionCompatParcelizer(CProjection cProjection) {
        setPassingYear setpassingyearRemove;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            setpassingyearRemove = this.write.remove(cProjection);
        }
        if (setpassingyearRemove != null) {
            n.write();
            Objects.toString(cProjection);
            setpassingyearRemove.RemoteActionCompatParcelizer((CancellationException) null);
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this);
        this.MediaBrowserCompatCustomActionResultReceiver = true;
    }

    private long RemoteActionCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        long j;
        long jMax;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            CProjection cProjection = onReleased.read(cVideoChangeFrameRateStrategy);
            write writeVar = this.MediaBrowserCompatItemReceiver.get(cProjection);
            byte b = 0;
            if (writeVar == null) {
                writeVar = new write(cVideoChangeFrameRateStrategy.onAddQueueItem, this.IconCompatParcelizer.getAudioAttributesCompatParcelizer().read(), b);
                this.MediaBrowserCompatItemReceiver.put(cProjection, writeVar);
            }
            j = writeVar.IconCompatParcelizer;
            jMax = Math.max((cVideoChangeFrameRateStrategy.onAddQueueItem - writeVar.read) - 5, 0);
        }
        return j + (jMax * 30000);
    }

    static class write {
        final long IconCompatParcelizer;
        final int read;

        /* synthetic */ write(int i, long j, byte b) {
            this(i, j);
        }

        private write(int i, long j) {
            this.read = i;
            this.IconCompatParcelizer = j;
        }
    }
}
