package kotlin;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.isPresent;

/* JADX INFO: loaded from: classes4.dex */
class getPrimaryType<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int AudioAttributesCompatParcelizer;
    private Map<K, V> AudioAttributesImplApi21Parcelizer;
    private Map<K, V> AudioAttributesImplApi26Parcelizer;
    private volatile getPrimaryType<K, V>.AudioAttributesImplBaseParcelizer IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private volatile getPrimaryType<K, V>.write read;
    private List<getPrimaryType<K, V>.read> write;

    /* synthetic */ getPrimaryType(int i, byte b) {
        this(i);
    }

    static <FieldDescriptorType extends isPresent.read<FieldDescriptorType>> getPrimaryType<FieldDescriptorType, Object> write(int i) {
        return (getPrimaryType<FieldDescriptorType, Object>) new getPrimaryType<FieldDescriptorType, Object>(i) { // from class: o.getPrimaryType.5
            {
                byte b = 0;
            }

            @Override // kotlin.getPrimaryType, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((isPresent.read) obj, obj2);
            }

            @Override // kotlin.getPrimaryType
            public final void RemoteActionCompatParcelizer() {
                if (!write()) {
                    for (int i2 = 0; i2 < AudioAttributesCompatParcelizer(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> entryRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                        if (((isPresent.read) entryRemoteActionCompatParcelizer.getKey()).RemoteActionCompatParcelizer()) {
                            entryRemoteActionCompatParcelizer.setValue(Collections.unmodifiableList((List) entryRemoteActionCompatParcelizer.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : IconCompatParcelizer()) {
                        if (((isPresent.read) entry.getKey()).RemoteActionCompatParcelizer()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.RemoteActionCompatParcelizer();
            }
        };
    }

    private getPrimaryType(int i) {
        this.AudioAttributesCompatParcelizer = i;
        this.write = Collections.emptyList();
        this.AudioAttributesImplApi26Parcelizer = Collections.emptyMap();
        this.AudioAttributesImplApi21Parcelizer = Collections.emptyMap();
    }

    public void RemoteActionCompatParcelizer() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.AudioAttributesImplApi26Parcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = mapUnmodifiableMap;
        if (this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            mapUnmodifiableMap2 = Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.AudioAttributesImplApi21Parcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = mapUnmodifiableMap2;
        this.RemoteActionCompatParcelizer = true;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write.size();
    }

    public final Map.Entry<K, V> RemoteActionCompatParcelizer(int i) {
        return this.write.get(i);
    }

    private int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.size();
    }

    public final Iterable<Map.Entry<K, V>> IconCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            return IconCompatParcelizer.read();
        }
        return this.AudioAttributesImplApi26Parcelizer.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.write.size() + this.AudioAttributesImplApi26Parcelizer.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return read(comparable) >= 0 || this.AudioAttributesImplApi26Parcelizer.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        if (i >= 0) {
            return this.write.get(i).getValue();
        }
        return this.AudioAttributesImplApi26Parcelizer.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        AudioAttributesImplApi21Parcelizer();
        int i = read(k);
        if (i >= 0) {
            return this.write.get(i).setValue(v);
        }
        AudioAttributesImplApi26Parcelizer();
        int i2 = -(i + 1);
        if (i2 >= this.AudioAttributesCompatParcelizer) {
            return MediaBrowserCompatItemReceiver().put(k, v);
        }
        int size = this.write.size();
        int i3 = this.AudioAttributesCompatParcelizer;
        if (size == i3) {
            getPrimaryType<K, V>.read readVarRemove = this.write.remove(i3 - 1);
            MediaBrowserCompatItemReceiver().put(readVarRemove.getKey(), readVarRemove.getValue());
        }
        this.write.add(i2, new read(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        AudioAttributesImplApi21Parcelizer();
        if (!this.write.isEmpty()) {
            this.write.clear();
        }
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        AudioAttributesImplApi21Parcelizer();
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        if (i >= 0) {
            return read(i);
        }
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            return null;
        }
        return this.AudioAttributesImplApi26Parcelizer.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V read(int i) {
        AudioAttributesImplApi21Parcelizer();
        V value = this.write.remove(i).getValue();
        if (!this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = MediaBrowserCompatItemReceiver().entrySet().iterator();
            this.write.add(new read(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int read(K r5) {
        /*
            r4 = this;
            java.util.List<o.getPrimaryType<K, V>$read> r0 = r4.write
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L22
            java.util.List<o.getPrimaryType<K, V>$read> r2 = r4.write
            java.lang.Object r2 = r2.get(r1)
            o.getPrimaryType$read r2 = (o.getPrimaryType.read) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1f
        L1c:
            int r0 = r0 + 1
            goto L44
        L1f:
            if (r2 != 0) goto L22
            return r1
        L22:
            r0 = 0
        L23:
            if (r0 > r1) goto L1c
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<o.getPrimaryType<K, V>$read> r3 = r4.write
            java.lang.Object r3 = r3.get(r2)
            o.getPrimaryType$read r3 = (o.getPrimaryType.read) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3e
            int r1 = r2 + (-1)
            goto L23
        L3e:
            if (r3 <= 0) goto L43
            int r0 = r2 + 1
            goto L23
        L43:
            return r2
        L44:
            int r4 = -r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPrimaryType.read(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new AudioAttributesImplBaseParcelizer(this, (byte) 0);
        }
        return this.IconCompatParcelizer;
    }

    final Set<Map.Entry<K, V>> read() {
        if (this.read == null) {
            this.read = new write(this, (byte) 0);
        }
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> MediaBrowserCompatItemReceiver() {
        AudioAttributesImplApi21Parcelizer();
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty() && !(this.AudioAttributesImplApi26Parcelizer instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.AudioAttributesImplApi26Parcelizer = treeMap;
            this.AudioAttributesImplApi21Parcelizer = treeMap.descendingMap();
        }
        return (SortedMap) this.AudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesImplApi21Parcelizer();
        if (!this.write.isEmpty() || (this.write instanceof ArrayList)) {
            return;
        }
        this.write = new ArrayList(this.AudioAttributesCompatParcelizer);
    }

    class read implements Map.Entry<K, V>, Comparable<getPrimaryType<K, V>.read> {
        private V AudioAttributesCompatParcelizer;
        private final K read;

        read(getPrimaryType getprimarytype, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        read(K k, V v) {
            this.read = k;
            this.AudioAttributesCompatParcelizer = v;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final K getKey() {
            return this.read;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(getPrimaryType<K, V>.read readVar) {
            return getKey().compareTo(readVar.getKey());
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            getPrimaryType.this.AudioAttributesImplApi21Parcelizer();
            V v2 = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return write(this.read, entry.getKey()) && write(this.AudioAttributesCompatParcelizer, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.read;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.AudioAttributesCompatParcelizer;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.read);
            sb.append("=");
            sb.append(this.AudioAttributesCompatParcelizer);
            return sb.toString();
        }

        private static boolean write(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    class AudioAttributesImplBaseParcelizer extends AbstractSet<Map.Entry<K, V>> {
        private AudioAttributesImplBaseParcelizer() {
        }

        /* synthetic */ AudioAttributesImplBaseParcelizer(getPrimaryType getprimarytype, byte b) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new RemoteActionCompatParcelizer(getPrimaryType.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return getPrimaryType.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            V v = getPrimaryType.this.get(entry.getKey());
            Object value = entry.getValue();
            if (v != value) {
                return v != null && v.equals(value);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            getPrimaryType.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            getPrimaryType.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            getPrimaryType.this.clear();
        }
    }

    class write extends getPrimaryType<K, V>.AudioAttributesImplBaseParcelizer {
        private write() {
            super(getPrimaryType.this, (byte) 0);
        }

        /* synthetic */ write(getPrimaryType getprimarytype, byte b) {
            this();
        }

        @Override // o.getPrimaryType.AudioAttributesImplBaseParcelizer, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new AudioAttributesCompatParcelizer(getPrimaryType.this, (byte) 0);
        }
    }

    class RemoteActionCompatParcelizer implements Iterator<Map.Entry<K, V>> {
        private int AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private Iterator<Map.Entry<K, V>> read;

        private RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = -1;
        }

        /* synthetic */ RemoteActionCompatParcelizer(getPrimaryType getprimarytype, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer + 1 < getPrimaryType.this.write.size() || (!getPrimaryType.this.AudioAttributesImplApi26Parcelizer.isEmpty() && read().hasNext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.IconCompatParcelizer = true;
            int i = this.AudioAttributesCompatParcelizer + 1;
            this.AudioAttributesCompatParcelizer = i;
            if (i < getPrimaryType.this.write.size()) {
                return (Map.Entry) getPrimaryType.this.write.get(this.AudioAttributesCompatParcelizer);
            }
            return read().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.IconCompatParcelizer) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.IconCompatParcelizer = false;
            getPrimaryType.this.AudioAttributesImplApi21Parcelizer();
            if (this.AudioAttributesCompatParcelizer < getPrimaryType.this.write.size()) {
                getPrimaryType getprimarytype = getPrimaryType.this;
                int i = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i - 1;
                getprimarytype.read(i);
                return;
            }
            read().remove();
        }

        private Iterator<Map.Entry<K, V>> read() {
            if (this.read == null) {
                this.read = getPrimaryType.this.AudioAttributesImplApi26Parcelizer.entrySet().iterator();
            }
            return this.read;
        }
    }

    class AudioAttributesCompatParcelizer implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> IconCompatParcelizer;
        private int read;

        private AudioAttributesCompatParcelizer() {
            this.read = getPrimaryType.this.write.size();
        }

        /* synthetic */ AudioAttributesCompatParcelizer(getPrimaryType getprimarytype, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.read;
            return (i > 0 && i <= getPrimaryType.this.write.size()) || IconCompatParcelizer().hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!IconCompatParcelizer().hasNext()) {
                List list = getPrimaryType.this.write;
                int i = this.read - 1;
                this.read = i;
                return (Map.Entry) list.get(i);
            }
            return IconCompatParcelizer().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> IconCompatParcelizer() {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = getPrimaryType.this.AudioAttributesImplApi21Parcelizer.entrySet().iterator();
            }
            return this.IconCompatParcelizer;
        }
    }

    static class IconCompatParcelizer {
        private static final Iterator<Object> write = new Iterator<Object>() { // from class: o.getPrimaryType.IconCompatParcelizer.5
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> RemoteActionCompatParcelizer = new Iterable<Object>() { // from class: o.getPrimaryType.IconCompatParcelizer.1
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return IconCompatParcelizer.write;
            }
        };

        static <T> Iterable<T> read() {
            return (Iterable<T>) RemoteActionCompatParcelizer;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPrimaryType)) {
            return super.equals(obj);
        }
        getPrimaryType getprimarytype = (getPrimaryType) obj;
        int size = size();
        if (size != getprimarytype.size()) {
            return false;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (iAudioAttributesCompatParcelizer != getprimarytype.AudioAttributesCompatParcelizer()) {
            return entrySet().equals(getprimarytype.entrySet());
        }
        for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
            if (!RemoteActionCompatParcelizer(i).equals(getprimarytype.RemoteActionCompatParcelizer(i))) {
                return false;
            }
        }
        if (iAudioAttributesCompatParcelizer != size) {
            return this.AudioAttributesImplApi26Parcelizer.equals(getprimarytype.AudioAttributesImplApi26Parcelizer);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int iHashCode = 0;
        for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
            iHashCode += this.write.get(i).hashCode();
        }
        return AudioAttributesImplBaseParcelizer() > 0 ? iHashCode + this.AudioAttributesImplApi26Parcelizer.hashCode() : iHashCode;
    }
}
