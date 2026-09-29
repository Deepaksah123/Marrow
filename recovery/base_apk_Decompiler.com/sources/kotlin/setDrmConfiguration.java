package kotlin;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.isPrepared;
import kotlin.rewrapCtorProblem;
import kotlin.setDrmLicenseRequestHeaders;
import kotlin.setDrmMultiSession;
import kotlin.setSelectionFlags;

/* JADX INFO: loaded from: classes2.dex */
final class setDrmConfiguration<R> implements setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer, Runnable, Comparable<setDrmConfiguration<?>>, isPrepared.read {
    private fromUri<?> AudioAttributesCompatParcelizer;
    private volatile setDrmLicenseRequestHeaders AudioAttributesImplApi21Parcelizer;
    private onVolumeChanged AudioAttributesImplBaseParcelizer;
    private onVolumeChanged IconCompatParcelizer;
    private Thread MediaBrowserCompatItemReceiver;
    private setRotationDegrees MediaBrowserCompatMediaItem;
    private volatile boolean MediaBrowserCompatSearchResultReceiver;
    private setLiveMaxOffsetMs MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private setDrmSessionForClearTypes MediaMetadataCompat;
    private int RatingCompat;
    private onTracksChanged RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private volatile boolean onAddQueueItem;
    private boolean onCommand;
    private Object onCustomAction;
    private setSampleRate onFastForward;
    private int onMediaButtonEvent;
    private r8lambda_r106e6zya8q8i_eKUnQWRolPk onPause;
    private final rewrapCtorProblem.IconCompatParcelizer<setDrmConfiguration<?>> onPlayFromMediaId;
    private onVolumeChanged onPlayFromSearch;
    private AudioAttributesImplApi26Parcelizer onPrepare;
    private long onPrepareFromMediaId;
    private AudioAttributesImplApi21Parcelizer onPrepareFromSearch;
    private int onRemoveQueueItem;
    private read<R> read;
    private Object write;
    private final setDrmForceDefaultLicenseUri<R> AudioAttributesImplApi26Parcelizer = new setDrmForceDefaultLicenseUri<>();
    private final List<Throwable> onPrepareFromUri = new ArrayList();
    private final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList onPlayFromUri = lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList.write();
    private final RemoteActionCompatParcelizer<?> MediaBrowserCompatCustomActionResultReceiver = new RemoteActionCompatParcelizer<>();
    private final IconCompatParcelizer onPlay = new IconCompatParcelizer();

    interface AudioAttributesCompatParcelizer {
        MediaItemClippingProperties AudioAttributesCompatParcelizer();
    }

    enum AudioAttributesImplApi21Parcelizer {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    enum AudioAttributesImplApi26Parcelizer {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    interface read<R> {
        void AudioAttributesCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed);

        void read(setDrmConfiguration<?> setdrmconfiguration);

        void write(setMimeType<R> setmimetype, onTracksChanged ontrackschanged, boolean z);
    }

    setDrmConfiguration(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, rewrapCtorProblem.IconCompatParcelizer<setDrmConfiguration<?>> iconCompatParcelizer) {
        this.MediaDescriptionCompat = audioAttributesCompatParcelizer;
        this.onPlayFromMediaId = iconCompatParcelizer;
    }

    final setDrmConfiguration<R> AudioAttributesCompatParcelizer(setRotationDegrees setrotationdegrees, Object obj, setLiveMaxOffsetMs setlivemaxoffsetms, onVolumeChanged onvolumechanged, int i, int i2, Class<?> cls, Class<R> cls2, setSampleRate setsamplerate, setDrmSessionForClearTypes setdrmsessionforcleartypes, Map<Class<?>, MediaItem<?>> map, boolean z, boolean z2, boolean z3, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, read<R> readVar, int i3) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(setrotationdegrees, obj, onvolumechanged, i, i2, setdrmsessionforcleartypes, cls, cls2, setsamplerate, r8lambda_r106e6zya8q8i_ekunqwrolpk, map, z, z2, this.MediaDescriptionCompat);
        this.MediaBrowserCompatMediaItem = setrotationdegrees;
        this.onPlayFromSearch = onvolumechanged;
        this.onFastForward = setsamplerate;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setlivemaxoffsetms;
        this.onRemoveQueueItem = i;
        this.RatingCompat = i2;
        this.MediaMetadataCompat = setdrmsessionforcleartypes;
        this.onCommand = z3;
        this.onPause = r8lambda_r106e6zya8q8i_ekunqwrolpk;
        this.read = readVar;
        this.onMediaButtonEvent = i3;
        this.onPrepareFromSearch = AudioAttributesImplApi21Parcelizer.INITIALIZE;
        this.onCustomAction = obj;
        return this;
    }

