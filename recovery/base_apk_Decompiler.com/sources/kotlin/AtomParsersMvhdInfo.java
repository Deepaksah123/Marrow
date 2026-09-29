package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class AtomParsersMvhdInfo<E> extends FragmentedMp4ExtractorTrackBundle<E> {
    private final int IconCompatParcelizer;
    private int read;

    protected abstract E RemoteActionCompatParcelizer(int i);

    protected AtomParsersMvhdInfo(int i, int i2) {
        parseStsd.read(i2, i);
        this.IconCompatParcelizer = i;
        this.read = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.read < this.IconCompatParcelizer;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.read;
        this.read = i + 1;
        return RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.read;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.read > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.read - 1;
        this.read = i;
        return RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.read - 1;
    }
}
