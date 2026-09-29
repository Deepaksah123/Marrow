package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class getCurrentSamplePresentationTimeUs<F, T> implements Iterator<T> {
    final Iterator<? extends F> IconCompatParcelizer;

    abstract T write(F f);

    getCurrentSamplePresentationTimeUs(Iterator<? extends F> it) {
        this.IconCompatParcelizer = (Iterator) parseStsd.IconCompatParcelizer(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.IconCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return write(this.IconCompatParcelizer.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.IconCompatParcelizer.remove();
    }
}