    final boolean write() {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerIconCompatParcelizer = IconCompatParcelizer(AudioAttributesImplApi26Parcelizer.INITIALIZE);
        return audioAttributesImplApi26ParcelizerIconCompatParcelizer == AudioAttributesImplApi26Parcelizer.RESOURCE_CACHE || audioAttributesImplApi26ParcelizerIconCompatParcelizer == AudioAttributesImplApi26Parcelizer.DATA_CACHE;
    }

    final void AudioAttributesCompatParcelizer() {
        if (this.onPlay.write(false)) {
            MediaDescriptionCompat();
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.onPlay.RemoteActionCompatParcelizer()) {
            MediaDescriptionCompat();
        }
    }

    private void MediaBrowserCompatMediaItem() {
        if (this.onPlay.read()) {
            MediaDescriptionCompat();
        }
    }

    private void MediaDescriptionCompat() {
        this.onPlay.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.read();
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.MediaBrowserCompatMediaItem = null;
        this.onPlayFromSearch = null;
        this.onPause = null;
        this.onFastForward = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.read = null;
        this.onPrepare = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplBaseParcelizer = null;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.onPrepareFromMediaId = 0L;
        this.onAddQueueItem = false;
        this.onCustomAction = null;
        this.onPrepareFromUri.clear();
        this.onPlayFromMediaId.RemoteActionCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(setDrmConfiguration<?> setdrmconfiguration) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer() - setdrmconfiguration.AudioAttributesImplBaseParcelizer();
        return iAudioAttributesImplBaseParcelizer == 0 ? this.onMediaButtonEvent - setdrmconfiguration.onMediaButtonEvent : iAudioAttributesImplBaseParcelizer;
    }

    private int AudioAttributesImplBaseParcelizer() {
        return this.onFastForward.ordinal();
    }

