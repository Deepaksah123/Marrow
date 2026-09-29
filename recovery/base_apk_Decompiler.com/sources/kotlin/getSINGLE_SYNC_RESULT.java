package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getSINGLE_SYNC_RESULT implements Iterator<Integer>, getCurrentAnsweredMcqProgress {
    public abstract int RemoteActionCompatParcelizer();

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(RemoteActionCompatParcelizer());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
