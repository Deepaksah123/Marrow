package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecMimeType extends OutputStream {
    private final OutputStream IconCompatParcelizer;
    private final Timer RemoteActionCompatParcelizer;
    private avcLevelToMaxFrameSize read;
    private long write = -1;

    public getCodecMimeType(OutputStream outputStream, avcLevelToMaxFrameSize avcleveltomaxframesize, Timer timer) {
        this.IconCompatParcelizer = outputStream;
        this.read = avcleveltomaxframesize;
        this.RemoteActionCompatParcelizer = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.write;
        if (j != -1) {
            this.read.write(j);
        }
        this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        try {
            this.IconCompatParcelizer.close();
        } catch (IOException e) {
            this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.read);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.IconCompatParcelizer.flush();
        } catch (IOException e) {
            this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.read);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.IconCompatParcelizer.write(i);
            long j = this.write + 1;
            this.write = j;
            this.read.write(j);
        } catch (IOException e) {
            this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.read);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.IconCompatParcelizer.write(bArr);
            long length = this.write + ((long) bArr.length);
            this.write = length;
            this.read.write(length);
        } catch (IOException e) {
            this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.read);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.IconCompatParcelizer.write(bArr, i, i2);
            long j = this.write + ((long) i2);
            this.write = j;
            this.read.write(j);
        } catch (IOException e) {
            this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.read);
            throw e;
        }
    }
}
