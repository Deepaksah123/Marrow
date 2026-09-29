package kotlin;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.copyWithKeySetId;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DownloadManager extends getTransferListener {
    private static final Logger RemoteActionCompatParcelizer = Logger.getLogger(DownloadManager.class.getName());
    private static final boolean read = DownloadProgress.read();
    private boolean IconCompatParcelizer;
    r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ write;

    public static int AudioAttributesCompatParcelizer() {
        return 4;
    }

    public static int AudioAttributesImplApi26Parcelizer() {
        return 8;
    }

    public static int AudioAttributesImplBaseParcelizer() {
        return 4;
    }

    public static int MediaBrowserCompatCustomActionResultReceiver() {
        return 4;
    }

    private static long MediaBrowserCompatItemReceiver(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int MediaMetadataCompat(int i) {
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

    public static int RemoteActionCompatParcelizer() {
        return 8;
    }

    private static int onCustomAction(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static int read() {
        return 8;
    }

    public static int write() {
        return 1;
    }

    public static int write(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void AudioAttributesCompatParcelizer(byte b) throws IOException;

    public abstract void AudioAttributesCompatParcelizer(int i, String str) throws IOException;

    public abstract void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException;

    public abstract void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException;

    public abstract void AudioAttributesImplBaseParcelizer(long j) throws IOException;

    public abstract void IconCompatParcelizer(int i, DownloadIndex downloadIndex) throws IOException;

    public abstract void IconCompatParcelizer(DownloadIndex downloadIndex) throws IOException;

    public abstract void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException;

    public abstract void MediaBrowserCompatItemReceiver(int i, long j) throws IOException;

    public abstract void MediaBrowserCompatMediaItem(int i) throws IOException;

    public abstract void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) throws IOException;

    public abstract int MediaDescriptionCompat();

    public abstract void MediaDescriptionCompat(int i, int i2) throws IOException;

    public abstract void RemoteActionCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException;

    abstract void RemoteActionCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) throws IOException;

    public abstract void RemoteActionCompatParcelizer(String str) throws IOException;

    abstract void RemoteActionCompatParcelizer(byte[] bArr, int i) throws IOException;

    public abstract void onAddQueueItem(int i) throws IOException;

    public abstract void read(int i, boolean z) throws IOException;

    public abstract void read(long j) throws IOException;

    public abstract void read(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException;

    public abstract void write(int i, long j) throws IOException;

    public abstract void write(int i, DownloadIndex downloadIndex) throws IOException;

    /* synthetic */ DownloadManager(byte b) {
        this();
    }

    public static DownloadManager read(byte[] bArr) {
        return AudioAttributesCompatParcelizer(bArr, bArr.length);
    }

    private static DownloadManager AudioAttributesCompatParcelizer(byte[] bArr, int i) {
        return new RemoteActionCompatParcelizer(bArr, 0, i);
    }

    final boolean AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    private DownloadManager() {
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, int i2) throws IOException {
        MediaDescriptionCompat(i, onCustomAction(i2));
    }

    public final void MediaBrowserCompatItemReceiver(int i, int i2) throws IOException {
        AudioAttributesImplBaseParcelizer(i, i2);
    }

    public final void RemoteActionCompatParcelizer(int i, long j) throws IOException {
        MediaBrowserCompatItemReceiver(i, j);
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, long j) throws IOException {
        MediaBrowserCompatItemReceiver(i, MediaBrowserCompatItemReceiver(j));
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i, long j) throws IOException {
        write(i, j);
    }

    public final void RemoteActionCompatParcelizer(int i, float f) throws IOException {
        AudioAttributesImplBaseParcelizer(i, Float.floatToRawIntBits(f));
    }

    public final void read(int i, double d) throws IOException {
        write(i, Double.doubleToRawLongBits(d));
    }

    public final void read(int i, int i2) throws IOException {
        AudioAttributesImplApi21Parcelizer(i, i2);
    }

    public final void onCommand(int i) throws IOException {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onCustomAction(i));
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(int i) throws IOException {
        MediaBrowserCompatMediaItem(i);
    }

    public final void RemoteActionCompatParcelizer(long j) throws IOException {
        AudioAttributesImplBaseParcelizer(j);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(long j) throws IOException {
        AudioAttributesImplBaseParcelizer(MediaBrowserCompatItemReceiver(j));
    }

    public final void AudioAttributesImplApi26Parcelizer(long j) throws IOException {
        read(j);
    }

    public final void read(float f) throws IOException {
        MediaBrowserCompatMediaItem(Float.floatToRawIntBits(f));
    }

    public final void RemoteActionCompatParcelizer(double d) throws IOException {
        read(Double.doubleToRawLongBits(d));
    }

    public final void read(boolean z) throws IOException {
        AudioAttributesCompatParcelizer(z ? (byte) 1 : (byte) 0);
    }

    public final void MediaDescriptionCompat(int i) throws IOException {
        onAddQueueItem(i);
    }

    public final void IconCompatParcelizer(byte[] bArr) throws IOException {
        RemoteActionCompatParcelizer(bArr, bArr.length);
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + AudioAttributesImplApi26Parcelizer(i2);
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + MediaMetadataCompat(i2);
    }

    public static int write(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + RatingCompat(i2);
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int AudioAttributesImplApi21Parcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int read(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + IconCompatParcelizer(j);
    }

    public static int AudioAttributesCompatParcelizer(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + write(j);
    }

    public static int IconCompatParcelizer(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + AudioAttributesCompatParcelizer(j);
    }

    public static int read(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int MediaBrowserCompatItemReceiver(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int AudioAttributesImplBaseParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int write(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 1;
    }

    public static int IconCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + IconCompatParcelizer(i2);
    }

    public static int IconCompatParcelizer(int i, String str) {
        return MediaBrowserCompatSearchResultReceiver(i) + write(str);
    }

    public static int AudioAttributesCompatParcelizer(int i, DownloadIndex downloadIndex) {
        return MediaBrowserCompatSearchResultReceiver(i) + AudioAttributesCompatParcelizer(downloadIndex);
    }

    public static int write(int i, isWaitingForRequirements iswaitingforrequirements) {
        return MediaBrowserCompatSearchResultReceiver(i) + AudioAttributesCompatParcelizer(iswaitingforrequirements);
    }

    private static int AudioAttributesCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return MediaBrowserCompatSearchResultReceiver(3) + RemoteActionCompatParcelizer(downloadManagerExternalSyntheticLambda0);
    }

    static int write(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) {
        return MediaBrowserCompatSearchResultReceiver(i) + write(downloadManagerExternalSyntheticLambda0, setnotmetrequirements);
    }

    public static int write(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + AudioAttributesCompatParcelizer(downloadManagerExternalSyntheticLambda0);
    }

    public static int RemoteActionCompatParcelizer(int i, DownloadIndex downloadIndex) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + AudioAttributesCompatParcelizer(3, downloadIndex);
    }

    public static int AudioAttributesCompatParcelizer(int i, isWaitingForRequirements iswaitingforrequirements) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + write(3, iswaitingforrequirements);
    }

    public static int MediaBrowserCompatSearchResultReceiver(int i) {
        return MediaMetadataCompat(DownloadRequest.read(i, 0));
    }

    public static int AudioAttributesImplApi26Parcelizer(int i) {
        if (i >= 0) {
            return MediaMetadataCompat(i);
        }
        return 10;
    }

    public static int RatingCompat(int i) {
        return MediaMetadataCompat(onCustomAction(i));
    }

    public static int IconCompatParcelizer(long j) {
        return write(j);
    }

    public static int AudioAttributesCompatParcelizer(long j) {
        return write(MediaBrowserCompatItemReceiver(j));
    }

    public static int IconCompatParcelizer(int i) {
        return AudioAttributesImplApi26Parcelizer(i);
    }

    public static int write(String str) {
        int length;
        try {
            length = copyWithKeySetId.RemoteActionCompatParcelizer(str);
        } catch (copyWithKeySetId.write unused) {
            length = str.getBytes(getDownloadIndex.IconCompatParcelizer).length;
        }
        return MediaBrowserCompatCustomActionResultReceiver(length);
    }

    public static int AudioAttributesCompatParcelizer(isWaitingForRequirements iswaitingforrequirements) {
        return MediaBrowserCompatCustomActionResultReceiver(iswaitingforrequirements.IconCompatParcelizer());
    }

    public static int AudioAttributesCompatParcelizer(DownloadIndex downloadIndex) {
        return MediaBrowserCompatCustomActionResultReceiver(downloadIndex.write());
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr) {
        return MediaBrowserCompatCustomActionResultReceiver(bArr.length);
    }

    public static int RemoteActionCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return MediaBrowserCompatCustomActionResultReceiver(downloadManagerExternalSyntheticLambda0.onRemoveQueueItem());
    }

    static int write(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) {
        return MediaBrowserCompatCustomActionResultReceiver(((r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I) downloadManagerExternalSyntheticLambda0).RemoteActionCompatParcelizer(setnotmetrequirements));
    }

    static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return MediaMetadataCompat(i) + i;
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (MediaDescriptionCompat() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class write extends IOException {
        public write() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        write(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public write(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }
    }

    final void read(String str, copyWithKeySetId.write writeVar) throws IOException {
        RemoteActionCompatParcelizer.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) writeVar);
        byte[] bytes = str.getBytes(getDownloadIndex.IconCompatParcelizer);
        try {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(bytes.length);
            read(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new write(e);
        }
    }

    @Deprecated
    public final void AudioAttributesCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException {
        MediaBrowserCompatCustomActionResultReceiver(i, 3);
        write(downloadManagerExternalSyntheticLambda0);
        MediaBrowserCompatCustomActionResultReceiver(i, 4);
    }

    @Deprecated
    final void AudioAttributesCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) throws IOException {
        MediaBrowserCompatCustomActionResultReceiver(i, 3);
        RemoteActionCompatParcelizer(downloadManagerExternalSyntheticLambda0, setnotmetrequirements);
        MediaBrowserCompatCustomActionResultReceiver(i, 4);
    }

    @Deprecated
    public final void write(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException {
        downloadManagerExternalSyntheticLambda0.write(this);
    }

    @Deprecated
    private void RemoteActionCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) throws IOException {
        setnotmetrequirements.AudioAttributesCompatParcelizer(downloadManagerExternalSyntheticLambda0, this.write);
    }

    @Deprecated
    static int IconCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) {
        return (MediaBrowserCompatSearchResultReceiver(i) << 1) + IconCompatParcelizer(downloadManagerExternalSyntheticLambda0, setnotmetrequirements);
    }

    @Deprecated
    public static int IconCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return downloadManagerExternalSyntheticLambda0.onRemoveQueueItem();
    }

    @Deprecated
    private static int IconCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) {
        return ((r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I) downloadManagerExternalSyntheticLambda0).RemoteActionCompatParcelizer(setnotmetrequirements);
    }

    static class RemoteActionCompatParcelizer extends DownloadManager {
        private final int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final byte[] RemoteActionCompatParcelizer;
        private final int read;

        RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.RemoteActionCompatParcelizer = bArr;
            this.AudioAttributesCompatParcelizer = 0;
            this.IconCompatParcelizer = 0;
            this.read = i2;
        }

        @Override // kotlin.DownloadManager
        public final void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(DownloadRequest.read(i, i2));
        }

        @Override // kotlin.DownloadManager
        public final void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 0);
            onAddQueueItem(i2);
        }

        @Override // kotlin.DownloadManager
        public final void MediaDescriptionCompat(int i, int i2) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 0);
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i2);
        }

        @Override // kotlin.DownloadManager
        public final void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 5);
            MediaBrowserCompatMediaItem(i2);
        }

        @Override // kotlin.DownloadManager
        public final void MediaBrowserCompatItemReceiver(int i, long j) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 0);
            AudioAttributesImplBaseParcelizer(j);
        }

        @Override // kotlin.DownloadManager
        public final void write(int i, long j) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 1);
            read(j);
        }

        @Override // kotlin.DownloadManager
        public final void read(int i, boolean z) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 0);
            AudioAttributesCompatParcelizer(z ? (byte) 1 : (byte) 0);
        }

        @Override // kotlin.DownloadManager
        public final void AudioAttributesCompatParcelizer(int i, String str) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 2);
            RemoteActionCompatParcelizer(str);
        }

        @Override // kotlin.DownloadManager
        public final void IconCompatParcelizer(int i, DownloadIndex downloadIndex) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 2);
            IconCompatParcelizer(downloadIndex);
        }

        @Override // kotlin.DownloadManager
        public final void IconCompatParcelizer(DownloadIndex downloadIndex) throws IOException {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(downloadIndex.write());
            downloadIndex.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.DownloadManager
        public final void RemoteActionCompatParcelizer(byte[] bArr, int i) throws IOException {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i);
            AudioAttributesCompatParcelizer(bArr, 0, i);
        }

        private void AudioAttributesCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(3, 2);
            read(downloadManagerExternalSyntheticLambda0);
        }

        @Override // kotlin.DownloadManager
        final void RemoteActionCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, setNotMetRequirements setnotmetrequirements) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(i, 2);
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(((r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I) downloadManagerExternalSyntheticLambda0).RemoteActionCompatParcelizer(setnotmetrequirements));
            setnotmetrequirements.AudioAttributesCompatParcelizer(downloadManagerExternalSyntheticLambda0, this.write);
        }

        @Override // kotlin.DownloadManager
        public final void RemoteActionCompatParcelizer(int i, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(1, 3);
            MediaDescriptionCompat(2, i);
            AudioAttributesCompatParcelizer(downloadManagerExternalSyntheticLambda0);
            MediaBrowserCompatCustomActionResultReceiver(1, 4);
        }

        @Override // kotlin.DownloadManager
        public final void write(int i, DownloadIndex downloadIndex) throws IOException {
            MediaBrowserCompatCustomActionResultReceiver(1, 3);
            MediaDescriptionCompat(2, i);
            IconCompatParcelizer(3, downloadIndex);
            MediaBrowserCompatCustomActionResultReceiver(1, 4);
        }

        @Override // kotlin.DownloadManager
        public final void read(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) throws IOException {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(downloadManagerExternalSyntheticLambda0.onRemoveQueueItem());
            downloadManagerExternalSyntheticLambda0.write(this);
        }

        @Override // kotlin.DownloadManager
        public final void AudioAttributesCompatParcelizer(byte b) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        @Override // kotlin.DownloadManager
        public final void onAddQueueItem(int i) throws IOException {
            if (i >= 0) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i);
            } else {
                AudioAttributesImplBaseParcelizer(i);
            }
        }

        @Override // kotlin.DownloadManager
        public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.RemoteActionCompatParcelizer;
                    int i2 = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), 1), e);
                }
            }
            byte[] bArr2 = this.RemoteActionCompatParcelizer;
            int i3 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // kotlin.DownloadManager
        public final void MediaBrowserCompatMediaItem(int i) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i2 = this.IconCompatParcelizer;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                this.IconCompatParcelizer = i2 + 4;
                bArr[i2 + 3] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        @Override // kotlin.DownloadManager
        public final void AudioAttributesImplBaseParcelizer(long j) throws IOException {
            if (DownloadManager.read && MediaDescriptionCompat() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.RemoteActionCompatParcelizer;
                    int i = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = i + 1;
                    DownloadProgress.write(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.RemoteActionCompatParcelizer;
                int i2 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i2 + 1;
                DownloadProgress.write(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.RemoteActionCompatParcelizer;
                    int i3 = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), 1), e);
                }
            }
            byte[] bArr4 = this.RemoteActionCompatParcelizer;
            int i4 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // kotlin.DownloadManager
        public final void read(long j) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i = this.IconCompatParcelizer;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                this.IconCompatParcelizer = i + 8;
                bArr[i + 7] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        private void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, i2);
                this.IconCompatParcelizer += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new write(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), Integer.valueOf(i2)), e);
            }
        }

        @Override // kotlin.getTransferListener
        public final void read(byte[] bArr, int i, int i2) throws IOException {
            AudioAttributesCompatParcelizer(bArr, i, i2);
        }

        @Override // kotlin.DownloadManager
        public final void RemoteActionCompatParcelizer(String str) throws IOException {
            int i = this.IconCompatParcelizer;
            try {
                int iMediaMetadataCompat = MediaMetadataCompat(str.length() * 3);
                int iMediaMetadataCompat2 = MediaMetadataCompat(str.length());
                if (iMediaMetadataCompat2 == iMediaMetadataCompat) {
                    int i2 = i + iMediaMetadataCompat2;
                    this.IconCompatParcelizer = i2;
                    int iIconCompatParcelizer = copyWithKeySetId.IconCompatParcelizer(str, this.RemoteActionCompatParcelizer, i2, MediaDescriptionCompat());
                    this.IconCompatParcelizer = i;
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((iIconCompatParcelizer - i) - iMediaMetadataCompat2);
                    this.IconCompatParcelizer = iIconCompatParcelizer;
                    return;
                }
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(copyWithKeySetId.RemoteActionCompatParcelizer(str));
                this.IconCompatParcelizer = copyWithKeySetId.IconCompatParcelizer(str, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, MediaDescriptionCompat());
            } catch (IndexOutOfBoundsException e) {
                throw new write(e);
            } catch (copyWithKeySetId.write e2) {
                this.IconCompatParcelizer = i;
                read(str, e2);
            }
        }

        @Override // kotlin.DownloadManager
        public final int MediaDescriptionCompat() {
            return this.read - this.IconCompatParcelizer;
        }
    }
}
