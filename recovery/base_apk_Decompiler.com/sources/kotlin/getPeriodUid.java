package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class getPeriodUid extends InputStream {
    private static final Queue<getPeriodUid> IconCompatParcelizer = moveMediaSourceRange.write(0);
    private IOException RemoteActionCompatParcelizer;
    private InputStream write;

    public static getPeriodUid write(InputStream inputStream) {
        getPeriodUid getperioduidPoll;
        Queue<getPeriodUid> queue = IconCompatParcelizer;
        synchronized (queue) {
            getperioduidPoll = queue.poll();
        }
        if (getperioduidPoll == null) {
            getperioduidPoll = new getPeriodUid();
        }
        getperioduidPoll.IconCompatParcelizer(inputStream);
        return getperioduidPoll;
    }

    getPeriodUid() {
    }

    private void IconCompatParcelizer(InputStream inputStream) {
        this.write = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.write.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.write.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.write.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.write.read();
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.write.read(bArr);
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.write.read(bArr, i, i2);
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            this.write.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.write.skip(j);
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer = e;
            throw e;
        }
    }

    public final IOException write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = null;
        this.write = null;
        Queue<getPeriodUid> queue = IconCompatParcelizer;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
