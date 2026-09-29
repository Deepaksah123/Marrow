package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/getTestList;", "T", "Lo/getTopRankers;", "p0", "", "p1", "Lkotlin/Function1;", "p2", "<init>", "(Lo/getTopRankers;ZLo/getAnswerMap;)V", "", "write", "()Ljava/util/Iterator;", "read", "Lo/getTopRankers;", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTestList<T> implements getTopRankers<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<T, Boolean> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getTopRankers<T> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getTestList(getTopRankers<? extends T> gettoprankers, boolean z, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.IconCompatParcelizer = gettoprankers;
        this.RemoteActionCompatParcelizer = z;
        this.write = getanswermap;
    }

    public static final class write implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private final Iterator<T> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer = -1;
        private T read;
        private /* synthetic */ getTestList<T> write;

        write(getTestList<T> gettestlist) {
            this.write = gettestlist;
            this.IconCompatParcelizer = ((getTestList) gettestlist).IconCompatParcelizer.write();
        }

        private final void RemoteActionCompatParcelizer() {
            while (this.IconCompatParcelizer.hasNext()) {
                T next = this.IconCompatParcelizer.next();
                if (((Boolean) ((getTestList) this.write).write.invoke(next)).booleanValue() == ((getTestList) this.write).RemoteActionCompatParcelizer) {
                    this.read = next;
                    this.RemoteActionCompatParcelizer = 1;
                    return;
                }
            }
            this.RemoteActionCompatParcelizer = 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.RemoteActionCompatParcelizer == -1) {
                RemoteActionCompatParcelizer();
            }
            if (this.RemoteActionCompatParcelizer == 0) {
                throw new NoSuchElementException();
            }
            T t = this.read;
            this.read = null;
            this.RemoteActionCompatParcelizer = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.RemoteActionCompatParcelizer == -1) {
                RemoteActionCompatParcelizer();
            }
            return this.RemoteActionCompatParcelizer == 1;
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
