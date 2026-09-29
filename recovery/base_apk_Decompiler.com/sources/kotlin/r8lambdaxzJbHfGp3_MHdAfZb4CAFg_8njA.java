package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaxzJbHfGp3_MHdAfZb4CAFg_8njA<T> implements Iterator<T>, getCurrentAnsweredMcqProgress {
    private int read;
    private final T[] write;

    public r8lambdaxzJbHfGp3_MHdAfZb4CAFg_8njA(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        this.write = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read < this.write.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.write;
            int i = this.read;
            this.read = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.read--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
