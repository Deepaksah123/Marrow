package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncResultKt<T> implements Iterator<SyncResult<? extends T>>, getCurrentAnsweredMcqProgress {
    private final Iterator<T> RemoteActionCompatParcelizer;
    private int read;

    /* JADX WARN: Multi-variable type inference failed */
    public SyncResultKt(Iterator<? extends T> it) {
        toMagicModuleMetaRepoModel.write(it, "");
        this.RemoteActionCompatParcelizer = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public SyncResult<T> next() {
        int i = this.read;
        this.read = i + 1;
        if (i < 0) {
            IntermediateLoginResponseBody.read();
        }
        return new SyncResult<>(i, this.RemoteActionCompatParcelizer.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
