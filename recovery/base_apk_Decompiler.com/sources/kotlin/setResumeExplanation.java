package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class setResumeExplanation {
    private final byte[] IconCompatParcelizer;
    private final int read;
    private final OutputStream write;
    private int RemoteActionCompatParcelizer = 0;
    private int AudioAttributesCompatParcelizer = 0;

    static int AudioAttributesCompatParcelizer(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    private static int MediaBrowserCompatSearchResultReceiver(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private static int MediaMetadataCompat(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private static long RatingCompat(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int write(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private setResumeExplanation(OutputStream outputStream, byte[] bArr) {
        this.write = outputStream;
        this.IconCompatParcelizer = bArr;
        this.read = bArr.length;
    }

    public static setResumeExplanation read(OutputStream outputStream, int i) {
        return new setResumeExplanation(outputStream, new byte[i]);
    }

    public final void RemoteActionCompatParcelizer(double d) throws IOException {
        read(4, 1);
        AudioAttributesCompatParcelizer(d);
    }

    public final void RemoteActionCompatParcelizer(float f) throws IOException {
        read(3, 5);
        AudioAttributesCompatParcelizer(f);
    }

    public final void write(int i, int i2) throws IOException {
        read(i, 0);
        AudioAttributesImplApi26Parcelizer(i2);
    }

    public final void write(boolean z) throws IOException {
        read(3, 0);
        read(z);
    }

    public final void write(int i, BookReference bookReference) throws IOException {
        read(i, 3);
        read(bookReference);
        read(i, 4);
    }

    public final void IconCompatParcelizer(int i, BookReference bookReference) throws IOException {
        read(i, 2);
        AudioAttributesCompatParcelizer(bookReference);
    }

    public final void RemoteActionCompatParcelizer(int i, setVideoAspectRatio setvideoaspectratio) throws IOException {
        read(i, 2);
        AudioAttributesCompatParcelizer(setvideoaspectratio);
    }

    private void handleMediaPlayPauseIfPendingOnHandler(int i) throws IOException {
        read(2, 0);
        MediaDescriptionCompat(i);
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) throws IOException {
        read(i, 0);
        AudioAttributesImplBaseParcelizer(i2);
    }

    public final void AudioAttributesImplApi26Parcelizer(long j) throws IOException {
        read(2, 0);
        MediaBrowserCompatCustomActionResultReceiver(j);
    }

    public final void AudioAttributesCompatParcelizer(int i, BookReference bookReference) throws IOException {
        read(1, 3);
        handleMediaPlayPauseIfPendingOnHandler(i);
        IconCompatParcelizer(3, bookReference);
        read(1, 4);
    }

    public final void AudioAttributesCompatParcelizer(double d) throws IOException {
        MediaBrowserCompatMediaItem(Double.doubleToRawLongBits(d));
    }

    public final void AudioAttributesCompatParcelizer(float f) throws IOException {
        onCommand(Float.floatToRawIntBits(f));
    }

    public final void AudioAttributesImplApi21Parcelizer(long j) throws IOException {
        MediaBrowserCompatSearchResultReceiver(j);
    }

    public final void AudioAttributesImplBaseParcelizer(long j) throws IOException {
        MediaBrowserCompatSearchResultReceiver(j);
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) throws IOException {
        if (i >= 0) {
            MediaMetadataCompat(i);
        } else {
            MediaBrowserCompatSearchResultReceiver(i);
        }
    }

    public final void IconCompatParcelizer(long j) throws IOException {
        MediaBrowserCompatMediaItem(j);
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) throws IOException {
        onCommand(i);
    }

    public final void read(boolean z) throws IOException {
        onAddQueueItem(z ? 1 : 0);
    }

    public final void write(String str) throws IOException {
        byte[] bytes = str.getBytes(CharsetNames.UTF_8);
        MediaMetadataCompat(bytes.length);
        IconCompatParcelizer(bytes);
    }

    public final void read(BookReference bookReference) throws IOException {
        bookReference.IconCompatParcelizer(this);
    }

    public final void AudioAttributesCompatParcelizer(BookReference bookReference) throws IOException {
        MediaMetadataCompat(bookReference.AudioAttributesImplApi21Parcelizer());
        bookReference.IconCompatParcelizer(this);
    }

    public final void AudioAttributesCompatParcelizer(setVideoAspectRatio setvideoaspectratio) throws IOException {
        MediaMetadataCompat(setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver());
        IconCompatParcelizer(setvideoaspectratio);
    }

    public final void read(byte[] bArr) throws IOException {
        MediaMetadataCompat(bArr.length);
        IconCompatParcelizer(bArr);
    }

    public final void MediaDescriptionCompat(int i) throws IOException {
        MediaMetadataCompat(i);
    }

    public final void AudioAttributesImplBaseParcelizer(int i) throws IOException {
        AudioAttributesImplApi26Parcelizer(i);
    }

    public final void MediaBrowserCompatMediaItem(int i) throws IOException {
        onCommand(i);
    }

    public final void MediaBrowserCompatItemReceiver(long j) throws IOException {
        MediaBrowserCompatMediaItem(j);
    }

    public final void RatingCompat(int i) throws IOException {
        MediaMetadataCompat(MediaBrowserCompatSearchResultReceiver(i));
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(long j) throws IOException {
        MediaBrowserCompatSearchResultReceiver(RatingCompat(j));
    }

    public static int read() {
        return MediaBrowserCompatItemReceiver(4) + 8;
    }

    public static int write() {
        return MediaBrowserCompatItemReceiver(3) + 4;
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatItemReceiver(i) + read(i2);
    }

    public static int AudioAttributesCompatParcelizer() {
        return MediaBrowserCompatItemReceiver(3) + 1;
    }

    public static int read(int i, BookReference bookReference) {
        return MediaBrowserCompatItemReceiver(i) + write(bookReference);
    }

    public static int read(setVideoAspectRatio setvideoaspectratio) {
        return MediaBrowserCompatItemReceiver(6) + RemoteActionCompatParcelizer(setvideoaspectratio);
    }

    public static int IconCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatItemReceiver(i) + IconCompatParcelizer(i2);
    }

    public static int write(long j) {
        return MediaBrowserCompatItemReceiver(2) + AudioAttributesCompatParcelizer(j);
    }

    public static int RemoteActionCompatParcelizer(long j) {
        return MediaMetadataCompat(j);
    }

    public static int read(long j) {
        return MediaMetadataCompat(j);
    }

    public static int read(int i) {
        if (i >= 0) {
            return write(i);
        }
        return 10;
    }

    public static int read(String str) {
        try {
            byte[] bytes = str.getBytes(CharsetNames.UTF_8);
            return write(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int RemoteActionCompatParcelizer(BookReference bookReference) {
        return bookReference.AudioAttributesImplApi21Parcelizer();
    }

    public static int write(BookReference bookReference) {
        int iAudioAttributesImplApi21Parcelizer = bookReference.AudioAttributesImplApi21Parcelizer();
        return write(iAudioAttributesImplApi21Parcelizer) + iAudioAttributesImplApi21Parcelizer;
    }

    public static int write(newLessonSuggestionInstance newlessonsuggestioninstance) {
        int iAudioAttributesCompatParcelizer = newlessonsuggestioninstance.AudioAttributesCompatParcelizer();
        return write(iAudioAttributesCompatParcelizer) + iAudioAttributesCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
        return write(setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver()) + setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver();
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr) {
        return write(bArr.length) + bArr.length;
    }

    public static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return write(i);
    }

    public static int IconCompatParcelizer(int i) {
        return read(i);
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return write(MediaBrowserCompatSearchResultReceiver(i));
    }

    public static int AudioAttributesCompatParcelizer(long j) {
        return MediaMetadataCompat(RatingCompat(j));
    }

    private void RemoteActionCompatParcelizer() throws IOException {
        OutputStream outputStream = this.write;
        if (outputStream == null) {
            throw new write();
        }
        outputStream.write(this.IconCompatParcelizer, 0, this.AudioAttributesCompatParcelizer);
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final void IconCompatParcelizer() throws IOException {
        if (this.write != null) {
            RemoteActionCompatParcelizer();
        }
    }

    public static class write extends IOException {
        public write() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private void read(byte b) throws IOException {
        if (this.AudioAttributesCompatParcelizer == this.read) {
            RemoteActionCompatParcelizer();
        }
        byte[] bArr = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = i + 1;
        bArr[i] = b;
        this.RemoteActionCompatParcelizer++;
    }

    private void onAddQueueItem(int i) throws IOException {
        read((byte) i);
    }

    public final void IconCompatParcelizer(setVideoAspectRatio setvideoaspectratio) throws IOException {
        IconCompatParcelizer(setvideoaspectratio, setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver());
    }

    private void IconCompatParcelizer(byte[] bArr) throws IOException {
        write(bArr, bArr.length);
    }

    private void write(byte[] bArr, int i) throws IOException {
        int i2 = this.read;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = i2 - i3;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, this.IconCompatParcelizer, i3, i);
            this.AudioAttributesCompatParcelizer += i;
            this.RemoteActionCompatParcelizer += i;
            return;
        }
        System.arraycopy(bArr, 0, this.IconCompatParcelizer, i3, i4);
        int i5 = i - i4;
        this.AudioAttributesCompatParcelizer = this.read;
        this.RemoteActionCompatParcelizer += i4;
        RemoteActionCompatParcelizer();
        if (i5 <= this.read) {
            System.arraycopy(bArr, i4, this.IconCompatParcelizer, 0, i5);
            this.AudioAttributesCompatParcelizer = i5;
        } else {
            this.write.write(bArr, i4, i5);
        }
        this.RemoteActionCompatParcelizer += i5;
    }

    private void IconCompatParcelizer(setVideoAspectRatio setvideoaspectratio, int i) throws IOException {
        int i2 = this.read;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = i2 - i3;
        if (i4 >= i) {
            setvideoaspectratio.RemoteActionCompatParcelizer(this.IconCompatParcelizer, 0, i3, i);
            this.AudioAttributesCompatParcelizer += i;
            this.RemoteActionCompatParcelizer += i;
            return;
        }
        setvideoaspectratio.RemoteActionCompatParcelizer(this.IconCompatParcelizer, 0, i3, i4);
        int i5 = i - i4;
        this.AudioAttributesCompatParcelizer = this.read;
        this.RemoteActionCompatParcelizer += i4;
        RemoteActionCompatParcelizer();
        if (i5 <= this.read) {
            setvideoaspectratio.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i4, 0, i5);
            this.AudioAttributesCompatParcelizer = i5;
        } else {
            setvideoaspectratio.RemoteActionCompatParcelizer(this.write, i4, i5);
        }
        this.RemoteActionCompatParcelizer += i5;
    }

    public final void read(int i, int i2) throws IOException {
        MediaMetadataCompat(isRight.RemoteActionCompatParcelizer(i, i2));
    }

    public static int MediaBrowserCompatItemReceiver(int i) {
        return write(isRight.RemoteActionCompatParcelizer(i, 0));
    }

    public final void MediaMetadataCompat(int i) throws IOException {
        while ((i & (-128)) != 0) {
            onAddQueueItem((i & 127) | 128);
            i >>>= 7;
        }
        onAddQueueItem(i);
    }

    private void MediaBrowserCompatSearchResultReceiver(long j) throws IOException {
        while (((-128) & j) != 0) {
            onAddQueueItem((((int) j) & 127) | 128);
            j >>>= 7;
        }
        onAddQueueItem((int) j);
    }

    private void onCommand(int i) throws IOException {
        onAddQueueItem(i & 255);
        onAddQueueItem((i >> 8) & 255);
        onAddQueueItem((i >> 16) & 255);
        onAddQueueItem(i >>> 24);
    }

    private void MediaBrowserCompatMediaItem(long j) throws IOException {
        onAddQueueItem(((int) j) & 255);
        onAddQueueItem(((int) (j >> 8)) & 255);
        onAddQueueItem(((int) (j >> 16)) & 255);
        onAddQueueItem(((int) (j >> 24)) & 255);
        onAddQueueItem(((int) (j >> 32)) & 255);
        onAddQueueItem(((int) (j >> 40)) & 255);
        onAddQueueItem(((int) (j >> 48)) & 255);
        onAddQueueItem(((int) (j >> 56)) & 255);
    }
}
