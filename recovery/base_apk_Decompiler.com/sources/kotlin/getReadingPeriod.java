package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.setDrmSessionForClearPeriods;
import kotlin.setPixelWidthHeightRatio;

/* JADX INFO: loaded from: classes2.dex */
public final class getReadingPeriod<R> implements enqueueNextMediaPeriodHolder, updateRepeatMode, getLoadingPeriod {
    private static final boolean IconCompatParcelizer = Log.isLoggable("GlideRequest", 2);
    private int AudioAttributesCompatParcelizer;
    private Drawable AudioAttributesImplApi21Parcelizer;
    private final setRotationDegrees AudioAttributesImplApi26Parcelizer;
    private Drawable AudioAttributesImplBaseParcelizer;
    private volatile setDrmSessionForClearPeriods MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private setDrmSessionForClearPeriods.AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final updateForPlaybackModeChange MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final Object RatingCompat;
    private final enableMediaSource<? super R> RemoteActionCompatParcelizer;
    private final Object handleMediaPlayPauseIfPendingOnHandler;
    private final setSampleRate onAddQueueItem;
    private final List<getUpdatedMediaPeriodInfo<R>> onCommand;
    private Drawable onCustomAction;
    private final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList onFastForward;
    private long onMediaButtonEvent;
    private RuntimeException onPause;
    private final notifyQueueUpdate<?> onPlay;
    private setMimeType<R> onPlayFromMediaId;
    private final Class<R> onPlayFromSearch;
    private final String onPlayFromUri;
    private final getUpdatedMediaPeriodInfo<R> onPrepare;
    private final MediaSourceInfoHolder<R> onPrepareFromMediaId;
    private IconCompatParcelizer onPrepareFromSearch;
    private int onPrepareFromUri;
    private final Executor read;
    private final Context write;

    enum IconCompatParcelizer {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public static <R> getReadingPeriod<R> AudioAttributesCompatParcelizer(Context context, setRotationDegrees setrotationdegrees, Object obj, Object obj2, Class<R> cls, notifyQueueUpdate<?> notifyqueueupdate, int i, int i2, setSampleRate setsamplerate, MediaSourceInfoHolder<R> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo, List<getUpdatedMediaPeriodInfo<R>> list, updateForPlaybackModeChange updateforplaybackmodechange, setDrmSessionForClearPeriods setdrmsessionforclearperiods, enableMediaSource<? super R> enablemediasource, Executor executor) {
        return new getReadingPeriod<>(context, setrotationdegrees, obj, obj2, cls, notifyqueueupdate, i, i2, setsamplerate, mediaSourceInfoHolder, getupdatedmediaperiodinfo, list, updateforplaybackmodechange, setdrmsessionforclearperiods, enablemediasource, executor);
    }

