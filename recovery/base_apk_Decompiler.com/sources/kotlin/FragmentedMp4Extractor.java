package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentedMp4Extractor<K, V> extends getDrmInitDataFromAtoms implements Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.getDrmInitDataFromAtoms
    public abstract Map<K, V> delegate();

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return delegate().values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        parseSaiz.AudioAttributesCompatParcelizer((Map) this, (Map) map);
    }

    protected V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (parseSmta.AudioAttributesCompatParcelizer(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        parseSaio.write(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return parseSaiz.write(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return parseSaiz.read(this, obj);
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public boolean standardEquals(Object obj) {
        return parseSaiz.AudioAttributesCompatParcelizer(this, obj);
    }

    public int standardHashCode() {
        return modifyTrack.AudioAttributesCompatParcelizer(entrySet());
    }

    protected String standardToString() {
        return parseSaiz.IconCompatParcelizer(this);
    }
}
