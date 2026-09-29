package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class getMonthTimeStamp<E> extends AbstractList<E> implements RandomAccess {
    private Object AudioAttributesCompatParcelizer;
    private int write;

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.write)) {
            if (i2 == 1) {
                return (E) this.AudioAttributesCompatParcelizer;
            }
            return (E) ((Object[]) this.AudioAttributesCompatParcelizer)[i];
        }
        StringBuilder sb = new StringBuilder("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.write);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        int i = this.write;
        if (i == 0) {
            this.AudioAttributesCompatParcelizer = e;
        } else if (i == 1) {
            this.AudioAttributesCompatParcelizer = new Object[]{this.AudioAttributesCompatParcelizer, e};
        } else {
            Object[] objArr = (Object[]) this.AudioAttributesCompatParcelizer;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.AudioAttributesCompatParcelizer = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.write] = e;
        }
        this.write++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.write)) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.write);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 0) {
            this.AudioAttributesCompatParcelizer = e;
        } else if (i2 == 1 && i == 0) {
            this.AudioAttributesCompatParcelizer = new Object[]{e, this.AudioAttributesCompatParcelizer};
        } else {
            Object[] objArr = new Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.AudioAttributesCompatParcelizer;
            } else {
                Object[] objArr2 = (Object[]) this.AudioAttributesCompatParcelizer;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.write - i);
            }
            objArr[i] = e;
            this.AudioAttributesCompatParcelizer = objArr;
        }
        this.write++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.AudioAttributesCompatParcelizer = null;
        this.write = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.write)) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.write);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 1) {
            E e2 = (E) this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = e;
            return e2;
        }
        Object[] objArr = (Object[]) this.AudioAttributesCompatParcelizer;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.write)) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.write);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 1) {
            e = (E) this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
        } else {
            Object[] objArr = (Object[]) this.AudioAttributesCompatParcelizer;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.AudioAttributesCompatParcelizer = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.write - 1] = null;
            }
            e = (E) obj;
        }
        this.write--;
        ((AbstractList) this).modCount++;
        return e;
    }

    static class IconCompatParcelizer<T> implements Iterator<T> {
        private static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        private IconCompatParcelizer() {
        }

        public static <T> IconCompatParcelizer<T> read() {
            return AudioAttributesCompatParcelizer;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i = this.write;
        if (i == 0) {
            IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.read();
            if (iconCompatParcelizer == null) {
                write(2);
            }
            return iconCompatParcelizer;
        }
        if (i == 1) {
            return new AudioAttributesCompatParcelizer();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            write(3);
        }
        return it;
    }

    static abstract class read<T> implements Iterator<T> {
        private boolean AudioAttributesCompatParcelizer;

        protected abstract void AudioAttributesCompatParcelizer();

        protected abstract T read();

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.AudioAttributesCompatParcelizer) {
                throw new NoSuchElementException();
            }
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesCompatParcelizer();
            return read();
        }
    }

    class AudioAttributesCompatParcelizer extends read<E> {
        private final int read;

        public AudioAttributesCompatParcelizer() {
            super((byte) 0);
            this.read = ((AbstractList) getMonthTimeStamp.this).modCount;
        }

        @Override // o.getMonthTimeStamp.read
        protected final E read() {
            return (E) getMonthTimeStamp.this.AudioAttributesCompatParcelizer;
        }

        @Override // o.getMonthTimeStamp.read
        protected final void AudioAttributesCompatParcelizer() {
            if (((AbstractList) getMonthTimeStamp.this).modCount == this.read) {
                return;
            }
            StringBuilder sb = new StringBuilder("ModCount: ");
            sb.append(((AbstractList) getMonthTimeStamp.this).modCount);
            sb.append("; expected: ");
            sb.append(this.read);
            throw new ConcurrentModificationException(sb.toString());
        }

        @Override // java.util.Iterator
        public final void remove() {
            AudioAttributesCompatParcelizer();
            getMonthTimeStamp.this.clear();
        }
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i = this.write;
        if (i >= 2) {
            Arrays.sort((Object[]) this.AudioAttributesCompatParcelizer, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            write(4);
        }
        int length = tArr.length;
        int i = this.write;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.AudioAttributesCompatParcelizer;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.AudioAttributesCompatParcelizer;
                if (tArr2 == 0) {
                    write(5);
                }
                return tArr2;
            }
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.AudioAttributesCompatParcelizer, i, tArr.getClass());
                if (tArr3 == null) {
                    write(6);
                }
                return tArr3;
            }
            if (i != 0) {
                System.arraycopy(this.AudioAttributesCompatParcelizer, 0, tArr, 0, i);
            }
        }
        int i2 = this.write;
        if (length > i2) {
            tArr[i2] = 0;
        }
        if (tArr == 0) {
            write(7);
        }
        return tArr;
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