    private getReadingPeriod(Context context, setRotationDegrees setrotationdegrees, Object obj, Object obj2, Class<R> cls, notifyQueueUpdate<?> notifyqueueupdate, int i, int i2, setSampleRate setsamplerate, MediaSourceInfoHolder<R> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo, List<getUpdatedMediaPeriodInfo<R>> list, updateForPlaybackModeChange updateforplaybackmodechange, setDrmSessionForClearPeriods setdrmsessionforclearperiods, enableMediaSource<? super R> enablemediasource, Executor executor) {
        this.onPlayFromUri = IconCompatParcelizer ? String.valueOf(super.hashCode()) : null;
        this.onFastForward = lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList.write();
        this.handleMediaPlayPauseIfPendingOnHandler = obj;
        this.write = context;
        this.AudioAttributesImplApi26Parcelizer = setrotationdegrees;
        this.RatingCompat = obj2;
        this.onPlayFromSearch = cls;
        this.onPlay = notifyqueueupdate;
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaMetadataCompat = i2;
        this.onAddQueueItem = setsamplerate;
        this.onPrepareFromMediaId = mediaSourceInfoHolder;
        this.onPrepare = getupdatedmediaperiodinfo;
        this.onCommand = list;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = updateforplaybackmodechange;
        this.MediaBrowserCompatCustomActionResultReceiver = setdrmsessionforclearperiods;
        this.RemoteActionCompatParcelizer = enablemediasource;
        this.read = executor;
        this.onPrepareFromSearch = IconCompatParcelizer.PENDING;
        if (this.onPause == null && setrotationdegrees.write().IconCompatParcelizer(setPixelWidthHeightRatio.IconCompatParcelizer.class)) {
            this.onPause = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void IconCompatParcelizer() {
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            AudioAttributesImplApi21Parcelizer();
            this.onFastForward.read();
            this.onMediaButtonEvent = createTimeline.RemoteActionCompatParcelizer();
            if (this.RatingCompat == null) {
                if (moveMediaSourceRange.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.MediaMetadataCompat)) {
                    this.onPrepareFromUri = this.MediaBrowserCompatSearchResultReceiver;
                    this.MediaBrowserCompatItemReceiver = this.MediaMetadataCompat;
                }
                IconCompatParcelizer(new setLiveMaxPlaybackSpeed("Received null model"), MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() == null ? 5 : 3);
                return;
            }
            if (this.onPrepareFromSearch == IconCompatParcelizer.RUNNING) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (this.onPrepareFromSearch == IconCompatParcelizer.COMPLETE) {
                AudioAttributesCompatParcelizer(this.onPlayFromMediaId, onTracksChanged.MEMORY_CACHE, false);
                return;
            }
            MediaDescriptionCompat();
            this.AudioAttributesCompatParcelizer = -1;
            this.onPrepareFromSearch = IconCompatParcelizer.WAITING_FOR_SIZE;
            if (moveMediaSourceRange.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.MediaMetadataCompat)) {
                RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.MediaMetadataCompat);
            } else {
                this.onPrepareFromMediaId.read(this);
            }
            if ((this.onPrepareFromSearch == IconCompatParcelizer.RUNNING || this.onPrepareFromSearch == IconCompatParcelizer.WAITING_FOR_SIZE) && MediaMetadataCompat()) {
                this.onPrepareFromMediaId.write(onCustomAction());
            }
            if (IconCompatParcelizer) {
                createTimeline.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
            }
        }
    }

    private void MediaDescriptionCompat() {
        List<getUpdatedMediaPeriodInfo<R>> list = this.onCommand;
        if (list != null) {
            for (getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo : list) {
                if (getupdatedmediaperiodinfo instanceof advancePlayingPeriod) {
                }
            }
        }
    }

    private void MediaBrowserCompatMediaItem() {
        AudioAttributesImplApi21Parcelizer();
        this.onFastForward.read();
        this.onPrepareFromMediaId.IconCompatParcelizer(this);
        setDrmSessionForClearPeriods.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.read();
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (this.MediaDescriptionCompat) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void read() {
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            AudioAttributesImplApi21Parcelizer();
            this.onFastForward.read();
            if (this.onPrepareFromSearch == IconCompatParcelizer.CLEARED) {
                return;
            }
            MediaBrowserCompatMediaItem();
            setMimeType<R> setmimetype = this.onPlayFromMediaId;
            if (setmimetype != null) {
                this.onPlayFromMediaId = null;
            } else {
                setmimetype = null;
            }
            if (AudioAttributesImplBaseParcelizer()) {
                this.onPrepareFromMediaId.AudioAttributesCompatParcelizer(onCustomAction());
            }
            this.onPrepareFromSearch = IconCompatParcelizer.CLEARED;
            if (setmimetype != null) {
                setDrmSessionForClearPeriods.AudioAttributesCompatParcelizer(setmimetype);
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            if (MediaBrowserCompatItemReceiver()) {
                read();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // kotlin.enqueueNextMediaPeriodHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MediaBrowserCompatItemReceiver() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.handleMediaPlayPauseIfPendingOnHandler
            monitor-enter(r0)
            o.getReadingPeriod$IconCompatParcelizer r1 = r3.onPrepareFromSearch     // Catch: java.lang.Throwable -> L15
            o.getReadingPeriod$IconCompatParcelizer r2 = o.getReadingPeriod.IconCompatParcelizer.RUNNING     // Catch: java.lang.Throwable -> L15
            if (r1 == r2) goto L12
            o.getReadingPeriod$IconCompatParcelizer r3 = r3.onPrepareFromSearch     // Catch: java.lang.Throwable -> L15
            o.getReadingPeriod$IconCompatParcelizer r1 = o.getReadingPeriod.IconCompatParcelizer.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L15
            if (r3 != r1) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadingPeriod.MediaBrowserCompatItemReceiver():boolean");
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        boolean z;
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            z = this.onPrepareFromSearch == IconCompatParcelizer.COMPLETE;
        }
        return z;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            z = this.onPrepareFromSearch == IconCompatParcelizer.CLEARED;
        }
        return z;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean write() {
        boolean z;
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            z = this.onPrepareFromSearch == IconCompatParcelizer.COMPLETE;
        }
        return z;
    }

    private Drawable MediaBrowserCompatSearchResultReceiver() {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            Drawable drawableMediaBrowserCompatMediaItem = this.onPlay.MediaBrowserCompatMediaItem();
            this.AudioAttributesImplBaseParcelizer = drawableMediaBrowserCompatMediaItem;
            if (drawableMediaBrowserCompatMediaItem == null && this.onPlay.AudioAttributesImplApi26Parcelizer() > 0) {
                this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(this.onPlay.AudioAttributesImplApi26Parcelizer());
            }
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    private Drawable onCustomAction() {
        if (this.onCustomAction == null) {
            Drawable drawableOnCustomAction = this.onPlay.onCustomAction();
            this.onCustomAction = drawableOnCustomAction;
            if (drawableOnCustomAction == null && this.onPlay.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() > 0) {
                this.onCustomAction = RemoteActionCompatParcelizer(this.onPlay.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }
        }
        return this.onCustomAction;
    }

    private Drawable MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            Drawable drawableRatingCompat = this.onPlay.RatingCompat();
            this.AudioAttributesImplApi21Parcelizer = drawableRatingCompat;
            if (drawableRatingCompat == null && this.onPlay.MediaMetadataCompat() > 0) {
                this.AudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer(this.onPlay.MediaMetadataCompat());
            }
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private Drawable RemoteActionCompatParcelizer(int i) {
        return setReleaseMonth.read(this.write, i, this.onPlay.onPlayFromMediaId() != null ? this.onPlay.onPlayFromMediaId() : this.write.getTheme());
    }

    private void onPlay() {
        if (MediaMetadataCompat()) {
            Drawable drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RatingCompat == null ? MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : null;
            if (drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaBrowserCompatSearchResultReceiver();
            }
            if (drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = onCustomAction();
            }
            this.onPrepareFromMediaId.RemoteActionCompatParcelizer(drawableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
    }

    @Override // kotlin.updateRepeatMode
    public final void RemoteActionCompatParcelizer(int i, int i2) throws Throwable {
        Object obj;
        this.onFastForward.read();
        Object obj2 = this.handleMediaPlayPauseIfPendingOnHandler;
        synchronized (obj2) {
            try {
                boolean z = IconCompatParcelizer;
                if (z) {
                    createTimeline.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
                }
                if (this.onPrepareFromSearch == IconCompatParcelizer.WAITING_FOR_SIZE) {
                    this.onPrepareFromSearch = IconCompatParcelizer.RUNNING;
                    float fOnPause = this.onPlay.onPause();
                    this.onPrepareFromUri = read(i, fOnPause);
                    this.MediaBrowserCompatItemReceiver = read(i2, fOnPause);
                    if (z) {
                        createTimeline.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
                    }
                    obj = obj2;
                    try {
                        this.MediaBrowserCompatMediaItem = this.MediaBrowserCompatCustomActionResultReceiver.read(this.AudioAttributesImplApi26Parcelizer, this.RatingCompat, this.onPlay.onFastForward(), this.onPrepareFromUri, this.MediaBrowserCompatItemReceiver, this.onPlay.onMediaButtonEvent(), this.onPlayFromSearch, this.onAddQueueItem, this.onPlay.MediaBrowserCompatCustomActionResultReceiver(), this.onPlay.onPlay(), this.onPlay.onRemoveQueueItemAt(), this.onPlay.onPrepareFromUri(), this.onPlay.MediaDescriptionCompat(), this.onPlay.onPlayFromUri(), this.onPlay.onPrepareFromSearch(), this.onPlay.onPrepare(), this.onPlay.MediaBrowserCompatSearchResultReceiver(), this, this.read);
                        if (this.onPrepareFromSearch != IconCompatParcelizer.RUNNING) {
                            this.MediaBrowserCompatMediaItem = null;
                        }
                        if (z) {
                            createTimeline.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
            }
            throw th;
        }
    }

    private static int read(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private boolean RatingCompat() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.IconCompatParcelizer(this);
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.AudioAttributesCompatParcelizer(this);
    }

    private boolean MediaMetadataCompat() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.RemoteActionCompatParcelizer(this);
    }

    private boolean onAddQueueItem() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return updateforplaybackmodechange == null || !updateforplaybackmodechange.AudioAttributesCompatParcelizer().write();
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (updateforplaybackmodechange != null) {
            updateforplaybackmodechange.AudioAttributesImplApi26Parcelizer(this);
        }
    }

    private void onCommand() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (updateforplaybackmodechange != null) {
            updateforplaybackmodechange.write(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getLoadingPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(kotlin.setMimeType<?> r5, kotlin.onTracksChanged r6, boolean r7) throws java.lang.Throwable {
        /*
            r4 = this;
            o.lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList r7 = r4.onFastForward
            r7.read()
            r7 = 0
            java.lang.Object r0 = r4.handleMediaPlayPauseIfPendingOnHandler     // Catch: java.lang.Throwable -> Laf
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Laf
            r4.MediaBrowserCompatMediaItem = r7     // Catch: java.lang.Throwable -> La8
            if (r5 != 0) goto L2c
            o.setLiveMaxPlaybackSpeed r5 = new o.setLiveMaxPlaybackSpeed     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "Expected to receive a Resource<R> with an object of "
            r6.<init>(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Class<R> r1 = r4.onPlayFromSearch     // Catch: java.lang.Throwable -> La8
            r6.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = " inside, but instead got null."
            r6.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La8
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La8
            r4.read(r5)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)
            return
        L2c:
            java.lang.Object r1 = r5.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L54
            java.lang.Class<R> r2 = r4.onPlayFromSearch     // Catch: java.lang.Throwable -> La8
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> La8
            boolean r2 = r2.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L3f
            goto L54
        L3f:
            boolean r2 = r4.RatingCompat()     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L4f
            r4.onPlayFromMediaId = r7     // Catch: java.lang.Throwable -> La6
            o.getReadingPeriod$IconCompatParcelizer r6 = o.getReadingPeriod.IconCompatParcelizer.COMPLETE     // Catch: java.lang.Throwable -> La6
            r4.onPrepareFromSearch = r6     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)
            if (r5 == 0) goto La1
            goto La2
        L4f:
            r4.read(r5, r1, r6)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)
            return
        L54:
            r4.onPlayFromMediaId = r7     // Catch: java.lang.Throwable -> La6
            o.setLiveMaxPlaybackSpeed r6 = new o.setLiveMaxPlaybackSpeed     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "Expected to receive an object of "
            r7.<init>(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.Class<R> r2 = r4.onPlayFromSearch     // Catch: java.lang.Throwable -> La6
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = " but instead got "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L70
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> La6
            goto L72
        L70:
            java.lang.String r2 = ""
        L72:
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "{"
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "} inside Resource{"
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "}."
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L8f
            java.lang.String r1 = ""
            goto L91
        L8f:
            java.lang.String r1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L91:
            r7.append(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La6
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La6
            r4.read(r6)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)
            if (r5 != 0) goto La2
        La1:
            return
        La2:
            kotlin.setDrmSessionForClearPeriods.AudioAttributesCompatParcelizer(r5)
            return
        La6:
            r4 = move-exception
            goto Laa
        La8:
            r4 = move-exception
            r5 = r7
        Laa:
            monitor-exit(r0)
            throw r4     // Catch: java.lang.Throwable -> Lac
        Lac:
            r4 = move-exception
            r7 = r5
            goto Lb0
        Laf:
            r4 = move-exception
        Lb0:
            if (r7 == 0) goto Lb5
            kotlin.setDrmSessionForClearPeriods.AudioAttributesCompatParcelizer(r7)
        Lb5:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadingPeriod.AudioAttributesCompatParcelizer(o.setMimeType, o.onTracksChanged, boolean):void");
    }

    private void read(setMimeType<R> setmimetype, R r, onTracksChanged ontrackschanged) {
        boolean zRemoteActionCompatParcelizer;
        onAddQueueItem();
        this.onPrepareFromSearch = IconCompatParcelizer.COMPLETE;
        this.onPlayFromMediaId = setmimetype;
        if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver() <= 3) {
            r.getClass().getSimpleName();
            Objects.toString(ontrackschanged);
            Objects.toString(this.RatingCompat);
            createTimeline.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
        }
        handleMediaPlayPauseIfPendingOnHandler();
        boolean z = true;
        this.MediaDescriptionCompat = true;
        try {
            List<getUpdatedMediaPeriodInfo<R>> list = this.onCommand;
            if (list != null) {
                zRemoteActionCompatParcelizer = false;
                for (getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo : list) {
                    zRemoteActionCompatParcelizer |= getupdatedmediaperiodinfo.RemoteActionCompatParcelizer(r, this.RatingCompat, ontrackschanged);
                    if (getupdatedmediaperiodinfo instanceof advancePlayingPeriod) {
                        zRemoteActionCompatParcelizer |= ((advancePlayingPeriod) getupdatedmediaperiodinfo).RemoteActionCompatParcelizer();
                    }
                }
            } else {
                zRemoteActionCompatParcelizer = false;
            }
            getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo2 = this.onPrepare;
            if (getupdatedmediaperiodinfo2 == null || !getupdatedmediaperiodinfo2.RemoteActionCompatParcelizer(r, this.RatingCompat, ontrackschanged)) {
                z = false;
            }
            if (!(z | zRemoteActionCompatParcelizer)) {
                this.RemoteActionCompatParcelizer.read();
                this.onPrepareFromMediaId.RemoteActionCompatParcelizer(r);
            }
        } finally {
            this.MediaDescriptionCompat = false;
        }
    }

    @Override // kotlin.getLoadingPeriod
    public final void read(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed) {
        IconCompatParcelizer(setlivemaxplaybackspeed, 5);
    }

    @Override // kotlin.getLoadingPeriod
    public final Object AudioAttributesCompatParcelizer() {
        this.onFastForward.read();
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void IconCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, int i) {
        this.onFastForward.read();
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            int iMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            if (iMediaBrowserCompatCustomActionResultReceiver <= i) {
                Objects.toString(this.RatingCompat);
                if (iMediaBrowserCompatCustomActionResultReceiver <= 4) {
                    setlivemaxplaybackspeed.RemoteActionCompatParcelizer();
                }
            }
            this.MediaBrowserCompatMediaItem = null;
            this.onPrepareFromSearch = IconCompatParcelizer.FAILED;
            onCommand();
            this.MediaDescriptionCompat = true;
            try {
                List<getUpdatedMediaPeriodInfo<R>> list = this.onCommand;
                if (list != null) {
                    for (getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo : list) {
                        MediaSourceInfoHolder<R> mediaSourceInfoHolder = this.onPrepareFromMediaId;
                        onAddQueueItem();
                        getupdatedmediaperiodinfo.RemoteActionCompatParcelizer(setlivemaxplaybackspeed, mediaSourceInfoHolder);
                    }
                }
                getUpdatedMediaPeriodInfo<R> getupdatedmediaperiodinfo2 = this.onPrepare;
                if (getupdatedmediaperiodinfo2 != null) {
                    MediaSourceInfoHolder<R> mediaSourceInfoHolder2 = this.onPrepareFromMediaId;
                    onAddQueueItem();
                    getupdatedmediaperiodinfo2.RemoteActionCompatParcelizer(setlivemaxplaybackspeed, mediaSourceInfoHolder2);
                }
                onPlay();
            } finally {
                this.MediaDescriptionCompat = false;
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean read(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        notifyQueueUpdate<?> notifyqueueupdate;
        setSampleRate setsamplerate;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        notifyQueueUpdate<?> notifyqueueupdate2;
        setSampleRate setsamplerate2;
        int size2;
        if (!(enqueuenextmediaperiodholder instanceof getReadingPeriod)) {
            return false;
        }
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            i = this.MediaBrowserCompatSearchResultReceiver;
            i2 = this.MediaMetadataCompat;
            obj = this.RatingCompat;
            cls = this.onPlayFromSearch;
            notifyqueueupdate = this.onPlay;
            setsamplerate = this.onAddQueueItem;
            List<getUpdatedMediaPeriodInfo<R>> list = this.onCommand;
            size = list != null ? list.size() : 0;
        }
        getReadingPeriod getreadingperiod = (getReadingPeriod) enqueuenextmediaperiodholder;
        synchronized (getreadingperiod.handleMediaPlayPauseIfPendingOnHandler) {
            i3 = getreadingperiod.MediaBrowserCompatSearchResultReceiver;
            i4 = getreadingperiod.MediaMetadataCompat;
            obj2 = getreadingperiod.RatingCompat;
            cls2 = getreadingperiod.onPlayFromSearch;
            notifyqueueupdate2 = getreadingperiod.onPlay;
            setsamplerate2 = getreadingperiod.onAddQueueItem;
            List<getUpdatedMediaPeriodInfo<R>> list2 = getreadingperiod.onCommand;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && moveMediaSourceRange.write(obj, obj2) && cls.equals(cls2) && moveMediaSourceRange.read(notifyqueueupdate, notifyqueueupdate2) && setsamplerate == setsamplerate2 && size == size2;
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.handleMediaPlayPauseIfPendingOnHandler) {
            obj = this.RatingCompat;
            cls = this.onPlayFromSearch;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[model=");
        sb.append(obj);
        sb.append(", transcodeClass=");
        sb.append(cls);
        sb.append("]");
        return sb.toString();
    }
}
