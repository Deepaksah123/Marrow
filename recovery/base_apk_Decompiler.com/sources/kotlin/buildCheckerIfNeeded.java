package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class buildCheckerIfNeeded {
    private static final long[] write = {128, 64, 32, 16, 8, 4, 2, 1};
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private final byte[] RemoteActionCompatParcelizer = new byte[8];

    public final void AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z, boolean z2, int i) throws IOException {
        if (this.IconCompatParcelizer == 0) {
            if (!closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, 0, 1, z)) {
                return -1L;
            }
            int iIconCompatParcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer[0] & 255);
            this.AudioAttributesCompatParcelizer = iIconCompatParcelizer;
            if (iIconCompatParcelizer == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.IconCompatParcelizer = 1;
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i2 > i) {
            this.IconCompatParcelizer = 0;
            return -2L;
        }
        if (i2 != 1) {
            closeonfailandthrowasioe.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 1, i2 - 1);
        }
        this.IconCompatParcelizer = 0;
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, z2);
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static int IconCompatParcelizer(int i) {
        long j;
        int i2 = 0;
        do {
            long[] jArr = write;
            if (i2 >= jArr.length) {
                return -1;
            }
            j = jArr[i2] & ((long) i);
            i2++;
        } while (j == 0);
        return i2;
    }

    public static long RemoteActionCompatParcelizer(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~write[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
