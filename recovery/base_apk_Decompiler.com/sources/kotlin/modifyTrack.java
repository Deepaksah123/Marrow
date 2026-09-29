package kotlin;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import kotlin.DefaultSampleValues;

/* JADX INFO: loaded from: classes3.dex */
public final class modifyTrack {

    static abstract class RemoteActionCompatParcelizer<E> extends AbstractSet<E> {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return modifyTrack.IconCompatParcelizer(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) parseStsd.IconCompatParcelizer(collection));
        }
    }

    public static <E> HashSet<E> write() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> read(int i) {
        return new HashSet<>(parseSaiz.AudioAttributesCompatParcelizer(i));
    }

    public static <E> Set<E> AudioAttributesCompatParcelizer() {
        return Collections.newSetFromMap(parseSaiz.read());
    }

    public static abstract class IconCompatParcelizer<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public abstract getCurrentSampleFlags<E> iterator();

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> IconCompatParcelizer<E> read(final Set<E> set, final Set<?> set2) {
        parseStsd.IconCompatParcelizer(set, "set1");
        parseStsd.IconCompatParcelizer(set2, "set2");
        return new IconCompatParcelizer<E>() { // from class: o.modifyTrack.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // o.modifyTrack.IconCompatParcelizer, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* synthetic */ Iterator iterator() {
                return iterator();
            }

            @Override // o.modifyTrack.IconCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer */
            public final getCurrentSampleFlags<E> iterator() {
                return new getFixedSampleSize<E>() { // from class: o.modifyTrack.2.2
                    private Iterator<E> IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = set.iterator();
                    }

                    @Override // kotlin.getFixedSampleSize
                    protected final E write() {
                        while (this.IconCompatParcelizer.hasNext()) {
                            E next = this.IconCompatParcelizer.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return IconCompatParcelizer();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }
        };
    }

    public static <E> Set<E> RemoteActionCompatParcelizer(Set<E> set, parseTraks<? super E> parsetraks) {
        if (set instanceof SortedSet) {
            return IconCompatParcelizer((SortedSet) set, parsetraks);
        }
        if (set instanceof write) {
            write writeVar = (write) set;
            return new write((Set) writeVar.read, parseTextSampleEntry.RemoteActionCompatParcelizer(writeVar.RemoteActionCompatParcelizer, parsetraks));
        }
        return new write((Set) parseStsd.IconCompatParcelizer(set), (parseTraks) parseStsd.IconCompatParcelizer(parsetraks));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <E> SortedSet<E> IconCompatParcelizer(SortedSet<E> sortedSet, parseTraks<? super E> parsetraks) {
        if (sortedSet instanceof write) {
            write writeVar = (write) sortedSet;
            return new read((SortedSet) writeVar.read, parseTextSampleEntry.RemoteActionCompatParcelizer(writeVar.RemoteActionCompatParcelizer, parsetraks));
        }
        return new read((SortedSet) parseStsd.IconCompatParcelizer(sortedSet), (parseTraks) parseStsd.IconCompatParcelizer(parsetraks));
    }

    static class write<E> extends DefaultSampleValues.IconCompatParcelizer<E> implements Set<E> {
        write(Set<E> set, parseTraks<? super E> parsetraks) {
            super(set, parsetraks);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return modifyTrack.RemoteActionCompatParcelizer(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return modifyTrack.AudioAttributesCompatParcelizer(this);
        }
    }

    static class read<E> extends write<E> implements SortedSet<E> {
        read(SortedSet<E> sortedSet, parseTraks<? super E> parsetraks) {
            super(sortedSet, parsetraks);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.read).comparator();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e, E e2) {
            return new read(((SortedSet) this.read).subSet(e, e2), this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e) {
            return new read(((SortedSet) this.read).headSet(e), this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e) {
            return new read(((SortedSet) this.read).tailSet(e), this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.SortedSet
        public final E first() {
            return (E) parseSaio.write((Iterator) this.read.iterator(), (parseTraks) this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.read;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.RemoteActionCompatParcelizer.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }
    }

    static int AudioAttributesCompatParcelizer(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean RemoteActionCompatParcelizer(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean read(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean IconCompatParcelizer(Set<?> set, Collection<?> collection) {
        if (collection instanceof parseSenc) {
            collection = ((parseSenc) collection).RemoteActionCompatParcelizer();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return parseSaio.write(set.iterator(), collection);
        }
        return read(set, collection.iterator());
    }
}
