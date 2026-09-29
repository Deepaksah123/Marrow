package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setCurrency implements Collection<setCustomerEmail>, getCurrentAnsweredMcqProgress {
    private final int[] RemoteActionCompatParcelizer;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof setCustomerEmail) {
            return AudioAttributesCompatParcelizer(((setCustomerEmail) obj).getWrite());
        }
        return false;
    }

    private static int RemoteActionCompatParcelizer(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public int size() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    private static Iterator<setCustomerEmail> read(int[] iArr) {
        return new write(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<setCustomerEmail> iterator() {
        return read(this.RemoteActionCompatParcelizer);
    }

    static final class write implements Iterator<setCustomerEmail>, getCurrentAnsweredMcqProgress {
        private int AudioAttributesCompatParcelizer;
        private final int[] read;

        public write(int[] iArr) {
            toMagicModuleMetaRepoModel.write(iArr, "");
            this.read = iArr;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ setCustomerEmail next() {
            return setCustomerEmail.IconCompatParcelizer(RemoteActionCompatParcelizer());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer < this.read.length;
        }

        private int RemoteActionCompatParcelizer() {
            int i = this.AudioAttributesCompatParcelizer;
            int[] iArr = this.read;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.AudioAttributesCompatParcelizer));
            }
            this.AudioAttributesCompatParcelizer = i + 1;
            return setCustomerEmail.read(iArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        return read(this.RemoteActionCompatParcelizer, i);
    }

    private static boolean read(int[] iArr, int i) {
        return getOrderDetails.write(iArr, i);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, collection);
    }

    private static boolean AudioAttributesCompatParcelizer(int[] iArr, Collection<setCustomerEmail> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<setCustomerEmail> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof setCustomerEmail) || !getOrderDetails.write(iArr, ((setCustomerEmail) obj).getWrite())) {
                return false;
            }
        }
        return true;
    }

    private static boolean write(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return write(this.RemoteActionCompatParcelizer);
    }

    private static boolean IconCompatParcelizer(int[] iArr, Object obj) {
        return (obj instanceof setCurrency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iArr, ((setCurrency) obj).RemoteActionCompatParcelizer());
    }

    private static int AudioAttributesCompatParcelizer(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static String IconCompatParcelizer(int[] iArr) {
        StringBuilder sb = new StringBuilder("UIntArray(storage=");
        sb.append(Arrays.toString(iArr));
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(setCustomerEmail setcustomeremail) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends setCustomerEmail> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
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
    public final Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }

    public final String toString() {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final /* synthetic */ int[] RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
