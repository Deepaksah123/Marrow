package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class synchronize implements Iterator {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected synchronize() {
    }
}
