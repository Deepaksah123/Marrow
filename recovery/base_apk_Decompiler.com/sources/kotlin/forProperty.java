package kotlin;

import com.marrow.data.models.ResponseError;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class forProperty {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private short[] MediaMetadataCompat;
    private final float RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private short[] handleMediaPlayPauseIfPendingOnHandler;
    private final float onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private final float onFastForward;
    private int onPlayFromMediaId;
    private final short[] read;
    private short[] write;

    public forProperty(int i, int i2, float f, float f2, int i3) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.onFastForward = f;
        this.RatingCompat = f2;
        this.onAddQueueItem = i / i3;
        this.AudioAttributesImplApi26Parcelizer = i / ResponseError.NO_INTERNET_ERROR;
        int i4 = i / 65;
        this.MediaBrowserCompatItemReceiver = i4;
        int i5 = i4 << 1;
        this.MediaBrowserCompatCustomActionResultReceiver = i5;
        this.read = new short[i5];
        int i6 = i5 * i2;
        this.write = new short[i6];
        this.MediaMetadataCompat = new short[i6];
        this.handleMediaPlayPauseIfPendingOnHandler = new short[i6];
    }

    public final int IconCompatParcelizer() {
        return (this.AudioAttributesCompatParcelizer * this.IconCompatParcelizer) << 1;
    }

    public final void IconCompatParcelizer(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.IconCompatParcelizer;
        int i2 = iRemaining / i;
        short[] sArr = read(this.write, this.AudioAttributesCompatParcelizer, i2);
        this.write = sArr;
        shortBuffer.get(sArr, this.AudioAttributesCompatParcelizer * this.IconCompatParcelizer, ((i * i2) << 1) / 2);
        this.AudioAttributesCompatParcelizer += i2;
        RemoteActionCompatParcelizer();
    }

    public final void read(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.IconCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        shortBuffer.put(this.MediaMetadataCompat, 0, this.IconCompatParcelizer * iMin);
        int i = this.MediaBrowserCompatSearchResultReceiver - iMin;
        this.MediaBrowserCompatSearchResultReceiver = i;
        short[] sArr = this.MediaMetadataCompat;
        int i2 = this.IconCompatParcelizer;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void write() {
        int i;
        int i2 = this.AudioAttributesCompatParcelizer;
        float f = this.onFastForward;
        float f2 = this.RatingCompat;
        int i3 = this.MediaBrowserCompatSearchResultReceiver + ((int) ((((i2 / (f / f2)) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) / (this.onAddQueueItem * f2)) + 0.5f));
        this.write = read(this.write, i2, (this.MediaBrowserCompatCustomActionResultReceiver << 1) + i2);
        int i4 = 0;
        while (true) {
            int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i6 = this.IconCompatParcelizer;
            i = i5 << 1;
            if (i4 >= i * i6) {
                break;
            }
            this.write[(i6 * i2) + i4] = 0;
            i4++;
        }
        this.AudioAttributesCompatParcelizer += i;
        RemoteActionCompatParcelizer();
        if (this.MediaBrowserCompatSearchResultReceiver > i3) {
            this.MediaBrowserCompatSearchResultReceiver = i3;
        }
        this.AudioAttributesCompatParcelizer = 0;
        this.onPlayFromMediaId = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.onPlayFromMediaId = 0;
        this.onCommand = 0;
        this.onCustomAction = 0;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    public final int AudioAttributesCompatParcelizer() {
        return (this.MediaBrowserCompatSearchResultReceiver * this.IconCompatParcelizer) << 1;
    }

    private short[] read(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.IconCompatParcelizer;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private void read(int i) {
        int i2 = this.AudioAttributesCompatParcelizer - i;
        short[] sArr = this.write;
        int i3 = this.IconCompatParcelizer;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.AudioAttributesCompatParcelizer = i2;
    }

    private void RemoteActionCompatParcelizer(short[] sArr, int i, int i2) {
        short[] sArr2 = read(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, i2);
        this.MediaMetadataCompat = sArr2;
        int i3 = this.IconCompatParcelizer;
        System.arraycopy(sArr, i * i3, sArr2, this.MediaBrowserCompatSearchResultReceiver * i3, i3 * i2);
        this.MediaBrowserCompatSearchResultReceiver += i2;
    }

    private int AudioAttributesCompatParcelizer(int i) {
        int iMin = Math.min(this.MediaBrowserCompatCustomActionResultReceiver, this.onPlayFromMediaId);
        RemoteActionCompatParcelizer(this.write, i, iMin);
        this.onPlayFromMediaId -= iMin;
        return iMin;
    }

    private void write(short[] sArr, int i, int i2) {
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver / i2;
        int i4 = this.IconCompatParcelizer;
        int i5 = i2 * i4;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                i7 += sArr[(i6 * i5) + (i * i4) + i8];
            }
            this.read[i6] = (short) (i7 / i5);
        }
    }

    private int AudioAttributesCompatParcelizer(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.IconCompatParcelizer;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.AudioAttributesImplApi21Parcelizer = i6 / i7;
        this.AudioAttributesImplBaseParcelizer = i8 / i5;
        return i7;
    }

    private boolean write(int i, int i2) {
        return i != 0 && this.onCommand != 0 && i2 <= i * 3 && (i << 1) > this.onCustomAction * 3;
    }

    private int read(short[] sArr, int i) {
        int iAudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.IconCompatParcelizer == 1 && i3 == 1) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(sArr, i, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
        } else {
            write(sArr, i, i3);
            int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(this.read, 0, this.AudioAttributesImplApi26Parcelizer / i3, this.MediaBrowserCompatItemReceiver / i3);
            if (i3 != 1) {
                int i4 = iAudioAttributesCompatParcelizer2 * i3;
                int i5 = i3 << 2;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.MediaBrowserCompatItemReceiver;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.IconCompatParcelizer == 1) {
                    iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(sArr, i, i6, i7);
                } else {
                    write(sArr, i, 1);
                    iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.read, 0, i6, i7);
                }
            } else {
                iAudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
            }
        }
        int i10 = write(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer) ? this.onCommand : iAudioAttributesCompatParcelizer;
        this.onCustomAction = this.AudioAttributesImplApi21Parcelizer;
        this.onCommand = iAudioAttributesCompatParcelizer;
        return i10;
    }

    private void IconCompatParcelizer(int i) {
        int i2 = this.MediaBrowserCompatSearchResultReceiver - i;
        short[] sArr = read(this.handleMediaPlayPauseIfPendingOnHandler, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i2);
        this.handleMediaPlayPauseIfPendingOnHandler = sArr;
        short[] sArr2 = this.MediaMetadataCompat;
        int i3 = this.IconCompatParcelizer;
        System.arraycopy(sArr2, i * i3, sArr, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver * i3, i3 * i2);
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver += i2;
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.handleMediaPlayPauseIfPendingOnHandler;
        int i2 = this.IconCompatParcelizer;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver - i) * i2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= i;
    }

    private short read(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.IconCompatParcelizer];
        int i4 = this.MediaBrowserCompatMediaItem;
        int i5 = this.MediaDescriptionCompat;
        int i6 = (i5 + 1) * i3;
        int i7 = i6 - (i4 * i2);
        int i8 = i6 - (i5 * i3);
        return (short) (((s * i7) + ((i8 - i7) * s2)) / i8);
    }

    private void AudioAttributesCompatParcelizer(float f, int i) {
        int i2;
        int i3;
        if (this.MediaBrowserCompatSearchResultReceiver == i) {
            return;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        IconCompatParcelizer(i);
        int i6 = 0;
        while (true) {
            int i7 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver - 1;
            if (i6 < i7) {
                while (true) {
                    int i8 = this.MediaDescriptionCompat;
                    i2 = this.MediaBrowserCompatMediaItem;
                    i3 = i8 + 1;
                    if (i3 * i5 <= i2 * i4) {
                        break;
                    }
                    this.MediaMetadataCompat = read(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.IconCompatParcelizer;
                        if (i9 < i10) {
                            this.MediaMetadataCompat[(this.MediaBrowserCompatSearchResultReceiver * i10) + i9] = read(this.handleMediaPlayPauseIfPendingOnHandler, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.MediaBrowserCompatMediaItem++;
                    this.MediaBrowserCompatSearchResultReceiver++;
                }
                this.MediaDescriptionCompat = i3;
                if (i3 == i4) {
                    this.MediaDescriptionCompat = 0;
                    buildTypeSerializer.write(i2 == i5);
                    this.MediaBrowserCompatMediaItem = 0;
                }
                i6++;
            } else {
                RemoteActionCompatParcelizer(i7);
                return;
            }
        }
    }

    private int IconCompatParcelizer(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.onPlayFromMediaId = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArr2 = read(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, i3);
        this.MediaMetadataCompat = sArr2;
        RemoteActionCompatParcelizer(i3, this.IconCompatParcelizer, sArr2, this.MediaBrowserCompatSearchResultReceiver, sArr, i, sArr, i + i2);
        this.MediaBrowserCompatSearchResultReceiver += i3;
        return i3;
    }

    private int read(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.onPlayFromMediaId = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArr2 = read(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, i4);
        this.MediaMetadataCompat = sArr2;
        int i5 = this.IconCompatParcelizer;
        System.arraycopy(sArr, i * i5, sArr2, this.MediaBrowserCompatSearchResultReceiver * i5, i5 * i2);
        RemoteActionCompatParcelizer(i3, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver + i2, sArr, i + i2, sArr, i);
        this.MediaBrowserCompatSearchResultReceiver += i4;
        return i3;
    }

    private void IconCompatParcelizer(float f) {
        int iIconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        if (i < this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        int i2 = 0;
        do {
            if (this.onPlayFromMediaId > 0) {
                iIconCompatParcelizer = AudioAttributesCompatParcelizer(i2);
            } else {
                int i3 = read(this.write, i2);
                if (f > 1.0d) {
                    iIconCompatParcelizer = i3 + IconCompatParcelizer(this.write, i2, f, i3);
                } else {
                    iIconCompatParcelizer = read(this.write, i2, f, i3);
                }
            }
            i2 += iIconCompatParcelizer;
        } while (this.MediaBrowserCompatCustomActionResultReceiver + i2 <= i);
        read(i2);
    }

    private void RemoteActionCompatParcelizer() {
        int i = this.MediaBrowserCompatSearchResultReceiver;
        float f = this.onFastForward;
        float f2 = this.RatingCompat;
        float f3 = f / f2;
        float f4 = this.onAddQueueItem * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            IconCompatParcelizer(f3);
        } else {
            RemoteActionCompatParcelizer(this.write, 0, this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = 0;
        }
        if (f4 != 1.0f) {
            AudioAttributesCompatParcelizer(f4, i);
        }
    }

    private static void RemoteActionCompatParcelizer(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
