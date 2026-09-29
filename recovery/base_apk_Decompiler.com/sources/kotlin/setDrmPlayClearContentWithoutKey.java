package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.isPrepared;
import kotlin.rewrapCtorProblem;
import kotlin.setDrmConfiguration;
import kotlin.setLiveMinOffsetMs;

/* JADX INFO: loaded from: classes2.dex */
final class setDrmPlayClearContentWithoutKey<R> implements setDrmConfiguration.read<R>, isPrepared.read {
    private static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();
    final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private setLiveMaxPlaybackSpeed AudioAttributesImplApi26Parcelizer;
    private final setDrmUuid AudioAttributesImplBaseParcelizer;
    private setDrmConfiguration<R> MediaBrowserCompatCustomActionResultReceiver;
    private final setForceDefaultLicenseUri MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private volatile boolean MediaBrowserCompatSearchResultReceiver;
    private final AtomicInteger MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    private final setForceDefaultLicenseUri RemoteActionCompatParcelizer;
    private final rewrapCtorProblem.IconCompatParcelizer<setDrmPlayClearContentWithoutKey<?>> handleMediaPlayPauseIfPendingOnHandler;
    private setMimeType<?> onAddQueueItem;
    private onVolumeChanged onCommand;
    private boolean onCustomAction;
    private boolean onFastForward;
    private final setLiveMinOffsetMs.IconCompatParcelizer onMediaButtonEvent;
    private final setForceDefaultLicenseUri onPause;
    private final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList onPlay;
    private final setForceDefaultLicenseUri onPlayFromMediaId;
    private boolean onPrepareFromSearch;
    private onTracksChanged read;
    setLiveMinOffsetMs<?> write;

    setDrmPlayClearContentWithoutKey(setForceDefaultLicenseUri setforcedefaultlicenseuri, setForceDefaultLicenseUri setforcedefaultlicenseuri2, setForceDefaultLicenseUri setforcedefaultlicenseuri3, setForceDefaultLicenseUri setforcedefaultlicenseuri4, setDrmUuid setdrmuuid, setLiveMinOffsetMs.IconCompatParcelizer iconCompatParcelizer, rewrapCtorProblem.IconCompatParcelizer<setDrmPlayClearContentWithoutKey<?>> iconCompatParcelizer2) {
        this(setforcedefaultlicenseuri, setforcedefaultlicenseuri2, setforcedefaultlicenseuri3, setforcedefaultlicenseuri4, setdrmuuid, iconCompatParcelizer, iconCompatParcelizer2, IconCompatParcelizer);
    }

    private setDrmPlayClearContentWithoutKey(setForceDefaultLicenseUri setforcedefaultlicenseuri, setForceDefaultLicenseUri setforcedefaultlicenseuri2, setForceDefaultLicenseUri setforcedefaultlicenseuri3, setForceDefaultLicenseUri setforcedefaultlicenseuri4, setDrmUuid setdrmuuid, setLiveMinOffsetMs.IconCompatParcelizer iconCompatParcelizer, rewrapCtorProblem.IconCompatParcelizer<setDrmPlayClearContentWithoutKey<?>> iconCompatParcelizer2, IconCompatParcelizer iconCompatParcelizer3) {
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        this.onPlay = lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList.write();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new AtomicInteger();
        this.MediaBrowserCompatItemReceiver = setforcedefaultlicenseuri;
        this.onPause = setforcedefaultlicenseuri2;
        this.onPlayFromMediaId = setforcedefaultlicenseuri3;
        this.RemoteActionCompatParcelizer = setforcedefaultlicenseuri4;
        this.AudioAttributesImplBaseParcelizer = setdrmuuid;
        this.onMediaButtonEvent = iconCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer3;
    }

