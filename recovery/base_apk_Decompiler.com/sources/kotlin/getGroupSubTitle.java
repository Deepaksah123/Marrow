package kotlin;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getGroupSubTitle<K, V> extends AbstractMap<K, V> implements Map<K, V>, getModuleId {
    public abstract Set<Map.Entry<K, V>> read();

    public Collection<Object> AudioAttributesImplApi26Parcelizer() {
        return super.values();
    }

    public int AudioAttributesImplBaseParcelizer() {
        return super.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return read();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return (Set<K>) write();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return AudioAttributesImplBaseParcelizer();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) AudioAttributesImplApi26Parcelizer();
    }

    public Set<Object> write() {
        return super.keySet();
    }
}
