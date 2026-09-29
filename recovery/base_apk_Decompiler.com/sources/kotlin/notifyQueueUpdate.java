package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Map;
import kotlin.notifyQueueUpdate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class notifyQueueUpdate<T extends notifyQueueUpdate<T>> implements Cloneable {
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaMetadataCompat;
    private Drawable RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private Drawable onCommand;
    private boolean onFastForward;
    private Resources.Theme onPlayFromMediaId;
    private boolean onPrepareFromSearch;
    private int read;
    private Drawable write;
    private float onPause = 1.0f;
    private setDrmSessionForClearTypes AudioAttributesCompatParcelizer = setDrmSessionForClearTypes.read;
    private setSampleRate onCustomAction = setSampleRate.NORMAL;
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private int MediaBrowserCompatMediaItem = -1;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
    private onVolumeChanged onPlay = disableChildSource.RemoteActionCompatParcelizer();
    private boolean MediaDescriptionCompat = true;
    private r8lambda_r106e6zya8q8i_eKUnQWRolPk RatingCompat = new r8lambda_r106e6zya8q8i_eKUnQWRolPk();
    private Map<Class<?>, MediaItem<?>> onMediaButtonEvent = new getMediaPeriodIdForChildMediaPeriodId();
    private Class<?> onAddQueueItem = Object.class;
    private boolean MediaBrowserCompatItemReceiver = true;

    private T AudioAttributesCompatParcelizer() {
        return this;
    }

    private static boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return (i & i2) != 0;
    }

    public T AudioAttributesCompatParcelizer(boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().AudioAttributesCompatParcelizer(z);
        }
        this.onFastForward = z;
        this.MediaBrowserCompatCustomActionResultReceiver |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        return (T) onSetRepeatMode();
    }

    public T IconCompatParcelizer(setDrmSessionForClearTypes setdrmsessionforcleartypes) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().IconCompatParcelizer(setdrmsessionforcleartypes);
        }
        this.AudioAttributesCompatParcelizer = (setDrmSessionForClearTypes) moveMediaSource.AudioAttributesCompatParcelizer(setdrmsessionforcleartypes);
        this.MediaBrowserCompatCustomActionResultReceiver |= 4;
        return (T) onSetRepeatMode();
    }

    public T read(setSampleRate setsamplerate) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().read(setsamplerate);
        }
        this.onCustomAction = (setSampleRate) moveMediaSource.AudioAttributesCompatParcelizer(setsamplerate);
        this.MediaBrowserCompatCustomActionResultReceiver |= 8;
        return (T) onSetRepeatMode();
    }

    public T IconCompatParcelizer(Drawable drawable) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().IconCompatParcelizer(drawable);
        }
        this.onCommand = drawable;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = (i | 64) & (-129);
        return (T) onSetRepeatMode();
    }

    public T RemoteActionCompatParcelizer(int i) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().RemoteActionCompatParcelizer(i);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        this.onCommand = null;
        this.MediaBrowserCompatCustomActionResultReceiver = (i2 | 128) & (-65);
        return (T) onSetRepeatMode();
    }

    public T AudioAttributesCompatParcelizer(Drawable drawable) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().AudioAttributesCompatParcelizer(drawable);
        }
        this.RemoteActionCompatParcelizer = drawable;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        this.read = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = (i | 8192) & (-16385);
        return (T) onSetRepeatMode();
    }

    public T read(Drawable drawable) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().read(drawable);
        }
        this.write = drawable;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = (i | 16) & (-33);
        return (T) onSetRepeatMode();
    }

    public T AudioAttributesCompatParcelizer(int i) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().AudioAttributesCompatParcelizer(i);
        }
        this.IconCompatParcelizer = i;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        this.write = null;
        this.MediaBrowserCompatCustomActionResultReceiver = (i2 | 32) & (-17);
        return (T) onSetRepeatMode();
    }

    public T write(Resources.Theme theme) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().write(theme);
        }
        this.onPlayFromMediaId = theme;
        if (theme != null) {
            this.MediaBrowserCompatCustomActionResultReceiver |= 32768;
            return (T) RemoteActionCompatParcelizer((isRated<Resources.Theme>) setTotalDiscCount.IconCompatParcelizer, theme);
        }
        this.MediaBrowserCompatCustomActionResultReceiver &= -32769;
        return (T) write(setTotalDiscCount.IconCompatParcelizer);
    }

    public T read(boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().read(true);
        }
        this.AudioAttributesImplApi21Parcelizer = !z;
        this.MediaBrowserCompatCustomActionResultReceiver |= 256;
        return (T) onSetRepeatMode();
    }

    public T read(int i, int i2) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().read(i, i2);
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaBrowserCompatCustomActionResultReceiver |= 512;
        return (T) onSetRepeatMode();
    }

    public T write(int i) {
        return (T) read(i, i);
    }

    public T IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().IconCompatParcelizer(onvolumechanged);
        }
        this.onPlay = (onVolumeChanged) moveMediaSource.AudioAttributesCompatParcelizer(onvolumechanged);
        this.MediaBrowserCompatCustomActionResultReceiver |= 1024;
        return (T) onSetRepeatMode();
    }

    @Override // 
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public T read() {
        try {
            T t = (T) super.clone();
            r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk = new r8lambda_r106e6zya8q8i_eKUnQWRolPk();
            t.RatingCompat = r8lambda_r106e6zya8q8i_ekunqwrolpk;
            r8lambda_r106e6zya8q8i_ekunqwrolpk.write(this.RatingCompat);
            getMediaPeriodIdForChildMediaPeriodId getmediaperiodidforchildmediaperiodid = new getMediaPeriodIdForChildMediaPeriodId();
            t.onMediaButtonEvent = getmediaperiodidforchildmediaperiodid;
            getmediaperiodidforchildmediaperiodid.putAll(this.onMediaButtonEvent);
            t.AudioAttributesImplBaseParcelizer = false;
            t.AudioAttributesImplApi26Parcelizer = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public <Y> T RemoteActionCompatParcelizer(isRated<Y> israted, Y y) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().RemoteActionCompatParcelizer(israted, y);
        }
        moveMediaSource.AudioAttributesCompatParcelizer(israted);
        moveMediaSource.AudioAttributesCompatParcelizer(y);
        this.RatingCompat.RemoteActionCompatParcelizer(israted, y);
        return (T) onSetRepeatMode();
    }

    private T write(isRated<?> israted) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().write(israted);
        }
        this.RatingCompat.AudioAttributesCompatParcelizer(israted);
        return (T) onSetRepeatMode();
    }

    public T write(Class<?> cls) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().write(cls);
        }
        this.onAddQueueItem = (Class) moveMediaSource.AudioAttributesCompatParcelizer(cls);
        this.MediaBrowserCompatCustomActionResultReceiver |= 4096;
        return (T) onSetRepeatMode();
    }

    public final boolean onSeekTo() {
        return this.MediaDescriptionCompat;
    }

    public final boolean onRemoveQueueItem() {
        return read(2048);
    }

    public T write(populateFromMetadata populatefrommetadata) {
        return (T) RemoteActionCompatParcelizer((isRated<Object>) populateFromMetadata.MediaBrowserCompatItemReceiver, moveMediaSource.AudioAttributesCompatParcelizer(populatefrommetadata));
    }

    public T onSetShuffleMode() {
        return (T) RemoteActionCompatParcelizer(populateFromMetadata.AudioAttributesCompatParcelizer, new maybeSetArtworkData());
    }

    public T AudioAttributesImplBaseParcelizer() {
        return (T) IconCompatParcelizer(populateFromMetadata.AudioAttributesCompatParcelizer, new maybeSetArtworkData());
    }

    public T onSetCaptioningEnabled() {
        return (T) read(populateFromMetadata.write, new setComposer());
    }

    public T AudioAttributesImplApi21Parcelizer() {
        return (T) AudioAttributesCompatParcelizer(populateFromMetadata.write, new setComposer());
    }

    public T onSetRating() {
        return (T) read(populateFromMetadata.IconCompatParcelizer, new populate());
    }

    private T RemoteActionCompatParcelizer(populateFromMetadata populatefrommetadata, MediaItem<Bitmap> mediaItem) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().RemoteActionCompatParcelizer(populatefrommetadata, mediaItem);
        }
        write(populatefrommetadata);
        return (T) read(mediaItem, false);
    }

    private T IconCompatParcelizer(populateFromMetadata populatefrommetadata, MediaItem<Bitmap> mediaItem) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().IconCompatParcelizer(populatefrommetadata, mediaItem);
        }
        write(populatefrommetadata);
        return (T) read(mediaItem);
    }

    private T AudioAttributesCompatParcelizer(populateFromMetadata populatefrommetadata, MediaItem<Bitmap> mediaItem) {
        return (T) IconCompatParcelizer(populatefrommetadata, mediaItem, true);
    }

    private T read(populateFromMetadata populatefrommetadata, MediaItem<Bitmap> mediaItem) {
        return (T) IconCompatParcelizer(populatefrommetadata, mediaItem, false);
    }

    private T IconCompatParcelizer(populateFromMetadata populatefrommetadata, MediaItem<Bitmap> mediaItem, boolean z) {
        T t;
        if (z) {
            t = (T) IconCompatParcelizer(populatefrommetadata, mediaItem);
        } else {
            t = (T) RemoteActionCompatParcelizer(populatefrommetadata, mediaItem);
        }
        t.MediaBrowserCompatItemReceiver = true;
        return t;
    }

    public T read(MediaItem<Bitmap> mediaItem) {
        return (T) read(mediaItem, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T read(MediaItem<Bitmap> mediaItem, boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().read(mediaItem, z);
        }
        setArtworkData setartworkdata = new setArtworkData(mediaItem, z);
        write(Bitmap.class, mediaItem, z);
        write(Drawable.class, setartworkdata, z);
        write(BitmapDrawable.class, setartworkdata.read(), z);
        write(setYear.class, new disableTrackSelectionsInResult(mediaItem), z);
        return (T) onSetRepeatMode();
    }

    private <Y> T write(Class<Y> cls, MediaItem<Y> mediaItem, boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().write(cls, mediaItem, z);
        }
        moveMediaSource.AudioAttributesCompatParcelizer(cls);
        moveMediaSource.AudioAttributesCompatParcelizer(mediaItem);
        this.onMediaButtonEvent.put(cls, mediaItem);
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaDescriptionCompat = true;
        this.MediaBrowserCompatCustomActionResultReceiver = 67584 | i;
        this.MediaBrowserCompatItemReceiver = false;
        if (z) {
            this.MediaBrowserCompatCustomActionResultReceiver = i | 198656;
            this.MediaBrowserCompatSearchResultReceiver = true;
        }
        return (T) onSetRepeatMode();
    }

    public T MediaBrowserCompatItemReceiver() {
        return (T) RemoteActionCompatParcelizer((isRated<Boolean>) disassociateNoSampleRenderersWithEmptySampleStream.IconCompatParcelizer, Boolean.TRUE);
    }

    public T IconCompatParcelizer(notifyQueueUpdate<?> notifyqueueupdate) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return (T) read().IconCompatParcelizer(notifyqueueupdate);
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 2)) {
            this.onPause = notifyqueueupdate.onPause;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 262144)) {
            this.onPrepareFromSearch = notifyqueueupdate.onPrepareFromSearch;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.onFastForward = notifyqueueupdate.onFastForward;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 4)) {
            this.AudioAttributesCompatParcelizer = notifyqueueupdate.AudioAttributesCompatParcelizer;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 8)) {
            this.onCustomAction = notifyqueueupdate.onCustomAction;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 16)) {
            this.write = notifyqueueupdate.write;
            this.IconCompatParcelizer = 0;
            this.MediaBrowserCompatCustomActionResultReceiver &= -33;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 32)) {
            this.IconCompatParcelizer = notifyqueueupdate.IconCompatParcelizer;
            this.write = null;
            this.MediaBrowserCompatCustomActionResultReceiver &= -17;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 64)) {
            this.onCommand = notifyqueueupdate.onCommand;
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            this.MediaBrowserCompatCustomActionResultReceiver &= -129;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 128)) {
            this.handleMediaPlayPauseIfPendingOnHandler = notifyqueueupdate.handleMediaPlayPauseIfPendingOnHandler;
            this.onCommand = null;
            this.MediaBrowserCompatCustomActionResultReceiver &= -65;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 256)) {
            this.AudioAttributesImplApi21Parcelizer = notifyqueueupdate.AudioAttributesImplApi21Parcelizer;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 512)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = notifyqueueupdate.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.MediaBrowserCompatMediaItem = notifyqueueupdate.MediaBrowserCompatMediaItem;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 1024)) {
            this.onPlay = notifyqueueupdate.onPlay;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 4096)) {
            this.onAddQueueItem = notifyqueueupdate.onAddQueueItem;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 8192)) {
            this.RemoteActionCompatParcelizer = notifyqueueupdate.RemoteActionCompatParcelizer;
            this.read = 0;
            this.MediaBrowserCompatCustomActionResultReceiver &= -16385;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 16384)) {
            this.read = notifyqueueupdate.read;
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatCustomActionResultReceiver &= -8193;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 32768)) {
            this.onPlayFromMediaId = notifyqueueupdate.onPlayFromMediaId;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
            this.MediaDescriptionCompat = notifyqueueupdate.MediaDescriptionCompat;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 131072)) {
            this.MediaBrowserCompatSearchResultReceiver = notifyqueueupdate.MediaBrowserCompatSearchResultReceiver;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 2048)) {
            this.onMediaButtonEvent.putAll(notifyqueueupdate.onMediaButtonEvent);
            this.MediaBrowserCompatItemReceiver = notifyqueueupdate.MediaBrowserCompatItemReceiver;
        }
        if (AudioAttributesCompatParcelizer(notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver, 524288)) {
            this.MediaMetadataCompat = notifyqueueupdate.MediaMetadataCompat;
        }
        if (!this.MediaDescriptionCompat) {
            this.onMediaButtonEvent.clear();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = false;
            this.MediaBrowserCompatCustomActionResultReceiver = i & (-133121);
            this.MediaBrowserCompatItemReceiver = true;
        }
        this.MediaBrowserCompatCustomActionResultReceiver |= notifyqueueupdate.MediaBrowserCompatCustomActionResultReceiver;
        this.RatingCompat.write(notifyqueueupdate.RatingCompat);
        return (T) onSetRepeatMode();
    }

    public final boolean write(notifyQueueUpdate<?> notifyqueueupdate) {
        return Float.compare(notifyqueueupdate.onPause, this.onPause) == 0 && this.IconCompatParcelizer == notifyqueueupdate.IconCompatParcelizer && moveMediaSourceRange.IconCompatParcelizer(this.write, notifyqueueupdate.write) && this.handleMediaPlayPauseIfPendingOnHandler == notifyqueueupdate.handleMediaPlayPauseIfPendingOnHandler && moveMediaSourceRange.IconCompatParcelizer(this.onCommand, notifyqueueupdate.onCommand) && this.read == notifyqueueupdate.read && moveMediaSourceRange.IconCompatParcelizer(this.RemoteActionCompatParcelizer, notifyqueueupdate.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == notifyqueueupdate.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatMediaItem == notifyqueueupdate.MediaBrowserCompatMediaItem && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == notifyqueueupdate.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.MediaBrowserCompatSearchResultReceiver == notifyqueueupdate.MediaBrowserCompatSearchResultReceiver && this.MediaDescriptionCompat == notifyqueueupdate.MediaDescriptionCompat && this.onPrepareFromSearch == notifyqueueupdate.onPrepareFromSearch && this.MediaMetadataCompat == notifyqueueupdate.MediaMetadataCompat && this.AudioAttributesCompatParcelizer.equals(notifyqueueupdate.AudioAttributesCompatParcelizer) && this.onCustomAction == notifyqueueupdate.onCustomAction && this.RatingCompat.equals(notifyqueueupdate.RatingCompat) && this.onMediaButtonEvent.equals(notifyqueueupdate.onMediaButtonEvent) && this.onAddQueueItem.equals(notifyqueueupdate.onAddQueueItem) && moveMediaSourceRange.IconCompatParcelizer(this.onPlay, notifyqueueupdate.onPlay) && moveMediaSourceRange.IconCompatParcelizer(this.onPlayFromMediaId, notifyqueueupdate.onPlayFromMediaId);
    }

    public boolean equals(Object obj) {
        if (obj instanceof notifyQueueUpdate) {
            return write((notifyQueueUpdate<?>) obj);
        }
        return false;
    }

    public int hashCode() {
        return moveMediaSourceRange.write(this.onPlayFromMediaId, moveMediaSourceRange.write(this.onPlay, moveMediaSourceRange.write(this.onAddQueueItem, moveMediaSourceRange.write(this.onMediaButtonEvent, moveMediaSourceRange.write(this.RatingCompat, moveMediaSourceRange.write(this.onCustomAction, moveMediaSourceRange.write(this.AudioAttributesCompatParcelizer, moveMediaSourceRange.write(this.MediaMetadataCompat, moveMediaSourceRange.write(this.onPrepareFromSearch, moveMediaSourceRange.write(this.MediaDescriptionCompat, moveMediaSourceRange.write(this.MediaBrowserCompatSearchResultReceiver, moveMediaSourceRange.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, moveMediaSourceRange.read(this.MediaBrowserCompatMediaItem, moveMediaSourceRange.write(this.AudioAttributesImplApi21Parcelizer, moveMediaSourceRange.write(this.RemoteActionCompatParcelizer, moveMediaSourceRange.read(this.read, moveMediaSourceRange.write(this.onCommand, moveMediaSourceRange.read(this.handleMediaPlayPauseIfPendingOnHandler, moveMediaSourceRange.write(this.write, moveMediaSourceRange.read(this.IconCompatParcelizer, moveMediaSourceRange.AudioAttributesCompatParcelizer(this.onPause)))))))))))))))))))));
    }

    public T onSetPlaybackSpeed() {
        this.AudioAttributesImplBaseParcelizer = true;
        return (T) AudioAttributesCompatParcelizer();
    }

    public T IconCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer && !this.AudioAttributesImplApi26Parcelizer) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.AudioAttributesImplApi26Parcelizer = true;
        return (T) onSetPlaybackSpeed();
    }

    protected final T onSetRepeatMode() {
        if (this.AudioAttributesImplBaseParcelizer) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) AudioAttributesCompatParcelizer();
    }

    protected final boolean onPlayFromSearch() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Map<Class<?>, MediaItem<?>> onPlay() {
        return this.onMediaButtonEvent;
    }

    public final boolean onRemoveQueueItemAt() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final r8lambda_r106e6zya8q8i_eKUnQWRolPk MediaDescriptionCompat() {
        return this.RatingCompat;
    }

    public final Class<?> onMediaButtonEvent() {
        return this.onAddQueueItem;
    }

    public final setDrmSessionForClearTypes MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Drawable MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final Drawable onCustomAction() {
        return this.onCommand;
    }

    public final int MediaMetadataCompat() {
        return this.read;
    }

    public final Drawable RatingCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Resources.Theme onPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final boolean onPlayFromUri() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final onVolumeChanged onFastForward() {
        return this.onPlay;
    }

    public final boolean onPrepareFromMediaId() {
        return read(8);
    }

    public final setSampleRate onCommand() {
        return this.onCustomAction;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean onRewind() {
        return moveMediaSourceRange.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatMediaItem);
    }

    public final int onAddQueueItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final float onPause() {
        return this.onPause;
    }

    final boolean onPrepareFromUri() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private boolean read(int i) {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, i);
    }

    public final boolean onPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    public final boolean onPrepare() {
        return this.onFastForward;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }
}
