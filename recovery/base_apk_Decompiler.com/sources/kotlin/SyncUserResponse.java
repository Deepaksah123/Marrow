package kotlin;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SyncUserResponse<E extends Map.Entry<? extends K, ? extends V>, K, V> extends getCardContent<E> {
    public abstract boolean IconCompatParcelizer(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return RemoteActionCompatParcelizer((Map.Entry) obj);
        }
        return false;
    }

    public boolean read(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return read((Map.Entry) obj);
        }
        return false;
    }

    private boolean RemoteActionCompatParcelizer(E e) {
        toMagicModuleMetaRepoModel.write(e, "");
        return IconCompatParcelizer(e);
    }
}
