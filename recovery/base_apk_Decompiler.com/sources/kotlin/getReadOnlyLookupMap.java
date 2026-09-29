package kotlin;

import java.nio.ByteBuffer;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
final class getReadOnlyLookupMap extends getTypeInclusion {
    private boolean AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private byte[] RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(int i, int i2) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = i2;
    }

    public final void MediaBrowserCompatMediaItem() {
        this.MediaBrowserCompatItemReceiver = 0L;
    }

    public final long RatingCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.getTypeInclusion
    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        if (iconCompatParcelizer.write != 2) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        return (this.AudioAttributesImplBaseParcelizer == 0 && this.AudioAttributesImplApi26Parcelizer == 0) ? deserializeTypedFromArray.IconCompatParcelizer.read : iconCompatParcelizer;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void read(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatItemReceiver += (long) (iMin / this.write.AudioAttributesCompatParcelizer);
            this.MediaBrowserCompatCustomActionResultReceiver -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.MediaBrowserCompatCustomActionResultReceiver > 0) {
                return;
            }
            int i2 = i - iMin;
            int length = (this.IconCompatParcelizer + i2) - this.RemoteActionCompatParcelizer.length;
            ByteBuffer byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(length);
            int iWrite = LaissezFaireSubTypeValidator.write(length, 0, this.IconCompatParcelizer);
            byteBufferRemoteActionCompatParcelizer.put(this.RemoteActionCompatParcelizer, 0, iWrite);
            int iWrite2 = LaissezFaireSubTypeValidator.write(length - iWrite, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iWrite2);
            byteBufferRemoteActionCompatParcelizer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iWrite2;
            int i4 = this.IconCompatParcelizer - iWrite;
            this.IconCompatParcelizer = i4;
            byte[] bArr = this.RemoteActionCompatParcelizer;
            System.arraycopy(bArr, iWrite, bArr, 0, i4);
            byteBuffer.get(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, i3);
            this.IconCompatParcelizer += i3;
            byteBufferRemoteActionCompatParcelizer.flip();
        }
    }

    @Override // kotlin.getTypeInclusion, kotlin.deserializeTypedFromArray
    public final ByteBuffer IconCompatParcelizer() {
        int i;
        if (super.RemoteActionCompatParcelizer() && (i = this.IconCompatParcelizer) > 0) {
            RemoteActionCompatParcelizer(i).put(this.RemoteActionCompatParcelizer, 0, this.IconCompatParcelizer).flip();
            this.IconCompatParcelizer = 0;
        }
        return super.IconCompatParcelizer();
    }

    @Override // kotlin.getTypeInclusion, kotlin.deserializeTypedFromArray
    public final boolean RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer() && this.IconCompatParcelizer == 0;
    }

    @Override // kotlin.getTypeInclusion
    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            int i = this.IconCompatParcelizer;
            if (i > 0) {
                this.MediaBrowserCompatItemReceiver += (long) (i / this.write.AudioAttributesCompatParcelizer);
            }
            this.IconCompatParcelizer = 0;
        }
    }

    @Override // kotlin.getTypeInclusion
    public final void AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = false;
            this.RemoteActionCompatParcelizer = new byte[this.AudioAttributesImplApi26Parcelizer * this.write.AudioAttributesCompatParcelizer];
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplBaseParcelizer * this.write.AudioAttributesCompatParcelizer;
        }
        this.IconCompatParcelizer = 0;
    }

    @Override // kotlin.getTypeInclusion
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    }
}
