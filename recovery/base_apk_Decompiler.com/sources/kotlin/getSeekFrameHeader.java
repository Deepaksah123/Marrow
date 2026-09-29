package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
abstract class getSeekFrameHeader extends disableSeeking {
    private int RemoteActionCompatParcelizer;
    private final int read;

    protected getSeekFrameHeader(int i, int i2) {
        getId3TlenUs.write(i2, i);
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return read(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.RemoteActionCompatParcelizer - 1;
        this.RemoteActionCompatParcelizer = i;
        return read(i);
    }

    protected abstract Object read(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.read;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.RemoteActionCompatParcelizer > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.RemoteActionCompatParcelizer - 1;
    }
}
