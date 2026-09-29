package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowHideItems<T, R, E> implements getTopRankers<E> {
    private final getTopRankers<T> AudioAttributesCompatParcelizer;
    private final getAnswerMap<T, R> IconCompatParcelizer;
    private final getAnswerMap<R, Iterator<E>> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowHideItems(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends R> getanswermap, getAnswerMap<? super R, ? extends Iterator<? extends E>> getanswermap2) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.AudioAttributesCompatParcelizer = gettoprankers;
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = getanswermap2;
    }

    public static final class IconCompatParcelizer implements Iterator<E>, getCurrentAnsweredMcqProgress {
        private int AudioAttributesCompatParcelizer;
        private Iterator<? extends E> IconCompatParcelizer;
        private final Iterator<T> read;
        private /* synthetic */ ShowHideItems<T, R, E> write;

        IconCompatParcelizer(ShowHideItems<T, R, E> showHideItems) {
            this.write = showHideItems;
            this.read = ((ShowHideItems) showHideItems).AudioAttributesCompatParcelizer.write();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !IconCompatParcelizer()) {
                throw new NoSuchElementException();
            }
            this.AudioAttributesCompatParcelizer = 0;
            Iterator<? extends E> it = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return IconCompatParcelizer();
        }

        private final boolean IconCompatParcelizer() {
            Iterator<? extends E> it = this.IconCompatParcelizer;
            if (it != null && it.hasNext()) {
                this.AudioAttributesCompatParcelizer = 1;
                return true;
            }
            while (this.read.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((ShowHideItems) this.write).RemoteActionCompatParcelizer.invoke(((ShowHideItems) this.write).IconCompatParcelizer.invoke(this.read.next()));
                if (it2.hasNext()) {
                    this.IconCompatParcelizer = it2;
                    this.AudioAttributesCompatParcelizer = 1;
                    return true;
                }
            }
            this.AudioAttributesCompatParcelizer = 2;
            this.IconCompatParcelizer = null;
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<E> write() {
        return new IconCompatParcelizer(this);
    }
}
