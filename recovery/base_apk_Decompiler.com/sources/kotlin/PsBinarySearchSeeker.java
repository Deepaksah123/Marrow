package kotlin;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
class PsBinarySearchSeeker implements Closeable {
    private static final Logger RemoteActionCompatParcelizer = Logger.getLogger(PsBinarySearchSeeker.class.getName());
    private int AudioAttributesCompatParcelizer;
    private write IconCompatParcelizer;
    private final RandomAccessFile MediaBrowserCompatCustomActionResultReceiver;
    private write MediaBrowserCompatItemReceiver;
    private int read;
    private final byte[] write = new byte[16];

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer(InputStream inputStream, int i) throws IOException;
    }

    public PsBinarySearchSeeker(File file) throws IOException {
        if (!file.exists()) {
            IconCompatParcelizer(file);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = read(file);
        IconCompatParcelizer();
    }

    private static void IconCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void AudioAttributesCompatParcelizer(byte[] bArr, int... iArr) {
        int length = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            IconCompatParcelizer(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    private static int RemoteActionCompatParcelizer(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void IconCompatParcelizer() throws IOException {
        this.MediaBrowserCompatCustomActionResultReceiver.seek(0L);
        this.MediaBrowserCompatCustomActionResultReceiver.readFully(this.write);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write, 0);
        this.read = iRemoteActionCompatParcelizer;
        if (iRemoteActionCompatParcelizer > this.MediaBrowserCompatCustomActionResultReceiver.length()) {
            StringBuilder sb = new StringBuilder("File is truncated. Expected length: ");
            sb.append(this.read);
            sb.append(", Actual length: ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver.length());
            throw new IOException(sb.toString());
        }
        this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(this.write, 4);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.write, 8);
        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(this.write, 12);
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2);
        this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer3);
    }

    private void IconCompatParcelizer(int i, int i2, int i3, int i4) throws IOException {
        AudioAttributesCompatParcelizer(this.write, i, i2, i3, i4);
        this.MediaBrowserCompatCustomActionResultReceiver.seek(0L);
        this.MediaBrowserCompatCustomActionResultReceiver.write(this.write);
    }

    private write RemoteActionCompatParcelizer(int i) throws IOException {
        if (i == 0) {
            return write.AudioAttributesCompatParcelizer;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.seek(i);
        return new write(i, this.MediaBrowserCompatCustomActionResultReceiver.readInt());
    }

    private static void IconCompatParcelizer(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile randomAccessFile = read(file2);
        try {
            randomAccessFile.setLength(4096L);
            randomAccessFile.seek(0L);
            byte[] bArr = new byte[16];
            AudioAttributesCompatParcelizer(bArr, 4096, 0, 0, 0);
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private static RandomAccessFile read(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int read(int i) {
        int i2 = this.read;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void read(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = read(i);
        int i5 = this.read;
        if (i4 + i3 <= i5) {
            this.MediaBrowserCompatCustomActionResultReceiver.seek(i4);
            this.MediaBrowserCompatCustomActionResultReceiver.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - i4;
        this.MediaBrowserCompatCustomActionResultReceiver.seek(i4);
        this.MediaBrowserCompatCustomActionResultReceiver.write(bArr, 0, i6);
        this.MediaBrowserCompatCustomActionResultReceiver.seek(16L);
        this.MediaBrowserCompatCustomActionResultReceiver.write(bArr, i6, i3 - i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = read(i);
        int i5 = this.read;
        if (i4 + i3 <= i5) {
            this.MediaBrowserCompatCustomActionResultReceiver.seek(i4);
            this.MediaBrowserCompatCustomActionResultReceiver.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - i4;
        this.MediaBrowserCompatCustomActionResultReceiver.seek(i4);
        this.MediaBrowserCompatCustomActionResultReceiver.readFully(bArr, i2, i6);
        this.MediaBrowserCompatCustomActionResultReceiver.seek(16L);
        this.MediaBrowserCompatCustomActionResultReceiver.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void RemoteActionCompatParcelizer(byte[] bArr) throws IOException {
        read(bArr, bArr.length);
    }

    private void read(byte[] bArr, int i) throws IOException {
        synchronized (this) {
            AudioAttributesCompatParcelizer(bArr, "buffer");
            if (i < 0 || i > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            write(i);
            boolean z = read();
            write writeVar = new write(z ? 16 : read(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer + 4 + this.MediaBrowserCompatItemReceiver.write), i);
            IconCompatParcelizer(this.write, 0, i);
            read(writeVar.RemoteActionCompatParcelizer, this.write, 0, 4);
            read(writeVar.RemoteActionCompatParcelizer + 4, bArr, 0, i);
            IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer + 1, z ? writeVar.RemoteActionCompatParcelizer : this.IconCompatParcelizer.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer);
            this.MediaBrowserCompatItemReceiver = writeVar;
            this.AudioAttributesCompatParcelizer++;
            if (z) {
                this.IconCompatParcelizer = writeVar;
            }
        }
    }

    public final int RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            return 16;
        }
        if (this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer >= this.IconCompatParcelizer.RemoteActionCompatParcelizer) {
            return (this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer - this.IconCompatParcelizer.RemoteActionCompatParcelizer) + 4 + this.MediaBrowserCompatItemReceiver.write + 16;
        }
        return (((this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer + 4) + this.MediaBrowserCompatItemReceiver.write) + this.read) - this.IconCompatParcelizer.RemoteActionCompatParcelizer;
    }

    private int write() {
        return this.read - RemoteActionCompatParcelizer();
    }

    public final boolean read() {
        boolean z;
        synchronized (this) {
            z = this.AudioAttributesCompatParcelizer == 0;
        }
        return z;
    }

    private void write(int i) throws IOException {
        int i2 = i + 4;
        int iWrite = write();
        if (iWrite >= i2) {
            return;
        }
        int i3 = this.read;
        do {
            iWrite += i3;
            i3 <<= 1;
        } while (iWrite < i2);
        AudioAttributesCompatParcelizer(i3);
        int i4 = read(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer + 4 + this.MediaBrowserCompatItemReceiver.write);
        if (i4 < this.IconCompatParcelizer.RemoteActionCompatParcelizer) {
            FileChannel channel = this.MediaBrowserCompatCustomActionResultReceiver.getChannel();
            channel.position(this.read);
            long j = i4 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer < this.IconCompatParcelizer.RemoteActionCompatParcelizer) {
            int i5 = (this.read + this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer) - 16;
            IconCompatParcelizer(i3, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.RemoteActionCompatParcelizer, i5);
            this.MediaBrowserCompatItemReceiver = new write(i5, this.MediaBrowserCompatItemReceiver.write);
        } else {
            IconCompatParcelizer(i3, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
        }
        this.read = i3;
    }

    private void AudioAttributesCompatParcelizer(int i) throws IOException {
        this.MediaBrowserCompatCustomActionResultReceiver.setLength(i);
        this.MediaBrowserCompatCustomActionResultReceiver.getChannel().force(true);
    }

    public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws IOException {
        synchronized (this) {
            int i = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            byte b = 0;
            for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer; i2++) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(this, writeVarRemoteActionCompatParcelizer, b), writeVarRemoteActionCompatParcelizer.write);
                i = read(writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer + 4 + writeVarRemoteActionCompatParcelizer.write);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T AudioAttributesCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    final class AudioAttributesCompatParcelizer extends InputStream {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        /* synthetic */ AudioAttributesCompatParcelizer(PsBinarySearchSeeker psBinarySearchSeeker, write writeVar, byte b) {
            this(writeVar);
        }

        private AudioAttributesCompatParcelizer(write writeVar) {
            this.AudioAttributesCompatParcelizer = PsBinarySearchSeeker.this.read(writeVar.RemoteActionCompatParcelizer + 4);
            this.IconCompatParcelizer = writeVar.write;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            PsBinarySearchSeeker.AudioAttributesCompatParcelizer(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.IconCompatParcelizer;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            PsBinarySearchSeeker.this.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, bArr, i, i2);
            this.AudioAttributesCompatParcelizer = PsBinarySearchSeeker.this.read(this.AudioAttributesCompatParcelizer + i2);
            this.IconCompatParcelizer -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.IconCompatParcelizer == 0) {
                return -1;
            }
            PsBinarySearchSeeker.this.MediaBrowserCompatCustomActionResultReceiver.seek(this.AudioAttributesCompatParcelizer);
            int i = PsBinarySearchSeeker.this.MediaBrowserCompatCustomActionResultReceiver.read();
            this.AudioAttributesCompatParcelizer = PsBinarySearchSeeker.this.read(this.AudioAttributesCompatParcelizer + 1);
            this.IconCompatParcelizer--;
            return i;
        }
    }

    public final void AudioAttributesCompatParcelizer() throws IOException {
        synchronized (this) {
            if (read()) {
                throw new NoSuchElementException();
            }
            if (this.AudioAttributesCompatParcelizer == 1) {
                AudioAttributesImplBaseParcelizer();
            } else {
                int i = read(this.IconCompatParcelizer.RemoteActionCompatParcelizer + 4 + this.IconCompatParcelizer.write);
                AudioAttributesCompatParcelizer(i, this.write, 0, 4);
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write, 0);
                IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer - 1, i, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
                this.AudioAttributesCompatParcelizer--;
                this.IconCompatParcelizer = new write(i, iRemoteActionCompatParcelizer);
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer() throws IOException {
        synchronized (this) {
            IconCompatParcelizer(4096, 0, 0, 0);
            this.AudioAttributesCompatParcelizer = 0;
            this.IconCompatParcelizer = write.AudioAttributesCompatParcelizer;
            this.MediaBrowserCompatItemReceiver = write.AudioAttributesCompatParcelizer;
            if (this.read > 4096) {
                AudioAttributesCompatParcelizer(4096);
            }
            this.read = 4096;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.MediaBrowserCompatCustomActionResultReceiver.close();
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.read);
        sb.append(", size=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", first=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", last=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", element lengths=[");
        try {
            write(new RemoteActionCompatParcelizer() { // from class: o.PsBinarySearchSeeker.1
                private boolean IconCompatParcelizer = true;

                @Override // o.PsBinarySearchSeeker.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(InputStream inputStream, int i) throws IOException {
                    if (this.IconCompatParcelizer) {
                        this.IconCompatParcelizer = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            RemoteActionCompatParcelizer.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    static class write {
        static final write AudioAttributesCompatParcelizer = new write(0, 0);
        final int RemoteActionCompatParcelizer;
        final int write;

        write(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", length = ");
            sb.append(this.write);
            sb.append("]");
            return sb.toString();
        }
    }
}
