package kotlin;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
public final class hasDefaultImpl implements deserializeTypedFromArray {
    private long AudioAttributesImplApi21Parcelizer;
    private long IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompatItemReceiver;
    private ShortBuffer MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private forProperty RatingCompat;
    private ByteBuffer RemoteActionCompatParcelizer;
    private boolean write;
    private float onCommand = 1.0f;
    private float MediaBrowserCompatMediaItem = 1.0f;
    private deserializeTypedFromArray.IconCompatParcelizer AudioAttributesImplApi26Parcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    private deserializeTypedFromArray.IconCompatParcelizer AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    private deserializeTypedFromArray.IconCompatParcelizer read = deserializeTypedFromArray.IconCompatParcelizer.read;
    private deserializeTypedFromArray.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = deserializeTypedFromArray.IconCompatParcelizer.read;

    public hasDefaultImpl() {
        ByteBuffer byteBuffer = AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = byteBuffer;
        this.MediaBrowserCompatSearchResultReceiver = byteBuffer.asShortBuffer();
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        this.MediaMetadataCompat = -1;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.onCommand != f) {
            this.onCommand = f;
            this.MediaDescriptionCompat = true;
        }
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (this.MediaBrowserCompatMediaItem != f) {
            this.MediaBrowserCompatMediaItem = f;
            this.MediaDescriptionCompat = true;
        }
    }

    public final long read(long j) {
        if (this.AudioAttributesImplApi21Parcelizer >= 1024) {
            long jIconCompatParcelizer = this.IconCompatParcelizer - ((long) ((forProperty) buildTypeSerializer.IconCompatParcelizer(this.RatingCompat)).IconCompatParcelizer());
            if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer == this.read.RemoteActionCompatParcelizer) {
                return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j, jIconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
            }
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j, jIconCompatParcelizer * ((long) this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer), ((long) this.read.RemoteActionCompatParcelizer) * this.AudioAttributesImplApi21Parcelizer);
        }
        return (long) (((double) this.onCommand) * j);
    }

    @Override // kotlin.deserializeTypedFromArray
    public final deserializeTypedFromArray.IconCompatParcelizer RemoteActionCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        if (iconCompatParcelizer.write != 2) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        int i = this.MediaMetadataCompat;
        if (i == -1) {
            i = iconCompatParcelizer.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer2 = new deserializeTypedFromArray.IconCompatParcelizer(i, iconCompatParcelizer.IconCompatParcelizer, 2);
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer2;
        this.MediaDescriptionCompat = true;
        return iconCompatParcelizer2;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final boolean read() {
        if (this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer != -1) {
            return Math.abs(this.onCommand - 1.0f) >= 1.0E-4f || Math.abs(this.MediaBrowserCompatMediaItem - 1.0f) >= 1.0E-4f || this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer != this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        }
        return false;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            forProperty forproperty = (forProperty) buildTypeSerializer.IconCompatParcelizer(this.RatingCompat);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.IconCompatParcelizer += (long) iRemaining;
            forproperty.IconCompatParcelizer(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void write() {
        forProperty forproperty = this.RatingCompat;
        if (forproperty != null) {
            forproperty.write();
        }
        this.write = true;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final ByteBuffer IconCompatParcelizer() {
        int iAudioAttributesCompatParcelizer;
        forProperty forproperty = this.RatingCompat;
        if (forproperty != null && (iAudioAttributesCompatParcelizer = forproperty.AudioAttributesCompatParcelizer()) > 0) {
            if (this.RemoteActionCompatParcelizer.capacity() < iAudioAttributesCompatParcelizer) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iAudioAttributesCompatParcelizer).order(ByteOrder.nativeOrder());
                this.RemoteActionCompatParcelizer = byteBufferOrder;
                this.MediaBrowserCompatSearchResultReceiver = byteBufferOrder.asShortBuffer();
            } else {
                this.RemoteActionCompatParcelizer.clear();
                this.MediaBrowserCompatSearchResultReceiver.clear();
            }
            forproperty.read(this.MediaBrowserCompatSearchResultReceiver);
            this.AudioAttributesImplApi21Parcelizer += (long) iAudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer.limit(iAudioAttributesCompatParcelizer);
            this.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer;
        }
        ByteBuffer byteBuffer = this.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        return byteBuffer;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final boolean RemoteActionCompatParcelizer() {
        if (!this.write) {
            return false;
        }
        forProperty forproperty = this.RatingCompat;
        return forproperty == null || forproperty.AudioAttributesCompatParcelizer() == 0;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void AudioAttributesCompatParcelizer() {
        if (read()) {
            deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            this.read = iconCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplBaseParcelizer;
            if (this.MediaDescriptionCompat) {
                this.RatingCompat = new forProperty(iconCompatParcelizer.RemoteActionCompatParcelizer, this.read.IconCompatParcelizer, this.onCommand, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
            } else {
                forProperty forproperty = this.RatingCompat;
                if (forproperty != null) {
                    forproperty.read();
                }
            }
        }
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = 0L;
        this.AudioAttributesImplApi21Parcelizer = 0L;
        this.write = false;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void AudioAttributesImplApi26Parcelizer() {
        this.onCommand = 1.0f;
        this.MediaBrowserCompatMediaItem = 1.0f;
        this.AudioAttributesImplApi26Parcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.read = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.MediaBrowserCompatCustomActionResultReceiver = deserializeTypedFromArray.IconCompatParcelizer.read;
        ByteBuffer byteBuffer = AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = byteBuffer;
        this.MediaBrowserCompatSearchResultReceiver = byteBuffer.asShortBuffer();
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        this.MediaMetadataCompat = -1;
        this.MediaDescriptionCompat = false;
        this.RatingCompat = null;
        this.IconCompatParcelizer = 0L;
        this.AudioAttributesImplApi21Parcelizer = 0L;
        this.write = false;
    }
}
