package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class setNeetComparison<T> implements getTopRankers<T> {
    private final getTopRankers<T> RemoteActionCompatParcelizer;
    private final getAnswerMap<T, Boolean> read;

    /* JADX WARN: Multi-variable type inference failed */
    public setNeetComparison(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.RemoteActionCompatParcelizer = gettoprankers;
        this.read = getanswermap;
    }

    public static final class read implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private T AudioAttributesCompatParcelizer;
        private final Iterator<T> IconCompatParcelizer;
        private /* synthetic */ setNeetComparison<T> RemoteActionCompatParcelizer;
        private int read = -1;

        read(setNeetComparison<T> setneetcomparison) {
            this.RemoteActionCompatParcelizer = setneetcomparison;
            this.IconCompatParcelizer = ((setNeetComparison) setneetcomparison).RemoteActionCompatParcelizer.write();
        }

        private final void write() {
            if (this.IconCompatParcelizer.hasNext()) {
                T next = this.IconCompatParcelizer.next();
                if (((Boolean) ((setNeetComparison) this.RemoteActionCompatParcelizer).read.invoke(next)).booleanValue()) {
                    this.read = 1;
                    this.AudioAttributesCompatParcelizer = next;
                    return;
                }
            }
            this.read = 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.read == -1) {
                write();
            }
            if (this.read == 0) {
                throw new NoSuchElementException();
            }
            T t = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
            this.read = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.read == -1) {
                write();
            }
            return this.read == 1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        return new read(this);
    }
}
