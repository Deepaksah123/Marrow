package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class getField<E> extends AnnotatedMethodMap<E> implements RandomAccess {
    private static final getField<Object> RemoteActionCompatParcelizer;
    private E[] IconCompatParcelizer;
    private int read;

    static {
        getField<Object> getfield = new getField<>(new Object[0], 0);
        RemoteActionCompatParcelizer = getfield;
        getfield.RemoteActionCompatParcelizer();
    }

    public static <E> getField<E> AudioAttributesCompatParcelizer() {
        return (getField<E>) RemoteActionCompatParcelizer;
    }

    getField() {
        this(new Object[10], 0);
    }

    private getField(E[] eArr, int i) {
        this.IconCompatParcelizer = eArr;
        this.read = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public getField<E> AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new getField<>(Arrays.copyOf(this.IconCompatParcelizer, i), this.read);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        IconCompatParcelizer();
        int i = this.read;
        E[] eArr = this.IconCompatParcelizer;
        if (i == eArr.length) {
            this.IconCompatParcelizer = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.IconCompatParcelizer;
        int i2 = this.read;
        this.read = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        IconCompatParcelizer();
        if (i < 0 || i > (i2 = this.read)) {
            throw new IndexOutOfBoundsException(read(i));
        }
        E[] eArr = this.IconCompatParcelizer;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) RemoteActionCompatParcelizer(((i2 * 3) / 2) + 1);
            System.arraycopy(this.IconCompatParcelizer, 0, eArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, eArr2, i + 1, this.read - i);
            this.IconCompatParcelizer = eArr2;
        }
        this.IconCompatParcelizer[i] = e;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        IconCompatParcelizer(i);
        return this.IconCompatParcelizer[i];
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        IconCompatParcelizer();
        IconCompatParcelizer(i);
        E[] eArr = this.IconCompatParcelizer;
        E e = eArr[i];
        if (i < this.read - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        IconCompatParcelizer();
        IconCompatParcelizer(i);
        E[] eArr = this.IconCompatParcelizer;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    private static <E> E[] RemoteActionCompatParcelizer(int i) {
        return (E[]) new Object[i];
    }

    private void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.read) {
            throw new IndexOutOfBoundsException(read(i));
        }
    }

    private String read(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.read);
        return sb.toString();
    }
}
