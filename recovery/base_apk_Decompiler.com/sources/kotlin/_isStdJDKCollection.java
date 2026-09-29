package kotlin;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
public final class _isStdJDKCollection<K, V> extends LinkedHashMap<K, V> {
    private static final _isStdJDKCollection RemoteActionCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer;

    private _isStdJDKCollection() {
        this.AudioAttributesCompatParcelizer = true;
    }

    private _isStdJDKCollection(Map<K, V> map) {
        super(map);
        this.AudioAttributesCompatParcelizer = true;
    }

    static {
        _isStdJDKCollection _isstdjdkcollection = new _isStdJDKCollection();
        RemoteActionCompatParcelizer = _isstdjdkcollection;
        _isstdjdkcollection.read();
    }

    public static <K, V> _isStdJDKCollection<K, V> IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(_isStdJDKCollection<K, V> _isstdjdkcollection) {
        AudioAttributesCompatParcelizer();
        if (_isstdjdkcollection.isEmpty()) {
            return;
        }
        putAll(_isstdjdkcollection);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        AudioAttributesCompatParcelizer();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        AudioAttributesCompatParcelizer();
        forDeserialization.read(k);
        forDeserialization.read(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        AudioAttributesCompatParcelizer();
        read(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        AudioAttributesCompatParcelizer();
        return (V) super.remove(obj);
    }

    private static void read(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            forDeserialization.read(obj);
            forDeserialization.read(map.get(obj));
        }
    }

    private static boolean read(Object obj, Object obj2) {
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
            if (!map2.containsKey(entry.getKey()) || !read(entry.getValue(), map2.get(entry.getKey()))) {
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
            return forDeserialization.RemoteActionCompatParcelizer((byte[]) obj);
        }
        if (obj instanceof forDeserialization.IconCompatParcelizer) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static <K, V> int RemoteActionCompatParcelizer(Map<K, V> map) {
        int iAudioAttributesCompatParcelizer = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer(entry.getValue()) ^ AudioAttributesCompatParcelizer(entry.getKey());
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return RemoteActionCompatParcelizer(this);
    }

    public final _isStdJDKCollection<K, V> RemoteActionCompatParcelizer() {
        return isEmpty() ? new _isStdJDKCollection<>() : new _isStdJDKCollection<>(this);
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer = false;
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    private void AudioAttributesCompatParcelizer() {
        if (!write()) {
            throw new UnsupportedOperationException();
        }
    }
}
