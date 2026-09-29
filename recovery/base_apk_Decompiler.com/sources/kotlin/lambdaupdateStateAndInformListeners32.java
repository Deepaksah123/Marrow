package kotlin;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaupdateStateAndInformListeners32 {
    private int[] AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private byte[] IconCompatParcelizer;
    private lambdaupdateStateAndInformListeners34 MediaBrowserCompatCustomActionResultReceiver;
    private byte[] MediaBrowserCompatItemReceiver;
    private int[] MediaBrowserCompatMediaItem;
    private final int[] MediaBrowserCompatSearchResultReceiver;
    private Bitmap MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private short[] MediaDescriptionCompat;
    private lambdaupdateStateAndInformListeners33 MediaMetadataCompat;
    private byte[] RatingCompat;
    private int RemoteActionCompatParcelizer;
    private ByteBuffer handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;
    private int onFastForward;
    private byte[] onMediaButtonEvent;
    private int onPause;
    private byte[] onPlay;
    private int read;
    private final read write;

    interface read {
        Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config);

        byte[] RemoteActionCompatParcelizer(int i);

        int[] read(int i);
    }

    private lambdaupdateStateAndInformListeners32(read readVar) {
        this.MediaBrowserCompatSearchResultReceiver = new int[256];
        this.onPause = 0;
        this.onFastForward = 0;
        this.write = readVar;
        this.MediaBrowserCompatCustomActionResultReceiver = new lambdaupdateStateAndInformListeners34();
    }

    public lambdaupdateStateAndInformListeners32() {
        this(new lambdaupdateStateAndInformListeners36());
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.write <= 0) {
            return false;
        }
        if (this.AudioAttributesImplApi21Parcelizer == AudioAttributesImplBaseParcelizer() - 1) {
            this.AudioAttributesImplApi26Parcelizer++;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver != -1 && this.AudioAttributesImplApi26Parcelizer > this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer = (this.AudioAttributesImplApi21Parcelizer + 1) % this.MediaBrowserCompatCustomActionResultReceiver.write;
        return true;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private int AudioAttributesCompatParcelizer(int i) {
        if (i < 0 || i >= this.MediaBrowserCompatCustomActionResultReceiver.write) {
            return -1;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver.read.get(i).RemoteActionCompatParcelizer;
    }

    private int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.write;
    }

    public final int write() {
        int i;
        if (this.MediaBrowserCompatCustomActionResultReceiver.write <= 0 || (i = this.AudioAttributesImplApi21Parcelizer) < 0) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(i);
    }

    public final Bitmap IconCompatParcelizer() {
        synchronized (this) {
            if (this.MediaBrowserCompatCustomActionResultReceiver.write <= 0 || this.AudioAttributesImplApi21Parcelizer < 0) {
                int i = this.MediaBrowserCompatCustomActionResultReceiver.write;
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                this.onCustomAction = 1;
            }
            int i2 = this.onCustomAction;
            if (i2 == 1 || i2 == 2) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                return null;
            }
            this.onCustomAction = 0;
            lambdaupdateStateAndInformListeners35 lambdaupdatestateandinformlisteners35 = this.MediaBrowserCompatCustomActionResultReceiver.read.get(this.AudioAttributesImplApi21Parcelizer);
            int i3 = this.AudioAttributesImplApi21Parcelizer - 1;
            lambdaupdateStateAndInformListeners35 lambdaupdatestateandinformlisteners352 = i3 >= 0 ? this.MediaBrowserCompatCustomActionResultReceiver.read.get(i3) : null;
            int[] iArr = lambdaupdatestateandinformlisteners35.AudioAttributesImplApi26Parcelizer != null ? lambdaupdatestateandinformlisteners35.AudioAttributesImplApi26Parcelizer : this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesCompatParcelizer = iArr;
            if (iArr == null) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                this.onCustomAction = 1;
                return null;
            }
            if (lambdaupdatestateandinformlisteners35.MediaMetadataCompat) {
                int[] iArr2 = this.AudioAttributesCompatParcelizer;
                System.arraycopy(iArr2, 0, this.MediaBrowserCompatSearchResultReceiver, 0, iArr2.length);
                int[] iArr3 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesCompatParcelizer = iArr3;
                iArr3[lambdaupdatestateandinformlisteners35.MediaBrowserCompatCustomActionResultReceiver] = 0;
            }
            return write(lambdaupdatestateandinformlisteners35, lambdaupdatestateandinformlisteners352);
        }
    }

    public final int read(byte[] bArr) {
        int i;
        synchronized (this) {
            lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners34RemoteActionCompatParcelizer = read().AudioAttributesCompatParcelizer(bArr).RemoteActionCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = lambdaupdatestateandinformlisteners34RemoteActionCompatParcelizer;
            if (bArr != null) {
                IconCompatParcelizer(lambdaupdatestateandinformlisteners34RemoteActionCompatParcelizer, bArr);
            }
            i = this.onCustomAction;
        }
        return i;
    }

    private void RatingCompat() {
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    private void IconCompatParcelizer(lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners34, byte[] bArr) {
        synchronized (this) {
            read(lambdaupdatestateandinformlisteners34, ByteBuffer.wrap(bArr));
        }
    }

    private void read(lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners34, ByteBuffer byteBuffer) {
        synchronized (this) {
            AudioAttributesCompatParcelizer(lambdaupdatestateandinformlisteners34, byteBuffer);
        }
    }

    private void AudioAttributesCompatParcelizer(lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners34, ByteBuffer byteBuffer) {
        synchronized (this) {
            int iHighestOneBit = Integer.highestOneBit(1);
            this.onCustomAction = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = lambdaupdatestateandinformlisteners34;
            this.AudioAttributesImplBaseParcelizer = false;
            this.AudioAttributesImplApi21Parcelizer = -1;
            RatingCompat();
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.handleMediaPlayPauseIfPendingOnHandler = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.handleMediaPlayPauseIfPendingOnHandler.order(ByteOrder.LITTLE_ENDIAN);
            this.onCommand = false;
            Iterator<lambdaupdateStateAndInformListeners35> it = lambdaupdatestateandinformlisteners34.read.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().read == 3) {
                    this.onCommand = true;
                    break;
                }
            }
            this.onAddQueueItem = iHighestOneBit;
            this.read = lambdaupdatestateandinformlisteners34.MediaBrowserCompatSearchResultReceiver / iHighestOneBit;
            this.RemoteActionCompatParcelizer = lambdaupdatestateandinformlisteners34.MediaBrowserCompatItemReceiver / iHighestOneBit;
            this.MediaBrowserCompatItemReceiver = this.write.RemoteActionCompatParcelizer(lambdaupdatestateandinformlisteners34.MediaBrowserCompatSearchResultReceiver * lambdaupdatestateandinformlisteners34.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatMediaItem = this.write.read(this.read * this.RemoteActionCompatParcelizer);
        }
    }

    public final boolean IconCompatParcelizer(int i) {
        if (-1 >= AudioAttributesImplBaseParcelizer()) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer = -1;
        return true;
    }

    private int IconCompatParcelizer(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.onAddQueueItem + i; i9++) {
            byte[] bArr = this.MediaBrowserCompatItemReceiver;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.AudioAttributesCompatParcelizer[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += i10 >>> 24;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.onAddQueueItem + i11; i12++) {
            byte[] bArr2 = this.MediaBrowserCompatItemReceiver;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.AudioAttributesCompatParcelizer[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += i13 >>> 24;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:46:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(kotlin.lambdaupdateStateAndInformListeners35 r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaupdateStateAndInformListeners32.AudioAttributesCompatParcelizer(o.lambdaupdateStateAndInformListeners35):void");
    }

    private void IconCompatParcelizer(int[] iArr, lambdaupdateStateAndInformListeners35 lambdaupdatestateandinformlisteners35, int i) {
        int i2 = lambdaupdatestateandinformlisteners35.write / this.onAddQueueItem;
        int i3 = lambdaupdatestateandinformlisteners35.AudioAttributesImplApi21Parcelizer / this.onAddQueueItem;
        int i4 = lambdaupdatestateandinformlisteners35.MediaBrowserCompatItemReceiver / this.onAddQueueItem;
        int i5 = lambdaupdatestateandinformlisteners35.AudioAttributesImplBaseParcelizer / this.onAddQueueItem;
        int i6 = this.read;
        int i7 = (i3 * i6) + i5;
        int i8 = i7;
        while (i8 < (i2 * i6) + i7) {
            for (int i9 = i8; i9 < i8 + i4; i9++) {
                iArr[i9] = i;
            }
            i8 += this.read;
        }
    }

    private lambdaupdateStateAndInformListeners33 read() {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new lambdaupdateStateAndInformListeners33();
        }
        return this.MediaMetadataCompat;
    }

    private Bitmap AudioAttributesImplApi26Parcelizer() {
        Bitmap bitmapIconCompatParcelizer = this.write.IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        IconCompatParcelizer(bitmapIconCompatParcelizer);
        return bitmapIconCompatParcelizer;
    }

    private int AudioAttributesImplApi21Parcelizer() {
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (iMediaBrowserCompatCustomActionResultReceiver > 0) {
            try {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = this.write.RemoteActionCompatParcelizer(255);
                }
                int i = this.onFastForward;
                int i2 = this.onPause;
                int i3 = i - i2;
                if (i3 >= iMediaBrowserCompatCustomActionResultReceiver) {
                    System.arraycopy(this.onPlay, i2, this.IconCompatParcelizer, 0, iMediaBrowserCompatCustomActionResultReceiver);
                    this.onPause += iMediaBrowserCompatCustomActionResultReceiver;
                    return iMediaBrowserCompatCustomActionResultReceiver;
                }
                if (this.handleMediaPlayPauseIfPendingOnHandler.remaining() + i3 >= iMediaBrowserCompatCustomActionResultReceiver) {
                    System.arraycopy(this.onPlay, this.onPause, this.IconCompatParcelizer, 0, i3);
                    this.onPause = this.onFastForward;
                    MediaBrowserCompatItemReceiver();
                    int i4 = iMediaBrowserCompatCustomActionResultReceiver - i3;
                    System.arraycopy(this.onPlay, 0, this.IconCompatParcelizer, i3, i4);
                    this.onPause += i4;
                    return iMediaBrowserCompatCustomActionResultReceiver;
                }
                this.onCustomAction = 1;
                return iMediaBrowserCompatCustomActionResultReceiver;
            } catch (Exception unused) {
                RendererWakeupListener.AudioAttributesImplApi26Parcelizer();
                this.onCustomAction = 1;
            }
        }
        return iMediaBrowserCompatCustomActionResultReceiver;
    }

    private int MediaBrowserCompatCustomActionResultReceiver() {
        try {
            MediaBrowserCompatItemReceiver();
            byte[] bArr = this.onPlay;
            int i = this.onPause;
            this.onPause = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.onCustomAction = 1;
            return 0;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.onFastForward > this.onPause) {
            return;
        }
        if (this.onPlay == null) {
            this.onPlay = this.write.RemoteActionCompatParcelizer(16384);
        }
        this.onPause = 0;
        int iMin = Math.min(this.handleMediaPlayPauseIfPendingOnHandler.remaining(), 16384);
        this.onFastForward = iMin;
        this.handleMediaPlayPauseIfPendingOnHandler.get(this.onPlay, 0, iMin);
    }

    private Bitmap write(lambdaupdateStateAndInformListeners35 lambdaupdatestateandinformlisteners35, lambdaupdateStateAndInformListeners35 lambdaupdatestateandinformlisteners352) {
        int i;
        int i2;
        int i3;
        int iIconCompatParcelizer;
        int i4;
        int[] iArr = this.MediaBrowserCompatMediaItem;
        int i5 = 0;
        if (lambdaupdatestateandinformlisteners352 == null) {
            Arrays.fill(iArr, 0);
        }
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        if (lambdaupdatestateandinformlisteners352 != null && lambdaupdatestateandinformlisteners352.read > 0) {
            if (lambdaupdatestateandinformlisteners352.read == 2) {
                if (!lambdaupdatestateandinformlisteners35.MediaMetadataCompat) {
                    i4 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
                    if (lambdaupdatestateandinformlisteners35.AudioAttributesImplApi26Parcelizer != null && this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer == lambdaupdatestateandinformlisteners35.MediaBrowserCompatCustomActionResultReceiver) {
                    }
                    IconCompatParcelizer(iArr, lambdaupdatestateandinformlisteners352, i4);
                } else if (this.AudioAttributesImplApi21Parcelizer == 0) {
                    this.AudioAttributesImplBaseParcelizer = true;
                }
                i4 = 0;
                IconCompatParcelizer(iArr, lambdaupdatestateandinformlisteners352, i4);
            } else if (lambdaupdatestateandinformlisteners352.read == 3) {
                if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                    IconCompatParcelizer(iArr, lambdaupdatestateandinformlisteners352, 0);
                } else {
                    int i9 = lambdaupdatestateandinformlisteners352.write / this.onAddQueueItem;
                    int i10 = lambdaupdatestateandinformlisteners352.AudioAttributesImplApi21Parcelizer / this.onAddQueueItem;
                    int i11 = lambdaupdatestateandinformlisteners352.MediaBrowserCompatItemReceiver / this.onAddQueueItem;
                    int i12 = lambdaupdatestateandinformlisteners352.AudioAttributesImplBaseParcelizer / this.onAddQueueItem;
                    int i13 = this.read;
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getPixels(iArr, (i10 * i13) + i12, i13, i12, i10, i11, i9);
                }
            }
        }
        AudioAttributesCompatParcelizer(lambdaupdatestateandinformlisteners35);
        int i14 = lambdaupdatestateandinformlisteners35.write / this.onAddQueueItem;
        int i15 = lambdaupdatestateandinformlisteners35.AudioAttributesImplApi21Parcelizer / this.onAddQueueItem;
        int i16 = lambdaupdatestateandinformlisteners35.MediaBrowserCompatItemReceiver / this.onAddQueueItem;
        int i17 = lambdaupdatestateandinformlisteners35.AudioAttributesImplBaseParcelizer / this.onAddQueueItem;
        boolean z = this.AudioAttributesImplApi21Parcelizer == 0;
        int i18 = 8;
        int i19 = 0;
        int i20 = 1;
        while (i5 < i14) {
            if (lambdaupdatestateandinformlisteners35.IconCompatParcelizer) {
                if (i19 >= i14) {
                    i20++;
                    if (i20 == i7) {
                        i19 = 4;
                    } else if (i20 == i6) {
                        i19 = i7;
                        i18 = 4;
                    } else if (i20 == 4) {
                        i18 = i7;
                        i19 = i8;
                    }
                }
                i = i19 + i18;
            } else {
                i = i19;
                i19 = i5;
            }
            int i21 = i19 + i15;
            if (i21 < this.RemoteActionCompatParcelizer) {
                int i22 = this.read;
                int i23 = i21 * i22;
                int i24 = i23 + i17;
                int i25 = i24 + i16;
                int i26 = i23 + i22;
                if (i26 < i25) {
                    i25 = i26;
                }
                int i27 = this.onAddQueueItem * i5 * lambdaupdatestateandinformlisteners35.MediaBrowserCompatItemReceiver;
                int i28 = this.onAddQueueItem;
                int i29 = i27;
                int i30 = i24;
                while (i30 < i25) {
                    int i31 = i14;
                    int i32 = i15;
                    if (this.onAddQueueItem == 1) {
                        i2 = i29;
                        i3 = i16;
                        iIconCompatParcelizer = this.AudioAttributesCompatParcelizer[this.MediaBrowserCompatItemReceiver[i2] & 255];
                    } else {
                        i2 = i29;
                        i3 = i16;
                        iIconCompatParcelizer = IconCompatParcelizer(i2, ((i25 - i24) * i28) + i27, lambdaupdatestateandinformlisteners35.MediaBrowserCompatItemReceiver);
                    }
                    if (iIconCompatParcelizer != 0) {
                        iArr[i30] = iIconCompatParcelizer;
                    } else if (!this.AudioAttributesImplBaseParcelizer && z) {
                        this.AudioAttributesImplBaseParcelizer = true;
                    }
                    int i33 = this.onAddQueueItem + i2;
                    i30++;
                    i16 = i3;
                    i15 = i32;
                    i29 = i33;
                    i14 = i31;
                }
            }
            i5++;
            i14 = i14;
            i19 = i;
            i16 = i16;
            i15 = i15;
            i6 = 3;
            i7 = 2;
            i8 = 1;
        }
        if (this.onCommand && (lambdaupdatestateandinformlisteners35.read == 0 || lambdaupdatestateandinformlisteners35.read == 1)) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesImplApi26Parcelizer();
            }
            Bitmap bitmap = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i34 = this.read;
            bitmap.setPixels(iArr, 0, i34, 0, 0, i34, this.RemoteActionCompatParcelizer);
        }
        Bitmap bitmapAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i35 = this.read;
        bitmapAudioAttributesImplApi26Parcelizer.setPixels(iArr, 0, i35, 0, 0, i35, this.RemoteActionCompatParcelizer);
        return bitmapAudioAttributesImplApi26Parcelizer;
    }

    private static void IconCompatParcelizer(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }
}
