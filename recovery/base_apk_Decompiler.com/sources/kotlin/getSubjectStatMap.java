package kotlin;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubjectStatMap<V> implements Map<Class<?>, V> {
    private final Map<String, V> read;

    @Override // java.util.Map
    public final /* synthetic */ Object put(Class<?> cls, Object obj) {
        return write();
    }

    public static <V> Map<Class<?>, V> read(Map<String, V> map) {
        return new getSubjectStatMap(map);
    }

    private getSubjectStatMap(Map<String, V> map) {
        this.read = map;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.read.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.read.values();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.read.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.read.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.read.containsValue(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.read.size();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    private static V write() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }
}
