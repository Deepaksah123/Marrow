package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MediaPeriodHolder {
    private final List<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final onAvailableCommandsChanged AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final access3900 IconCompatParcelizer;
    private final Handler MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private MediaItem<Bitmap> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private read MediaDescriptionCompat;
    private read MediaMetadataCompat;
    private boolean RatingCompat;
    private read RemoteActionCompatParcelizer;
    private setTileCountVertical<Bitmap> handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCustomAction;
    final ForwardingPlayer read;
    private Bitmap write;

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer();
    }

    interface RemoteActionCompatParcelizer {
    }

    MediaPeriodHolder(Glide glide, onAvailableCommandsChanged onavailablecommandschanged, int i, int i2, MediaItem<Bitmap> mediaItem, Bitmap bitmap) {
        this(glide.read(), Glide.write(glide.AudioAttributesCompatParcelizer()), onavailablecommandschanged, write(Glide.write(glide.AudioAttributesCompatParcelizer()), i, i2), mediaItem, bitmap);
    }

    private MediaPeriodHolder(access3900 access3900Var, ForwardingPlayer forwardingPlayer, onAvailableCommandsChanged onavailablecommandschanged, setTileCountVertical<Bitmap> settilecountvertical, MediaItem<Bitmap> mediaItem, Bitmap bitmap) {
        this.AudioAttributesCompatParcelizer = new ArrayList();
        this.read = forwardingPlayer;
        Handler handler = new Handler(Looper.getMainLooper(), new write());
        this.IconCompatParcelizer = access3900Var;
        this.MediaBrowserCompatCustomActionResultReceiver = handler;
        this.handleMediaPlayPauseIfPendingOnHandler = settilecountvertical;
        this.AudioAttributesImplApi26Parcelizer = onavailablecommandschanged;
        read(mediaItem, bitmap);
    }

    final void read(MediaItem<Bitmap> mediaItem, Bitmap bitmap) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaItem) moveMediaSource.AudioAttributesCompatParcelizer(mediaItem);
        this.write = (Bitmap) moveMediaSource.AudioAttributesCompatParcelizer(bitmap);
        this.handleMediaPlayPauseIfPendingOnHandler = this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(new getPlayingPeriod().read(mediaItem));
        this.AudioAttributesImplApi21Parcelizer = moveMediaSourceRange.RemoteActionCompatParcelizer(bitmap);
        this.onAddQueueItem = bitmap.getWidth();
        this.AudioAttributesImplBaseParcelizer = bitmap.getHeight();
    }

    final Bitmap read() {
        return this.write;
    }

    final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.MediaBrowserCompatItemReceiver) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.AudioAttributesCompatParcelizer.contains(audioAttributesCompatParcelizer)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.AudioAttributesCompatParcelizer.isEmpty();
        this.AudioAttributesCompatParcelizer.add(audioAttributesCompatParcelizer);
        if (zIsEmpty) {
            RatingCompat();
        }
    }

    final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.remove(audioAttributesCompatParcelizer);
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.onAddQueueItem;
    }

    final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.write() + this.AudioAttributesImplApi21Parcelizer;
    }

    final int AudioAttributesCompatParcelizer() {
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            return readVar.read;
        }
        return -1;
    }

    final ByteBuffer RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().asReadOnlyBuffer();
    }

    final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
    }

    private void RatingCompat() {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.MediaBrowserCompatItemReceiver = false;
        MediaMetadataCompat();
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    final void write() {
        this.AudioAttributesCompatParcelizer.clear();
        MediaBrowserCompatMediaItem();
        MediaBrowserCompatSearchResultReceiver();
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            this.read.write(readVar);
            this.RemoteActionCompatParcelizer = null;
        }
        read readVar2 = this.MediaDescriptionCompat;
        if (readVar2 != null) {
            this.read.write(readVar2);
            this.MediaDescriptionCompat = null;
        }
        read readVar3 = this.MediaMetadataCompat;
        if (readVar3 != null) {
            this.read.write(readVar3);
            this.MediaMetadataCompat = null;
        }
        this.AudioAttributesImplApi26Parcelizer.read();
        this.MediaBrowserCompatItemReceiver = true;
    }

    final Bitmap IconCompatParcelizer() {
        read readVar = this.RemoteActionCompatParcelizer;
        return readVar != null ? readVar.RemoteActionCompatParcelizer() : this.write;
    }

    private void MediaMetadataCompat() {
        if (!this.MediaBrowserCompatSearchResultReceiver || this.RatingCompat) {
            return;
        }
        read readVar = this.MediaMetadataCompat;
        if (readVar != null) {
            this.MediaMetadataCompat = null;
            write(readVar);
            return;
        }
        this.RatingCompat = true;
        int iMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = new read(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(), SystemClock.uptimeMillis() + ((long) iMediaBrowserCompatItemReceiver));
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(getPlayingPeriod.write(AudioAttributesImplApi21Parcelizer())).IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).read(this.MediaDescriptionCompat);
    }

    private void MediaBrowserCompatMediaItem() {
        Bitmap bitmap = this.write;
        if (bitmap != null) {
            this.IconCompatParcelizer.write(bitmap);
            this.write = null;
        }
    }

    final void write(read readVar) {
        this.RatingCompat = false;
        if (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver.obtainMessage(2, readVar).sendToTarget();
            return;
        }
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            this.MediaMetadataCompat = readVar;
            return;
        }
        if (readVar.RemoteActionCompatParcelizer() != null) {
            MediaBrowserCompatMediaItem();
            read readVar2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = readVar;
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0; size--) {
                this.AudioAttributesCompatParcelizer.get(size).RemoteActionCompatParcelizer();
            }
            if (readVar2 != null) {
                this.MediaBrowserCompatCustomActionResultReceiver.obtainMessage(2, readVar2).sendToTarget();
            }
        }
        MediaMetadataCompat();
    }

    class write implements Handler.Callback {
        write() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                MediaPeriodHolder.this.write((read) message.obj);
                return true;
            }
            if (message.what != 2) {
                return false;
            }
            MediaPeriodHolder.this.read.write((read) message.obj);
            return false;
        }
    }

    static class read extends updateQueuedPeriods<Bitmap> {
        private final long AudioAttributesCompatParcelizer;
        private Bitmap IconCompatParcelizer;
        final int read;
        private final Handler write;

        read(Handler handler, int i, long j) {
            this.write = handler;
            this.read = i;
            this.AudioAttributesCompatParcelizer = j;
        }

        final Bitmap RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MediaSourceInfoHolder
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(Bitmap bitmap) {
            this.IconCompatParcelizer = bitmap;
            this.write.sendMessageAtTime(this.write.obtainMessage(1, this), this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.MediaSourceInfoHolder
        public final void AudioAttributesCompatParcelizer(Drawable drawable) {
            this.IconCompatParcelizer = null;
        }
    }

    private static setTileCountVertical<Bitmap> write(ForwardingPlayer forwardingPlayer, int i, int i2) {
        return forwardingPlayer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(getPlayingPeriod.AudioAttributesCompatParcelizer(setDrmSessionForClearTypes.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(true).read(true).read(i, i2));
    }

    private static onVolumeChanged AudioAttributesImplApi21Parcelizer() {
        return new getWindowIndexForChildWindowIndex(Double.valueOf(Math.random()));
    }
}
