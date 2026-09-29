package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class setInitialActivityCount<K, V> implements Map.Entry<K, V>, getCurrentAnsweredMcqProgress {
    private final V RemoteActionCompatParcelizer;
    private final K read;

    public setInitialActivityCount(K k, V v) {
        this.read = k;
        this.RemoteActionCompatParcelizer = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.read;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
