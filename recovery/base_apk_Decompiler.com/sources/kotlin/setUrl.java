package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001e\u001f \u001dB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/setUrl;", "E", "Lo/setBigButtonText;", "", "<init>", "()V", "", "p0", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setUrl<E> extends setBigButtonText<E> implements List<E> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract E get(int p0);

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new IconCompatParcelizer();
    }

    public int indexOf(Object p0) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(it.next(), p0)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object p0) {
        setUrl<E> seturl = this;
        ListIterator<E> listIterator = seturl.listIterator(seturl.size());
        while (listIterator.hasPrevious()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(listIterator.previous(), p0)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new read(0);
    }

    public ListIterator<E> listIterator(int p0) {
        return new read(p0);
    }

    public List<E> subList(int p0, int p1) {
        return new write(this, p0, p1);
    }

    static final class write<E> extends setUrl<E> implements RandomAccess {
        private final setUrl<E> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final int write;

        /* JADX WARN: Multi-variable type inference failed */
        public write(setUrl<? extends E> seturl, int i, int i2) {
            toMagicModuleMetaRepoModel.write(seturl, "");
            this.AudioAttributesCompatParcelizer = seturl;
            this.write = i;
            Companion.write(i, i2, seturl.size());
            this.IconCompatParcelizer = i2 - i;
        }

        @Override // kotlin.setUrl, java.util.List
        public final E get(int i) {
            Companion.IconCompatParcelizer(i, this.IconCompatParcelizer);
            return this.AudioAttributesCompatParcelizer.get(this.write + i);
        }

        @Override // kotlin.setBigButtonText
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.setUrl, java.util.List, kotlin.reportInvalid
        public final List<E> subList(int i, int i2) {
            Companion.write(i, i2, this.IconCompatParcelizer);
            setUrl<E> seturl = this.AudioAttributesCompatParcelizer;
            int i3 = this.write;
            return new write(seturl, i + i3, i3 + i2);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof List) {
            return Companion.AudioAttributesCompatParcelizer(this, (Collection) p0);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.RemoteActionCompatParcelizer(this);
    }

    class IconCompatParcelizer implements Iterator<E>, getCurrentAnsweredMcqProgress {
        private int AudioAttributesCompatParcelizer;

        public IconCompatParcelizer() {
        }

        protected final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        protected final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AudioAttributesCompatParcelizer < setUrl.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            setUrl<E> seturl = setUrl.this;
            int i = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = i + 1;
            return seturl.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    class read extends setUrl<E>.IconCompatParcelizer implements ListIterator<E> {
        public read(int i) {
            super();
            Companion companion = setUrl.INSTANCE;
            Companion.read(i, setUrl.this.size());
            AudioAttributesCompatParcelizer(i);
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return write() > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return write();
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            setUrl<E> seturl = setUrl.this;
            AudioAttributesCompatParcelizer(write() - 1);
            return seturl.get(write());
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return write() - 1;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: o.setUrl$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u000e\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setUrl$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "", "IconCompatParcelizer", "(II)V", "read", "p2", "write", "(III)V", "RemoteActionCompatParcelizer", "(II)I", "", "(Ljava/util/Collection;)I", "", "AudioAttributesCompatParcelizer", "(Ljava/util/Collection;Ljava/util/Collection;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static int RemoteActionCompatParcelizer(int p0, int p1) {
            int i = p0 + (p0 >> 1);
            if (i - p1 < 0) {
                i = p1;
            }
            return i - 2147483639 > 0 ? p1 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i;
        }

        private Companion() {
        }

        public static void IconCompatParcelizer(int p0, int p1) {
            if (p0 < 0 || p0 >= p1) {
                StringBuilder sb = new StringBuilder("index: ");
                sb.append(p0);
                sb.append(", size: ");
                sb.append(p1);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public static void read(int p0, int p1) {
            if (p0 < 0 || p0 > p1) {
                StringBuilder sb = new StringBuilder("index: ");
                sb.append(p0);
                sb.append(", size: ");
                sb.append(p1);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public static void write(int p0, int p1, int p2) {
            if (p0 < 0 || p1 > p2) {
                StringBuilder sb = new StringBuilder("fromIndex: ");
                sb.append(p0);
                sb.append(", toIndex: ");
                sb.append(p1);
                sb.append(", size: ");
                sb.append(p2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (p0 <= p1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("fromIndex: ");
            sb2.append(p0);
            sb2.append(" > toIndex: ");
            sb2.append(p1);
            throw new IllegalArgumentException(sb2.toString());
        }

        public static void read(int p0, int p1, int p2) {
            if (p0 < 0 || 8 > p2) {
                StringBuilder sb = new StringBuilder("startIndex: ");
                sb.append(p0);
                sb.append(", endIndex: 8");
                sb.append(", size: ");
                sb.append(p2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (p0 <= 8) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("startIndex: ");
            sb2.append(p0);
            sb2.append(" > endIndex: 8");
            throw new IllegalArgumentException(sb2.toString());
        }

        public static int RemoteActionCompatParcelizer(Collection<?> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Iterator<?> it = p0.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public static boolean AudioAttributesCompatParcelizer(Collection<?> p0, Collection<?> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (p0.size() != p1.size()) {
                return false;
            }
            Iterator<?> it = p1.iterator();
            Iterator<?> it2 = p0.iterator();
            while (it2.hasNext()) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
