package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getMcqGuessedMap implements Iterator<Long>, getCurrentAnsweredMcqProgress {
    public abstract long AudioAttributesCompatParcelizer();

    @Override // java.util.Iterator
    public /* synthetic */ Long next() {
        return Long.valueOf(AudioAttributesCompatParcelizer());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