    final setDrmPlayClearContentWithoutKey<R> AudioAttributesCompatParcelizer(onVolumeChanged onvolumechanged, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.onCommand = onvolumechanged;
            this.RatingCompat = z;
            this.onPrepareFromSearch = z2;
            this.onFastForward = z3;
            this.onCustomAction = z4;
        }
        return this;
    }

    public final void IconCompatParcelizer(setDrmConfiguration<R> setdrmconfiguration) {
        synchronized (this) {
            this.MediaBrowserCompatCustomActionResultReceiver = setdrmconfiguration;
            (setdrmconfiguration.write() ? this.MediaBrowserCompatItemReceiver : IconCompatParcelizer()).execute(setdrmconfiguration);
        }
    }

    final void write(getLoadingPeriod getloadingperiod, Executor executor) {
        synchronized (this) {
            this.onPlay.read();
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getloadingperiod, executor);
            if (this.MediaDescriptionCompat) {
                IconCompatParcelizer(1);
                executor.execute(new RemoteActionCompatParcelizer(getloadingperiod));
            } else if (this.MediaMetadataCompat) {
                IconCompatParcelizer(1);
                executor.execute(new read(getloadingperiod));
            } else {
                moveMediaSource.AudioAttributesCompatParcelizer(!this.MediaBrowserCompatSearchResultReceiver, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    final void IconCompatParcelizer(getLoadingPeriod getloadingperiod) {
        try {
            getloadingperiod.AudioAttributesCompatParcelizer(this.write, this.read, this.MediaBrowserCompatMediaItem);
        } catch (Throwable th) {
            throw new setCustomCacheKey(th);
        }
    }

    final void write(getLoadingPeriod getloadingperiod) {
        try {
            getloadingperiod.read(this.AudioAttributesImplApi26Parcelizer);
        } catch (Throwable th) {
            throw new setCustomCacheKey(th);
        }
    }

    final void RemoteActionCompatParcelizer(getLoadingPeriod getloadingperiod) {
        synchronized (this) {
            this.onPlay.read();
            this.AudioAttributesCompatParcelizer.read(getloadingperiod);
            if (this.AudioAttributesCompatParcelizer.read()) {
                AudioAttributesImplApi21Parcelizer();
                if ((this.MediaDescriptionCompat || this.MediaMetadataCompat) && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get() == 0) {
                    MediaBrowserCompatItemReceiver();
                }
            }
        }
    }

    final boolean read() {
        return this.onCustomAction;
    }

    private setForceDefaultLicenseUri IconCompatParcelizer() {
        if (this.onPrepareFromSearch) {
            return this.onPlayFromMediaId;
        }
        return this.onFastForward ? this.RemoteActionCompatParcelizer : this.onPause;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(this, this.onCommand);
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat || this.MediaDescriptionCompat || this.MediaBrowserCompatSearchResultReceiver;
    }

    private void AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            this.onPlay.read();
            if (this.MediaBrowserCompatSearchResultReceiver) {
                this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver();
                MediaBrowserCompatItemReceiver();
                return;
            }
            if (this.AudioAttributesCompatParcelizer.read()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.MediaDescriptionCompat) {
                throw new IllegalStateException("Already have resource");
            }
            this.write = IconCompatParcelizer.IconCompatParcelizer(this.onAddQueueItem, this.RatingCompat, this.onCommand, this.onMediaButtonEvent);
            this.MediaDescriptionCompat = true;
            AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            IconCompatParcelizer(AudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer() + 1);
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this, this.onCommand, this.write);
            for (write writeVar : AudioAttributesCompatParcelizer2) {
                writeVar.write.execute(new RemoteActionCompatParcelizer(writeVar.IconCompatParcelizer));
            }
            write();
        }
    }

    private void IconCompatParcelizer(int i) {
        setLiveMinOffsetMs<?> setliveminoffsetms;
        synchronized (this) {
            moveMediaSource.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), "Not yet complete!");
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getAndAdd(i) == 0 && (setliveminoffsetms = this.write) != null) {
                setliveminoffsetms.AudioAttributesCompatParcelizer();
            }
        }
    }

    final void write() {
        setLiveMinOffsetMs<?> setliveminoffsetms;
        synchronized (this) {
            this.onPlay.read();
            moveMediaSource.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), "Not yet complete!");
            int iDecrementAndGet = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.decrementAndGet();
            moveMediaSource.AudioAttributesCompatParcelizer(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                setliveminoffsetms = this.write;
                MediaBrowserCompatItemReceiver();
            } else {
                setliveminoffsetms = null;
            }
        }
        if (setliveminoffsetms != null) {
            setliveminoffsetms.AudioAttributesImplApi26Parcelizer();
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        synchronized (this) {
            if (this.onCommand == null) {
                throw new IllegalArgumentException();
            }
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            this.onCommand = null;
            this.write = null;
            this.onAddQueueItem = null;
            this.MediaMetadataCompat = false;
            this.MediaBrowserCompatSearchResultReceiver = false;
            this.MediaDescriptionCompat = false;
            this.MediaBrowserCompatMediaItem = false;
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.AudioAttributesImplApi26Parcelizer = null;
            this.read = null;
            this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setDrmConfiguration.read
    public final void write(setMimeType<R> setmimetype, onTracksChanged ontrackschanged, boolean z) {
        synchronized (this) {
            this.onAddQueueItem = setmimetype;
            this.read = ontrackschanged;
            this.MediaBrowserCompatMediaItem = z;
        }
        AudioAttributesImplBaseParcelizer();
    }

    @Override // o.setDrmConfiguration.read
    public final void AudioAttributesCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed) {
        synchronized (this) {
            this.AudioAttributesImplApi26Parcelizer = setlivemaxplaybackspeed;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // o.setDrmConfiguration.read
    public final void read(setDrmConfiguration<?> setdrmconfiguration) {
        IconCompatParcelizer().execute(setdrmconfiguration);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            this.onPlay.read();
            if (this.MediaBrowserCompatSearchResultReceiver) {
                MediaBrowserCompatItemReceiver();
                return;
            }
            if (this.AudioAttributesCompatParcelizer.read()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.MediaMetadataCompat) {
                throw new IllegalStateException("Already failed once");
            }
            this.MediaMetadataCompat = true;
            onVolumeChanged onvolumechanged = this.onCommand;
            AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            IconCompatParcelizer(AudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer() + 1);
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this, onvolumechanged, null);
            for (write writeVar : AudioAttributesCompatParcelizer2) {
                writeVar.write.execute(new read(writeVar.IconCompatParcelizer));
            }
            write();
        }
    }

    @Override // o.isPrepared.read
    public final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList I_() {
        return this.onPlay;
    }

    class read implements Runnable {
        private final getLoadingPeriod RemoteActionCompatParcelizer;

        read(getLoadingPeriod getloadingperiod) {
            this.RemoteActionCompatParcelizer = getloadingperiod;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                synchronized (setDrmPlayClearContentWithoutKey.this) {
                    if (setDrmPlayClearContentWithoutKey.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer)) {
                        setDrmPlayClearContentWithoutKey.this.write(this.RemoteActionCompatParcelizer);
                    }
                    setDrmPlayClearContentWithoutKey.this.write();
                }
            }
        }
    }

    class RemoteActionCompatParcelizer implements Runnable {
        private final getLoadingPeriod AudioAttributesCompatParcelizer;

        RemoteActionCompatParcelizer(getLoadingPeriod getloadingperiod) {
            this.AudioAttributesCompatParcelizer = getloadingperiod;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                synchronized (setDrmPlayClearContentWithoutKey.this) {
                    if (setDrmPlayClearContentWithoutKey.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                        setDrmPlayClearContentWithoutKey.this.write.AudioAttributesCompatParcelizer();
                        setDrmPlayClearContentWithoutKey.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                        setDrmPlayClearContentWithoutKey.this.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    }
                    setDrmPlayClearContentWithoutKey.this.write();
                }
            }
        }
    }

    static final class AudioAttributesCompatParcelizer implements Iterable<write> {
        private final List<write> IconCompatParcelizer;

        AudioAttributesCompatParcelizer() {
            this(new ArrayList(2));
        }

        private AudioAttributesCompatParcelizer(List<write> list) {
            this.IconCompatParcelizer = list;
        }

        final void RemoteActionCompatParcelizer(getLoadingPeriod getloadingperiod, Executor executor) {
            this.IconCompatParcelizer.add(new write(getloadingperiod, executor));
        }

        final void read(getLoadingPeriod getloadingperiod) {
            this.IconCompatParcelizer.remove(AudioAttributesCompatParcelizer(getloadingperiod));
        }

        final boolean IconCompatParcelizer(getLoadingPeriod getloadingperiod) {
            return this.IconCompatParcelizer.contains(AudioAttributesCompatParcelizer(getloadingperiod));
        }

        final boolean read() {
            return this.IconCompatParcelizer.isEmpty();
        }

        final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer.size();
        }

        final void IconCompatParcelizer() {
            this.IconCompatParcelizer.clear();
        }

        final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return new AudioAttributesCompatParcelizer(new ArrayList(this.IconCompatParcelizer));
        }

        private static write AudioAttributesCompatParcelizer(getLoadingPeriod getloadingperiod) {
            return new write(getloadingperiod, getSize.read());
        }

        @Override // java.lang.Iterable
        public final Iterator<write> iterator() {
            return this.IconCompatParcelizer.iterator();
        }
    }

    static final class write {
        final getLoadingPeriod IconCompatParcelizer;
        final Executor write;

        write(getLoadingPeriod getloadingperiod, Executor executor) {
            this.IconCompatParcelizer = getloadingperiod;
            this.write = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof write) {
                return this.IconCompatParcelizer.equals(((write) obj).IconCompatParcelizer);
            }
            return false;
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }
    }

    static class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        public static <R> setLiveMinOffsetMs<R> IconCompatParcelizer(setMimeType<R> setmimetype, boolean z, onVolumeChanged onvolumechanged, setLiveMinOffsetMs.IconCompatParcelizer iconCompatParcelizer) {
            return new setLiveMinOffsetMs<>(setmimetype, z, true, onvolumechanged, iconCompatParcelizer);
        }
    }
}
