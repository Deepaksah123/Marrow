package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassNameIdResolver<V> {
    private V[] AudioAttributesCompatParcelizer;
    private long[] IconCompatParcelizer;
    private int read;
    private int write;

    public ClassNameIdResolver() {
        this((byte) 0);
    }

    private ClassNameIdResolver(byte b) {
        this.IconCompatParcelizer = new long[10];
        this.AudioAttributesCompatParcelizer = (V[]) write(10);
    }

    public final void AudioAttributesCompatParcelizer(long j, V v) {
        synchronized (this) {
            write(j);
            RemoteActionCompatParcelizer();
            RemoteActionCompatParcelizer(j, v);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            this.read = 0;
            this.write = 0;
            Arrays.fill(this.AudioAttributesCompatParcelizer, (Object) null);
        }
    }

    public final int read() {
        int i;
        synchronized (this) {
            i = this.write;
        }
        return i;
    }

    public final V IconCompatParcelizer() {
        V vWrite;
        synchronized (this) {
            vWrite = this.write == 0 ? null : write();
        }
        return vWrite;
    }

    public final V read(long j) {
        V vIconCompatParcelizer;
        synchronized (this) {
            vIconCompatParcelizer = IconCompatParcelizer(j, true);
        }
        return vIconCompatParcelizer;
    }

    public final V AudioAttributesCompatParcelizer(long j) {
        V vIconCompatParcelizer;
        synchronized (this) {
            vIconCompatParcelizer = IconCompatParcelizer(j, false);
        }
        return vIconCompatParcelizer;
    }

    private V IconCompatParcelizer(long j, boolean z) {
        V vWrite = null;
        long j2 = Long.MAX_VALUE;
        while (this.write > 0) {
            long j3 = j - this.IconCompatParcelizer[this.read];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vWrite = write();
            j2 = j3;
        }
        return vWrite;
    }

    private V write() {
        buildTypeSerializer.write(this.write > 0);
        V[] vArr = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        V v = vArr[i];
        vArr[i] = null;
        this.read = (i + 1) % vArr.length;
        this.write--;
        return v;
    }

    private void write(long j) {
        if (this.write > 0) {
            int i = this.read;
            if (j <= this.IconCompatParcelizer[((i + r0) - 1) % this.AudioAttributesCompatParcelizer.length]) {
                AudioAttributesCompatParcelizer();
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        int length = this.AudioAttributesCompatParcelizer.length;
        if (this.write < length) {
            return;
        }
        int i = length << 1;
        long[] jArr = new long[i];
        V[] vArr = (V[]) write(i);
        int i2 = this.read;
        int i3 = length - i2;
        System.arraycopy(this.IconCompatParcelizer, i2, jArr, 0, i3);
        System.arraycopy(this.AudioAttributesCompatParcelizer, this.read, vArr, 0, i3);
        int i4 = this.read;
        if (i4 > 0) {
            System.arraycopy(this.IconCompatParcelizer, 0, jArr, i3, i4);
            System.arraycopy(this.AudioAttributesCompatParcelizer, 0, vArr, i3, this.read);
        }
        this.IconCompatParcelizer = jArr;
        this.AudioAttributesCompatParcelizer = vArr;
        this.read = 0;
    }

    private void RemoteActionCompatParcelizer(long j, V v) {
        int i = this.read;
        int i2 = this.write;
        V[] vArr = this.AudioAttributesCompatParcelizer;
        int length = (i + i2) % vArr.length;
        this.IconCompatParcelizer[length] = j;
        vArr[length] = v;
        this.write = i2 + 1;
    }

    private static <V> V[] write(int i) {
        return (V[]) new Object[i];
    }
}
