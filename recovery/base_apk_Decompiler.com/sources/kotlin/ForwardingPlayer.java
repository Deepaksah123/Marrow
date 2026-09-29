package kotlin;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.getStartPositionRendererTime;
import kotlin.moveToLast;

/* JADX INFO: loaded from: classes2.dex */
public class ForwardingPlayer implements ComponentCallbacks2, toRendererTime {
    final setRendererOffset AudioAttributesCompatParcelizer;
    private final CopyOnWriteArrayList<getUpdatedMediaPeriodInfo<Object>> AudioAttributesImplApi21Parcelizer;
    private final getStartPositionRendererTime AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final Runnable MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final copyWithRequestedContentPositionUs MediaBrowserCompatMediaItem;
    private final getFollowingMediaPeriodInfoOfCurrentPeriod MediaBrowserCompatSearchResultReceiver;
    private getPlayingPeriod MediaDescriptionCompat;
    private final MediaPeriodQueue MediaMetadataCompat;
    public final Context read;
    public final Glide write;
    private static final getPlayingPeriod RemoteActionCompatParcelizer = getPlayingPeriod.RemoteActionCompatParcelizer((Class<?>) Bitmap.class).onSetPlaybackSpeed();
    private static final getPlayingPeriod IconCompatParcelizer = getPlayingPeriod.RemoteActionCompatParcelizer((Class<?>) setYear.class).onSetPlaybackSpeed();

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    static {
        getPlayingPeriod.AudioAttributesCompatParcelizer(setDrmSessionForClearTypes.write).read(setSampleRate.LOW).read(true);
    }

    public ForwardingPlayer(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, Context context) {
        this(glide, setrendereroffset, copywithrequestedcontentpositionus, new MediaPeriodQueue(), glide.RemoteActionCompatParcelizer(), context);
    }

    private ForwardingPlayer(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, MediaPeriodQueue mediaPeriodQueue, getRendererOffset getrendereroffset, Context context) {
        this.MediaBrowserCompatSearchResultReceiver = new getFollowingMediaPeriodInfoOfCurrentPeriod();
        Runnable runnable = new Runnable() { // from class: o.ForwardingPlayer.5
            @Override // java.lang.Runnable
            public final void run() {
                ForwardingPlayer.this.AudioAttributesCompatParcelizer.write(ForwardingPlayer.this);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = runnable;
        this.write = glide;
        this.AudioAttributesCompatParcelizer = setrendereroffset;
        this.MediaBrowserCompatMediaItem = copywithrequestedcontentpositionus;
        this.MediaMetadataCompat = mediaPeriodQueue;
        this.read = context;
        getStartPositionRendererTime getstartpositionrenderertime = getrendereroffset.read(context.getApplicationContext(), new AudioAttributesCompatParcelizer(mediaPeriodQueue));
        this.AudioAttributesImplApi26Parcelizer = getstartpositionrenderertime;
        glide.IconCompatParcelizer(this);
        if (moveMediaSourceRange.read()) {
            moveMediaSourceRange.RemoteActionCompatParcelizer(runnable);
        } else {
            setrendereroffset.write(this);
        }
        setrendereroffset.write(getstartpositionrenderertime);
        this.AudioAttributesImplApi21Parcelizer = new CopyOnWriteArrayList<>(glide.IconCompatParcelizer().read());
        Object[] objArr = {glide.IconCompatParcelizer()};
        int iIconCompatParcelizer = moveToLast.AnonymousClass7.IconCompatParcelizer();
        read((getPlayingPeriod) setRotationDegrees.IconCompatParcelizer(moveToLast.AnonymousClass7.IconCompatParcelizer(), objArr, -1029949516, moveToLast.AnonymousClass7.IconCompatParcelizer(), iIconCompatParcelizer, moveToLast.AnonymousClass7.IconCompatParcelizer(), 1029949516));
    }

    public void read(getPlayingPeriod getplayingperiod) {
        synchronized (this) {
            this.MediaDescriptionCompat = getplayingperiod.read().IconCompatParcelizer();
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
    }

    private void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            MediaBrowserCompatMediaItem();
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
        synchronized (this) {
            this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver();
            AudioAttributesImplBaseParcelizer();
        }
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer();
            MediaBrowserCompatCustomActionResultReceiver();
            this.MediaMetadataCompat.write();
            this.AudioAttributesCompatParcelizer.read(this);
            this.AudioAttributesCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer);
            moveMediaSourceRange.write(this.MediaBrowserCompatCustomActionResultReceiver);
            this.write.RemoteActionCompatParcelizer(this);
        }
    }

