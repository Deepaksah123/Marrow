package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class UserConfigCreator<E> extends getCardContent<E> implements Set<E> {
    private final getLoggedUser<E, ?> IconCompatParcelizer;

    public UserConfigCreator(getLoggedUser<E, ?> getloggeduser) {
        toMagicModuleMetaRepoModel.write(getloggeduser, "");
        this.IconCompatParcelizer = getloggeduser;
    }

    @Override // kotlin.getCardContent
    public final int read() {
        return this.IconCompatParcelizer.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.IconCompatParcelizer.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.IconCompatParcelizer.read();
        return super.retainAll(collection);
    }
}
