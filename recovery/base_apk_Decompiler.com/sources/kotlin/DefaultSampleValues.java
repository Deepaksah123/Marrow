package kotlin;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultSampleValues {
    static boolean RemoteActionCompatParcelizer(Collection<?> collection, Object obj) {
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static class IconCompatParcelizer<E> extends AbstractCollection<E> {
        final parseTraks<? super E> RemoteActionCompatParcelizer;
        final Collection<E> read;

        IconCompatParcelizer(Collection<E> collection, parseTraks<? super E> parsetraks) {
            this.read = collection;
            this.RemoteActionCompatParcelizer = parsetraks;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            parseStsd.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.apply(e));
            return this.read.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                parseStsd.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.apply(it.next()));
            }
            return this.read.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (DefaultSampleValues.RemoteActionCompatParcelizer(this.read, obj)) {
                return this.RemoteActionCompatParcelizer.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return DefaultSampleValues.IconCompatParcelizer(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !onMoofContainerAtomRead.RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return parseSaio.AudioAttributesCompatParcelizer(this.read.iterator(), this.RemoteActionCompatParcelizer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.read.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.read.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.RemoteActionCompatParcelizer.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.read.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.RemoteActionCompatParcelizer.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.read.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.RemoteActionCompatParcelizer.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return parseMehd.IconCompatParcelizer(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) parseMehd.IconCompatParcelizer(iterator()).toArray(tArr);
        }
    }

    public static <F, T> Collection<T> write(Collection<F> collection, parseMvhd<? super F, T> parsemvhd) {
        return new AudioAttributesCompatParcelizer(collection, parsemvhd);
    }

    static class AudioAttributesCompatParcelizer<F, T> extends AbstractCollection<T> {
        private Collection<F> IconCompatParcelizer;
        private parseMvhd<? super F, ? extends T> write;

        AudioAttributesCompatParcelizer(Collection<F> collection, parseMvhd<? super F, ? extends T> parsemvhd) {
            this.IconCompatParcelizer = (Collection) parseStsd.IconCompatParcelizer(collection);
            this.write = (parseMvhd) parseStsd.IconCompatParcelizer(parsemvhd);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.IconCompatParcelizer.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.IconCompatParcelizer.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return parseSaio.read(this.IconCompatParcelizer.iterator(), this.write);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.IconCompatParcelizer.size();
        }
    }

    static boolean IconCompatParcelizer(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder write(int i) {
        FixedSampleSizeRechunker.IconCompatParcelizer(i, "size");
        return new StringBuilder((int) Math.min(((long) i) << 3, 1073741824L));
    }
}
