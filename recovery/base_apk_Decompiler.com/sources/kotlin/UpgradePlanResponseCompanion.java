package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UpgradePlanResponseCompanion<T> implements Iterator<T>, getCurrentAnsweredMcqProgress {
    private int read;
    private T write;

    protected abstract void write();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.read;
        if (i == 0) {
            return AudioAttributesCompatParcelizer();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.read;
        if (i == 1) {
            this.read = 0;
            return this.write;
        }
        if (i == 2 || !AudioAttributesCompatParcelizer()) {
            throw new NoSuchElementException();
        }
        this.read = 0;
        return this.write;
    }

    private final boolean AudioAttributesCompatParcelizer() {
        this.read = 3;
        write();
        return this.read == 1;
    }

    protected final void RemoteActionCompatParcelizer(T t) {
        this.write = t;
        this.read = 1;
    }

    protected final void read() {
        this.read = 2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
