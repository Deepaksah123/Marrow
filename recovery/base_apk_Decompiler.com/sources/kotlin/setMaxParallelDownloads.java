package kotlin;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class setMaxParallelDownloads<K, V> extends LinkedHashMap<K, V> {
    private static final setMaxParallelDownloads<?, ?> write;
    private boolean read;

    private setMaxParallelDownloads() {
        this.read = true;
    }

    private setMaxParallelDownloads(Map<K, V> map) {
        super(map);
        this.read = true;
    }

    static {
        setMaxParallelDownloads<?, ?> setmaxparalleldownloads = new setMaxParallelDownloads<>();
        write = setmaxparalleldownloads;
        setmaxparalleldownloads.write();
    }

    public static <K, V> setMaxParallelDownloads<K, V> AudioAttributesCompatParcelizer() {
        return (setMaxParallelDownloads<K, V>) write;
    }

    public final void write(setMaxParallelDownloads<K, V> setmaxparalleldownloads) {
        RemoteActionCompatParcelizer();
        if (setmaxparalleldownloads.isEmpty()) {
            return;
        }
        putAll(setmaxparalleldownloads);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        RemoteActionCompatParcelizer();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        RemoteActionCompatParcelizer();
        getDownloadIndex.RemoteActionCompatParcelizer(k);
        getDownloadIndex.RemoteActionCompatParcelizer(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        RemoteActionCompatParcelizer();
        read(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        RemoteActionCompatParcelizer();
        return (V) super.remove(obj);
    }

    private static void read(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            getDownloadIndex.RemoteActionCompatParcelizer(obj);
            getDownloadIndex.RemoteActionCompatParcelizer(map.get(obj));
        }
    }

    private static boolean write(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    private static <K, V> boolean IconCompatParcelizer(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !write(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && IconCompatParcelizer(this, (Map) obj);
    }

    private static int AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof byte[]) {
            return getDownloadIndex.AudioAttributesCompatParcelizer((byte[]) obj);
        }
        if (obj instanceof getDownloadIndex.write) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static <K, V> int IconCompatParcelizer(Map<K, V> map) {
        int iAudioAttributesCompatParcelizer = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer(entry.getValue()) ^ AudioAttributesCompatParcelizer(entry.getKey());
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return IconCompatParcelizer(this);
    }

    public final setMaxParallelDownloads<K, V> read() {
        return isEmpty() ? new setMaxParallelDownloads<>() : new setMaxParallelDownloads<>(this);
    }

    public final void write() {
        this.read = false;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    private void RemoteActionCompatParcelizer() {
        if (!IconCompatParcelizer()) {
            throw new UnsupportedOperationException();
        }
    }
}