    public final void IconCompatParcelizer() {
        this.onAddQueueItem = true;
        setDrmLicenseRequestHeaders setdrmlicenserequestheaders = this.AudioAttributesImplApi21Parcelizer;
        if (setdrmlicenserequestheaders != null) {
            setdrmlicenserequestheaders.IconCompatParcelizer();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        fromUri<?> fromuri = this.AudioAttributesCompatParcelizer;
        try {
            try {
                if (this.onAddQueueItem) {
                    AudioAttributesImplApi21Parcelizer();
                } else {
                    RatingCompat();
                    if (fromuri != null) {
                        fromuri.read();
                    }
                }
            } finally {
                if (fromuri != null) {
                    fromuri.read();
                }
            }
        } catch (setCustomCacheKey e) {
            throw e;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.onPrepare);
            }
            if (this.onPrepare != AudioAttributesImplApi26Parcelizer.ENCODE) {
                this.onPrepareFromUri.add(th);
                AudioAttributesImplApi21Parcelizer();
            }
            if (!this.onAddQueueItem) {
                throw th;
            }
            throw th;
        }
    }

    private void RatingCompat() {
        int i = AnonymousClass5.IconCompatParcelizer[this.onPrepareFromSearch.ordinal()];
        if (i == 1) {
            this.onPrepare = IconCompatParcelizer(AudioAttributesImplApi26Parcelizer.INITIALIZE);
            this.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi26Parcelizer();
            MediaMetadataCompat();
        } else if (i == 2) {
            MediaMetadataCompat();
        } else if (i == 3) {
            MediaBrowserCompatCustomActionResultReceiver();
        } else {
            StringBuilder sb = new StringBuilder("Unrecognized run reason: ");
            sb.append(this.onPrepareFromSearch);
            throw new IllegalStateException(sb.toString());
        }
    }

    private setDrmLicenseRequestHeaders AudioAttributesImplApi26Parcelizer() {
        int i = AnonymousClass5.write[this.onPrepare.ordinal()];
        if (i == 1) {
            return new setMediaId(this.AudioAttributesImplApi26Parcelizer, this);
        }
        if (i == 2) {
            return new setClipStartPositionMs(this.AudioAttributesImplApi26Parcelizer, this);
        }
        if (i == 3) {
            return new setUri(this.AudioAttributesImplApi26Parcelizer, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Unrecognized stage: ");
        sb.append(this.onPrepare);
        throw new IllegalStateException(sb.toString());
    }

    private void MediaMetadataCompat() {
        this.MediaBrowserCompatItemReceiver = Thread.currentThread();
        this.onPrepareFromMediaId = createTimeline.RemoteActionCompatParcelizer();
        boolean zRemoteActionCompatParcelizer = false;
        while (!this.onAddQueueItem && this.AudioAttributesImplApi21Parcelizer != null && !(zRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer())) {
            this.onPrepare = IconCompatParcelizer(this.onPrepare);
            this.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (this.onPrepare == AudioAttributesImplApi26Parcelizer.SOURCE) {
                IconCompatParcelizer(AudioAttributesImplApi21Parcelizer.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.onPrepare == AudioAttributesImplApi26Parcelizer.FINISHED || this.onAddQueueItem) && !zRemoteActionCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatSearchResultReceiver();
        this.read.AudioAttributesCompatParcelizer(new setLiveMaxPlaybackSpeed("Failed to load resource", new ArrayList(this.onPrepareFromUri)));
        MediaBrowserCompatMediaItem();
    }

    private void RemoteActionCompatParcelizer(setMimeType<R> setmimetype, onTracksChanged ontrackschanged, boolean z) {
        MediaBrowserCompatSearchResultReceiver();
        this.read.write(setmimetype, ontrackschanged, z);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        Throwable th;
        this.onPlayFromUri.read();
        if (this.MediaBrowserCompatSearchResultReceiver) {
            if (this.onPrepareFromUri.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.onPrepareFromUri;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    private AudioAttributesImplApi26Parcelizer IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        int i = AnonymousClass5.write[audioAttributesImplApi26Parcelizer.ordinal()];
        if (i == 1) {
            if (this.MediaMetadataCompat.read()) {
                return AudioAttributesImplApi26Parcelizer.DATA_CACHE;
            }
            return IconCompatParcelizer(AudioAttributesImplApi26Parcelizer.DATA_CACHE);
        }
        if (i == 2) {
            return this.onCommand ? AudioAttributesImplApi26Parcelizer.FINISHED : AudioAttributesImplApi26Parcelizer.SOURCE;
        }
        if (i == 3 || i == 4) {
            return AudioAttributesImplApi26Parcelizer.FINISHED;
        }
        if (i == 5) {
            if (this.MediaMetadataCompat.AudioAttributesCompatParcelizer()) {
                return AudioAttributesImplApi26Parcelizer.RESOURCE_CACHE;
            }
            return IconCompatParcelizer(AudioAttributesImplApi26Parcelizer.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(String.valueOf(audioAttributesImplApi26Parcelizer)));
    }

    private void IconCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        this.onPrepareFromSearch = audioAttributesImplApi21Parcelizer;
        this.read.read(this);
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void read() {
        IconCompatParcelizer(AudioAttributesImplApi21Parcelizer.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void read(onVolumeChanged onvolumechanged, Object obj, fromUri<?> fromuri, onTracksChanged ontrackschanged, onVolumeChanged onvolumechanged2) {
        this.AudioAttributesImplBaseParcelizer = onvolumechanged;
        this.write = obj;
        this.AudioAttributesCompatParcelizer = fromuri;
        this.RemoteActionCompatParcelizer = ontrackschanged;
        this.IconCompatParcelizer = onvolumechanged2;
        this.handleMediaPlayPauseIfPendingOnHandler = onvolumechanged != this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().get(0);
        if (Thread.currentThread() != this.MediaBrowserCompatItemReceiver) {
            IconCompatParcelizer(AudioAttributesImplApi21Parcelizer.DECODE_DATA);
        } else {
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, Exception exc, fromUri<?> fromuri, onTracksChanged ontrackschanged) {
        fromuri.read();
        setLiveMaxPlaybackSpeed setlivemaxplaybackspeed = new setLiveMaxPlaybackSpeed("Fetching data failed", exc);
        setlivemaxplaybackspeed.AudioAttributesCompatParcelizer(onvolumechanged, ontrackschanged, fromuri.write());
        this.onPrepareFromUri.add(setlivemaxplaybackspeed);
        if (Thread.currentThread() != this.MediaBrowserCompatItemReceiver) {
            IconCompatParcelizer(AudioAttributesImplApi21Parcelizer.SWITCH_TO_SOURCE_SERVICE);
        } else {
            MediaMetadataCompat();
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        setMimeType<R> setmimetype;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.onPrepareFromMediaId;
            StringBuilder sb = new StringBuilder("data: ");
            sb.append(this.write);
            sb.append(", cache key: ");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", fetcher: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer("Retrieved data", j, sb.toString());
        }
        try {
            setmimetype = read(this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer);
        } catch (setLiveMaxPlaybackSpeed e) {
            e.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            this.onPrepareFromUri.add(e);
            setmimetype = null;
        }
        if (setmimetype != null) {
            write(setmimetype, this.RemoteActionCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler);
        } else {
            MediaMetadataCompat();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void write(setMimeType<R> setmimetype, onTracksChanged ontrackschanged, boolean z) {
        setMediaMetadata setmediametadata;
        if (setmimetype instanceof setLiveTargetOffsetMs) {
            ((setLiveTargetOffsetMs) setmimetype).IconCompatParcelizer();
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer()) {
            setmimetype = setMediaMetadata.write(setmimetype);
            setmediametadata = setmimetype;
        } else {
            setmediametadata = 0;
        }
        RemoteActionCompatParcelizer(setmimetype, ontrackschanged, z);
        this.onPrepare = AudioAttributesImplApi26Parcelizer.ENCODE;
        try {
            if (this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer()) {
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaDescriptionCompat, this.onPause);
            }
            MediaBrowserCompatItemReceiver();
        } finally {
            if (setmediametadata != 0) {
                setmediametadata.AudioAttributesCompatParcelizer();
            }
        }
    }

    private <Data> setMimeType<R> read(fromUri<?> fromuri, Data data, onTracksChanged ontrackschanged) throws setLiveMaxPlaybackSpeed {
        if (data != null) {
            try {
                long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
                setMimeType<R> setmimetypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(data, ontrackschanged);
                if (Log.isLoggable("DecodeJob", 2)) {
                    StringBuilder sb = new StringBuilder("Decoded result ");
                    sb.append(setmimetypeRemoteActionCompatParcelizer);
                    AudioAttributesCompatParcelizer(sb.toString(), jRemoteActionCompatParcelizer);
                }
                return setmimetypeRemoteActionCompatParcelizer;
            } finally {
                fromuri.read();
            }
        }
        fromuri.read();
        return null;
    }

    private <Data> setMimeType<R> RemoteActionCompatParcelizer(Data data, onTracksChanged ontrackschanged) throws setLiveMaxPlaybackSpeed {
        return RemoteActionCompatParcelizer(data, ontrackschanged, this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer((Class) data.getClass()));
    }

    private r8lambda_r106e6zya8q8i_eKUnQWRolPk IconCompatParcelizer(onTracksChanged ontrackschanged) {
        r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk = this.onPause;
        boolean z = ontrackschanged == onTracksChanged.RESOURCE_DISK_CACHE || this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem();
        Boolean bool = (Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setAlbumTitle.write);
        if (bool != null && (!bool.booleanValue() || z)) {
            return r8lambda_r106e6zya8q8i_ekunqwrolpk;
        }
        r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk2 = new r8lambda_r106e6zya8q8i_eKUnQWRolPk();
        r8lambda_r106e6zya8q8i_ekunqwrolpk2.write(this.onPause);
        r8lambda_r106e6zya8q8i_ekunqwrolpk2.RemoteActionCompatParcelizer(setAlbumTitle.write, Boolean.valueOf(z));
        return r8lambda_r106e6zya8q8i_ekunqwrolpk2;
    }

    private <Data, ResourceType> setMimeType<R> RemoteActionCompatParcelizer(Data data, onTracksChanged ontrackschanged, setRequestMetadata<Data, ResourceType, R> setrequestmetadata) throws setLiveMaxPlaybackSpeed {
        r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpkIconCompatParcelizer = IconCompatParcelizer(ontrackschanged);
        r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<Data> r8lambdas__qvsutfc117zapgt_kkjakcryWrite = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer().write(data);
        try {
            return setrequestmetadata.IconCompatParcelizer(r8lambdas__qvsutfc117zapgt_kkjakcryWrite, r8lambda_r106e6zya8q8i_ekunqwrolpkIconCompatParcelizer, this.onRemoveQueueItem, this.RatingCompat, new write(ontrackschanged));
        } finally {
            r8lambdas__qvsutfc117zapgt_kkjakcryWrite.read();
        }
    }

    private void AudioAttributesCompatParcelizer(String str, long j) {
        RemoteActionCompatParcelizer(str, j, (String) null);
    }

    private void RemoteActionCompatParcelizer(String str, long j, String str2) {
        createTimeline.AudioAttributesCompatParcelizer(j);
        Objects.toString(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (str2 != null) {
            ", ".concat(String.valueOf(str2));
        }
        Thread.currentThread().getName();
    }

    @Override // o.isPrepared.read
    public final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList I_() {
        return this.onPlayFromUri;
    }

    final <Z> setMimeType<Z> write(onTracksChanged ontrackschanged, setMimeType<Z> setmimetype) {
        setMimeType<Z> setmimetypeWrite;
        MediaItem<Z> mediaItem;
        onTimelineChanged ontimelinechangedRemoteActionCompatParcelizer;
        onVolumeChanged setdrmkeysetid;
        Class<?> cls = setmimetype.RemoteActionCompatParcelizer().getClass();
        LoadControl<Z> loadControlWrite = null;
        if (ontrackschanged != onTracksChanged.RESOURCE_DISK_CACHE) {
            MediaItem<Z> mediaItem2 = this.AudioAttributesImplApi26Parcelizer.read(cls);
            mediaItem = mediaItem2;
            setmimetypeWrite = mediaItem2.write(this.MediaBrowserCompatMediaItem, setmimetype, this.onRemoveQueueItem, this.RatingCompat);
        } else {
            setmimetypeWrite = setmimetype;
            mediaItem = null;
        }
        if (!setmimetype.equals(setmimetypeWrite)) {
            setmimetype.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer((setMimeType<?>) setmimetypeWrite)) {
            loadControlWrite = this.AudioAttributesImplApi26Parcelizer.write((setMimeType) setmimetypeWrite);
            ontimelinechangedRemoteActionCompatParcelizer = loadControlWrite.RemoteActionCompatParcelizer(this.onPause);
        } else {
            ontimelinechangedRemoteActionCompatParcelizer = onTimelineChanged.NONE;
        }
        LoadControl loadControl = loadControlWrite;
        if (!this.MediaMetadataCompat.RemoteActionCompatParcelizer(!this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer), ontrackschanged, ontimelinechangedRemoteActionCompatParcelizer)) {
            return setmimetypeWrite;
        }
        if (loadControl == null) {
            throw new setSelectionFlags.write(setmimetypeWrite.RemoteActionCompatParcelizer().getClass());
        }
        int i = AnonymousClass5.RemoteActionCompatParcelizer[ontimelinechangedRemoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            setdrmkeysetid = new setDrmKeySetId(this.AudioAttributesImplBaseParcelizer, this.onPlayFromSearch);
        } else if (i == 2) {
            setdrmkeysetid = new MediaItemClippingConfigurationExternalSyntheticLambda0(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), this.AudioAttributesImplBaseParcelizer, this.onPlayFromSearch, this.onRemoveQueueItem, this.RatingCompat, mediaItem, cls, this.onPause);
        } else {
            throw new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(ontimelinechangedRemoteActionCompatParcelizer)));
        }
        setMediaMetadata setmediametadataWrite = setMediaMetadata.write(setmimetypeWrite);
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(setdrmkeysetid, loadControl, setmediametadataWrite);
        return setmediametadataWrite;
    }

    /* JADX INFO: renamed from: o.setDrmConfiguration$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[onTimelineChanged.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[onTimelineChanged.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[onTimelineChanged.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AudioAttributesImplApi26Parcelizer.values().length];
            write = iArr2;
            try {
                iArr2[AudioAttributesImplApi26Parcelizer.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[AudioAttributesImplApi26Parcelizer.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[AudioAttributesImplApi26Parcelizer.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[AudioAttributesImplApi26Parcelizer.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[AudioAttributesImplApi26Parcelizer.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[AudioAttributesImplApi21Parcelizer.values().length];
            IconCompatParcelizer = iArr3;
            try {
                iArr3[AudioAttributesImplApi21Parcelizer.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IconCompatParcelizer[AudioAttributesImplApi21Parcelizer.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IconCompatParcelizer[AudioAttributesImplApi21Parcelizer.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    final class write<Z> implements setDrmMultiSession.RemoteActionCompatParcelizer<Z> {
        private final onTracksChanged IconCompatParcelizer;

        write(onTracksChanged ontrackschanged) {
            this.IconCompatParcelizer = ontrackschanged;
        }

        @Override // o.setDrmMultiSession.RemoteActionCompatParcelizer
        public final setMimeType<Z> IconCompatParcelizer(setMimeType<Z> setmimetype) {
            return setDrmConfiguration.this.write(this.IconCompatParcelizer, setmimetype);
        }
    }

    static class IconCompatParcelizer {
        private boolean RemoteActionCompatParcelizer;
        private boolean read;
        private boolean write;

        IconCompatParcelizer() {
        }

        final boolean write(boolean z) {
            boolean zIconCompatParcelizer;
            synchronized (this) {
                this.write = true;
                zIconCompatParcelizer = IconCompatParcelizer(false);
            }
            return zIconCompatParcelizer;
        }

        final boolean RemoteActionCompatParcelizer() {
            boolean zIconCompatParcelizer;
            synchronized (this) {
                this.read = true;
                zIconCompatParcelizer = IconCompatParcelizer(false);
            }
            return zIconCompatParcelizer;
        }

        final boolean read() {
            boolean zIconCompatParcelizer;
            synchronized (this) {
                this.RemoteActionCompatParcelizer = true;
                zIconCompatParcelizer = IconCompatParcelizer(false);
            }
            return zIconCompatParcelizer;
        }

        final void IconCompatParcelizer() {
            synchronized (this) {
                this.read = false;
                this.write = false;
                this.RemoteActionCompatParcelizer = false;
            }
        }

        private boolean IconCompatParcelizer(boolean z) {
            return (this.RemoteActionCompatParcelizer || z || this.read) && this.write;
        }
    }

    static class RemoteActionCompatParcelizer<Z> {
        private onVolumeChanged IconCompatParcelizer;
        private setMediaMetadata<Z> RemoteActionCompatParcelizer;
        private LoadControl<Z> read;

        RemoteActionCompatParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        final <X> void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, LoadControl<X> loadControl, setMediaMetadata<X> setmediametadata) {
            this.IconCompatParcelizer = onvolumechanged;
            this.read = loadControl;
            this.RemoteActionCompatParcelizer = setmediametadata;
        }

        final void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
            try {
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().write(this.IconCompatParcelizer, new setDrmLicenseUri(this.read, this.RemoteActionCompatParcelizer, r8lambda_r106e6zya8q8i_ekunqwrolpk));
            } finally {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }

        final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer != null;
        }

        final void read() {
            this.IconCompatParcelizer = null;
            this.read = null;
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
