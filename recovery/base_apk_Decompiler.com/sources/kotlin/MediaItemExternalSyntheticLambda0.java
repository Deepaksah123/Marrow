package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemExternalSyntheticLambda0 extends OutputStream {
    private byte[] AudioAttributesCompatParcelizer;
    private setSubtitleConfigurations IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final OutputStream write;

    public MediaItemExternalSyntheticLambda0(OutputStream outputStream, setSubtitleConfigurations setsubtitleconfigurations) {
        this(outputStream, setsubtitleconfigurations, (byte) 0);
    }

    private MediaItemExternalSyntheticLambda0(OutputStream outputStream, setSubtitleConfigurations setsubtitleconfigurations, byte b) {
        this.write = outputStream;
        this.IconCompatParcelizer = setsubtitleconfigurations;
        this.AudioAttributesCompatParcelizer = (byte[]) setsubtitleconfigurations.IconCompatParcelizer(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        bArr[i2] = (byte) i;
        read();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 == 0 && i4 >= this.AudioAttributesCompatParcelizer.length) {
                this.write.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.AudioAttributesCompatParcelizer.length - i6);
            System.arraycopy(bArr, i5, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, iMin);
            this.RemoteActionCompatParcelizer += iMin;
            i3 += iMin;
            read();
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        RemoteActionCompatParcelizer();
        this.write.flush();
    }

    private void RemoteActionCompatParcelizer() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        if (i > 0) {
            this.write.write(this.AudioAttributesCompatParcelizer, 0, i);
            this.RemoteActionCompatParcelizer = 0;
        }
    }

    private void read() throws IOException {
        if (this.RemoteActionCompatParcelizer == this.AudioAttributesCompatParcelizer.length) {
            RemoteActionCompatParcelizer();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.write.close();
            write();
        } catch (Throwable th) {
            this.write.close();
            throw th;
        }
    }

    private void write() {
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        if (bArr != null) {
            this.IconCompatParcelizer.read(bArr);
            this.AudioAttributesCompatParcelizer = null;
        }
    }
}
