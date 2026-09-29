package kotlin;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class UserConfig<V> extends setPrice<V> implements Collection<V> {
    private final getLoggedUser<?, V> write;

    public UserConfig(getLoggedUser<?, V> getloggeduser) {
        toMagicModuleMetaRepoModel.write(getloggeduser, "");
        this.write = getloggeduser;
    }

    @Override // kotlin.setPrice
    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.write.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.write.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.write.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.write.AudioAttributesImplBaseParcelizer();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.write.IconCompatParcelizer(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.write.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.write.read();
        return super.retainAll(collection);
    }
}
