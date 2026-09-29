package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\rR\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0012\u001a\u00060\u0015j\u0002`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Lo/removeTrailingZeroes;", "", "<init>", "()V", "", "Lo/SnapshotId;", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "IconCompatParcelizer", "(J)I", "", "(I)V", "read", "AudioAttributesCompatParcelizer", "p1", "(II)V", "write", "()I", "I", "", "Lo/SnapshotIdArray;", "[J", "", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeTrailingZeroes {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;
    private int[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private long[] write = toDecimal.write(16);
    private int[] read = new int[16];

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public int AudioAttributesCompatParcelizer;

    public removeTrailingZeroes() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.IconCompatParcelizer = iArr;
    }

    public final long RemoteActionCompatParcelizer(long p0) {
        return this.AudioAttributesCompatParcelizer > 0 ? this.write[0] : p0;
    }

    public final int IconCompatParcelizer(long p0) {
        write(this.AudioAttributesCompatParcelizer + 1);
        int i = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = i + 1;
        int i2 = read();
        this.write[i] = p0;
        this.read[i] = i2;
        this.IconCompatParcelizer[i2] = i;
        read(i);
        return i2;
    }

    public final void IconCompatParcelizer(int p0) {
        int i = this.IconCompatParcelizer[p0];
        RemoteActionCompatParcelizer(i, this.AudioAttributesCompatParcelizer - 1);
        this.AudioAttributesCompatParcelizer--;
        read(i);
        AudioAttributesCompatParcelizer(i);
        RemoteActionCompatParcelizer(p0);
    }

    private final void read(int p0) {
        long[] jArr = this.write;
        long j = jArr[p0];
        while (p0 > 0) {
            int i = ((p0 + 1) >> 1) - 1;
            if (toMagicModuleMetaRepoModel.read(jArr[i], j) <= 0) {
                return;
            }
            RemoteActionCompatParcelizer(i, p0);
            p0 = i;
        }
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        long[] jArr = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        while (p0 < (i >> 1)) {
            int i2 = (p0 + 1) << 1;
            int i3 = i2 - 1;
            if (i2 < this.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.read(jArr[i2], jArr[i3]) < 0) {
                if (toMagicModuleMetaRepoModel.read(jArr[i2], jArr[p0]) >= 0) {
                    return;
                }
                RemoteActionCompatParcelizer(i2, p0);
                p0 = i2;
            } else {
                if (toMagicModuleMetaRepoModel.read(jArr[i3], jArr[p0]) >= 0) {
                    return;
                }
                RemoteActionCompatParcelizer(i3, p0);
                p0 = i3;
            }
        }
    }

    private final void RemoteActionCompatParcelizer(int p0, int p1) {
        long[] jArr = this.write;
        int[] iArr = this.read;
        int[] iArr2 = this.IconCompatParcelizer;
        long j = jArr[p0];
        jArr[p0] = jArr[p1];
        jArr[p1] = j;
        int i = iArr[p0];
        int i2 = iArr[p1];
        iArr[p0] = i2;
        iArr[p1] = i;
        iArr2[i2] = p0;
        iArr2[i] = p1;
    }

    private final void write(int p0) {
        int length = this.write.length;
        if (p0 <= length) {
            return;
        }
        int i = length << 1;
        long[] jArrWrite = toDecimal.write(i);
        int[] iArr = new int[i];
        long[] jArr = this.write;
        getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArrWrite, 0, 0, jArr.length);
        getOrderDetails.RemoteActionCompatParcelizer(this.read, iArr, 0, 0, 14);
        this.write = jArrWrite;
        this.read = iArr;
    }

    private final int read() {
        int length = this.IconCompatParcelizer.length;
        if (this.RemoteActionCompatParcelizer >= length) {
            int i = length << 1;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            getOrderDetails.RemoteActionCompatParcelizer(this.IconCompatParcelizer, iArr, 0, 0, 14);
            this.IconCompatParcelizer = iArr;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = this.IconCompatParcelizer[i4];
        return i4;
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        this.IconCompatParcelizer[p0] = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = p0;
    }
}
