package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DownloadIndex implements Iterable<Byte>, Serializable {
    public static final DownloadIndex RemoteActionCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver(getDownloadIndex.write);
    private int write = 0;

    public interface write extends Iterator<Byte> {
        byte read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int read(byte b) {
        return b & 255;
    }

    public abstract byte AudioAttributesCompatParcelizer(int i);

    abstract void AudioAttributesCompatParcelizer(getTransferListener gettransferlistener) throws IOException;

    protected abstract void AudioAttributesCompatParcelizer(byte[] bArr, int i);

    protected abstract String IconCompatParcelizer(Charset charset);

    public abstract DownloadIndex IconCompatParcelizer(int i, int i2);

    abstract byte RemoteActionCompatParcelizer(int i);

    protected abstract int RemoteActionCompatParcelizer(int i, int i2);

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract int write();

    static {
        byte b = 0;
        if (DownloadHelperLiveContentUnsupportedException.RemoteActionCompatParcelizer()) {
            new AudioAttributesImplApi26Parcelizer(b);
        } else {
            new AudioAttributesCompatParcelizer(b);
        }
        new Comparator<DownloadIndex>() { // from class: o.DownloadIndex.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(DownloadIndex downloadIndex, DownloadIndex downloadIndex2) {
                return AudioAttributesCompatParcelizer(downloadIndex, downloadIndex2);
            }

            private static int AudioAttributesCompatParcelizer(DownloadIndex downloadIndex, DownloadIndex downloadIndex2) {
                write it = downloadIndex.iterator();
                write it2 = downloadIndex2.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int iCompareTo = Integer.valueOf(DownloadIndex.read(it.read())).compareTo(Integer.valueOf(DownloadIndex.read(it2.read())));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return Integer.valueOf(downloadIndex.write()).compareTo(Integer.valueOf(downloadIndex2.write()));
            }
        };
    }

    static final class AudioAttributesImplApi26Parcelizer {
        private AudioAttributesImplApi26Parcelizer() {
        }

        /* synthetic */ AudioAttributesImplApi26Parcelizer(byte b) {
            this();
        }
    }

    static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    DownloadIndex() {
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final write iterator() {
        return new IconCompatParcelizer() { // from class: o.DownloadIndex.3
            private int IconCompatParcelizer = 0;
            private final int read;

            {
                this.read = DownloadIndex.this.write();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.IconCompatParcelizer < this.read;
            }

            @Override // o.DownloadIndex.write
            public final byte read() {
                int i = this.IconCompatParcelizer;
                if (i >= this.read) {
                    throw new NoSuchElementException();
                }
                this.IconCompatParcelizer = i + 1;
                return DownloadIndex.this.RemoteActionCompatParcelizer(i);
            }
        };
    }

    static abstract class IconCompatParcelizer implements write {
        IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(read());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static DownloadIndex AudioAttributesCompatParcelizer(byte[] bArr) {
        return new MediaBrowserCompatCustomActionResultReceiver(bArr);
    }

    public static DownloadIndex AudioAttributesCompatParcelizer(String str) {
        return new MediaBrowserCompatCustomActionResultReceiver(str.getBytes(getDownloadIndex.IconCompatParcelizer));
    }

    public final byte[] IconCompatParcelizer() {
        int iWrite = write();
        if (iWrite == 0) {
            return getDownloadIndex.write;
        }
        byte[] bArr = new byte[iWrite];
        AudioAttributesCompatParcelizer(bArr, iWrite);
        return bArr;
    }

    private String AudioAttributesCompatParcelizer(Charset charset) {
        return write() == 0 ? "" : IconCompatParcelizer(charset);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesCompatParcelizer(getDownloadIndex.IconCompatParcelizer);
    }

    static abstract class AudioAttributesImplApi21Parcelizer extends DownloadIndex {
        abstract boolean RemoteActionCompatParcelizer(DownloadIndex downloadIndex, int i);

        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // kotlin.DownloadIndex, java.lang.Iterable
        public /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = this.write;
        if (iRemoteActionCompatParcelizer == 0) {
            int iWrite = write();
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite, iWrite);
            if (iRemoteActionCompatParcelizer == 0) {
                iRemoteActionCompatParcelizer = 1;
            }
            this.write = iRemoteActionCompatParcelizer;
        }
        return iRemoteActionCompatParcelizer;
    }

    static RemoteActionCompatParcelizer write(int i) {
        return new RemoteActionCompatParcelizer(i, (byte) 0);
    }

    static final class RemoteActionCompatParcelizer {
        private final byte[] IconCompatParcelizer;
        private final DownloadManager write;

        /* synthetic */ RemoteActionCompatParcelizer(int i, byte b) {
            this(i);
        }

        private RemoteActionCompatParcelizer(int i) {
            byte[] bArr = new byte[i];
            this.IconCompatParcelizer = bArr;
            this.write = DownloadManager.read(bArr);
        }

        public final DownloadIndex RemoteActionCompatParcelizer() {
            this.write.MediaBrowserCompatItemReceiver();
            return new MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
        }

        public final DownloadManager write() {
            return this.write;
        }
    }

    protected final int read() {
        return this.write;
    }

    static void read(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: ".concat(String.valueOf(i)));
            }
            StringBuilder sb = new StringBuilder("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    static int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iWrite = write();
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, Integer.valueOf(iWrite), AudioAttributesImplApi26Parcelizer());
    }

    private String AudioAttributesImplApi26Parcelizer() {
        if (write() <= 50) {
            return DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer(IconCompatParcelizer(0, 47)));
        sb.append("...");
        return sb.toString();
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplApi21Parcelizer {
        protected final byte[] read;

        protected int AudioAttributesImplBaseParcelizer() {
            return 0;
        }

        MediaBrowserCompatCustomActionResultReceiver(byte[] bArr) {
            this.read = bArr;
        }

        @Override // kotlin.DownloadIndex
        public byte AudioAttributesCompatParcelizer(int i) {
            return this.read[i];
        }

        @Override // kotlin.DownloadIndex
        byte RemoteActionCompatParcelizer(int i) {
            return this.read[i];
        }

        @Override // kotlin.DownloadIndex
        public int write() {
            return this.read.length;
        }

        @Override // kotlin.DownloadIndex
        public final DownloadIndex IconCompatParcelizer(int i, int i2) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0, i2, write());
            if (iAudioAttributesCompatParcelizer == 0) {
                return DownloadIndex.RemoteActionCompatParcelizer;
            }
            return new read(this.read, AudioAttributesImplBaseParcelizer(), iAudioAttributesCompatParcelizer);
        }

        @Override // kotlin.DownloadIndex
        protected void AudioAttributesCompatParcelizer(byte[] bArr, int i) {
            System.arraycopy(this.read, 0, bArr, 0, i);
        }

        @Override // kotlin.DownloadIndex
        final void AudioAttributesCompatParcelizer(getTransferListener gettransferlistener) throws IOException {
            gettransferlistener.read(this.read, AudioAttributesImplBaseParcelizer(), write());
        }

        @Override // kotlin.DownloadIndex
        protected final String IconCompatParcelizer(Charset charset) {
            return new String(this.read, AudioAttributesImplBaseParcelizer(), write(), charset);
        }

        @Override // kotlin.DownloadIndex
        public final boolean RemoteActionCompatParcelizer() {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            return copyWithKeySetId.write(this.read, iAudioAttributesImplBaseParcelizer, write() + iAudioAttributesImplBaseParcelizer);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadIndex) || write() != ((DownloadIndex) obj).write()) {
                return false;
            }
            if (write() == 0) {
                return true;
            }
            if (obj instanceof MediaBrowserCompatCustomActionResultReceiver) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) obj;
                int i = read();
                int i2 = mediaBrowserCompatCustomActionResultReceiver.read();
                if (i == 0 || i2 == 0 || i == i2) {
                    return RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, write());
                }
                return false;
            }
            return obj.equals(this);
        }

        @Override // o.DownloadIndex.AudioAttributesImplApi21Parcelizer
        final boolean RemoteActionCompatParcelizer(DownloadIndex downloadIndex, int i) {
            if (i > downloadIndex.write()) {
                StringBuilder sb = new StringBuilder("Length too large: ");
                sb.append(i);
                sb.append(write());
                throw new IllegalArgumentException(sb.toString());
            }
            if (i > downloadIndex.write()) {
                StringBuilder sb2 = new StringBuilder("Ran off end of other: 0, ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(downloadIndex.write());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (downloadIndex instanceof MediaBrowserCompatCustomActionResultReceiver) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) downloadIndex;
                byte[] bArr = this.read;
                byte[] bArr2 = mediaBrowserCompatCustomActionResultReceiver.read;
                int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                int iAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
                int iAudioAttributesImplBaseParcelizer3 = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer();
                while (iAudioAttributesImplBaseParcelizer2 < iAudioAttributesImplBaseParcelizer + i) {
                    if (bArr[iAudioAttributesImplBaseParcelizer2] != bArr2[iAudioAttributesImplBaseParcelizer3]) {
                        return false;
                    }
                    iAudioAttributesImplBaseParcelizer2++;
                    iAudioAttributesImplBaseParcelizer3++;
                }
                return true;
            }
            return downloadIndex.IconCompatParcelizer(0, i).equals(IconCompatParcelizer(0, i));
        }

        @Override // kotlin.DownloadIndex
        protected final int RemoteActionCompatParcelizer(int i, int i2) {
            return getDownloadIndex.RemoteActionCompatParcelizer(i, this.read, AudioAttributesImplBaseParcelizer(), i2);
        }
    }

    static final class read extends MediaBrowserCompatCustomActionResultReceiver {
        private final int IconCompatParcelizer;
        private final int write;

        read(byte[] bArr, int i, int i2) {
            super(bArr);
            AudioAttributesCompatParcelizer(i, i + i2, bArr.length);
            this.IconCompatParcelizer = i;
            this.write = i2;
        }

        @Override // o.DownloadIndex.MediaBrowserCompatCustomActionResultReceiver, kotlin.DownloadIndex
        public final byte AudioAttributesCompatParcelizer(int i) {
            read(i, write());
            return this.read[this.IconCompatParcelizer + i];
        }

        @Override // o.DownloadIndex.MediaBrowserCompatCustomActionResultReceiver, kotlin.DownloadIndex
        final byte RemoteActionCompatParcelizer(int i) {
            return this.read[this.IconCompatParcelizer + i];
        }

        @Override // o.DownloadIndex.MediaBrowserCompatCustomActionResultReceiver, kotlin.DownloadIndex
        public final int write() {
            return this.write;
        }

        @Override // o.DownloadIndex.MediaBrowserCompatCustomActionResultReceiver
        protected final int AudioAttributesImplBaseParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // o.DownloadIndex.MediaBrowserCompatCustomActionResultReceiver, kotlin.DownloadIndex
        protected final void AudioAttributesCompatParcelizer(byte[] bArr, int i) {
            System.arraycopy(this.read, AudioAttributesImplBaseParcelizer(), bArr, 0, i);
        }

        final Object writeReplace() {
            return DownloadIndex.AudioAttributesCompatParcelizer(IconCompatParcelizer());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
    }
}
