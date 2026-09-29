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
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.onRequirementsStateChanged;

/* JADX INFO: loaded from: classes3.dex */
class onDownloadChanged<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private volatile onDownloadChanged<K, V>.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer;
    private Map<K, V> AudioAttributesImplApi26Parcelizer;
    private Map<K, V> AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private volatile onDownloadChanged<K, V>.IconCompatParcelizer RemoteActionCompatParcelizer;
    private final int read;
    private List<onDownloadChanged<K, V>.read> write;

    /* synthetic */ onDownloadChanged(int i, byte b) {
        this(i);
    }

    static <FieldDescriptorType extends onRequirementsStateChanged.RemoteActionCompatParcelizer<FieldDescriptorType>> onDownloadChanged<FieldDescriptorType, Object> read(int i) {
        return (onDownloadChanged<FieldDescriptorType, Object>) new onDownloadChanged<FieldDescriptorType, Object>(i) { // from class: o.onDownloadChanged.3
            {
                byte b = 0;
            }

            @Override // kotlin.onDownloadChanged, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((Comparable) obj, obj2);
            }

            @Override // kotlin.onDownloadChanged
            public final void RemoteActionCompatParcelizer() {
                if (!write()) {
                    for (int i2 = 0; i2 < read(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> entryAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2);
                        if (((onRequirementsStateChanged.RemoteActionCompatParcelizer) entryAudioAttributesCompatParcelizer.getKey()).RemoteActionCompatParcelizer()) {
                            entryAudioAttributesCompatParcelizer.setValue(Collections.unmodifiableList((List) entryAudioAttributesCompatParcelizer.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : AudioAttributesCompatParcelizer()) {
                        if (((onRequirementsStateChanged.RemoteActionCompatParcelizer) entry.getKey()).RemoteActionCompatParcelizer()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.RemoteActionCompatParcelizer();
            }
        };
    }

    private onDownloadChanged(int i) {
        this.read = i;
        this.write = Collections.emptyList();
        this.AudioAttributesImplBaseParcelizer = Collections.emptyMap();
        this.AudioAttributesImplApi26Parcelizer = Collections.emptyMap();
    }

    public void RemoteActionCompatParcelizer() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.IconCompatParcelizer) {
            return;
        }
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.AudioAttributesImplBaseParcelizer);
        }
        this.AudioAttributesImplBaseParcelizer = mapUnmodifiableMap;
        if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            mapUnmodifiableMap2 = Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.AudioAttributesImplApi26Parcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = mapUnmodifiableMap2;
        this.IconCompatParcelizer = true;
    }

    public final boolean write() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.write.size();
    }

    public final Map.Entry<K, V> AudioAttributesCompatParcelizer(int i) {
        return this.write.get(i);
    }

    private int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.size();
    }

    public final Iterable<Map.Entry<K, V>> AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return AudioAttributesCompatParcelizer.write();
        }
        return this.AudioAttributesImplBaseParcelizer.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.write.size() + this.AudioAttributesImplBaseParcelizer.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return RemoteActionCompatParcelizer(comparable) >= 0 || this.AudioAttributesImplBaseParcelizer.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return this.write.get(iRemoteActionCompatParcelizer).getValue();
        }
        return this.AudioAttributesImplBaseParcelizer.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        MediaBrowserCompatItemReceiver();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(k);
        if (iRemoteActionCompatParcelizer >= 0) {
            return this.write.get(iRemoteActionCompatParcelizer).setValue(v);
        }
        AudioAttributesImplApi21Parcelizer();
        int i = -(iRemoteActionCompatParcelizer + 1);
        if (i >= this.read) {
            return AudioAttributesImplApi26Parcelizer().put(k, v);
        }
        int size = this.write.size();
        int i2 = this.read;
        if (size == i2) {
            onDownloadChanged<K, V>.read readVarRemove = this.write.remove(i2 - 1);
            AudioAttributesImplApi26Parcelizer().put(readVarRemove.getKey(), readVarRemove.getValue());
        }
        this.write.add(i, new read(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        MediaBrowserCompatItemReceiver();
        if (!this.write.isEmpty()) {
            this.write.clear();
        }
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        MediaBrowserCompatItemReceiver();
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return write(iRemoteActionCompatParcelizer);
        }
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return null;
        }
        return this.AudioAttributesImplBaseParcelizer.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V write(int i) {
        MediaBrowserCompatItemReceiver();
        V value = this.write.remove(i).getValue();
        if (!this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = AudioAttributesImplApi26Parcelizer().entrySet().iterator();
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
    private int RemoteActionCompatParcelizer(K r5) {
        /*
            r4 = this;
            java.util.List<o.onDownloadChanged<K, V>$read> r0 = r4.write
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L22
            java.util.List<o.onDownloadChanged<K, V>$read> r2 = r4.write
            java.lang.Object r2 = r2.get(r1)
            o.onDownloadChanged$read r2 = (o.onDownloadChanged.read) r2
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
            java.util.List<o.onDownloadChanged<K, V>$read> r3 = r4.write
            java.lang.Object r3 = r3.get(r2)
            o.onDownloadChanged$read r3 = (o.onDownloadChanged.read) r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onDownloadChanged.RemoteActionCompatParcelizer(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer(this, (byte) 0);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    final Set<Map.Entry<K, V>> IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new IconCompatParcelizer(this, (byte) 0);
        }
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatItemReceiver() {
        if (this.IconCompatParcelizer) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> AudioAttributesImplApi26Parcelizer() {
        MediaBrowserCompatItemReceiver();
        if (this.AudioAttributesImplBaseParcelizer.isEmpty() && !(this.AudioAttributesImplBaseParcelizer instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.AudioAttributesImplBaseParcelizer = treeMap;
            this.AudioAttributesImplApi26Parcelizer = treeMap.descendingMap();
        }
        return (SortedMap) this.AudioAttributesImplBaseParcelizer;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatItemReceiver();
        if (!this.write.isEmpty() || (this.write instanceof ArrayList)) {
            return;
        }
        this.write = new ArrayList(this.read);
    }

    class read implements Map.Entry<K, V>, Comparable<onDownloadChanged<K, V>.read> {
        private V RemoteActionCompatParcelizer;
        private final K read;

        read(onDownloadChanged ondownloadchanged, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        read(K k, V v) {
            this.read = k;
            this.RemoteActionCompatParcelizer = v;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final K getKey() {
            return this.read;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(onDownloadChanged<K, V>.read readVar) {
            return getKey().compareTo(readVar.getKey());
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            onDownloadChanged.this.MediaBrowserCompatItemReceiver();
            V v2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = v;
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
            return read(this.read, entry.getKey()) && read(this.RemoteActionCompatParcelizer, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.read;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.RemoteActionCompatParcelizer;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.read);
            sb.append("=");
            sb.append(this.RemoteActionCompatParcelizer);
            return sb.toString();
        }

        private static boolean read(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    class AudioAttributesImplBaseParcelizer extends AbstractSet<Map.Entry<K, V>> {
        private AudioAttributesImplBaseParcelizer() {
        }

        /* synthetic */ AudioAttributesImplBaseParcelizer(onDownloadChanged ondownloadchanged, byte b) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new RemoteActionCompatParcelizer(onDownloadChanged.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return onDownloadChanged.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            V v = onDownloadChanged.this.get(entry.getKey());
            Object value = entry.getValue();
            if (v != value) {
                return v != null && v.equals(value);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            onDownloadChanged.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            onDownloadChanged.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            onDownloadChanged.this.clear();
        }
    }

    class IconCompatParcelizer extends onDownloadChanged<K, V>.AudioAttributesImplBaseParcelizer {
        private IconCompatParcelizer() {
            super(onDownloadChanged.this, (byte) 0);
        }

        /* synthetic */ IconCompatParcelizer(onDownloadChanged ondownloadchanged, byte b) {
            this();
        }

        @Override // o.onDownloadChanged.AudioAttributesImplBaseParcelizer, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new write(onDownloadChanged.this, (byte) 0);
        }
    }

    class RemoteActionCompatParcelizer implements Iterator<Map.Entry<K, V>> {
        public static int IconCompatParcelizer;
        public static int read;
        private boolean AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Iterator<Map.Entry<K, V>> write;

        private RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer = -1;
        }

        /* synthetic */ RemoteActionCompatParcelizer(onDownloadChanged ondownloadchanged, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer + 1 < onDownloadChanged.this.write.size() || (!onDownloadChanged.this.AudioAttributesImplBaseParcelizer.isEmpty() && IconCompatParcelizer().hasNext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.AudioAttributesCompatParcelizer = true;
            int i = this.RemoteActionCompatParcelizer + 1;
            this.RemoteActionCompatParcelizer = i;
            if (i < onDownloadChanged.this.write.size()) {
                return (Map.Entry) onDownloadChanged.this.write.get(this.RemoteActionCompatParcelizer);
            }
            return IconCompatParcelizer().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.AudioAttributesCompatParcelizer) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.AudioAttributesCompatParcelizer = false;
            onDownloadChanged.this.MediaBrowserCompatItemReceiver();
            if (this.RemoteActionCompatParcelizer < onDownloadChanged.this.write.size()) {
                onDownloadChanged ondownloadchanged = onDownloadChanged.this;
                int i = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i - 1;
                ondownloadchanged.write(i);
                return;
            }
            IconCompatParcelizer().remove();
        }

        private Iterator<Map.Entry<K, V>> IconCompatParcelizer() {
            if (this.write == null) {
                this.write = onDownloadChanged.this.AudioAttributesImplBaseParcelizer.entrySet().iterator();
            }
            return this.write;
        }

        public static int read() {
            int i = read;
            int i2 = i % 6756942;
            read = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int iNextInt = new Random().nextInt();
            IconCompatParcelizer = iNextInt;
            return iNextInt;
        }
    }

    class write implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> AudioAttributesCompatParcelizer;
        private int write;

        private write() {
            this.write = onDownloadChanged.this.write.size();
        }

        /* synthetic */ write(onDownloadChanged ondownloadchanged, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.write;
            return (i > 0 && i <= onDownloadChanged.this.write.size()) || AudioAttributesCompatParcelizer().hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!AudioAttributesCompatParcelizer().hasNext()) {
                List list = onDownloadChanged.this.write;
                int i = this.write - 1;
                this.write = i;
                return (Map.Entry) list.get(i);
            }
            return AudioAttributesCompatParcelizer().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = onDownloadChanged.this.AudioAttributesImplApi26Parcelizer.entrySet().iterator();
            }
            return this.AudioAttributesCompatParcelizer;
        }
    }

    static class AudioAttributesCompatParcelizer {
        private static final Iterator<Object> AudioAttributesCompatParcelizer = new Iterator<Object>() { // from class: o.onDownloadChanged.AudioAttributesCompatParcelizer.3
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
        private static final Iterable<Object> RemoteActionCompatParcelizer = new Iterable<Object>() { // from class: o.onDownloadChanged.AudioAttributesCompatParcelizer.2
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            }
        };

        static <T> Iterable<T> write() {
            return (Iterable<T>) RemoteActionCompatParcelizer;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onDownloadChanged)) {
            return super.equals(obj);
        }
        onDownloadChanged ondownloadchanged = (onDownloadChanged) obj;
        int size = size();
        if (size != ondownloadchanged.size()) {
            return false;
        }
        int i = read();
        if (i != ondownloadchanged.read()) {
            return entrySet().equals(ondownloadchanged.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!AudioAttributesCompatParcelizer(i2).equals(ondownloadchanged.AudioAttributesCompatParcelizer(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.AudioAttributesImplBaseParcelizer.equals(ondownloadchanged.AudioAttributesImplBaseParcelizer);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = read();
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.write.get(i2).hashCode();
        }
        return AudioAttributesImplBaseParcelizer() > 0 ? iHashCode + this.AudioAttributesImplBaseParcelizer.hashCode() : iHashCode;
    }
}
