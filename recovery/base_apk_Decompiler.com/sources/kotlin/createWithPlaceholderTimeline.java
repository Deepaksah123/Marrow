package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;

/* JADX INFO: loaded from: classes3.dex */
public final class createWithPlaceholderTimeline<TranscodeType> extends setTileCountVertical<TranscodeType> implements Cloneable {
    @Override // kotlin.setTileCountVertical, kotlin.notifyQueueUpdate
    public final /* synthetic */ notifyQueueUpdate IconCompatParcelizer(notifyQueueUpdate notifyqueueupdate) {
        return AudioAttributesCompatParcelizer((notifyQueueUpdate<?>) notifyqueueupdate);
    }

    @Override // kotlin.setTileCountVertical
    public final /* synthetic */ setTileCountVertical RemoteActionCompatParcelizer(notifyQueueUpdate notifyqueueupdate) {
        return AudioAttributesCompatParcelizer((notifyQueueUpdate<?>) notifyqueueupdate);
    }

    @Override // kotlin.notifyQueueUpdate
    public final /* synthetic */ notifyQueueUpdate read(MediaItem mediaItem) {
        return AudioAttributesCompatParcelizer((MediaItem<Bitmap>) mediaItem);
    }

    @Override // kotlin.notifyQueueUpdate
    public final /* synthetic */ notifyQueueUpdate write(Class cls) {
        return RemoteActionCompatParcelizer((Class<?>) cls);
    }

    createWithPlaceholderTimeline(Glide glide, ForwardingPlayer forwardingPlayer, Class<TranscodeType> cls, Context context) {
        super(glide, forwardingPlayer, cls, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> AudioAttributesCompatParcelizer(boolean z) {
        return (createWithPlaceholderTimeline) super.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer(setDrmSessionForClearTypes setdrmsessionforcleartypes) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(setdrmsessionforcleartypes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> read(setSampleRate setsamplerate) {
        return (createWithPlaceholderTimeline) super.read(setsamplerate);
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer(Drawable drawable) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(drawable);
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> RemoteActionCompatParcelizer(int i) {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer(i);
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> AudioAttributesCompatParcelizer(Drawable drawable) {
        return (createWithPlaceholderTimeline) super.AudioAttributesCompatParcelizer(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> read(Drawable drawable) {
        return (createWithPlaceholderTimeline) super.read(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> AudioAttributesCompatParcelizer(int i) {
        return (createWithPlaceholderTimeline) super.AudioAttributesCompatParcelizer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> write(Resources.Theme theme) {
        return (createWithPlaceholderTimeline) super.write(theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> read(boolean z) {
        return (createWithPlaceholderTimeline) super.read(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> read(int i, int i2) {
        return (createWithPlaceholderTimeline) super.read(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> write(int i) {
        return (createWithPlaceholderTimeline) super.write(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(onvolumechanged);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public <Y> createWithPlaceholderTimeline<TranscodeType> RemoteActionCompatParcelizer(isRated<Y> israted, Y y) {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer(israted, y);
    }

    private createWithPlaceholderTimeline<TranscodeType> RemoteActionCompatParcelizer(Class<?> cls) {
        return (createWithPlaceholderTimeline) super.write(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> write(populateFromMetadata populatefrommetadata) {
        return (createWithPlaceholderTimeline) super.write(populatefrommetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> onSetShuffleMode() {
        return (createWithPlaceholderTimeline) super.onSetShuffleMode();
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: onSkipToPrevious, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> AudioAttributesImplBaseParcelizer() {
        return (createWithPlaceholderTimeline) super.AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> onSetCaptioningEnabled() {
        return (createWithPlaceholderTimeline) super.onSetCaptioningEnabled();
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: onSkipToNext, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> AudioAttributesImplApi21Parcelizer() {
        return (createWithPlaceholderTimeline) super.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> onSetRating() {
        return (createWithPlaceholderTimeline) super.onSetRating();
    }

    private createWithPlaceholderTimeline<TranscodeType> AudioAttributesCompatParcelizer(MediaItem<Bitmap> mediaItem) {
        return (createWithPlaceholderTimeline) super.read(mediaItem);
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: setSessionImpl, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> MediaBrowserCompatItemReceiver() {
        return (createWithPlaceholderTimeline) super.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> onSetPlaybackSpeed() {
        return (createWithPlaceholderTimeline) super.onSetPlaybackSpeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: onSkipToQueueItem, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer() {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer();
    }

    private createWithPlaceholderTimeline<TranscodeType> AudioAttributesCompatParcelizer(notifyQueueUpdate<?> notifyqueueupdate) {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer(notifyqueueupdate);
    }

    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> write(getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo) {
        return (createWithPlaceholderTimeline) super.write(getupdatedmediaperiodinfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> read(getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo) {
        return (createWithPlaceholderTimeline) super.read((getUpdatedMediaPeriodInfo) getupdatedmediaperiodinfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer(Object obj) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(obj);
    }

    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<TranscodeType> RemoteActionCompatParcelizer(String str) {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> write(Uri uri) {
        return (createWithPlaceholderTimeline) super.write(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> IconCompatParcelizer(Integer num) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTileCountVertical
    /* JADX INFO: renamed from: onStop, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<TranscodeType> clone() {
        return (createWithPlaceholderTimeline) super.clone();
    }
}
