package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setGroupTitle implements Iterator<Byte>, getCurrentAnsweredMcqProgress {
    public abstract byte IconCompatParcelizer();

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(IconCompatParcelizer());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