    public setTileCountVertical<Bitmap> RemoteActionCompatParcelizer() {
        return read(Bitmap.class).RemoteActionCompatParcelizer(RemoteActionCompatParcelizer);
    }

    public setTileCountVertical<setYear> AudioAttributesCompatParcelizer() {
        return read(setYear.class).RemoteActionCompatParcelizer(IconCompatParcelizer);
    }

    public setTileCountVertical<Drawable> read() {
        return read(Drawable.class);
    }

    public setTileCountVertical<Drawable> RemoteActionCompatParcelizer(String str) {
        return read().RemoteActionCompatParcelizer(str);
    }

    public setTileCountVertical<Drawable> IconCompatParcelizer(Integer num) {
        return read().IconCompatParcelizer(num);
    }

    public setTileCountVertical<Drawable> IconCompatParcelizer(Object obj) {
        return read().IconCompatParcelizer(obj);
    }

    public <ResourceType> setTileCountVertical<ResourceType> read(Class<ResourceType> cls) {
        return new setTileCountVertical<>(this.write, this, cls, this.read);
    }

    public final void write(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        if (mediaSourceInfoHolder == null) {
            return;
        }
        read(mediaSourceInfoHolder);
    }

    private void read(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaSourceInfoHolder);
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderAudioAttributesCompatParcelizer = mediaSourceInfoHolder.AudioAttributesCompatParcelizer();
        if (zRemoteActionCompatParcelizer || this.write.AudioAttributesCompatParcelizer(mediaSourceInfoHolder) || enqueuenextmediaperiodholderAudioAttributesCompatParcelizer == null) {
            return;
        }
        mediaSourceInfoHolder.write((enqueueNextMediaPeriodHolder) null);
        enqueuenextmediaperiodholderAudioAttributesCompatParcelizer.read();
    }

    public final boolean RemoteActionCompatParcelizer(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        synchronized (this) {
            enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderAudioAttributesCompatParcelizer = mediaSourceInfoHolder.AudioAttributesCompatParcelizer();
            if (enqueuenextmediaperiodholderAudioAttributesCompatParcelizer == null) {
                return true;
            }
            if (!this.MediaMetadataCompat.RemoteActionCompatParcelizer(enqueuenextmediaperiodholderAudioAttributesCompatParcelizer)) {
                return false;
            }
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(mediaSourceInfoHolder);
            mediaSourceInfoHolder.write((enqueueNextMediaPeriodHolder) null);
            return true;
        }
    }

    final void AudioAttributesCompatParcelizer(MediaSourceInfoHolder<?> mediaSourceInfoHolder, enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this) {
            this.MediaBrowserCompatSearchResultReceiver.write(mediaSourceInfoHolder);
            this.MediaMetadataCompat.read(enqueuenextmediaperiodholder);
        }
    }

    final List<getUpdatedMediaPeriodInfo<Object>> write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final getPlayingPeriod IconCompatParcelizer() {
        getPlayingPeriod getplayingperiod;
        synchronized (this) {
            getplayingperiod = this.MediaDescriptionCompat;
        }
        return getplayingperiod;
    }

    final <T> setTileCountHorizontal<?, T> AudioAttributesCompatParcelizer(Class<T> cls) {
        return this.write.IconCompatParcelizer().write(cls);
    }

    public String toString() {
        String string;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{tracker=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", treeNode=");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append("}");
            string = sb.toString();
        }
        return string;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
            Iterator<MediaSourceInfoHolder<?>> it = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer().iterator();
            while (it.hasNext()) {
                write(it.next());
            }
            this.MediaBrowserCompatSearchResultReceiver.write();
        }
    }

    class AudioAttributesCompatParcelizer implements getStartPositionRendererTime.AudioAttributesCompatParcelizer {
        private final MediaPeriodQueue IconCompatParcelizer;

        AudioAttributesCompatParcelizer(MediaPeriodQueue mediaPeriodQueue) {
            this.IconCompatParcelizer = mediaPeriodQueue;
        }

        @Override // o.getStartPositionRendererTime.AudioAttributesCompatParcelizer
        public final void write(boolean z) {
            if (z) {
                synchronized (ForwardingPlayer.this) {
                    this.IconCompatParcelizer.read();
                }
            }
        }
    }
}
