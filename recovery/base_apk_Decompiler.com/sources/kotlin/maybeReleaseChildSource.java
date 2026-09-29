package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeReleaseChildSource {
    private static final AtomicReference<byte[]> IconCompatParcelizer = new AtomicReference<>();

    public static ByteBuffer read(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void RemoteActionCompatParcelizer(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        write(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.write(byteBuffer);
                    channel.force(false);
                    channel.close();
                    randomAccessFile.close();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static byte[] AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read(byteBuffer);
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.IconCompatParcelizer == 0 && audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.read.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        write(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static InputStream RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        return new IconCompatParcelizer(byteBuffer);
    }

    public static ByteBuffer read(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = IconCompatParcelizer.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i >= 0) {
                byteArrayOutputStream.write(andSet, 0, i);
            } else {
                IconCompatParcelizer.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return write(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer write(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    private static AudioAttributesCompatParcelizer read(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new AudioAttributesCompatParcelizer(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    static final class AudioAttributesCompatParcelizer {
        final int AudioAttributesCompatParcelizer;
        final int IconCompatParcelizer;
        final byte[] read;

        AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
            this.read = bArr;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }
    }

    static class IconCompatParcelizer extends InputStream {
        private int RemoteActionCompatParcelizer = -1;
        private final ByteBuffer write;

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        IconCompatParcelizer(ByteBuffer byteBuffer) {
            this.write = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.write.remaining();
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.write.hasRemaining()) {
                return this.write.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            synchronized (this) {
                this.RemoteActionCompatParcelizer = this.write.position();
            }
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            if (!this.write.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.write.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            synchronized (this) {
                int i = this.RemoteActionCompatParcelizer;
                if (i == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.write.position(i);
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (!this.write.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.write;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }
}
