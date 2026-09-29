package kotlin;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class getGroupId<T> implements Collection<T>, getCurrentAnsweredMcqProgress {
    private final T[] AudioAttributesCompatParcelizer;
    private final boolean read;

    public getGroupId(T[] tArr, boolean z) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        this.AudioAttributesCompatParcelizer = tArr;
        this.read = z;
    }

    @Override // java.util.Collection
    public final int size() {
        return AudioAttributesCompatParcelizer();
    }

    private int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.length;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.length == 0;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return getOrderDetails.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return IntermediateLoginResponseBody.read(this.AudioAttributesCompatParcelizer, this.read);
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }
}
