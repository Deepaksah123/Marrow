package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class AsDeductionTypeSerializer {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private long[] read;
    private int write;

    public AsDeductionTypeSerializer() {
        this((byte) 0);
    }

    private AsDeductionTypeSerializer(byte b) {
        buildTypeSerializer.IconCompatParcelizer(true);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = -1;
        this.IconCompatParcelizer = 0;
        this.read = new long[iHighestOneBit];
        this.write = iHighestOneBit - 1;
    }

    public final long read() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.read;
        int i2 = this.AudioAttributesCompatParcelizer;
        long j = jArr[i2];
        this.AudioAttributesCompatParcelizer = this.write & (i2 + 1);
        this.IconCompatParcelizer = i - 1;
        return j;
    }

    public final long RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == 0) {
            throw new NoSuchElementException();
        }
        return this.read[this.AudioAttributesCompatParcelizer];
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer == 0;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = -1;
        this.IconCompatParcelizer = 0;
    }
}
