package kotlin;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class getCurrentSampleOffset<F, T> extends getCurrentSamplePresentationTimeUs<F, T> implements ListIterator<T> {
    getCurrentSampleOffset(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> IconCompatParcelizer() {
        return (ListIterator) this.IconCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return IconCompatParcelizer().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return write(IconCompatParcelizer().previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return IconCompatParcelizer().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return IconCompatParcelizer().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}
