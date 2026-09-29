package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getStatusTimestamp<T, R> implements getTopRankers<R> {
    private final getAnswerMap<T, R> RemoteActionCompatParcelizer;
    private final getTopRankers<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getStatusTimestamp(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.read = gettoprankers;
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public static final class AudioAttributesCompatParcelizer implements Iterator<R>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ getStatusTimestamp<T, R> IconCompatParcelizer;
        private final Iterator<T> read;

        AudioAttributesCompatParcelizer(getStatusTimestamp<T, R> getstatustimestamp) {
            this.IconCompatParcelizer = getstatustimestamp;
            this.read = ((getStatusTimestamp) getstatustimestamp).read.write();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) ((getStatusTimestamp) this.IconCompatParcelizer).RemoteActionCompatParcelizer.invoke(this.read.next());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.read.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<R> write() {
        return new AudioAttributesCompatParcelizer(this);
    }

    public final <E> getTopRankers<E> read(getAnswerMap<? super R, ? extends Iterator<? extends E>> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new ShowHideItems(this.read, this.RemoteActionCompatParcelizer, getanswermap);
    }
}
