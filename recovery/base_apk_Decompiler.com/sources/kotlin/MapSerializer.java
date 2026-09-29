package kotlin;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import kotlin._ensureOverride;

/* JADX INFO: loaded from: classes2.dex */
final class MapSerializer extends MediaCodec.Callback {
    private final HandlerThread AudioAttributesCompatParcelizer;
    private Handler AudioAttributesImplApi21Parcelizer;
    private IllegalStateException AudioAttributesImplBaseParcelizer;
    private MediaCodec.CryptoException MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private MediaCodec.CodecException MediaBrowserCompatSearchResultReceiver;
    private MediaFormat MediaDescriptionCompat;
    private _ensureOverride.AudioAttributesCompatParcelizer MediaMetadataCompat;
    private long RatingCompat;
    private MediaFormat RemoteActionCompatParcelizer;
    private final Object MediaBrowserCompatItemReceiver = new Object();
    private final setHasNonEmbeddedTabs write = new setHasNonEmbeddedTabs();
    private final setHasNonEmbeddedTabs IconCompatParcelizer = new setHasNonEmbeddedTabs();
    private final ArrayDeque<MediaCodec.BufferInfo> read = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> AudioAttributesImplApi26Parcelizer = new ArrayDeque<>();

    MapSerializer(HandlerThread handlerThread) {
        this.AudioAttributesCompatParcelizer = handlerThread;
    }

    public final void read(MediaCodec mediaCodec) {
        buildTypeSerializer.write(this.AudioAttributesImplApi21Parcelizer == null);
        this.AudioAttributesCompatParcelizer.start();
        Handler handler = new Handler(this.AudioAttributesCompatParcelizer.getLooper());
        mediaCodec.setCallback(this, handler);
        this.AudioAttributesImplApi21Parcelizer = handler;
    }

    public final void IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatMediaItem = true;
            this.AudioAttributesCompatParcelizer.quit();
            AudioAttributesCompatParcelizer();
        }
    }

    public final int read() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            MediaBrowserCompatItemReceiver();
            int iRemoteActionCompatParcelizer = -1;
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                return -1;
            }
            if (!this.write.read()) {
                iRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            }
            return iRemoteActionCompatParcelizer;
        }
    }

    public final int IconCompatParcelizer(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            MediaBrowserCompatItemReceiver();
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                return -1;
            }
            if (this.IconCompatParcelizer.read()) {
                return -1;
            }
            int iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer >= 0) {
                buildTypeSerializer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                MediaCodec.BufferInfo bufferInfoRemove = this.read.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iRemoteActionCompatParcelizer == -2) {
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.remove();
            }
            return iRemoteActionCompatParcelizer;
        }
    }

    public final MediaFormat RemoteActionCompatParcelizer() {
        MediaFormat mediaFormat;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            mediaFormat = this.RemoteActionCompatParcelizer;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void write() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.RatingCompat++;
            ((Handler) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).post(new Runnable() { // from class: o.MapProperty
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.MediaMetadataCompat();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.write.RemoteActionCompatParcelizer(i);
            _ensureOverride.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaMetadataCompat;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            MediaFormat mediaFormat = this.MediaDescriptionCompat;
            if (mediaFormat != null) {
                RemoteActionCompatParcelizer(mediaFormat);
                this.MediaDescriptionCompat = null;
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
            this.read.add(bufferInfo);
            _ensureOverride.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaMetadataCompat;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.read();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatSearchResultReceiver = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            RemoteActionCompatParcelizer(mediaFormat);
            this.MediaDescriptionCompat = null;
        }
    }

    public final void RemoteActionCompatParcelizer(_ensureOverride.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaMetadataCompat = audioAttributesCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            if (this.MediaBrowserCompatMediaItem) {
                return;
            }
            long j = this.RatingCompat - 1;
            this.RatingCompat = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                read(new IllegalStateException());
            } else {
                AudioAttributesCompatParcelizer();
            }
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            this.MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer.getLast();
        }
        this.write.write();
        this.IconCompatParcelizer.write();
        this.read.clear();
        this.AudioAttributesImplApi26Parcelizer.clear();
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RatingCompat > 0 || this.MediaBrowserCompatMediaItem;
    }

    private void RemoteActionCompatParcelizer(MediaFormat mediaFormat) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(-2);
        this.AudioAttributesImplApi26Parcelizer.add(mediaFormat);
    }

    private void MediaBrowserCompatItemReceiver() {
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        IllegalStateException illegalStateException = this.AudioAttributesImplBaseParcelizer;
        if (illegalStateException == null) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = null;
        throw illegalStateException;
    }

    private void AudioAttributesImplBaseParcelizer() {
        MediaCodec.CodecException codecException = this.MediaBrowserCompatSearchResultReceiver;
        if (codecException == null) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = null;
        throw codecException;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        MediaCodec.CryptoException cryptoException = this.MediaBrowserCompatCustomActionResultReceiver;
        if (cryptoException == null) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        throw cryptoException;
    }

    private void read(IllegalStateException illegalStateException) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplBaseParcelizer = illegalStateException;
        }
    }
}
