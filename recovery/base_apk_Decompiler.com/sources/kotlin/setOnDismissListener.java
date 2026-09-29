package kotlin;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
final class setOnDismissListener<K, V> implements Map<K, V>, getCurrentAnsweredMcqProgress {
    private setMenu<K, V> AudioAttributesCompatParcelizer;
    private setOverflowReserved<K, V> IconCompatParcelizer;
    private final AppCompatButton<K, V> RemoteActionCompatParcelizer;
    private AppCompatCheckedTextView<K, V> write;

    public setOnDismissListener(AppCompatButton<K, V> appCompatButton) {
        toMagicModuleMetaRepoModel.write(appCompatButton, "");
        this.RemoteActionCompatParcelizer = appCompatButton;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return RemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return read();
    }

    @Override // java.util.Map
    public final int size() {
        return IconCompatParcelizer();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return write();
    }

    private Set<Map.Entry<K, V>> RemoteActionCompatParcelizer() {
        setMenu<K, V> setmenu = this.AudioAttributesCompatParcelizer;
        if (setmenu != null) {
            return setmenu;
        }
        setMenu<K, V> setmenu2 = new setMenu<>(this.RemoteActionCompatParcelizer);
        this.AudioAttributesCompatParcelizer = setmenu2;
        return setmenu2;
    }

    private Set<K> read() {
        setOverflowReserved<K, V> setoverflowreserved = this.IconCompatParcelizer;
        if (setoverflowreserved != null) {
            return setoverflowreserved;
        }
        setOverflowReserved<K, V> setoverflowreserved2 = new setOverflowReserved<>(this.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = setoverflowreserved2;
        return setoverflowreserved2;
    }

    private Collection<V> write() {
        AppCompatCheckedTextView<K, V> appCompatCheckedTextView = this.write;
        if (appCompatCheckedTextView != null) {
            return appCompatCheckedTextView;
        }
        AppCompatCheckedTextView<K, V> appCompatCheckedTextView2 = new AppCompatCheckedTextView<>(this.RemoteActionCompatParcelizer);
        this.write = appCompatCheckedTextView2;
        return appCompatCheckedTextView2;
    }

    private int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.write;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(obj);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((setOnDismissListener) obj).RemoteActionCompatParcelizer);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
