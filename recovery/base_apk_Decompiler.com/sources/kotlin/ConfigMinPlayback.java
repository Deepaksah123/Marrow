package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigMinPlayback<K, V> extends SyncUserResponse<Map.Entry<K, V>, K, V> {
    private final getLoggedUser<K, V> AudioAttributesCompatParcelizer;

    public ConfigMinPlayback(getLoggedUser<K, V> getloggeduser) {
        toMagicModuleMetaRepoModel.write(getloggeduser, "");
        this.AudioAttributesCompatParcelizer = getloggeduser;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        return RemoteActionCompatParcelizer((Map.Entry) obj);
    }

    @Override // kotlin.getCardContent
    public final int read() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // kotlin.SyncUserResponse
    public final boolean IconCompatParcelizer(Map.Entry<? extends K, ? extends V> entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        return this.AudioAttributesCompatParcelizer.write((Map.Entry) entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.AudioAttributesCompatParcelizer.clear();
    }

    private static boolean RemoteActionCompatParcelizer(Map.Entry<K, V> entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.SyncUserResponse
    public final boolean read(Map.Entry<K, V> entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((Map.Entry) entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return this.AudioAttributesCompatParcelizer.read(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.AudioAttributesCompatParcelizer.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.AudioAttributesCompatParcelizer.read();
        return super.retainAll(collection);
    }
}
