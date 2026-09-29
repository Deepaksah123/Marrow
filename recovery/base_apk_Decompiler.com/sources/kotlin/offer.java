package kotlin;

import java.util.Arrays;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
final class offer {
    private boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    public byte[] read;
    public int write;

    public offer(int i) {
        this.RemoteActionCompatParcelizer = i;
        byte[] bArr = new byte[TarConstants.PREFIXLEN_XSTAR];
        this.read = bArr;
        bArr[2] = 1;
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = false;
    }

    public final boolean read() {
        return this.IconCompatParcelizer;
    }

    public final void write(int i) {
        buildTypeSerializer.write(!this.AudioAttributesCompatParcelizer);
        boolean z = i == this.RemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = z;
        if (z) {
            this.write = 3;
            this.IconCompatParcelizer = false;
        }
    }

    public final void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        if (this.AudioAttributesCompatParcelizer) {
            int i3 = i2 - i;
            byte[] bArr2 = this.read;
            int length = bArr2.length;
            int i4 = this.write + i3;
            if (length < i4) {
                this.read = Arrays.copyOf(bArr2, i4 << 1);
            }
            System.arraycopy(bArr, i, this.read, this.write, i3);
            this.write += i3;
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        if (!this.AudioAttributesCompatParcelizer) {
            return false;
        }
        this.write -= i;
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = true;
        return true;
    }
}
