package kotlin;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.onAvailableCommandsChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class onDeviceInfoChanged implements onAvailableCommandsChanged {
    private static final String read = "StandardGifDecoder";
    private Bitmap.Config AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private ForwardingPlayerForwardingListener AudioAttributesImplBaseParcelizer;
    private int[] IconCompatParcelizer;
    private Boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private byte[] MediaBrowserCompatMediaItem;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private ByteBuffer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private byte[] MediaDescriptionCompat;
    private final int[] MediaMetadataCompat;
    private short[] RatingCompat;
    private final onAvailableCommandsChanged.write RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private Bitmap onAddQueueItem;
    private int onCommand;
    private boolean onCustomAction;
    private byte[] onMediaButtonEvent;
    private byte[] write;

    public onDeviceInfoChanged(onAvailableCommandsChanged.write writeVar, ForwardingPlayerForwardingListener forwardingPlayerForwardingListener, ByteBuffer byteBuffer, int i) {
        this(writeVar);
        write(forwardingPlayerForwardingListener, byteBuffer, i);
    }

    private onDeviceInfoChanged(onAvailableCommandsChanged.write writeVar) {
        this.MediaMetadataCompat = new int[256];
        this.AudioAttributesCompatParcelizer = Bitmap.Config.ARGB_8888;
        this.RemoteActionCompatParcelizer = writeVar;
        this.AudioAttributesImplBaseParcelizer = new ForwardingPlayerForwardingListener();
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final ByteBuffer IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = (this.AudioAttributesImplApi21Parcelizer + 1) % this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
    }

    private int write(int i) {
        if (i < 0 || i >= this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer) {
            return -1;
        }
        return this.AudioAttributesImplBaseParcelizer.write.get(i).AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final int MediaBrowserCompatItemReceiver() {
        int i;
        if (this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer <= 0 || (i = this.AudioAttributesImplApi21Parcelizer) < 0) {
            return 0;
        }
        return write(i);
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final int write() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.limit() + this.MediaBrowserCompatMediaItem.length + (this.MediaBrowserCompatSearchResultReceiver.length << 2);
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final Bitmap AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            if (this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer <= 0 || this.AudioAttributesImplApi21Parcelizer < 0) {
                if (Log.isLoggable(read, 3)) {
                    int i = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
                }
                this.handleMediaPlayPauseIfPendingOnHandler = 1;
            }
            int i2 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (i2 == 1 || i2 == 2) {
                Log.isLoggable(read, 3);
                return null;
            }
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            if (this.write == null) {
                this.write = this.RemoteActionCompatParcelizer.write(255);
            }
            getWrappedPlayer getwrappedplayer = this.AudioAttributesImplBaseParcelizer.write.get(this.AudioAttributesImplApi21Parcelizer);
            int i3 = this.AudioAttributesImplApi21Parcelizer - 1;
            getWrappedPlayer getwrappedplayer2 = i3 >= 0 ? this.AudioAttributesImplBaseParcelizer.write.get(i3) : null;
            int[] iArr = getwrappedplayer.MediaBrowserCompatItemReceiver != null ? getwrappedplayer.MediaBrowserCompatItemReceiver : this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            this.IconCompatParcelizer = iArr;
            if (iArr == null) {
                Log.isLoggable(read, 3);
                this.handleMediaPlayPauseIfPendingOnHandler = 1;
                return null;
            }
            if (getwrappedplayer.MediaBrowserCompatMediaItem) {
                int[] iArr2 = this.IconCompatParcelizer;
                System.arraycopy(iArr2, 0, this.MediaMetadataCompat, 0, iArr2.length);
                int[] iArr3 = this.MediaMetadataCompat;
                this.IconCompatParcelizer = iArr3;
                iArr3[getwrappedplayer.AudioAttributesImplApi26Parcelizer] = 0;
                if (getwrappedplayer.RemoteActionCompatParcelizer == 2 && this.AudioAttributesImplApi21Parcelizer == 0) {
                    this.MediaBrowserCompatCustomActionResultReceiver = Boolean.TRUE;
                }
            }
            return RemoteActionCompatParcelizer(getwrappedplayer, getwrappedplayer2);
        }
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final void read() {
        this.AudioAttributesImplBaseParcelizer = null;
        byte[] bArr = this.MediaBrowserCompatMediaItem;
        if (bArr != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bArr);
        }
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if (iArr != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(iArr);
        }
        Bitmap bitmap = this.onAddQueueItem;
        if (bitmap != null) {
            this.RemoteActionCompatParcelizer.read(bitmap);
        }
        this.onAddQueueItem = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        byte[] bArr2 = this.write;
        if (bArr2 != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bArr2);
        }
    }

    private void write(ForwardingPlayerForwardingListener forwardingPlayerForwardingListener, ByteBuffer byteBuffer, int i) {
        synchronized (this) {
            if (i <= 0) {
                StringBuilder sb = new StringBuilder("Sample size must be >=0, not: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            this.AudioAttributesImplBaseParcelizer = forwardingPlayerForwardingListener;
            this.AudioAttributesImplApi21Parcelizer = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.order(ByteOrder.LITTLE_ENDIAN);
            this.onCustomAction = false;
            Iterator<getWrappedPlayer> it = forwardingPlayerForwardingListener.write.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().RemoteActionCompatParcelizer == 3) {
                    this.onCustomAction = true;
                    break;
                }
            }
            this.onCommand = iHighestOneBit;
            this.AudioAttributesImplApi26Parcelizer = forwardingPlayerForwardingListener.MediaBrowserCompatSearchResultReceiver / iHighestOneBit;
            this.MediaBrowserCompatItemReceiver = forwardingPlayerForwardingListener.MediaBrowserCompatItemReceiver / iHighestOneBit;
            this.MediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.write(forwardingPlayerForwardingListener.MediaBrowserCompatSearchResultReceiver * forwardingPlayerForwardingListener.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatSearchResultReceiver = this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer * this.MediaBrowserCompatItemReceiver);
        }
    }

    @Override // kotlin.onAvailableCommandsChanged
    public final void write(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            StringBuilder sb = new StringBuilder("Unsupported format: ");
            sb.append(config);
            sb.append(", must be one of ");
            sb.append(Bitmap.Config.ARGB_8888);
            sb.append(" or ");
            sb.append(Bitmap.Config.RGB_565);
            throw new IllegalArgumentException(sb.toString());
        }
        this.AudioAttributesCompatParcelizer = config;
    }

    private Bitmap RemoteActionCompatParcelizer(getWrappedPlayer getwrappedplayer, getWrappedPlayer getwrappedplayer2) {
        Bitmap bitmap;
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        int i = 0;
        if (getwrappedplayer2 == null) {
            Bitmap bitmap2 = this.onAddQueueItem;
            if (bitmap2 != null) {
                this.RemoteActionCompatParcelizer.read(bitmap2);
            }
            this.onAddQueueItem = null;
            Arrays.fill(iArr, 0);
        }
        if (getwrappedplayer2 != null && getwrappedplayer2.RemoteActionCompatParcelizer == 3 && this.onAddQueueItem == null) {
            Arrays.fill(iArr, 0);
        }
        if (getwrappedplayer2 != null && getwrappedplayer2.RemoteActionCompatParcelizer > 0) {
            if (getwrappedplayer2.RemoteActionCompatParcelizer == 2) {
                if (!getwrappedplayer.MediaBrowserCompatMediaItem) {
                    int i2 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
                    if (getwrappedplayer.MediaBrowserCompatItemReceiver == null || this.AudioAttributesImplBaseParcelizer.read != getwrappedplayer.AudioAttributesImplApi26Parcelizer) {
                        i = i2;
                    }
                }
                int i3 = getwrappedplayer2.IconCompatParcelizer / this.onCommand;
                int i4 = getwrappedplayer2.MediaBrowserCompatCustomActionResultReceiver / this.onCommand;
                int i5 = getwrappedplayer2.AudioAttributesImplBaseParcelizer / this.onCommand;
                int i6 = getwrappedplayer2.AudioAttributesImplApi21Parcelizer / this.onCommand;
                int i7 = this.AudioAttributesImplApi26Parcelizer;
                int i8 = (i4 * i7) + i6;
                int i9 = i8;
                while (i9 < (i3 * i7) + i8) {
                    for (int i10 = i9; i10 < i9 + i5; i10++) {
                        iArr[i10] = i;
                    }
                    i9 += this.AudioAttributesImplApi26Parcelizer;
                }
            } else if (getwrappedplayer2.RemoteActionCompatParcelizer == 3 && (bitmap = this.onAddQueueItem) != null) {
                int i11 = this.AudioAttributesImplApi26Parcelizer;
                bitmap.getPixels(iArr, 0, i11, 0, 0, i11, this.MediaBrowserCompatItemReceiver);
            }
        }
        IconCompatParcelizer(getwrappedplayer);
        if (getwrappedplayer.write || this.onCommand != 1) {
            write(getwrappedplayer);
        } else {
            read(getwrappedplayer);
        }
        if (this.onCustomAction && (getwrappedplayer.RemoteActionCompatParcelizer == 0 || getwrappedplayer.RemoteActionCompatParcelizer == 1)) {
            if (this.onAddQueueItem == null) {
                this.onAddQueueItem = MediaBrowserCompatCustomActionResultReceiver();
            }
            Bitmap bitmap3 = this.onAddQueueItem;
            int i12 = this.AudioAttributesImplApi26Parcelizer;
            bitmap3.setPixels(iArr, 0, i12, 0, 0, i12, this.MediaBrowserCompatItemReceiver);
        }
        Bitmap bitmapMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int i13 = this.AudioAttributesImplApi26Parcelizer;
        bitmapMediaBrowserCompatCustomActionResultReceiver.setPixels(iArr, 0, i13, 0, 0, i13, this.MediaBrowserCompatItemReceiver);
        return bitmapMediaBrowserCompatCustomActionResultReceiver;
    }

    private void read(getWrappedPlayer getwrappedplayer) {
        getWrappedPlayer getwrappedplayer2 = getwrappedplayer;
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        int i = getwrappedplayer2.IconCompatParcelizer;
        int i2 = getwrappedplayer2.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = getwrappedplayer2.AudioAttributesImplBaseParcelizer;
        int i4 = getwrappedplayer2.AudioAttributesImplApi21Parcelizer;
        boolean z = this.AudioAttributesImplApi21Parcelizer == 0;
        int i5 = this.AudioAttributesImplApi26Parcelizer;
        byte[] bArr = this.MediaBrowserCompatMediaItem;
        int[] iArr2 = this.IconCompatParcelizer;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = getwrappedplayer2.AudioAttributesImplBaseParcelizer * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            getwrappedplayer2 = getwrappedplayer;
        }
        Boolean bool = this.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.MediaBrowserCompatCustomActionResultReceiver == null && z && b != -1));
    }

    private void write(getWrappedPlayer getwrappedplayer) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        int i5 = getwrappedplayer.IconCompatParcelizer / this.onCommand;
        int i6 = getwrappedplayer.MediaBrowserCompatCustomActionResultReceiver / this.onCommand;
        int i7 = getwrappedplayer.AudioAttributesImplBaseParcelizer / this.onCommand;
        int i8 = getwrappedplayer.AudioAttributesImplApi21Parcelizer;
        int i9 = this.onCommand;
        int i10 = i8 / i9;
        int i11 = this.AudioAttributesImplApi21Parcelizer;
        Boolean bool = Boolean.TRUE;
        boolean z = i11 == 0;
        int i12 = this.AudioAttributesImplApi26Parcelizer;
        int i13 = this.MediaBrowserCompatItemReceiver;
        byte[] bArr = this.MediaBrowserCompatMediaItem;
        int[] iArr2 = this.IconCompatParcelizer;
        Boolean bool2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i5) {
            Boolean bool3 = bool2;
            if (getwrappedplayer.write) {
                if (i15 >= i5) {
                    int i18 = i17 + 1;
                    i = i5;
                    if (i18 == 2) {
                        i15 = 4;
                        i17 = i18;
                    } else if (i18 != 3) {
                        i17 = i18;
                        if (i18 == 4) {
                            i15 = 1;
                            i14 = 2;
                        }
                    } else {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    }
                } else {
                    i = i5;
                }
                i2 = i15 + i14;
            } else {
                i = i5;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i6;
            boolean z2 = i9 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i10;
                int i22 = i21 + i7;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                int i24 = getwrappedplayer.AudioAttributesImplBaseParcelizer * i16 * i9;
                if (z2) {
                    i3 = i2;
                    int i25 = i21;
                    while (true) {
                        i4 = i6;
                        if (i25 >= i22) {
                            break;
                        }
                        int i26 = iArr2[bArr[i24] & 255];
                        if (i26 != 0) {
                            iArr[i25] = i26;
                        } else if (z && bool3 == null) {
                            bool3 = bool;
                        }
                        i24 += i9;
                        i25++;
                        i6 = i4;
                    }
                } else {
                    i3 = i2;
                    i4 = i6;
                    int i27 = i24;
                    int i28 = i21;
                    while (i28 < i22) {
                        int i29 = i7;
                        int i30 = i10;
                        int iWrite = write(i27, i24 + ((i22 - i21) * i9), getwrappedplayer.AudioAttributesImplBaseParcelizer);
                        if (iWrite != 0) {
                            iArr[i28] = iWrite;
                        } else if (z && bool3 == null) {
                            bool3 = bool;
                        }
                        i27 += i9;
                        i28++;
                        i10 = i30;
                        i7 = i29;
                    }
                }
            } else {
                i3 = i2;
                i4 = i6;
            }
            bool2 = bool3;
            i16++;
            i15 = i3;
            i5 = i;
            i6 = i4;
            i10 = i10;
            i7 = i7;
        }
        Boolean bool4 = bool2;
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = Boolean.valueOf(bool4 == null ? false : bool4.booleanValue());
        }
    }

    private int write(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.onCommand + i; i9++) {
            byte[] bArr = this.MediaBrowserCompatMediaItem;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.IconCompatParcelizer[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += i10 >>> 24;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.onCommand + i11; i12++) {
            byte[] bArr2 = this.MediaBrowserCompatMediaItem;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.IconCompatParcelizer[bArr2[i12] & 255];
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15, types: [short] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private void IconCompatParcelizer(getWrappedPlayer getwrappedplayer) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        short s;
        onDeviceInfoChanged ondeviceinfochanged = this;
        if (getwrappedplayer != null) {
            ondeviceinfochanged.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.position(getwrappedplayer.read);
        }
        if (getwrappedplayer == null) {
            i2 = ondeviceinfochanged.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver;
            i = ondeviceinfochanged.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver;
        } else {
            i = getwrappedplayer.AudioAttributesImplBaseParcelizer;
            i2 = getwrappedplayer.IconCompatParcelizer;
        }
        int i6 = i2 * i;
        byte[] bArr = ondeviceinfochanged.MediaBrowserCompatMediaItem;
        if (bArr == null || bArr.length < i6) {
            ondeviceinfochanged.MediaBrowserCompatMediaItem = ondeviceinfochanged.RemoteActionCompatParcelizer.write(i6);
        }
        byte[] bArr2 = ondeviceinfochanged.MediaBrowserCompatMediaItem;
        if (ondeviceinfochanged.RatingCompat == null) {
            ondeviceinfochanged.RatingCompat = new short[4096];
        }
        short[] sArr = ondeviceinfochanged.RatingCompat;
        if (ondeviceinfochanged.onMediaButtonEvent == null) {
            ondeviceinfochanged.onMediaButtonEvent = new byte[4096];
        }
        byte[] bArr3 = ondeviceinfochanged.onMediaButtonEvent;
        if (ondeviceinfochanged.MediaDescriptionCompat == null) {
            ondeviceinfochanged.MediaDescriptionCompat = new byte[4097];
        }
        byte[] bArr4 = ondeviceinfochanged.MediaDescriptionCompat;
        int iRatingCompat = RatingCompat();
        int i7 = 1 << iRatingCompat;
        int i8 = i7 + 2;
        int i9 = iRatingCompat + 1;
        int i10 = (1 << i9) - 1;
        byte b = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = ondeviceinfochanged.write;
        int i12 = i9;
        int i13 = i8;
        int i14 = i10;
        int i15 = 0;
        int iAudioAttributesImplBaseParcelizer = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        while (true) {
            if (i15 >= i6) {
                break;
            }
            if (iAudioAttributesImplBaseParcelizer == 0) {
                iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                if (iAudioAttributesImplBaseParcelizer <= 0) {
                    ondeviceinfochanged.handleMediaPlayPauseIfPendingOnHandler = 3;
                    break;
                }
                i20 = b;
            }
            i19 += (bArr5[i20] & 255) << i17;
            i20++;
            iAudioAttributesImplBaseParcelizer--;
            int i23 = i17 + 8;
            int i24 = i18;
            int i25 = i22;
            int i26 = i12;
            int i27 = i13;
            while (true) {
                i3 = i9;
                if (i23 < i26) {
                    i4 = i8;
                    z = true;
                    i5 = i24;
                    break;
                }
                int i28 = i19 & i14;
                i19 >>= i26;
                i23 -= i26;
                if (i28 != i7) {
                    i4 = i8;
                    if (i28 == i7 + 1) {
                        i5 = i24;
                        z = true;
                        break;
                    }
                    if (i25 == -1) {
                        bArr2[i21] = bArr3[i28];
                        i21++;
                        i15++;
                        i24 = i28;
                        i25 = i24;
                        i9 = i3;
                        i8 = i4;
                    } else {
                        if (i28 >= i27) {
                            bArr4[i16] = (byte) i24;
                            i16++;
                            s = i25;
                        } else {
                            s = i28;
                        }
                        while (s >= i7) {
                            bArr4[i16] = bArr3[s];
                            i16++;
                            s = sArr[s];
                        }
                        int i29 = bArr3[s] & 255;
                        byte b2 = (byte) i29;
                        bArr2[i21] = b2;
                        while (true) {
                            i21++;
                            i15++;
                            if (i16 <= 0) {
                                break;
                            }
                            i16--;
                            bArr2[i21] = bArr4[i16];
                        }
                        if (i27 < 4096) {
                            sArr[i27] = (short) i25;
                            bArr3[i27] = b2;
                            i27++;
                            if ((i27 & i14) == 0 && i27 < 4096) {
                                i26++;
                                i14 += i27;
                            }
                        }
                        i25 = i28;
                        i9 = i3;
                        i8 = i4;
                        i24 = i29;
                    }
                } else {
                    i27 = i8;
                    i14 = i10;
                    i9 = i3;
                    i26 = i9;
                    i25 = -1;
                }
            }
            i17 = i23;
            i22 = i25;
            i8 = i4;
            b = 0;
            i13 = i27;
            i18 = i5;
            i9 = i3;
            ondeviceinfochanged = this;
            i12 = i26;
        }
        Arrays.fill(bArr2, i21, i6, b);
    }

    private int RatingCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get() & 255;
    }

    private int AudioAttributesImplBaseParcelizer() {
        int iRatingCompat = RatingCompat();
        if (iRatingCompat <= 0) {
            return iRatingCompat;
        }
        ByteBuffer byteBuffer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        byteBuffer.get(this.write, 0, Math.min(iRatingCompat, byteBuffer.remaining()));
        return iRatingCompat;
    }

    private Bitmap MediaBrowserCompatCustomActionResultReceiver() {
        Boolean bool = this.MediaBrowserCompatCustomActionResultReceiver;
        Bitmap bitmapAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.AudioAttributesCompatParcelizer);
        bitmapAudioAttributesCompatParcelizer.setHasAlpha(true);
        return bitmapAudioAttributesCompatParcelizer;
    }
}
