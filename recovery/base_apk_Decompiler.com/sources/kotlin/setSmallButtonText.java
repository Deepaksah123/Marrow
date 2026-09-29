package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\b&\u0018\u0000 \f*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00172\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\"R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010("}, d2 = {"Lo/setSmallButtonText;", "K", "V", "", "<init>", "()V", "p0", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "", "write", "(Ljava/util/Map$Entry;)Z", "", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "read", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "MediaBrowserCompatCustomActionResultReceiver", "", "()Ljava/util/Set;", "AudioAttributesCompatParcelizer", "Ljava/util/Set;", "", "MediaBrowserCompatItemReceiver", "()Ljava/util/Collection;", "Ljava/util/Collection;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setSmallButtonText<K, V> implements Map<K, V>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private volatile Collection<? extends V> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private volatile Set<? extends K> write;

    public abstract Set<Map.Entry<K, V>> AudioAttributesCompatParcelizer();

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return RemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public final int size() {
        return getRemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return MediaBrowserCompatItemReceiver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object p0) {
        return RemoteActionCompatParcelizer(p0) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object p0) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((Map.Entry) it.next()).getValue(), p0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean write(Map.Entry<?, ?> p0) {
        if (p0 == null) {
            return false;
        }
        Object key = p0.getKey();
        Object value = p0.getValue();
        setSmallButtonText<K, V> setsmallbuttontext = this;
        toMagicModuleMetaRepoModel.read(setsmallbuttontext, "");
        V v = setsmallbuttontext.get(key);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        toMagicModuleMetaRepoModel.read(setsmallbuttontext, "");
        return setsmallbuttontext.containsKey(key);
    }

    @Override // java.util.Map
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof Map)) {
            return false;
        }
        Map map = (Map) p0;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!write((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object p0) {
        Map.Entry<K, V> entryRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (entryRemoteActionCompatParcelizer != null) {
            return entryRemoteActionCompatParcelizer.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    public int getRemoteActionCompatParcelizer() {
        return entrySet().size();
    }

    public static final class RemoteActionCompatParcelizer extends getGroupTitle<K> {
        private /* synthetic */ setSmallButtonText<K, V> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(setSmallButtonText<K, ? extends V> setsmallbuttontext) {
            this.RemoteActionCompatParcelizer = setsmallbuttontext;
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.RemoteActionCompatParcelizer.containsKey(obj);
        }

        public static final class IconCompatParcelizer implements Iterator<K>, getCurrentAnsweredMcqProgress {
            private /* synthetic */ Iterator<Map.Entry<K, V>> RemoteActionCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            IconCompatParcelizer(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.RemoteActionCompatParcelizer = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.RemoteActionCompatParcelizer.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return this.RemoteActionCompatParcelizer.next().getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        @Override // kotlin.getGroupTitle, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer.entrySet().iterator());
        }

        @Override // kotlin.setBigButtonText
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final int getWrite() {
            return this.RemoteActionCompatParcelizer.size();
        }
    }

    public Set<K> RemoteActionCompatParcelizer() {
        if (this.write == null) {
            this.write = new RemoteActionCompatParcelizer(this);
        }
        Set<? extends K> set = this.write;
        toMagicModuleMetaRepoModel.write(set);
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence IconCompatParcelizer(setSmallButtonText setsmallbuttontext, Map.Entry entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        return setsmallbuttontext.read(entry);
    }

    public String toString() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(entrySet(), ", ", "{", "}", 0, null, new getAnswerMap() { // from class: o.setShowPopup
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setSmallButtonText.IconCompatParcelizer(this.read, (Map.Entry) obj);
            }
        }, 24);
    }

    private final String read(Map.Entry<? extends K, ? extends V> p0) {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer(p0.getKey()));
        sb.append('=');
        sb.append(IconCompatParcelizer(p0.getValue()));
        return sb.toString();
    }

    private final String IconCompatParcelizer(Object p0) {
        return p0 == this ? "(this Map)" : String.valueOf(p0);
    }

    public static final class IconCompatParcelizer extends setBigButtonText<V> {
        private /* synthetic */ setSmallButtonText<K, V> AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(setSmallButtonText<K, ? extends V> setsmallbuttontext) {
            this.AudioAttributesCompatParcelizer = setsmallbuttontext;
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.AudioAttributesCompatParcelizer.containsValue(obj);
        }

        public static final class AudioAttributesCompatParcelizer implements Iterator<V>, getCurrentAnsweredMcqProgress {
            private /* synthetic */ Iterator<Map.Entry<K, V>> RemoteActionCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            AudioAttributesCompatParcelizer(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.RemoteActionCompatParcelizer = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.RemoteActionCompatParcelizer.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.RemoteActionCompatParcelizer.next().getValue();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.entrySet().iterator());
        }

        @Override // kotlin.setBigButtonText
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final int getWrite() {
            return this.AudioAttributesCompatParcelizer.size();
        }
    }

    public Collection<V> MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new IconCompatParcelizer(this);
        }
        Collection<? extends V> collection = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(collection);
        return collection;
    }

    private final Map.Entry<K, V> RemoteActionCompatParcelizer(K p0) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((Map.Entry) next).getKey(), p0)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
