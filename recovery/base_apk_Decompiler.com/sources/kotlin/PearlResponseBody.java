package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class PearlResponseBody<E> extends AtomicReferenceArray<E> implements toUiModel<E> {
    private static final Integer IconCompatParcelizer = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private int AudioAttributesCompatParcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private AtomicLong RemoteActionCompatParcelizer;
    private AtomicLong read;
    private int write;

    private static int read(long j, int i) {
        return ((int) j) & i;
    }

    public PearlResponseBody(int i) {
        super(getExpiresOn.AudioAttributesCompatParcelizer(i));
        this.write = length() - 1;
        this.read = new AtomicLong();
        this.RemoteActionCompatParcelizer = new AtomicLong();
        this.AudioAttributesCompatParcelizer = Math.min(i / 4, IconCompatParcelizer.intValue());
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.write;
        long j = this.read.get();
        int i2 = read(j, i);
        if (j >= this.AudioAttributesImplBaseParcelizer) {
            long j2 = ((long) this.AudioAttributesCompatParcelizer) + j;
            if (write(read(j2, i)) == null) {
                this.AudioAttributesImplBaseParcelizer = j2;
            } else if (write(i2) != null) {
                return false;
            }
        }
        AudioAttributesCompatParcelizer(i2, e);
        read(j + 1);
        return true;
    }

    @Override // kotlin.toUiModel, kotlin.toLSModel
    public final E read() {
        long j = this.RemoteActionCompatParcelizer.get();
        int iIconCompatParcelizer = IconCompatParcelizer(j);
        E eWrite = write(iIconCompatParcelizer);
        if (eWrite == null) {
            return null;
        }
        write(j + 1);
        AudioAttributesCompatParcelizer(iIconCompatParcelizer, null);
        return eWrite;
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return this.read.get() == this.RemoteActionCompatParcelizer.get();
    }

    private void read(long j) {
        this.read.lazySet(j);
    }

    private void write(long j) {
        this.RemoteActionCompatParcelizer.lazySet(j);
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        while (true) {
            if (read() == null && IconCompatParcelizer()) {
                return;
            }
        }
    }

    private int IconCompatParcelizer(long j) {
        return this.write & ((int) j);
    }

    private void AudioAttributesCompatParcelizer(int i, E e) {
        lazySet(i, e);
    }

    private E write(int i) {
        return get(i);
    }
}
