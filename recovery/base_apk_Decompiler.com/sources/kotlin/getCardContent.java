package kotlin;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCardContent<E> extends AbstractSet<E> implements Set<E>, FinalDataRsModel {
    public abstract int read();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return read();
    }
}
