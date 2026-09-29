package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidFormatException<T> implements Iterator<T>, getCurrentAnsweredMcqProgress {
    private Iterator<? extends T> RemoteActionCompatParcelizer;
    private final List<Iterator<T>> read = new ArrayList();
    private final getAnswerMap<T, Iterator<T>> write;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidFormatException(Iterator<? extends T> it, getAnswerMap<? super T, ? extends Iterator<? extends T>> getanswermap) {
        this.write = getanswermap;
        this.RemoteActionCompatParcelizer = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.RemoteActionCompatParcelizer.next();
        read(next);
        return next;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void read(T t) {
        Iterator<T> itInvoke = this.write.invoke(t);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.read.add((Iterator<T>) this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer = itInvoke;
        } else {
            while (!this.RemoteActionCompatParcelizer.hasNext() && !this.read.isEmpty()) {
                this.RemoteActionCompatParcelizer = (Iterator) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.read);
                IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((List) this.read);
            }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
