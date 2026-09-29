package kotlin;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertyWriter extends getTypeInclusion {
    private byte[] AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private byte[] IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final short MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final long MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final float RatingCompat;
    private int RemoteActionCompatParcelizer;
    private int onCommand;
    private long onCustomAction;

    private static int read(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    public PropertyWriter() {
        this((byte) 0);
    }

    private PropertyWriter(byte b) {
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        buildTypeSerializer.IconCompatParcelizer(true);
        this.MediaDescriptionCompat = 100000L;
        this.RatingCompat = 0.2f;
        this.AudioAttributesImplApi26Parcelizer = 2000000L;
        this.MediaMetadataCompat = 10;
        this.MediaBrowserCompatMediaItem = SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    public final long MediaBrowserCompatMediaItem() {
        return this.onCustomAction;
    }

    @Override // kotlin.getTypeInclusion
    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        if (iconCompatParcelizer.write == 2) {
            return iconCompatParcelizer.RemoteActionCompatParcelizer == -1 ? deserializeTypedFromArray.IconCompatParcelizer.read : iconCompatParcelizer;
        }
        throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    @Override // kotlin.getTypeInclusion, kotlin.deserializeTypedFromArray
    public final boolean read() {
        return super.read() && this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void read(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !MediaBrowserCompatItemReceiver()) {
            int i = this.onCommand;
            if (i == 0) {
                RemoteActionCompatParcelizer(byteBuffer);
            } else if (i == 1) {
                MediaBrowserCompatItemReceiver(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // kotlin.getTypeInclusion
    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesImplBaseParcelizer > 0) {
            read(true);
            this.MediaBrowserCompatSearchResultReceiver = 0;
        }
    }

    @Override // kotlin.getTypeInclusion
    public final void AudioAttributesImplBaseParcelizer() {
        if (read()) {
            this.RemoteActionCompatParcelizer = this.write.IconCompatParcelizer << 1;
            int i = read(RemoteActionCompatParcelizer(this.MediaDescriptionCompat) / 2) << 1;
            if (this.AudioAttributesImplApi21Parcelizer.length != i) {
                this.AudioAttributesImplApi21Parcelizer = new byte[i];
                this.IconCompatParcelizer = new byte[i];
            }
        }
        this.onCommand = 0;
        this.onCustomAction = 0L;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    @Override // kotlin.getTypeInclusion
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.AudioAttributesImplApi21Parcelizer.length));
        int iIconCompatParcelizer = IconCompatParcelizer(byteBuffer);
        if (iIconCompatParcelizer == byteBuffer.position()) {
            this.onCommand = 1;
        } else {
            byteBuffer.limit(Math.min(iIconCompatParcelizer, byteBuffer.capacity()));
            write(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void MediaBrowserCompatItemReceiver(ByteBuffer byteBuffer) {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver < this.AudioAttributesImplApi21Parcelizer.length);
        int iLimit = byteBuffer.limit();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(byteBuffer);
        int iPosition = iAudioAttributesCompatParcelizer - byteBuffer.position();
        int length = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
        int length2 = length + i;
        if (length2 < bArr.length) {
            length = bArr.length;
        } else {
            length2 = i - (bArr.length - length);
        }
        int i2 = length - length2;
        boolean z = iAudioAttributesCompatParcelizer < iLimit;
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.AudioAttributesImplApi21Parcelizer, length2, iMin);
        int i3 = this.AudioAttributesImplBaseParcelizer + iMin;
        this.AudioAttributesImplBaseParcelizer = i3;
        buildTypeSerializer.write(i3 <= this.AudioAttributesImplApi21Parcelizer.length);
        boolean z2 = z && iPosition < i2;
        read(z2);
        if (z2) {
            this.onCommand = 0;
            this.MediaBrowserCompatSearchResultReceiver = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private void read(boolean z) {
        int length;
        int iIconCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
        if (i == bArr.length || z) {
            if (this.MediaBrowserCompatSearchResultReceiver == 0) {
                if (z) {
                    AudioAttributesCompatParcelizer(i, 3);
                    length = i;
                } else {
                    buildTypeSerializer.write(i >= bArr.length / 2);
                    length = this.AudioAttributesImplApi21Parcelizer.length / 2;
                    AudioAttributesCompatParcelizer(length, 0);
                }
                iIconCompatParcelizer = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = bArr.length / 2;
                int iIconCompatParcelizer2 = IconCompatParcelizer(length2) + (this.AudioAttributesImplApi21Parcelizer.length / 2);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer2, 2);
                length = length2 + length3;
                iIconCompatParcelizer = iIconCompatParcelizer2;
            } else {
                length = i - (bArr.length / 2);
                iIconCompatParcelizer = IconCompatParcelizer(length);
                AudioAttributesCompatParcelizer(iIconCompatParcelizer, 1);
            }
            buildTypeSerializer.read(length % this.RemoteActionCompatParcelizer == 0, "bytesConsumed is not aligned to frame size: %s".concat(String.valueOf(length)));
            buildTypeSerializer.write(i >= iIconCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer -= length;
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver + length;
            this.MediaBrowserCompatCustomActionResultReceiver = i2;
            this.MediaBrowserCompatCustomActionResultReceiver = i2 % this.AudioAttributesImplApi21Parcelizer.length;
            int i3 = this.MediaBrowserCompatSearchResultReceiver;
            int i4 = this.RemoteActionCompatParcelizer;
            this.MediaBrowserCompatSearchResultReceiver = i3 + (iIconCompatParcelizer / i4);
            this.onCustomAction += (long) ((length - iIconCompatParcelizer) / i4);
        }
    }

    private int IconCompatParcelizer(int i) {
        int iRemoteActionCompatParcelizer = ((RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer) - this.MediaBrowserCompatSearchResultReceiver) * this.RemoteActionCompatParcelizer) - (this.AudioAttributesImplApi21Parcelizer.length / 2);
        buildTypeSerializer.write(iRemoteActionCompatParcelizer >= 0);
        return AudioAttributesCompatParcelizer(Math.min((i * this.RatingCompat) + 0.5f, iRemoteActionCompatParcelizer));
    }

    private int read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        return (i / i2) * i2;
    }

    private int AudioAttributesCompatParcelizer(float f) {
        return read((int) f);
    }

    private void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        buildTypeSerializer.write(i % this.RemoteActionCompatParcelizer == 0, "byteOutput size is not aligned to frame size ".concat(String.valueOf(i)));
        AudioAttributesCompatParcelizer(bArr, i, i2);
        RemoteActionCompatParcelizer(i).put(bArr, 0, i).flip();
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) {
        if (i == 0) {
            return;
        }
        buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer >= i);
        if (i2 == 2) {
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i4 = this.AudioAttributesImplBaseParcelizer;
            byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
            int i5 = i3 + i4;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.IconCompatParcelizer, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.IconCompatParcelizer, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.IconCompatParcelizer, 0, i6);
                    System.arraycopy(this.AudioAttributesImplApi21Parcelizer, 0, this.IconCompatParcelizer, i6, length);
                }
            }
        } else {
            int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
            byte[] bArr2 = this.AudioAttributesImplApi21Parcelizer;
            if (i7 + i <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.IconCompatParcelizer, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.IconCompatParcelizer, 0, length2);
                System.arraycopy(this.AudioAttributesImplApi21Parcelizer, 0, this.IconCompatParcelizer, length2, i - length2);
            }
        }
        buildTypeSerializer.write(i % this.RemoteActionCompatParcelizer == 0, "sizeToOutput is not aligned to frame size: ".concat(String.valueOf(i)));
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver < this.AudioAttributesImplApi21Parcelizer.length);
        RemoteActionCompatParcelizer(this.IconCompatParcelizer, i, i2);
    }

    private void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        int iWrite;
        if (i2 != 3) {
            for (int i3 = 0; i3 < i; i3 += 2) {
                int i4 = read(bArr[i3 + 1], bArr[i3]);
                if (i2 == 0) {
                    iWrite = read(i3, i - 1);
                } else if (i2 == 2) {
                    iWrite = write(i3, i - 1);
                } else {
                    iWrite = this.MediaMetadataCompat;
                }
                write(bArr, i3, (i4 * iWrite) / 100);
            }
        }
    }

    private int read(int i, int i2) {
        return (((this.MediaMetadataCompat - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    private int write(int i, int i2) {
        int i3 = this.MediaMetadataCompat;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    private static void write(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) i2;
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    private void write(ByteBuffer byteBuffer) {
        RemoteActionCompatParcelizer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private int RemoteActionCompatParcelizer(long j) {
        return (int) ((j * ((long) this.write.RemoteActionCompatParcelizer)) / 1000000);
    }

    private int AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (write(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.RemoteActionCompatParcelizer;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private int IconCompatParcelizer(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (write(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.RemoteActionCompatParcelizer;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private boolean write(byte b, byte b2) {
        return Math.abs(read(b, b2)) > this.MediaBrowserCompatMediaItem;
    }
}
