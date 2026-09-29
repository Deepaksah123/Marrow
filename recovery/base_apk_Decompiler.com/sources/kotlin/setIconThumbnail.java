package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class setIconThumbnail<T> extends setSearchTimes<T> {
    private final T RemoteActionCompatParcelizer;
    private final int write;

    @Override // kotlin.setSearchTimes
    public final int RemoteActionCompatParcelizer() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setIconThumbnail(T t, int i) {
        super((byte) 0);
        toMagicModuleMetaRepoModel.write(t, "");
        this.RemoteActionCompatParcelizer = t;
        this.write = i;
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.setSearchTimes
    public final void AudioAttributesCompatParcelizer(int i, T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        throw new IllegalStateException();
    }

    @Override // kotlin.setSearchTimes
    public final T AudioAttributesCompatParcelizer(int i) {
        if (i == this.write) {
            return this.RemoteActionCompatParcelizer;
        }
        return null;
    }

    public static final class IconCompatParcelizer implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private boolean AudioAttributesCompatParcelizer = true;
        private /* synthetic */ setIconThumbnail<T> RemoteActionCompatParcelizer;

        IconCompatParcelizer(setIconThumbnail<T> seticonthumbnail) {
            this.RemoteActionCompatParcelizer = seticonthumbnail;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.setSearchTimes, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new IconCompatParcelizer(this);
    }
}
