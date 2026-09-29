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
import kotlin.setVideoMetaEncrypt;

/* JADX INFO: loaded from: classes4.dex */
class getSelectedAnswer<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private volatile getSelectedAnswer<K, V>.IconCompatParcelizer RemoteActionCompatParcelizer;
    private Map<K, V> read;
    private List<getSelectedAnswer<K, V>.read> write;

    /* synthetic */ getSelectedAnswer(int i, byte b) {
        this(i);
    }

    static <FieldDescriptorType extends setVideoMetaEncrypt.RemoteActionCompatParcelizer<FieldDescriptorType>> getSelectedAnswer<FieldDescriptorType, Object> IconCompatParcelizer(int i) {
        return (getSelectedAnswer<FieldDescriptorType, Object>) new getSelectedAnswer<FieldDescriptorType, Object>(i) { // from class: o.getSelectedAnswer.2
            {
                byte b = 0;
            }

            @Override // kotlin.getSelectedAnswer, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((setVideoMetaEncrypt.RemoteActionCompatParcelizer) obj, obj2);
            }

            @Override // kotlin.getSelectedAnswer
            public final void IconCompatParcelizer() {
                if (!read()) {
                    for (int i2 = 0; i2 < write(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> entryRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                        if (((setVideoMetaEncrypt.RemoteActionCompatParcelizer) entryRemoteActionCompatParcelizer.getKey()).IconCompatParcelizer()) {
                            entryRemoteActionCompatParcelizer.setValue(Collections.unmodifiableList((List) entryRemoteActionCompatParcelizer.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : RemoteActionCompatParcelizer()) {
                        if (((setVideoMetaEncrypt.RemoteActionCompatParcelizer) entry.getKey()).IconCompatParcelizer()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.IconCompatParcelizer();
            }
        };
    }

    private getSelectedAnswer(int i) {
        this.IconCompatParcelizer = i;
        this.write = Collections.emptyList();
        this.read = Collections.emptyMap();
    }

    public void IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.read = this.read.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.read);
        this.AudioAttributesCompatParcelizer = true;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int write() {
        return this.write.size();
    }

    public final Map.Entry<K, V> RemoteActionCompatParcelizer(int i) {
        return this.write.get(i);
    }

    public final Iterable<Map.Entry<K, V>> RemoteActionCompatParcelizer() {
        return this.read.isEmpty() ? AudioAttributesCompatParcelizer.read() : this.read.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.write.size() + this.read.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return read(comparable) >= 0 || this.read.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        if (i >= 0) {
            return this.write.get(i).getValue();
        }
        return this.read.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        AudioAttributesCompatParcelizer();
        int i = read(k);
        if (i >= 0) {
            return this.write.get(i).setValue(v);
        }
        AudioAttributesImplApi21Parcelizer();
        int i2 = -(i + 1);
        if (i2 >= this.IconCompatParcelizer) {
            return AudioAttributesImplBaseParcelizer().put(k, v);
        }
        int size = this.write.size();
        int i3 = this.IconCompatParcelizer;
        if (size == i3) {
            getSelectedAnswer<K, V>.read readVarRemove = this.write.remove(i3 - 1);
            AudioAttributesImplBaseParcelizer().put(readVarRemove.getKey(), readVarRemove.getValue());
        }
        this.write.add(i2, new read(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        AudioAttributesCompatParcelizer();
        if (!this.write.isEmpty()) {
            this.write.clear();
        }
        if (this.read.isEmpty()) {
            return;
        }
        this.read.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        AudioAttributesCompatParcelizer();
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        if (i >= 0) {
            return AudioAttributesCompatParcelizer(i);
        }
        if (this.read.isEmpty()) {
            return null;
        }
        return this.read.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V AudioAttributesCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer();
        V value = this.write.remove(i).getValue();
        if (!this.read.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = AudioAttributesImplBaseParcelizer().entrySet().iterator();
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
            java.util.List<o.getSelectedAnswer<K, V>$read> r0 = r4.write
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L22
            java.util.List<o.getSelectedAnswer<K, V>$read> r2 = r4.write
            java.lang.Object r2 = r2.get(r1)
            o.getSelectedAnswer$read r2 = (o.getSelectedAnswer.read) r2
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
            java.util.List<o.getSelectedAnswer<K, V>$read> r3 = r4.write
            java.lang.Object r3 = r3.get(r2)
            o.getSelectedAnswer$read r3 = (o.getSelectedAnswer.read) r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSelectedAnswer.read(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new IconCompatParcelizer(this, (byte) 0);
        }
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer();
        if (this.read.isEmpty() && !(this.read instanceof TreeMap)) {
            this.read = new TreeMap();
        }
        return (SortedMap) this.read;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer();
        if (!this.write.isEmpty() || (this.write instanceof ArrayList)) {
            return;
        }
        this.write = new ArrayList(this.IconCompatParcelizer);
    }

    class read implements Comparable<getSelectedAnswer<K, V>.read>, Map.Entry<K, V> {
        private V IconCompatParcelizer;
        private final K write;

        read(getSelectedAnswer getselectedanswer, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        read(K k, V v) {
            this.write = k;
            this.IconCompatParcelizer = v;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final K getKey() {
            return this.write;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public int compareTo(getSelectedAnswer<K, V>.read readVar) {
            return getKey().compareTo(readVar.getKey());
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            getSelectedAnswer.this.AudioAttributesCompatParcelizer();
            V v2 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = v;
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
            return AudioAttributesCompatParcelizer(this.write, entry.getKey()) && AudioAttributesCompatParcelizer(this.IconCompatParcelizer, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.write;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.IconCompatParcelizer;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            String strValueOf = String.valueOf(String.valueOf(this.write));
            String strValueOf2 = String.valueOf(String.valueOf(this.IconCompatParcelizer));
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        private static boolean AudioAttributesCompatParcelizer(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    class IconCompatParcelizer extends AbstractSet<Map.Entry<K, V>> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(getSelectedAnswer getselectedanswer, byte b) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new RemoteActionCompatParcelizer(getSelectedAnswer.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return getSelectedAnswer.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            V v = getSelectedAnswer.this.get(entry.getKey());
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
            getSelectedAnswer.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            getSelectedAnswer.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            getSelectedAnswer.this.clear();
        }
    }

    class RemoteActionCompatParcelizer implements Iterator<Map.Entry<K, V>> {
        private boolean AudioAttributesCompatParcelizer;
        private Iterator<Map.Entry<K, V>> read;
        private int write;

        private RemoteActionCompatParcelizer() {
            this.write = -1;
        }

        /* synthetic */ RemoteActionCompatParcelizer(getSelectedAnswer getselectedanswer, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.write + 1 < getSelectedAnswer.this.write.size() || read().hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.AudioAttributesCompatParcelizer = true;
            int i = this.write + 1;
            this.write = i;
            if (i < getSelectedAnswer.this.write.size()) {
                return (Map.Entry) getSelectedAnswer.this.write.get(this.write);
            }
            return read().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.AudioAttributesCompatParcelizer) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.AudioAttributesCompatParcelizer = false;
            getSelectedAnswer.this.AudioAttributesCompatParcelizer();
            if (this.write < getSelectedAnswer.this.write.size()) {
                getSelectedAnswer getselectedanswer = getSelectedAnswer.this;
                int i = this.write;
                this.write = i - 1;
                getselectedanswer.AudioAttributesCompatParcelizer(i);
                return;
            }
            read().remove();
        }

        private Iterator<Map.Entry<K, V>> read() {
            if (this.read == null) {
                this.read = getSelectedAnswer.this.read.entrySet().iterator();
            }
            return this.read;
        }
    }

    static class AudioAttributesCompatParcelizer {
        private static final Iterator<Object> read = new Iterator<Object>() { // from class: o.getSelectedAnswer.AudioAttributesCompatParcelizer.3
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
        private static final Iterable<Object> write = new Iterable<Object>() { // from class: o.getSelectedAnswer.AudioAttributesCompatParcelizer.2
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return AudioAttributesCompatParcelizer.read;
            }
        };

        static <T> Iterable<T> read() {
            return (Iterable<T>) write;
        }
    }
}
