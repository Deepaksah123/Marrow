package kotlin;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
abstract class AnnotatedMethodMap<E> extends AbstractList<E> implements forDeserialization.AudioAttributesImplBaseParcelizer<E> {
    private boolean AudioAttributesCompatParcelizer = true;

    AnnotatedMethodMap() {
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        IconCompatParcelizer();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        IconCompatParcelizer();
        super.add(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        IconCompatParcelizer();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        IconCompatParcelizer();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IconCompatParcelizer();
        super.clear();
    }

    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    public boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        IconCompatParcelizer();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        IconCompatParcelizer();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        IconCompatParcelizer();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        IconCompatParcelizer();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        IconCompatParcelizer();
        return (E) super.set(i, e);
    }

    protected final void IconCompatParcelizer() {
        if (!this.AudioAttributesCompatParcelizer) {
            throw new UnsupportedOperationException();
        }
    }
}
