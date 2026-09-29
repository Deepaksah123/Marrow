package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class getStateResult<T> implements getTopRankers<T> {
    private final getCreatedOnDateMs<T> IconCompatParcelizer;
    private final getAnswerMap<T, T> read;

    public static final class write implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ getStateResult<T> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer = -2;
        private T write;

        write(getStateResult<T> getstateresult) {
            this.AudioAttributesCompatParcelizer = getstateresult;
        }

        private final void IconCompatParcelizer() {
            T t;
            if (this.IconCompatParcelizer == -2) {
                t = (T) ((getStateResult) this.AudioAttributesCompatParcelizer).IconCompatParcelizer.invoke();
            } else {
                getAnswerMap getanswermap = ((getStateResult) this.AudioAttributesCompatParcelizer).read;
                T t2 = this.write;
                toMagicModuleMetaRepoModel.write(t2);
                t = (T) getanswermap.invoke(t2);
            }
            this.write = t;
            this.IconCompatParcelizer = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.IconCompatParcelizer < 0) {
                IconCompatParcelizer();
            }
            if (this.IconCompatParcelizer == 0) {
                throw new NoSuchElementException();
            }
            T t = this.write;
            toMagicModuleMetaRepoModel.read(t, "");
            this.IconCompatParcelizer = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.IconCompatParcelizer < 0) {
                IconCompatParcelizer();
            }
            return this.IconCompatParcelizer == 1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getStateResult(getCreatedOnDateMs<? extends T> getcreatedondatems, getAnswerMap<? super T, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.IconCompatParcelizer = getcreatedondatems;
        this.read = getanswermap;
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        return new write(this);
    }
}
