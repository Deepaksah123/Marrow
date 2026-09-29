package kotlin;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class parseMehd {
    public static <E> ArrayList<E> AudioAttributesCompatParcelizer() {
        return new ArrayList<>();
    }

    @SafeVarargs
    public static <E> ArrayList<E> read(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>(read(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> IconCompatParcelizer(Iterator<? extends E> it) {
        ArrayList<E> arrayListAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        parseSaio.IconCompatParcelizer(arrayListAudioAttributesCompatParcelizer, it);
        return arrayListAudioAttributesCompatParcelizer;
    }

    private static int read(int i) {
        FixedSampleSizeRechunker.IconCompatParcelizer(i, "arraySize");
        return parseTextAttribute.IconCompatParcelizer(((long) i) + 5 + ((long) (i / 10)));
    }

    public static <F, T> List<T> RemoteActionCompatParcelizer(List<F> list, parseMvhd<? super F, ? extends T> parsemvhd) {
        if (list instanceof RandomAccess) {
            return new read(list, parsemvhd);
        }
        return new RemoteActionCompatParcelizer(list, parsemvhd);
    }

    static class RemoteActionCompatParcelizer<F, T> extends AbstractSequentialList<T> implements Serializable {
        final parseMvhd<? super F, ? extends T> RemoteActionCompatParcelizer;
        private List<F> read;

        RemoteActionCompatParcelizer(List<F> list, parseMvhd<? super F, ? extends T> parsemvhd) {
            this.read = (List) parseStsd.IconCompatParcelizer(list);
            this.RemoteActionCompatParcelizer = (parseMvhd) parseStsd.IconCompatParcelizer(parsemvhd);
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i, int i2) {
            this.read.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.read.size();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new getCurrentSampleOffset<F, T>(this.read.listIterator(i)) { // from class: o.parseMehd.RemoteActionCompatParcelizer.3
                @Override // kotlin.getCurrentSamplePresentationTimeUs
                final T write(F f) {
                    return RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer.apply(f);
                }
            };
        }
    }

    static class read<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        final parseMvhd<? super F, ? extends T> AudioAttributesCompatParcelizer;
        private List<F> RemoteActionCompatParcelizer;

        read(List<F> list, parseMvhd<? super F, ? extends T> parsemvhd) {
            this.RemoteActionCompatParcelizer = (List) parseStsd.IconCompatParcelizer(list);
            this.AudioAttributesCompatParcelizer = (parseMvhd) parseStsd.IconCompatParcelizer(parsemvhd);
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i, int i2) {
            this.RemoteActionCompatParcelizer.subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.AudioAttributesCompatParcelizer.apply(this.RemoteActionCompatParcelizer.get(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new getCurrentSampleOffset<F, T>(this.RemoteActionCompatParcelizer.listIterator(i)) { // from class: o.parseMehd.read.5
                @Override // kotlin.getCurrentSamplePresentationTimeUs
                final T write(F f) {
                    return read.this.AudioAttributesCompatParcelizer.apply(f);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.RemoteActionCompatParcelizer.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.AudioAttributesCompatParcelizer.apply(this.RemoteActionCompatParcelizer.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.RemoteActionCompatParcelizer.size();
        }
    }

    static boolean read(List<?> list, Object obj) {
        if (obj == parseStsd.IconCompatParcelizer(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list2 instanceof RandomAccess)) {
            return parseSaio.RemoteActionCompatParcelizer(list.iterator(), (Iterator<?>) list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!parseSmta.AudioAttributesCompatParcelizer(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static int RemoteActionCompatParcelizer(List<?> list, Object obj) {
        return AudioAttributesCompatParcelizer(list, obj);
    }

    private static int AudioAttributesCompatParcelizer(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int IconCompatParcelizer(List<?> list, Object obj) {
        return write(list, obj);
    }

    private static int write(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <T> List<T> read(Iterable<T> iterable) {
        return (List) iterable;
    }
}
