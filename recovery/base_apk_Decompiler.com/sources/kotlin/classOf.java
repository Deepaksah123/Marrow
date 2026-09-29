package kotlin;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class classOf implements closeOnFailAndThrowAsIOE {
    private byte[] AudioAttributesCompatParcelizer = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    private final byte[] AudioAttributesImplApi26Parcelizer = new byte[4096];
    private int IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private final JsonNullFormatVisitor RemoteActionCompatParcelizer;
    private long read;
    private int write;

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.extractor");
    }

    public classOf(JsonNullFormatVisitor jsonNullFormatVisitor, long j, long j2) {
        this.RemoteActionCompatParcelizer = jsonNullFormatVisitor;
        this.read = j;
        this.MediaBrowserCompatItemReceiver = j2;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE, kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        int iWrite = write(bArr, i, i2);
        if (iWrite == 0) {
            iWrite = write(bArr, i, i2, 0, true);
        }
        RemoteActionCompatParcelizer(iWrite);
        return iWrite;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final boolean AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iWrite = write(bArr, i, i2);
        while (iWrite < i2 && iWrite != -1) {
            iWrite = write(bArr, i, i2, iWrite, z);
        }
        RemoteActionCompatParcelizer(iWrite);
        return iWrite != -1;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        AudioAttributesCompatParcelizer(bArr, i, i2, false);
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final int read(int i) throws IOException {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
        if (iMediaBrowserCompatItemReceiver == 0) {
            byte[] bArr = this.AudioAttributesImplApi26Parcelizer;
            iMediaBrowserCompatItemReceiver = write(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver);
        return iMediaBrowserCompatItemReceiver;
    }

    private boolean AudioAttributesImplBaseParcelizer(int i) throws IOException {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
        while (iMediaBrowserCompatItemReceiver < i && iMediaBrowserCompatItemReceiver != -1) {
            iMediaBrowserCompatItemReceiver = write(this.AudioAttributesImplApi26Parcelizer, -iMediaBrowserCompatItemReceiver, Math.min(i, this.AudioAttributesImplApi26Parcelizer.length + iMediaBrowserCompatItemReceiver), iMediaBrowserCompatItemReceiver, false);
        }
        RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver);
        return iMediaBrowserCompatItemReceiver != -1;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final void IconCompatParcelizer(int i) throws IOException {
        AudioAttributesImplBaseParcelizer(i);
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        AudioAttributesCompatParcelizer(i2);
        int i3 = this.IconCompatParcelizer;
        int i4 = this.write;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = write(this.AudioAttributesCompatParcelizer, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.IconCompatParcelizer += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.AudioAttributesCompatParcelizer, this.write, bArr, i, iMin);
        this.write += iMin;
        return iMin;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final boolean RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!write(i2, z)) {
            return false;
        }
        System.arraycopy(this.AudioAttributesCompatParcelizer, this.write - i2, bArr, i, i2);
        return true;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        RemoteActionCompatParcelizer(bArr, i, i2, false);
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final boolean write(int i, boolean z) throws IOException {
        AudioAttributesCompatParcelizer(i);
        int iWrite = this.IconCompatParcelizer - this.write;
        while (iWrite < i) {
            iWrite = write(this.AudioAttributesCompatParcelizer, this.write, i, iWrite, z);
            if (iWrite == -1) {
                return false;
            }
            this.IconCompatParcelizer = this.write + iWrite;
        }
        this.write += i;
        return true;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final void write(int i) throws IOException {
        write(i, false);
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final void RemoteActionCompatParcelizer() {
        this.write = 0;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final long write() {
        return this.read + ((long) this.write);
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final long IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.closeOnFailAndThrowAsIOE
    public final long read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private void AudioAttributesCompatParcelizer(int i) {
        int i2 = this.write + i;
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        if (i2 > bArr.length) {
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(this.AudioAttributesCompatParcelizer, LaissezFaireSubTypeValidator.write(bArr.length << 1, C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, i2 + 524288));
        }
    }

    private int MediaBrowserCompatItemReceiver(int i) {
        int iMin = Math.min(this.IconCompatParcelizer, i);
        AudioAttributesImplApi26Parcelizer(iMin);
        return iMin;
    }

    private int write(byte[] bArr, int i, int i2) {
        int i3 = this.IconCompatParcelizer;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.AudioAttributesCompatParcelizer, 0, bArr, i, iMin);
        AudioAttributesImplApi26Parcelizer(iMin);
        return iMin;
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        int i2 = this.IconCompatParcelizer - i;
        this.IconCompatParcelizer = i2;
        this.write = 0;
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.AudioAttributesCompatParcelizer = bArr2;
    }

    private int write(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bArr, i + i3, i2 - i3);
        if (iAudioAttributesCompatParcelizer != -1) {
            return i3 + iAudioAttributesCompatParcelizer;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i != -1) {
            this.read += (long) i;
        }
    }
}
