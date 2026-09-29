package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class access102<E> implements List<E>, RandomAccess {
    private final List<E> AudioAttributesCompatParcelizer;

    public static <E> access102<E> write(E... eArr) {
        return new access102<>(Arrays.asList(eArr));
    }

    public static <E> access102<E> IconCompatParcelizer(List<E> list) {
        return new access102<>(list);
    }

    private access102(List<E> list) {
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.AudioAttributesCompatParcelizer.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.AudioAttributesCompatParcelizer.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.AudioAttributesCompatParcelizer.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.AudioAttributesCompatParcelizer.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        return this.AudioAttributesCompatParcelizer.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.AudioAttributesCompatParcelizer.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.AudioAttributesCompatParcelizer.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.AudioAttributesCompatParcelizer.addAll(collection);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.AudioAttributesCompatParcelizer.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.AudioAttributesCompatParcelizer.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.AudioAttributesCompatParcelizer.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.AudioAttributesCompatParcelizer.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.AudioAttributesCompatParcelizer.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    @Override // java.util.List
    public final E get(int i) {
        return this.AudioAttributesCompatParcelizer.get(i);
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        return this.AudioAttributesCompatParcelizer.set(i, e);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.AudioAttributesCompatParcelizer.add(i, e);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.AudioAttributesCompatParcelizer.remove(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.AudioAttributesCompatParcelizer.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.AudioAttributesCompatParcelizer.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.AudioAttributesCompatParcelizer.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return this.AudioAttributesCompatParcelizer.listIterator(i);
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return this.AudioAttributesCompatParcelizer.subList(i, i2);
    }
}
