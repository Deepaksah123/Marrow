package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AsDeductionTypeDeserializer {
    private long[] IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    public AsDeductionTypeDeserializer() {
        this((byte) 0);
    }

    private AsDeductionTypeDeserializer(byte b) {
        this.IconCompatParcelizer = new long[32];
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        int i = this.RemoteActionCompatParcelizer;
        long[] jArr = this.IconCompatParcelizer;
        if (i == jArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        jArr2[i2] = j;
    }

    public final long read(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.IconCompatParcelizer[i];
    }

    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }
}
