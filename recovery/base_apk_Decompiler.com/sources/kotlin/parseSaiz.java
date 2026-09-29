package kotlin;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.modifyTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSaiz {
    static <K, V> Iterator<K> read(Iterator<Map.Entry<K, V>> it) {
        return new getCurrentSamplePresentationTimeUs<Map.Entry<K, V>, K>(it) { // from class: o.parseSaiz.4
            @Override // kotlin.getCurrentSamplePresentationTimeUs
            final /* synthetic */ Object write(Object obj) {
                return AudioAttributesCompatParcelizer((Map.Entry) obj);
            }

            private static K AudioAttributesCompatParcelizer(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> Iterator<V> AudioAttributesCompatParcelizer(Iterator<Map.Entry<K, V>> it) {
        return new getCurrentSamplePresentationTimeUs<Map.Entry<K, V>, V>(it) { // from class: o.parseSaiz.5
            @Override // kotlin.getCurrentSamplePresentationTimeUs
            final /* synthetic */ Object write(Object obj) {
                return AudioAttributesCompatParcelizer((Map.Entry) obj);
            }

            private static V AudioAttributesCompatParcelizer(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <K, V> HashMap<K, V> read(int i) {
        return new HashMap<>(AudioAttributesCompatParcelizer(i));
    }

    static int AudioAttributesCompatParcelizer(int i) {
        if (i < 3) {
            FixedSampleSizeRechunker.IconCompatParcelizer(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> IdentityHashMap<K, V> read() {
        return new IdentityHashMap<>();
    }

    public static <K, V> Map.Entry<K, V> IconCompatParcelizer(K k, V v) {
        return new isEdtsListDurationForEntireMediaTimeline(k, v);
    }

    static abstract class write<K, V> extends AbstractMap<K, V> {
        private transient Set<Map.Entry<K, V>> AudioAttributesCompatParcelizer;
        private transient Set<K> read;
        private transient Collection<V> write;

        abstract Set<Map.Entry<K, V>> RemoteActionCompatParcelizer();

        write() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.AudioAttributesCompatParcelizer;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer = setRemoteActionCompatParcelizer;
            return setRemoteActionCompatParcelizer;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            Set<K> set = this.read;
            if (set != null) {
                return set;
            }
            Set<K> setAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            this.read = setAudioAttributesCompatParcelizer;
            return setAudioAttributesCompatParcelizer;
        }

        Set<K> AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.write;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionIconCompatParcelizer = IconCompatParcelizer();
            this.write = collectionIconCompatParcelizer;
            return collectionIconCompatParcelizer;
        }

        private Collection<V> IconCompatParcelizer() {
            return new read(this);
        }
    }

    static <V> V RemoteActionCompatParcelizer(Map<?, V> map, Object obj) {
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean IconCompatParcelizer(Map<?, ?> map, Object obj) {
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V MediaBrowserCompatCustomActionResultReceiver(Map<?, V> map, Object obj) {
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean write(Map<?, ?> map, Object obj) {
        return parseSaio.RemoteActionCompatParcelizer((Iterator<?>) read(map.entrySet().iterator()), obj);
    }

    static boolean read(Map<?, ?> map, Object obj) {
        return parseSaio.RemoteActionCompatParcelizer((Iterator<?>) AudioAttributesCompatParcelizer(map.entrySet().iterator()), obj);
    }

    static boolean AudioAttributesCompatParcelizer(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String IconCompatParcelizer(Map<?, ?> map) {
        StringBuilder sbWrite = DefaultSampleValues.write(map.size());
        sbWrite.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbWrite.append(", ");
            }
            sbWrite.append(entry.getKey());
            sbWrite.append('=');
            sbWrite.append(entry.getValue());
            z = false;
        }
        sbWrite.append('}');
        return sbWrite.toString();
    }

    static <K, V> void AudioAttributesCompatParcelizer(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static class IconCompatParcelizer<K, V> extends modifyTrack.RemoteActionCompatParcelizer<K> {
        private Map<K, V> AudioAttributesCompatParcelizer;

        IconCompatParcelizer(Map<K, V> map) {
            this.AudioAttributesCompatParcelizer = (Map) parseStsd.IconCompatParcelizer(map);
        }

        final Map<K, V> write() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return parseSaiz.read(write().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return write().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return write().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return write().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            write().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            write().clear();
        }
    }

    static class read<K, V> extends AbstractCollection<V> {
        private Map<K, V> read;

        read(Map<K, V> map) {
            this.read = (Map) parseStsd.IconCompatParcelizer(map);
        }

        private Map<K, V> IconCompatParcelizer() {
            return this.read;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return parseSaiz.AudioAttributesCompatParcelizer(IconCompatParcelizer().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.IconCompatParcelizer().entrySet()) {
                    if (parseSmta.AudioAttributesCompatParcelizer(obj, entry.getValue())) {
                        this.IconCompatParcelizer().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) parseStsd.IconCompatParcelizer(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetWrite = modifyTrack.write();
                for (Map.Entry<K, V> entry : this.IconCompatParcelizer().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetWrite.add(entry.getKey());
                    }
                }
                return this.IconCompatParcelizer().keySet().removeAll(hashSetWrite);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) parseStsd.IconCompatParcelizer(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetWrite = modifyTrack.write();
                for (Map.Entry<K, V> entry : this.IconCompatParcelizer().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetWrite.add(entry.getKey());
                    }
                }
                return this.IconCompatParcelizer().keySet().retainAll(hashSetWrite);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return IconCompatParcelizer().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return IconCompatParcelizer().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return IconCompatParcelizer().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            IconCompatParcelizer().clear();
        }
    }

    static abstract class RemoteActionCompatParcelizer<K, V> extends modifyTrack.RemoteActionCompatParcelizer<Map.Entry<K, V>> {
        abstract Map<K, V> read();

        RemoteActionCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return read().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            read().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objRemoteActionCompatParcelizer = parseSaiz.RemoteActionCompatParcelizer(read(), key);
            if (parseSmta.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, entry.getValue())) {
                return objRemoteActionCompatParcelizer != null || read().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return read().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return read().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // o.modifyTrack.RemoteActionCompatParcelizer, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) parseStsd.IconCompatParcelizer(collection));
            } catch (UnsupportedOperationException unused) {
                return modifyTrack.read(this, collection.iterator());
            }
        }

        @Override // o.modifyTrack.RemoteActionCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) parseStsd.IconCompatParcelizer(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = modifyTrack.read(collection.size());
                for (Object obj : collection) {
                    if (this.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return this.read().keySet().retainAll(hashSet);
            }
        }
    }
}
