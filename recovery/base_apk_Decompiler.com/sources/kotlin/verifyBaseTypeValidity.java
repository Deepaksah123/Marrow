package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class verifyBaseTypeValidity extends InputStream {
    private final _hasTypeResolver AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final SubTypeValidator RemoteActionCompatParcelizer;
    private boolean read = false;
    private boolean write = false;
    private final byte[] IconCompatParcelizer = new byte[1];

    public verifyBaseTypeValidity(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator) {
        this.AudioAttributesCompatParcelizer = _hastyperesolver;
        this.RemoteActionCompatParcelizer = subTypeValidator;
    }

    public final void IconCompatParcelizer() throws IOException {
        AudioAttributesCompatParcelizer();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.IconCompatParcelizer) == -1) {
            return -1;
        }
        return this.IconCompatParcelizer[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        buildTypeSerializer.write(!this.write);
        AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(bArr, i, i2);
        if (iAudioAttributesCompatParcelizer == -1) {
            return -1;
        }
        this.AudioAttributesImplApi26Parcelizer += (long) iAudioAttributesCompatParcelizer;
        return iAudioAttributesCompatParcelizer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.write) {
            return;
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.write = true;
    }

    private void AudioAttributesCompatParcelizer() throws IOException {
        if (this.read) {
            return;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        this.read = true;
    }
}
