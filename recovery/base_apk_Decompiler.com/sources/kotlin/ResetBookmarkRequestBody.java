package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class ResetBookmarkRequestBody extends AuthorRSModel {
    private static final byte[] AudioAttributesCompatParcelizer = new byte[0];
    private final int RemoteActionCompatParcelizer;
    private int write;

    ResetBookmarkRequestBody(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            RemoteActionCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = i;
        this.write = i;
    }

    final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.write == 0) {
            return -1;
        }
        int i = this.IconCompatParcelizer.read();
        if (i >= 0) {
            int i2 = this.write - 1;
            this.write = i2;
            if (i2 == 0) {
                RemoteActionCompatParcelizer();
            }
            return i;
        }
        StringBuilder sb = new StringBuilder("DEF length ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" object truncated by ");
        sb.append(this.write);
        throw new EOFException(sb.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.write;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.IconCompatParcelizer.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.write - i4;
            this.write = i5;
            if (i5 == 0) {
                RemoteActionCompatParcelizer();
            }
            return i4;
        }
        StringBuilder sb = new StringBuilder("DEF length ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" object truncated by ");
        sb.append(this.write);
        throw new EOFException(sb.toString());
    }

    final void write(byte[] bArr) throws IOException {
        int i = this.write;
        if (i != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int i2 = this.write;
        if (i2 >= iAudioAttributesCompatParcelizer) {
            StringBuilder sb = new StringBuilder("corrupted stream - out of bounds length found: ");
            sb.append(this.write);
            sb.append(" >= ");
            sb.append(iAudioAttributesCompatParcelizer);
            throw new IOException(sb.toString());
        }
        int iIconCompatParcelizer = i2 - CustomModuleLSModelKt.IconCompatParcelizer(this.IconCompatParcelizer, bArr, bArr.length);
        this.write = iIconCompatParcelizer;
        if (iIconCompatParcelizer == 0) {
            RemoteActionCompatParcelizer();
            return;
        }
        StringBuilder sb2 = new StringBuilder("DEF length ");
        sb2.append(this.RemoteActionCompatParcelizer);
        sb2.append(" object truncated by ");
        sb2.append(this.write);
        throw new EOFException(sb2.toString());
    }

    final byte[] write() throws IOException {
        if (this.write == 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int i = this.write;
        if (i >= iAudioAttributesCompatParcelizer) {
            StringBuilder sb = new StringBuilder("corrupted stream - out of bounds length found: ");
            sb.append(this.write);
            sb.append(" >= ");
            sb.append(iAudioAttributesCompatParcelizer);
            throw new IOException(sb.toString());
        }
        byte[] bArr = new byte[i];
        int iIconCompatParcelizer = i - CustomModuleLSModelKt.IconCompatParcelizer(this.IconCompatParcelizer, bArr, i);
        this.write = iIconCompatParcelizer;
        if (iIconCompatParcelizer == 0) {
            RemoteActionCompatParcelizer();
            return bArr;
        }
        StringBuilder sb2 = new StringBuilder("DEF length ");
        sb2.append(this.RemoteActionCompatParcelizer);
        sb2.append(" object truncated by ");
        sb2.append(this.write);
        throw new EOFException(sb2.toString());
    }
}
