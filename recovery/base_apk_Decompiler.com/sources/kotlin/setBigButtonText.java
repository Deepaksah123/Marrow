package kotlin;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setBigButtonText<E> implements Collection<E>, getCurrentAnsweredMcqProgress {
    public abstract int AudioAttributesCompatParcelizer();

    @Override // java.util.Collection
    public final int size() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        setBigButtonText<E> setbigbuttontext = this;
        if (setbigbuttontext.isEmpty()) {
            return false;
        }
        Iterator<E> it = setbigbuttontext.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> collection) {
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

    @Override // java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this, ", ", "[", "]", 0, null, new getAnswerMap() { // from class: o.UpgradePlanResponse
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setBigButtonText.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, obj);
            }
        }, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence AudioAttributesCompatParcelizer(setBigButtonText setbigbuttontext, Object obj) {
        return obj == setbigbuttontext ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
