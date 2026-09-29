package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.BookReference;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class setSlidesCount {
    private int AudioAttributesCompatParcelizer;
    private final InputStream AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private boolean AudioAttributesImplApi26Parcelizer = false;
    private int MediaBrowserCompatCustomActionResultReceiver = Integer.MAX_VALUE;
    private int MediaBrowserCompatSearchResultReceiver = 64;
    private int MediaBrowserCompatMediaItem = 67108864;
    private read MediaMetadataCompat = null;
    private final byte[] IconCompatParcelizer = new byte[4096];
    private int write = 0;
    private int read = 0;
    private int MediaDescriptionCompat = 0;
    private final boolean RemoteActionCompatParcelizer = false;

    interface read {
    }

    private static long read(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    private static int write(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static setSlidesCount write(InputStream inputStream) {
        return new setSlidesCount(inputStream);
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() throws IOException {
        if (onPlayFromMediaId()) {
            this.AudioAttributesImplBaseParcelizer = 0;
            return 0;
        }
        int iMediaMetadataCompat = MediaMetadataCompat();
        this.AudioAttributesImplBaseParcelizer = iMediaMetadataCompat;
        if (isRight.AudioAttributesCompatParcelizer(iMediaMetadataCompat) == 0) {
            throw LessonTabItem.read();
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void IconCompatParcelizer(int i) throws LessonTabItem {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            throw LessonTabItem.IconCompatParcelizer();
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i, setResumeExplanation setresumeexplanation) throws IOException {
        int iRemoteActionCompatParcelizer = isRight.RemoteActionCompatParcelizer(i);
        if (iRemoteActionCompatParcelizer == 0) {
            long jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            setresumeexplanation.MediaMetadataCompat(i);
            setresumeexplanation.AudioAttributesImplApi21Parcelizer(jAudioAttributesImplBaseParcelizer);
            return true;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            long jOnMediaButtonEvent = onMediaButtonEvent();
            setresumeexplanation.MediaMetadataCompat(i);
            setresumeexplanation.IconCompatParcelizer(jOnMediaButtonEvent);
            return true;
        }
        if (iRemoteActionCompatParcelizer == 2) {
            setVideoAspectRatio setvideoaspectratioRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            setresumeexplanation.MediaMetadataCompat(i);
            setresumeexplanation.AudioAttributesCompatParcelizer(setvideoaspectratioRemoteActionCompatParcelizer);
            return true;
        }
        if (iRemoteActionCompatParcelizer == 3) {
            setresumeexplanation.MediaMetadataCompat(i);
            read(setresumeexplanation);
            int iRemoteActionCompatParcelizer2 = isRight.RemoteActionCompatParcelizer(isRight.AudioAttributesCompatParcelizer(i), 4);
            IconCompatParcelizer(iRemoteActionCompatParcelizer2);
            setresumeexplanation.MediaMetadataCompat(iRemoteActionCompatParcelizer2);
            return true;
        }
        if (iRemoteActionCompatParcelizer == 4) {
            return false;
        }
        if (iRemoteActionCompatParcelizer == 5) {
            int iOnPause = onPause();
            setresumeexplanation.MediaMetadataCompat(i);
            setresumeexplanation.AudioAttributesImplApi21Parcelizer(iOnPause);
            return true;
        }
        throw LessonTabItem.AudioAttributesCompatParcelizer();
    }

    private void read(setResumeExplanation setresumeexplanation) throws IOException {
        int iHandleMediaPlayPauseIfPendingOnHandler;
        do {
            iHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (iHandleMediaPlayPauseIfPendingOnHandler == 0) {
                return;
            }
        } while (RemoteActionCompatParcelizer(iHandleMediaPlayPauseIfPendingOnHandler, setresumeexplanation));
    }

    public final double IconCompatParcelizer() throws IOException {
        return Double.longBitsToDouble(onMediaButtonEvent());
    }

    public final float AudioAttributesImplApi21Parcelizer() throws IOException {
        return Float.intBitsToFloat(onPause());
    }

    public final long onAddQueueItem() throws IOException {
        return onFastForward();
    }

    public final long AudioAttributesImplBaseParcelizer() throws IOException {
        return onFastForward();
    }

    public final int AudioAttributesImplApi26Parcelizer() throws IOException {
        return MediaMetadataCompat();
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        return onMediaButtonEvent();
    }

    public final int MediaBrowserCompatItemReceiver() throws IOException {
        return onPause();
    }

    public final boolean read() throws IOException {
        return onFastForward() != 0;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        int iMediaMetadataCompat = MediaMetadataCompat();
        int i = this.write;
        int i2 = this.read;
        if (iMediaMetadataCompat > i - i2 || iMediaMetadataCompat <= 0) {
            if (iMediaMetadataCompat == 0) {
                return "";
            }
            return new String(AudioAttributesImplBaseParcelizer(iMediaMetadataCompat), CharsetNames.UTF_8);
        }
        String str = new String(this.IconCompatParcelizer, i2, iMediaMetadataCompat, CharsetNames.UTF_8);
        this.read += iMediaMetadataCompat;
        return str;
    }

    public final void read(int i, BookReference.write writeVar, setStepType setsteptype) throws IOException {
        int i2 = this.MediaBrowserCompatItemReceiver;
        if (i2 >= this.MediaBrowserCompatSearchResultReceiver) {
            throw LessonTabItem.MediaBrowserCompatCustomActionResultReceiver();
        }
        this.MediaBrowserCompatItemReceiver = i2 + 1;
        writeVar.read(this, setsteptype);
        IconCompatParcelizer(isRight.RemoteActionCompatParcelizer(i, 4));
        this.MediaBrowserCompatItemReceiver--;
    }

    public final void IconCompatParcelizer(BookReference.write writeVar, setStepType setsteptype) throws IOException {
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (this.MediaBrowserCompatItemReceiver >= this.MediaBrowserCompatSearchResultReceiver) {
            throw LessonTabItem.MediaBrowserCompatCustomActionResultReceiver();
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iMediaMetadataCompat);
        this.MediaBrowserCompatItemReceiver++;
        writeVar.read(this, setsteptype);
        IconCompatParcelizer(0);
        this.MediaBrowserCompatItemReceiver--;
        AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
    }

    public final <T extends BookReference> T RemoteActionCompatParcelizer(getParentMcqId<T> getparentmcqid, setStepType setsteptype) throws IOException {
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (this.MediaBrowserCompatItemReceiver >= this.MediaBrowserCompatSearchResultReceiver) {
            throw LessonTabItem.MediaBrowserCompatCustomActionResultReceiver();
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iMediaMetadataCompat);
        this.MediaBrowserCompatItemReceiver++;
        T tRemoteActionCompatParcelizer = getparentmcqid.RemoteActionCompatParcelizer(this, setsteptype);
        IconCompatParcelizer(0);
        this.MediaBrowserCompatItemReceiver--;
        AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
        return tRemoteActionCompatParcelizer;
    }

    public final setVideoAspectRatio RemoteActionCompatParcelizer() throws IOException {
        int iMediaMetadataCompat = MediaMetadataCompat();
        int i = this.write;
        int i2 = this.read;
        if (iMediaMetadataCompat > i - i2 || iMediaMetadataCompat <= 0) {
            if (iMediaMetadataCompat == 0) {
                return setVideoAspectRatio.write;
            }
            return new MagicModuleTimeline(AudioAttributesImplBaseParcelizer(iMediaMetadataCompat));
        }
        setVideoAspectRatio setvideoaspectratioWrite = setVideoAspectRatio.write(this.IconCompatParcelizer, i2, iMediaMetadataCompat);
        this.read += iMediaMetadataCompat;
        return setvideoaspectratioWrite;
    }

    public final int onCustomAction() throws IOException {
        return MediaMetadataCompat();
    }

    public final int write() throws IOException {
        return MediaMetadataCompat();
    }

    public final int RatingCompat() throws IOException {
        return onPause();
    }

    public final long MediaDescriptionCompat() throws IOException {
        return onMediaButtonEvent();
    }

    public final int MediaBrowserCompatSearchResultReceiver() throws IOException {
        return write(MediaMetadataCompat());
    }

    public final long MediaBrowserCompatMediaItem() throws IOException {
        return read(onFastForward());
    }

    public final int MediaMetadataCompat() throws IOException {
        int i;
        int i2 = this.read;
        int i3 = this.write;
        if (i3 != i2) {
            byte[] bArr = this.IconCompatParcelizer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.read = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.read = i5;
                return i;
            }
        }
        return (int) onPlayFromUri();
    }

    public static int RemoteActionCompatParcelizer(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw LessonTabItem.AudioAttributesImplBaseParcelizer();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw LessonTabItem.AudioAttributesImplBaseParcelizer();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw LessonTabItem.RemoteActionCompatParcelizer();
    }

    private long onFastForward() throws IOException {
        int i;
        long j;
        long j2;
        long j3;
        int i2 = this.read;
        int i3 = this.write;
        if (i3 != i2) {
            byte[] bArr = this.IconCompatParcelizer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.read = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                long j4 = (bArr[i4] << 7) ^ b;
                if (j4 >= 0) {
                    i = i2 + 3;
                    long j5 = j4 ^ ((long) (bArr[i5] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i5 = i2 + 4;
                        j4 = j5 ^ ((long) (bArr[i] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i = i2 + 5;
                            j5 = j4 ^ (((long) bArr[i5]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i2 + 6;
                                j4 = j5 ^ (((long) bArr[i]) << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i = i2 + 7;
                                    j5 = j4 ^ (((long) bArr[i5]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j4 = j5 ^ (((long) bArr[i]) << 49);
                                        if (j4 >= 0) {
                                            i = i2 + 9;
                                            long j6 = (j4 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                int i6 = i2 + 10;
                                                if (bArr[i] >= 0) {
                                                    i = i6;
                                                }
                                            }
                                            j = j6;
                                            this.read = i;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    j = j3 ^ j5;
                    this.read = i;
                    return j;
                }
                j2 = -128;
                i = i5;
                j = j4 ^ j2;
                this.read = i;
                return j;
            }
        }
        return onPlayFromUri();
    }

    private long onPlayFromUri() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bOnPlay = onPlay();
            j |= ((long) (bOnPlay & 127)) << i;
            if ((bOnPlay & 128) == 0) {
                return j;
            }
        }
        throw LessonTabItem.RemoteActionCompatParcelizer();
    }

    private int onPause() throws IOException {
        int i = this.read;
        if (this.write - i < 4) {
            MediaBrowserCompatItemReceiver(4);
            i = this.read;
        }
        byte[] bArr = this.IconCompatParcelizer;
        this.read = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private long onMediaButtonEvent() throws IOException {
        int i = this.read;
        if (this.write - i < 8) {
            MediaBrowserCompatItemReceiver(8);
            i = this.read;
        }
        byte[] bArr = this.IconCompatParcelizer;
        this.read = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        return ((((long) bArr[i + 7]) & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    private setSlidesCount(InputStream inputStream) {
        this.AudioAttributesImplApi21Parcelizer = inputStream;
    }

    public final int RemoteActionCompatParcelizer(int i) throws LessonTabItem {
        if (i < 0) {
            throw LessonTabItem.write();
        }
        int i2 = i + this.MediaDescriptionCompat + this.read;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i2 > i3) {
            throw LessonTabItem.AudioAttributesImplBaseParcelizer();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        onCommand();
        return i3;
    }

    private void onCommand() {
        int i = this.write + this.AudioAttributesCompatParcelizer;
        this.write = i;
        int i2 = this.MediaDescriptionCompat + i;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.AudioAttributesCompatParcelizer = i4;
            this.write = i - i4;
            return;
        }
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        onCommand();
    }

    public final int AudioAttributesCompatParcelizer() {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.MediaDescriptionCompat + this.read);
    }

    private boolean onPlayFromMediaId() throws IOException {
        return this.read == this.write && !MediaBrowserCompatCustomActionResultReceiver(1);
    }

    private void read(int i) throws IOException {
        if (this.write - this.read < i) {
            MediaBrowserCompatItemReceiver(i);
        }
    }

    private void MediaBrowserCompatItemReceiver(int i) throws IOException {
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            throw LessonTabItem.AudioAttributesImplBaseParcelizer();
        }
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(int i) throws IOException {
        int i2 = this.read;
        int i3 = i2 + i;
        int i4 = this.write;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.MediaDescriptionCompat + i2 + i <= this.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi21Parcelizer != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.IconCompatParcelizer;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.MediaDescriptionCompat += i2;
                this.write -= i2;
                this.read = 0;
            }
            InputStream inputStream = this.AudioAttributesImplApi21Parcelizer;
            byte[] bArr2 = this.IconCompatParcelizer;
            int i5 = this.write;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.IconCompatParcelizer.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.write += i6;
                if ((this.MediaDescriptionCompat + i) - this.MediaBrowserCompatMediaItem > 0) {
                    throw LessonTabItem.AudioAttributesImplApi21Parcelizer();
                }
                onCommand();
                if (this.write >= i) {
                    return true;
                }
                return MediaBrowserCompatCustomActionResultReceiver(i);
            }
        }
        return false;
    }

    private byte onPlay() throws IOException {
        if (this.read == this.write) {
            MediaBrowserCompatItemReceiver(1);
        }
        byte[] bArr = this.IconCompatParcelizer;
        int i = this.read;
        this.read = i + 1;
        return bArr[i];
    }

    private byte[] AudioAttributesImplBaseParcelizer(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return LessonSpinnerItem.RemoteActionCompatParcelizer;
            }
            throw LessonTabItem.write();
        }
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.read;
        int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i2 + i3 + i > i4) {
            AudioAttributesImplApi26Parcelizer((i4 - i2) - i3);
            throw LessonTabItem.AudioAttributesImplBaseParcelizer();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i5 = this.write - i3;
            System.arraycopy(this.IconCompatParcelizer, i3, bArr, 0, i5);
            this.read = this.write;
            int i6 = i - i5;
            read(i6);
            System.arraycopy(this.IconCompatParcelizer, 0, bArr, i5, i6);
            this.read = i6;
            return bArr;
        }
        int i7 = this.write;
        this.MediaDescriptionCompat = i2 + i7;
        this.read = 0;
        this.write = 0;
        int length = i7 - i3;
        int i8 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i8 > 0) {
            int iMin = Math.min(i8, 4096);
            byte[] bArr2 = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                InputStream inputStream = this.AudioAttributesImplApi21Parcelizer;
                int i10 = inputStream == null ? -1 : inputStream.read(bArr2, i9, iMin - i9);
                if (i10 == -1) {
                    throw LessonTabItem.AudioAttributesImplBaseParcelizer();
                }
                this.MediaDescriptionCompat += i10;
                i9 += i10;
            }
            i8 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.IconCompatParcelizer, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    private void AudioAttributesImplApi26Parcelizer(int i) throws IOException {
        int i2 = this.write;
        int i3 = this.read;
        if (i <= i2 - i3 && i >= 0) {
            this.read = i3 + i;
        } else {
            AudioAttributesImplApi21Parcelizer(i);
        }
    }

    private void AudioAttributesImplApi21Parcelizer(int i) throws IOException {
        if (i < 0) {
            throw LessonTabItem.write();
        }
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.read;
        int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i2 + i3 + i > i4) {
            AudioAttributesImplApi26Parcelizer((i4 - i2) - i3);
            throw LessonTabItem.AudioAttributesImplBaseParcelizer();
        }
        int i5 = this.write;
        int i6 = i5 - i3;
        this.read = i5;
        MediaBrowserCompatItemReceiver(1);
        while (true) {
            int i7 = i - i6;
            int i8 = this.write;
            if (i7 > i8) {
                i6 += i8;
                this.read = i8;
                MediaBrowserCompatItemReceiver(1);
            } else {
                this.read = i7;
                return;
            }
        }
    }
}
