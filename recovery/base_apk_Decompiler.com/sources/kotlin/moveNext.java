package kotlin;

import android.os.Process;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import kotlin.parseSaiz;
import kotlin.readNextSampleSize;

/* JADX INFO: loaded from: classes3.dex */
abstract class moveNext<K, V> extends readNextSampleSize<K, V> implements Serializable {
    private transient Map<K, Collection<V>> AudioAttributesCompatParcelizer;
    private transient int RemoteActionCompatParcelizer;

    abstract Collection<V> write();

    static /* synthetic */ int AudioAttributesCompatParcelizer(moveNext movenext) {
        int i = movenext.RemoteActionCompatParcelizer;
        movenext.RemoteActionCompatParcelizer = i - 1;
        return i;
    }

    static /* synthetic */ int IconCompatParcelizer(moveNext movenext) {
        int i = movenext.RemoteActionCompatParcelizer;
        movenext.RemoteActionCompatParcelizer = i + 1;
        return i;
    }

    static /* synthetic */ int IconCompatParcelizer(moveNext movenext, int i) {
        int i2 = movenext.RemoteActionCompatParcelizer - i;
        movenext.RemoteActionCompatParcelizer = i2;
        return i2;
    }

    static /* synthetic */ int write(moveNext movenext, int i) {
        int i2 = movenext.RemoteActionCompatParcelizer + i;
        movenext.RemoteActionCompatParcelizer = i2;
        return i2;
    }

    protected moveNext(Map<K, Collection<V>> map) {
        parseStsd.RemoteActionCompatParcelizer(map.isEmpty());
        this.AudioAttributesCompatParcelizer = map;
    }

    final void RemoteActionCompatParcelizer(Map<K, Collection<V>> map) {
        this.AudioAttributesCompatParcelizer = map;
        this.RemoteActionCompatParcelizer = 0;
        for (Collection<V> collection : map.values()) {
            parseStsd.RemoteActionCompatParcelizer(!collection.isEmpty());
            this.RemoteActionCompatParcelizer += collection.size();
        }
    }

    private Collection<V> IconCompatParcelizer() {
        return write();
    }

    final Map<K, Collection<V>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.outputPendingMetadataSamples
    public int RatingCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public boolean read(K k, V v) {
        Collection<V> collection = this.AudioAttributesCompatParcelizer.get(k);
        if (collection == null) {
            Collection<V> collectionIconCompatParcelizer = IconCompatParcelizer();
            if (collectionIconCompatParcelizer.add(v)) {
                this.RemoteActionCompatParcelizer++;
                this.AudioAttributesCompatParcelizer.put(k, collectionIconCompatParcelizer);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v)) {
            return false;
        }
        this.RemoteActionCompatParcelizer++;
        return true;
    }

