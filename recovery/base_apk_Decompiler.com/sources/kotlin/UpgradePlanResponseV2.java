package kotlin;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UpgradePlanResponseV2<E> extends AbstractList<E> implements List<E>, getModulesCompleted {
    public abstract int write();

    public abstract E write(int i);

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        return write(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return write();
    }
}
