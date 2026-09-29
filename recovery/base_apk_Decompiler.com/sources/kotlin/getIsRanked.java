package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getIsRanked<T> implements isExpanded<T> {
    private final int IconCompatParcelizer;
    private final getTopRankers<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getIsRanked(getTopRankers<? extends T> gettoprankers, int i) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        this.read = gettoprankers;
        this.IconCompatParcelizer = i;
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("count must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> read(int i) {
        int i2 = this.IconCompatParcelizer;
        return i >= i2 ? StateResult.AudioAttributesCompatParcelizer() : new TestAttendeeData(this.read, i, i2);
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> IconCompatParcelizer(int i) {
        return 5 >= this.IconCompatParcelizer ? this : new getIsRanked(this.read, 5);
    }

    public static final class write implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private int IconCompatParcelizer;
        private final Iterator<T> write;

        write(getIsRanked<T> getisranked) {
            this.IconCompatParcelizer = ((getIsRanked) getisranked).IconCompatParcelizer;
            this.write = ((getIsRanked) getisranked).read.write();
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.IconCompatParcelizer = i - 1;
            return this.write.next();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer > 0 && this.write.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        return new write(this);
    }
}
