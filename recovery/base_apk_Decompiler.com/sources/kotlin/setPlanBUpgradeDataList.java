package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setPlanBUpgradeDataList implements Iterator<Character>, getCurrentAnsweredMcqProgress {
    public abstract char write();

    @Override // java.util.Iterator
    public /* synthetic */ Character next() {
        return Character.valueOf(write());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