    <E> Collection<E> write(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // kotlin.outputPendingMetadataSamples
    public void read() {
        Iterator<Collection<V>> it = this.AudioAttributesCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.AudioAttributesCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // kotlin.outputPendingMetadataSamples, kotlin.parseMoof
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public Collection<V> write(K k) {
        Collection<V> collectionIconCompatParcelizer = this.AudioAttributesCompatParcelizer.get(k);
        if (collectionIconCompatParcelizer == null) {
            collectionIconCompatParcelizer = IconCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(k, collectionIconCompatParcelizer);
    }

    Collection<V> AudioAttributesCompatParcelizer(K k, Collection<V> collection) {
        return new MediaBrowserCompatItemReceiver(k, collection, null);
    }

    final List<V> RemoteActionCompatParcelizer(K k, List<V> list, moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (list instanceof RandomAccess) {
            return new MediaBrowserCompatCustomActionResultReceiver(this, k, list, mediaBrowserCompatItemReceiver);
        }
        return new AudioAttributesImplApi21Parcelizer(k, list, mediaBrowserCompatItemReceiver);
    }

    class MediaBrowserCompatItemReceiver extends AbstractCollection<V> {
        private K IconCompatParcelizer;
        private Collection<V> RemoteActionCompatParcelizer;
        Collection<V> read;
        private moveNext<K, V>.MediaBrowserCompatItemReceiver write;

        MediaBrowserCompatItemReceiver(K k, Collection<V> collection, moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            this.IconCompatParcelizer = k;
            this.read = collection;
            this.write = mediaBrowserCompatItemReceiver;
            this.RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver == null ? null : mediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }

        final void RemoteActionCompatParcelizer() {
            Collection<V> collection;
            moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.write;
            if (mediaBrowserCompatItemReceiver != null) {
                mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                if (this.write.IconCompatParcelizer() != this.RemoteActionCompatParcelizer) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.read.isEmpty() || (collection = (Collection) moveNext.this.AudioAttributesCompatParcelizer.get(this.IconCompatParcelizer)) == null) {
                    return;
                }
                this.read = collection;
            }
        }

        final void AudioAttributesImplApi21Parcelizer() {
            moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.write;
            if (mediaBrowserCompatItemReceiver != null) {
                mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
            } else if (this.read.isEmpty()) {
                moveNext.this.AudioAttributesCompatParcelizer.remove(this.IconCompatParcelizer);
            }
        }

        final K AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        final void write() {
            moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.write;
            if (mediaBrowserCompatItemReceiver == null) {
                moveNext.this.AudioAttributesCompatParcelizer.put(this.IconCompatParcelizer, this.read);
            } else {
                mediaBrowserCompatItemReceiver.write();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            RemoteActionCompatParcelizer();
            return this.read.size();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            RemoteActionCompatParcelizer();
            return this.read.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            RemoteActionCompatParcelizer();
            return this.read.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            RemoteActionCompatParcelizer();
            return this.read.toString();
        }

        final Collection<V> IconCompatParcelizer() {
            return this.read;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            RemoteActionCompatParcelizer();
            return new write();
        }

        class write implements Iterator<V> {
            private Iterator<V> AudioAttributesCompatParcelizer;
            private Collection<V> RemoteActionCompatParcelizer;

            write() {
                this.RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver.this.read;
                this.AudioAttributesCompatParcelizer = moveNext.AudioAttributesCompatParcelizer((Collection) MediaBrowserCompatItemReceiver.this.read);
            }

            write(Iterator<V> it) {
                this.RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver.this.read;
                this.AudioAttributesCompatParcelizer = it;
            }

            private void RemoteActionCompatParcelizer() {
                MediaBrowserCompatItemReceiver.this.RemoteActionCompatParcelizer();
                if (MediaBrowserCompatItemReceiver.this.read != this.RemoteActionCompatParcelizer) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                RemoteActionCompatParcelizer();
                return this.AudioAttributesCompatParcelizer.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                RemoteActionCompatParcelizer();
                return this.AudioAttributesCompatParcelizer.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.AudioAttributesCompatParcelizer.remove();
                moveNext.AudioAttributesCompatParcelizer(moveNext.this);
                MediaBrowserCompatItemReceiver.this.AudioAttributesImplApi21Parcelizer();
            }

            final Iterator<V> AudioAttributesCompatParcelizer() {
                RemoteActionCompatParcelizer();
                return this.AudioAttributesCompatParcelizer;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            RemoteActionCompatParcelizer();
            boolean zIsEmpty = this.read.isEmpty();
            boolean zAdd = this.read.add(v);
            if (zAdd) {
                moveNext.IconCompatParcelizer(moveNext.this);
                if (zIsEmpty) {
                    write();
                }
            }
            return zAdd;
        }

        final moveNext<K, V>.MediaBrowserCompatItemReceiver read() {
            return this.write;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.read.addAll(collection);
            if (zAddAll) {
                moveNext.write(moveNext.this, this.read.size() - size);
                if (size == 0) {
                    write();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            RemoteActionCompatParcelizer();
            return this.read.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            RemoteActionCompatParcelizer();
            return this.read.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.read.clear();
            moveNext.IconCompatParcelizer(moveNext.this, size);
            AudioAttributesImplApi21Parcelizer();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            RemoteActionCompatParcelizer();
            boolean zRemove = this.read.remove(obj);
            if (zRemove) {
                moveNext.AudioAttributesCompatParcelizer(moveNext.this);
                AudioAttributesImplApi21Parcelizer();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.read.removeAll(collection);
            if (zRemoveAll) {
                moveNext.write(moveNext.this, this.read.size() - size);
                AudioAttributesImplApi21Parcelizer();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int size = size();
            boolean zRetainAll = this.read.retainAll(collection);
            if (zRetainAll) {
                moveNext.write(moveNext.this, this.read.size() - size);
                AudioAttributesImplApi21Parcelizer();
            }
            return zRetainAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> AudioAttributesCompatParcelizer(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    class AudioAttributesImplApi21Parcelizer extends moveNext<K, V>.MediaBrowserCompatItemReceiver implements List<V> {
        AudioAttributesImplApi21Parcelizer(K k, List<V> list, moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            super(k, list, mediaBrowserCompatItemReceiver);
        }

        final List<V> AudioAttributesImplApi26Parcelizer() {
            return (List) IconCompatParcelizer();
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = AudioAttributesImplApi26Parcelizer().addAll(i, collection);
            if (zAddAll) {
                moveNext.write(moveNext.this, IconCompatParcelizer().size() - size);
                if (size == 0) {
                    write();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            RemoteActionCompatParcelizer();
            return AudioAttributesImplApi26Parcelizer().get(i);
        }

        @Override // java.util.List
        public V set(int i, V v) {
            RemoteActionCompatParcelizer();
            return AudioAttributesImplApi26Parcelizer().set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            RemoteActionCompatParcelizer();
            boolean zIsEmpty = IconCompatParcelizer().isEmpty();
            AudioAttributesImplApi26Parcelizer().add(i, v);
            moveNext.IconCompatParcelizer(moveNext.this);
            if (zIsEmpty) {
                write();
            }
        }

        @Override // java.util.List
        public V remove(int i) {
            RemoteActionCompatParcelizer();
            V vRemove = AudioAttributesImplApi26Parcelizer().remove(i);
            moveNext.AudioAttributesCompatParcelizer(moveNext.this);
            AudioAttributesImplApi21Parcelizer();
            return vRemove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            RemoteActionCompatParcelizer();
            return AudioAttributesImplApi26Parcelizer().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            RemoteActionCompatParcelizer();
            return AudioAttributesImplApi26Parcelizer().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            RemoteActionCompatParcelizer();
            return new IconCompatParcelizer();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            RemoteActionCompatParcelizer();
            return new IconCompatParcelizer(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.moveNext] */
        /* JADX WARN: Type inference failed for: r3v1, types: [o.moveNext$MediaBrowserCompatItemReceiver] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            RemoteActionCompatParcelizer();
            ?? r0 = moveNext.this;
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            List<V> listSubList = AudioAttributesImplApi26Parcelizer().subList(i, i2);
            moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = read();
            ?? r3 = this;
            if (mediaBrowserCompatItemReceiver != null) {
                r3 = read();
            }
            return r0.RemoteActionCompatParcelizer(objAudioAttributesCompatParcelizer, listSubList, r3);
        }

        class IconCompatParcelizer extends moveNext<K, V>.MediaBrowserCompatItemReceiver.write implements ListIterator<V> {
            IconCompatParcelizer() {
                super();
            }

            public IconCompatParcelizer(int i) {
                super(AudioAttributesImplApi21Parcelizer.this.AudioAttributesImplApi26Parcelizer().listIterator(i));
            }

            private ListIterator<V> read() {
                return (ListIterator) AudioAttributesCompatParcelizer();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return read().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return read().previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return read().nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return read().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                read().set(v);
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean zIsEmpty = AudioAttributesImplApi21Parcelizer.this.isEmpty();
                read().add(v);
                moveNext.IconCompatParcelizer(moveNext.this);
                if (zIsEmpty) {
                    AudioAttributesImplApi21Parcelizer.this.write();
                }
            }
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver extends moveNext<K, V>.AudioAttributesImplApi21Parcelizer implements RandomAccess {
        MediaBrowserCompatCustomActionResultReceiver(moveNext movenext, K k, List<V> list, moveNext<K, V>.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            super(k, list, mediaBrowserCompatItemReceiver);
        }
    }

    @Override // kotlin.readNextSampleSize
    Set<K> AudioAttributesImplApi26Parcelizer() {
        return new read(this.AudioAttributesCompatParcelizer);
    }

    final Set<K> MediaBrowserCompatCustomActionResultReceiver() {
        Map<K, Collection<V>> map = this.AudioAttributesCompatParcelizer;
        if (map instanceof NavigableMap) {
            return new IconCompatParcelizer((NavigableMap) this.AudioAttributesCompatParcelizer);
        }
        if (map instanceof SortedMap) {
            return new AudioAttributesImplApi26Parcelizer((SortedMap) this.AudioAttributesCompatParcelizer);
        }
        return new read(this.AudioAttributesCompatParcelizer);
    }

    class read extends parseSaiz.IconCompatParcelizer<K, Collection<V>> {
        read(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // o.parseSaiz.IconCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = write().entrySet().iterator();
            return new Iterator<K>() { // from class: o.moveNext.read.1
                private Map.Entry<K, Collection<V>> write;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.write = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    parseStsd.RemoteActionCompatParcelizer(this.write != null, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.write.getValue();
                    it.remove();
                    moveNext.IconCompatParcelizer(moveNext.this, value.size());
                    value.clear();
                    this.write = null;
                }
            };
        }

        @Override // o.parseSaiz.IconCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection<V> collectionRemove = write().remove(obj);
            if (collectionRemove == null) {
                return false;
            }
            int size = collectionRemove.size();
            collectionRemove.clear();
            moveNext.IconCompatParcelizer(moveNext.this, size);
            return size > 0;
        }

        @Override // o.parseSaiz.IconCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            parseSaio.write(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return write().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || write().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return write().keySet().hashCode();
        }
    }

    class AudioAttributesImplApi26Parcelizer extends moveNext<K, V>.read implements SortedSet<K> {
        AudioAttributesImplApi26Parcelizer(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> IconCompatParcelizer() {
            return (SortedMap) super.write();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return IconCompatParcelizer().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return IconCompatParcelizer().firstKey();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> headSet(K k) {
            return new AudioAttributesImplApi26Parcelizer(IconCompatParcelizer().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return IconCompatParcelizer().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> subSet(K k, K k2) {
            return new AudioAttributesImplApi26Parcelizer(IconCompatParcelizer().subMap(k, k2));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> tailSet(K k) {
            return new AudioAttributesImplApi26Parcelizer(IconCompatParcelizer().tailMap(k));
        }
    }

    final class IconCompatParcelizer extends moveNext<K, V>.AudioAttributesImplApi26Parcelizer implements NavigableSet<K> {
        IconCompatParcelizer(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplApi26Parcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> IconCompatParcelizer() {
            return (NavigableMap) super.IconCompatParcelizer();
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return IconCompatParcelizer().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return IconCompatParcelizer().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return IconCompatParcelizer().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return IconCompatParcelizer().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) parseSaio.IconCompatParcelizer((Iterator) iterator());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) parseSaio.IconCompatParcelizer((Iterator) descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new IconCompatParcelizer(IconCompatParcelizer().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplApi26Parcelizer, java.util.SortedSet
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new IconCompatParcelizer(IconCompatParcelizer().headMap(k, z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplApi26Parcelizer, java.util.SortedSet
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new IconCompatParcelizer(IconCompatParcelizer().subMap(k, z, k2, z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplApi26Parcelizer, java.util.SortedSet
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new IconCompatParcelizer(IconCompatParcelizer().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(Object obj) {
        Collection collection = (Collection) parseSaiz.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.RemoteActionCompatParcelizer -= size;
        }
    }

    abstract class AudioAttributesCompatParcelizer<T> implements Iterator<T> {
        private Iterator<Map.Entry<K, Collection<V>>> AudioAttributesCompatParcelizer;
        private K IconCompatParcelizer = null;
        private Collection<V> RemoteActionCompatParcelizer = null;
        private Iterator<V> write = parseSaio.write();

        abstract T AudioAttributesCompatParcelizer(K k, V v);

        AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = moveNext.this.AudioAttributesCompatParcelizer.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AudioAttributesCompatParcelizer.hasNext() || this.write.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.write.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.AudioAttributesCompatParcelizer.next();
                this.IconCompatParcelizer = next.getKey();
                Collection<V> value = next.getValue();
                this.RemoteActionCompatParcelizer = value;
                this.write = value.iterator();
            }
            return AudioAttributesCompatParcelizer(parseTfdt.IconCompatParcelizer(this.IconCompatParcelizer), this.write.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.write.remove();
            if (((Collection) Objects.requireNonNull(this.RemoteActionCompatParcelizer)).isEmpty()) {
                this.AudioAttributesCompatParcelizer.remove();
            }
            moveNext.AudioAttributesCompatParcelizer(moveNext.this);
        }
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public Collection<V> onAddQueueItem() {
        return super.onAddQueueItem();
    }

    @Override // kotlin.readNextSampleSize
    final Collection<V> MediaBrowserCompatSearchResultReceiver() {
        return new readNextSampleSize.write();
    }

    @Override // kotlin.readNextSampleSize
    final Iterator<V> MediaDescriptionCompat() {
        return new moveNext<K, V>.AudioAttributesCompatParcelizer<V>(this) { // from class: o.moveNext.1
            @Override // o.moveNext.AudioAttributesCompatParcelizer
            final V AudioAttributesCompatParcelizer(K k, V v) {
                return v;
            }
        };
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public Collection<Map.Entry<K, V>> MediaMetadataCompat() {
        return super.MediaMetadataCompat();
    }

    @Override // kotlin.readNextSampleSize
    final Collection<Map.Entry<K, V>> MediaBrowserCompatItemReceiver() {
        if (this instanceof processAtomEnded) {
            return new readNextSampleSize.IconCompatParcelizer(this);
        }
        return new readNextSampleSize.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.readNextSampleSize
    final Iterator<Map.Entry<K, V>> MediaBrowserCompatMediaItem() {
        return new moveNext<K, V>.AudioAttributesCompatParcelizer<Map.Entry<K, V>>(this) { // from class: o.moveNext.4
            @Override // o.moveNext.AudioAttributesCompatParcelizer
            final /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Object obj2) {
                return IconCompatParcelizer(obj, obj2);
            }

            private static Map.Entry<K, V> IconCompatParcelizer(K k, V v) {
                return parseSaiz.IconCompatParcelizer(k, v);
            }
        };
    }

    @Override // kotlin.readNextSampleSize
    Map<K, Collection<V>> AudioAttributesImplApi21Parcelizer() {
        return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    final Map<K, Collection<V>> AudioAttributesImplBaseParcelizer() {
        Map<K, Collection<V>> map = this.AudioAttributesCompatParcelizer;
        if (map instanceof NavigableMap) {
            return new write((NavigableMap) this.AudioAttributesCompatParcelizer);
        }
        if (map instanceof SortedMap) {
            return new AudioAttributesImplBaseParcelizer((SortedMap) this.AudioAttributesCompatParcelizer);
        }
        return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    class RemoteActionCompatParcelizer extends parseSaiz.write<K, Collection<V>> {
        public static int AudioAttributesCompatParcelizer;
        public static int RemoteActionCompatParcelizer;
        final transient Map<K, Collection<V>> read;

        RemoteActionCompatParcelizer(Map<K, Collection<V>> map) {
            this.read = map;
        }

        @Override // o.parseSaiz.write
        protected final Set<Map.Entry<K, Collection<V>>> RemoteActionCompatParcelizer() {
            return new AudioAttributesCompatParcelizer();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return parseSaiz.IconCompatParcelizer((Map<?, ?>) this.read, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) parseSaiz.RemoteActionCompatParcelizer(this.read, obj);
            if (collection == null) {
                return null;
            }
            return moveNext.this.AudioAttributesCompatParcelizer(obj, collection);
        }

        @Override // o.parseSaiz.write, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return moveNext.this.onCommand();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.read.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.read.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionWrite = moveNext.this.write();
            collectionWrite.addAll(collectionRemove);
            moveNext.IconCompatParcelizer(moveNext.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionWrite;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.read.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.read.hashCode();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.read.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.read == moveNext.this.AudioAttributesCompatParcelizer) {
                moveNext.this.read();
            } else {
                parseSaio.write(new read());
            }
        }

        final Map.Entry<K, Collection<V>> read(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return parseSaiz.IconCompatParcelizer(key, moveNext.this.AudioAttributesCompatParcelizer(key, entry.getValue()));
        }

        public static int read() {
            int i = AudioAttributesCompatParcelizer;
            int i2 = i % 9751648;
            AudioAttributesCompatParcelizer = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            RemoteActionCompatParcelizer = elapsedCpuTime;
            return elapsedCpuTime;
        }

        class AudioAttributesCompatParcelizer extends parseSaiz.RemoteActionCompatParcelizer<K, Collection<V>> {
            AudioAttributesCompatParcelizer() {
            }

            @Override // o.parseSaiz.RemoteActionCompatParcelizer
            final Map<K, Collection<V>> read() {
                return RemoteActionCompatParcelizer.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return RemoteActionCompatParcelizer.this.new read();
            }

            @Override // o.parseSaiz.RemoteActionCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return DefaultSampleValues.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.this.read.entrySet(), obj);
            }

            @Override // o.parseSaiz.RemoteActionCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                moveNext.this.read(((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey());
                return true;
            }
        }

        class read implements Iterator<Map.Entry<K, Collection<V>>> {
            private Collection<V> AudioAttributesCompatParcelizer;
            private Iterator<Map.Entry<K, Collection<V>>> IconCompatParcelizer;

            read() {
                this.IconCompatParcelizer = RemoteActionCompatParcelizer.this.read.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.IconCompatParcelizer.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.IconCompatParcelizer.next();
                this.AudioAttributesCompatParcelizer = next.getValue();
                return RemoteActionCompatParcelizer.this.read(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                parseStsd.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer != null, "no calls to next() since the last call to remove()");
                this.IconCompatParcelizer.remove();
                moveNext.IconCompatParcelizer(moveNext.this, this.AudioAttributesCompatParcelizer.size());
                this.AudioAttributesCompatParcelizer.clear();
                this.AudioAttributesCompatParcelizer = null;
            }
        }
    }

    class AudioAttributesImplBaseParcelizer extends moveNext<K, V>.RemoteActionCompatParcelizer implements SortedMap<K, Collection<V>> {
        private SortedSet<K> write;

        AudioAttributesImplBaseParcelizer(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> AudioAttributesImplApi21Parcelizer() {
            return (SortedMap) ((RemoteActionCompatParcelizer) this).read;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return AudioAttributesImplApi21Parcelizer().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return AudioAttributesImplApi21Parcelizer().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return AudioAttributesImplApi21Parcelizer().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> headMap(K k) {
            return new AudioAttributesImplBaseParcelizer(AudioAttributesImplApi21Parcelizer().headMap(k));
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new AudioAttributesImplBaseParcelizer(AudioAttributesImplApi21Parcelizer().subMap(k, k2));
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new AudioAttributesImplBaseParcelizer(AudioAttributesImplApi21Parcelizer().tailMap(k));
        }

        @Override // o.moveNext.RemoteActionCompatParcelizer, o.parseSaiz.write, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.write;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            this.write = sortedSetAudioAttributesCompatParcelizer;
            return sortedSetAudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.parseSaiz.write
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> AudioAttributesCompatParcelizer() {
            return new AudioAttributesImplApi26Parcelizer(AudioAttributesImplApi21Parcelizer());
        }
    }

    final class write extends moveNext<K, V>.AudioAttributesImplBaseParcelizer implements NavigableMap<K, Collection<V>> {
        write(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer
        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> AudioAttributesImplApi21Parcelizer() {
            return (NavigableMap) super.AudioAttributesImplApi21Parcelizer();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = AudioAttributesImplApi21Parcelizer().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return read((Map.Entry) entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return AudioAttributesImplApi21Parcelizer().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = AudioAttributesImplApi21Parcelizer().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return read((Map.Entry) entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return AudioAttributesImplApi21Parcelizer().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = AudioAttributesImplApi21Parcelizer().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return read((Map.Entry) entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return AudioAttributesImplApi21Parcelizer().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = AudioAttributesImplApi21Parcelizer().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return read((Map.Entry) entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return AudioAttributesImplApi21Parcelizer().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = AudioAttributesImplApi21Parcelizer().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return read((Map.Entry) entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = AudioAttributesImplApi21Parcelizer().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return read((Map.Entry) entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return RemoteActionCompatParcelizer((Iterator) entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return RemoteActionCompatParcelizer((Iterator) descendingMap().entrySet().iterator());
        }

        private Map.Entry<K, Collection<V>> RemoteActionCompatParcelizer(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionWrite = moveNext.this.write();
            collectionWrite.addAll(next.getValue());
            it.remove();
            return parseSaiz.IconCompatParcelizer(next.getKey(), moveNext.this.write(collectionWrite));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new write(AudioAttributesImplApi21Parcelizer().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer, o.moveNext.RemoteActionCompatParcelizer, o.parseSaiz.write, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer(AudioAttributesImplApi21Parcelizer());
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer, java.util.SortedMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new write(AudioAttributesImplApi21Parcelizer().subMap(k, z, k2, z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer, java.util.SortedMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new write(AudioAttributesImplApi21Parcelizer().headMap(k, z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.moveNext.AudioAttributesImplBaseParcelizer, java.util.SortedMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new write(AudioAttributesImplApi21Parcelizer().tailMap(k, z));
        }
    }
}
